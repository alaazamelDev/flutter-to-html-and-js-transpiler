package properties;

import visitors.Visitor;
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

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
