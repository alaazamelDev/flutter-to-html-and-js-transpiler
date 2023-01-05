package properties;

import visitors.Visitor;

public class TopRightIntProperty extends Property {
    private final int value;

    protected TopRightIntProperty(int value, String lnNumber) {
        super("topRight", lnNumber);
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
