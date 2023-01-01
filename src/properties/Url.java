package properties;

public class Url extends Property{

    private final String value;


    public Url(String value) {
        super("url");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
