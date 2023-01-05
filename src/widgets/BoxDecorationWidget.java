package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class BoxDecorationWidget extends Widget {
    public BoxDecorationWidget(List<Property> properties, String lnNumber) {
        super("BoxDecoration", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
