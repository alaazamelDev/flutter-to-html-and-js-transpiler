package properties;

import enums.FitValue;

public class Fit extends Property {

    private final FitValue value;


    public Fit(FitValue value) {
        super("fit");
        this.value = value;
    }

    public FitValue getValue() {
        return value;
    }
}
