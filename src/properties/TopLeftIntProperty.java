package properties;

public class TopLeftIntProperty extends Property {
    private final int value;

    protected TopLeftIntProperty(int value, String lnNumber) {
        super("topLeft", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
