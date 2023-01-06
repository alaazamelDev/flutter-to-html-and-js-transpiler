package properties;

import visitors.Visitor;

public class TitleColorProperty extends Property {

    private final String value;

    public TitleColorProperty(String value, String lnNumber) {
        super("titleColor", lnNumber);
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
