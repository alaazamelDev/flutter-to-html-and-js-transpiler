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
import properties.edgeInsetsSymetricProperties.Horizontal;
import properties.edgeInsetsSymetricProperties.Vertical;
import properties.expanded.ExpandedFlexProperty;
import properties.scaffold.AppBarProperty;
import properties.scaffold.BodyProperty;
import properties.text.TextContent;
import statements.CustomWidgetDeclarationStatement;
import statements.VariableAssignmentStatement;
import statements.VariableDeclarationStatement;
import utils.UTIL;
import widgets.*;

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
        return null;
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
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,horizontal.getName(),Double.toString(horizontal.getValue()),0,
                horizontal.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
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
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,paddingAttributeProperty.getName(),null,1,
                paddingAttributeProperty.getLnNumber());
        UTIL.g.addVertex(vertex);
        String child =paddingAttributeProperty.getValue().accept(this);
        UTIL.g.addEdge(vertex,child);
        return vertex;
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
        UTIL.ID++;
        String vertex =UTIL.propertyToString(UTIL.ID,vertical.getName(),Double.toString(vertical.getValue()),0,
                vertical.getLnNumber());
        UTIL.g.addVertex(vertex);
        return vertex;
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
        return null;
    }

    @Override
    public String visit(VariableDeclarationStatement variableDeclarationStatement) {
        return null;
    }
}
