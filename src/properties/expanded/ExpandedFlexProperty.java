package properties.expanded;

import properties.Property;

public class ExpandedFlexProperty extends Property {
    private final int value;

    public ExpandedFlexProperty(int value, String lnNumber) {
        super("ExpandedFlexProperty", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
