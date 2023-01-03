package properties;

import enums.FontWeightValue;

public class FontWeightObjectProperty extends Property{
    private final FontWeightValue value;
    public FontWeightObjectProperty(FontWeightValue value) {
        super("fontWeight");
        this.value = value;
    }

    public FontWeightValue getValue() {
        return value;
    }
}
