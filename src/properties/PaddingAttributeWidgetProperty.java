package properties;

import widgets.Widget;

public class PaddingAttributeWidgetProperty extends Property {

    private final Widget value;

    public PaddingAttributeWidgetProperty(Widget value) {
        super("padding");
        this.value = value;
    }
    public Widget getValue() {
        return value;
    }
}