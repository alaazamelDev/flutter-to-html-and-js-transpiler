package properties;

import properties.Property;

public class ColorProperty extends Property {
    private final String value;

    public ColorProperty(String value, String lnNumber) {
        super("color", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
