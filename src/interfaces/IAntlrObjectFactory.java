package interfaces;

import visitors.AntlrToProperty;
import visitors.AntlrToStatement;
import visitors.AntlrToWidget;

public interface IAntlrObjectFactory {

    AntlrToWidget createAntlrToWidget();

    AntlrToProperty createAntlrToProperty();

    AntlrToStatement createAntlrToStatement();
}
