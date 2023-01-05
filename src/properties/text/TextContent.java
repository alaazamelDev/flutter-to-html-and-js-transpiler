package properties.text;

import properties.Property;
import visitors.Visitor;

public class TextContent extends Property {
    private final String value;

    public TextContent(String value, String lnNumber) {
        super("text", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
