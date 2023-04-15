package properties;

import visitors.Visitor;

public class FromProperty extends Property{

    private final int value;

    protected FromProperty(String lnNumber, int value) {
        super("from", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
