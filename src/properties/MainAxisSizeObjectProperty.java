package properties;

import enums.MainAxisSizeValue;
import visitors.Visitor;

public class MainAxisSizeObjectProperty extends Property {
    private final MainAxisSizeValue value;

    public MainAxisSizeObjectProperty(MainAxisSizeValue value, String lnNumber) {
        super("mainAxisSize", lnNumber);
        this.value = value;
    }

    public MainAxisSizeValue getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
