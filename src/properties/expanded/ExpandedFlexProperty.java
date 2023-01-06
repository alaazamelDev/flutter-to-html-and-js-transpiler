package properties.expanded;

import properties.Property;
import visitors.Visitor;

public class ExpandedFlexProperty extends Property {
    private final int value;

    public ExpandedFlexProperty(int value, String lnNumber) {
        super("ExpandedFlex", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
