package properties.border_radius;

import properties.Property;

public class BorderRadiusOnlyTopRightProperty extends Property {
    private final double value;

    public BorderRadiusOnlyTopRightProperty(double value) {
        super("BorderRadiusOnlyTopRight");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
