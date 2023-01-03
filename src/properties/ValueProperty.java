package properties;

public class ValueProperty extends Property {

    private final String value;

    public ValueProperty(String value) {
        super("value");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
