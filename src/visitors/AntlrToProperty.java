package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import enums.ContentAlignmentValue;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.*;
import properties.border_radius.*;
import properties.container.ContainerContentAlignmentProperty;
import properties.decoration.DecorationProperty;
import properties.expanded.ExpandedFlexProperty;
import properties.gestureDetectorProperties.OnPressedProperty;
import widgets.*;

public class AntlrToProperty extends DartParserBaseVisitor<Property> {
    private final AntlrObjectFactory factory;
    public AntlrToProperty(AntlrObjectFactory antlrObjectFactory) {
        this.factory = antlrObjectFactory;
    }
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
    public Property visitDecorationProperty(DartParser.DecorationPropertyContext ctx) {
        return new DecorationProperty(factory.createAntlrToWidget().visit(ctx.boxDecoration()));
    }

    @Override
    public Property visitBorderRadiusProperty(DartParser.BorderRadiusPropertyContext ctx) {
        return new BorderRadiusProperty(factory.createAntlrToWidget().visit(ctx.borderRadius()));
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
    public Property visitContainerWidth(DartParser.ContainerWidthContext ctx) {
        return  visit(ctx.widthProperty());
    }

    @Override
    public Property visitContainerHeight(DartParser.ContainerHeightContext ctx) {
        return visit(ctx.heightProperty());
    }

    @Override
    public Property visitContainerContentAlignment(DartParser.ContainerContentAlignmentContext ctx) {
        ContentAlignmentValue contentAlignmentValue = ContentAlignmentValue.valueOf(ctx.getChild(2).toString());
        return new ContainerContentAlignmentProperty(contentAlignmentValue);
    }

    @Override
    public Property visitContainerChild(DartParser.ContainerChildContext ctx) {
        return visit(ctx.childProperty());
    }

    @Override
    public Property visitContainerDecoration(DartParser.ContainerDecorationContext ctx) {
        return visit(ctx.decorationProperty());
    }

    @Override
    public Property visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Property visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Property visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Property visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Property defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Property aggregateResult(Property aggregate, Property nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Property currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
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
    public Property visitBorderRadiusCircularProperties(DartParser.BorderRadiusCircularPropertiesContext ctx) {

        return new BorderRadiusCircularProperty(Double.parseDouble(ctx.getChild(2).getText()));
    }

    @Override
    public Property visitBorderRadiusOnlyTopRight(DartParser.BorderRadiusOnlyTopRightContext ctx) {
        return new BorderRadiusOnlyTopRightProperty(Double.parseDouble(ctx.getChild(2).getText()));
    }

    @Override
    public Property visitBorderRadiusOnlyTopLeft(DartParser.BorderRadiusOnlyTopLeftContext ctx) {
        return new BorderRadiusOnlyTopLeftProperty(Double.parseDouble(ctx.getChild(2).getText()));
    }

    @Override
    public Property visitBorderRadiusOnlyBottomRight(DartParser.BorderRadiusOnlyBottomRightContext ctx) {
        return new BorderRadiusOnlyBottomRightProperty(Double.parseDouble(ctx.getChild(2).getText()));
    }

    @Override
    public Property visitBorderRadiusOnlyBottomLeft(DartParser.BorderRadiusOnlyBottomLeftContext ctx) {
        return new BorderRadiusOnlyBottomLeftProperty(Double.parseDouble(ctx.getChild(2).getText()));
    }

    @Override
    public Property visitExpanded(DartParser.ExpandedContext ctx) {
        return super.visitExpanded(ctx);
    }

    @Override
    public Property visitExpandedFlex(DartParser.ExpandedFlexContext ctx) {
        return new ExpandedFlexProperty(Integer.parseInt(ctx.getChild(2).getText()));
    }

    @Override
    public Property visitExpandedChild(DartParser.ExpandedChildContext ctx) {
        return visit(ctx.childProperty());
    }

    @Override
    public Property visitGestureDetector(DartParser.GestureDetectorContext ctx) {
        return super.visitGestureDetector(ctx);
    }

    //done
    @Override
    public Property visitGestureDetectorProperties(DartParser.GestureDetectorPropertiesContext ctx) {
        return new OnPressedProperty(visit(ctx.getChild(2)));
    }

    @Override
    public Property visitOnFunction(DartParser.OnFunctionContext ctx) {
        
        return super.visitOnFunction(ctx);
    }


    //done
    @Override
    public Property visitPaddingPadding(DartParser.PaddingPaddingContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget();
        return new PaddingAttributeWidgetProperty(antlrToWidget.visit(ctx.getChild(2)));
    }

    @Override
    public Property visitPaddingChild(DartParser.PaddingChildContext ctx) {
        return super.visitPaddingChild(ctx);
    }


    //done
    @Override
    public Property visitEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx) {
        return new Top(Double.parseDouble(ctx.getChild(2).getText()));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx) {
        return new Left(Double.parseDouble(ctx.getChild(2).getText()));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx) {
        return new Right(Double.parseDouble(ctx.getChild(2).getText()));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx) {
        return new Bottom(Double.parseDouble(ctx.getChild(2).getText()));
    }

    //done
    @Override
    public Property visitEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx) {
        return new Horizontal(Double.parseDouble(ctx.getChild(2).getText()));
    }

    //done
    @Override
    public Property visitEdgeInsetsSymetricVertical(DartParser.EdgeInsetsSymetricVerticalContext ctx) {
        return new Vertical(Double.parseDouble(ctx.getChild(2).getText()));
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
