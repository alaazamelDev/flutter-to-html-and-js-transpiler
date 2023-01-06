package utils;

public class Symbol {
    private String type;
    private Object value; // NUM , STRING , FLOAT

    public Symbol(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

}
