package properties;

public class Vertical extends Property {

    private final double value;


    public Vertical(double value, String lnNumber) {
        super("vertical", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
