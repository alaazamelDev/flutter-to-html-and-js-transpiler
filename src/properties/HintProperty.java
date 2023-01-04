package properties;

public class HintProperty extends Property {

    private final String value;

    public HintProperty(String value, String lnNumber) {
        super("hint", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
