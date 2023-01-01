package properties;

public class FontWeightObjectProperty extends Property{
    private final Object value;
    protected FontWeightObjectProperty(Object value) {
        super("fontWeight");
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
