package interfaces;

import visitors.*;

import java.util.List;

public interface IAntlrObjectFactory {

    AntlrToWidget createAntlrToWidget(List<String> semanticError);

    AntlrToProperty createAntlrToProperty(List<String> semanticError);

    AntlrToStatement createAntlrToStatement(List<String> semanticError);
    AntlrToExpression createAntlrToExpression(List<String> semanticError);
    SymbolTableVisitorAst createSymbolTableVisitor();
}
