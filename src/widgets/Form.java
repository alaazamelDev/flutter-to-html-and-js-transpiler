package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Form extends Widget{

    public Form(List<Property> properties, String lnNumber) {
        super("Form", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
