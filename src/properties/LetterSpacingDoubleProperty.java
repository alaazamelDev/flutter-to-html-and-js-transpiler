package properties;

public class LetterSpacingDoubleProperty extends Property {
    private final double value;

    public LetterSpacingDoubleProperty(double value, String lnNumber) {
        super("letterSpacing", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
