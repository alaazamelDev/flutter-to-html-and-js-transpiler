package statements;

import visitors.Visitor;

public class VariableDeclarationStatement extends Statement {
    private final String type;
    private final String name;

    public VariableDeclarationStatement(String type, String name, String lnNumber) {
        super(lnNumber);
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
