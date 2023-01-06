package properties.edgeInsetsOnlyProperties;

import properties.Property;
import visitors.Visitor;

public class Left extends Property {
    private final double value;

    public Left(double value, String lnNumber) {
        super("left", lnNumber);
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
