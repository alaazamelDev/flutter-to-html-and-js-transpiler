package properties;

import widgets.Widget;

public class BorderProperty extends Property {

    private final Widget value;

    public BorderProperty(Widget value, String lineNumber) {
        super("border", lineNumber);
        this.value = value;
    }

    public Widget getValue() {
        return value;
    }
}
