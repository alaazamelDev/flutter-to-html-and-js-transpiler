package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Padding extends Widget {
    public Padding(List<Property> properties, String lnNumber) {
        super("Padding", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
