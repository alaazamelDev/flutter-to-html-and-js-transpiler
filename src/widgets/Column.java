package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Column extends Widget {
    public Column(List<Property> properties, String lnNumber) {
        super("Column", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
