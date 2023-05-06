package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class CustomWidget extends Widget {
    private final Widget child;
    public CustomWidget(String identifier,Widget child, List<Property> properties, String lnNumber) {
        super(identifier, properties, lnNumber);
        this.child=child;
    }

    public Widget getChild(){
        return child;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
