package properties;

public class TitleProperty extends Property {

    private final String value;

    public TitleProperty(String value, String lnNumber) {
        super("title", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
