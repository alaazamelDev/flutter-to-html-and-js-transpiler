package program;

import statements.Statement;
import widgets.Scaffold;
import widgets.Widget;

import java.util.List;

public class Program {
    private final List<Statement> statements;
    private Widget scaffold;


    public Program(List<Statement> statements) {
        this.statements = statements;
    }


    public List<Statement> getStatements() {
        return statements;
    }

    public Widget getScaffold() {
        return scaffold;
    }

    public void setScaffold(Widget scaffold) {
        this.scaffold = scaffold;
    }
}
