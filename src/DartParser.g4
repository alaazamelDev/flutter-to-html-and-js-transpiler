parser grammar DartParser;

options {
  tokenVocab=DartLexer;
}

prog: customWidget* scaffold customWidget* EOF
    ;

scaffold: SCAFFOLD LP scaffoldProperty+ RP
        ;

scaffoldProperty: BODY COLON widget
                ;

widget: row
      | center
      ;

row: ROW LP rowProperties+ RP
   ;

rowProperties: CHILDREN COLON OA widget+ CA;

center: CENTER LP centerProperties+ RP
      ;

centerProperties: CHILD COLON widget
                ;

column: COLUMN LP columnProperties+ RP
      ;

columnProperties: CHILDREN COLON OA widget+ CA
                ;

customWidget: WIDGET WIDGETNAME OB variables RETURN LP tree RP CB
            ;

variables: expr*;

expr: decla;

tree: widget+ ;

decla: type IDENTIFIER SC
     | FUNCTION LP type RP IDENTIFIER SC
     ;

type: INT
    | STRING
    | DOUBLE
    ;

    //function(int) onPressed