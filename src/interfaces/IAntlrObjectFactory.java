package interfaces;
import visitors.AntlrToProperty;
import visitors.AntlrToWidget;

public interface IAntlrObjectFactory {

    AntlrToWidget createAntlrToWidget();

    AntlrToProperty createAntlrToProperty();
}
