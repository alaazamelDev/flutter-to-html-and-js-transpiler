package program;

import expressions.Expression;
import statements.Statement;
import visitors.Visitable;
import visitors.Visitor;
import widgets.Widget;

import java.util.List;

public class Program implements Visitable {
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

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
