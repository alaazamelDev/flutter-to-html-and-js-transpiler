package properties;

public class Color extends Property {
    private final String value;

    public Color(String value, String lnNumber) {
        super("color", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
