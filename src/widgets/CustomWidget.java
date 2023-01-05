package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class CustomWidget extends Widget {
    public CustomWidget(String identifier, List<Property> properties, String lnNumber) {
        super(identifier, properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
