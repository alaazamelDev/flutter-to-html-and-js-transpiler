package visitors;


import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import data_types.Function;
import enums.*;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.*;
import properties.appbar.CenterTitleProperty;
import properties.appbar.TitleProperty;
import properties.border_radius.*;
import properties.border_radius.border_radius_circular.borderRadiusCircularRadiusProperty;
import properties.border_radius.border_radius_only.BottomLeftProperty;
import properties.border_radius.border_radius_only.BottomRightProperty;
import properties.border_radius.border_radius_only.TopLeftProperty;
import properties.border_radius.border_radius_only.TopRightProperty;
import properties.container.ContainerContentAlignmentProperty;
import properties.decoration.DecorationProperty;
import properties.edgeInsetsOnlyProperties.Bottom;
import properties.edgeInsetsOnlyProperties.Left;
import properties.edgeInsetsOnlyProperties.Right;
import properties.edgeInsetsOnlyProperties.Top;
import properties.edgeInsetsSymetricProperties.Horizontal;
import properties.edgeInsetsSymetricProperties.Vertical;
import properties.expanded.ExpandedFlexProperty;
import properties.scaffold.AppBarProperty;
import properties.scaffold.BodyProperty;
import properties.ColorProperty;
import properties.text.*;
import statements.Statement;
import utils.Symbol;
import utils.SymbolTable;
import utils.UTIL;
import widgets.Widget;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProperty extends DartParserBaseVisitor<Property> {

    private final IAntlrObjectFactory factory;
    List<String> semanticError;

    public AntlrToProperty(IAntlrObjectFactory factory, List<String> semanticError) {
        this.factory = factory;
        this.semanticError = semanticError;
    }


    @Override
    public Property visitScaffoldBody(DartParser.ScaffoldBodyContext ctx) {

        AntlrToWidget antlrToWidgetVisitor = factory.createAntlrToWidget(semanticError);

        String lineNumber = String.valueOf(ctx.BODY().getSymbol().getLine());

        // get widget context object
        DartParser.WidgetContext widgetContext = ctx.widget();

        // parse the context
        Widget body = antlrToWidgetVisitor.visit(widgetContext);

        return new BodyProperty(body, lineNumber);
    }

    @Override
    public Property visitScaffoldAppBar(DartParser.ScaffoldAppBarContext ctx) {

        AntlrToWidget antlrToWidgetVisitor = factory.createAntlrToWidget(semanticError);

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

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            Symbol symbol = instance.get(var);

            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.TEXTATRIB().getSymbol().getLine()
                        , ctx.TEXTATRIB().getSymbol().getCharPositionInLine() + 1, var));
                return new TextContent("value", lineNumber);
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("string")) {
                String value = (String) symbol.getValue();
                return new TextContent(value, lineNumber);
            }
            else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.TEXTATRIB().getSymbol().getLine(),
                        ctx.TEXTATRIB().getSymbol().getCharPositionInLine() + 1, "string", type));
                return new TextContent("value", lineNumber);
            }
        }

        String value = ctx.getChild(2).getText();
        return new TextContent(value, lineNumber);
    }

    @Override
    public Property visitTextFontWeight(DartParser.TextFontWeightContext ctx) {
        String lineNumber = String.valueOf(ctx.FONTWEIGHT().getSymbol().getLine());
        String value = ctx.getChild(2).getText();
        return new FontWeightProperty(FontWeightValue.valueOf(value), lineNumber);
    }

    @Override
    public Property visitTextFontSize(DartParser.TextFontSizeContext ctx) {
        String lineNumber = String.valueOf(ctx.FONTSIZE().getSymbol().getLine());
        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //search for the var in the st
            Symbol symbol = instance.get(var);

            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.FONTSIZE().getSymbol().getLine()
                        , ctx.FONTSIZE().getSymbol().getCharPositionInLine() + 1, var));
                return new FontSizeProperty(1, lineNumber);
            }

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                Integer value = (Integer) symbol.getValue();
                return new FontSizeProperty(value, lineNumber);
            }
            else if (type.equals("double")) {
                Double value = (Double) symbol.getValue();
                return new FontSizeProperty(value, lineNumber);
             }
            else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.FONTSIZE().getSymbol().getLine(),
                        ctx.FONTSIZE().getSymbol().getCharPositionInLine() + 1, "int,double", type));
                return new FontSizeProperty(1, lineNumber);
            }
        }

        String value = ctx.getChild(2).getText();
        return new FontSizeProperty(Double.parseDouble(value), lineNumber);
    }

    @Override
    public Property visitBorderRadiusProperty(DartParser.BorderRadiusPropertyContext ctx) {
        String line = Integer.toString(ctx.BORDERRADIUS().getSymbol().getLine());
        return new BorderRadiusProperty(factory.createAntlrToWidget(semanticError).visit(ctx.borderRadius()), line);
    }

    @Override
    public Property visitTextLetterSpacing(DartParser.TextLetterSpacingContext ctx) {
        String lineNumber = String.valueOf(ctx.LETTERSPACING().getSymbol().getLine());

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //TODO if the symbol is null there is a semantic error, the var wasn't declared
            //search for the var in the st
            Symbol symbol = instance.get(var);

            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.LETTERSPACING().getSymbol().getLine()
                        , ctx.LETTERSPACING().getSymbol().getCharPositionInLine() + 1, var));
                return new LetterSpacingProperty(1, lineNumber);
            }

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                Integer value = (Integer) symbol.getValue();
                return new LetterSpacingProperty(value, lineNumber);
            }
            else if (type.equals("double")) {
                if (symbol.getValue() instanceof Integer) {
                    int a = (int) symbol.getValue();
                    double value = (double) a;
                    System.out.println(value);
                    return new LetterSpacingProperty(value, lineNumber);
                }
                else if (symbol.getValue() instanceof Double){
                    Double value = (Double) symbol.getValue();
                    System.out.println(value);
                    return new LetterSpacingProperty(value, lineNumber);
                }
            }
            else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.LETTERSPACING().getSymbol().getLine(),
                        ctx.LETTERSPACING().getSymbol().getCharPositionInLine() + 1, "int,double", type));
                return new LetterSpacingProperty(1, lineNumber);
            }
        }

        String value = ctx.getChild(2).getText();
        return new LetterSpacingProperty(Double.parseDouble(value), lineNumber);
    }

    @Override
    public Property visitTextTextAlign(DartParser.TextTextAlignContext ctx) {
        String lineNumber = String.valueOf(ctx.TEXTALIGN().getSymbol().getLine());
        String value = ctx.getChild(2).getText();
        return new TextAlignProperty(TextAlignValue.valueOf(value), lineNumber);
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
        String line = Integer.toString(ctx.CONTENTALIGNMENT().getSymbol().getLine());
        ContentAlignmentValue contentAlignmentValue = ContentAlignmentValue.valueOf(ctx.getChild(2).toString());
        return new ContainerContentAlignmentProperty(contentAlignmentValue, line);
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
    public Property visitDecorationProperty(DartParser.DecorationPropertyContext ctx) {
        String line = Integer.toString(ctx.DECORATION().getSymbol().getLine());
        return new DecorationProperty(factory.createAntlrToWidget(semanticError).visit(ctx.boxDecoration()), line);
    }

    @Override
    public Property visit(ParseTree tree) {
        return super.visit(tree);
    }

//    @Override
//    public Property visitChildren(RuleNode node) {
//        return super.visitChildren(node);
//    }

    @Override
    public Property visitBoxDecorationProperties(DartParser.BoxDecorationPropertiesContext ctx) {
        return visit(ctx.getChild(0));
    }


    @Override
    public Property visitBorderRadiusCircularRadiusProperty(DartParser.BorderRadiusCircularRadiusPropertyContext ctx) {
        String lineNumber = String.valueOf(ctx.RADIUS().getSymbol().getLine());
        double radius = Double.parseDouble(ctx.getChild(2).getText());
        return new borderRadiusCircularRadiusProperty(radius, lineNumber);
    }

    @Override
    public Property visitBorderRadiusOnlyTopRight(DartParser.BorderRadiusOnlyTopRightContext ctx) {
        String line = Integer.toString(ctx.TOPRIGHT().getSymbol().getLine());
        return new TopRightProperty(Double.parseDouble(ctx.getChild(2).getText()), line);
    }

    @Override
    public Property visitBorderRadiusOnlyTopLeft(DartParser.BorderRadiusOnlyTopLeftContext ctx) {
        String line = Integer.toString(ctx.TOPLEFT().getSymbol().getLine());
        return new TopLeftProperty(Double.parseDouble(ctx.getChild(2).getText()), line);
    }

    @Override
    public Property visitBorderRadiusOnlyBottomRight(DartParser.BorderRadiusOnlyBottomRightContext ctx) {
        String line = Integer.toString(ctx.BOTTOMRIGHT().getSymbol().getLine());
        return new BottomRightProperty(Double.parseDouble(ctx.getChild(2).getText()), line);
    }

    @Override
    public Property visitBorderRadiusOnlyBottomLeft(DartParser.BorderRadiusOnlyBottomLeftContext ctx) {
        String line = Integer.toString(ctx.BOTTOMLEFT().getSymbol().getLine());
        return new BottomLeftProperty(Double.parseDouble(ctx.getChild(2).getText()), line);
    }


    @Override
    public Property visitExpandedFlex(DartParser.ExpandedFlexContext ctx) {
        String line = Integer.toString(ctx.FLEX().getSymbol().getLine());
        return new ExpandedFlexProperty(Integer.parseInt(ctx.getChild(2).getText()), line);
    }

    @Override
    public Property visitExpandedChild(DartParser.ExpandedChildContext ctx) {
        return visit(ctx.childProperty());
    }


    //done
    @Override
    public Property visitPaddingPadding(DartParser.PaddingPaddingContext ctx) {
        Token idToken = ctx.PADDINGATTR().getSymbol();
        int line = idToken.getLine();
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);
        return new PaddingAttributeProperty(antlrToWidget.visit(ctx.getChild(2)), Integer.toString(line));
    }

    //done
    @Override
    public Property visitPaddingChild(DartParser.PaddingChildContext ctx) {
        return visit(ctx.childProperty());
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyTop(DartParser.EdgeInsetsOnlyTopContext ctx) {
        Token idToken = ctx.TOP().getSymbol();
        int line = idToken.getLine();
        return new Top(Double.parseDouble(ctx.getChild(2).getText()), Integer.toString(line));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx) {
        Token idToken = ctx.LEFT().getSymbol();
        int line = idToken.getLine();
        return new Left(Double.parseDouble(ctx.getChild(2).getText()), Integer.toString(line));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx) {
        Token idToken = ctx.RIGHT().getSymbol();
        int line = idToken.getLine();
        return new Right(Double.parseDouble(ctx.getChild(2).getText()), Integer.toString(line));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx) {
        Token idToken = ctx.BOTTOM().getSymbol();
        int line = idToken.getLine();
        return new Bottom(Double.parseDouble(ctx.getChild(2).getText()), Integer.toString(line));
    }

    //done
    @Override
    public Property visitEdgeInsetsSymetricHorizontal(DartParser.EdgeInsetsSymetricHorizontalContext ctx) {
        Token idToken = ctx.HORIZONTAL().getSymbol();
        int line = idToken.getLine();
        String value = ctx.getChild(2).getText();
        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //TODO if the symbol is null there is a semantic error, the var wasn't declared
            //search for the var in the st
            Symbol symbol = instance.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, ctx.IDENTIFIER().getSymbol().getText()));
                return new Horizontal(-1.0d,Integer.toString(line));
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int intValue = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new Horizontal(intValue, String.valueOf(line));
            } else if (type.equals("double")) {
                double doubleValue = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new Horizontal(doubleValue, String.valueOf(line));
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1,
                        "double,int", type));
                return new Horizontal(-1.0d,Integer.toString(line));
            }
        }
        return new Horizontal(Double.parseDouble(value), Integer.toString(line));
    }

    //done
    @Override
    public Property visitEdgeInsetsSymetricVertical(DartParser.EdgeInsetsSymetricVerticalContext ctx) {
        Token idToken = ctx.VERTICAL().getSymbol();
        int line = idToken.getLine();

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //TODO if the symbol is null there is a semantic error, the var wasn't declared
            //search for the var in the st
            Symbol symbol = instance.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, ctx.IDENTIFIER().getSymbol().getText()));
                return new Vertical(-1.0d,Integer.toString(line));
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int intValue = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new Horizontal(intValue, String.valueOf(line));
            } else if (type.equals("double")) {
                double doubleValue = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new Horizontal(doubleValue, String.valueOf(line));
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1,
                        "double,int", type));
                return new Vertical(-1.0d,Integer.toString(line));
            }
        }
        return new Vertical(Double.parseDouble(ctx.getChild(2).getText()), Integer.toString(line));
    }


    @Override
    public Property visitImageUrl(DartParser.ImageUrlContext ctx) {
        Token idToken = ctx.URL().getSymbol();
        int line = idToken.getLine();
        String url = ctx.getChild(2).getText();

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //TODO if the symbol is null there is a semantic error, the var wasn't declared
            //search for the var in the st
            Symbol symbol = instance.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, ctx.IDENTIFIER().getSymbol().getText()));
                return new UrlProperty("",Integer.toString(line));
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("string")) {
                String stringValue = String.valueOf(symbol.getValue());
                return new UrlProperty(stringValue, Integer.toString(line));
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1,
                        "string", type));
                return new UrlProperty("",Integer.toString(line));
            }
        }
        return new UrlProperty(url, Integer.toString(line));
    }

    @Override
    public Property visitImageFit(DartParser.ImageFitContext ctx) {
        int lineNumber = ctx.FIT().getSymbol().getLine();
        String fitValue = ctx.getChild(2).getText();
        FitValue fitValueEnum = FitValue.valueOf(fitValue);
        return new FitProperty(fitValueEnum, String.valueOf(lineNumber));
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
        int lineNumber = ctx.TITLE().getSymbol().getLine();

        String buttonTitle = ctx.getChild(2).getText();
        return new TitleProperty(buttonTitle, String.valueOf(lineNumber));
    }

    @Override
    public Property visitButtonBackgroundColor(DartParser.ButtonBackgroundColorContext ctx) {
        int lineNumber = ctx.BACKGROUND_COLOR().getSymbol().getLine();

        String buttonBackgroundColor = ctx.getChild(2).getText();
        return new BackgroundColorProperty(buttonBackgroundColor, String.valueOf(lineNumber));
    }

    @Override
    public Property visitButtonTitleColor(DartParser.ButtonTitleColorContext ctx) {
        int lineNumber = ctx.TITLE_COLOR().getSymbol().getLine();

        String buttonTitleColor = ctx.getChild(2).getText();
        return new TitleColorProperty(buttonTitleColor, String.valueOf(lineNumber));
    }

    @Override
    public Property visitGestureDetectorOnPressed(DartParser.GestureDetectorOnPressedContext ctx) {
        return visit(ctx.onPressedProperty());
    }

    @Override
    public Property visitButtonOnPressed(DartParser.ButtonOnPressedContext ctx) {
        return visit(ctx.onPressedProperty());
    }

    @Override
    public Property visitTextFieldValue(DartParser.TextFieldValueContext ctx) {
        int lineNumber = ctx.VALUE().getSymbol().getLine();

        String textFieldValue = ctx.getChild(2).getText();
        return new ValueProperty(textFieldValue, String.valueOf(lineNumber));
    }

    @Override
    public Property visitTextFieldLabel(DartParser.TextFieldLabelContext ctx) {
        int lineNumber = ctx.LABEL().getSymbol().getLine();

        String textFieldLabel = ctx.getChild(2).getText();
        return new LabelProperty(textFieldLabel, String.valueOf(lineNumber));
    }

    @Override
    public Property visitTextFieldTextColor(DartParser.TextFieldTextColorContext ctx) {
        int lineNumber = ctx.TEXTCOLOR().getSymbol().getLine();
        String textFieldTextColor = ctx.getChild(2).getText();
        return new TextColorProperty(textFieldTextColor, String.valueOf(lineNumber));
    }

    @Override
    public Property visitTextFieldPadding(DartParser.TextFieldPaddingContext ctx) {
        int lineNumber = ctx.PADDINGATTR().getSymbol().getLine();

        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);

        return new PaddingAttributeProperty(antlrToWidget.visit(ctx.edgeInsets()), String.valueOf(lineNumber));
    }

    @Override
    public Property visitTextFieldHint(DartParser.TextFieldHintContext ctx) {
        int lineNumber = ctx.HINT().getSymbol().getLine();

        String textFieldHint = ctx.getChild(2).getText();
        return new HintProperty(textFieldHint, String.valueOf(lineNumber));
    }

    @Override
    public Property visitTextFieldBorder(DartParser.TextFieldBorderContext ctx) {
        int lineNumber = ctx.BORDERATRI().getSymbol().getLine();

        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);

        return new BorderProperty(antlrToWidget.visit(ctx.border()), String.valueOf(lineNumber));
    }

    @Override
    public Property visitTextFieldOnChanged(DartParser.TextFieldOnChangedContext ctx) {
        int lineNumber = ctx.ONCHANGED().getSymbol().getLine();
        AntlrToStatement antlrToStatement = factory.createAntlrToStatement(semanticError);

        // Function value
        Function anonymousFunction;

        List<Statement> functionBody = new ArrayList<>();
        List<String> functionArguments = new ArrayList<>();

        // parse list of arguments
        for (TerminalNode terminalNode : ctx.IDENTIFIER()) {
            functionArguments.add(terminalNode.getSymbol().getText());
        }

        // parse list of statements
        for (DartParser.StatmentContext statementContext : ctx.statment()) {
            functionBody.add(antlrToStatement.visit(statementContext));
        }

        anonymousFunction = new Function(functionBody, functionArguments);

        return new OnChangedProperty(anonymousFunction, String.valueOf(lineNumber));
    }

    @Override
    public Property visitBorderThickness(DartParser.BorderThicknessContext ctx) {
        int lineNumber = ctx.THICKNESS().getSymbol().getLine();

        String borderThickness = ctx.getChild(2).getText();
        return new ThicknessProperty(Integer.parseInt(borderThickness), String.valueOf(lineNumber));
    }

    @Override
    public Property visitBorderBorderRadius(DartParser.BorderBorderRadiusContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Property visitBorderColor(DartParser.BorderColorContext ctx) {
        return visit(ctx.colorProperty());
    }

    @Override
    public Property visitWidthProperty(DartParser.WidthPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = String.valueOf(ctx.WIDTH().getSymbol().getLine());
        //value from variable
        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //search for the var in the st
            Symbol symbol = instance.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, ctx.IDENTIFIER().getSymbol().getText()));
                return new WidthProperty(-1.0d,lnNumber);
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int intValue = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new HeightProperty(intValue, lnNumber);
            } else if (type.equals("double")) {
                double doubleValue = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new HeightProperty(doubleValue, lnNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1,
                        "double,int", type));
                return new WidthProperty(-1.0d,lnNumber);
            }
        }
        return new WidthProperty(Double.parseDouble(value), lnNumber);
    }

    @Override
    public Property visitHeightProperty(DartParser.HeightPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = String.valueOf(ctx.HEIGHT().getSymbol().getLine());

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //search for the var in the st
            Symbol symbol = instance.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, ctx.IDENTIFIER().getSymbol().getText()));
                return new HeightProperty(-1.0d,lnNumber);
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int intValue = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new HeightProperty(intValue, lnNumber);
            } else if (type.equals("double")) {
                double doubleValue = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new HeightProperty(doubleValue, lnNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1,
                        "double,int", type));
                return new HeightProperty(-1.0d,lnNumber);
            }
        }

        return new HeightProperty(Double.parseDouble(value), lnNumber);
    }

    @Override
    public Property visitColorProperty(DartParser.ColorPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = String.valueOf(ctx.COLOR().getSymbol().getLine());
        return new ColorProperty(value, lnNumber);
    }

    @Override
    public Property visitChildProperty(DartParser.ChildPropertyContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);
        Widget child = antlrToWidget.visit(ctx.getChild(2));
        String lnNumber = String.valueOf(ctx.CHILD().getSymbol().getLine());
        return new ChildWidgetProperty(child, lnNumber);
    }

    @Override
    public Property visitChildrenProperty(DartParser.ChildrenPropertyContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);
        List<Widget> widgets = new ArrayList<>();
        String lnNumber = String.valueOf(ctx.CHILDREN().getSymbol().getLine());
        for (DartParser.WidgetContext wc : ctx.widget()) {
            widgets.add(antlrToWidget.visit(wc));
        }
        return new Children(widgets, lnNumber);
    }

    @Override
    public Property visitMainAxisSizeProperty(DartParser.MainAxisSizePropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = String.valueOf(ctx.MAINAXISSIZE().getSymbol().getLine());
        return new MainAxisSizeObjectProperty(MainAxisSizeValue.valueOf(value), lnNumber);
    }

    @Override
    public Property visitCrossAxisAlignmentProperty(DartParser.CrossAxisAlignmentPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = String.valueOf(ctx.CROSSAXISALIGNMENT().getSymbol().getLine());
        return new CrossAxisAlignmentProperty(CrossAxisAlignmentValue.valueOf(value), lnNumber);
    }

    @Override
    public Property visitOnPressedProperty(DartParser.OnPressedPropertyContext ctx) {
        int lineNumber = ctx.ONPRESSED().getSymbol().getLine();

        AntlrToStatement antlrToStatement = factory.createAntlrToStatement(semanticError);

        // Function value
        Function anonymousFunction;

        List<Statement> functionBody = new ArrayList<>();
        List<String> functionArguments = new ArrayList<>();

        // parse list of arguments
        for (TerminalNode terminalNode : ctx.IDENTIFIER()) {
            functionArguments.add(terminalNode.getSymbol().getText());
        }

        // parse list of statements
        for (DartParser.StatmentContext statementContext : ctx.statment()) {
            functionBody.add(antlrToStatement.visit(statementContext));
        }

        anonymousFunction = new Function(functionBody, functionArguments);

        return new OnPressedProperty(anonymousFunction, String.valueOf(lineNumber));
    }
}
