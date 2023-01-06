package properties;

import visitors.Visitor;

public class ValueProperty extends Property {

    private final String value;

    public ValueProperty(String value, String lnNumber) {
        super("value", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
