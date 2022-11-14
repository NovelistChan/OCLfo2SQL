lexer grammar RA2SQLLexer;

SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);






STRING:                              [a-zA-Z]+;
INT:                                 [0-9]+;