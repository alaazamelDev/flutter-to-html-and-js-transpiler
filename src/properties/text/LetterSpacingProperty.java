package properties.text;

import properties.Property;
import visitors.Visitor;

public class LetterSpacingProperty extends Property {
    private final double value;

    public LetterSpacingProperty(double value, String lnNumber) {
        super("letterSpacing", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
