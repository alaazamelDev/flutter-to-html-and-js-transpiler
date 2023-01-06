package statements;

import visitors.Visitor;

public class VariableAssignmentStatement extends Statement {
    private final String name;
    private final Object value;

    public VariableAssignmentStatement(String name, Object value, String lnNumber) {
        super(lnNumber);
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
