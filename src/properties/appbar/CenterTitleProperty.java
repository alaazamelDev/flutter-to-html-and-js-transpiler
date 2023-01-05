package properties.appbar;

import properties.Property;
import visitors.Visitor;

public class CenterTitleProperty extends Property {

    private final boolean value;

    public CenterTitleProperty(boolean value, String lnNumber) {
        super("centerTitle", lnNumber);
        this.value = value;
    }

    public boolean getValue() {
        return this.value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
