package properties;


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
}
