package properties.container;

import enums.ContentAlignmentValue;
import properties.Property;
import visitors.Visitor;

public class ContainerContentAlignmentProperty extends Property {
    private final ContentAlignmentValue contentAlignmentValue;

    public ContainerContentAlignmentProperty(ContentAlignmentValue contentAlignmentValue, String lnNumber) {
        super("ContainerContentAlignment", lnNumber);
        this.contentAlignmentValue = contentAlignmentValue;
    }

    public ContentAlignmentValue getContentAlignmentValue() {
        return contentAlignmentValue;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
