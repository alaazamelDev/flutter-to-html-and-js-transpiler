package expressions;

import enums.TokenType;
import visitors.Visitor;

public class RelationalExpression extends Expression {
    private final Expression left;
    private final Expression right;
    private final TokenType operatorType;

    public RelationalExpression(Expression left, Expression right, TokenType operatorType, String lnNumber,Object value) {
        super(lnNumber, value);
        this.left = left;
        this.right = right;
        this.operatorType = operatorType;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public TokenType getOperatorType() {
        return operatorType;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}