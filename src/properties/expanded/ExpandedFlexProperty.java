package properties.expanded;

import properties.Property;

public class ExpandedFlexProperty extends Property {
    private final int value;

    public ExpandedFlexProperty(int value) {
        super("ExpandedFlexProperty");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
