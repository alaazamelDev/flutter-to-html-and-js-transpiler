package properties;

import widgets.Widget;

public class BodyProperty extends Property {

    private final Widget value;


    public BodyProperty(Widget value) {
        super("body");
        this.value = value;
    }

    public Widget getValue() {
        return value;
    }
}
