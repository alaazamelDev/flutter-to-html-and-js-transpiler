package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class GestureDetector extends Widget {
    public GestureDetector(List<Property> properties, String lnNumber) {
        super("GestureDetector", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
