package properties;

public class Top extends Property{
    private final int value;


    public Top(int value) {
        super("top");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
