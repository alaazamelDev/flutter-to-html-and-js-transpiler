package properties.edgeInsetsSymetricProperties;

import properties.Property;

public class Vertical extends Property {

    private final double value;


    public Vertical(double value) {
        super("vertical");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
