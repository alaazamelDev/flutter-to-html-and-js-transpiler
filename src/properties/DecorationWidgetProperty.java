package properties;

import widgets.Widget;

public class DecorationWidgetProperty extends  Property{

    private final Widget value ;

    protected DecorationWidgetProperty( Widget value) {
        super("decoration");
        this.value = value;
    }

    public Widget getValue() {
        return value;
    }
}
