package properties;

public class BackgroundColorProperty extends Property {

    private final String value;

    public BackgroundColorProperty(String value) {
        super("backgroundColor");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
