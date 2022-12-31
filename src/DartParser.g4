parser grammar DartParser;

options {
  tokenVocab=DartLexer;
}

prog: scaffold EOF
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