package expressions;

import visitors.Visitable;

public abstract class Expression implements Visitable {
    private final String lnNumber;
    public final Object value;

    public Expression(String lnNumber, Object value) {
        this.lnNumber = lnNumber;
        this.value = value;
    }

    public String getLnNumber() {
        return lnNumber;
    }

    public Object getValue() {
        return value;
    }
}
