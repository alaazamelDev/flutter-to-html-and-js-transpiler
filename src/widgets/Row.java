package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Row extends Widget {
    public Row(List<Property> properties, String lnNumber) {
        super("Row", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
