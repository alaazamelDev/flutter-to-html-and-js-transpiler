package properties;

import visitors.Visitor;

public class TopLeftIntProperty extends Property {
    private final int value;

    protected TopLeftIntProperty(int value, String lnNumber) {
        super("topLeft", lnNumber);
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
