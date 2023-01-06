package properties.text;

import properties.Property;
import visitors.Visitor;

public class FontSizeProperty extends Property {
    private final double value;

    public FontSizeProperty(double value, String lnNumber) {
        super("fontSize", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
