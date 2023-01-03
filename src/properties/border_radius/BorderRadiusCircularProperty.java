package properties.border_radius;

import properties.Property;

public class BorderRadiusCircularProperty extends Property {
    private final double value;

    public BorderRadiusCircularProperty(double value, String lnNumber) {
        super("BorderRadiusCircularProperty", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
