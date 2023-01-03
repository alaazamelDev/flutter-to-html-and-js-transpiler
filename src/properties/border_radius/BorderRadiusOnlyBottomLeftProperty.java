package properties.border_radius;

import properties.Property;

public class BorderRadiusOnlyBottomLeftProperty extends Property {
    private final double value;

    public BorderRadiusOnlyBottomLeftProperty(double value, String lnNumber) {
        super("BorderRadiusOnlyBottomLeftProperty", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
