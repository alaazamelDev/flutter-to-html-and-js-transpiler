package properties;

import data_types.Function;

public class OnPressedProperty extends Property {
    private final Function value;

    public OnPressedProperty(Function value, String lnNumber) {
        super("onPressed", lnNumber);
        this.value = value;
    }

    public Function getValue() {
        return value;
    }
}
