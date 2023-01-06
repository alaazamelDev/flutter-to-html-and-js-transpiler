package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Text extends Widget {
    public Text(List<Property> properties, String lnNumber) {
        super("Text", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
