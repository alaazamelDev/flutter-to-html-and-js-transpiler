package properties;

import visitors.Visitor;

public class SrcProperty extends Property{

    private final String value;

    public SrcProperty(String lnNumber, String value) {
        super("src", lnNumber);
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
