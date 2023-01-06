package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class TextField extends Widget {
    public TextField( List<Property> properties, String lnNumber) {
        super("TextField", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
