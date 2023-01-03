package visitors;

import grammars.DartParser;
import grammars.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.Property;
import widgets.*;

import java.util.ArrayList;
import java.util.List;

public class AntlrToWidget extends DartParserBaseVisitor<Widget> {

    private final AntlrObjectFactory factory;

    public AntlrToWidget(AntlrObjectFactory antlrObjectFactory) {
        this.factory = antlrObjectFactory;
    }

    @Override
    public Widget visitProg(DartParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Widget visitScaffold(DartParser.ScaffoldContext ctx) {
        return super.visitScaffold(ctx);
    }

    @Override
    public Widget visitScaffoldBody(DartParser.ScaffoldBodyContext ctx) {
        return super.visitScaffoldBody(ctx);
    }

    @Override
    public Widget visitScaffoldAppBar(DartParser.ScaffoldAppBarContext ctx) {
        return super.visitScaffoldAppBar(ctx);
    }

    @Override
    public Widget visitAppBar(DartParser.AppBarContext ctx) {
        return super.visitAppBar(ctx);
    }

    @Override
    public Widget visitAppBarTitle(DartParser.AppBarTitleContext ctx) {
        return super.visitAppBarTitle(ctx);
    }

    @Override
    public Widget visitAppBarCenterTitle(DartParser.AppBarCenterTitleContext ctx) {
        return super.visitAppBarCenterTitle(ctx);
    }

    @Override
    public Widget visitRowWidget(DartParser.RowWidgetContext ctx) {
        return super.visitRowWidget(ctx);
    }

    @Override
    public Widget visitCenterWidget(DartParser.CenterWidgetContext ctx) {
        return super.visitCenterWidget(ctx);
    }

    @Override
    public Widget visitTextWidget(DartParser.TextWidgetContext ctx) {
        return super.visitTextWidget(ctx);
    }

    @Override
    public Widget visitContainerWidget(DartParser.ContainerWidgetContext ctx) {
        return super.visitContainerWidget(ctx);
    }

    @Override
    public Widget visitExpandedWidget(DartParser.ExpandedWidgetContext ctx) {
        return super.visitExpandedWidget(ctx);
    }

    @Override
    public Widget visitColumnWidget(DartParser.ColumnWidgetContext ctx) {
        return super.visitColumnWidget(ctx);
    }

    @Override
    public Widget visitGestureDetectorWidget(DartParser.GestureDetectorWidgetContext ctx) {
        return super.visitGestureDetectorWidget(ctx);
    }

    @Override
    public Widget visitPaddingWidget(DartParser.PaddingWidgetContext ctx) {
        return super.visitPaddingWidget(ctx);
    }

    @Override
    public Widget visitImageWidget(DartParser.ImageWidgetContext ctx) {
        return super.visitImageWidget(ctx);
    }

    @Override
    public Widget visitButtonWidget(DartParser.ButtonWidgetContext ctx) {
        return super.visitButtonWidget(ctx);
    }

    @Override
    public Widget visitCreatedWidget(DartParser.CreatedWidgetContext ctx) {
        return super.visitCreatedWidget(ctx);
    }

    @Override
    public Widget visitTextFieldWidget(DartParser.TextFieldWidgetContext ctx) {
        return super.visitTextFieldWidget(ctx);
    }

    @Override
    public Widget visitCustomWidget(DartParser.CustomWidgetContext ctx) {
        return super.visitCustomWidget(ctx);
    }

    @Override
    public Widget visitCustomWidgetProperties(DartParser.CustomWidgetPropertiesContext ctx) {
        return super.visitCustomWidgetProperties(ctx);
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
        List<Property> properties = new ArrayList<>();
        for (DartParser.ContainerPropertiesContext cp : ctx.containerProperties()) {
            properties.add(factory.createAntlrToProperty().visit(cp));
        }
        return new Container(properties);
    }


    @Override
    public Widget visitBoxDecoration(DartParser.BoxDecorationContext ctx) {
        List<Property> properties = new ArrayList<>();
        for (DartParser.BoxDecorationPropertiesContext bdpc : ctx.boxDecorationProperties()) {
            properties.add(factory.createAntlrToProperty().visit(bdpc));
        }
        return new BoxDecorationWidget(properties);
    }


    @Override
    public Widget visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Widget visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Widget visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Widget visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Widget defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Widget aggregateResult(Widget aggregate, Widget nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Widget currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
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
        return visit(ctx.getChild(0));
    }

    @Override
    public Widget visitBorderRadiusCircular(DartParser.BorderRadiusCircularContext ctx) {
        List<Property> properties = new ArrayList<>();
        properties.add(factory.createAntlrToProperty().visit(ctx.borderRadiusCircularProperties()));
        return new BorderRadiusCircular(properties);
    }

    @Override
    public Widget visitBorderRadiusOnly(DartParser.BorderRadiusOnlyContext ctx) {
        List<Property> properties = new ArrayList<>();
        for (DartParser.BorderRadiusOnlyPropertiesContext bdopc : ctx.borderRadiusOnlyProperties()) {
            properties.add(factory.createAntlrToProperty().visit(bdopc));
        }
        return new BorderRadiusOnly(properties);
    }

    @Override
    public Widget visitExpanded(DartParser.ExpandedContext ctx) {
        List<Property> properties = new ArrayList<>();
        for (DartParser.ExpandedPropertiesContext epc : ctx.expandedProperties()) {
            properties.add(factory.createAntlrToProperty().visit(epc));
        }
        return new Expanded(properties);
    }
    @Override
    public Widget visitGestureDetector(DartParser.GestureDetectorContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties=new ArrayList<>();
        for(DartParser.GestureDetectorPropertiesContext gpc : ctx.gestureDetectorProperties()){
            properties.add(antlrToProperty.visit(gpc));
        }

        GestureDetector gestureDetector = new GestureDetector(properties);
        return gestureDetector;
    }

    @Override
    public Widget visitOnFunction(DartParser.OnFunctionContext ctx) {
        return super.visitOnFunction(ctx);
    }

    //done
    @Override
    public Widget visitPadding(DartParser.PaddingContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties=new ArrayList<>();
        for(DartParser.PaddingProprteyContext ppc : ctx.paddingProprtey()){
            properties.add(antlrToProperty.visit(ppc));
        }
        return new Padding(properties);
    }

    //done
    @Override
    public Widget visitEdgeInsetsOnly(DartParser.EdgeInsetsOnlyContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties=new ArrayList<>();
        for(DartParser.EdgeInsetsOnlyPropertiesContext eiopc : ctx.edgeInsetsOnlyProperties()){
            properties.add(antlrToProperty.visit(eiopc));
        }
        return new EdgeInsetsOnly(properties);
    }

    //done
    @Override
    public Widget visitEdgeInsetsSymetric(DartParser.EdgeInsetsSymetricContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties=new ArrayList<>();
        for(DartParser.EdgeInsetsSymetricPropertiesContext espc : ctx.edgeInsetsSymetricProperties()){
            properties.add(antlrToProperty.visit(espc));
        }
        return new EdgeInsetsSymmetric(properties);
    }

    //done
    @Override
    public Widget visitImage(DartParser.ImageContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties=new ArrayList<>();
        for(DartParser.ImagePropertiesContext ipc : ctx.imageProperties()){
            properties.add(antlrToProperty.visit(ipc));
        }
        return new Image(properties);
    }

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
