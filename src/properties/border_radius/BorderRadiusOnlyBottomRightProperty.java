package properties.border_radius;

import properties.Property;

public class BorderRadiusOnlyBottomRightProperty extends Property {
    private final double value;

    public BorderRadiusOnlyBottomRightProperty(double value, String lnNumber) {
        super("BorderRadiusOnlyBottomRightProperty", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
