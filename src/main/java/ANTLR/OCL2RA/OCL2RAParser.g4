parser grammar OCL2RAParser;

options { tokenVocab = OCL2RALexer; }

oclText
    : oclExpr + EOF
    ;

oclExpr
    : CTX oclContext INV oclInvariant
    ;

oclContext
    : ID
    ;

oclInvariant
    : oclInvName COLON oclBool
    ;

oclInvName
    : ID
    ;

oclBool
    : oclSet AR FA LB oclVar SEP oclBool RB    #boolForAll
    | oclSingle compOp oclSingle               #boolCompare
    | oclBool boolOp oclBool                   #boolCalc
    ;

oclSet
    : oclClass DOT ALL                         #classAll
    ;

oclSingle
    : oclObject DOT oclAttr                    #objectSingle
    | oclConstant                              #constantSingle
    ;

oclObject
    : oclVar                                   #varObj
    | oclObject DOT oclRole                    #roleObj
    ;

oclRole
    : ID
    ;

oclAttr
    : ID
    ;

oclVar
    : ID
    ;

oclClass
    : ID
    ;

oclConstant
    : QUOTE ID QUOTE                            #oclString
    | INT                                       #oclInt
    ;

compOp
    : EQ | GE | LE | GT | LT | NE
    ;

boolOp
    : AND | OR | XOR | IMPLY
    ;




