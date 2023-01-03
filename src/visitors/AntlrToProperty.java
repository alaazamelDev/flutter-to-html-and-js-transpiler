package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.*;
import widgets.Widget;

public class AntlrToProperty extends DartParserBaseVisitor<Property> {


    private final IAntlrObjectFactory factory;

    public AntlrToProperty(IAntlrObjectFactory factory) {
        this.factory = factory;
    }


    @Override
    public Property visitScaffoldBody(DartParser.ScaffoldBodyContext ctx) {

        AntlrToWidget antlrToWidgetVisitor = factory.createAntlrToWidget();

        // get widget context object
        DartParser.WidgetContext widgetContext = ctx.widget();

        // parse the context
        Widget body = antlrToWidgetVisitor.visit(widgetContext);

        return new BodyProperty(body);
    }

    @Override
    public Property visitScaffoldAppBar(DartParser.ScaffoldAppBarContext ctx) {

        AntlrToWidget antlrToWidgetVisitor = factory.createAntlrToWidget();

        // get appBar context object
        DartParser.AppBarContext appBarContext = ctx.appBar();

        // parse the context
        Widget appBar = antlrToWidgetVisitor.visit(appBarContext);

        return new AppBarProperty(appBar);
    }


    @Override
    public Property visitAppBarTitle(DartParser.AppBarTitleContext ctx) {
        // return new TitleProperty Object
        return new Title(ctx.STRING().getSymbol().getText());
    }

    @Override
    public Property visitAppBarCenterTitle(DartParser.AppBarCenterTitleContext ctx) {
        String stringValue = ctx.BOOLEAN().getSymbol().getText();
        // return new CenterTitleProperty Object
        return new CenterTitleProperty(Boolean.parseBoolean(stringValue));
    }


    @Override
    public Property visitCustomWidgetProperties(DartParser.CustomWidgetPropertiesContext ctx) {

        String propertyName = ctx.IDENTIFIER().getSymbol().getText();
        Object propertyValue = new Object();

        ParseTree child = ctx.getChild(2);
        if (child instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) child;
            Token token = terminalNode.getSymbol();
            int tokenType = token.getType();
            if (tokenType == DartParser.NUM) {
                propertyValue = Integer.parseInt(token.getText());
            } else if (tokenType == DartParser.STRING) {
                propertyValue = token.getText();
            } else if (tokenType == DartParser.FLOAT) {
                propertyValue = Double.parseDouble(token.getText());
            }
        }
        return new CustomWidgetProperty(propertyName,propertyValue);
    }

    @Override
    public Property visitRow(DartParser.RowContext ctx) {
        return super.visitRow(ctx);
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
    public Property visitText(DartParser.TextContext ctx) {
        return super.visitText(ctx);
    }

    @Override
    public Property visitTextContent(DartParser.TextContentContext ctx) {
        return super.visitTextContent(ctx);
    }

    @Override
    public Property visitTextFontWeight(DartParser.TextFontWeightContext ctx) {
        return super.visitTextFontWeight(ctx);
    }

    @Override
    public Property visitTextFontSize(DartParser.TextFontSizeContext ctx) {
        return super.visitTextFontSize(ctx);
    }

    @Override
    public Property visitTextLetterSpacing(DartParser.TextLetterSpacingContext ctx) {
        return super.visitTextLetterSpacing(ctx);
    }

    @Override
    public Property visitTextTextAlign(DartParser.TextTextAlignContext ctx) {
        return super.visitTextTextAlign(ctx);
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
        return super.visitWidthProperty(ctx);
    }

    @Override
    public Property visitHeightProperty(DartParser.HeightPropertyContext ctx) {
        return super.visitHeightProperty(ctx);
    }

    @Override
    public Property visitColorProperty(DartParser.ColorPropertyContext ctx) {
        return super.visitColorProperty(ctx);
    }

    @Override
    public Property visitChildProperty(DartParser.ChildPropertyContext ctx) {
        return super.visitChildProperty(ctx);
    }

    @Override
    public Property visitChildrenProperty(DartParser.ChildrenPropertyContext ctx) {
        return super.visitChildrenProperty(ctx);
    }

    @Override
    public Property visitMainAxisSizeProperty(DartParser.MainAxisSizePropertyContext ctx) {
        return super.visitMainAxisSizeProperty(ctx);
    }

    @Override
    public Property visitCrossAxisAlignmentProperty(DartParser.CrossAxisAlignmentPropertyContext ctx) {
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
