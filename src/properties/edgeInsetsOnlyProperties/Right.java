package properties.edgeInsetsOnlyProperties;

import properties.Property;
import visitors.Visitor;

public class Right extends Property {
    private final double value;

    public Right(double value, String lnNumber) {
        super("right", lnNumber);
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
