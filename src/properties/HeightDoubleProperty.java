package properties;

import widgets.Widget;

public class HeightDoubleProperty extends Property {
    private final double value;

    protected HeightDoubleProperty(double value) {
        super("height");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
