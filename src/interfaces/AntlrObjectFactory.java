package interfaces;

import visitors.AntlrToProperty;
import visitors.AntlrToStatement;
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

    @Override
    public AntlrToStatement createAntlrToStatement() {
        return new AntlrToStatement(this);
    }
}
