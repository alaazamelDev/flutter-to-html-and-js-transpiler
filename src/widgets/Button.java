package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Button extends Widget {
    public Button(List<Property> properties, String lnNumber) {
        super("Button", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
