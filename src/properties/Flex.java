package properties;

public class Flex extends Property{
    private final int value;


    public Flex(int value) {
        super("flex");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
