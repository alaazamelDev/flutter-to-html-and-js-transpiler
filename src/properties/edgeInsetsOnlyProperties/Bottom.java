package properties.edgeInsetsOnlyProperties;

import properties.Property;

public class Bottom extends Property {
    private final double value;


    public Bottom(double value, String lnNumber) {
        super("bottom", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
