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

ALL:                                 'allInstances()';
FA:                                  'forAll';
SE:                                  'select';
CTX:                                 'context';
COLON:                               ':';
INV:                                 'inv';



STRING:                              [a-zA-Z]+;
INT:                                 [0-9]+;

//VAR:                                 STRING;
//ROLE:                                STRING;
//CONSTANT:                            STRING|INT;
