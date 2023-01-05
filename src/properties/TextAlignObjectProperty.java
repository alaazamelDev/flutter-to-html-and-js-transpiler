package properties;

import enums.TextAlignValue;
import visitors.Visitor;

public class TextAlignObjectProperty extends Property {
    private final TextAlignValue value;

    public TextAlignObjectProperty(TextAlignValue value, String lnNumber) {
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
