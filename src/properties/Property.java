package properties;

import visitors.Visitable;

public abstract class Property implements Visitable {
    private final String name;

    private final String lnNumber;

    protected Property(String name, String lnNumber) {
        this.name = name;
        this.lnNumber = lnNumber;
    }

    public String getName() {
        return name;
    }

    public String getLnNumber() {
        return lnNumber;
    }
}
