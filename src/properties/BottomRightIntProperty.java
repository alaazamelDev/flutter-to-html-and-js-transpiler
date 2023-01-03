package properties;

public class BottomRightIntProperty extends Property {
    private final int value;

    protected BottomRightIntProperty(int value, String lnNumber) {
        super("bottomRight", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
