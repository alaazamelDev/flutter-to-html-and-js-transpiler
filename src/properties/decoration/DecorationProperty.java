package properties.decoration;

import properties.Property;
import widgets.Widget;

public class DecorationProperty extends Property {
    private final Widget widget;

    public DecorationProperty(Widget widget) {
        super("DecorationProperty");
        this.widget = widget;
    }

    public Widget getWidget() {
        return widget;
    }
}
