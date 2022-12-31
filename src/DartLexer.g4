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
COMMA: ',';

//Widgets
SCAFFOLD: 'Scaffold';
ROW: 'Row';
CENTER: 'Center';
COLUMN: 'Column';
TEXT: 'Text';
APPBAR: 'AppBar';
CONTAINER: 'Container';
EXPANDED: 'Expanded';
BOXDECORATION: 'BoxDecoration';
GESTUREDETECTOR: 'GestureDetector';

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
APPBARATRIB: 'appBar';
FONTWEIGHT: 'fontWeight';
FONTSIZE: 'fontSize';
LETTERSPACING: 'letterSpacing';
BOLD: 'bold';
WIDTH: 'width';
HEIGHT: 'height';
CONTENTALIGNMENT: 'contentAlignment';
CENTERVALUE: 'center';
FLEX: 'flex';
MAINAXISSIZE: 'mainAxisSize';
MAX: 'max';
CROSSAXISALIGNMENT: 'crossAxisAlignment';
STREATCH: 'streatch';
DECORATION: 'decoration';
COLOR: 'color';
BORDERRADIUS: 'borderRadius';
CIRCULAR: 'circular';
TITLE: 'title';
BOOLEAN: 'true' | 'false';
CENTERTITLE: 'centerTitle';
ONPRESSED: 'onPressed';

WIDGETNAME: [A-Z][A-Za-z0-9_]*;
IDENTIFIER: [a-z][A-Za-z0-9_]+;
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;

STRING: SINGLE_QUOTED_STRING | DOUBLE_QUOTED_STRING;
fragment SINGLE_QUOTED_STRING: '\'' (~'\'')* '\'';
fragment DOUBLE_QUOTED_STRING: '"' (~'"')* '"';