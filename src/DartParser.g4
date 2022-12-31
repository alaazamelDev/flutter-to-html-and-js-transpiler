parser grammar DartParser;

options {
  tokenVocab=DartLexer;
}

prog: customWidget* scaffold customWidget* EOF
    ;

scaffold: SCAFFOLD LP (scaffoldProperty (COMMA scaffoldProperty)*)? RP
        ;

scaffoldProperty: BODY COLON widget
                | APPBARATRIB COLON appBar
                ;


appBar: APPBAR LP (appBarProperties (COMMA appBarProperties)*)? RP;

appBarProperties: TITLE COLON STRING
                | CENTERTITLE COLON BOOLEAN
                ;

widget: row
      | center
      | text
      | container
      | expanded
      | column
      ;


row: ROW LP (rowProperties (COMMA rowProperties)*)? RP
   ;

rowProperties: CHILDREN COLON OA widget+ CA
             | MAINAXISSIZE COLON MAX
             ;

center: CENTER LP (centerProperties (COMMA centerProperties)*)? RP
      ;

centerProperties: CHILD COLON widget
                ;



column: COLUMN LP (columnProperties (COMMA columnProperties)*)? RP
      ;

columnProperties: CHILDREN COLON OA widget+ CA
                | CROSSAXISALIGNMENT COLON STREATCH
                ;


text: TEXT LP (textProperties (COMMA textProperties)*)? RP;

textProperties: TEXTATRIB COLON STRING
              | FONTWEIGHT COLON BOLD
              | FONTSIZE COLON NUM
              | LETTERSPACING COLON NUM
              ;


container: CONTAINER LP (containerProperties (COMMA containerProperties)*)? RP;

containerProperties: WIDTH COLON NUM
                   | HEIGHT COLON NUM
                   | CONTENTALIGNMENT COLON CENTERVALUE
                   | CHILD COLON widget
                   | DECORATION COLON boxDecoration
                   ;


boxDecoration: BOXDECORATION LP (boxDecorationProperties (COMMA boxDecorationProperties)*)? RP;

boxDecorationProperties: COLOR COLON STRING
                       | BORDERRADIUS COLON CIRCULAR LP NUM RP
                       ;


expanded: EXPANDED LP (expandedProperties (COMMA expandedProperties)*)? RP;

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