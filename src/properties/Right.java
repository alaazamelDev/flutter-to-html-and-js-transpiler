package properties;

public class Right extends Property{
    private final double value;

    public Right(double value) {
        super("right");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
