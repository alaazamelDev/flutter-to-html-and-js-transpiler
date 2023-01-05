package properties;

import enums.FontWeightValue;
import visitors.Visitor;

public class FontWeightObjectProperty extends Property{
    private final FontWeightValue value;
    public FontWeightObjectProperty(FontWeightValue value, String lnNumber) {
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
