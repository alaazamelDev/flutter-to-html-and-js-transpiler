package properties;

import data_types.Function;
import visitors.Visitor;

public class OnPressedProperty extends Property {
    private final Function value;

    public OnPressedProperty(Function value, String lnNumber) {
        super("onPressed", lnNumber);
        this.value = value;
    }

    public Function getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
