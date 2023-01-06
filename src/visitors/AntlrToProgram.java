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
    private List<String> semanticError ;

    public AntlrToProgram(IAntlrObjectFactory factory) {
        this.factory = factory;
        semanticError = new ArrayList<>();
    }
    @Override
    public Program visitProg(DartParser.ProgContext ctx) {
        AntlrToStatement antlrToStatement = factory.createAntlrToStatement(semanticError);
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);

        List<Statement> statements = new ArrayList<>();
        for (DartParser.StatmentContext sc : ctx.statment()) {
            statements.add(antlrToStatement.visit(sc));
        }

        Widget widget = antlrToWidget.visit(ctx.scaffold());

        Program program = new Program(statements);
        program.setScaffold(widget);

        return program;
    }

    public List<String> getSemanticError() {
        return semanticError;
    }
}
