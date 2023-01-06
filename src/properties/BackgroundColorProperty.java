package properties;

import visitors.Visitor;

public class BackgroundColorProperty extends Property {

    private final String value;

    public BackgroundColorProperty(String value, String lnNumber) {
        super("backgroundColor", lnNumber);
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
