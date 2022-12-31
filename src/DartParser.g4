parser grammar DartParser;

options {
  tokenVocab=DartLexer;
}

prog: customWidget* scaffold customWidget* EOF
    ;

scaffold: SCAFFOLD LP (scaffoldProperty (COMMA scaffoldProperty)*)? RP
        ;

scaffoldProperty: BODY COLON widget #ScaffoldBody
                | APPBARATRIB COLON appBar #ScaffoldAppBar
                ;


appBar: APPBAR LP (appBarProperties (COMMA appBarProperties)*)? RP;

appBarProperties: TITLE COLON STRING #AppBarTitle
                | CENTERTITLE COLON BOOLEAN #AppBarCenterTitle
                ;

widget: row #RowWidget
      | center #CenterWidget
      | text #TextWidget
      | container #ContainerWidget
      | expanded #ExpandedWidget
      | column #ColumnWidget
      | gestureDetector #GestureDetectorWidget
      | padding #PaddingWidget
      | image #ImageWidget
      | button #ButtonWidget
      ;


row: ROW LP (rowProperties (COMMA rowProperties)*)? RP
   ;

rowProperties: CHILDREN COLON OA widget* CA #RowChildren
             | MAINAXISSIZE COLON MAX #RowMainAxisSize
             ;

center: CENTER LP (centerProperties (COMMA centerProperties)*)? RP
      ;

centerProperties: CHILD COLON widget
                ;



column: COLUMN LP (columnProperties (COMMA columnProperties)*)? RP
      ;

columnProperties: CHILDREN COLON OA widget* CA #ColumnChildren
                | CROSSAXISALIGNMENT COLON STREATCH #ColumnCrossAxisAlignment
                ;


text: TEXT LP (textProperties (COMMA textProperties)*)? RP;

textProperties:     TEXTATRIB COLON STRING #TextContent
              |     FONTWEIGHT COLON BOLD #TextFontWeight
              |     FONTSIZE COLON NUM #TextFontSize
              |     LETTERSPACING COLON NUM #TextLetterSpacing
              ;


container: CONTAINER LP (containerProperties (COMMA containerProperties)*)? RP;

containerProperties:    WIDTH COLON NUM #ContainerWidth
                   |    HEIGHT COLON NUM #ContainerHeight
                   |    CONTENTALIGNMENT COLON CENTERVALUE #ContainerContentAlignment
                   |    CHILD COLON widget #ContainerChild
                   |    DECORATION COLON boxDecoration #ContainerDecoration
                   ;


boxDecoration:  BOXDECORATION LP (boxDecorationProperties (COMMA boxDecorationProperties)*)? RP;

boxDecorationProperties: COLOR COLON STRING #BoxDecorationColor
                       | BORDERRADIUS COLON CIRCULAR LP NUM RP #BoxDecorationBorderRadius
                       ;


expanded:   EXPANDED LP (expandedProperties (COMMA expandedProperties)*)? RP;

expandedProperties:     FLEX COLON NUM #ExpandedFlex
                  |     CHILD COLON widget #ExpandedChild
                  |     WIDTH COLON NUM #ExpandedWidth
                  |     HEIGHT COLON NUM #ExpandedHeight
                  ;


gestureDetector: GESTUREDETECTOR LP (gestureDetectorProperties (COMMA gestureDetectorProperties)*)? RP;

gestureDetectorProperties: ONPRESSED COLON onPressedFunction;

onPressedFunction: LP (IDENTIFIER (COMMA IDENTIFIER)*)? RP OB CB;

padding:    PADDING LP (paddingProprtey (COMMA paddingProprtey)*)? RP;

paddingProprtey
    :   PADDINGATTR COLON edgeInsets  #PaddingPadding
    |   CHILD COLON widget  #PaddingChild
    ;

edgeInsets
    :   EDGE_INSETS_ONLY LP (edgeInsetsOnlyProperties (COMMA edgeInsetsOnlyProperties)*)? RP  #EdgeInsetsOnly
    |   EDGE_INSETS_SYMETRIC LP (edgeInsetsSymetricProperties (COMMA edgeInsetsSymetricProperties)*)? RP  #EdgeInsetsSymetric
    ;

edgeInsetsOnlyProperties
    :   TOP COLON NUM    #edgeInsetsOnlyTop
    |   LEFT COLON NUM      #edgeInsetsOnlyLeft
    |   RIGHT COLON NUM    #edgeInsetsOnlyRight
    |   BOTTOM COLON NUM    #edgeInsetsOnlyBottom
    ;

edgeInsetsSymetricProperties
    :   HORIZONTAL COLON NUM    #edgeInsetsSymetricHorizontal
    |   VERTICAL COLON NUM      #edgeInsetsSymetricVertical
    ;

image
    :   IMAGE LP (imageProperties (COMMA imageProperties)*)? RP
    ;

imageProperties
    :   URL COLON STRING    #ImageUrl
    |   FIT COLON (COVER | CONTAINS)  #ImageFit
    |   WIDTH COLON NUM     #ImageWidth
    |   HEIGHT COLON NUM    #ImageHeight
    ;

button
    :   BUTTON LP (buttonProperties (COMMA buttonProperties)*)? RP
    ;

buttonProperties
    :   WIDTH COLON NUM  #ButtonWidth
    |   HEIGHT COLON NUM  #ButtonHeight
    |   TITLE COLON STRING  #ButtonTitle
    |   BACKGROUND_COLOR COLON HEX_NUM  #ButtonBackgroundColor
    |   TITLE_COLOR COLON HEX_NUM   #ButtonTitleColor
    // add on pressed attribure
    ;

//custom widget stuff
customWidget: WIDGET WIDGETNAME OB variables RETURN LP tree RP CB;
variables: expr*;
expr: decla;
tree: widget+ ;
decla:
     type IDENTIFIER SC #VariableDeclaration
     | FUNCTION LP type RP IDENTIFIER SC #FunctionVariableDeclaration
     ;
type
    : INT #Integer
    | STRINGTYPE #String
    | DOUBLE #Double
    ;
//