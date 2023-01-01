package properties;

import widgets.Widget;

public class ChildWidgetProperty extends Property {
    private final Widget value;

    protected ChildWidgetProperty(Widget value) {
        super("child");
        this.value = value;
    }

    public Widget getValue() {
        return value;
    }
}
