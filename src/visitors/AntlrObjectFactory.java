package visitors;


import interfaces.IAntlrObjectFactory;
import visitors.AntlrToProperty;
import visitors.AntlrToWidget;

public class AntlrObjectFactory implements IAntlrObjectFactory {
    @Override
    public AntlrToWidget createAntlrToWidget() {
        return new AntlrToWidget(this);
    }

    @Override
    public AntlrToProperty createAntlrToProperty() {
        return new AntlrToProperty(this);
    }
}
