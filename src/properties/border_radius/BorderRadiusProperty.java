package properties.border_radius;

import properties.Property;
import visitors.Visitor;
import widgets.Widget;

public class BorderRadiusProperty extends Property {
private final Widget widget;

    public BorderRadiusProperty(Widget widget, String lnNumber) {
        super("borderRadius", lnNumber);
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
