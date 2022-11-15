lexer grammar OCL2RALexer;

SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);

// Operators. Comparation

EQ:                                  '=';
GT:                                  '>';
LT:                                  '<';
NE:                                  '<>';
GE:                                  '>=';
LE:                                  '<=';

AND:                                 'and';
OR:                                  'or';
XOR:                                 'xor';
IMPLY:                               'implies';
NOT:                                 'not';
AR:                                  '->';

DOT:                                 '.';
LB:                                  '(';
RB:                                  ')';
SEP:                                 '|';
QUOTE:                               '\'';

ALL:                                 'allInstances()';
FA:                                  'forAll';
SE:                                  'select';
CTX:                                 'context';
COLON:                               ':';
INV:                                 'inv';


ID:                                  [a-zA-Z][a-zA-Z0-9_]*;

//STRING:                              [a-zA-Z0-9_]+;
INT:                                 [0-9]+;

//VAR:                                 STRING;
//ROLE:                                STRING;
//CONSTANT:                            STRING|INT;
