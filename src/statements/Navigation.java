package statements;

import visitors.Visitor;

public class Navigation extends Statement {

    private final String destination;

    public Navigation(String destination, String lnNumber) {
        super(lnNumber);

        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
