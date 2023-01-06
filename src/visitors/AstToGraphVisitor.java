package visitors;

import program.Program;
import properties.*;
import properties.border_radius.BorderRadiusProperty;
import properties.border_radius.border_radius_circular.RadiusProperty;
import properties.border_radius.border_radius_only.BottomLeftProperty;
import properties.border_radius.border_radius_only.BottomRightProperty;
import properties.border_radius.border_radius_only.TopLeftProperty;
import properties.border_radius.border_radius_only.TopRightProperty;
import properties.container.ContainerContentAlignmentProperty;
import properties.decoration.DecorationProperty;
import properties.edgeInsetsOnlyProperties.Bottom;
import properties.edgeInsetsOnlyProperties.Left;
import properties.edgeInsetsOnlyProperties.Right;
import properties.edgeInsetsOnlyProperties.Top;
import properties.expanded.ExpandedFlexProperty;
import properties.scaffold.AppBarProperty;
import properties.scaffold.BodyProperty;
import properties.text.TextContent;
import statements.CustomWidgetDeclarationStatement;
import statements.Statement;
import statements.VariableAssignmentStatement;
import statements.VariableDeclarationStatement;
import utils.UTIL;
import widgets.*;

import javax.swing.text.Utilities;

import java.util.List;

import static java.lang.String.valueOf;

public class AstToGraphVisitor implements Visitor<String> {

    @Override
    public String visit(Program program) {
        return null;
    }

    @Override
    public String visit(AppBar appBar) {
        return null;
    }

    @Override
    public String visit(Border border) {
        UTIL.ID++;

        String vertex = UTIL.widgetToString(UTIL.ID, border.getIdentifier(), border.getProperties().size(), border.getLnNumber());

        UTIL.g.addVertex(vertex);

        List<Property> properties = border.getProperties();

        for (Property property : properties) {
            String childVertex = property.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }

        return vertex;
    }

    @Override
    public String visit(BorderRadiusCircular borderRadiusCircular) {
        return null;
    }

    @Override
    public String visit(BorderRadiusOnly borderRadiusOnly) {
        return null;
    }

    @Override
    public String visit(BoxDecorationWidget boxDecorationWidget) {
        return null;
    }

    @Override
    public String visit(Button button) {
        UTIL.ID++;

        String vertex = UTIL.widgetToString(UTIL.ID, button.getIdentifier(), button.getProperties().size(), button.getLnNumber());

        UTIL.g.addVertex(vertex);

        List<Property> properties = button.getProperties();

        for (Property property : properties) {
            String childVertex = property.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }

        return vertex;
    }

    @Override
    public String visit(Center center) {
        return null;
    }

    @Override
    public String visit(Column column) {
        return null;
    }

    @Override
    public String visit(Container container) {
        return null;
    }

    @Override
    public String visit(CustomWidget customWidget) {
        return null;
    }

    @Override
    public String visit(EdgeInsetsOnly edgeInsetsOnly) {
        return null;
    }

    @Override
    public String visit(EdgeInsetsSymmetric edgeInsetsSymmetric) {
        return null;
    }

    @Override
    public String visit(Expanded expanded) {
        return null;
    }

    @Override
    public String visit(GestureDetector gestureDetector) {
        return null;
    }

    @Override
    public String visit(Image image) {
        return null;
    }

    @Override
    public String visit(Padding padding) {
        return null;
    }

    @Override
    public String visit(Row row) {
        return null;
    }

    @Override
    public String visit(Scaffold scaffold) {
        return null;
    }

    @Override
    public String visit(Text text) {
        return null;
    }

    @Override
    public String visit(TextField textField) {
        UTIL.ID++;

        String vertex = UTIL.widgetToString(UTIL.ID, textField.getIdentifier(), textField.getProperties().size(), textField.getLnNumber());

        UTIL.g.addVertex(vertex);

        List<Property> properties = textField.getProperties();

        for (Property property : properties) {
            String childVertex = property.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }

        return vertex;
    }

    @Override
    public String visit(BackgroundColorProperty backgroundColorProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, backgroundColorProperty.getName(), backgroundColorProperty.getValue(), 0, backgroundColorProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(BorderProperty borderProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, borderProperty.getName(), null, 1, borderProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        String childVertex = borderProperty.getValue().accept(this);

        UTIL.g.addEdge(vertex, childVertex);

        return vertex;
    }

    @Override
    public String visit(CenterTitleProperty centerTitleProperty) {
        return null;
    }

    @Override
    public String visit(Children children) {
        return null;
    }

    @Override
    public String visit(ChildWidgetProperty childWidgetProperty) {
        return null;
    }

    @Override
    public String visit(ColorProperty colorProperty) {
        return null;
    }

    @Override
    public String visit(ContentAlignmentObjectProperty contentAlignmentObjectProperty) {
        return null;
    }

    @Override
    public String visit(CrossAxisAlignmentProperty crossAxisAlignmentProperty) {
        return null;
    }

    @Override
    public String visit(CustomWidgetProperty customWidgetProperty) {
        return null;
    }

    @Override
    public String visit(DecorationWidgetProperty decorationWidgetProperty) {
        return null;
    }

    @Override
    public String visit(FitProperty fitProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, fitProperty.getName(), valueOf(fitProperty.getValue()), 0, fitProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(Flex flex) {
        return null;
    }

    @Override
    public String visit(FontSizeDoubleProperty fontSizeDoubleProperty) {
        return null;
    }

    @Override
    public String visit(FontWeightObjectProperty fontWeightObjectProperty) {
        return null;
    }

    @Override
    public String visit(HeightProperty heightProperty) {
        return null;
    }

    @Override
    public String visit(HintProperty hintProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, hintProperty.getName(), hintProperty.getValue(), 0, hintProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(Horizontal horizontal) {
        return null;
    }

    @Override
    public String visit(LabelProperty labelProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, labelProperty.getName(), labelProperty.getValue(), 0, labelProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(LetterSpacingDoubleProperty letterSpacingDoubleProperty) {
        return null;
    }

    @Override
    public String visit(MainAxisSizeObjectProperty mainAxisSizeObjectProperty) {
        return null;
    }

    @Override
    public String visit(OnChangedProperty onChangedProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, onChangedProperty.getName(), null,
                onChangedProperty.getValue().getIdentifiers().size() +
                        onChangedProperty.getValue().getStatements().size(),
                onChangedProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        for (String i : onChangedProperty.getValue().getIdentifiers()) {
            UTIL.ID++;
            String j = "ID: " + UTIL.ID + "\n" + "Identifier: " + i + "\n" + "lnNum: " + onChangedProperty.getLnNumber();
            UTIL.g.addVertex(j);
            UTIL.g.addEdge(vertex, j);
        }
        for (Statement statement : onChangedProperty.getValue().getStatements()) {
            String statementVertex = statement.accept(this);
            UTIL.g.addEdge(vertex, statementVertex);
        }

        return vertex;
    }

    @Override
    public String visit(OnPressedProperty onPressedProperty) {
        return null;
    }

    @Override
    public String visit(PaddingAttributeProperty paddingAttributeProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, paddingAttributeProperty.getName(), null, 1, paddingAttributeProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        String childVertex = paddingAttributeProperty.getValue().accept(this);

        UTIL.g.addEdge(vertex, childVertex);

        return vertex;
    }

    @Override
    public String visit(TextAlignObjectProperty textAlignObjectProperty) {
        return null;
    }

    @Override
    public String visit(TextColorProperty textColorProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, textColorProperty.getName(), textColorProperty.getValue(), 0, textColorProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(ThicknessProperty thicknessProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, thicknessProperty.getName(), valueOf(thicknessProperty.getValue()), 0, thicknessProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(TitleColorProperty titleColorProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, titleColorProperty.getName(), titleColorProperty.getValue(), 0, titleColorProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(TitleProperty titleProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, titleProperty.getName(), titleProperty.getValue(), 0, titleProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(TopLeftIntProperty topLeftIntProperty) {
        return null;
    }

    @Override
    public String visit(TopRightIntProperty topRightIntProperty) {
        return null;
    }

    @Override
    public String visit(UrlProperty urlProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, urlProperty.getName(), urlProperty.getValue(), 0, urlProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(ValueProperty valueProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, valueProperty.getName(), valueProperty.getValue(), 0, valueProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(Vertical vertical) {
        return null;
    }

    @Override
    public String visit(WidthProperty widthProperty) {
        return null;
    }

    @Override
    public String visit(RadiusProperty radiusProperty) {
        return null;
    }

    @Override
    public String visit(BottomLeftProperty bottomLeftProperty) {
        return null;
    }

    @Override
    public String visit(BottomRightProperty bottomRightProperty) {
        return null;
    }

    @Override
    public String visit(TopLeftProperty topLeftProperty) {
        return null;
    }

    @Override
    public String visit(TopRightProperty topRightProperty) {
        return null;
    }

    @Override
    public String visit(BorderRadiusProperty borderRadiusProperty) {
        return null;
    }

    @Override
    public String visit(ContainerContentAlignmentProperty containerContentAlignmentProperty) {
        return null;
    }

    @Override
    public String visit(DecorationProperty decorationProperty) {
        return null;
    }

    @Override
    public String visit(Left left) {
        return null;
    }

    @Override
    public String visit(Right right) {
        return null;
    }

    @Override
    public String visit(Bottom bottom) {
        return null;
    }

    @Override
    public String visit(Top top) {
        return null;
    }

    @Override
    public String visit(ExpandedFlexProperty expandedFlexProperty) {
        return null;
    }

    @Override
    public String visit(AppBarProperty appBarProperty) {
        return null;
    }

    @Override
    public String visit(BodyProperty bodyProperty) {
        return null;
    }

    @Override
    public String visit(TextContent textContent) {
        return null;
    }

    @Override
    public String visit(CustomWidgetDeclarationStatement customWidgetDeclarationStatement) {
        return null;
    }

    @Override
    public String visit(VariableAssignmentStatement variableAssignmentStatement) {
        UTIL.ID++;

        String vertex = UTIL.statementToString(UTIL.ID, variableAssignmentStatement.getName(), valueOf(variableAssignmentStatement.getValue()), null, variableAssignmentStatement.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(VariableDeclarationStatement variableDeclarationStatement) {
        UTIL.ID++;

        String vertex = UTIL.statementToString(UTIL.ID, variableDeclarationStatement.getName(), null, variableDeclarationStatement.getType(), variableDeclarationStatement.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }
}
