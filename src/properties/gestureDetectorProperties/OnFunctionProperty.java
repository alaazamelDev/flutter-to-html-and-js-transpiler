package properties.gestureDetectorProperties;

import properties.Property;

public class OnFunctionProperty extends Property {
    private final Object value;

    public OnFunctionProperty(Object value) {
        super("onPressed");
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
