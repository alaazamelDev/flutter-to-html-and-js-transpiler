package properties.border_radius;

import properties.Property;

public class BorderRadiusOnlyBottomRightProperty extends Property {
    private final double value;

    public BorderRadiusOnlyBottomRightProperty(double value) {
        super("BorderRadiusOnlyBottomRightProperty");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
