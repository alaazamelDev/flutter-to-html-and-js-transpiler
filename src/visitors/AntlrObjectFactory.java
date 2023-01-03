package visitors;

import interfaces.IAntlrObjectFactory;

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