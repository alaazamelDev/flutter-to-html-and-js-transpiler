package properties;

public class LabelProperty extends Property {

    private final String value;

    public LabelProperty(String value) {
        super("label");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
