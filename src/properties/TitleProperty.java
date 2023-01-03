package properties;

public class TitleProperty extends Property {

    private final String value;

    public TitleProperty(String value) {
        super("title");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
