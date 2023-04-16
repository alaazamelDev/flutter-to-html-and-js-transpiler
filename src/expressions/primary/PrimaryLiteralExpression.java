package expressions.primary;

import visitors.Visitor;

public class PrimaryLiteralExpression extends PrimaryExpression {

    public PrimaryLiteralExpression(String lnNumber,Object value) {
        super(lnNumber,value);
    }

    public Object getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}