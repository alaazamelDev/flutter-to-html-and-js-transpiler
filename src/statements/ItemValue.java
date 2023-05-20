package statements;

import visitors.Visitor;

public class ItemValue extends Statement{

    private final String id;
    private final String phrase;

    public ItemValue(String lnNumber, String id, String phrase) {
        super(lnNumber);
        this.id = id;
        this.phrase = phrase;
    }

    public String getId() {
        return id;
    }

    public String getPhrase() {
        return phrase;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
