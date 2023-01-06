package properties;

import visitors.Visitor;

public class ThicknessProperty extends Property {

    private final int value;

    public ThicknessProperty(int value, String lnNumber) {
        super("thickness", lnNumber);
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
