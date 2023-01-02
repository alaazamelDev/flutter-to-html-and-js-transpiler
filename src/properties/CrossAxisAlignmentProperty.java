package properties;

import enums.CrossAxisAlignmentValue;

public class CrossAxisAlignmentProperty extends Property {
    private final CrossAxisAlignmentValue value;


    public CrossAxisAlignmentProperty(CrossAxisAlignmentValue value) {
        super("crossAxisAlignment");
        this.value = value;
    }

    public CrossAxisAlignmentValue getValue() {
        return value;
    }
}
