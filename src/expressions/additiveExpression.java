package expressions;

import visitors.Visitor;

public class additiveExpression extends Expression {

    private final Expression left;
    private final Expression right;

    public additiveExpression(Expression left, Expression right, String lnNumber) {
        super(lnNumber);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }


    @Override
    public <T> T accept(Visitor<T> visitor) {
        return null;
    }
}
