package properties;

public class ContentAlignmentObjectProperty extends Property {
    private final Object value;

    protected ContentAlignmentObjectProperty(Object value) {
        super("contentAlignment");
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
