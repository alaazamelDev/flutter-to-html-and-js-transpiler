package properties;

public class HintProperty extends Property {

    private final String value;

    public HintProperty(String value) {
        super("hint");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
