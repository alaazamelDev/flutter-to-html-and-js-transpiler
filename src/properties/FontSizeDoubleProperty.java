package properties;

public class FontSizeDoubleProperty extends Property {
    private final double value;

    protected FontSizeDoubleProperty(double value) {
        super("fontSize");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
