parser grammar RA2SQLParser;

options { tokenVocab = RA2SQLLexer; }

script
    : relation + EOF
    ;

relation
    : projection                                #project
    | selection                                 #select
    | relation UNION relation                   #union
    | relation INTERSECTION relation            #intersect
    | relation DIFFER relation                  #differ
    | UNIVERSALSET DIFFER relation              #udiffer
    | relation JOIN relation                    #join
    | ID                                        #id
    ;

projection
    : PROJECTION LB columns RB relation
    ;

selection
    : SELECTION LB expressions RB relation
    ;

columns
    : column COMMA columns                      #columnMany
    | column                                    #columnOne
    ;

column
    : ID                                        #idOne
    | column DOT ID                             #idMany
    | constant                                  #idCons
    ;

expressions
    : expression boolOp expressions             #expressionMany
    | expression                                #expressionOne
    ;

expression
    : column compOp column
    ;

constant
    : QUOTE ID QUOTE                            #consStri
    | INT                                       #consInt
    ;

compOp
    : EQ | GE | LE | GT | LT | NE
    ;

boolOp
    : AND | OR
    ;