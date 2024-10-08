package widgets;

import properties.Property;
import visitors.Visitable;

import java.util.List;

public abstract class Widget implements Visitable {
    private final  String identifier;
    private final List<Property> properties;

    private final String lnNumber;

    public Widget(String identifier, List<Property> properties, String lnNumber) {
        this.identifier = identifier;
        this.properties = properties;
        this.lnNumber = lnNumber;
    }
    public String getIdentifier() {
        return identifier;
    }
    public List<Property> getProperties() {
        return properties;
    }

    public String getLnNumber() {
        return lnNumber;
    }
}
