package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import statements.CustomWidgetDeclarationStatement;
import statements.Statement;
import statements.VariableAssignmentStatement;
import statements.VariableDeclarationStatement;
import widgets.CustomWidget;
import utils.UTIL;
import widgets.Widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        Widget widget = antlrToWidget.visit(ctx.widget());

        // get access to symbol table visitor
        SymbolTableVisitorAst symbolTableVisitorAst = factory.createSymbolTableVisitor();

        CustomWidgetDeclarationStatement customWidget =
                new CustomWidgetDeclarationStatement(name, vars, widget, lnNumber);

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
        if(!error.isEmpty()) semanticError.add(error+" "+ctx.IDENTIFIER().getSymbol().getLine()+":"
        +(ctx.IDENTIFIER().getSymbol().getCharPositionInLine()+1));

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
                +(ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1));

        return varAssignment;
    }
}
