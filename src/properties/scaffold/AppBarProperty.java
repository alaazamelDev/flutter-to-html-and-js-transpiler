package properties.scaffold;

import properties.Property;
import visitors.Visitor;
import widgets.Widget;

public class AppBarProperty extends Property {
    private final Widget value;

    public AppBarProperty(Widget value, String lnNumber) {
        super("appBar", lnNumber);
        this.value = value;
    }

    public Widget getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
