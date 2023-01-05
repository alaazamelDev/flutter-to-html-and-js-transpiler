package properties.edgeInsetsSymetricProperties;

import properties.Property;
import visitors.Visitor;

public class Vertical extends Property {

    private final double value;


    public Vertical(double value, String lnNumber) {
        super("vertical", lnNumber);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
