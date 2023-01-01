package properties;

public class LetterSpacingDoubleProperty extends Property {
    private final double value;

    protected LetterSpacingDoubleProperty(double value) {
        super("letterSpacing");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
