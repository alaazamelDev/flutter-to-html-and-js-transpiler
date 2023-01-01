package properties;

public class TitleColor extends Property {

    private final String value;

    public TitleColor(String value) {
        super("titleColor");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
