package properties;

import visitors.Visitor;

public class LetterSpacingDoubleProperty extends Property {
    private final double value;

    public LetterSpacingDoubleProperty(double value, String lnNumber) {
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
