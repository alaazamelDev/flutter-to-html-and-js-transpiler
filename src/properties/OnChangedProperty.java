package properties;

import data_types.Function;

public class OnChangedProperty extends Property {

    private final Function value;

    public OnChangedProperty(Function value, String lineNumber) {
        super("onChanged", lineNumber);
        this.value = value;
    }

    public Function getValue() {
        return value;
    }
}
