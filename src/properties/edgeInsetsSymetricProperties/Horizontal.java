package properties.edgeInsetsSymetricProperties;

import properties.Property;
import visitors.Visitor;

public class Horizontal extends Property {

    private final double value;

    public Horizontal(double value, String lnNumber) {
        super("horizontal", lnNumber);
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
