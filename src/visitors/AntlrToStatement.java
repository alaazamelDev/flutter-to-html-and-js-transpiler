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
import widgets.Widget;

import java.util.ArrayList;
import java.util.List;

public class AntlrToStatement extends DartParserBaseVisitor<Statement> {

    private final IAntlrObjectFactory factory;

    public AntlrToStatement(IAntlrObjectFactory factory) {
        this.factory = factory;
    }

    @Override
    public Statement visitCustomWidgetDeclaration(DartParser.CustomWidgetDeclarationContext ctx) {
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget();

        String name = ctx.WIDGETNAME().getText();

        String lnNumber = String.valueOf(ctx.WIDGET().getSymbol().getLine());

        List<Statement> vars = new ArrayList<>();

        for (DartParser.VariableDeclarationContext vd : ctx.variableDeclaration()) {
            vars.add(visit(vd));
        }
        System.out.println("inside antlr");

        Widget widget = antlrToWidget.visit(ctx.widget());

        return new CustomWidgetDeclarationStatement(name, vars, widget, lnNumber);
    }


    @Override
    public Statement visitStatment(DartParser.StatmentContext ctx){

        return visit(ctx.getChild(0));
    }
    @Override
    public Statement visitFunctionVariableDeclaration(DartParser.FunctionVariableDeclarationContext ctx) {
        int lineNumber = ctx.FUNCTION().getSymbol().getLine();

        String type = ctx.getChild(2).getText();
        String identifier = ctx.IDENTIFIER().getSymbol().getText();

        return new VariableDeclarationStatement(type,identifier,String.valueOf(lineNumber));
    }

    @Override
    public Statement visitNonFunctionVariableDeclaration(DartParser.NonFunctionVariableDeclarationContext ctx) {
        int lineNumber = ctx.IDENTIFIER().getSymbol().getLine();

        String type = ctx.getChild(0).getText();
        String identifier = ctx.getChild(1).getText();

        return new VariableDeclarationStatement(type,identifier,String.valueOf(lineNumber));
    }

    @Override
    public Statement visitVariableAssignment(DartParser.VariableAssignmentContext ctx) {
        int lineNumber = ctx.IDENTIFIER().getSymbol().getLine();

        String identifier = ctx.getChild(0).getText();

        Object variableValue = new Object();

        ParseTree child = ctx.getChild(2);
        if (child instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) child;
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
        return new VariableAssignmentStatement(identifier , variableValue, String.valueOf(lineNumber));
    }
}
