grammar VYPlanguage;

// --------------------------------------- PARSER RULES ---------------------------------------

program: definition* EOF;

definition
    : classDefinition
    | functionDefinition
    ;

classDefinition
    : CLASS ID (COLON ID)? LBRACE classMember* RBRACE
    ;

classMember
    : varDefinition
    | functionDefinition
    ;

// Fix 1: Handle "void main(void)" and "void main()"
functionDefinition
    : returnType ID LPAREN (VOID | paramList)? RPAREN block
    ;

paramList
    : dataType ID (COMMA dataType ID)* ;

// Split types to forbid "void x;" but allow "void main"
dataType
    : INT | STRING | ID
    ;

returnType
    : VOID | dataType
    ;

block
    : LBRACE statement* RBRACE
    ;

statement
    : varDefinition
    | lvalue ASSIGN expression SEMI      // Fix 2: Allow this.x = val
    | IF LPAREN expression RPAREN block (ELSE block)?
    | WHILE LPAREN expression RPAREN block
    | RETURN expression? SEMI
    | expression SEMI
    | SEMI
    ;

// Fix 2 (continued): Define valid left-hand sides for assignment
lvalue
    : ID
    | expression DOT ID  // Covers s.x, this.x, super.x
    ;

varDefinition
    : dataType varDecl (COMMA varDecl)* SEMI
    ;

varDecl
    : ID (ASSIGN expression)? // Supports "int x = 5;" (Extension)
    ;

expression
    : LPAREN returnType RPAREN expression # CastExpr
    | NEW ID                              # NewExpr
    | NOT expression                      # NotExpr
    | expression (MUL | DIV) expression   # MulDivExpr
    | expression (PLUS | MINUS) expression# AddSubExpr
    | expression (LT | GT | LE | GE) expression # RelExpr
    | expression (EQ | NEQ) expression    # EqExpr
    | expression AND expression           # AndExpr
    | expression OR expression            # OrExpr
    | expression DOT ID (LPAREN argList? RPAREN)? # MethodCallOrField
    | ID LPAREN argList? RPAREN           # FunCallExpr
    | ID                                  # IdExpr
    | INT_LITERAL                         # IntExpr
    | STRING_LITERAL                      # StringExpr
    | THIS                                # ThisExpr
    | SUPER                               # SuperExpr
    | LPAREN expression RPAREN            # ParenExpr
    ;

argList
    : expression (COMMA expression)*
    ;

// --------------------------------------- LEXER RULES ---------------------------------------

CLASS: 'class';
ELSE: 'else';
IF: 'if';
INT: 'int';
NEW: 'new';
RETURN: 'return';
STRING: 'string';
SUPER: 'super';
THIS: 'this';
VOID: 'void';
WHILE: 'while';

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
NOT: '!';
AND: '&&';
OR: '||';
EQ: '==';
NEQ: '!=';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
ASSIGN: '=';
DOT: '.';
COMMA: ',';
SEMI: ';';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';

ID: [a-zA-Z_] [a-zA-Z0-9_]*;

INT_LITERAL: '0' | [1-9] [0-9]*;//skip leading zero

STRING_LITERAL: '"' ( ~["\r\n\\] | '\\' . )* '"';

LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

WS: [ \t\r\n]+ -> skip;
