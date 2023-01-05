package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class EdgeInsetsOnly extends Widget {
    public EdgeInsetsOnly(List<Property> properties, String lnNumber) {
        super("EdgeInsetsOnly", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
