package statements;

public class VariableAssignmentStatement extends Statement {
    private final String name;
    private final Object value;

    public VariableAssignmentStatement(String name, Object value) {

        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
