// Generated from java-escape by ANTLR 4.11.1
package antlr;
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
	 * Visit a parse tree produced by {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(DartParser.WidgetContext ctx);
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
	 * Visit a parse tree produced by {@link DartParser#rowProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowProperties(DartParser.RowPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(DartParser.CenterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CenterChild}
	 * labeled alternative in {@link DartParser#centerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterChild(DartParser.CenterChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#columnProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnProperties(DartParser.ColumnPropertiesContext ctx);
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
	 * Visit a parse tree produced by {@link DartParser#decorationProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorationProperty(DartParser.DecorationPropertyContext ctx);
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
	 * Visit a parse tree produced by the {@code BoxDecorationBorderRadius}
	 * labeled alternative in {@link DartParser#boxDecorationProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxDecorationBorderRadius(DartParser.BoxDecorationBorderRadiusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#borderRadiusProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusProperty(DartParser.BorderRadiusPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#borderRadius}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadius(DartParser.BorderRadiusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#borderRadiusCircular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusCircular(DartParser.BorderRadiusCircularContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#borderRadiusOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusOnly(DartParser.BorderRadiusOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#borderRadiusCircularProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusCircularProperties(DartParser.BorderRadiusCircularPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderRadiusOnlyTopRight}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusOnlyTopRight(DartParser.BorderRadiusOnlyTopRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderRadiusOnlyTopLeft}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusOnlyTopLeft(DartParser.BorderRadiusOnlyTopLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderRadiusOnlyBottomRight}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusOnlyBottomRight(DartParser.BorderRadiusOnlyBottomRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderRadiusOnlyBottomLeft}
	 * labeled alternative in {@link DartParser#borderRadiusOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadiusOnlyBottomLeft(DartParser.BorderRadiusOnlyBottomLeftContext ctx);
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
	 * Visit a parse tree produced by {@link DartParser#onFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnFunction(DartParser.OnFunctionContext ctx);
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
	 * Visit a parse tree produced by the {@code EdgeInsetsOnlyTop}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeInsetsOnlyLeft}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeInsetsOnlyRight}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeInsetsOnlyBottom}
	 * labeled alternative in {@link DartParser#edgeInsetsOnlyProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeInsetsSymetricHorizontal}
	 * labeled alternative in {@link DartParser#edgeInsetsSymetricProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeInsetsSymetricVertical}
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
	 * Visit a parse tree produced by {@link DartParser#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(DartParser.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFieldValue}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldValue(DartParser.TextFieldValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFieldLabel}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldLabel(DartParser.TextFieldLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFieldTextColor}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldTextColor(DartParser.TextFieldTextColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFieldPadding}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldPadding(DartParser.TextFieldPaddingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFieldHint}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldHint(DartParser.TextFieldHintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFieldBorder}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldBorder(DartParser.TextFieldBorderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFieldOnChanged}
	 * labeled alternative in {@link DartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldOnChanged(DartParser.TextFieldOnChangedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#border}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder(DartParser.BorderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderThickness}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderThickness(DartParser.BorderThicknessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderBorderRadius}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderBorderRadius(DartParser.BorderBorderRadiusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderColor}
	 * labeled alternative in {@link DartParser#borderProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderColor(DartParser.BorderColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(DartParser.StatmentContext ctx);
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
	 * Visit a parse tree produced by {@link DartParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(DartParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#customWidgetDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomWidgetDeclaration(DartParser.CustomWidgetDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#widthProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthProperty(DartParser.WidthPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#heightProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightProperty(DartParser.HeightPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#colorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorProperty(DartParser.ColorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#childProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildProperty(DartParser.ChildPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#childrenProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenProperty(DartParser.ChildrenPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#mainAxisSizeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxisSizeProperty(DartParser.MainAxisSizePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#crossAxisAlignmentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossAxisAlignmentProperty(DartParser.CrossAxisAlignmentPropertyContext ctx);
}