package properties;

import widgets.Widget;

public class AppBarProperty extends Property{
    private final Widget value;

    public AppBarProperty(Widget value, String lnNumber) {
        super("appBar", lnNumber);
        this.value = value;
    }

    public Widget getValue() {
        return value;
    }
}
