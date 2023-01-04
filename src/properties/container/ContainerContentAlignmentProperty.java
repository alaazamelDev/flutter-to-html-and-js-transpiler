package properties.container;

import enums.ContentAlignmentValue;
import properties.Property;

public class ContainerContentAlignmentProperty extends Property {
    private final ContentAlignmentValue contentAlignmentValue;

    public ContainerContentAlignmentProperty(ContentAlignmentValue contentAlignmentValue, String lnNumber) {
        super("ContainerContentAlignmentProperty", lnNumber);
        this.contentAlignmentValue = contentAlignmentValue;
    }

    public ContentAlignmentValue getContentAlignmentValue() {
        return contentAlignmentValue;
    }
}
