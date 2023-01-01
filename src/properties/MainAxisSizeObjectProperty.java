package properties;

import enums.MainAxisSizeValue;

public class MainAxisSizeObjectProperty extends Property {
    private final MainAxisSizeValue value;

    protected MainAxisSizeObjectProperty(MainAxisSizeValue value) {
        super("mainAxisSize");
        this.value = value;
    }

    public MainAxisSizeValue getValue() {
        return value;
    }
}
