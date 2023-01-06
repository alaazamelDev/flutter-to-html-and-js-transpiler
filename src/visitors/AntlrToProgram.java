package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import program.Program;
import statements.Statement;
import widgets.Widget;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends DartParserBaseVisitor<Program> {

    private final IAntlrObjectFactory factory;

    public AntlrToProgram(IAntlrObjectFactory factory) {
        this.factory = factory;
    }
    @Override
    public Program visitProg(DartParser.ProgContext ctx) {
        AntlrToStatement antlrToStatement = factory.createAntlrToStatement();
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget();

        List<Statement> statements = new ArrayList<>();
        for (DartParser.StatmentContext sc : ctx.statment()) {
            statements.add(antlrToStatement.visit(sc));
        }

        Widget widget = antlrToWidget.visit(ctx.scaffold());

        Program program = new Program(statements);
        program.setScaffold(widget);

        return program;
    }
}
