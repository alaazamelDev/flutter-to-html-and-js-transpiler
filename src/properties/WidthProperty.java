package properties;

public class WidthProperty extends Property {
    private final double value;

    public WidthProperty(double value, String lnNumber) {
        super("width", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
