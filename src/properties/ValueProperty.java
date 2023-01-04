package properties;

public class ValueProperty extends Property {

    private final String value;

    public ValueProperty(String value, String lnNumber) {
        super("value", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
