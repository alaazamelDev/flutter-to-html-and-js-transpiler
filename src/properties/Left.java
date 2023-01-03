package properties;

public class Left extends Property{
    private final double value;

    public Left(double value) {
        super("left");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
