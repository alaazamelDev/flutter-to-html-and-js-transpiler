package statements;

import visitors.Visitor;

public class PopUp extends Statement {

    // alert content
    private final String message;

    public PopUp(String message, String lnNumber) {
        super(lnNumber);

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
