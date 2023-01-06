package properties;

import visitors.Visitor;

public class UrlProperty extends Property{

    private final String value;


    public UrlProperty(String value, String lnNumber) {
        super("url", lnNumber);
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
