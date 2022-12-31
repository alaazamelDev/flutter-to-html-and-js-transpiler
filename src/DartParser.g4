parser grammar DartParser;

options {
  tokenVocab=DartLexer;
}

prog: customWidget* scaffold customWidget* EOF
    ;

scaffold: SCAFFOLD LP (scaffoldProperty COMMA)+ RP
        ;

scaffoldProperty: BODY COLON widget
                | APPBARATRIB COLON appBar
                ;

appBar: APPBAR LP RP;

widget: row
      | center
      | text
      | container
      | expanded
      | column
      ;

row: ROW LP (rowProperties COMMA)+ RP
   ;

rowProperties: CHILDREN COLON OA widget+ CA
             | MAINAXISSIZE COLON MAX
             ;

center: CENTER LP (centerProperties COMMA)+ RP
      ;

centerProperties: CHILD COLON widget
                ;

column: COLUMN LP (columnProperties COMMA)+ RP
      ;

columnProperties: CHILDREN COLON OA widget+ CA
                | CROSSAXISALIGNMENT COLON STREATCH
                ;

text: TEXT LP (textProperties COMMA)+ RP;

textProperties: TEXTATRIB COLON STRING
              | FONTWEIGHT COLON BOLD
              | FONTSIZE COLON NUM
              | LETTERSPACING COLON NUM
              ;

container: CONTAINER LP (containerProperties COMMA)* RP;

containerProperties: WIDTH COLON NUM
                   | HEIGHT COLON NUM
                   | CONTENTALIGNMENT COLON CENTERVALUE
                   | CHILD COLON widget
                   | DECORATION COLON boxDecoration
                   ;

boxDecoration: BOXDECORATION LP (boxDecorationProperties COMMA)+ RP;

boxDecorationProperties: COLOR COLON STRING
                       | BORDERRADIUS COLON CIRCULAR LP NUM RP
                       ;

expanded: EXPANDED LP (expandedProperties COMMA)* RP;

expandedProperties: FLEX COLON NUM
                  | CHILD COLON widget
                  | WIDTH COLON NUM
                  | HEIGHT COLON NUM
                  ;


//custom widget stuff
customWidget: WIDGET WIDGETNAME OB variables RETURN LP tree RP CB            ;
variables: expr*;
expr: decla;
tree: widget+ ;
decla: type IDENTIFIER SC
     | FUNCTION LP type RP IDENTIFIER SC
     ;
type: INT
    | STRINGTYPE
    | DOUBLE
    ;
//