package properties;

import widgets.Widget;

public class DecorationWidgetProperty extends  Property{

    private final Widget value ;

    protected DecorationWidgetProperty( Widget value, String lnNumber) {
        super("decoration", lnNumber);
        this.value = value;
    }

    public Widget getValue() {
        return value;
    }
}
