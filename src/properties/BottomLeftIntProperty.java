package properties;

public class BottomLeftIntProperty extends Property {
    private final int value;

    protected BottomLeftIntProperty(int value, String lnNumber) {
        super("bottomLeft", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
