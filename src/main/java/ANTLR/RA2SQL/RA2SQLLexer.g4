lexer grammar RA2SQLLexer;

SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);

PROJECTION:                          'pi';
SELECTION:                           'sigma';
UNION:                               'union';
DIFFER:                              '\\';
INTERSECTION:                        'intersect';
JOIN:                                'join';
UNIVERSALSET:                        'U';
ID:                                  [a-zA-Z][a-zA-Z0-9_]*;
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

DOT:                                 '.';
LB:                                  '(';
RB:                                  ')';
SEP:                                 '|';
QUOTE:                               '\'';

STRING:                              [a-zA-Z]+;
INT:                                 [0-9]+;