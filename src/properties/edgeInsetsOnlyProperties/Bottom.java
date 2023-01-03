package properties.edgeInsetsOnlyProperties;

import properties.Property;

public class Bottom extends Property {
    private final double value;


    public Bottom(double value) {
        super("bottom");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
