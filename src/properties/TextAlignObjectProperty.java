package properties;

import enums.TextAlignValue;

public class TextAlignObjectProperty extends Property {
    private final TextAlignValue value;

    protected TextAlignObjectProperty(TextAlignValue value) {
        super("textAlign");
        this.value = value;
    }

    public TextAlignValue getValue() {
        return value;
    }
}
