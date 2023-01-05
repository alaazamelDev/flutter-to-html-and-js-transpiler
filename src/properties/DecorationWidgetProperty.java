package properties;

import visitors.Visitor;
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

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
