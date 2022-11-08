parser grammar OCL2RAParser;

options { tokenVocab = OCL2RALexer; }

oclExpr
    : oclBool + EOF
    ;

oclBool
    : oclSet AR FA LB var SEP oclBool RB    #boolForAll
    | oclSingle compOp oclSingle            #boolCompare
    | oclBool boolOp oclBool                #boolCalc
    ;

oclSet
    : oclClass DOT ALL                      #classAll
    ;

oclSingle
    : oclObject DOT attr                    #objectSingle
    | constant                              #constantSingle
    ;

oclObject
    : var                                   #varObj
    | oclObject DOT role                    #roleObj
    ;

role
    : STRING
    ;

attr
    : STRING
    ;

var
    : STRING
    ;

oclClass
    : STRING
    ;

constant
    : STRING | INT
    ;

compOp
    : EQ | GE | LE | GT | LT | NE
    ;

boolOp
    : AND | OR | XOR | IMPLY
    ;





