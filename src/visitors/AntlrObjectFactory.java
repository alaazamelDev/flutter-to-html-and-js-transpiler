package visitors;

import interfaces.IAntlrObjectFactory;

import java.util.List;

public class AntlrObjectFactory implements IAntlrObjectFactory {
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
}
