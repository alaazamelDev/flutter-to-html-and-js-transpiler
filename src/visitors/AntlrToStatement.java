package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.SetValueProperty;
import statements.*;
import widgets.Widget;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class AntlrToStatement extends DartParserBaseVisitor<Statement> {

    private final IAntlrObjectFactory factory;
    private List<String> semanticError;

    public AntlrToStatement(IAntlrObjectFactory factory, List<String> semanticError) {
        this.factory = factory;
        this.semanticError = semanticError;
    }

    @Override
    public Statement visitCustomWidgetDeclaration(DartParser.CustomWidgetDeclarationContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);

        String name = ctx.WIDGETNAME().getText();

        String lnNumber = String.valueOf(ctx.WIDGET().getSymbol().getLine());

        List<Statement> vars = new ArrayList<>();

        for (DartParser.VariableDeclarationContext vd : ctx.variableDeclaration()) {
            Statement statement = visit(vd);
            vars.add(statement);
        }

        DartParser.WidgetContext child = ctx.widget();
        Widget tree = antlrToWidget.visit(ctx.widget());

        // get access to symbol table visitor
        SymbolTableVisitorAst symbolTableVisitorAst = factory.createSymbolTableVisitor();

        CustomWidgetDeclarationStatement customWidget =
                new CustomWidgetDeclarationStatement(name, vars,tree, child, lnNumber);

        // TODO: Handle semantic errors, if error.isEmpty() -> there is no error, else the error is inside the string
        // register the widget in the symbol table
        String error = customWidget.accept(symbolTableVisitorAst);

        return customWidget;
    }


    @Override
    public Statement visitStatment(DartParser.StatmentContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Statement visitFunctionVariableDeclaration(DartParser.FunctionVariableDeclarationContext ctx) {
        int lineNumber = ctx.FUNCTION().getSymbol().getLine();

        String type = ctx.getChild(2).getText();
        String identifier = ctx.IDENTIFIER().getSymbol().getText();

        return new VariableDeclarationStatement(type, identifier, String.valueOf(lineNumber));
    }

    @Override
    public Statement visitNonFunctionVariableDeclaration(DartParser.NonFunctionVariableDeclarationContext ctx) {
        int lineNumber = ctx.IDENTIFIER().getSymbol().getLine();

        String type = ctx.getChild(0).getText();
        String identifier = ctx.getChild(1).getText();

        // get access to symbol table visitor
        SymbolTableVisitorAst symbolTableVisitorAst = factory.createSymbolTableVisitor();

        VariableDeclarationStatement varDeclaration =
                new VariableDeclarationStatement(type, identifier, String.valueOf(lineNumber));


        // register the widget in the symbol table
        String error = varDeclaration.accept(symbolTableVisitorAst);
        if (!error.isEmpty()) semanticError.add(error + " " + ctx.IDENTIFIER().getSymbol().getLine() + ":"
                + (ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1));

        return varDeclaration;
    }

    @Override
    public Statement visitVariableAssignment(DartParser.VariableAssignmentContext ctx) {
        int lineNumber = ctx.IDENTIFIER().getSymbol().getLine();

        String identifier = ctx.getChild(0).getText();

        Object variableValue = new Object();

        ParseTree child = ctx.getChild(2);
        if (child instanceof TerminalNode terminalNode) {
            Token token = terminalNode.getSymbol();
            int tokenType = token.getType();
            if (tokenType == DartParser.NUM) {
                variableValue = Integer.parseInt(token.getText());
            } else if (tokenType == DartParser.STRING) {
                variableValue = token.getText();
            } else if (tokenType == DartParser.FLOAT) {
                variableValue = Double.parseDouble(token.getText());
            }
        }

        // get access to symbol table visitor
        SymbolTableVisitorAst symbolTableVisitorAst = factory.createSymbolTableVisitor();

        VariableAssignmentStatement varAssignment =
                new VariableAssignmentStatement(identifier, variableValue, String.valueOf(lineNumber));

        // register the widget in the symbol table
        String error = varAssignment.accept(symbolTableVisitorAst);
        if (!error.isEmpty()) semanticError.add(error + " " + ctx.IDENTIFIER().getSymbol().getLine() + ":"
                + (ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1));

        return varAssignment;
    }

    @Override
    public Statement visitNavigation(DartParser.NavigationContext ctx) {

        int lineNumber = ctx.NAVIGATE_TO().getSymbol().getLine();

        // extract the destination
        String destination = ctx.STRING().getSymbol().getText();

        //? no semantic error needs to be checked here.

        return new Navigation(destination, String.valueOf(lineNumber));
    }

    @Override
    public Statement visitPopup(DartParser.PopupContext ctx) {

        int lineNumber = ctx.POP_UP().getSymbol().getLine();

        // extract the message
        String message = ctx.STRING().getSymbol().getText();

        //? no semantic error needs to be checked here.

        return new PopUp(message, String.valueOf(lineNumber));
    }

    @Override
    public Statement visitSetState(DartParser.SetStateContext ctx) {
        int lineNumber = ctx.GETXDOTSET().getSymbol().getLine();

        String key = ctx.getChild(2).getText();
        String value = "";
        boolean isString = false;

        if(ctx.STRING().size() > 1) {
            isString = true;
            value = ctx.STRING().get(1).getSymbol().getText();
        } else if (ctx.NUM() != null) {
            value = ctx.NUM().getSymbol().getText();
        } else if (ctx.itemValue() != null) {
            Statement statement = visit(ctx.itemValue());
            ItemValue itemValue = (ItemValue) statement;
            value = itemValue.getPhrase();
        }

        return new SetState(String.valueOf(lineNumber), key, value, isString);
    }

    @Override
    public Statement visitGetStateX(DartParser.GetStateXContext ctx) {
        int lineNumber = ctx.GETXDOTGET().getSymbol().getLine();

        String key = ctx.getChild(2).getText();

        return new GetState(String.valueOf(lineNumber), key);
    }

    @Override
    public Statement visitItemValue(DartParser.ItemValueContext ctx) {
        int lineNumber = ctx.ITEMVALUE().getSymbol().getLine();

        String id = ctx.STRING().getSymbol().getText();

        String phrase = "document.getElementById('" + id.replace("\"", "") + "').value";

        return new ItemValue(String.valueOf(lineNumber), id, phrase);
    }

    @Override
    public Statement visitSetValueStatement(DartParser.SetValueStatementContext ctx) {
        String lnNumber = valueOf(ctx.SETVALUE().getSymbol().getLine());

        String id = ctx.STRING().getSymbol().getText();
        Statement statement = visit(ctx.getStateX());

        return new SetValueStatement(lnNumber, statement, id);
    }
}
