package properties;

import visitors.Visitor;
import widgets.Widget;

public class ThenProperty extends Property{

    private final Widget widget;

    protected ThenProperty(String lnNumber, Widget widget) {
        super("then", lnNumber);
        this.widget = widget;
    }

    public Widget getWidget() {
        return widget;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
