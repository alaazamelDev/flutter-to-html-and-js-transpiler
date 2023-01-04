package properties;

public class FontSizeDoubleProperty extends Property {
    private final double value;

    public FontSizeDoubleProperty(double value, String lnNumber) {
        super("fontSize", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
