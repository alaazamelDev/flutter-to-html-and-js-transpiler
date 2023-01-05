package properties;

import data_types.Function;
import visitors.Visitor;

public class OnChangedProperty extends Property {

    private final Function value;

    public OnChangedProperty(Function value, String lineNumber) {
        super("onChanged", lineNumber);
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
