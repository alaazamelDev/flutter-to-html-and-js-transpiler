package properties;

import visitors.Visitor;
import widgets.Widget;

public class PaddingAttributeProperty extends Property {

    private final Widget value;

    public PaddingAttributeProperty(Widget value, String lnNumber) {
        super("padding", lnNumber);
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