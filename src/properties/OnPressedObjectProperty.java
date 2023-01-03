package properties;

public class OnPressedObjectProperty extends Property {
    private final Object value;

    protected OnPressedObjectProperty(Object value, String lnNumber) {
        super("onPressed", lnNumber);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
