package statements;

import visitors.Visitor;

public class GetState extends Statement{

    private final String key;

    public GetState(String lnNumber, String key) {
        super(lnNumber);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
