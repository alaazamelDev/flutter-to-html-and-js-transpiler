// Generated from C:/Users/anasr/Desktop/state/compilerproject/src/grammars\DartParser.g4 by ANTLR 4.10.1
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DartParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScaffoldBody}
	 * labeled alternative in {@link DartParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldBody(DartParser.ScaffoldBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScaffoldAppBar}
	 * labeled alternative in {@link DartParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldAppBar(DartParser.ScaffoldAppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(DartParser.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AppBarTitle}
	 * labeled alternative in {@link DartParser#appBarProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarTitle(DartParser.AppBarTitleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AppBarCenterTitle}
	 * labeled alternative in {@link DartParser#appBarProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarCenterTitle(DartParser.AppBarCenterTitleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowWidget(DartParser.RowWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterWidget(DartParser.CenterWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextWidget(DartParser.TextWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerWidget(DartParser.ContainerWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpandedWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedWidget(DartParser.ExpandedWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnWidget(DartParser.ColumnWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GestureDetectorWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetectorWidget(DartParser.GestureDetectorWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PaddingWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingWidget(DartParser.PaddingWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidget(DartParser.ImageWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonWidget(DartParser.ButtonWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreatedWidget}
	 * labeled alternative in {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedWidget(DartParser.CreatedWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#customWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomWidget(DartParser.CustomWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#customWidgetProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomWidgetProperties(DartParser.CustomWidgetPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(DartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RowChildren}
	 * labeled alternative in {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowChildren(DartParser.RowChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RowMainAxisSize}
	 * labeled alternative in {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowMainAxisSize(DartParser.RowMainAxisSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(DartParser.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#centerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterProperties(DartParser.CenterPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnChildren}
	 * labeled alternative in {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnChildren(DartParser.ColumnChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnCrossAxisAlignment}
	 * labeled alternative in {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnCrossAxisAlignment(DartParser.ColumnCrossAxisAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(DartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextContent}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(DartParser.TextContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFontWeight}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFontWeight(DartParser.TextFontWeightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFontSize}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFontSize(DartParser.TextFontSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextLetterSpacing}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLetterSpacing(DartParser.TextLetterSpacingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextTextAlign}
	 * labeled alternative in {@link DartParser#textProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextTextAlign(DartParser.TextTextAlignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(DartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerWidth}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerWidth(DartParser.ContainerWidthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerHeight}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerHeight(DartParser.ContainerHeightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerContentAlignment}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerContentAlignment(DartParser.ContainerContentAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerChild}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerChild(DartParser.ContainerChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerDecoration}
	 * labeled alternative in {@link DartParser#containerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerDecoration(DartParser.ContainerDecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#boxDecoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxDecoration(DartParser.BoxDecorationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoxDecorationColor}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxDecorationColor(DartParser.BoxDecorationColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoxDecorationBorderRadiusCircular}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxDecorationBorderRadiusCircular(DartParser.BoxDecorationBorderRadiusCircularContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoxDecorationBorderRadiusOnly}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxDecorationBorderRadiusOnly(DartParser.BoxDecorationBorderRadiusOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusOnlyProperties(DartParser.BorderRadiusOnlyPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded(DartParser.ExpandedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpandedFlex}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedFlex(DartParser.ExpandedFlexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpandedChild}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedChild(DartParser.ExpandedChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpandedWidth}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedWidth(DartParser.ExpandedWidthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpandedHeight}
	 * labeled alternative in {@link DartParser#expandedProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedHeight(DartParser.ExpandedHeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#gestureDetector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetector(DartParser.GestureDetectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#gestureDetectorProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetectorProperties(DartParser.GestureDetectorPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#onPressedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPressedFunction(DartParser.OnPressedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(DartParser.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PaddingPadding}
	 * labeled alternative in {@link DartParser#paddingProprtey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingPadding(DartParser.PaddingPaddingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PaddingChild}
	 * labeled alternative in {@link DartParser#paddingProprtey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingChild(DartParser.PaddingChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeInsetsOnly}
	 * labeled alternative in {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnly(DartParser.EdgeInsetsOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeInsetsSymetric}
	 * labeled alternative in {@link DartParser#edgeInsets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsSymetric(DartParser.EdgeInsetsSymetricContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgeInsetsOnlyTop}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgeInsetsOnlyLeft}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgeInsetsOnlyRight}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgeInsetsOnlyBottom}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgeInsetsSymetricHorizontal}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edgeInsetsSymetricVertical}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsSymetricVertical(DartParser.EdgeInsetsSymetricVerticalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(DartParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageUrl}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageUrl(DartParser.ImageUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageFit}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageFit(DartParser.ImageFitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageWidth}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidth(DartParser.ImageWidthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageHeight}
	 * labeled alternative in {@link DartParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageHeight(DartParser.ImageHeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(DartParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonWidth}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonWidth(DartParser.ButtonWidthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonHeight}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonHeight(DartParser.ButtonHeightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonTitle}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonTitle(DartParser.ButtonTitleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonBackgroundColor}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonBackgroundColor(DartParser.ButtonBackgroundColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonTitleColor}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonTitleColor(DartParser.ButtonTitleColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonOnPressed}
	 * labeled alternative in {@link DartParser#buttonProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonOnPressed(DartParser.ButtonOnPressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#customWidgetDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomWidgetDeclaration(DartParser.CustomWidgetDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(DartParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#tree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTree(DartParser.TreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonFunctionVariableDeclaration}
	 * labeled alternative in {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonFunctionVariableDeclaration(DartParser.NonFunctionVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionVariableDeclaration}
	 * labeled alternative in {@link DartParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVariableDeclaration(DartParser.FunctionVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(DartParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DartParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link DartParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(DartParser.DoubleContext ctx);
}