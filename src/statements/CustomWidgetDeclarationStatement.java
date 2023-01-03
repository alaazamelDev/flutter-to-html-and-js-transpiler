package statements;

import widgets.Widget;

import java.util.List;

public class CustomWidgetDeclarationStatement extends Statement {
    private final String name;
    private final List<VariableDeclarationStatement> variableDeclarationStatements;
    private final Widget tree;

    public CustomWidgetDeclarationStatement(String name, List<VariableDeclarationStatement> variableDeclarationStatements, Widget tree) {
        this.name = name;
        this.variableDeclarationStatements = variableDeclarationStatements;
        this.tree = tree;
    }

    public String getName() {
        return name;
    }

    public List<VariableDeclarationStatement> getVariableDeclarationStatements() {
        return variableDeclarationStatements;
    }

    public Widget getTree() {
        return tree;
    }
}
