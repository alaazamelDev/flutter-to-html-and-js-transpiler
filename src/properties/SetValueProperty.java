package properties;

import statements.Statement;
import visitors.Visitor;

public class SetValueProperty extends Property{

    private final Statement statement;
    private final String id;

    public SetValueProperty(String lnNumber, Statement statement, String id) {
        super("setValue", lnNumber);
        this.statement = statement;
        this.id = id;
    }

    public Statement getStatement() {
        return statement;
    }

    public String getId() {
        return id;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
