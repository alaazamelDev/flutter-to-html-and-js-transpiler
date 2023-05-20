package statements;

import visitors.Visitor;

public class SetState extends Statement{

    private final String key;
    private final String value;

    private final boolean isString;

    public SetState(String lnNumber, String key, String value, boolean isString) {
        super(lnNumber);
        this.key = key;
        this.value = value;
        this.isString = isString;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public boolean isString() {
        return isString;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
