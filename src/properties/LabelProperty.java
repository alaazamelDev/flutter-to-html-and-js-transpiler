package properties;

import visitors.Visitor;

public class LabelProperty extends Property {

    private final String value;

    public LabelProperty(String value, String lnNumber) {
        super("label", lnNumber);
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
