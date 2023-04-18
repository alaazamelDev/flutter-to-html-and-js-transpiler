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
EQL: '=';
EE: '==';
NE: '!=';
GT: '>';
GTE:'>=';
LT: '<';
LTE: '<=';
PL: '+';
MINUS: '-';
OO:'||';
AA:'&&';
STAR:'*';
DIV: '/';


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
PADDING: 'Padding';
EDGE_INSETS_ONLY: 'EdgeInsetsOnly';
EDGE_INSETS_SYMMETRIC: 'EdgeInsetsSymmetric';
IMAGE:'Image';
BUTTON:'Button';
GESTUREDETECTOR: 'GestureDetector';
TEXTFIELD: 'TextField';
BORDER: 'Border';
BORDERRADIUSONLY: 'BorderRadiusOnly';
BORDERRADIUSCIRCULAR:'BorderRadiusCircular';
IF: 'If';
FOR: 'For';

//keywords
CHILDREN: 'children';
BODY: 'body';
CHILD: 'child';
WIDGET: 'Widget';
INT: 'int';
STRINGTYPE: 'string';
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
MIN: 'min';
CROSSAXISALIGNMENT: 'crossAxisAlignment';
STRETCH: 'stretch';
DECORATION: 'decoration';
COLOR: 'color';
BORDERRADIUS: 'borderRadius';
CIRCULAR: 'circular';
PADDINGATTR: 'padding';
TOPRIGHT: 'topRight';
TOPLEFT: 'topLeft';
BOTTOMRIGHT: 'bottomRight';
BOTTOMLEFT: 'bottomLeft';
HORIZONTAL: 'horizontal';
VERTICAL: 'vertical';
FIT: 'fit';
URL: 'url';
TITLE:'title';
BACKGROUND_COLOR:'backgroundColor';
TITLE_COLOR:'titleColor';
CONTAINS:'contains';
COVER:'cover';
CENTERTITLE: 'centerTitle';
TEXTALIGN:'textAlign';
ONPRESSED: 'onPressed';
START_ATTR: 'start';
END_ATTR: 'end';
JUSTIFY_ATTR: 'justify';
ONLY:'only';
LIGHT:'light';
SEMIBOLD:'semibold';
MEDIUM:'medium';
VALUE: 'value';
LABEL: 'label';
TEXTCOLOR: 'textColor';
HINT: 'hint';
BORDERATRI: 'border';
THICKNESS: 'thickness';
RADIUS: 'radius';
ONCHANGED: 'onChanged';
TOP: 'top';
LEFT: 'left';
BOTTOM: 'bottom';
RIGHT: 'right';
CONDITION: 'condition';
THEN: 'thenProperty';
FROM: 'fromProperty';
ITERATIONS: 'iterations';



//Boolean
BOOLEAN: 'true' | 'false';
// Decimal Numbers
FLOAT : '-'? ('0'..'9')+ '.' ('0'..'9')*;

// Integer Numbers
NUM: ('1'..'9') ('0'..'9')* | '0';


WIDGETNAME: [A-Z][A-Za-z0-9_]*;
IDENTIFIER: [a-z][A-Za-z0-9_]*;

// String
STRING: SINGLE_QUOTED_STRING | DOUBLE_QUOTED_STRING;
fragment SINGLE_QUOTED_STRING: '\'' (~'\'')* '\'';
fragment DOUBLE_QUOTED_STRING: '"' (~'"')* '"';

// Hex Numbers
HEX_NUM : '#' HEX_DIGIT+ | '#' HEX_DIGIT+ ;
fragment HEX_DIGIT : 'a' .. 'f' | 'A' .. 'F' | NUM ;


WS: [ \t\r\n]+ -> skip;
