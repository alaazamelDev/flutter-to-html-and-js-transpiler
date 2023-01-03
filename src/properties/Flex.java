package properties;

public class Flex extends Property{
    private final int value;


    public Flex(int value, String lnNumber) {
        super("flex", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
