package statements;

import visitors.Visitor;

public class SetValueStatement extends Statement{

    private final Statement statement;
    private final String id;

    public SetValueStatement(String lnNumber, Statement statement, String id) {
        super(lnNumber);
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
