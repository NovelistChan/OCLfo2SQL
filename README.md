# OCLfo2SQL
## Introduction 

This tool is implemented to realize the translation from OCLfo to RA, then RA to SQL. You may refer to the following sources to understand this process:

[OMG. 2012. Object Constraint Language Specification, version 2.3.1]( https://www.omg.org/spec/OCL/2.3.1/PDF)

[OCLfo:First-order Expressive OCL Constraints for Efficient Integrity Checking](https://link.springer.com/article/10.1007/s10270-018-0688-z)

[Logic Foundation of the OCL Modelling Language](https://link.springer.com/chapter/10.1007/978-3-319-11558-0_49)

The following tables list the OCL operators that can be translated using this tool.

##### Class operations
|                    |                          |
| ------------------ | ------------------------ |
| `allInstances`     | *class*.`allInstances()` |
| `attributes`       | *var*.`att`              |
| `association ends` | *var*.`assoc`            |

##### Constants operations
|                   |                 |
| ----------------- | --------------- |
| `Boolean Literal` | `{TRUE, FALSE}` |
| `String Literal`  | `'string'`      |
| `Real Literal`    | `{R}`           |

##### Boolean operations
|                                                         |                                          |
| ------------------------------------------------------- | ---------------------------------------- |
| `and`, `or`,`xor`,`imply`,=, <>, >, <, &#8805;, &#8804; | *bool-expr* `logic-operator` *bool-expr* |

##### Iterative operations
|            |                                                     |
| ---------- | --------------------------------------------------- |
| `forAll`   | *source-expr* -> `forAll`(*var* &#124; *bool-expr*) |
| `exists`   | *source-expr* -> `exists`(*var* &#124; *bool-expr*) |
| `select`   | *source-expr* -> `select`(*var* &#124; *bool-expr*) |
| `reject`   | *source-expr* -> `reject`(*var* &#124; *bool-expr*) |
| `size`     | *source-expr* -> `size()`                           |
| `isEmpty`  | *source-expr* -> `isEmpty()`                        |
| `notEmpty` | *source-expr* -> `notEmpty()`                       |
| `sum`      | *source-expr* -> `sum()`                            |
| `sortBy`   | *source-expr* -> `sortBy`*(single-expr)*            |
| `max`      | *source-expr* -> `max()`                            |
| `min`      | *source-expr* -> `min()`                            |

##### Arithmetic operations

|                         |                                              |
| ----------------------- | -------------------------------------------- |
| `+`,`-`,`*`,`\`,`(`,`)` | *single-expr* `arith-operator` *single-expr* |

## Guideline and Examples

OCL is designed to support UML models, so the first thing you need to do is write down your UML definitions and put them into the `src\main\resources` directory. In this tool we will recognize Json files as your carrier for UML.

Example Json file:

```json
{
  "class": "SnapShotTest",
  "attributes": [
    {
      "name": "timeExpired",
      "type": "String"
    },
    {
      "name": "timeStamp",
      "type": "Real"
    },
    {
      "name": "expired",
      "type": "Real"
    },
    {
      "name": "passId",
      "type": "String"
    }
  ],
  "ends": [
    {
      "association": "S_Pred",
      "name": "predId",
      "target": "SnapShotTest",
      "opp": "succId",
      "mult": "1"
    },
    {
      "association": "S_Succ",
      "name": "succId",
      "target": "SnapShotTest",
      "opp": "predId",
      "mult": "1"
    }
  ]
}
```

Then add your OCL constraints. Example `ocl.txt`:

```tex
context SnapShotTest inv add: ((self.timeStamp + self.expired) - self.time) > self.predId.timeStamp
context SnapShotTest inv aggCompare: self.timeStamp->sum() > self.timeStamp->max()
```

And run the tool by setting the arguments: `"src/main/resources/ocl.txt" Snapshot.json`

Output includes the RA version and the SQL codes:

```
sigma (((t0.timeStamp + t0.expired) - t0.time) <= t1.timeStamp) (SnapShotTest t0 join(t0.predId = t1.id) SnapShotTest t1)
aggregate sigma (SUM(SnapShotTest.timeStamp) <= MAX(SnapShotTest.timeStamp)) (SnapShotTest)
```

```sql
SELECT * 
FROM SnapShotTest t0 JOIN SnapShotTest t1
ON t0.predId = t1.id
WHERE ( ( t0.timeStamp + t0.expired ) - t0.time ) <= t1.timeStamp

SELECT CASE SUM(SnapShotTest.timeStamp) <= MAX(SnapShotTest.timeStamp) WHEN 1 THEN 1 ELSE 0 END AS res
FROM SnapShotTest
```

We provide more samples in the `ocl.txt` files for interested users.
