package properties;

public class OnPressedObjectProperty extends Property {
    private final Object value;

    protected OnPressedObjectProperty(Object value) {
        super("onPressed");
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
