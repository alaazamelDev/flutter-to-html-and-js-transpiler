package expressions.primary;

import expressions.Expression;

public abstract class PrimaryExpression extends Expression {
    public PrimaryExpression(String lnNumber,Object value) {
        super(lnNumber, value);
    }
}