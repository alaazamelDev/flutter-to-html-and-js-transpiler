package properties.gestureDetectorProperties;

import properties.Property;
import statements.Statement;

import java.util.List;

public class OnFunctionProperty extends Property {

    public final List<String> identifiers;
    public final List<Statement> statements ;

    public OnFunctionProperty(List<String> identifiers,List<Statement> statements,String lnNumber) {
        super("onFunction", lnNumber);
        this.identifiers = identifiers;
        this.statements = statements;
    }

}
