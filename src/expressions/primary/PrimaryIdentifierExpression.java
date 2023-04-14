package expressions.primary;

import visitors.Visitor;

public class PrimaryIdentifierExpression extends PrimaryExpression {
    private final String identifier;

    public PrimaryIdentifierExpression(String identifier, String lnNumber) {
        super(lnNumber);
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}