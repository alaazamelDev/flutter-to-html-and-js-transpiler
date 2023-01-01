package properties;

public class WidthDoubleProperty extends Property {
    private final double value;

    protected WidthDoubleProperty(double value) {
        super("width");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
