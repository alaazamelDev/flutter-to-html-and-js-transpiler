package visitors;

import program.Program;
import properties.*;
import properties.appbar.CenterTitleProperty;
import properties.appbar.TitleProperty;
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
import properties.edgeInsetsSymetricProperties.Horizontal;
import properties.edgeInsetsSymetricProperties.Vertical;
import properties.expanded.ExpandedFlexProperty;
import properties.scaffold.AppBarProperty;
import properties.scaffold.BodyProperty;
import properties.text.*;
import statements.CustomWidgetDeclarationStatement;
import statements.Statement;
import statements.VariableAssignmentStatement;
import statements.VariableDeclarationStatement;
import utils.UTIL;
import widgets.*;

import java.util.List;

import static utils.UTIL.ID;
import static utils.UTIL.g;

public class AstToGraphVisitor implements Visitor<String> {

    @Override
    public String visit(Program program) {

        // build the vertex
        String vertex = "ID: " + ++ID + "\n" +
                "NODE: Program" + "\n" +
                "CHILD_COUNT: " + (program.getStatements().size() + (program.getScaffold() == null ? 0 : 1));

        // add the vertex to the graph
        g.addVertex(vertex);

        // get the list of statements
        List<Statement> children = program.getStatements();
        for (Statement statement : children) {
            String childVertex = statement.accept(this);
            g.addEdge(vertex, childVertex);
        }

        // add the scaffold as the last child
        Widget rootWidget = program.getScaffold();
        if (rootWidget != null) {
            String stringScaffold = rootWidget.accept(this);
            g.addEdge(vertex, stringScaffold);
        }
        return vertex;
    }

    @Override
    public String visit(AppBar appBar) {

        String vertex = UTIL.widgetToString(
                ++ID,
                appBar.getIdentifier(),
                appBar.getProperties().size(),
                appBar.getLnNumber()
        );

        // add the vertex to the graph
        g.addVertex(vertex);

        List<Property> children = appBar.getProperties();
        for (Property child : children) {
            String childVertex = child.accept(this);
            g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(Border border) {
        return null;
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
        return null;
    }

    @Override
    public String visit(Center center) {
        String vertex = UTIL.widgetToString(
                ++ID,
                center.getIdentifier(),
                center.getProperties().size(),
                center.getLnNumber()
        );

        // add vertex to graph
        g.addVertex(vertex);

        List<Property> children = center.getProperties();
        for (Property child : children) {
            String childVertex = child.accept(this);
            g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(Column column) {
        String vertex = UTIL.widgetToString(
                ++ID,
                column.getIdentifier(),
                column.getProperties().size(),
                column.getLnNumber()
        );


        // add the vertex to the graph
        g.addVertex(vertex);

        List<Property> children = column.getProperties();
        for (Property child : children) {
            String childVertex = child.accept(this);
            g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(Container container) {
        return null;
    }

    @Override
    public String visit(CustomWidget customWidget) {
        String vertex = UTIL.widgetToString(
                ++ID,
                customWidget.getIdentifier(),
                customWidget.getProperties().size(),
                customWidget.getLnNumber()
        );


        // add the vertex to the graph
        g.addVertex(vertex);

        List<Property> children = customWidget.getProperties();
        for (Property child : children) {
            String childVertex = child.accept(this);
            g.addEdge(vertex, childVertex);
        }
        return vertex;
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
        String vertex = UTIL.widgetToString(
                ++ID,
                row.getIdentifier(),
                row.getProperties().size(),
                row.getLnNumber()
        );


        // add the vertex to the graph
        g.addVertex(vertex);

        List<Property> children = row.getProperties();
        for (Property child : children) {
            String childVertex = child.accept(this);
            g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(Scaffold scaffold) {
        String vertex = UTIL.widgetToString(
                ++ID,
                scaffold.getIdentifier(),
                scaffold.getProperties().size(),
                scaffold.getLnNumber()
        );


        // add the vertex to the graph
        g.addVertex(vertex);

        List<Property> children = scaffold.getProperties();
        for (Property child : children) {
            String childVertex = child.accept(this);
            g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(Text text) {
        String vertex = UTIL.widgetToString(
                ++ID,
                text.getIdentifier(),
                text.getProperties().size(),
                text.getLnNumber()
        );

        // add vertex to graph
        g.addVertex(vertex);

        List<Property> children = text.getProperties();
        for (Property child : children) {
            String childVertex = child.accept(this);
            g.addEdge(vertex, childVertex);
        }
        return vertex;
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
        String vertex = UTIL.propertyToString(
                ++ID,
                centerTitleProperty.getName(),
                String.valueOf(centerTitleProperty.getValue()),
                0,
                centerTitleProperty.getLnNumber()
        );

        // add the vertex to the graph
        g.addVertex(vertex);
        return vertex;
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
        String vertex = UTIL.propertyToString(
                ++ID,
                customWidgetProperty.getName(),
                String.valueOf(customWidgetProperty.getValue()),
                0,
                customWidgetProperty.getLnNumber()
        );

        // add the vertex to the graph
        g.addVertex(vertex);

        return vertex;
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
    public String visit(FontSizeProperty fontSizeProperty) {
        return null;
    }

    @Override
    public String visit(FontWeightProperty fontWeightProperty) {
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
    public String visit(LetterSpacingProperty letterSpacingProperty) {
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
    public String visit(TextAlignProperty textAlignProperty) {
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
        String vertex = UTIL.propertyToString(
                ++ID,
                titleProperty.getName(),
                titleProperty.getValue(),
                0,
                titleProperty.getLnNumber()
        );

        // add the vertex to the graph
        g.addVertex(vertex);

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
        String vertex = UTIL.propertyToString(
                ++ID,
                appBarProperty.getName(),
                null,
                1,
                appBarProperty.getLnNumber()
        );

        // add the vertex to the graph
        g.addVertex(vertex);

        Widget propertyValue = appBarProperty.getValue();
        String childVertex = propertyValue.accept(this);
        g.addEdge(vertex, childVertex);

        return vertex;
    }

    @Override
    public String visit(BodyProperty bodyProperty) {
        String vertex = UTIL.propertyToString(
                ++ID,
                bodyProperty.getName(),
                null,
                1,
                bodyProperty.getLnNumber()
        );

        // add the vertex to the graph
        g.addVertex(vertex);

        Widget propertyValue = bodyProperty.getValue();
        String childVertex = propertyValue.accept(this);
        g.addEdge(vertex, childVertex);

        return vertex;
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
