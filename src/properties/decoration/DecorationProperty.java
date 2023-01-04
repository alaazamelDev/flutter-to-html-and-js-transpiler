package properties.decoration;

import properties.Property;
import widgets.Widget;

public class DecorationProperty extends Property {
    private final Widget widget;

    public DecorationProperty(Widget widget, String lnNumber) {
        super("DecorationProperty", lnNumber);
        this.widget = widget;
    }

    public Widget getWidget() {
        return widget;
    }
}
