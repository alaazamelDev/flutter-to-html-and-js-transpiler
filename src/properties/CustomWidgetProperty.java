package properties;

public class CustomWidgetProperty extends Property {
    private final Object value;

    public CustomWidgetProperty(String name, Object value) {
        super(name);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
