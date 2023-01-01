package widgets;

import properties.Property;

import java.util.List;

public  abstract class Widget {
    private final  String identifier;
    private final List<Property> properties;

    public Widget(String identifier, List<Property> properties) {
        this.identifier = identifier;
        this.properties = properties;

    }
    public String getIdentifier() {
        return identifier;
    }
    public List<Property> getProperties() {
        return properties;
    }
}
