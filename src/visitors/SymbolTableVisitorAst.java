package visitors;

import properties.OnChangedProperty;
import properties.OnPressedProperty;
import statements.CustomWidgetDeclarationStatement;
import statements.VariableAssignmentStatement;
import statements.VariableDeclarationStatement;

public class SymbolTableVisitorAst extends AstBaseVisitor<Void> {

    @Override
    public Void visit(OnChangedProperty onChangedProperty) {
        return super.visit(onChangedProperty);
    }

    @Override
    public Void visit(OnPressedProperty onPressedProperty) {
        return super.visit(onPressedProperty);
    }

    @Override
    public Void visit(CustomWidgetDeclarationStatement customWidgetDeclarationStatement) {
        return super.visit(customWidgetDeclarationStatement);
    }

    @Override
    public Void visit(VariableAssignmentStatement variableAssignmentStatement) {
        return super.visit(variableAssignmentStatement);
    }

    @Override
    public Void visit(VariableDeclarationStatement variableDeclarationStatement) {
        return super.visit(variableDeclarationStatement);
    }
}
