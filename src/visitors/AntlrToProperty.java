package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import enums.*;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.*;
import properties.border_radius.*;
import properties.container.ContainerContentAlignmentProperty;
import properties.edgeInsetsOnlyProperties.Bottom;
import properties.edgeInsetsOnlyProperties.Left;
import properties.edgeInsetsOnlyProperties.Right;
import properties.edgeInsetsOnlyProperties.Top;
import properties.expanded.ExpandedFlexProperty;
import properties.gestureDetectorProperties.OnPressedProperty;
import widgets.Widget;

import java.util.ArrayList;
import java.util.List;

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

        // get the line number of this node
        int lineNumber = ctx.APPBARATRIB().getSymbol().getLine();

        // get appBar context object
        DartParser.AppBarContext appBarContext = ctx.appBar();

        // parse the context
        Widget appBar = antlrToWidgetVisitor.visit(appBarContext);

        return new AppBarProperty(appBar, String.valueOf(lineNumber));
    }


    @Override
    public Property visitAppBarTitle(DartParser.AppBarTitleContext ctx) {

        String lineNumber = String.valueOf(ctx.TITLE().getSymbol().getLine());
        String content = ctx.STRING().getSymbol().getText();
        // return new TitleProperty Object
        return new TitleProperty(content, lineNumber);
    }

    @Override
    public Property visitAppBarCenterTitle(DartParser.AppBarCenterTitleContext ctx) {
        String lineNumber = String.valueOf(ctx.CENTERTITLE().getSymbol().getLine());
        boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getSymbol().getText());
        // return new CenterTitleProperty Object
        return new CenterTitleProperty(value, lineNumber);
    }


    @Override
    public Property visitCustomWidgetProperties(DartParser.CustomWidgetPropertiesContext ctx) {

        String lineNumber = String.valueOf(ctx.IDENTIFIER().getSymbol().getLine());
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
        return new CustomWidgetProperty(propertyName, propertyValue, lineNumber);
    }

    @Override
    public Property visitRowProperties(DartParser.RowPropertiesContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Property visitCenterChild(DartParser.CenterChildContext ctx) {
        return visit(ctx.childProperty());
    }

    @Override
    public Property visitColumnProperties(DartParser.ColumnPropertiesContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Property visitTextContent(DartParser.TextContentContext ctx) {
        String lineNumber = String.valueOf(ctx.TEXTATRIB().getSymbol().getLine());
        String value = ctx.getChild(2).getText();
        return new TextContent(value, lineNumber);
    }

    @Override
    public Property visitTextFontWeight(DartParser.TextFontWeightContext ctx) {
        String lineNumber = String.valueOf(ctx.FONTWEIGHT().getSymbol().getLine());
        String value = ctx.getChild(2).getText();
        return new FontWeightObjectProperty(FontWeightValue.valueOf(value), lineNumber);
    }

    @Override
    public Property visitTextFontSize(DartParser.TextFontSizeContext ctx) {
        String lineNumber = String.valueOf(ctx.FONTSIZE().getSymbol().getLine());
        String value = ctx.getChild(2).getText();
        return new FontSizeDoubleProperty(Double.parseDouble(value), lineNumber);
    }

    @Override
    public Property visitTextLetterSpacing(DartParser.TextLetterSpacingContext ctx) {
        String lineNumber = String.valueOf(ctx.LETTERSPACING().getSymbol().getLine());
        String value = ctx.getChild(2).getText();
        return new LetterSpacingDoubleProperty(Double.parseDouble(value), lineNumber);
    }

    @Override
    public Property visitTextTextAlign(DartParser.TextTextAlignContext ctx) {
        String lineNumber = String.valueOf(ctx.TEXTALIGN().getSymbol().getLine());
        String value = ctx.getChild(2).getText();
        return new TextAlignObjectProperty(TextAlignValue.valueOf(value), lineNumber);
    }


    @Override
    public Property visitContainerWidth(DartParser.ContainerWidthContext ctx) {
        return visit(ctx.widthProperty());
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
    public Property visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Property visitBoxDecorationProperties(DartParser.BoxDecorationPropertiesContext ctx) {
        return visit(ctx.getChild(0));
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
    public Property visitExpandedFlex(DartParser.ExpandedFlexContext ctx) {
        return new ExpandedFlexProperty(Integer.parseInt(ctx.getChild(2).getText()));
    }

    @Override
    public Property visitExpandedChild(DartParser.ExpandedChildContext ctx) {
        return visit(ctx.childProperty());
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

    // Must return a BorderProperty class
    @Override
    public Property visitTextFieldBorder(DartParser.TextFieldBorderContext ctx) {
        return visit(ctx.border());
    }

    @Override
    public Property visitTextFieldOnChanged(DartParser.TextFieldOnChangedContext ctx) {
        return visit(ctx.onFunction());
    }

    @Override
    public Property visitBorderThickness(DartParser.BorderThicknessContext ctx) {
        String borderThickness = ctx.getChild(2).getText();
        return new ThicknessProperty(Integer.parseInt(borderThickness));
    }

    // Must return a BorderRadiusProperty class
    @Override
    public Property visitBorderBorderRadius(DartParser.BorderBorderRadiusContext ctx) {
        return visit(ctx.borderRadius());
    }

    @Override
    public Property visitBorderColor(DartParser.BorderColorContext ctx) {
        return visit(ctx.colorProperty());
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
