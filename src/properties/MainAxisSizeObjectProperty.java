package properties;

import enums.MainAxisSizeValue;

public class MainAxisSizeObjectProperty extends Property {
    private final MainAxisSizeValue value;

    public MainAxisSizeObjectProperty(MainAxisSizeValue value, String lnNumber) {
        super("mainAxisSize", lnNumber);
        this.value = value;
    }

    public MainAxisSizeValue getValue() {
        return value;
    }
}
