package visitors;

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
        return null;
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
        return null;
    }

    @Override
    public String visit(MainAxisSizeObjectProperty mainAxisSizeObjectProperty) {
        return null;
    }

    @Override
    public String visit(OnChangedProperty onChangedProperty) {
        return null;
    }

    @Override
    public String visit(OnPressedProperty onPressedProperty) {
        return null;
    }

    @Override
    public String visit(PaddingAttributeProperty paddingAttributeProperty) {
        return null;
    }

    @Override
    public String visit(TextAlignObjectProperty textAlignObjectProperty) {
        return null;
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
        return null;
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
        return null;
    }

    @Override
    public String visit(CustomWidgetDeclarationStatement customWidgetDeclarationStatement) {
        return null;
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
