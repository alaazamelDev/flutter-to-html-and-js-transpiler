package properties;

public class TextContent extends Property {
    private final String value;

    public TextContent(String value, String lnNumber) {
        super("text", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
