package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Border extends Widget {
    public Border(List<Property> properties, String lnNumber) {
        super("Border", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
