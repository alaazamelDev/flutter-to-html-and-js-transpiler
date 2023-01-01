package properties;

public class Title extends Property {

    private final String value;

    public Title(String value) {
        super("title");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
