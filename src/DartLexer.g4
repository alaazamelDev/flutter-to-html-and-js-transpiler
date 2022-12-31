lexer grammar DartLexer;

//symbols
LP: '(';
RP: ')';
COLON: ':';
OA: '[';
CA: ']';
OB: '{';
CB: '}';
SC: ';';
QUTOS: '"';

//Widgets
SCAFFOLD: 'Scaffold';
ROW: 'Row';
CENTER: 'Center';
COLUMN: 'Column';
TEXT: 'Text';

//keywords
CHILDREN: 'children';
BODY: 'body';
CHILD: 'child';
WIDGET: 'Widget';
INT: 'int';
STRINGTYPE: 'String';
DOUBLE: 'double';
RETURN: 'return';
FUNCTION: 'function';
TEXTATRIB: 'text';

WIDGETNAME: [A-Z][A-Za-z0-9_]*;
IDENTIFIER: [A-Za-z][A-Za-z0-9_]+;
WS: [ \t\r\n]+ -> skip;

STRING: SINGLE_QUOTED_STRING | DOUBLE_QUOTED_STRING;
fragment SINGLE_QUOTED_STRING: '\'' (~'\'')* '\'';
fragment DOUBLE_QUOTED_STRING: '"' (~'"')* '"';