package properties;

import visitors.Visitor;

public class IdProperty extends Property{

    private final String value;

    public IdProperty(String lnNumber, String value) {
        super("id", lnNumber);
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
