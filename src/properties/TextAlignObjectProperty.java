package properties;

import enums.TextAlignValue;

public class TextAlignObjectProperty extends Property {
    private final TextAlignValue value;

    public TextAlignObjectProperty(TextAlignValue value, String lnNumber) {
        super("textAlign", lnNumber);
        this.value = value;
    }

    public TextAlignValue getValue() {
        return value;
    }
}
