package properties.border_radius;

import properties.Property;

public class BorderRadiusCircularProperty extends Property {
    private final double value;

    public BorderRadiusCircularProperty(double value) {
        super("BorderRadiusCircularProperty");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
