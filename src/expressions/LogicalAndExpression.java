package expressions;

import visitors.Visitor;

import java.util.List;

public class LogicalAndExpression extends Expression {
    private final List<Expression> expressions;

    public LogicalAndExpression(List<Expression> expressions, String lnNumber) {
        super(lnNumber);
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}