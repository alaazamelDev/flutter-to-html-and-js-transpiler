package properties;

public class TextColorProperty extends Property {

    private final String value;

    public TextColorProperty(String value, String lnNumber) {
        super("textColor", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
