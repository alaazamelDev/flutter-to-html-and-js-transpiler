package properties;

public class BottomRightIntProperty extends Property {
    private final int value;

    protected BottomRightIntProperty(int value) {
        super("bottomRight");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
