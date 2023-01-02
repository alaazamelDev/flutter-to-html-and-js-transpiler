package properties;

public class BottomLeftIntProperty extends Property {
    private final int value;

    protected BottomLeftIntProperty(int value) {
        super("bottomLeft");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
