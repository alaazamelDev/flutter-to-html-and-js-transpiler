package properties.border_radius.border_radius_circular;

import properties.Property;
import visitors.Visitor;

public class borderRadiusCircularRadiusProperty extends Property {
    private final double value;

    public borderRadiusCircularRadiusProperty(double value, String lnNumber) {
        super("borderRadiusCircularRadius", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return  visitor.visit(this);
    }
}
