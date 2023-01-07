package interfaces;

import visitors.AntlrToProperty;
import visitors.AntlrToStatement;
import visitors.AntlrToWidget;
import visitors.SymbolTableVisitorAst;

import java.util.List;

public interface IAntlrObjectFactory {

    AntlrToWidget createAntlrToWidget(List<String> semanticError);

    AntlrToProperty createAntlrToProperty(List<String> semanticError);

    AntlrToStatement createAntlrToStatement(List<String> semanticError);
    SymbolTableVisitorAst createSymbolTableVisitor();
}
