package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Scaffold extends Widget {
    public Scaffold(List<Property> properties, String lnNumber) {
        super("Scaffold", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
