package expressions;

import visitors.Visitor;

public class LiteralExpression extends Expression {


    public LiteralExpression(String lnNumber,Object value) {
        super(lnNumber, value);
    }

    public Object getValue(){
        return value;
    }


    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
