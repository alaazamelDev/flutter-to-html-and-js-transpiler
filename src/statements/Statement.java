package statements;

public abstract class Statement {
    private final String lnNumber;

    public Statement(String lnNumber) {
        this.lnNumber = lnNumber;
    }

    public String getLnNumber() {
        return lnNumber;
    }
}
