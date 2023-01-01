// Generated from C:/Users/anasr/Desktop/state/compilerproject/src/grammars\DartParser.g4 by ANTLR 4.10.1
package grammars;
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
	 * Enter a parse tree produced by {@link DartParser#centerProperties}.
	 * @param ctx the parse tree
	 */
	void enterCenterProperties(DartParser.CenterPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#centerProperties}.
	 * @param ctx the parse tree
	 */
	void exitCenterProperties(DartParser.CenterPropertiesContext ctx);
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
	 * Enter a parse tree produced by the {@code BoxDecorationBorderRadiusCircular}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void enterBoxDecorationBorderRadiusCircular(DartParser.BoxDecorationBorderRadiusCircularContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoxDecorationBorderRadiusCircular}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void exitBoxDecorationBorderRadiusCircular(DartParser.BoxDecorationBorderRadiusCircularContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoxDecorationBorderRadiusOnly}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void enterBoxDecorationBorderRadiusOnly(DartParser.BoxDecorationBorderRadiusOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoxDecorationBorderRadiusOnly}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void exitBoxDecorationBorderRadiusOnly(DartParser.BoxDecorationBorderRadiusOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterBorderRadiusOnlyProperties(DartParser.BorderRadiusOnlyPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitBorderRadiusOnlyProperties(DartParser.BorderRadiusOnlyPropertiesContext ctx);
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
	 * Enter a parse tree produced by the {@code ExpandedWidth}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 */
	void enterExpandedWidth(DartParser.ExpandedWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpandedWidth}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 */
	void exitExpandedWidth(DartParser.ExpandedWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpandedHeight}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 */
	void enterExpandedHeight(DartParser.ExpandedHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpandedHeight}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 */
	void exitExpandedHeight(DartParser.ExpandedHeightContext ctx);
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
	 * Enter a parse tree produced by {@link DartParser#onPressedFunction}.
	 * @param ctx the parse tree
	 */
	void enterOnPressedFunction(DartParser.OnPressedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#onPressedFunction}.
	 * @param ctx the parse tree
	 */
	void exitOnPressedFunction(DartParser.OnPressedFunctionContext ctx);
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
	 * Enter a parse tree produced by the {@code edgeInsetsOnlyTop}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code edgeInsetsOnlyTop}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code edgeInsetsOnlyLeft}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code edgeInsetsOnlyLeft}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code edgeInsetsOnlyRight}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code edgeInsetsOnlyRight}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code edgeInsetsOnlyBottom}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code edgeInsetsOnlyBottom}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code edgeInsetsSymetricHorizontal}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code edgeInsetsSymetricHorizontal}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code edgeInsetsSymetricVertical}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInsetsSymetricVertical(DartParser.EdgeInsetsSymetricVerticalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code edgeInsetsSymetricVertical}
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
	 * Enter a parse tree produced by {@link DartParser#customWidgetDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCustomWidgetDeclaration(DartParser.CustomWidgetDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#customWidgetDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCustomWidgetDeclaration(DartParser.CustomWidgetDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInteger(DartParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInteger(DartParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterString(DartParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitString(DartParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDouble(DartParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDouble(DartParser.DoubleContext ctx);
}