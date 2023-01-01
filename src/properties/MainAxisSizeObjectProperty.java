package properties;

public class MainAxisSizeObjectProperty extends Property {
    private final Object value;

    protected MainAxisSizeObjectProperty(Object value) {
        super("mainAxisSize");
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
