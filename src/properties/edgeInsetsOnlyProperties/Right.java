package properties.edgeInsetsOnlyProperties;

import properties.Property;

public class Right extends Property {
    private final double value;

    public Right(double value, String lnNumber) {
        super("right", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
