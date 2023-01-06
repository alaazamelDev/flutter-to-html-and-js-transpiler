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

import java.util.ArrayList;
import java.util.List;

public class SymbolTableVisitorAst extends AstBaseVisitor<String> {

    @Override
    public String visit(CustomWidgetDeclarationStatement customWidgetDeclarationStatement) {
        SymbolTable instance = SymbolTable.getInstance();
        instance.put(customWidgetDeclarationStatement.getName(),
                new Symbol("Widget", customWidgetDeclarationStatement));

        return "";
    }

    @Override
    public String visit(CustomWidget customWidget) {

        // get access to the symbol table
        SymbolTable instance = SymbolTable.getInstance();


        Symbol widgetSignature = instance.get(customWidget.getIdentifier());
        if (widgetSignature == null) {
            // semantic error, widget is not declared
            return customWidget.getIdentifier() + " was not declared";
        }

        CustomWidgetDeclarationStatement widgetDeclaration =
                (CustomWidgetDeclarationStatement) widgetSignature.getValue();

        // list of declared arguments
        List<Statement> argumentsDeclaration = widgetDeclaration.getVariableDeclarationStatements();

        // enter a new scope
        instance.enterScope();

        // list of passed arguments
        List<Property> properties = customWidget.getProperties();
        String error = "";

        for (Property prop : properties) {

            String propName = prop.getName();
            for (Statement statement : argumentsDeclaration) {
                if (statement instanceof VariableDeclarationStatement) {

                    // add the var to the symbol table
                    if (propName.equals(((VariableDeclarationStatement) statement).getName())) {
                        Symbol newEntry = new Symbol(
                                ((VariableDeclarationStatement) statement).getType(),
                                ((CustomWidgetProperty) prop).getValue()
                        );
                        instance.put(prop.getName(), newEntry);
                    } else {
                        if (error.isEmpty()) {
                            error += propName + " is not a property for this widget";
                        }
                        else {
                            error += " ," + prop + " is not a property for this widget";
                        }
                    }

                }
            }
        }

        instance.exitScope();

        return error;
    }

    @Override
    public String visit(VariableAssignmentStatement variableAssignmentStatement) {
        SymbolTable instance = SymbolTable.getInstance();
        if (instance.get(variableAssignmentStatement.getName()) == null) {
            return variableAssignmentStatement.getName() + " was not declared";
        } else {
            Symbol variableDeclarationSymbol = instance.get(variableAssignmentStatement.getName());
            variableDeclarationSymbol.setValue(variableAssignmentStatement.getValue());
        }
        return "";
    }

    @Override
    public String visit(VariableDeclarationStatement variableDeclarationStatement) {
        SymbolTable instance = SymbolTable.getInstance();
        if (instance.get(variableDeclarationStatement.getName()) != null) {
            return variableDeclarationStatement.getName() + " was already declared";
        } else {
            Symbol variableDeclarationSymbol = new Symbol(variableDeclarationStatement.getType(), null);
            instance.put(variableDeclarationStatement.getName(), variableDeclarationSymbol);
        }
        return "";
    }
}
