package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class AppBar extends Widget {
    public AppBar(List<Property> properties, String lnNumber) {
        super("AppBar", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
