package properties;

import visitors.Visitor;

public class ToProperty extends Property{

    private final int value;

    protected ToProperty(String lnNumber, int value) {
        super("to", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
