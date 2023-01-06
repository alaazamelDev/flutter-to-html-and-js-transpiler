package interfaces;

import visitors.AntlrToProperty;
import visitors.AntlrToStatement;
import visitors.AntlrToWidget;
import visitors.SymbolTableVisitorAst;

public interface IAntlrObjectFactory {

    AntlrToWidget createAntlrToWidget();

    AntlrToProperty createAntlrToProperty();

    AntlrToStatement createAntlrToStatement();

    SymbolTableVisitorAst createSymbolTableVisitor();
}
