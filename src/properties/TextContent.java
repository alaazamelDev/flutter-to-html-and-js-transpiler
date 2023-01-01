package properties;

public class TextContent extends Property {
    private final String value;

    public TextContent(String value) {
        super("text");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
