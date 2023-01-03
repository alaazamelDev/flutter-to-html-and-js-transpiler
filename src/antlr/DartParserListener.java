// Generated from C:/Users/anasr/Desktop/state/compilerproject/src/grammars\DartParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartParser}.
 */
public interface DartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DartParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DartParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScaffoldBody}
	 * labeled alternative in {@link DartParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldBody(DartParser.ScaffoldBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScaffoldBody}
	 * labeled alternative in {@link DartParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldBody(DartParser.ScaffoldBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScaffoldAppBar}
	 * labeled alternative in {@link DartParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldAppBar(DartParser.ScaffoldAppBarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScaffoldAppBar}
	 * labeled alternative in {@link DartParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldAppBar(DartParser.ScaffoldAppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void enterAppBar(DartParser.AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void exitAppBar(DartParser.AppBarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AppBarTitle}
	 * labeled alternative in {@link DartParser#appBarProperties}.
	 * @param ctx the parse tree
	 */
	void enterAppBarTitle(DartParser.AppBarTitleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AppBarTitle}
	 * labeled alternative in {@link DartParser#appBarProperties}.
	 * @param ctx the parse tree
	 */
	void exitAppBarTitle(DartParser.AppBarTitleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AppBarCenterTitle}
	 * labeled alternative in {@link DartParser#appBarProperties}.
	 * @param ctx the parse tree
	 */
	void enterAppBarCenterTitle(DartParser.AppBarCenterTitleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AppBarCenterTitle}
	 * labeled alternative in {@link DartParser#appBarProperties}.
	 * @param ctx the parse tree
	 */
	void exitAppBarCenterTitle(DartParser.AppBarCenterTitleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterRowWidget(DartParser.RowWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitRowWidget(DartParser.RowWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterCenterWidget(DartParser.CenterWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitCenterWidget(DartParser.CenterWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterTextWidget(DartParser.TextWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitTextWidget(DartParser.TextWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterContainerWidget(DartParser.ContainerWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitContainerWidget(DartParser.ContainerWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpandedWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterExpandedWidget(DartParser.ExpandedWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpandedWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitExpandedWidget(DartParser.ExpandedWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterColumnWidget(DartParser.ColumnWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitColumnWidget(DartParser.ColumnWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GestureDetectorWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterGestureDetectorWidget(DartParser.GestureDetectorWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GestureDetectorWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitGestureDetectorWidget(DartParser.GestureDetectorWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PaddingWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterPaddingWidget(DartParser.PaddingWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PaddingWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitPaddingWidget(DartParser.PaddingWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterImageWidget(DartParser.ImageWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitImageWidget(DartParser.ImageWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterButtonWidget(DartParser.ButtonWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitButtonWidget(DartParser.ButtonWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreatedWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterCreatedWidget(DartParser.CreatedWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreatedWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitCreatedWidget(DartParser.CreatedWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldWidget(DartParser.TextFieldWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldWidget(DartParser.TextFieldWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#customWidget}.
	 * @param ctx the parse tree
	 */
	void enterCustomWidget(DartParser.CustomWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#customWidget}.
	 * @param ctx the parse tree
	 */
	void exitCustomWidget(DartParser.CustomWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#customWidgetProperties}.
	 * @param ctx the parse tree
	 */
	void enterCustomWidgetProperties(DartParser.CustomWidgetPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#customWidgetProperties}.
	 * @param ctx the parse tree
	 */
	void exitCustomWidgetProperties(DartParser.CustomWidgetPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(DartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(DartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowChildren}
	 * labeled alternative in {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void enterRowChildren(DartParser.RowChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowChildren}
	 * labeled alternative in {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void exitRowChildren(DartParser.RowChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowMainAxisSize}
	 * labeled alternative in {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void enterRowMainAxisSize(DartParser.RowMainAxisSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowMainAxisSize}
	 * labeled alternative in {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void exitRowMainAxisSize(DartParser.RowMainAxisSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowCrossAxisAlignment}
	 * labeled alternative in {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void enterRowCrossAxisAlignment(DartParser.RowCrossAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowCrossAxisAlignment}
	 * labeled alternative in {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void exitRowCrossAxisAlignment(DartParser.RowCrossAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#center}.
	 * @param ctx the parse tree
	 */
	void enterCenter(DartParser.CenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#center}.
	 * @param ctx the parse tree
	 */
	void exitCenter(DartParser.CenterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CenterChild}
	 * labeled alternative in {@link DartParser#centerProperties}.
	 * @param ctx the parse tree
	 */
	void enterCenterChild(DartParser.CenterChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CenterChild}
	 * labeled alternative in {@link DartParser#centerProperties}.
	 * @param ctx the parse tree
	 */
	void exitCenterChild(DartParser.CenterChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnChildren}
	 * labeled alternative in {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void enterColumnChildren(DartParser.ColumnChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnChildren}
	 * labeled alternative in {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void exitColumnChildren(DartParser.ColumnChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnMainAxisSize}
	 * labeled alternative in {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void enterColumnMainAxisSize(DartParser.ColumnMainAxisSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnMainAxisSize}
	 * labeled alternative in {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void exitColumnMainAxisSize(DartParser.ColumnMainAxisSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnCrossAxisAlignment}
	 * labeled alternative in {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void enterColumnCrossAxisAlignment(DartParser.ColumnCrossAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnCrossAxisAlignment}
	 * labeled alternative in {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void exitColumnCrossAxisAlignment(DartParser.ColumnCrossAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(DartParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(DartParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextContent}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(DartParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextContent}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(DartParser.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFontWeight}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFontWeight(DartParser.TextFontWeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFontWeight}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFontWeight(DartParser.TextFontWeightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFontSize}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFontSize(DartParser.TextFontSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFontSize}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFontSize(DartParser.TextFontSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextLetterSpacing}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextLetterSpacing(DartParser.TextLetterSpacingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextLetterSpacing}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextLetterSpacing(DartParser.TextLetterSpacingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextTextAlign}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextTextAlign(DartParser.TextTextAlignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextTextAlign}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextTextAlign(DartParser.TextTextAlignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(DartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(DartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerWidth}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void enterContainerWidth(DartParser.ContainerWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerWidth}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void exitContainerWidth(DartParser.ContainerWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerHeight}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void enterContainerHeight(DartParser.ContainerHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerHeight}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void exitContainerHeight(DartParser.ContainerHeightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerContentAlignment}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void enterContainerContentAlignment(DartParser.ContainerContentAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerContentAlignment}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void exitContainerContentAlignment(DartParser.ContainerContentAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerChild}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void enterContainerChild(DartParser.ContainerChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerChild}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void exitContainerChild(DartParser.ContainerChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerDecoration}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void enterContainerDecoration(DartParser.ContainerDecorationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerDecoration}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void exitContainerDecoration(DartParser.ContainerDecorationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#decorationProperty}.
	 * @param ctx the parse tree
	 */
	void enterDecorationProperty(DartParser.DecorationPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#decorationProperty}.
	 * @param ctx the parse tree
	 */
	void exitDecorationProperty(DartParser.DecorationPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#boxDecoration}.
	 * @param ctx the parse tree
	 */
	void enterBoxDecoration(DartParser.BoxDecorationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#boxDecoration}.
	 * @param ctx the parse tree
	 */
	void exitBoxDecoration(DartParser.BoxDecorationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoxDecorationColor}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void enterBoxDecorationColor(DartParser.BoxDecorationColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoxDecorationColor}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void exitBoxDecorationColor(DartParser.BoxDecorationColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoxDecorationBorderRadius}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void enterBoxDecorationBorderRadius(DartParser.BoxDecorationBorderRadiusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoxDecorationBorderRadius}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void exitBoxDecorationBorderRadius(DartParser.BoxDecorationBorderRadiusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#borderRadiusProperty}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusProperty(DartParser.BorderRadiusPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#borderRadiusProperty}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusProperty(DartParser.BorderRadiusPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#borderRadius}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadius(DartParser.BorderRadiusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#borderRadius}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadius(DartParser.BorderRadiusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#borderRadiusCircular}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusCircular(DartParser.BorderRadiusCircularContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#borderRadiusCircular}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusCircular(DartParser.BorderRadiusCircularContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#borderRadiusOnly}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusOnly(DartParser.BorderRadiusOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#borderRadiusOnly}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusOnly(DartParser.BorderRadiusOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#borderRadiusCircularProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusCircularProperties(DartParser.BorderRadiusCircularPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#borderRadiusCircularProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusCircularProperties(DartParser.BorderRadiusCircularPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderRadiusOnlyTopRight}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusOnlyTopRight(DartParser.BorderRadiusOnlyTopRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderRadiusOnlyTopRight}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusOnlyTopRight(DartParser.BorderRadiusOnlyTopRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderRadiusOnlyTopLeft}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusOnlyTopLeft(DartParser.BorderRadiusOnlyTopLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderRadiusOnlyTopLeft}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusOnlyTopLeft(DartParser.BorderRadiusOnlyTopLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderRadiusOnlyBottomRight}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusOnlyBottomRight(DartParser.BorderRadiusOnlyBottomRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderRadiusOnlyBottomRight}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusOnlyBottomRight(DartParser.BorderRadiusOnlyBottomRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderRadiusOnlyBottomLeft}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusOnlyBottomLeft(DartParser.BorderRadiusOnlyBottomLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderRadiusOnlyBottomLeft}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusOnlyBottomLeft(DartParser.BorderRadiusOnlyBottomLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#expanded}.
	 * @param ctx the parse tree
	 */
	void enterExpanded(DartParser.ExpandedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#expanded}.
	 * @param ctx the parse tree
	 */
	void exitExpanded(DartParser.ExpandedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpandedFlex}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 */
	void enterExpandedFlex(DartParser.ExpandedFlexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpandedFlex}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 */
	void exitExpandedFlex(DartParser.ExpandedFlexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpandedChild}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 */
	void enterExpandedChild(DartParser.ExpandedChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpandedChild}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 */
	void exitExpandedChild(DartParser.ExpandedChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#gestureDetector}.
	 * @param ctx the parse tree
	 */
	void enterGestureDetector(DartParser.GestureDetectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#gestureDetector}.
	 * @param ctx the parse tree
	 */
	void exitGestureDetector(DartParser.GestureDetectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#gestureDetectorProperties}.
	 * @param ctx the parse tree
	 */
	void enterGestureDetectorProperties(DartParser.GestureDetectorPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#gestureDetectorProperties}.
	 * @param ctx the parse tree
	 */
	void exitGestureDetectorProperties(DartParser.GestureDetectorPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#onFunction}.
	 * @param ctx the parse tree
	 */
	void enterOnFunction(DartParser.OnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#onFunction}.
	 * @param ctx the parse tree
	 */
	void exitOnFunction(DartParser.OnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#padding}.
	 * @param ctx the parse tree
	 */
	void enterPadding(DartParser.PaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#padding}.
	 * @param ctx the parse tree
	 */
	void exitPadding(DartParser.PaddingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PaddingPadding}
	 * labeled alternative in {@link DartParser#paddingProprtey}.
	 * @param ctx the parse tree
	 */
	void enterPaddingPadding(DartParser.PaddingPaddingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PaddingPadding}
	 * labeled alternative in {@link DartParser#paddingProprtey}.
	 * @param ctx the parse tree
	 */
	void exitPaddingPadding(DartParser.PaddingPaddingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PaddingChild}
	 * labeled alternative in {@link DartParser#paddingProprtey}.
	 * @param ctx the parse tree
	 */
	void enterPaddingChild(DartParser.PaddingChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PaddingChild}
	 * labeled alternative in {@link DartParser#paddingProprtey}.
	 * @param ctx the parse tree
	 */
	void exitPaddingChild(DartParser.PaddingChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeInsetsOnly}
	 * labeled alternative in {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnly(DartParser.EdgeInsetsOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeInsetsOnly}
	 * labeled alternative in {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnly(DartParser.EdgeInsetsOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeInsetsSymetric}
	 * labeled alternative in {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsSymetric(DartParser.EdgeInsetsSymetricContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeInsetsSymetric}
	 * labeled alternative in {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsSymetric(DartParser.EdgeInsetsSymetricContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeInsetsOnlyTop}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeInsetsOnlyTop}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeInsetsOnlyLeft}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeInsetsOnlyLeft}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeInsetsOnlyRight}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeInsetsOnlyRight}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeInsetsOnlyBottom}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeInsetsOnlyBottom}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeInsetsSymetricHorizontal}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeInsetsSymetricHorizontal}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeInsetsSymetricVertical}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsSymetricVertical(DartParser.EdgeInsetsSymetricVerticalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeInsetsSymetricVertical}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsSymetricVertical(DartParser.EdgeInsetsSymetricVerticalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(DartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(DartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageUrl}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterImageUrl(DartParser.ImageUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageUrl}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitImageUrl(DartParser.ImageUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageFit}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterImageFit(DartParser.ImageFitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageFit}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitImageFit(DartParser.ImageFitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageWidth}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterImageWidth(DartParser.ImageWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageWidth}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitImageWidth(DartParser.ImageWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageHeight}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterImageHeight(DartParser.ImageHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageHeight}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitImageHeight(DartParser.ImageHeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(DartParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(DartParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonWidth}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterButtonWidth(DartParser.ButtonWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonWidth}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitButtonWidth(DartParser.ButtonWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonHeight}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterButtonHeight(DartParser.ButtonHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonHeight}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitButtonHeight(DartParser.ButtonHeightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonTitle}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterButtonTitle(DartParser.ButtonTitleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonTitle}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitButtonTitle(DartParser.ButtonTitleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonBackgroundColor}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterButtonBackgroundColor(DartParser.ButtonBackgroundColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonBackgroundColor}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitButtonBackgroundColor(DartParser.ButtonBackgroundColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonTitleColor}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterButtonTitleColor(DartParser.ButtonTitleColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonTitleColor}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitButtonTitleColor(DartParser.ButtonTitleColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonOnPressed}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterButtonOnPressed(DartParser.ButtonOnPressedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonOnPressed}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitButtonOnPressed(DartParser.ButtonOnPressedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#textField}.
	 * @param ctx the parse tree
	 */
	void enterTextField(DartParser.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#textField}.
	 * @param ctx the parse tree
	 */
	void exitTextField(DartParser.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldValue}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldValue(DartParser.TextFieldValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldValue}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldValue(DartParser.TextFieldValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldLabel}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldLabel(DartParser.TextFieldLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldLabel}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldLabel(DartParser.TextFieldLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldTextColor}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldTextColor(DartParser.TextFieldTextColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldTextColor}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldTextColor(DartParser.TextFieldTextColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldPadding}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldPadding(DartParser.TextFieldPaddingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldPadding}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldPadding(DartParser.TextFieldPaddingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldHint}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldHint(DartParser.TextFieldHintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldHint}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldHint(DartParser.TextFieldHintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldBorder}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldBorder(DartParser.TextFieldBorderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldBorder}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldBorder(DartParser.TextFieldBorderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldOnChanged}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldOnChanged(DartParser.TextFieldOnChangedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldOnChanged}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldOnChanged(DartParser.TextFieldOnChangedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#border}.
	 * @param ctx the parse tree
	 */
	void enterBorder(DartParser.BorderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#border}.
	 * @param ctx the parse tree
	 */
	void exitBorder(DartParser.BorderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderThickness}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderThickness(DartParser.BorderThicknessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderThickness}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderThickness(DartParser.BorderThicknessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderBorderRadius}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderBorderRadius(DartParser.BorderBorderRadiusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderBorderRadius}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderBorderRadius(DartParser.BorderBorderRadiusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderColor}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderColor(DartParser.BorderColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderColor}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderColor(DartParser.BorderColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationStatment}
	 * labeled alternative in {@link DartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatment(DartParser.VariableDeclarationStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationStatment}
	 * labeled alternative in {@link DartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatment(DartParser.VariableDeclarationStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignmentStatment}
	 * labeled alternative in {@link DartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatment(DartParser.VariableAssignmentStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignmentStatment}
	 * labeled alternative in {@link DartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatment(DartParser.VariableAssignmentStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonFunctionVariableDeclaration}
	 * labeled alternative in {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNonFunctionVariableDeclaration(DartParser.NonFunctionVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonFunctionVariableDeclaration}
	 * labeled alternative in {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNonFunctionVariableDeclaration(DartParser.NonFunctionVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionVariableDeclaration}
	 * labeled alternative in {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVariableDeclaration(DartParser.FunctionVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionVariableDeclaration}
	 * labeled alternative in {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVariableDeclaration(DartParser.FunctionVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(DartParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(DartParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(DartParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(DartParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#tree}.
	 * @param ctx the parse tree
	 */
	void enterTree(DartParser.TreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#tree}.
	 * @param ctx the parse tree
	 */
	void exitTree(DartParser.TreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#widthProperty}.
	 * @param ctx the parse tree
	 */
	void enterWidthProperty(DartParser.WidthPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#widthProperty}.
	 * @param ctx the parse tree
	 */
	void exitWidthProperty(DartParser.WidthPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#heightProperty}.
	 * @param ctx the parse tree
	 */
	void enterHeightProperty(DartParser.HeightPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#heightProperty}.
	 * @param ctx the parse tree
	 */
	void exitHeightProperty(DartParser.HeightPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#colorProperty}.
	 * @param ctx the parse tree
	 */
	void enterColorProperty(DartParser.ColorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#colorProperty}.
	 * @param ctx the parse tree
	 */
	void exitColorProperty(DartParser.ColorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#childProperty}.
	 * @param ctx the parse tree
	 */
	void enterChildProperty(DartParser.ChildPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#childProperty}.
	 * @param ctx the parse tree
	 */
	void exitChildProperty(DartParser.ChildPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#childrenProperty}.
	 * @param ctx the parse tree
	 */
	void enterChildrenProperty(DartParser.ChildrenPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#childrenProperty}.
	 * @param ctx the parse tree
	 */
	void exitChildrenProperty(DartParser.ChildrenPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#mainAxisSizeProperty}.
	 * @param ctx the parse tree
	 */
	void enterMainAxisSizeProperty(DartParser.MainAxisSizePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#mainAxisSizeProperty}.
	 * @param ctx the parse tree
	 */
	void exitMainAxisSizeProperty(DartParser.MainAxisSizePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#crossAxisAlignmentProperty}.
	 * @param ctx the parse tree
	 */
	void enterCrossAxisAlignmentProperty(DartParser.CrossAxisAlignmentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#crossAxisAlignmentProperty}.
	 * @param ctx the parse tree
	 */
	void exitCrossAxisAlignmentProperty(DartParser.CrossAxisAlignmentPropertyContext ctx);
}