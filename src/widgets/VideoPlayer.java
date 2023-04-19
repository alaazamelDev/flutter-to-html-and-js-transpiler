package widgets;

import properties.Property;
import visitors.Visitor;

import java.util.List;

public class VideoPlayer extends Widget{

    public VideoPlayer(List<Property> properties, String lnNumber) {
        super("VideoPlayer", properties, lnNumber);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
