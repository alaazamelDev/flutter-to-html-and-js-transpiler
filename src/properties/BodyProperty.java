package properties;

import widgets.Widget;

public class BodyProperty extends Property {

    private final Widget value;


    public BodyProperty(Widget value, String lnNumber) {
        super("body", lnNumber);
        this.value = value;
    }

    public Widget getValue() {
        return value;
    }
}
