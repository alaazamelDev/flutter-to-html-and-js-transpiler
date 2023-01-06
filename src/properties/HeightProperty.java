package properties;

import visitors.Visitor;

public class HeightProperty extends Property {
    private final double value;

    public HeightProperty(double value, String lnNumber) {
        super("height", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
