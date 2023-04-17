package properties;

import visitors.Visitor;

public class IterationsProperty extends Property {

    private final int value;

    public IterationsProperty(int value, String lnNumber) {
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
