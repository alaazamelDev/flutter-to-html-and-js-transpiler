package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class BorderRadiusCircular extends Widget {
    public BorderRadiusCircular(List<Property> properties, String lnNumber) {
        super("BorderRadius", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return  visitor.visit(this);
    }
}
