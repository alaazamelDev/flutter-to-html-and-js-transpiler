package properties;

public class Left extends Property{
    private final int value;

    public Left(int value) {
        super("left");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
