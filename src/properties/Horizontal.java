package properties;

public class Horizontal extends Property {

    private final double value;

    public Horizontal(double value) {
        super("horizontal");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
