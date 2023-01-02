package properties;

public class TopLeftIntProperty extends Property {
    private final int value;

    protected TopLeftIntProperty(int value) {
        super("topLeft");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
