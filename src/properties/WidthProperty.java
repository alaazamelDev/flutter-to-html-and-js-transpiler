package properties;

import visitors.Visitor;

public class WidthProperty extends Property {
    private final double value;

    public WidthProperty(double value, String lnNumber) {
        super("width", lnNumber);
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
