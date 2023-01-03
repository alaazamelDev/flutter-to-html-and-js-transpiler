package properties;

public class UrlProperty extends Property{

    private final String value;


    public UrlProperty(String value) {
        super("url");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
