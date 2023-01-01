package properties;

public class BackgroundColor extends Property {

    private final String value;

    public BackgroundColor(String value) {
        super("backgroundColor");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
