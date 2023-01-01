package properties;

public class Color extends Property {
    private final String value;

    public Color(String value) {
        super("color");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
