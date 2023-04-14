package visitors;

import interfaces.IAntlrObjectFactory;

import java.util.List;

public class AntlrObjectFactory implements IAntlrObjectFactory {
    //TODO why not static ?
    @Override
    public AntlrToWidget createAntlrToWidget(List<String> semanticError) {
        return new AntlrToWidget(this,semanticError);
    }

    @Override
    public AntlrToProperty createAntlrToProperty(List<String> semanticError) {
        return new AntlrToProperty(this,semanticError);
    }

    @Override
    public AntlrToStatement createAntlrToStatement(List<String> semanticError) {
        return new AntlrToStatement(this,semanticError);
    }
    @Override
    public AntlrToExpression createAntlrToExpression(List<String> semanticError) {
        return new AntlrToExpression(this,semanticError);
    }

    @Override
    public SymbolTableVisitorAst createSymbolTableVisitor() {
        return new SymbolTableVisitorAst();
    }
}
