package properties;

public class WidthProperty extends Property {
    private final double value;

    protected WidthProperty(double value) {
        super("width");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
