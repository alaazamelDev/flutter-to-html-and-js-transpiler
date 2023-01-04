package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import properties.Property;
import widgets.Border;
import widgets.Button;
import widgets.TextField;
import widgets.AppBar;
import widgets.Scaffold;
import widgets.Widget;
import widgets.*;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AntlrToWidget extends DartParserBaseVisitor<Widget> {
    private final IAntlrObjectFactory factory;

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
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.RowPropertiesContext rp : ctx.rowProperties()) {
            properties.add(antlrToProperty.visit(rp));
        }
        return new Row(properties);
    }

    @Override
    public Widget visitCenter(DartParser.CenterContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();

        for(DartParser.CenterPropertiesContext cp : ctx.centerProperties()) {
            properties.add(antlrToProperty.visit(cp));
        }

        return new Center(properties);
    }

    @Override
    public Widget visitCenterChild(DartParser.CenterChildContext ctx) {
        return super.visitCenterChild(ctx);
    }

    @Override
    public Widget visitColumn(DartParser.ColumnContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.ColumnPropertiesContext cp : ctx.columnProperties()) {
            properties.add(antlrToProperty.visit(cp));
        }
        return new Column(properties);
    }

    @Override
    public Widget visitText(DartParser.TextContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for(DartParser.TextPropertiesContext tp : ctx.textProperties()) {
            properties.add(antlrToProperty.visit(tp));
        }
        return new Text(properties);
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

        return new GestureDetector(properties);
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
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        List<Property> properties = new ArrayList<>();

        List<DartParser.ButtonPropertiesContext> buttonPropertiesContextList = ctx.buttonProperties();

        for (DartParser.ButtonPropertiesContext bpc : buttonPropertiesContextList) {
            properties.add(antlrToPropertyVisitor.visit(bpc));
        }
        return new Button(properties);
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
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        List<Property> properties = new ArrayList<>();

        List<DartParser.TextFieldPropertiesContext> textFieldPropertiesContexts = ctx.textFieldProperties();
        for (DartParser.TextFieldPropertiesContext textFieldPropertiesContext : textFieldPropertiesContexts) {
            properties.add(antlrToPropertyVisitor.visit(textFieldPropertiesContext));
        }
        return new TextField(properties);
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
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        List<Property> properties = new ArrayList<>();

        List<DartParser.BorderPropertiesContext> borderPropertiesContexts = ctx.borderProperties();

        for (DartParser.BorderPropertiesContext borderPropertiesContext : borderPropertiesContexts) {
            properties.add(antlrToPropertyVisitor.visit(borderPropertiesContext));
        }

        return new Border(properties);
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

}
