package properties;

public class Right extends Property{
    private final int value;

    public Right(int value) {
        super("right");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
