package expressions;

import visitors.Visitor;

public class LiteralExpression extends Expression {

    private final Object value;
    public LiteralExpression(Object value, String lnNumber) {
        super(lnNumber);
        this.value=value;
    }

    public Object getValue(){
        return value;
    }


    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
