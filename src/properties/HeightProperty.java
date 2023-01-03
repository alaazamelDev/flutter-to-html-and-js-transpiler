package properties;

public class HeightProperty extends Property {
    private final double value;

    protected HeightProperty(double value) {
        super("height");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
