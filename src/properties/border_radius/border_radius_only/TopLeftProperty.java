package properties.border_radius.border_radius_only;

import properties.Property;
import visitors.Visitor;

public class TopLeftProperty extends Property {
    private final double value;

    public TopLeftProperty(double value, String lnNumber) {
        super("topLeft", lnNumber);
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
