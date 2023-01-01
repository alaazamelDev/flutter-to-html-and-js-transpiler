package properties;

public class FontSize extends Property{
    private final int value;

    public FontSize(int value) {
        super("fontSize");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
