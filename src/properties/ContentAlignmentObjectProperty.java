package properties;

import enums.ContentAlignmentValue;

public class ContentAlignmentObjectProperty extends Property {
    private final ContentAlignmentValue value;

    protected ContentAlignmentObjectProperty(ContentAlignmentValue value, String lnNumber) {
        super("contentAlignment", lnNumber);
        this.value = value;
    }

    public ContentAlignmentValue getValue() {
        return value;
    }
}
