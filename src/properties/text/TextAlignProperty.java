package properties.text;

import enums.TextAlignValue;
import properties.Property;
import visitors.Visitor;

public class TextAlignProperty extends Property {
    private final TextAlignValue value;

    public TextAlignProperty(TextAlignValue value, String lnNumber) {
        super("textAlign", lnNumber);
        this.value = value;
    }

    public TextAlignValue getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
