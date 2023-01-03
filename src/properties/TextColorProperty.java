package properties;

public class TextColorProperty extends Property {

    private final String value;

    public TextColorProperty(String value) {
        super("textColor");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
