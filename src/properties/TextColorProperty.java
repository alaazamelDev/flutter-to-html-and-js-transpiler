package properties;

import visitors.Visitor;

public class TextColorProperty extends Property {

    private final String value;

    public TextColorProperty(String value, String lnNumber) {
        super("textColor", lnNumber);
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
