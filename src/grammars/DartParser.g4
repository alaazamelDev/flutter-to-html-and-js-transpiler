parser grammar DartParser;


options {
  tokenVocab=DartLexer;
}

prog: statment* scaffold  EOF
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
    :   TITLE COLON STRING #AppBarTitle
    |   CENTERTITLE COLON BOOLEAN #AppBarCenterTitle
    ;

widget
    :   row #RowWidget
    |   center #CenterWidget
    |   text #TextWidget
    |   container #ContainerWidget
    |   expanded #ExpandedWidget
    |   column #ColumnWidget
    |   gestureDetector #GestureDetectorWidget
    |   padding #PaddingWidget
    |   image #ImageWidget
    |   button #ButtonWidget
    |   customWidget #CreatedWidget
    |   textField #TextFieldWidget
    ;

customWidget
    :   WIDGETNAME LP (customWidgetProperties (COMMA customWidgetProperties)* COMMA? )?  RP
    ;

customWidgetProperties
    :   IDENTIFIER COLON (NUM | STRING)
    ;

row
    : ROW LP (rowProperties (COMMA rowProperties)* COMMA? )? RP
    ;

rowProperties
    :   childrenProperty #RowChildren
    |   mainAxisSizeProperty #RowMainAxisSize
    |   crossAxisAlignmentProperty #RowCrossAxisAlignment
    ;

center
    :   CENTER LP (centerProperties (COMMA centerProperties)* COMMA? )? RP
    ;

centerProperties
    :   childProperty #CenterChild
    ;



column
    :   COLUMN LP (columnProperties (COMMA columnProperties)* COMMA? )? RP
    ;

columnProperties
    :   childrenProperty #ColumnChildren
    |   mainAxisSizeProperty #ColumnMainAxisSize
    |   crossAxisAlignmentProperty #ColumnCrossAxisAlignment
    ;


text
    :   TEXT LP (textProperties (COMMA textProperties)* COMMA? )? RP
    ;

textProperties:     TEXTATRIB COLON STRING #TextContent
              |     FONTWEIGHT COLON (BOLD | LIGHT | MEDIUM | SEMIBOLD) #TextFontWeight
              |     FONTSIZE COLON NUM #TextFontSize
              |     LETTERSPACING COLON NUM #TextLetterSpacing
              |     TEXTALIGN COLON (CENTERVALUE | START_ATTR | END_ATTR | JUSTIFY_ATTR)    #TextTextAlign
              ;


container: CONTAINER LP (containerProperties (COMMA containerProperties)* COMMA? )? RP;

containerProperties:    widthProperty #ContainerWidth
                   |    heightProperty #ContainerHeight
                   |    CONTENTALIGNMENT COLON (CENTERVALUE | LEFT | RIGHT) #ContainerContentAlignment
                   |    childProperty #ContainerChild
                   |    DECORATION COLON boxDecoration #ContainerDecoration
                   ;


boxDecoration:  BOXDECORATION LP (boxDecorationProperties (COMMA boxDecorationProperties)* COMMA? )? RP;

boxDecorationProperties: colorProperty #BoxDecorationColor
                       | BORDERRADIUS COLON borderRadius #BoxDecorationBorderRadius
                       ;

borderRadius
    :   borderRadiusOnly
    |   borderRadiusCircular
    ;

borderRadiusCircular: BORDERRADIUSCIRCULAR LP borderRadiusCircularProperties COMMA? RP;
borderRadiusOnly: BORDERRADIUSONLY LP (borderRadiusOnlyProperties (COMMA borderRadiusOnlyProperties)* COMMA? )? RP;

borderRadiusCircularProperties: RADIUS COLON NUM;

borderRadiusOnlyProperties
    :   TOPRIGHT COLON NUM #BorderRadiusOnlyTopRight
    |   TOPLEFT COLON NUM #BorderRadiusOnlyTopLeft
    |   BOTTOMRIGHT COLON NUM #BorderRadiusOnlyBottomRight
    |   BOTTOMLEFT COLON NUM #BorderRadiusOnlyBottomLeft
    ;

expanded:   EXPANDED LP (expandedProperties (COMMA expandedProperties)* COMMA? )? RP;

expandedProperties:     FLEX COLON NUM #ExpandedFlex
                  |     childProperty #ExpandedChild
                  ;


gestureDetector: GESTUREDETECTOR LP (gestureDetectorProperties (COMMA gestureDetectorProperties)* COMMA? )? RP;

gestureDetectorProperties: ONPRESSED COLON onFunction;

onFunction: LP (IDENTIFIER COMMA)* RP OB statment* CB;

padding:    PADDING LP (paddingProprtey (COMMA paddingProprtey)* COMMA? )? RP;

paddingProprtey
    :   PADDINGATTR COLON edgeInsets  #PaddingPadding
    |   childProperty  #PaddingChild
    ;

edgeInsets
    :   EDGE_INSETS_ONLY LP (edgeInsetsOnlyProperties (COMMA edgeInsetsOnlyProperties)* COMMA? )? RP  #EdgeInsetsOnly
    |   EDGE_INSETS_SYMMETRIC LP (edgeInsetsSymetricProperties (COMMA edgeInsetsSymetricProperties)* COMMA?)? RP  #EdgeInsetsSymetric
    ;

edgeInsetsOnlyProperties
    :   TOP COLON NUM    #EdgeInsetsOnlyTop
    |   LEFT COLON NUM      #EdgeInsetsOnlyLeft
    |   RIGHT COLON NUM    #EdgeInsetsOnlyRight
    |   BOTTOM COLON NUM    #EdgeInsetsOnlyBottom
    ;

edgeInsetsSymetricProperties
    :   HORIZONTAL COLON NUM    #EdgeInsetsSymetricHorizontal
    |   VERTICAL COLON NUM      #EdgeInsetsSymetricVertical
    ;

image
    :   IMAGE LP (imageProperties (COMMA imageProperties)* COMMA? )? RP
    ;

imageProperties
    :   URL COLON STRING    #ImageUrl
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
    |   TITLE COLON STRING  #ButtonTitle
    |   BACKGROUND_COLOR COLON HEX_NUM  #ButtonBackgroundColor
    |   TITLE_COLOR COLON HEX_NUM   #ButtonTitleColor
    |   ONPRESSED COLON onFunction   #ButtonOnPressed
    ;


textField: TEXTFIELD LP (textFieldProperties (COMMA textFieldProperties)* COMMA? )? RP;

textFieldProperties: VALUE COLON STRING #TextFieldValue
                   | LABEL COLON STRING #TextFieldLabel
                   | TEXTCOLOR COLON HEX_NUM #TextFieldTextColor
                   | PADDINGATTR COLON edgeInsets #TextFieldPadding
                   | HINT COLON STRING #TextFieldHint
                   | BORDERATRI COLON border #TextFieldBorder
                   | ONCHANGED COLON onFunction #TextFieldOnChanged
                   ;
border: BORDER LP (borderProperties (COMMA borderProperties)* COMMA? )? RP;

borderProperties: THICKNESS COLON NUM #BorderThickness
                | BORDERRADIUS COLON borderRadius   #BorderBorderRadius
                | colorProperty #BorderColor
                ;




statment
    :   variableDeclaration     #VariableDeclarationStatment
    |   variableAssignment      #VariableAssignmentStatment
    |   customWidgetDeclaration #CustomWidgetDeclarationStatement
    ;

// statements
variableDeclaration
    :   (INT | DOUBLE | STRINGTYPE) IDENTIFIER SC   #NonFunctionVariableDeclaration
    |   FUNCTION LP ((INT | DOUBLE | STRINGTYPE) COMMA)* RP IDENTIFIER SC   #FunctionVariableDeclaration
    ;

variableAssignment
    :   IDENTIFIER EQL (NUM | FLOAT | STRING) SC
    ;

//custom widget stuff
customWidgetDeclaration: WIDGET WIDGETNAME OB variables RETURN LP tree RP CB;
variables: variableDeclaration*;
tree: widget;

// Frequency grammars
widthProperty:  WIDTH COLON NUM;
heightProperty: HEIGHT COLON NUM;
colorProperty: COLOR COLON HEX_NUM;
childProperty:  CHILD COLON widget;
childrenProperty:   CHILDREN COLON OA (widget COMMA)* CA;
mainAxisSizeProperty:   MAINAXISSIZE COLON (MAX | MIN);
crossAxisAlignmentProperty: CROSSAXISALIGNMENT COLON (STRETCH | LEFT | RIGHT | CENTER);

//    TextField(
//      value:"Hello there",
//      label:'email',
//      textColor: 0x000000,
//      contentPadding: EdgeInsetsSymmetric(horizontal: 16),
//      hint: 'enter your email',
//      border: Border(
//        thinkness: 1,
//        color:0x000000,
//        radius: BorderRadiusOnly(
//          topRight:2,
//          topLeft:3,
//          bottomRight:2,
//          bottomLeft:12,
//        ),
//      ),
//      onChanged:(newValue){},
//    )