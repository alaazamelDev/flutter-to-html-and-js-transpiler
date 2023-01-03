package properties;

public class CenterTitleProperty extends Property {

    private final boolean value;

    public CenterTitleProperty(boolean value) {
        super("centerTitle");
        this.value = value;
    }

    public boolean getValue() {
        return this.value;
    }
}
