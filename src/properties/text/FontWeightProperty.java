package properties.text;

import enums.FontWeightValue;
import properties.Property;
import visitors.Visitor;

public class FontWeightProperty extends Property {
    private final FontWeightValue value;

    public FontWeightProperty(FontWeightValue value, String lnNumber) {
        super("fontWeight", lnNumber);
        this.value = value;
    }

    public FontWeightValue getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
