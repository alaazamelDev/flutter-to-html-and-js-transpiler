package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Center extends Widget {

    public Center(List<Property> properties, String lnNumber) {
        super("Center", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
