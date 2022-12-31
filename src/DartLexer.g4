lexer grammar DartLexer;

//symbols
LP: '(';
RP: ')';
COLON: ':';
OA: '[';
CA: ']';

//Widgets
SCAFFOLD: 'Scaffold';
ROW: 'Row';
CENTER: 'Center';
COLUMN: 'Column';

//keywords
CHILDREN: 'children';
BODY: 'body';
CHILD: 'child';


WS: [ \t\r\n]+ -> skip;