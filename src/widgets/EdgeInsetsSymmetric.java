package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class EdgeInsetsSymmetric extends Widget {
    public EdgeInsetsSymmetric(List<Property> properties, String lnNumber) {
        super("EdgeInsetsSymmetric", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
