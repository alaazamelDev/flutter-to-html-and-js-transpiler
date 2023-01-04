package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import statements.CustomWidgetDeclarationStatement;
import statements.Statement;
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

        List<Statement> vars = new ArrayList<>();

        for(DartParser.VariableDeclarationContext vd : ctx.variableDeclaration()) {
            vars.add(visit(vd));
        }
        Widget widget = antlrToWidget.visit(ctx.WIDGET());

        return new CustomWidgetDeclarationStatement(name, vars, widget);
    }

    @Override
    public Statement visitFunctionVariableDeclaration(DartParser.FunctionVariableDeclarationContext ctx) {
        return super.visitFunctionVariableDeclaration(ctx);
    }

    @Override
    public Statement visitNonFunctionVariableDeclaration(DartParser.NonFunctionVariableDeclarationContext ctx) {
        return super.visitNonFunctionVariableDeclaration(ctx);
    }

    @Override
    public Statement visitVariableAssignment(DartParser.VariableAssignmentContext ctx) {
        return super.visitVariableAssignment(ctx);
    }
}
