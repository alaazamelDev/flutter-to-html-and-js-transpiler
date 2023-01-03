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
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.*;
import widgets.Widget;
import enums.FitValue;
import enums.CrossAxisAlignmentValue;
import enums.FontWeightValue;
import enums.MainAxisSizeValue;
import enums.TextAlignValue;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProperty extends DartParserBaseVisitor<Property> {

    private final IAntlrObjectFactory factory;

    public AntlrToProperty(IAntlrObjectFactory factory) {
        this.factory = factory;
    }

    @Override
    public Property visitProg(DartParser.ProgContext ctx) {
        return super.visitProg(ctx);
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
        return new TitleProperty(ctx.STRING().getSymbol().getText());
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
        String url = ctx.getChild(2).getText();
        return new UrlProperty(url);
    }

    @Override
    public Property visitImageFit(DartParser.ImageFitContext ctx) {
        String fitValue = ctx.getChild(2).getText();
        FitValue fitValueEnum = FitValue.valueOf(fitValue);
        return new FitProperty(fitValueEnum);
    }

    @Override
    public Property visitImageWidth(DartParser.ImageWidthContext ctx) {
        return visit(ctx.widthProperty());
    }

    @Override
    public Property visitImageHeight(DartParser.ImageHeightContext ctx) {
        return visit(ctx.heightProperty());
    }

    @Override
    public Property visitButton(DartParser.ButtonContext ctx) {
        return super.visitButton(ctx);
    }

    @Override
    public Property visitButtonWidth(DartParser.ButtonWidthContext ctx) {
        return visit(ctx.widthProperty());
    }

    @Override
    public Property visitButtonHeight(DartParser.ButtonHeightContext ctx) {
        return visit(ctx.heightProperty());
    }

    @Override
    public Property visitButtonTitle(DartParser.ButtonTitleContext ctx) {
        String buttonTitle = ctx.getChild(2).getText();
        return new TitleProperty(buttonTitle);
    }

    @Override
    public Property visitButtonBackgroundColor(DartParser.ButtonBackgroundColorContext ctx) {
        String buttonBackgroundColor = ctx.getChild(2).getText();
        return new BackgroundColorProperty(buttonBackgroundColor);
    }

    @Override
    public Property visitButtonTitleColor(DartParser.ButtonTitleColorContext ctx) {
        String buttonTitleColor = ctx.getChild(2).getText();
        return new TitleColorProperty(buttonTitleColor);
    }

    @Override
    public Property visitButtonOnPressed(DartParser.ButtonOnPressedContext ctx) {
        return visit(ctx.onFunction());
    }

    @Override
    public Property visitTextField(DartParser.TextFieldContext ctx) {
        return super.visitTextField(ctx);
    }

    @Override
    public Property visitTextFieldValue(DartParser.TextFieldValueContext ctx) {
        String textFieldValue = ctx.getChild(2).getText();
        return new ValueProperty(textFieldValue);
    }

    @Override
    public Property visitTextFieldLabel(DartParser.TextFieldLabelContext ctx) {
        String textFieldLabel = ctx.getChild(2).getText();
        return new LabelProperty(textFieldLabel);
    }

    @Override
    public Property visitTextFieldTextColor(DartParser.TextFieldTextColorContext ctx) {
        String textFieldTextColor = ctx.getChild(2).getText();
        return new TextColorProperty(textFieldTextColor);
    }

    @Override
    public Property visitTextFieldPadding(DartParser.TextFieldPaddingContext ctx) {
        return visit(ctx.edgeInsets());
    }

    @Override
    public Property visitTextFieldHint(DartParser.TextFieldHintContext ctx) {
        String textFieldHint = ctx.getChild(2).getText();
        return new HintProperty(textFieldHint);
    }

    @Override
    public Property visitTextFieldBorder(DartParser.TextFieldBorderContext ctx) {
        return visit(ctx.border());
    }

    @Override
    public Property visitTextFieldOnChanged(DartParser.TextFieldOnChangedContext ctx) {
        return visit(ctx.onFunction());
    }

    @Override
    public Property visitBorder(DartParser.BorderContext ctx) {
        return super.visitBorder(ctx);
    }

    @Override
    public Property visitBorderThickness(DartParser.BorderThicknessContext ctx) {
        String borderThickness = ctx.getChild(2).getText();
        return new ThicknessProperty(Integer.parseInt(borderThickness));
    }

    @Override
    public Property visitBorderBorderRadius(DartParser.BorderBorderRadiusContext ctx) {
        return visit(ctx.borderRadius());
    }

    @Override
    public Property visitBorderColor(DartParser.BorderColorContext ctx) {
        return visit(ctx.colorProperty());
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
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget();
        Widget child = antlrToWidget.visit(ctx.getChild(2));
        return new ChildWidgetProperty(child);
    }

    @Override
    public Property visitChildrenProperty(DartParser.ChildrenPropertyContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget();
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

}
