package properties;

public class LetterSpacingDoubleProperty extends Property {
    private final double value;

    public LetterSpacingDoubleProperty(double value) {
        super("letterSpacing");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
