parser grammar RA2SQLParser;

options { tokenVocab = RA2SQLLexer; }

script
    : relation + EOF
    ;

relation
    : projection                                     #project
    | selection                                      #select
    | relation UNION relation                        #union
    | relation INTERSECTION relation                 #intersect
    | relation ID DIFFER relation ID                 #differ
    | relation JOIN relation                         #join
    | relation ID JOIN LB expressions RB relation ID #thetaJoin
    | ID                                             #id
    | AGG relation                                   #aggregate
    | AGG GROUP BY column relation                   #aggregateGroupBy
    ;

projection
    : PROJECTION LB columns RB LB relation RB
    ;

selection
    : SELECTION LB expressions RB LB relation RB
    ;

columns
    : column COMMA columns                           #columnMany
    | column                                         #columnOne
    ;

column
    : ID                                             #idOne
    | column DOT ID                                  #idMany
    | constant                                       #idCons
    | aggregation LB column RB                       #idAgg
    ;

expressions
    : expression boolOp expressions                  #expressionMany
    | expression                                     #expressionOne
    ;

expression
    : binaryExp compOp binaryExp
    ;


binaryExp
    : LB binaryExp binaryOp binaryExp RB             #binarySub
    | column                                         #unarySub
    ;


constant
    : QUOTE ID QUOTE                                 #consStri
    | INT                                            #consInt
    ;

aggregation
    : SUM | AVG | Min | Max | COUNT
    ;

compOp
    : EQ | GE | LE | GT | LT | NE
    ;

boolOp
    : AND | OR
    ;

binaryOp
    : ADD | MIN | MUL | MOD | DIV
    ;