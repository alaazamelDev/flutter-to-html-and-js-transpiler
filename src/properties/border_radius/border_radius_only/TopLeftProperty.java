package properties.border_radius.border_radius_only;

import properties.Property;

public class TopLeftProperty extends Property {
    private final double value;

    public TopLeftProperty(double value, String lnNumber) {
        super("topLeft", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
