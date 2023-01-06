package properties.border_radius.border_radius_only;

import properties.Property;
import visitors.Visitor;

public class BottomRightProperty extends Property {
    private final double value;

    public BottomRightProperty(double value, String lnNumber) {
        super("bottomRight", lnNumber);
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
