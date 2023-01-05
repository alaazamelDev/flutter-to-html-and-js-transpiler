package statements;

import visitors.Visitable;

public abstract class Statement implements Visitable {
    private final String lnNumber;

    public Statement(String lnNumber) {
        this.lnNumber = lnNumber;
    }

    public String getLnNumber() {
        return lnNumber;
    }
}
