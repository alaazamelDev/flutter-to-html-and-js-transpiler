package properties;

public class LabelProperty extends Property {

    private final String value;

    public LabelProperty(String value, String lnNumber) {
        super("label", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
