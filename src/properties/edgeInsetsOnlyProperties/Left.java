package properties.edgeInsetsOnlyProperties;

import properties.Property;

public class Left extends Property {
    private final double value;

    public Left(double value, String lnNumber) {
        super("left", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
