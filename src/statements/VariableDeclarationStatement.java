package statements;

public class VariableDeclarationStatement extends Statement {
    private final String type;
    private final String name;
    private final Object value;

    public VariableDeclarationStatement(String type, String name, Object value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
