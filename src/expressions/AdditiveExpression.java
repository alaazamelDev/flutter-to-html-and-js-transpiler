package expressions;

import enums.TokenType;
import visitors.Visitor;

import java.util.List;

public class AdditiveExpression extends Expression {
    private final List<Expression> expressions;
    private final List<TokenType> operators;

    public AdditiveExpression(List<Expression> expressions, List<TokenType> operators,String lnNumber, String value) {
        super(lnNumber, value);
        this.expressions = expressions;
        this.operators = operators;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public List<TokenType> getOperators() {
        return operators;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}