package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import statements.CustomWidgetDeclarationStatement;
import statements.Statement;
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

        List<VariableDeclarationStatement> vars = new ArrayList<>();

        for(DartParser.VariableDeclarationContext vd : ctx.variableDeclaration()) {
            vars.add((VariableDeclarationStatement) visit(vd));
        }
        Widget widget = antlrToWidget.visit(ctx.WIDGET());

        return new CustomWidgetDeclarationStatement(name, vars, widget);
    }
}
