package properties.gestureDetectorProperties;

import properties.Property;

public class OnPressedProperty extends Property {
    private final Object value;

    public OnPressedProperty(Object value, String lnNumber) {
        super("onPressed", lnNumber);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
