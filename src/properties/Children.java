package properties;


import visitors.Visitor;
import widgets.Widget;

import java.util.List;

public class Children extends Property{

    private final List<Widget> children;


    public Children(List<Widget> children, String lnNumber) {
        super("children", lnNumber);
        this.children = children;
    }

    public List<Widget> getChildren() {
        return children;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
