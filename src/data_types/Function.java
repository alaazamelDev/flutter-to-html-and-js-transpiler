package data_types;

import statements.Statement;

import java.util.List;

public class Function {

    private final List<Statement> statements;
    private final List<String> identifiers;

    public Function(List<Statement> statements, List<String> identifiers) {
        this.statements = statements;
        this.identifiers = identifiers;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }
}
