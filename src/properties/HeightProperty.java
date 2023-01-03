package properties;

public class HeightProperty extends Property {
    private final double value;

    public HeightProperty(double value, String lnNumber) {
        super("height", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
