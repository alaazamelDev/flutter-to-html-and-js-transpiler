package properties;

public class TitleColorProperty extends Property {

    private final String value;

    public TitleColorProperty(String value) {
        super("titleColor");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
