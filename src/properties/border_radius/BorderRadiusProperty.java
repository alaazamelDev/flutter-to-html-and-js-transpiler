package properties.border_radius;

import properties.Property;
import widgets.Widget;

public class BorderRadiusProperty extends Property {
private final Widget widget;

    public BorderRadiusProperty(Widget widget, String lnNumber) {
        super("BorderRadiusProperty", lnNumber);
        this.widget = widget;
    }

    public Widget getWidget() {
        return widget;
    }
}
