lexer grammar RA2SQLLexer;

SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);

PROJECTION:                          'pi';
SELECTION:                           'sigma';
UNION:                               'union';
DIFFER:                              '\\';
INTERSECTION:                        'intersect';
JOIN:                                'join';
UNIVERSALSET:                        'U';
COMMA:                               ',';
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

ADD:                                 '+';
MIN:                                 '-';
MUL:                                 '*';
DIV:                                 '/';
MOD:                                 '%';

SUM:                                 'SUM';
AVG:                                 'AVG';
Min:                                 'MIN';
Max:                                 'MAX';
COUNT:                               'COUNT';
AGG:                                 'aggregate';
GROUP:                               'group';
BY:                                  'by';

DOT:                                 '.';
LB:                                  '(';
RB:                                  ')';
SEP:                                 '|';
QUOTE:                               '\'';

ID:                                  [a-zA-Z][a-zA-Z0-9_]*;
STRING:                              [a-zA-Z]+;
INT:                                 [0-9]+;