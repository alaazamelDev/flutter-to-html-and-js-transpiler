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

//Widgets
SCAFFOLD: 'Scaffold';
ROW: 'Row';
CENTER: 'Center';
COLUMN: 'Column';

//keywords
CHILDREN: 'children';
BODY: 'body';
CHILD: 'child';
WIDGET: 'Widget';
INT: 'int';
STRING: 'String';
DOUBLE: 'double';
RETURN: 'return';
FUNCTION: 'function';

WIDGETNAME: [A-Z][A-Za-z0-9_]*;
IDENTIFIER: [A-Za-z][A-Za-z0-9_]+;
WS: [ \t\r\n]+ -> skip;