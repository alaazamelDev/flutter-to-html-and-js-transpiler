package properties;

public class TopRightIntProperty extends Property {
    private final int value;

    protected TopRightIntProperty(int value) {
        super("topRight");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
