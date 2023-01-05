package properties.decoration;

import properties.Property;
import visitors.Visitor;
import widgets.Widget;

public class DecorationProperty extends Property {
    private final Widget widget;

    public DecorationProperty(Widget widget, String lnNumber) {
        super("Decoration", lnNumber);
        this.widget = widget;
    }

    public Widget getWidget() {
        return widget;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
