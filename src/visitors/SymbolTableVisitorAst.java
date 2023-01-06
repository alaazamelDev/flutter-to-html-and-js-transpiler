package visitors;

import properties.CustomWidgetProperty;
import properties.Property;
import statements.CustomWidgetDeclarationStatement;
import statements.Statement;
import statements.VariableAssignmentStatement;
import statements.VariableDeclarationStatement;
import utils.Symbol;
import utils.SymbolTable;
import widgets.CustomWidget;

import java.util.List;

public class SymbolTableVisitorAst extends AstBaseVisitor<Void> {

    @Override
    public Void visit(CustomWidgetDeclarationStatement customWidgetDeclarationStatement) {
        SymbolTable instance = SymbolTable.getInstance();
        instance.put(customWidgetDeclarationStatement.getName(),
                new Symbol("Widget", customWidgetDeclarationStatement));

        return super.visit(customWidgetDeclarationStatement);
    }

    @Override
    public Void visit(CustomWidget customWidget) {

        // get access to the symbol table
        SymbolTable instance = SymbolTable.getInstance();


        Symbol widgetSignature = instance.get(customWidget.getIdentifier());
        if (widgetSignature == null) {
            // semantic error, widget is not declared
            return super.visit(customWidget);
        }

        CustomWidgetDeclarationStatement widgetDeclaration =
                (CustomWidgetDeclarationStatement) widgetSignature.getValue();

        // list of declared arguments
        List<Statement> argumentsDeclaration = widgetDeclaration.getVariableDeclarationStatements();

        // enter a new scope
        instance.enterScope();

        // list of passed arguments
        List<Property> properties = customWidget.getProperties();

        for (Property prop : properties) {

            String propName = prop.getName();
            argumentsDeclaration.forEach((statement) -> {
                if (statement instanceof VariableDeclarationStatement) {

                    // add the var to the symbol table
                    if (propName.equals(((VariableDeclarationStatement) statement).getName())) {
                        Symbol newEntry = new Symbol(
                                ((VariableDeclarationStatement) statement).getType(),
                                ((CustomWidgetProperty) prop).getValue()
                        );
                        instance.put(prop.getName(), newEntry);
                    } else {
                        // TODO: (semantic error) you are using an argument which is not declared.
                    }

                }
            });
        }

        instance.exitScope();

        return super.visit(customWidget);
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
