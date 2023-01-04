package properties.border_radius.border_radius_circular;

import properties.Property;

public class RadiusProperty extends Property {
    private final double value;

    public RadiusProperty(double value, String lnNumber) {
        super("radius", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
