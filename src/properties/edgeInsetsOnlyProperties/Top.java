package properties.edgeInsetsOnlyProperties;

import properties.Property;

public class Top extends Property {
    private final double value;


    public Top(double value, String lnNumber) {
        super("top", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
