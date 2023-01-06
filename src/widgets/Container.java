package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Container extends Widget {
    public Container(List<Property> properties, String lnNumber) {
        super("Container", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
      return  visitor.visit(this);
    }
}
