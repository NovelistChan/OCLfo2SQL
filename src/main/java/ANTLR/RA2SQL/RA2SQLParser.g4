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
    : SELECTION LB expression RB relation
    ;

columns
    : column COMMA columns                      #columnMany
    | column                                    #columnOne
    ;

column
    : ID                                        #idOne
    | column DOT ID                             #idMany
    ;

expression
    : column compOp column
    ;

compOp
    : EQ | GE | LE | GT | LT | NE
    ;