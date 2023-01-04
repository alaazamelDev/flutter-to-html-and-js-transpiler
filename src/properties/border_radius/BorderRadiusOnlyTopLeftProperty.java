package properties.border_radius;

import properties.Property;

public class BorderRadiusOnlyTopLeftProperty extends Property {
    private final double value;

    public BorderRadiusOnlyTopLeftProperty(double value, String lnNumber) {
        super("BorderRadiusOnlyTopLeftProperty", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
