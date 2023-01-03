package properties.gestureDetectorProperties;

import properties.Property;

public class OnFunctionProperty extends Property {
    private final Object value;

    public OnFunctionProperty(Object value, String lnNumber) {
        super("onPressed", lnNumber);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
