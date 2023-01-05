package visitors;

import data_types.Function;
import program.Program;
import properties.*;
import properties.border_radius.BorderRadiusProperty;
import properties.border_radius.border_radius_circular.borderRadiusCircularRadiusProperty;
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

import static utils.UTIL.g;

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
        return null;
    }

    @Override
    public String visit(BorderRadiusCircular borderRadiusCircular) {
        String vertex = UTIL.widgetToString(++UTIL.ID, borderRadiusCircular.getIdentifier(), borderRadiusCircular.getProperties().size(), borderRadiusCircular.getLnNumber());
        UTIL.g.addVertex(vertex);
        for (Property property : borderRadiusCircular.getProperties()) {
            String child = property.accept(this);
            UTIL.g.addEdge(vertex, child);
        }
        return vertex;
    }

    @Override
    public String visit(BorderRadiusOnly borderRadiusOnly) {
        String vertex = UTIL.widgetToString(++UTIL.ID, borderRadiusOnly.getIdentifier(), borderRadiusOnly.getProperties().size(), borderRadiusOnly.getLnNumber());
        UTIL.g.addVertex(vertex);
        for (Property property : borderRadiusOnly.getProperties()) {
            String child = property.accept(this);
            UTIL.g.addEdge(vertex, child);
        }
        return vertex;
    }

    @Override
    public String visit(BoxDecorationWidget boxDecorationWidget) {
        String vertex = UTIL.widgetToString(++UTIL.ID, boxDecorationWidget.getIdentifier(), boxDecorationWidget.getProperties().size(), boxDecorationWidget.getLnNumber());
        g.addVertex(vertex);
        for (Property property : boxDecorationWidget.getProperties()) {
            String child = property.accept(this);
            g.addEdge(vertex, child);
        }
        return vertex;
    }

    @Override
    public String visit(Button button) {
        return null;
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
        String vertex = UTIL.widgetToString(++UTIL.ID, container.getIdentifier(), container.getProperties().size(), container.getLnNumber());
        g.addVertex(vertex);
        for (Property property : container.getProperties()) {
            String child = property.accept(this);
            g.addEdge(vertex, child);
        }
        return vertex;
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
        String vertex = UTIL.widgetToString(++UTIL.ID, expanded.getIdentifier(), expanded.getProperties().size(), expanded.getLnNumber());
        UTIL.g.addVertex(vertex);
        for (Property property : expanded.getProperties()) {
            String child = property.accept(this);
            UTIL.g.addEdge(vertex, child);
        }
        return vertex;
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
        return null;
    }

    @Override
    public String visit(BackgroundColorProperty backgroundColorProperty) {
        return null;
    }

    @Override
    public String visit(BorderProperty borderProperty) {
        return null;
    }

    @Override
    public String visit(CenterTitleProperty centerTitleProperty) {
        return null;
    }

    @Override
    public String visit(Children children) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, children.getName(),
                                                null, children.getChildren().size(), children.getLnNumber());
        UTIL.g.addVertex(vertex);
        for (Widget widget : children.getChildren()) {
            String childVertex = widget.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(ChildWidgetProperty childWidgetProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, childWidgetProperty.getName(),
                                                null, 1, childWidgetProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        String childVertex = childWidgetProperty.getValue().accept(this);
        UTIL.g.addEdge(vertex, childVertex);

        return vertex;
    }

    @Override
    public String visit(ColorProperty colorProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, colorProperty.getName(),
                        colorProperty.getValue(), 0, colorProperty.getLnNumber());
        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(ContentAlignmentObjectProperty contentAlignmentObjectProperty) {
        return null;
    }

    @Override
    public String visit(CrossAxisAlignmentProperty crossAxisAlignmentProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, crossAxisAlignmentProperty.getName(),
                String.valueOf(crossAxisAlignmentProperty.getValue()), 0, crossAxisAlignmentProperty.getLnNumber());
        UTIL.g.addVertex(vertex);

        return vertex;
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
        return null;
    }

    @Override
    public String visit(Flex flex) {
        return null;
    }

    @Override
    public String visit(FontSizeDoubleProperty fontSizeDoubleProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, fontSizeDoubleProperty.getName(),
                String.valueOf(fontSizeDoubleProperty.getValue()), 0,
                fontSizeDoubleProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(FontWeightObjectProperty fontWeightObjectProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, fontWeightObjectProperty.getName(),
                                            String.valueOf(fontWeightObjectProperty.getValue()), 0,
                                            fontWeightObjectProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(HeightProperty heightProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, heightProperty.getName(),
                        String.valueOf(heightProperty.getValue()), 0, heightProperty.getLnNumber());
        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(HintProperty hintProperty) {
        return null;
    }

    @Override
    public String visit(Horizontal horizontal) {
        return null;
    }

    @Override
    public String visit(LabelProperty labelProperty) {
        return null;
    }

    @Override
    public String visit(LetterSpacingDoubleProperty letterSpacingDoubleProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, letterSpacingDoubleProperty.getName(),
                String.valueOf(letterSpacingDoubleProperty.getValue()), 0,
                letterSpacingDoubleProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(MainAxisSizeObjectProperty mainAxisSizeObjectProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, mainAxisSizeObjectProperty.getName(),
                String.valueOf(mainAxisSizeObjectProperty.getValue()), 0, mainAxisSizeObjectProperty.getLnNumber());
        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(OnChangedProperty onChangedProperty) {
        return null;
    }

    @Override
    public String visit(OnPressedProperty onPressedProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, onPressedProperty.getName(), null,
                                                onPressedProperty.getValue().getIdentifiers().size() +
                                                        onPressedProperty.getValue().getStatements().size(),
                                                        onPressedProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        for (String i : onPressedProperty.getValue().getIdentifiers()) {
            UTIL.ID++;
            String j = "ID: " + UTIL.ID + "\n" + "Identifier: " + i + "\n" + "lnNum: " + onPressedProperty.getLnNumber();
            UTIL.g.addVertex(j);
            UTIL.g.addEdge(vertex, j);
        }
        for (Statement statement : onPressedProperty.getValue().getStatements()) {
            String statementVertex = statement.accept(this);
            UTIL.g.addEdge(vertex, statementVertex);
        }

        return vertex;
    }

    @Override
    public String visit(PaddingAttributeProperty paddingAttributeProperty) {
        return null;
    }

    @Override
    public String visit(TextAlignObjectProperty textAlignObjectProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, textAlignObjectProperty.getName(),
                String.valueOf(textAlignObjectProperty.getValue()), 0,
                textAlignObjectProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(TextColorProperty textColorProperty) {
        return null;
    }

    @Override
    public String visit(ThicknessProperty thicknessProperty) {
        return null;
    }

    @Override
    public String visit(TitleColorProperty titleColorProperty) {
        return null;
    }

    @Override
    public String visit(TitleProperty titleProperty) {
        return null;
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
        return null;
    }

    @Override
    public String visit(ValueProperty valueProperty) {
        return null;
    }

    @Override
    public String visit(Vertical vertical) {
        return null;
    }

    @Override
    public String visit(WidthProperty widthProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, widthProperty.getName(),
                        String.valueOf(widthProperty.getValue()), 0, widthProperty.getLnNumber());
        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(borderRadiusCircularRadiusProperty borderRadiusCircularRadiusProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, borderRadiusCircularRadiusProperty.getName(),
                String.valueOf(borderRadiusCircularRadiusProperty.getValue()),
                0, borderRadiusCircularRadiusProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(BottomLeftProperty bottomLeftProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, bottomLeftProperty.getName(),
                String.valueOf(bottomLeftProperty.getValue()),
                0, bottomLeftProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(BottomRightProperty bottomRightProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, bottomRightProperty.getName(),
                String.valueOf(bottomRightProperty.getValue()),
                0, bottomRightProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(TopLeftProperty topLeftProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, topLeftProperty.getName(),
                String.valueOf(topLeftProperty.getValue()),
                0, topLeftProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(TopRightProperty topRightProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, topRightProperty.getName(),
                String.valueOf(topRightProperty.getValue()),
                0, topRightProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(BorderRadiusProperty borderRadiusProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, borderRadiusProperty.getName(),
                null,
                1, borderRadiusProperty.getLnNumber());
        g.addVertex(vertex);
        String child = borderRadiusProperty.getWidget().accept(this);
        g.addEdge(vertex, child);
        return vertex;
    }

    @Override
    public String visit(ContainerContentAlignmentProperty containerContentAlignmentProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, containerContentAlignmentProperty.getName(),
                String.valueOf(containerContentAlignmentProperty.getContentAlignmentValue()),
                0, containerContentAlignmentProperty.getLnNumber());
        g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(DecorationProperty decorationProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, decorationProperty.getName(), null, 1, decorationProperty.getLnNumber());
        g.addVertex(vertex);
        String child = decorationProperty.getWidget().accept(this);
        g.addEdge(vertex, child);
        return vertex;
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
        String vertex = UTIL.propertyToString(++UTIL.ID, expandedFlexProperty.getName(),
                String.valueOf(expandedFlexProperty.getValue()),
                0, expandedFlexProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
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
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, textContent.getName(), textContent.getValue(),
                                        0, textContent.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(CustomWidgetDeclarationStatement customWidgetDeclarationStatement) {
        UTIL.ID++;
        String vertex = UTIL.widgetToString(UTIL.ID, customWidgetDeclarationStatement.getName(),
                customWidgetDeclarationStatement.getVariableDeclarationStatements().size() + 1, customWidgetDeclarationStatement.getLnNumber());
        UTIL.g.addVertex(vertex);
        for (Statement s : customWidgetDeclarationStatement.getVariableDeclarationStatements()) {
            String childVertex = s.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }
        String widgetVertex = customWidgetDeclarationStatement.getTree().accept(this);
        UTIL.g.addEdge(vertex, widgetVertex);

        return vertex;
    }

    @Override
    public String visit(VariableAssignmentStatement variableAssignmentStatement) {
        return null;
    }

    @Override
    public String visit(VariableDeclarationStatement variableDeclarationStatement) {
        return null;
    }
}
