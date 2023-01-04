package properties;

public class CenterTitleProperty extends Property {

    private final boolean value;

    public CenterTitleProperty(boolean value, String lnNumber) {
        super("centerTitle", lnNumber);
        this.value = value;
    }

    public boolean getValue() {
        return this.value;
    }
}
