package properties.edgeInsetsOnlyProperties;

import properties.Property;
import visitors.Visitor;

public class Bottom extends Property {
    private final double value;


    public Bottom(double value, String lnNumber) {
        super("bottom", lnNumber);
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
