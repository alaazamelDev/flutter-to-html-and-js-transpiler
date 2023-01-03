package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import properties.Property;
import widgets.AppBar;
import widgets.Scaffold;
import widgets.Widget;

import java.util.ArrayList;
import java.util.List;

public class AntlrToWidget extends DartParserBaseVisitor<Widget> {

    IAntlrObjectFactory factory;

    public AntlrToWidget(IAntlrObjectFactory factory) {
        this.factory = factory;
    }

    @Override
    public Widget visitProg(DartParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Widget visitScaffold(DartParser.ScaffoldContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        // define the list of attributes of Scaffold
        List<Property> properties = new ArrayList<>();

        // get scaffold property context list object
        List<DartParser.ScaffoldPropertyContext> scaffoldPropertyContextList = ctx.scaffoldProperty();

        for (DartParser.ScaffoldPropertyContext scaffoldPropertyContext : scaffoldPropertyContextList) {
            properties.add(antlrToPropertyVisitor.visit(scaffoldPropertyContext));
        }
        return new Scaffold(properties);
    }

    @Override
    public Widget visitAppBar(DartParser.AppBarContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        // define the list of attributes of AppBar
        List<Property> properties = new ArrayList<>();

        // list of all appBarProperties context objects
        List<DartParser.AppBarPropertiesContext> appBarPropertiesContextList = ctx.appBarProperties();
        for (DartParser.AppBarPropertiesContext appBarPropertiesContext : appBarPropertiesContextList) {
            // parse properties
            properties.add(antlrToPropertyVisitor.visit(appBarPropertiesContext));
        }
        // return a new AppBar Widget Object
        return new AppBar(properties);
    }

    @Override
    public Widget visitCustomWidget(DartParser.CustomWidgetContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();
        String widgetIdentifier = ctx.WIDGETNAME().getSymbol().getText();
        List<Property> widgetProperties = new ArrayList<>();

        // get context object
        List<DartParser.CustomWidgetPropertiesContext> propertiesContextList = ctx.customWidgetProperties();

        for (DartParser.CustomWidgetPropertiesContext propertiesContext : propertiesContextList) {
            widgetProperties.add(antlrToPropertyVisitor.visit(propertiesContext));
        }
        return new Widget(widgetIdentifier, widgetProperties);
    }

    @Override
    public Widget visitRow(DartParser.RowContext ctx) {
        return super.visitRow(ctx);
    }

    @Override
    public Widget visitRowChildren(DartParser.RowChildrenContext ctx) {
        return super.visitRowChildren(ctx);
    }

    @Override
    public Widget visitRowMainAxisSize(DartParser.RowMainAxisSizeContext ctx) {
        return super.visitRowMainAxisSize(ctx);
    }

    @Override
    public Widget visitRowCrossAxisAlignment(DartParser.RowCrossAxisAlignmentContext ctx) {
        return super.visitRowCrossAxisAlignment(ctx);
    }

    @Override
    public Widget visitCenter(DartParser.CenterContext ctx) {
        return super.visitCenter(ctx);
    }

    @Override
    public Widget visitCenterChild(DartParser.CenterChildContext ctx) {
        return super.visitCenterChild(ctx);
    }

    @Override
    public Widget visitColumn(DartParser.ColumnContext ctx) {
        return super.visitColumn(ctx);
    }

    @Override
    public Widget visitColumnChildren(DartParser.ColumnChildrenContext ctx) {
        return super.visitColumnChildren(ctx);
    }

    @Override
    public Widget visitColumnMainAxisSize(DartParser.ColumnMainAxisSizeContext ctx) {
        return super.visitColumnMainAxisSize(ctx);
    }

    @Override
    public Widget visitColumnCrossAxisAlignment(DartParser.ColumnCrossAxisAlignmentContext ctx) {
        return super.visitColumnCrossAxisAlignment(ctx);
    }

    @Override
    public Widget visitText(DartParser.TextContext ctx) {
        return super.visitText(ctx);
    }

    @Override
    public Widget visitTextContent(DartParser.TextContentContext ctx) {
        return super.visitTextContent(ctx);
    }

    @Override
    public Widget visitTextFontWeight(DartParser.TextFontWeightContext ctx) {
        return super.visitTextFontWeight(ctx);
    }

    @Override
    public Widget visitTextFontSize(DartParser.TextFontSizeContext ctx) {
        return super.visitTextFontSize(ctx);
    }

    @Override
    public Widget visitTextLetterSpacing(DartParser.TextLetterSpacingContext ctx) {
        return super.visitTextLetterSpacing(ctx);
    }

    @Override
    public Widget visitTextTextAlign(DartParser.TextTextAlignContext ctx) {
        return super.visitTextTextAlign(ctx);
    }

    @Override
    public Widget visitContainer(DartParser.ContainerContext ctx) {
        return super.visitContainer(ctx);
    }

    @Override
    public Widget visitContainerWidth(DartParser.ContainerWidthContext ctx) {
        return super.visitContainerWidth(ctx);
    }

    @Override
    public Widget visitContainerHeight(DartParser.ContainerHeightContext ctx) {
        return super.visitContainerHeight(ctx);
    }

    @Override
    public Widget visitContainerContentAlignment(DartParser.ContainerContentAlignmentContext ctx) {
        return super.visitContainerContentAlignment(ctx);
    }

    @Override
    public Widget visitContainerChild(DartParser.ContainerChildContext ctx) {
        return super.visitContainerChild(ctx);
    }

    @Override
    public Widget visitContainerDecoration(DartParser.ContainerDecorationContext ctx) {
        return super.visitContainerDecoration(ctx);
    }

    @Override
    public Widget visitBoxDecoration(DartParser.BoxDecorationContext ctx) {
        return super.visitBoxDecoration(ctx);
    }

    @Override
    public Widget visitBoxDecorationColor(DartParser.BoxDecorationColorContext ctx) {
        return super.visitBoxDecorationColor(ctx);
    }

    @Override
    public Widget visitBoxDecorationBorderRadius(DartParser.BoxDecorationBorderRadiusContext ctx) {
        return super.visitBoxDecorationBorderRadius(ctx);
    }

    @Override
    public Widget visitBorderRadius(DartParser.BorderRadiusContext ctx) {
        return super.visitBorderRadius(ctx);
    }

    @Override
    public Widget visitBorderRadiusCircular(DartParser.BorderRadiusCircularContext ctx) {
        return super.visitBorderRadiusCircular(ctx);
    }

    @Override
    public Widget visitBorderRadiusOnly(DartParser.BorderRadiusOnlyContext ctx) {
        return super.visitBorderRadiusOnly(ctx);
    }

    @Override
    public Widget visitBorderRadiusCircularProperties(DartParser.BorderRadiusCircularPropertiesContext ctx) {
        return super.visitBorderRadiusCircularProperties(ctx);
    }

    @Override
    public Widget visitBorderRadiusOnlyTopRight(DartParser.BorderRadiusOnlyTopRightContext ctx) {
        return super.visitBorderRadiusOnlyTopRight(ctx);
    }

    @Override
    public Widget visitBorderRadiusOnlyTopLeft(DartParser.BorderRadiusOnlyTopLeftContext ctx) {
        return super.visitBorderRadiusOnlyTopLeft(ctx);
    }

    @Override
    public Widget visitBorderRadiusOnlyBottomRight(DartParser.BorderRadiusOnlyBottomRightContext ctx) {
        return super.visitBorderRadiusOnlyBottomRight(ctx);
    }

    @Override
    public Widget visitBorderRadiusOnlyBottomLeft(DartParser.BorderRadiusOnlyBottomLeftContext ctx) {
        return super.visitBorderRadiusOnlyBottomLeft(ctx);
    }

    @Override
    public Widget visitExpanded(DartParser.ExpandedContext ctx) {
        return super.visitExpanded(ctx);
    }

    @Override
    public Widget visitExpandedFlex(DartParser.ExpandedFlexContext ctx) {
        return super.visitExpandedFlex(ctx);
    }

    @Override
    public Widget visitExpandedChild(DartParser.ExpandedChildContext ctx) {
        return super.visitExpandedChild(ctx);
    }

    @Override
    public Widget visitGestureDetector(DartParser.GestureDetectorContext ctx) {
        return super.visitGestureDetector(ctx);
    }

    @Override
    public Widget visitGestureDetectorProperties(DartParser.GestureDetectorPropertiesContext ctx) {
        return super.visitGestureDetectorProperties(ctx);
    }

    @Override
    public Widget visitOnFunction(DartParser.OnFunctionContext ctx) {
        return super.visitOnFunction(ctx);
    }

    @Override
    public Widget visitPadding(DartParser.PaddingContext ctx) {
        return super.visitPadding(ctx);
    }

    @Override
    public Widget visitPaddingPadding(DartParser.PaddingPaddingContext ctx) {
        return super.visitPaddingPadding(ctx);
    }

    @Override
    public Widget visitPaddingChild(DartParser.PaddingChildContext ctx) {
        return super.visitPaddingChild(ctx);
    }

    @Override
    public Widget visitEdgeInsetsOnly(DartParser.EdgeInsetsOnlyContext ctx) {
        return super.visitEdgeInsetsOnly(ctx);
    }

    @Override
    public Widget visitEdgeInsetsSymetric(DartParser.EdgeInsetsSymetricContext ctx) {
        return super.visitEdgeInsetsSymetric(ctx);
    }

    @Override
    public Widget visitEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx) {
        return super.visitEdgeInsetsOnlyTop(ctx);
    }

    @Override
    public Widget visitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx) {
        return super.visitEdgeInsetsOnlyLeft(ctx);
    }

    @Override
    public Widget visitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx) {
        return super.visitEdgeInsetsOnlyRight(ctx);
    }

    @Override
    public Widget visitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx) {
        return super.visitEdgeInsetsOnlyBottom(ctx);
    }

    @Override
    public Widget visitEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx) {
        return super.visitEdgeInsetsSymetricHorizontal(ctx);
    }

    @Override
    public Widget visitEdgeInsetsSymetricVertical(DartParser.EdgeInsetsSymetricVerticalContext ctx) {
        return super.visitEdgeInsetsSymetricVertical(ctx);
    }

    @Override
    public Widget visitImage(DartParser.ImageContext ctx) { return super.visitImage(ctx); }

    @Override
    public Widget visitImageUrl(DartParser.ImageUrlContext ctx) {
        return super.visitImageUrl(ctx);
    }

    @Override
    public Widget visitImageFit(DartParser.ImageFitContext ctx) {
        return super.visitImageFit(ctx);
    }

    @Override
    public Widget visitImageWidth(DartParser.ImageWidthContext ctx) {
        return super.visitImageWidth(ctx);
    }

    @Override
    public Widget visitImageHeight(DartParser.ImageHeightContext ctx) {
        return super.visitImageHeight(ctx);
    }

    @Override
    public Widget visitButton(DartParser.ButtonContext ctx) {
        return super.visitButton(ctx);
    }

    @Override
    public Widget visitButtonWidth(DartParser.ButtonWidthContext ctx) {
        return super.visitButtonWidth(ctx);
    }

    @Override
    public Widget visitButtonHeight(DartParser.ButtonHeightContext ctx) {
        return super.visitButtonHeight(ctx);
    }

    @Override
    public Widget visitButtonTitle(DartParser.ButtonTitleContext ctx) {
        return super.visitButtonTitle(ctx);
    }

    @Override
    public Widget visitButtonBackgroundColor(DartParser.ButtonBackgroundColorContext ctx) {
        return super.visitButtonBackgroundColor(ctx);
    }

    @Override
    public Widget visitButtonTitleColor(DartParser.ButtonTitleColorContext ctx) {
        return super.visitButtonTitleColor(ctx);
    }

    @Override
    public Widget visitButtonOnPressed(DartParser.ButtonOnPressedContext ctx) {
        return super.visitButtonOnPressed(ctx);
    }

    @Override
    public Widget visitTextField(DartParser.TextFieldContext ctx) {
        return super.visitTextField(ctx);
    }

    @Override
    public Widget visitTextFieldValue(DartParser.TextFieldValueContext ctx) {
        return super.visitTextFieldValue(ctx);
    }

    @Override
    public Widget visitTextFieldLabel(DartParser.TextFieldLabelContext ctx) {
        return super.visitTextFieldLabel(ctx);
    }

    @Override
    public Widget visitTextFieldTextColor(DartParser.TextFieldTextColorContext ctx) {
        return super.visitTextFieldTextColor(ctx);
    }

    @Override
    public Widget visitTextFieldPadding(DartParser.TextFieldPaddingContext ctx) {
        return super.visitTextFieldPadding(ctx);
    }

    @Override
    public Widget visitTextFieldHint(DartParser.TextFieldHintContext ctx) {
        return super.visitTextFieldHint(ctx);
    }

    @Override
    public Widget visitTextFieldBorder(DartParser.TextFieldBorderContext ctx) {
        return super.visitTextFieldBorder(ctx);
    }

    @Override
    public Widget visitTextFieldOnChanged(DartParser.TextFieldOnChangedContext ctx) {
        return super.visitTextFieldOnChanged(ctx);
    }

    @Override
    public Widget visitBorder(DartParser.BorderContext ctx) {
        return super.visitBorder(ctx);
    }

    @Override
    public Widget visitBorderThickness(DartParser.BorderThicknessContext ctx) {
        return super.visitBorderThickness(ctx);
    }

    @Override
    public Widget visitBorderBorderRadius(DartParser.BorderBorderRadiusContext ctx) {
        return super.visitBorderBorderRadius(ctx);
    }

    @Override
    public Widget visitBorderColor(DartParser.BorderColorContext ctx) {
        return super.visitBorderColor(ctx);
    }

    @Override
    public Widget visitCustomWidgetDeclaration(DartParser.CustomWidgetDeclarationContext ctx) {
        return super.visitCustomWidgetDeclaration(ctx);
    }

    @Override
    public Widget visitVariables(DartParser.VariablesContext ctx) {
        return super.visitVariables(ctx);
    }

    @Override
    public Widget visitTree(DartParser.TreeContext ctx) {
        return super.visitTree(ctx);
    }

    @Override
    public Widget visitVariableDeclarationStatment(DartParser.VariableDeclarationStatmentContext ctx) {
        return super.visitVariableDeclarationStatment(ctx);
    }

    @Override
    public Widget visitVariableAssignmentStatment(DartParser.VariableAssignmentStatmentContext ctx) {
        return super.visitVariableAssignmentStatment(ctx);
    }

    @Override
    public Widget visitNonFunctionVariableDeclaration(DartParser.NonFunctionVariableDeclarationContext ctx) {
        return super.visitNonFunctionVariableDeclaration(ctx);
    }

    @Override
    public Widget visitFunctionVariableDeclaration(DartParser.FunctionVariableDeclarationContext ctx) {
        return super.visitFunctionVariableDeclaration(ctx);
    }

    @Override
    public Widget visitVariableAssignment(DartParser.VariableAssignmentContext ctx) {
        return super.visitVariableAssignment(ctx);
    }

    @Override
    public Widget visitWidthProperty(DartParser.WidthPropertyContext ctx) {
        return super.visitWidthProperty(ctx);
    }

    @Override
    public Widget visitHeightProperty(DartParser.HeightPropertyContext ctx) {
        return super.visitHeightProperty(ctx);
    }

    @Override
    public Widget visitColorProperty(DartParser.ColorPropertyContext ctx) {
        return super.visitColorProperty(ctx);
    }

    @Override
    public Widget visitChildProperty(DartParser.ChildPropertyContext ctx) {
        return super.visitChildProperty(ctx);
    }

    @Override
    public Widget visitChildrenProperty(DartParser.ChildrenPropertyContext ctx) {
        return super.visitChildrenProperty(ctx);
    }

    @Override
    public Widget visitMainAxisSizeProperty(DartParser.MainAxisSizePropertyContext ctx) {
        return super.visitMainAxisSizeProperty(ctx);
    }

    @Override
    public Widget visitCrossAxisAlignmentProperty(DartParser.CrossAxisAlignmentPropertyContext ctx) {
        return super.visitCrossAxisAlignmentProperty(ctx);
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
}
