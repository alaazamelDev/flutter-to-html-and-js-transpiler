package properties;

import enums.CrossAxisAlignmentValue;
import visitors.Visitor;

public class CrossAxisAlignmentProperty extends Property {
    private final CrossAxisAlignmentValue value;


    public CrossAxisAlignmentProperty(CrossAxisAlignmentValue value, String lnNumber) {
        super("crossAxisAlignment", lnNumber);
        this.value = value;
    }

    public CrossAxisAlignmentValue getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
