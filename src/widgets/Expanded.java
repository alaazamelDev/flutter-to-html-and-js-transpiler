package widgets;


import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Expanded extends Widget {
    public Expanded( List<Property> properties, String lnNumber) {
        super("Expanded", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
