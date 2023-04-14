package expressions;

import visitors.Visitable;

public abstract class Expression implements Visitable {
    private final String lnNumber;

    public Expression(String lnNumber) {
        this.lnNumber = lnNumber;
    }

    public String getLnNumber() {
        return lnNumber;
    }
}