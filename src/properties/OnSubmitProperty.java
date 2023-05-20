package properties;

import statements.Statement;
import visitors.Visitor;

import java.util.List;

public class OnSubmitProperty extends Property{

    private final List<Statement> statements;

    public OnSubmitProperty(String lnNumber, List<Statement> statements) {
        super("onSubmit", lnNumber);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
