package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class Image extends Widget {
    public Image(List<Property> properties, String lnNumber) {
        super("Image", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
