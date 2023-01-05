package properties;

import visitors.Visitor;

public class Flex extends Property{
    private final int value;


    public Flex(int value, String lnNumber) {
        super("flex", lnNumber);
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
