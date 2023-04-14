package expressions;

import enums.TokenType;
import visitors.Visitor;

public class EqualityExpression extends Expression {
    private final Expression left;
    private final Expression right;
    private final TokenType operatorType;

    public EqualityExpression(Expression left, Expression right, TokenType operatorType, String lnNumber) {
        super(lnNumber);
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