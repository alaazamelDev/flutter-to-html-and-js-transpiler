package widgets;

import expressions.Expression;
import properties.Property;
import visitors.Visitor;

import java.util.List;

public class IF extends Widget{

    public IF(List<Property> properties, String lnNumber) {
        super("If", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
