package properties;

import enums.FitValue;

public class FitProperty extends Property {

    private final FitValue value;


    public FitProperty(FitValue value, String lnNumber) {
        super("fit", lnNumber);
        this.value = value;
    }

    public FitValue getValue() {
        return value;
    }
}
