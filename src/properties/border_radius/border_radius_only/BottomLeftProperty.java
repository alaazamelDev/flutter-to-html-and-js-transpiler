package properties.border_radius.border_radius_only;

import properties.Property;

public class BottomLeftProperty extends Property {
    private final double value;

    public BottomLeftProperty(double value, String lnNumber) {
        super("bottomLeft", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
