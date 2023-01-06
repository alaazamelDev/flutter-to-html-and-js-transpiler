package properties;

import properties.Property;
import visitors.Visitor;

public class ColorProperty extends Property {
    private final String value;

    public ColorProperty(String value, String lnNumber) {
        super("color", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
