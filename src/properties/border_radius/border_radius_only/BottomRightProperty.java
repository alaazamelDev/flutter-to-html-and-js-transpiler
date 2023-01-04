package properties.border_radius.border_radius_only;

import properties.Property;

public class BottomRightProperty extends Property {
    private final double value;

    public BottomRightProperty(double value, String lnNumber) {
        super("bottomRight", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
