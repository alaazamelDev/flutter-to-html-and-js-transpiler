package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import enums.CrossAxisAlignmentValue;
import enums.FontWeightValue;
import enums.MainAxisSizeValue;
import enums.TextAlignValue;
import interfaces.AntlrObjectFactory;
import properties.*;
import widgets.Row;
import widgets.Widget;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProperty extends DartParserBaseVisitor<Property> {

    private final AntlrObjectFactory antlrObjectFactory;
    public AntlrToProperty (AntlrObjectFactory antlrObjectFactory) {
        this.antlrObjectFactory = antlrObjectFactory;
    }

//    AntlrToWidget antlrToWidget = new AntlrToWidget();
    @Override
    public Property visitProg(DartParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Property visitScaffold(DartParser.ScaffoldContext ctx) {
        return super.visitScaffold(ctx);
    }

    @Override
    public Property visitScaffoldBody(DartParser.ScaffoldBodyContext ctx) {
        return super.visitScaffoldBody(ctx);
    }

    @Override
    public Property visitScaffoldAppBar(DartParser.ScaffoldAppBarContext ctx) {
        return super.visitScaffoldAppBar(ctx);
    }

    @Override
    public Property visitAppBar(DartParser.AppBarContext ctx) {
        return super.visitAppBar(ctx);
    }

    @Override
    public Property visitAppBarTitle(DartParser.AppBarTitleContext ctx) {
        return super.visitAppBarTitle(ctx);
    }

    @Override
    public Property visitAppBarCenterTitle(DartParser.AppBarCenterTitleContext ctx) {
        return super.visitAppBarCenterTitle(ctx);
    }

    @Override
    public Property visitRowWidget(DartParser.RowWidgetContext ctx) {
        return super.visitRowWidget(ctx);
    }

    @Override
    public Property visitCenterWidget(DartParser.CenterWidgetContext ctx) {
        return super.visitCenterWidget(ctx);
    }

    @Override
    public Property visitTextWidget(DartParser.TextWidgetContext ctx) {
        return super.visitTextWidget(ctx);
    }

    @Override
    public Property visitContainerWidget(DartParser.ContainerWidgetContext ctx) {
        return super.visitContainerWidget(ctx);
    }

    @Override
    public Property visitExpandedWidget(DartParser.ExpandedWidgetContext ctx) {
        return super.visitExpandedWidget(ctx);
    }

    @Override
    public Property visitColumnWidget(DartParser.ColumnWidgetContext ctx) {
        return super.visitColumnWidget(ctx);
    }

    @Override
    public Property visitGestureDetectorWidget(DartParser.GestureDetectorWidgetContext ctx) {
        return super.visitGestureDetectorWidget(ctx);
    }

    @Override
    public Property visitPaddingWidget(DartParser.PaddingWidgetContext ctx) {
        return super.visitPaddingWidget(ctx);
    }

    @Override
    public Property visitImageWidget(DartParser.ImageWidgetContext ctx) {
        return super.visitImageWidget(ctx);
    }

    @Override
    public Property visitButtonWidget(DartParser.ButtonWidgetContext ctx) {
        return super.visitButtonWidget(ctx);
    }

    @Override
    public Property visitCreatedWidget(DartParser.CreatedWidgetContext ctx) {
        return super.visitCreatedWidget(ctx);
    }

    @Override
    public Property visitTextFieldWidget(DartParser.TextFieldWidgetContext ctx) {
        return super.visitTextFieldWidget(ctx);
    }

    @Override
    public Property visitCustomWidget(DartParser.CustomWidgetContext ctx) {
        return super.visitCustomWidget(ctx);
    }

    @Override
    public Property visitCustomWidgetProperties(DartParser.CustomWidgetPropertiesContext ctx) {
        return super.visitCustomWidgetProperties(ctx);
    }

    @Override
    public Property visitRowChildren(DartParser.RowChildrenContext ctx) {
        return super.visitRowChildren(ctx);
    }

    @Override
    public Property visitRowMainAxisSize(DartParser.RowMainAxisSizeContext ctx) {
        return super.visitRowMainAxisSize(ctx);
    }

    @Override
    public Property visitRowCrossAxisAlignment(DartParser.RowCrossAxisAlignmentContext ctx) {
        return super.visitRowCrossAxisAlignment(ctx);
    }

    @Override
    public Property visitCenter(DartParser.CenterContext ctx) {
        return super.visitCenter(ctx);
    }

    @Override
    public Property visitCenterChild(DartParser.CenterChildContext ctx) {
        return super.visitCenterChild(ctx);
    }

    @Override
    public Property visitColumn(DartParser.ColumnContext ctx) {
        return super.visitColumn(ctx);
    }

    @Override
    public Property visitColumnChildren(DartParser.ColumnChildrenContext ctx) {
        return super.visitColumnChildren(ctx);
    }

    @Override
    public Property visitColumnMainAxisSize(DartParser.ColumnMainAxisSizeContext ctx) {
        return super.visitColumnMainAxisSize(ctx);
    }

    @Override
    public Property visitColumnCrossAxisAlignment(DartParser.ColumnCrossAxisAlignmentContext ctx) {
        return super.visitColumnCrossAxisAlignment(ctx);
    }

    @Override
    public Property visitTextContent(DartParser.TextContentContext ctx) {
        String value = ctx.getChild(2).getText();

        return new TextContent(value);
    }

    @Override
    public Property visitTextFontWeight(DartParser.TextFontWeightContext ctx) {
        String value = ctx.getChild(2).getText();
        return new FontWeightObjectProperty(FontWeightValue.valueOf(value));
    }

    @Override
    public Property visitTextFontSize(DartParser.TextFontSizeContext ctx) {
        String value = ctx.getChild(2).getText();
        return new FontSizeDoubleProperty(Double.parseDouble(value));
    }

    @Override
    public Property visitTextLetterSpacing(DartParser.TextLetterSpacingContext ctx) {
        String value = ctx.getChild(2).getText();
        return new LetterSpacingDoubleProperty(Double.parseDouble(value));
    }

    @Override
    public Property visitTextTextAlign(DartParser.TextTextAlignContext ctx) {
        String value = ctx.getChild(2).getText();

        return new TextAlignObjectProperty(TextAlignValue.valueOf(value));
    }

    @Override
    public Property visitContainer(DartParser.ContainerContext ctx) {
        return super.visitContainer(ctx);
    }

    @Override
    public Property visitContainerWidth(DartParser.ContainerWidthContext ctx) {
        return super.visitContainerWidth(ctx);
    }

    @Override
    public Property visitContainerHeight(DartParser.ContainerHeightContext ctx) {
        return super.visitContainerHeight(ctx);
    }

    @Override
    public Property visitContainerContentAlignment(DartParser.ContainerContentAlignmentContext ctx) {
        return super.visitContainerContentAlignment(ctx);
    }

    @Override
    public Property visitContainerChild(DartParser.ContainerChildContext ctx) {
        return super.visitContainerChild(ctx);
    }

    @Override
    public Property visitContainerDecoration(DartParser.ContainerDecorationContext ctx) {
        return super.visitContainerDecoration(ctx);
    }

    @Override
    public Property visitBoxDecoration(DartParser.BoxDecorationContext ctx) {
        return super.visitBoxDecoration(ctx);
    }

    @Override
    public Property visitBoxDecorationColor(DartParser.BoxDecorationColorContext ctx) {
        return super.visitBoxDecorationColor(ctx);
    }

    @Override
    public Property visitBoxDecorationBorderRadius(DartParser.BoxDecorationBorderRadiusContext ctx) {
        return super.visitBoxDecorationBorderRadius(ctx);
    }

    @Override
    public Property visitBorderRadius(DartParser.BorderRadiusContext ctx) {
        return super.visitBorderRadius(ctx);
    }

    @Override
    public Property visitBorderRadiusCircular(DartParser.BorderRadiusCircularContext ctx) {
        return super.visitBorderRadiusCircular(ctx);
    }

    @Override
    public Property visitBorderRadiusOnly(DartParser.BorderRadiusOnlyContext ctx) {
        return super.visitBorderRadiusOnly(ctx);
    }

    @Override
    public Property visitBorderRadiusCircularProperties(DartParser.BorderRadiusCircularPropertiesContext ctx) {
        return super.visitBorderRadiusCircularProperties(ctx);
    }

    @Override
    public Property visitBorderRadiusOnlyTopRight(DartParser.BorderRadiusOnlyTopRightContext ctx) {
        return super.visitBorderRadiusOnlyTopRight(ctx);
    }

    @Override
    public Property visitBorderRadiusOnlyTopLeft(DartParser.BorderRadiusOnlyTopLeftContext ctx) {
        return super.visitBorderRadiusOnlyTopLeft(ctx);
    }

    @Override
    public Property visitBorderRadiusOnlyBottomRight(DartParser.BorderRadiusOnlyBottomRightContext ctx) {
        return super.visitBorderRadiusOnlyBottomRight(ctx);
    }

    @Override
    public Property visitBorderRadiusOnlyBottomLeft(DartParser.BorderRadiusOnlyBottomLeftContext ctx) {
        return super.visitBorderRadiusOnlyBottomLeft(ctx);
    }

    @Override
    public Property visitExpanded(DartParser.ExpandedContext ctx) {
        return super.visitExpanded(ctx);
    }

    @Override
    public Property visitExpandedFlex(DartParser.ExpandedFlexContext ctx) {
        return super.visitExpandedFlex(ctx);
    }

    @Override
    public Property visitExpandedChild(DartParser.ExpandedChildContext ctx) {
        return super.visitExpandedChild(ctx);
    }

    @Override
    public Property visitGestureDetector(DartParser.GestureDetectorContext ctx) {
        return super.visitGestureDetector(ctx);
    }

    @Override
    public Property visitGestureDetectorProperties(DartParser.GestureDetectorPropertiesContext ctx) {
        return super.visitGestureDetectorProperties(ctx);
    }

    @Override
    public Property visitOnFunction(DartParser.OnFunctionContext ctx) {
        return super.visitOnFunction(ctx);
    }

    @Override
    public Property visitPadding(DartParser.PaddingContext ctx) {
        return super.visitPadding(ctx);
    }

    @Override
    public Property visitPaddingPadding(DartParser.PaddingPaddingContext ctx) {
        return super.visitPaddingPadding(ctx);
    }

    @Override
    public Property visitPaddingChild(DartParser.PaddingChildContext ctx) {
        return super.visitPaddingChild(ctx);
    }

    @Override
    public Property visitEdgeInsetsOnly(DartParser.EdgeInsetsOnlyContext ctx) {
        return super.visitEdgeInsetsOnly(ctx);
    }

    @Override
    public Property visitEdgeInsetsSymetric(DartParser.EdgeInsetsSymetricContext ctx) {
        return super.visitEdgeInsetsSymetric(ctx);
    }

    @Override
    public Property visitEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx) {
        return super.visitEdgeInsetsOnlyTop(ctx);
    }

    @Override
    public Property visitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx) {
        return super.visitEdgeInsetsOnlyLeft(ctx);
    }

    @Override
    public Property visitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx) {
        return super.visitEdgeInsetsOnlyRight(ctx);
    }

    @Override
    public Property visitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx) {
        return super.visitEdgeInsetsOnlyBottom(ctx);
    }

    @Override
    public Property visitEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx) {
        return super.visitEdgeInsetsSymetricHorizontal(ctx);
    }

    @Override
    public Property visitEdgeInsetsSymetricVertical(DartParser.EdgeInsetsSymetricVerticalContext ctx) {
        return super.visitEdgeInsetsSymetricVertical(ctx);
    }

    @Override
    public Property visitImage(DartParser.ImageContext ctx) {
        return super.visitImage(ctx);
    }

    @Override
    public Property visitImageUrl(DartParser.ImageUrlContext ctx) {
        return super.visitImageUrl(ctx);
    }

    @Override
    public Property visitImageFit(DartParser.ImageFitContext ctx) {
        return super.visitImageFit(ctx);
    }

    @Override
    public Property visitImageWidth(DartParser.ImageWidthContext ctx) {
        return super.visitImageWidth(ctx);
    }

    @Override
    public Property visitImageHeight(DartParser.ImageHeightContext ctx) {
        return super.visitImageHeight(ctx);
    }

    @Override
    public Property visitButton(DartParser.ButtonContext ctx) {
        return super.visitButton(ctx);
    }

    @Override
    public Property visitButtonWidth(DartParser.ButtonWidthContext ctx) {
        return super.visitButtonWidth(ctx);
    }

    @Override
    public Property visitButtonHeight(DartParser.ButtonHeightContext ctx) {
        return super.visitButtonHeight(ctx);
    }

    @Override
    public Property visitButtonTitle(DartParser.ButtonTitleContext ctx) {
        return super.visitButtonTitle(ctx);
    }

    @Override
    public Property visitButtonBackgroundColor(DartParser.ButtonBackgroundColorContext ctx) {
        return super.visitButtonBackgroundColor(ctx);
    }

    @Override
    public Property visitButtonTitleColor(DartParser.ButtonTitleColorContext ctx) {
        return super.visitButtonTitleColor(ctx);
    }

    @Override
    public Property visitButtonOnPressed(DartParser.ButtonOnPressedContext ctx) {
        return super.visitButtonOnPressed(ctx);
    }

    @Override
    public Property visitTextField(DartParser.TextFieldContext ctx) {
        return super.visitTextField(ctx);
    }

    @Override
    public Property visitTextFieldValue(DartParser.TextFieldValueContext ctx) {
        return super.visitTextFieldValue(ctx);
    }

    @Override
    public Property visitTextFieldLabel(DartParser.TextFieldLabelContext ctx) {
        return super.visitTextFieldLabel(ctx);
    }

    @Override
    public Property visitTextFieldTextColor(DartParser.TextFieldTextColorContext ctx) {
        return super.visitTextFieldTextColor(ctx);
    }

    @Override
    public Property visitTextFieldPadding(DartParser.TextFieldPaddingContext ctx) {
        return super.visitTextFieldPadding(ctx);
    }

    @Override
    public Property visitTextFieldHint(DartParser.TextFieldHintContext ctx) {
        return super.visitTextFieldHint(ctx);
    }

    @Override
    public Property visitTextFieldBorder(DartParser.TextFieldBorderContext ctx) {
        return super.visitTextFieldBorder(ctx);
    }

    @Override
    public Property visitTextFieldOnChanged(DartParser.TextFieldOnChangedContext ctx) {
        return super.visitTextFieldOnChanged(ctx);
    }

    @Override
    public Property visitBorder(DartParser.BorderContext ctx) {
        return super.visitBorder(ctx);
    }

    @Override
    public Property visitBorderThickness(DartParser.BorderThicknessContext ctx) {
        return super.visitBorderThickness(ctx);
    }

    @Override
    public Property visitBorderBorderRadius(DartParser.BorderBorderRadiusContext ctx) {
        return super.visitBorderBorderRadius(ctx);
    }

    @Override
    public Property visitBorderColor(DartParser.BorderColorContext ctx) {
        return super.visitBorderColor(ctx);
    }

    @Override
    public Property visitCustomWidgetDeclaration(DartParser.CustomWidgetDeclarationContext ctx) {
        return super.visitCustomWidgetDeclaration(ctx);
    }

    @Override
    public Property visitVariables(DartParser.VariablesContext ctx) {
        return super.visitVariables(ctx);
    }

    @Override
    public Property visitTree(DartParser.TreeContext ctx) {
        return super.visitTree(ctx);
    }

    @Override
    public Property visitVariableDeclarationStatment(DartParser.VariableDeclarationStatmentContext ctx) {
        return super.visitVariableDeclarationStatment(ctx);
    }

    @Override
    public Property visitVariableAssignmentStatment(DartParser.VariableAssignmentStatmentContext ctx) {
        return super.visitVariableAssignmentStatment(ctx);
    }

    @Override
    public Property visitNonFunctionVariableDeclaration(DartParser.NonFunctionVariableDeclarationContext ctx) {
        return super.visitNonFunctionVariableDeclaration(ctx);
    }

    @Override
    public Property visitFunctionVariableDeclaration(DartParser.FunctionVariableDeclarationContext ctx) {
        return super.visitFunctionVariableDeclaration(ctx);
    }

    @Override
    public Property visitVariableAssignment(DartParser.VariableAssignmentContext ctx) {
        return super.visitVariableAssignment(ctx);
    }

    @Override
    public Property visitWidthProperty(DartParser.WidthPropertyContext ctx) {
        String value = ctx.getChild(2).getText();

        return new WidthProperty(Double.parseDouble(value));
    }

    @Override
    public Property visitHeightProperty(DartParser.HeightPropertyContext ctx) {
        String value = ctx.getChild(2).getText();

        return new HeightProperty(Double.parseDouble(value));
    }

    @Override
    public Property visitColorProperty(DartParser.ColorPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        return new Color(value);
    }

    @Override
    public Property visitChildProperty(DartParser.ChildPropertyContext ctx) {
        AntlrToWidget antlrToWidget = antlrObjectFactory.createAntlrToWidget();
        Widget child = antlrToWidget.visit(ctx.getChild(2));
        return new ChildWidgetProperty(child);
    }

    @Override
    public Property visitChildrenProperty(DartParser.ChildrenPropertyContext ctx) {
        AntlrToWidget antlrToWidget = antlrObjectFactory.createAntlrToWidget();
        List<Widget> widgets = new ArrayList<>();
        for (DartParser.WidgetContext wc : ctx.widget()) {
            widgets.add(antlrToWidget.visit(wc));
        }
        return new Children(widgets);
    }

    @Override
    public Property visitMainAxisSizeProperty(DartParser.MainAxisSizePropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        return new MainAxisSizeObjectProperty(MainAxisSizeValue.valueOf(value));
    }

    @Override
    public Property visitCrossAxisAlignmentProperty(DartParser.CrossAxisAlignmentPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        return new CrossAxisAlignmentProperty(CrossAxisAlignmentValue.valueOf(value));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
