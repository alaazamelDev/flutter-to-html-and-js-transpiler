package properties;

import Widget.Widget;

import java.util.List;

public class Children extends Property{

    private final List<Widget> childrens;


    protected Children(List<Widget> childrens) {
        super("children");
        this.childrens = childrens;
    }

    public List<Widget> getChildrens() {
        return childrens;
    }
}
