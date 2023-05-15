package visitors;


import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import data_types.Function;
import enums.*;
import expressions.Expression;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.*;
import properties.appbar.CenterTitleProperty;
import properties.appbar.TitleProperty;
import properties.border_radius.BorderRadiusProperty;
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
import properties.text.*;
import statements.Statement;
import utils.Symbol;
import utils.SymbolTable;
import utils.UTIL;
import widgets.Widget;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

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

        String lineNumber = valueOf(ctx.BODY().getSymbol().getLine());

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

        return new AppBarProperty(appBar, valueOf(lineNumber));
    }


    @Override
    public Property visitAppBarTitle(DartParser.AppBarTitleContext ctx) {

        String lineNumber = valueOf(ctx.TITLE().getSymbol().getLine());
        String content = ctx.STRING().getSymbol().getText();
        // return new TitleProperty Object
        return new TitleProperty(content, lineNumber);
    }

    @Override
    public Property visitAppBarCenterTitle(DartParser.AppBarCenterTitleContext ctx) {
        String lineNumber = valueOf(ctx.CENTERTITLE().getSymbol().getLine());
        boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getSymbol().getText().replace("\"", "").replace("'", ""));
        // return new CenterTitleProperty Object
        return new CenterTitleProperty(value, lineNumber);
    }


    @Override
    public Property visitGestureDetectorChild(DartParser.GestureDetectorChildContext ctx) {
        return visit(ctx.childProperty());
    }

    @Override
    public Property visitCustomWidgetProperties(DartParser.CustomWidgetPropertiesContext ctx) {

        String lineNumber = valueOf(ctx.IDENTIFIER().getSymbol().getLine());
        String propertyName = ctx.IDENTIFIER().getSymbol().getText();
        Object propertyValue = new Object();

        ParseTree child = ctx.getChild(2);
        if (child instanceof TerminalNode terminalNode) {
            // get access to symbol table visitor
            SymbolTableVisitorAst symbolTableVisitorAst = factory.createSymbolTableVisitor();
            SymbolTable instance = SymbolTable.getInstance();
            Symbol widgetSignature = instance.get(ctx.IDENTIFIER().toString());

            Token token = terminalNode.getSymbol();
            int tokenType = token.getType();
            if (tokenType == DartParser.NUM) {
                propertyValue = Integer.parseInt(token.getText());
                widgetSignature.setValue(propertyValue);
            } else if (tokenType == DartParser.STRING) {
                propertyValue = token.getText();
                widgetSignature.setValue(propertyValue);
            } else if (tokenType == DartParser.FLOAT) {
                propertyValue = Double.parseDouble(token.getText());
                widgetSignature.setValue(propertyValue);
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
                semanticError.add(UTIL.semanticAlreadyDeclaredIdentifier(ctx.TEXTATRIB().getSymbol().getLine(), ctx.TEXTATRIB().getSymbol().getCharPositionInLine() + 1, var));
                return new TextContent("value", lineNumber);
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("string")) {
                String value = (String) symbol.getValue();
                return new TextContent(value, lineNumber);
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.TEXTATRIB().getSymbol().getLine(), ctx.TEXTATRIB().getSymbol().getCharPositionInLine() + 1, "string", type));
                return new TextContent("value", lineNumber);
            }
        }

        String value = ctx.getChild(2).getText();
        return new TextContent(value, lineNumber);
    }

    @Override
    public Property visitTextFontWeight(DartParser.TextFontWeightContext ctx) {
        String lineNumber = valueOf(ctx.FONTWEIGHT().getSymbol().getLine());
        String value = ctx.getChild(2).getText();
        return new FontWeightProperty(FontWeightValue.valueOf(value), lineNumber);
    }

    @Override
    public Property visitTextFontSize(DartParser.TextFontSizeContext ctx) {
        String lineNumber = valueOf(ctx.FONTSIZE().getSymbol().getLine());
        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //search for the var in the st
            Symbol symbol = instance.get(var);

            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.FONTSIZE().getSymbol().getLine(), ctx.FONTSIZE().getSymbol().getCharPositionInLine() + 1, var));
                return new FontSizeProperty(1, lineNumber);
            }

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                Integer value = (Integer) symbol.getValue();
                return new FontSizeProperty(value, lineNumber);
            } else if (type.equals("double")) {
                Double value = (Double) symbol.getValue();
                return new FontSizeProperty(value, lineNumber);
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.FONTSIZE().getSymbol().getLine(), ctx.FONTSIZE().getSymbol().getCharPositionInLine() + 1, "int,double", type));
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
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.LETTERSPACING().getSymbol().getLine(), ctx.LETTERSPACING().getSymbol().getCharPositionInLine() + 1, var));
                return new LetterSpacingProperty(1, lineNumber);
            }

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                Integer value = (Integer) symbol.getValue();
                return new LetterSpacingProperty(value, lineNumber);
            } else if (type.equals("double")) {
                if (symbol.getValue() instanceof Integer) {
                    int a = (int) symbol.getValue();
                    System.out.println((double) a);
                    return new LetterSpacingProperty(a, lineNumber);
                } else if (symbol.getValue() instanceof Double value) {
                    System.out.println(value);
                    return new LetterSpacingProperty(value, lineNumber);
                }
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.LETTERSPACING().getSymbol().getLine(), ctx.LETTERSPACING().getSymbol().getCharPositionInLine() + 1, "int,double", type));
                return new LetterSpacingProperty(1, lineNumber);
            }
        }

        String value = ctx.getChild(2).getText();
        return new LetterSpacingProperty(Double.parseDouble(value), lineNumber);
    }

    @Override
    public Property visitTextTextAlign(DartParser.TextTextAlignContext ctx) {
        String lineNumber = valueOf(ctx.TEXTALIGN().getSymbol().getLine());
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

    @Override
    public Property visitBoxDecorationProperties(DartParser.BoxDecorationPropertiesContext ctx) {
        return visit(ctx.getChild(0));
    }


    @Override
    public Property visitBorderRadiusCircularRadiusProperty(DartParser.BorderRadiusCircularRadiusPropertyContext ctx) {
        String lineNumber = String.valueOf(ctx.RADIUS().getSymbol().getLine());
        if (ctx.IDENTIFIER() != null) {
            SymbolTable symbolTable = SymbolTable.getInstance();
            String var = ctx.IDENTIFIER().getText();

            Symbol symbol = symbolTable.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, var));
                return new borderRadiusCircularRadiusProperty(-1, lineNumber);
            }
            String type = symbol.getType();

            if (type.equals("int")) {
                int radius = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new borderRadiusCircularRadiusProperty(radius, lineNumber);
            } else if (type.equals("double")) {
                double radius = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new borderRadiusCircularRadiusProperty(radius, lineNumber);
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", symbol.getType()));
                return new borderRadiusCircularRadiusProperty(-1, lineNumber);
            }
        }
        double radius = Double.parseDouble(ctx.getChild(2).getText());
        return new borderRadiusCircularRadiusProperty(radius, lineNumber);
    }

    @Override
    public Property visitBorderRadiusOnlyTopRight(DartParser.BorderRadiusOnlyTopRightContext ctx) {
        String lineNumber = Integer.toString(ctx.TOPRIGHT().getSymbol().getLine());
        String columnNumber = String.valueOf(ctx.TOPRIGHT().getSymbol().getCharPositionInLine() + 1);

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            // TODO: var is not found.
            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new TopRightProperty(-1, lineNumber);
            }

            //search for the var in the st
            Symbol symbol = instance.get(var);

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(symbol.getValue().toString());
                return new TopRightProperty(value, lineNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "int", type));
                return new TopRightProperty(-1, lineNumber);
            }

        }

        return new TopRightProperty(Double.parseDouble(ctx.getChild(2).getText()), lineNumber);
    }

    @Override
    public Property visitBorderRadiusOnlyTopLeft(DartParser.BorderRadiusOnlyTopLeftContext ctx) {
        String lineNumber = Integer.toString(ctx.TOPLEFT().getSymbol().getLine());
        String columnNumber = String.valueOf(ctx.TOPLEFT().getSymbol().getCharPositionInLine() + 1);

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new TopLeftProperty(-1, lineNumber);
            }


            //search for the var in the st
            Symbol symbol = instance.get(var);

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(symbol.getValue().toString());
                return new TopLeftProperty(value, lineNumber);
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "int", type));
                return new TopLeftProperty(-1, lineNumber);
            }

        }
        return new TopLeftProperty(Double.parseDouble(ctx.getChild(2).getText()), lineNumber);
    }

    @Override
    public Property visitBorderRadiusOnlyBottomRight(DartParser.BorderRadiusOnlyBottomRightContext ctx) {
        String lineNumber = Integer.toString(ctx.BOTTOMRIGHT().getSymbol().getLine());
        String columnNumber = String.valueOf(ctx.BOTTOMRIGHT().getSymbol().getCharPositionInLine() + 1);

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new BottomRightProperty(-1, lineNumber);
            }

            //search for the var in the st
            Symbol symbol = instance.get(var);

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(symbol.getValue().toString());
                return new BottomRightProperty(value, lineNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "int", type));
                return new BottomRightProperty(-1, lineNumber);
            }

        }
        return new BottomRightProperty(Double.parseDouble(ctx.getChild(2).getText()), lineNumber);
    }

    @Override
    public Property visitBorderRadiusOnlyBottomLeft(DartParser.BorderRadiusOnlyBottomLeftContext ctx) {
        String lineNumber = Integer.toString(ctx.BOTTOMLEFT().getSymbol().getLine());
        String columnNumber = String.valueOf(ctx.BOTTOMLEFT().getSymbol().getCharPositionInLine() + 1);

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new BottomLeftProperty(-1, lineNumber);
            }

            //search for the var in the st
            Symbol symbol = instance.get(var);

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(symbol.getValue().toString());
                System.out.println(value);
                return new BottomLeftProperty(value, lineNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "int", type));
                return new BottomLeftProperty(-1, lineNumber);
            }

        }
        return new BottomLeftProperty(Double.parseDouble(ctx.getChild(2).getText()), lineNumber);
    }


    @Override
    public Property visitExpandedFlex(DartParser.ExpandedFlexContext ctx) {
        String lineNumber = Integer.toString(ctx.FLEX().getSymbol().getLine());
        String columnNumber = String.valueOf(ctx.FLEX().getSymbol().getCharPositionInLine() + 1);

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new ExpandedFlexProperty(-1, lineNumber);
            }

            //search for the var in the st
            Symbol symbol = instance.get(var);

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(symbol.getValue().toString());
                return new ExpandedFlexProperty(value, lineNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "int", type));
                return new ExpandedFlexProperty(-1, lineNumber);
            }
        }
        return new ExpandedFlexProperty(Integer.parseInt(ctx.getChild(2).getText()), lineNumber);
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
        if (ctx.IDENTIFIER() != null) {
            SymbolTable symbolTable = SymbolTable.getInstance();
            String var = ctx.IDENTIFIER().getText();

            Symbol symbol = symbolTable.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, var));
                return new Top(-1, Integer.toString(line));
            }
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new Top(value, Integer.toString(line));
            } else if (type.equals("double")) {
                double value = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new Top(value, Integer.toString(line));
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", symbol.getType()));
                return new Top(-1, Integer.toString(line));
            }
        }
        return new Top(Double.parseDouble(ctx.getChild(2).getText()), Integer.toString(line));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyLeft(DartParser.EdgeInsetsOnlyLeftContext ctx) {
        Token idToken = ctx.LEFT().getSymbol();
        int line = idToken.getLine();
        if (ctx.IDENTIFIER() != null) {
            SymbolTable symbolTable = SymbolTable.getInstance();
            String var = ctx.IDENTIFIER().getText();

            Symbol symbol = symbolTable.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, var));
                return new Left(-1, Integer.toString(line));
            }
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new Left(value, Integer.toString(line));
            } else if (type.equals("double")) {
                double value = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new Left(value, Integer.toString(line));
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", symbol.getType()));
                return new Left(-1, Integer.toString(line));
            }
        }
        return new Left(Double.parseDouble(ctx.getChild(2).getText()), Integer.toString(line));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyRight(DartParser.EdgeInsetsOnlyRightContext ctx) {
        Token idToken = ctx.RIGHT().getSymbol();
        int line = idToken.getLine();
        if (ctx.IDENTIFIER() != null) {
            SymbolTable symbolTable = SymbolTable.getInstance();
            String var = ctx.IDENTIFIER().getText();

            Symbol symbol = symbolTable.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, var));
                return new Right(-1, Integer.toString(line));
            }
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new Right(value, Integer.toString(line));
            } else if (type.equals("double")) {
                double value = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new Right(value, Integer.toString(line));
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", symbol.getType()));
                return new Right(-1, Integer.toString(line));
            }
        }
        return new Right(Double.parseDouble(ctx.getChild(2).getText()), Integer.toString(line));
    }

    //done
    @Override
    public Property visitEdgeInsetsOnlyBottom(DartParser.EdgeInsetsOnlyBottomContext ctx) {
        Token idToken = ctx.BOTTOM().getSymbol();
        int line = idToken.getLine();
        if (ctx.IDENTIFIER() != null) {
            SymbolTable symbolTable = SymbolTable.getInstance();
            String var = ctx.IDENTIFIER().getText();

            Symbol symbol = symbolTable.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, var));
                return new Bottom(-1, Integer.toString(line));
            }
            String type = symbol.getType();

            if (type.equals("int")) {
                int value = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new Bottom(value, Integer.toString(line));
            } else if (type.equals("double")) {
                double value = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new Bottom(value, Integer.toString(line));
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", symbol.getType()));
                return new Bottom(-1, Integer.toString(line));
            }
        }
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
                return new Horizontal(-1.0d, Integer.toString(line));
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
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", type));
                return new Horizontal(-1.0d, Integer.toString(line));
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
                return new Vertical(-1.0d, Integer.toString(line));
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
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", type));
                return new Vertical(-1.0d, Integer.toString(line));
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
                return new UrlProperty("", Integer.toString(line));
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("string")) {
                String stringValue = String.valueOf(symbol.getValue());
                return new UrlProperty(stringValue, Integer.toString(line));
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "string", type));
                return new UrlProperty("", Integer.toString(line));
            }
        }
        return new UrlProperty(url, Integer.toString(line));
    }

    @Override
    public Property visitImageFit(DartParser.ImageFitContext ctx) {
        int lineNumber = ctx.FIT().getSymbol().getLine();
        String fitValue = ctx.getChild(2).getText();
        FitValue fitValueEnum = FitValue.valueOf(fitValue);
        return new FitProperty(fitValueEnum, valueOf(lineNumber));
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
        if (ctx.IDENTIFIER() != null) {
            SymbolTable symbolTable = SymbolTable.getInstance();
            String var = ctx.IDENTIFIER().getText();

            Symbol symbol = symbolTable.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, var));
                return new TitleProperty("value", Integer.toString(lineNumber));
            }
            String type = symbol.getType();

            if (type.equals("string")) {
                //this line was String value = symbol.getValue().toString();
                //we should change every ".toString" to (String)statement ,like this :
                String value = (String)symbol.getValue();
                return new TitleProperty(value, String.valueOf(lineNumber));
            } else {
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "string", symbol.getType()));
                return new TitleProperty("value", Integer.toString(lineNumber));
            }
        }

        String buttonTitle = ctx.getChild(2).getText();
        return new TitleProperty(buttonTitle, valueOf(lineNumber));
    }

    @Override
    public Property visitButtonBackgroundColor(DartParser.ButtonBackgroundColorContext ctx) {
        int lineNumber = ctx.BACKGROUND_COLOR().getSymbol().getLine();

        String buttonBackgroundColor = ctx.getChild(2).getText();
        return new BackgroundColorProperty(buttonBackgroundColor, valueOf(lineNumber));
    }

    @Override
    public Property visitButtonTitleColor(DartParser.ButtonTitleColorContext ctx) {
        int lineNumber = ctx.TITLE_COLOR().getSymbol().getLine();

        String buttonTitleColor = ctx.getChild(2).getText();
        return new TitleColorProperty(buttonTitleColor, valueOf(lineNumber));
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

        String lineNumber = valueOf(ctx.VALUE().getSymbol().getLine());

        String columnNumber = String.valueOf(ctx.VALUE().getSymbol().getCharPositionInLine() + 1);

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new ValueProperty("", lineNumber);
            }
            //search for the var in the st
            Symbol symbol = instance.get(var);

            //get the type
            String type = symbol.getType();

            if (type.equals("String")) {
                String value = valueOf(symbol.getValue());
                return new ValueProperty(value, lineNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "String", type));
                return new ValueProperty("", lineNumber);
            }
        }
        String textFieldValue = ctx.getChild(2).getText();
        return new ValueProperty(textFieldValue, lineNumber);
    }

    @Override
    public Property visitTextFieldLabel(DartParser.TextFieldLabelContext ctx) {


        String lineNumber = valueOf(ctx.LABEL().getSymbol().getLine());

        String columnNumber = String.valueOf(ctx.LABEL().getSymbol().getCharPositionInLine() + 1);


        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //TODO if the symbol is null there is a semantic error, the var wasn't declared
            //search for the var in the st
            Symbol symbol = instance.get(var);

            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new LabelProperty("", lineNumber);
            }

            //get the type
            String type = symbol.getType();

            if (type.equals("String")) {
                String value = valueOf(symbol.getValue());
                return new LabelProperty(value, lineNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "String", type));
                return new LabelProperty("", lineNumber);
            }
        }

        String textFieldLabel = ctx.getChild(2).getText();
        return new LabelProperty(textFieldLabel, lineNumber);
    }

    @Override
    public Property visitTextFieldTextColor(DartParser.TextFieldTextColorContext ctx) {
        int lineNumber = ctx.TEXTCOLOR().getSymbol().getLine();
        String textFieldTextColor = ctx.getChild(2).getText();
        return new TextColorProperty(textFieldTextColor, valueOf(lineNumber));
    }

    @Override
    public Property visitTextFieldPadding(DartParser.TextFieldPaddingContext ctx) {
        int lineNumber = ctx.PADDINGATTR().getSymbol().getLine();

        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);

        return new PaddingAttributeProperty(antlrToWidget.visit(ctx.edgeInsets()), valueOf(lineNumber));
    }

    @Override
    public Property visitTextFieldHint(DartParser.TextFieldHintContext ctx) {
        String lineNumber = valueOf(ctx.HINT().getSymbol().getLine());

        String columnNumber = String.valueOf(ctx.HINT().getSymbol().getCharPositionInLine() + 1);


        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //TODO if the symbol is null there is a semantic error, the var wasn't declared
            //search for the var in the st
            Symbol symbol = instance.get(var);

            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new HintProperty("", lineNumber);
            }

            //get the type
            String type = symbol.getType();

            if (type.equals("String")) {
                String value = valueOf(symbol.getValue());
                return new HintProperty(value, lineNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "String", type));
                return new HintProperty("", lineNumber);
            }
        }

        String textFieldHint = ctx.getChild(2).getText();
        return new HintProperty(textFieldHint, lineNumber);
    }

    @Override
    public Property visitTextFieldBorder(DartParser.TextFieldBorderContext ctx) {
        int lineNumber = ctx.BORDERATRI().getSymbol().getLine();

        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);

        return new BorderProperty(antlrToWidget.visit(ctx.border()), valueOf(lineNumber));
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

        return new OnChangedProperty(anonymousFunction, valueOf(lineNumber));
    }

    @Override
    public Property visitBorderThickness(DartParser.BorderThicknessContext ctx) {

        String lineNumber = valueOf(ctx.THICKNESS().getSymbol().getLine());

        String columnNumber = String.valueOf(ctx.THICKNESS().getSymbol().getCharPositionInLine() + 1);

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            if (!instance.contains(var)) {
                //type mismatch
                semanticError.add(UTIL.semanticUndeclaredIdentifier(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), var));
                return new ThicknessProperty(-1, lineNumber);
            }

            //search for the var in the st
            Symbol symbol = instance.get(var);

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                Integer value = (Integer) symbol.getValue();
                return new ThicknessProperty(value, lineNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(Integer.parseInt(lineNumber), Integer.parseInt(columnNumber), "int", type));
                return new ThicknessProperty(-1, lineNumber);
            }
        }


        String value = ctx.getChild(2).getText();
        return new ThicknessProperty(Integer.parseInt(value), lineNumber);
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
                return new WidthProperty(-1.0d, lnNumber);
            }
            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int intValue = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new WidthProperty(intValue, lnNumber);
            } else if (type.equals("double")) {
                double doubleValue = Double.parseDouble(String.valueOf(symbol.getValue()));
                return new WidthProperty(doubleValue, lnNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", type));
                return new WidthProperty(-1.0d, lnNumber);
            }
        }
        return new WidthProperty(Double.parseDouble(value), lnNumber);
    }

    @Override
    public Property visitHeightProperty(DartParser.HeightPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = valueOf(ctx.HEIGHT().getSymbol().getLine());

        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //search for the var in the st
            Symbol symbol = instance.get(var);
            if (symbol == null) {
                semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, ctx.IDENTIFIER().getSymbol().getText()));
                return new HeightProperty(-1.0d, lnNumber);
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
                semanticError.add(UTIL.semanticTypeMismatch(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, "double,int", type));
                return new HeightProperty(-1.0d, lnNumber);
            }
        }

        return new HeightProperty(Double.parseDouble(value), lnNumber);
    }

    @Override
    public Property visitColorProperty(DartParser.ColorPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = valueOf(ctx.COLOR().getSymbol().getLine());
        return new ColorProperty(value, lnNumber);
    }

    @Override
    public Property visitChildProperty(DartParser.ChildPropertyContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);
        Widget child = antlrToWidget.visit(ctx.getChild(2));
        String lnNumber = valueOf(ctx.CHILD().getSymbol().getLine());
        return new ChildWidgetProperty(child, lnNumber);
    }

    @Override
    public Property visitChildrenProperty(DartParser.ChildrenPropertyContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);
        List<Widget> widgets = new ArrayList<>();
        String lnNumber = valueOf(ctx.CHILDREN().getSymbol().getLine());
        for (DartParser.WidgetContext wc : ctx.widget()) {
            widgets.add(antlrToWidget.visit(wc));
        }
        return new Children(widgets, lnNumber);
    }

    @Override
    public Property visitMainAxisSizeProperty(DartParser.MainAxisSizePropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = valueOf(ctx.MAINAXISSIZE().getSymbol().getLine());
        return new MainAxisSizeObjectProperty(MainAxisSizeValue.valueOf(value), lnNumber);
    }

    @Override
    public Property visitCrossAxisAlignmentProperty(DartParser.CrossAxisAlignmentPropertyContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = valueOf(ctx.CROSSAXISALIGNMENT().getSymbol().getLine());
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

        return new OnPressedProperty(anonymousFunction, valueOf(lineNumber));
    }

    @Override
    public Property visitIfCondition(DartParser.IfConditionContext ctx) {
        AntlrToExpression antlrToExpression = factory.createAntlrToExpression(semanticError);
        Expression expression = antlrToExpression.visitExpression(ctx.expression());
        String lnNumber = valueOf(ctx.CONDITION().getSymbol().getLine());
        return new ConditionProperty(lnNumber, expression);
    }

    @Override
    public Property visitIfChild(DartParser.IfChildContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);
        Widget child = antlrToWidget.visit(ctx.childProperty());
        String lnNumber = valueOf(ctx.childProperty().CHILD().getSymbol().getLine());
        return new ChildWidgetProperty(child, lnNumber);
    }

    @Override
    public Property visitForIterations(DartParser.ForIterationsContext ctx) {

        // get the attribute value
        String value = ctx.getChild(2).getText();
        String lnNumber = valueOf(ctx.ITERATIONS().getSymbol().getLine());

        // check whether it's a var or num
        if (ctx.IDENTIFIER() != null) {
            //get the symbol table
            SymbolTable instance = SymbolTable.getInstance();
            //get the var name from the parse tree
            String var = ctx.IDENTIFIER().getText();

            //search for the var in the st
            Symbol symbol = instance.get(var);

            // Check for undeclared var semantic error
            if (symbol == null) {
                // add undeclared semantic error
                semanticError.add(UTIL.semanticUndeclaredIdentifier(
                        ctx.IDENTIFIER().getSymbol().getLine(),
                        ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1,
                        ctx.IDENTIFIER().getSymbol().getText())
                );
                return new IterationsProperty(-1, lnNumber);
            }

            //get the type
            String type = symbol.getType();

            if (type.equals("int")) {
                int intValue = Integer.parseInt(String.valueOf(symbol.getValue()));
                return new HeightProperty(intValue, lnNumber);
            } else {
                //type mismatch
                semanticError.add(UTIL.semanticTypeMismatch(
                        ctx.IDENTIFIER().getSymbol().getLine(),
                        ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1,
                        "int", type)
                );
                return new IterationsProperty(-1, lnNumber);
            }
        }

        return new IterationsProperty(Integer.parseInt(value), lnNumber);
    }

    @Override
    public Property visitForChild(DartParser.ForChildContext ctx) {
        return visit(ctx.childProperty());
    }

    @Override
    public Property visitVideoPlayerSrc(DartParser.VideoPlayerSrcContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = valueOf(ctx.SRC().getSymbol().getLine());

        return new SrcProperty(lnNumber, value);
    }

    @Override
    public Property visitVideoPlayerWidth(DartParser.VideoPlayerWidthContext ctx) {
        return visit(ctx.widthProperty());
    }

    @Override
    public Property visitVideoPlayerHeight(DartParser.VideoPlayerHeightContext ctx) {
        return visit(ctx.heightProperty());
    }

    @Override
    public Property visitScaffoldName(DartParser.ScaffoldNameContext ctx) {
        String value = ctx.getChild(2).getText();
        String lnNumber = valueOf(ctx.NAME().getSymbol().getLine());

        return new ScaffoldName(lnNumber, value);
    }
}
