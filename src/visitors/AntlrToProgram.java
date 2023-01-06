package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import program.Program;
import statements.CustomWidgetDeclarationStatement;
import statements.Statement;
import statements.VariableDeclarationStatement;
import utils.UTIL;

import widgets.Widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AntlrToProgram extends DartParserBaseVisitor<Program> {

    private final IAntlrObjectFactory factory;
    private List<String> semanticError;

    public AntlrToProgram(IAntlrObjectFactory factory) {
        this.factory = factory;
        semanticError = new ArrayList<>();
    }

    @Override
    public Program visitProg(DartParser.ProgContext ctx) {
        AntlrToStatement antlrToStatement = factory.createAntlrToStatement(semanticError);
        AntlrToWidget antlrToWidget = factory.createAntlrToWidget(semanticError);

        Set<String> varIds = new HashSet<>();

        List<Statement> statements = new ArrayList<>();
        for (DartParser.StatmentContext sc : ctx.statment()) {
            Statement statement = antlrToStatement.visit(sc);
            statements.add(statement);

            String varId = null;
            if (statement instanceof VariableDeclarationStatement) {
                varId = ((VariableDeclarationStatement) statement).getName();
            } else if (statement instanceof CustomWidgetDeclarationStatement) {
                varId = ((CustomWidgetDeclarationStatement) statement).getName();
            }

            if (varIds.contains(varId))
                semanticError.add(UTIL.semanticAlreadyDeclaredIdentifier(sc.getStart().getLine(), sc.getStart().getCharPositionInLine() + 1, varId));
            else varIds.add(varId);
        }



        Program program = new Program(statements);
        if(ctx.scaffold()!=null) {
            Widget widget = antlrToWidget.visit(ctx.scaffold());
            program.setScaffold(widget);
        }

        return program;
    }

    public List<String> getSemanticError() {
        return semanticError;
    }
}
