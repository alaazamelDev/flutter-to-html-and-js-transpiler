package properties;

public class Top extends Property{
    private final double value;


    public Top(double value) {
        super("top");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
