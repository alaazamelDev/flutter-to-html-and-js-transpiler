parser grammar DartParser;


options {
  tokenVocab=DartLexer;
}

prog: statment* scaffold?  EOF
    ;
// modify comma
scaffold: SCAFFOLD LP (scaffoldProperty (COMMA scaffoldProperty )* COMMA?) ? RP
        ;


scaffoldProperty
    :   BODY COLON widget #ScaffoldBody
    |   APPBARATRIB COLON appBar #ScaffoldAppBar
    ;


appBar
    :   APPBAR LP (appBarProperties (COMMA appBarProperties)* COMMA? )? RP
    ;

appBarProperties
    :   TITLE COLON (STRING|IDENTIFIER) #AppBarTitle //var
    |   CENTERTITLE COLON BOOLEAN #AppBarCenterTitle
    ;

widget
    :   row
    |   center
    |   text
    |   container
    |   expanded
    |   column
    |   gestureDetector
    |   padding
    |   image
    |   button
    |   customWidget
    |   textField
    ;

customWidget
    :   WIDGETNAME LP (customWidgetProperties (COMMA customWidgetProperties)* COMMA? )?  RP
    ;

customWidgetProperties
    :   IDENTIFIER COLON (NUM | STRING | FLOAT) //var
    ;

row
    : ROW LP (rowProperties (COMMA rowProperties)* COMMA? )? RP
    ;

//those already written in there own seperate visitors
rowProperties
    :   childrenProperty
    |   mainAxisSizeProperty
    |   crossAxisAlignmentProperty
    ;

center
    :   CENTER LP (centerProperties (COMMA centerProperties)* COMMA? )? RP
    ;

//those already written in there own seperate visitors
centerProperties
    :   childProperty #CenterChild
    ;



column
    :   COLUMN LP (columnProperties (COMMA columnProperties)* COMMA? )? RP
    ;

columnProperties
    :   childrenProperty
    |   mainAxisSizeProperty
    |   crossAxisAlignmentProperty
    ;


text
    :   TEXT LP (textProperties (COMMA textProperties)* COMMA? )? RP
    ;

textProperties:     TEXTATRIB COLON (STRING|IDENTIFIER) #TextContent //var
              |     FONTWEIGHT COLON (BOLD | LIGHT | MEDIUM | SEMIBOLD) #TextFontWeight
              |     FONTSIZE COLON (NUM|FLOAT|IDENTIFIER) #TextFontSize //var
              |     LETTERSPACING COLON (NUM|FLOAT|IDENTIFIER) #TextLetterSpacing //var
              |     TEXTALIGN COLON (CENTERVALUE | START_ATTR | END_ATTR | JUSTIFY_ATTR)    #TextTextAlign
              ;


container: CONTAINER LP (containerProperties (COMMA containerProperties)* COMMA? )? RP;

containerProperties:    widthProperty #ContainerWidth
                   |    heightProperty #ContainerHeight
                   |    CONTENTALIGNMENT COLON (CENTERVALUE | LEFT | RIGHT) #ContainerContentAlignment
                   |    childProperty #ContainerChild
                   |    decorationProperty #ContainerDecoration
                   ;

decorationProperty: DECORATION COLON boxDecoration; //new gabsonia

boxDecoration:  BOXDECORATION LP (boxDecorationProperties (COMMA boxDecorationProperties)* COMMA? )? RP;

boxDecorationProperties: colorProperty
                       | borderRadiusProperty
                       ;
borderRadiusProperty: BORDERRADIUS COLON borderRadius;

borderRadius
    :   borderRadiusOnly
    |   borderRadiusCircular
    ;

borderRadiusCircular: BORDERRADIUSCIRCULAR LP (borderRadiusCircularRadiusProperty COMMA?)? RP;
borderRadiusOnly: BORDERRADIUSONLY LP (borderRadiusOnlyProperties (COMMA borderRadiusOnlyProperties)* COMMA? )? RP;

borderRadiusCircularRadiusProperty
    :   RADIUS COLON (NUM|FLOAT|IDENTIFIER) //var
    ;

borderRadiusOnlyProperties //TODO make it double only
    :   TOPRIGHT COLON (NUM|IDENTIFIER) #BorderRadiusOnlyTopRight //var
    |   TOPLEFT COLON (NUM|IDENTIFIER) #BorderRadiusOnlyTopLeft //var
    |   BOTTOMRIGHT COLON (NUM|IDENTIFIER) #BorderRadiusOnlyBottomRight //var
    |   BOTTOMLEFT COLON (NUM|IDENTIFIER) #BorderRadiusOnlyBottomLeft //var
    ;

expanded:   EXPANDED LP (expandedProperties (COMMA expandedProperties)* COMMA? )? RP;

expandedProperties:     FLEX COLON (NUM|IDENTIFIER) #ExpandedFlex //var
                  |     childProperty #ExpandedChild
                  ;


gestureDetector: GESTUREDETECTOR LP (gestureDetectorProperties (COMMA gestureDetectorProperties)* COMMA? )? RP;

gestureDetectorProperties
    :   onPressedProperty  #GestureDetectorOnPressed
    ;


padding:    PADDING LP (paddingProprtey (COMMA paddingProprtey)* COMMA? )? RP;

paddingProprtey
    :   PADDINGATTR COLON edgeInsets  #PaddingPadding
    |   childProperty  #PaddingChild //delete label ?
    ;

edgeInsets
    :   EDGE_INSETS_ONLY LP (edgeInsetsOnlyProperties (COMMA edgeInsetsOnlyProperties)* COMMA? )? RP  #EdgeInsetsOnly
    |   EDGE_INSETS_SYMMETRIC LP (edgeInsetsSymetricProperties (COMMA edgeInsetsSymetricProperties)* COMMA?)? RP  #EdgeInsetsSymetric
    ;

edgeInsetsOnlyProperties
    :   TOP COLON (NUM|FLOAT|IDENTIFIER)    #EdgeInsetsOnlyTop //var
    |   LEFT COLON (NUM|FLOAT|IDENTIFIER)      #EdgeInsetsOnlyLeft //var
    |   RIGHT COLON (NUM|FLOAT|IDENTIFIER)    #EdgeInsetsOnlyRight //var
    |   BOTTOM COLON (NUM|FLOAT|IDENTIFIER)    #EdgeInsetsOnlyBottom //var
    ;

edgeInsetsSymetricProperties
    :   HORIZONTAL COLON (NUM|FLOAT|IDENTIFIER)   #EdgeInsetsSymetricHorizontal //var
    |   VERTICAL COLON (NUM|FLOAT|IDENTIFIER)     #EdgeInsetsSymetricVertical //var
    ;

image
    :   IMAGE LP (imageProperties (COMMA imageProperties)* COMMA? )? RP
    ;

imageProperties
    :   URL COLON (STRING|IDENTIFIER)    #ImageUrl //var
    |   FIT COLON (COVER | CONTAINS)  #ImageFit
    |   widthProperty     #ImageWidth
    |   heightProperty    #ImageHeight
    ;

button
    :   BUTTON LP (buttonProperties (COMMA buttonProperties)* COMMA? )? RP
    ;

buttonProperties
    :   widthProperty  #ButtonWidth
    |   heightProperty  #ButtonHeight
    |   TITLE COLON (STRING|IDENTIFIER)  #ButtonTitle //var
    |   BACKGROUND_COLOR COLON HEX_NUM  #ButtonBackgroundColor
    |   TITLE_COLOR COLON HEX_NUM   #ButtonTitleColor
    |   onPressedProperty   #ButtonOnPressed
    ;


textField: TEXTFIELD LP (textFieldProperties (COMMA textFieldProperties)* COMMA? )? RP;

textFieldProperties: VALUE COLON (STRING|IDENTIFIER) #TextFieldValue //var
                   | LABEL COLON (STRING|IDENTIFIER) #TextFieldLabel //var
                   | TEXTCOLOR COLON HEX_NUM #TextFieldTextColor
                   | PADDINGATTR COLON edgeInsets #TextFieldPadding
                   | HINT COLON (STRING|IDENTIFIER) #TextFieldHint //var
                   | BORDERATRI COLON border #TextFieldBorder
                   | ONCHANGED COLON LP (IDENTIFIER COMMA)* RP OB statment* CB #TextFieldOnChanged
                   ;
border: BORDER LP (borderProperties (COMMA borderProperties)* COMMA? )? RP;

borderProperties: THICKNESS COLON (NUM|IDENTIFIER) #BorderThickness //var
                | borderRadiusProperty   #BorderBorderRadius
                | colorProperty #BorderColor
                ;

statment
    :   variableDeclaration
    |   variableAssignment
    |   customWidgetDeclaration
    ;

// statements
variableDeclaration
    :   (INT | DOUBLE | STRINGTYPE) IDENTIFIER SC   #NonFunctionVariableDeclaration
    |   FUNCTION LP ((INT | DOUBLE | STRINGTYPE) COMMA)* RP IDENTIFIER SC   #FunctionVariableDeclaration
    ;

variableAssignment
    :   IDENTIFIER EQL (NUM | FLOAT | STRING) SC //var
    ;

//custom widget stuff
customWidgetDeclaration
    :   WIDGET WIDGETNAME OB variableDeclaration* RETURN LP widget RP CB
    ;

// Frequency grammars
widthProperty:  WIDTH COLON (NUM|FLOAT|IDENTIFIER); //var
heightProperty: HEIGHT COLON (NUM|FLOAT|IDENTIFIER); //var
colorProperty: COLOR COLON HEX_NUM;
childProperty:  CHILD COLON widget;
childrenProperty:   CHILDREN COLON OA (widget (COMMA widget)* COMMA? )? CA;
mainAxisSizeProperty:   MAINAXISSIZE COLON (MAX | MIN);
crossAxisAlignmentProperty: CROSSAXISALIGNMENT COLON (STRETCH | LEFT | RIGHT | CENTERVALUE);
onPressedProperty
    :   ONPRESSED COLON LP (IDENTIFIER COMMA)* RP OB statment* CB
    ;

//expressions

//a=1-2,b=1+2
expressionList : expression ( COMMA expression )* ;

expression : logicalOrExpression;
//String a = 1 || 2;
logicalOrExpression : logicalAndExpression ( OO logicalAndExpression )* ;
//String a = 1 && 2 ;
logicalAndExpression : equalityExpression ( AA equalityExpression )* ;
//String a = 1 == ( 2 ==3) ;  1==2==3 will give  error
equalityExpression : relationalExpression ( (EE | NE) relationalExpression )?;
//Int a = 1 <= 2;
relationalExpression : additiveExpression ( (GTE | GT | LTE | LT) additiveExpression )?;
//  Int a = 1 + 2;
additiveExpression : multiplicativeExpression ((PL | MINUS) multiplicativeExpression )*;
//TODO divison
multiplicativeExpression : primary ( (STAR | DIV) primary )* ;

// main() -> main is primary , () are selectors
primary :  LP expression RP #PrimaryExpressionExpression
| literal #PrimaryLiteralExpression
| IDENTIFIER #PrimaryIdentifierExpression
;
literal
   //:    nullLiteral
    :    BOOLEAN | NUM | FLOAT | HEX_NUM | STRING
//    |    listLiteral
    ;
//nullLiteral : NULL_ ;


//    customWidgetProperties
//    textProperties
//    borderRadiusCircularRadiusProperty
//    borderRadiusOnlyProperties
//    expandedProperties
//    edgeInsetsOnlyProperties
//    edgeInsetsSymetricProperties
//    buttonProperties
//    imageProperties
//    textFieldProperties