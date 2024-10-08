package properties;

import visitors.Visitor;
import widgets.Widget;

public class ChildWidgetProperty extends Property {
    private final Widget value;

    public ChildWidgetProperty(Widget value, String lnNumber) {
        super("child", lnNumber);
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
