package properties;

public class TextAlignObjectProperty extends Property {
    private final Object value;

    protected TextAlignObjectProperty(Object value) {
        super("textAlign");
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
