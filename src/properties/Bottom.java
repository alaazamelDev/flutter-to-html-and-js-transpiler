package properties;

public class Bottom extends Property {
    private final int value;


    public Bottom(int value) {
        super("bottom");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
