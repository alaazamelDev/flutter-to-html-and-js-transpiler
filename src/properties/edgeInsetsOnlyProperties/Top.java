package properties.edgeInsetsOnlyProperties;

import properties.Property;
import visitors.Visitor;

public class Top extends Property {
    private final double value;


    public Top(double value, String lnNumber) {
        super("top", lnNumber);
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
