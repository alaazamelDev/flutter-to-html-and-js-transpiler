package expressions.primary;

import visitors.Visitor;

public class PrimaryIdentifierExpression extends PrimaryExpression {
    private final String identifier;

    public PrimaryIdentifierExpression(String identifier, String lnNumber,Object value) {
        super(lnNumber,value);
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