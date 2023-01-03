import statements.Statement;
import widgets.Scaffold;

import java.util.List;

public class Program {
    private final List<Statement> statements;
    private Scaffold scaffold;


    public Program(List<Statement> statements) {
        this.statements = statements;
    }


    public List<Statement> getStatements() {
        return statements;
    }


}
