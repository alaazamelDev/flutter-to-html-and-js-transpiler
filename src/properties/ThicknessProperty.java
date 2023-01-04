package properties;

public class ThicknessProperty extends Property {

    private final int value;

    public ThicknessProperty(int value, String lnNumber) {
        super("thickness", lnNumber);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
