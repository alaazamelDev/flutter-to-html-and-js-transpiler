package properties;

import visitors.Visitor;

public class ScaffoldName extends Property{
    private final String value;

    public ScaffoldName(String lnNumber, String value) {
        super("name", lnNumber);
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
