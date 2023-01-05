package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class BorderRadiusOnly extends Widget {
    public BorderRadiusOnly(List<Property> properties, String lnNumber) {
        super("BorderRadiusOnly", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
