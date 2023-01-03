package properties.gestureDetectorProperties;

import properties.Property;

public class OnPressedProperty extends Property {
    private final Object value;

    public OnPressedProperty(Object value) {
        super("onPressed");
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
