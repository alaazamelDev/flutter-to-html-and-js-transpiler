package properties.border_radius.border_radius_only;

import properties.Property;

public class TopRightProperty extends Property {
    private final double value;

    public TopRightProperty(double value, String lnNumber) {
        super("topRight", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
