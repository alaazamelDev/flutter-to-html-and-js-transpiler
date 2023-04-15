package properties;

import visitors.Visitor;

public class IterationsProperty extends Property {

    private final int value;

    protected IterationsProperty(String lnNumber, int value) {
        super("iterations", lnNumber);
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
