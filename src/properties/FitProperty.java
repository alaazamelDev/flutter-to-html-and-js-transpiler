package properties;

import enums.FitValue;
import visitors.Visitor;

public class FitProperty extends Property {

    private final FitValue value;


    public FitProperty(FitValue value, String lnNumber) {
        super("fit", lnNumber);
        this.value = value;
    }

    public FitValue getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
