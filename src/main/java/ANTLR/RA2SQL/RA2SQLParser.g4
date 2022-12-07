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
    ;

expressions
    : expression boolOp expressions                  #expressionMany
    | expression                                     #expressionOne
    ;

expression
    : column compOp column
    ;

constant
    : QUOTE ID QUOTE                                 #consStri
    | INT                                            #consInt
    ;

compOp
    : EQ | GE | LE | GT | LT | NE
    ;

boolOp
    : AND | OR
    ;