package properties;

public class ThicknessProperty extends Property {

    private final int value;

    public ThicknessProperty(int value) {
        super("thickness");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
