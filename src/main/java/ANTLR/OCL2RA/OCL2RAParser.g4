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
    : oclSet AR FA LB oclVar SEP oclBool RB       #boolForAll
    | oclSingle compOp oclSingle                  #boolCompare
    | oclBool boolOp oclBool                      #boolCalc
    | oclQuery AR oclExist                        #boolExist
    ;

oclQuery
    : oclSet AR SE LB oclVar SEP oclBool RB       #querySelect
    | oclSet AR RE LB oclVar SEP oclBool RB       #queryReject
    ;

oclSet
    : oclClass DOT ALL                            #classAll
    ;

oclSingle
    : LB oclSingle binaryOp oclSingle RB          #binarySingle
    | oclObject DOT oclAttr                       #objectSingle
    | oclConstant                                 #constantSingle
    | oclClass DOT oclAttr AR oclAggregation      #aggregationSingle
    ;

oclObject
    : oclVar                                      #varObj
    | oclObject DOT oclRole                       #roleObj
    ;

oclExist
    : ISEMPTY | NOTEMPTY
    ;

oclAggregation
    : SUM | COUNT | AVG | Min | Max
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
    : QUOTE ID QUOTE                               #oclString
    | INT                                          #oclInt
    ;

compOp
    : EQ | GE | LE | GT | LT | NE
    ;

boolOp
    : AND | OR | XOR | IMPLY
    ;

binaryOp
    : ADD | MIN | MUL | MOD | DIV
    ;





