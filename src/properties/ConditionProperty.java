package properties;

import expressions.Expression;
import visitors.Visitor;

public class ConditionProperty extends Property {

    private final Expression expression;

    public ConditionProperty(String lnNumber, Expression expression) {
        super("condition", lnNumber);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
