package expressions.primary;

import visitors.Visitor;

public class PrimaryLiteralExpression extends PrimaryExpression {
    private final Object value;

    public PrimaryLiteralExpression(Object value,String lnNumber) {
        super(lnNumber);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}