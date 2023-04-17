package visitors;

import expressions.*;
import expressions.primary.PrimaryIdentifierExpression;
import expressions.primary.PrimaryLiteralExpression;
import program.Program;
import properties.*;
import properties.appbar.CenterTitleProperty;
import properties.appbar.TitleProperty;
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


import java.util.List;

import static java.lang.String.valueOf;

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
        UTIL.g.addVertex(vertex);
        for (Property property : boxDecorationWidget.getProperties()) {
            String child = property.accept(this);
            UTIL.g.addEdge(vertex, child);
        }
        return vertex;
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
        String vertex = UTIL.widgetToString(++UTIL.ID, container.getIdentifier(), container.getProperties().size(), container.getLnNumber());
        UTIL.g.addVertex(vertex);
        for (Property property : container.getProperties()) {
            String child = property.accept(this);
            UTIL.g.addEdge(vertex, child);
        }
        return vertex;
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
        UTIL.ID++;
        String vertex =UTIL.widgetToString(UTIL.ID,edgeInsetsOnly.getIdentifier(),edgeInsetsOnly.getProperties().size(),
                edgeInsetsOnly.getLnNumber());
        UTIL.g.addVertex(vertex);
        for(Property property : edgeInsetsOnly.getProperties()){
            String child = property.accept(this);
            UTIL.g.addEdge(vertex,child);
        }
        return vertex;
    }

    @Override
    public String visit(EdgeInsetsSymmetric edgeInsetsSymmetric) {
        UTIL.ID++;
        String vertex =UTIL.widgetToString(UTIL.ID,edgeInsetsSymmetric.getIdentifier(),edgeInsetsSymmetric.getProperties().size(),
                edgeInsetsSymmetric.getLnNumber());
        UTIL.g.addVertex(vertex);
        for(Property property : edgeInsetsSymmetric.getProperties()){
            String child = property.accept(this);
            UTIL.g.addEdge(vertex,child);
        }
        return vertex;
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
        UTIL.ID++;
        String vertex =UTIL.widgetToString(UTIL.ID,gestureDetector.getIdentifier(),gestureDetector.getProperties().size(),
                gestureDetector.getLnNumber());
        UTIL.g.addVertex(vertex);
        for(Property property : gestureDetector.getProperties()){
            String child = property.accept(this);
            UTIL.g.addEdge(vertex,child);
        }
        return vertex;
    }

    @Override
    public String visit(Image image) {
        UTIL.ID++;
        String vertex =UTIL.widgetToString(UTIL.ID,image.getIdentifier(),image.getProperties().size(),
                image.getLnNumber());
        UTIL.g.addVertex(vertex);
        for(Property property : image.getProperties()){
            String child = property.accept(this);
            UTIL.g.addEdge(vertex,child);
        }
        return vertex;
    }

    @Override
    public String visit(Padding padding) {
        UTIL.ID++;
        String vertex =UTIL.widgetToString(UTIL.ID,padding.getIdentifier(),padding.getProperties().size(),padding.getLnNumber());
        UTIL.g.addVertex(vertex);
        for(Property property : padding.getProperties()){
            String child = property.accept(this);
            UTIL.g.addEdge(vertex,child);
        }
        return vertex;
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
        String vertex = UTIL.propertyToString(++UTIL.ID, customWidgetProperty.getName(),
                String.valueOf(customWidgetProperty.getValue()), 0, customWidgetProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
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
    public String visit(FontSizeProperty fontSizeProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, fontSizeProperty.getName(),
                String.valueOf(fontSizeProperty.getValue()), 0,
                fontSizeProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(FontWeightProperty fontWeightProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, fontWeightProperty.getName(),
                                            String.valueOf(fontWeightProperty.getValue()), 0,
                fontWeightProperty.getLnNumber());

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
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, hintProperty.getName(), hintProperty.getValue(), 0, hintProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(Horizontal horizontal) {
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,horizontal.getName(),Double.toString(horizontal.getValue()),0,
                horizontal.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(LabelProperty labelProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, labelProperty.getName(), labelProperty.getValue(), 0, labelProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(LetterSpacingProperty letterSpacingProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, letterSpacingProperty.getName(),
                String.valueOf(letterSpacingProperty.getValue()), 0,
                letterSpacingProperty.getLnNumber());

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
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,paddingAttributeProperty.getName(),null,1,
                paddingAttributeProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        String child =paddingAttributeProperty.getValue().accept(this);
        UTIL.g.addEdge(vertex,child);
        return vertex;
    }

    @Override
    public String visit(TextAlignProperty textAlignProperty) {
        UTIL.ID++;
        String vertex = UTIL.propertyToString(UTIL.ID, textAlignProperty.getName(),
                String.valueOf(textAlignProperty.getValue()), 0,
                textAlignProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
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
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,vertical.getName(),Double.toString(vertical.getValue()),0,
                vertical.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
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
        UTIL.g.addVertex(vertex);
        String child = borderRadiusProperty.getWidget().accept(this);
        UTIL.g.addEdge(vertex, child);
        return vertex;
    }

    @Override
    public String visit(ContainerContentAlignmentProperty containerContentAlignmentProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, containerContentAlignmentProperty.getName(),
                String.valueOf(containerContentAlignmentProperty.getContentAlignmentValue()),
                0, containerContentAlignmentProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(DecorationProperty decorationProperty) {
        String vertex = UTIL.propertyToString(++UTIL.ID, decorationProperty.getName(), null, 1, decorationProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        String child = decorationProperty.getWidget().accept(this);
        UTIL.g.addEdge(vertex, child);
        return vertex;
    }

    @Override
    public String visit(Left left) {
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,left.getName(),Double.toString(left.getValue()),0,
                left.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(Right right) {
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,right.getName(),Double.toString(right.getValue()),0,
                right.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(Bottom bottom) {
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,bottom.getName(),Double.toString(bottom.getValue()),0,
                bottom.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(Top top) {
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,top.getName(),Double.toString(top.getValue()),0,
                top.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
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
        UTIL.ID++;

        String vertex = UTIL.statementToString(UTIL.ID, variableAssignmentStatement.getName(), valueOf(variableAssignmentStatement.getValue()), null, variableAssignmentStatement.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(VariableDeclarationStatement variableDeclarationStatement) {
        UTIL.ID++;

        String vertex = UTIL.statementToString(UTIL.ID, variableDeclarationStatement.getName(), null,
                variableDeclarationStatement.getType(), variableDeclarationStatement.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }

    @Override
    public String visit(LogicalAndExpression logicalAndExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Logical And Expression",
                valueOf(logicalAndExpression.getValue()), logicalAndExpression.getExpressions().size(),
                logicalAndExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        for (Expression s : logicalAndExpression.getExpressions()) {
            String childVertex = s.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(LogicalOrExpression logicalOrExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Logical Or Expression",
                valueOf(logicalOrExpression.getValue()), logicalOrExpression.getExpressions().size(),
                logicalOrExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        for (Expression s : logicalOrExpression.getExpressions()) {
            String childVertex = s.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(EqualityExpression equalityExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Equality Expression "+equalityExpression.getOperatorType(),
                valueOf(equalityExpression.getValue()), 2,
                equalityExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        String leftChildVertex = equalityExpression.getLeft().accept(this);
        String rightChildVertex = equalityExpression.getRight().accept(this);
        UTIL.g.addEdge(vertex, leftChildVertex);
        UTIL.g.addEdge(vertex, rightChildVertex);
        return vertex;
    }

    @Override
    public String visit(RelationalExpression relationalExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Relational Expression "+relationalExpression.getOperatorType(),
                valueOf(relationalExpression.getValue()), 2,
                relationalExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        String leftChildVertex = relationalExpression.getLeft().accept(this);
        String rightChildVertex = relationalExpression.getRight().accept(this);
        UTIL.g.addEdge(vertex, leftChildVertex);
        UTIL.g.addEdge(vertex, rightChildVertex);
        return vertex;
    }

    @Override
    public String visit(ExpressionListExpression expressionList)
    {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Expression List",
                valueOf(expressionList.getValue()), expressionList.getExpressions().size(),
                expressionList.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        for (Expression s : expressionList.getExpressions()) {
            String childVertex = s.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(MultiplicativeExpression multiplicativeExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Multiplicative Expression",
                valueOf(multiplicativeExpression.getValue()), multiplicativeExpression.getExpressions().size(),
                multiplicativeExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        for (Expression s : multiplicativeExpression.getExpressions()) {
            String childVertex = s.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(AdditiveExpression additiveExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Additive Expression",
                valueOf(additiveExpression.getValue()), additiveExpression.getExpressions().size(),
                additiveExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        for (Expression s : additiveExpression.getExpressions()) {
            String childVertex = s.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }
        return vertex;
    }

    @Override
    public String visit(LiteralExpression literalExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Literal Expression",
                valueOf(literalExpression.getValue()), 0,
                literalExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(PrimaryIdentifierExpression primaryIdentifierExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Primary Identifier Expression",
                valueOf(primaryIdentifierExpression.getValue()), 0,
                primaryIdentifierExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(PrimaryLiteralExpression primaryLiteralExpression) {
        UTIL.ID++;
        String vertex = UTIL.expressionToString(UTIL.ID, "Primary Literal Expression",
                valueOf(primaryLiteralExpression.getValue()), 0,
                primaryLiteralExpression.getLnNumber()+ 1);
        UTIL.g.addVertex(vertex);
        return vertex;
    }

    @Override
    public String visit(IF If) {
        UTIL.ID++;

        String vertex = UTIL.widgetToString(UTIL.ID, If.getIdentifier(), If.getProperties().size(), If.getLnNumber());

        UTIL.g.addVertex(vertex);

        List<Property> properties = If.getProperties();

        for (Property property : properties) {
            String childVertex = property.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }

        return vertex;
    }

    @Override
    public String visit(FOR For) {
        UTIL.ID++;

        String vertex = UTIL.widgetToString(UTIL.ID, For.getIdentifier(), For.getProperties().size(), For.getLnNumber());

        UTIL.g.addVertex(vertex);

        List<Property> properties = For.getProperties();

        for (Property property : properties) {
            String childVertex = property.accept(this);
            UTIL.g.addEdge(vertex, childVertex);
        }

        return vertex;
    }

    @Override
    public String visit(ConditionProperty conditionProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString( UTIL.ID, conditionProperty.getName(), null, 1,
                                               conditionProperty.getLnNumber() );

        g.addVertex(vertex);

        Expression propertyValue = conditionProperty.getExpression();
        String childVertex = propertyValue.accept(this);
        g.addEdge(vertex, childVertex);

        return vertex;
    }

    @Override
    public String visit(IterationsProperty iterationsProperty) {
        UTIL.ID++;

        String vertex = UTIL.propertyToString(UTIL.ID, iterationsProperty.getName(),
                String.valueOf(iterationsProperty.getValue()), 0, iterationsProperty.getLnNumber());

        UTIL.g.addVertex(vertex);

        return vertex;
    }
}
