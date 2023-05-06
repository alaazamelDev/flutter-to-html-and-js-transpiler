package statements;

import antlr.DartParser;
import visitors.Visitor;
import widgets.Widget;

import java.util.List;

public class CustomWidgetDeclarationStatement extends Statement {
    private final String name;
    private final List<Statement> variableDeclarationStatements;
    private final DartParser.WidgetContext child;

    private final Widget tree;

    public CustomWidgetDeclarationStatement(String name, List<Statement> variableDeclarationStatements, Widget tree,
                                            DartParser.WidgetContext child, String lnNumber) {
        super(lnNumber);
        this.name = name;
        this.variableDeclarationStatements = variableDeclarationStatements;
        this.tree = tree;
        this.child =child;
    }

    public String getName() {
        return name;
    }

    public List<Statement> getVariableDeclarationStatements() {
        return variableDeclarationStatements;
    }

    public Widget getTree() {
        return tree;
    }

    public DartParser.WidgetContext getChild() {
        return child;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
