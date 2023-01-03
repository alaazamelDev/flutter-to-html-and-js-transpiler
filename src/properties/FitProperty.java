package properties;

import enums.FitValue;

public class FitProperty extends Property {

    private final FitValue value;


    public FitProperty(FitValue value) {
        super("fit");
        this.value = value;
    }

    public FitValue getValue() {
        return value;
    }
}
