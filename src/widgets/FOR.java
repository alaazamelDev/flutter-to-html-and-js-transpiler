package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class FOR extends Widget{
    public FOR(List<Property> properties, String lnNumber) {
        super("For", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
