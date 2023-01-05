package properties;

import enums.ContentAlignmentValue;
import visitors.Visitor;

public class ContentAlignmentObjectProperty extends Property {
    private final ContentAlignmentValue value;

    protected ContentAlignmentObjectProperty(ContentAlignmentValue value, String lnNumber) {
        super("contentAlignment", lnNumber);
        this.value = value;
    }

    public ContentAlignmentValue getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
