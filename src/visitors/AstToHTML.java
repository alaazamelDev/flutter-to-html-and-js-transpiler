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
import statements.VariableAssignmentStatement;
import statements.VariableDeclarationStatement;
import widgets.*;

import java.util.List;

public class AstToHTML implements Visitor<String> {
    @Override
    public String visit(Program program) {

        // TODO: Needs to be modified
        return program.getScaffold().accept(this);
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

        StringBuilder imgString = new StringBuilder();

        // open the tag
        imgString.append("<img ");


        // style the image
        imgString.append("style = \"");


        // translate the properties
        for (Property prop : image.getProperties()) {
            imgString.append(prop.accept(this));
        }

        // close the tag
        imgString.append("\" />");


        // HTML code...
        return imgString.toString();
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
        // extract props
        List<Property> propertyList = scaffold.getProperties();

        // all of its properties are tags.
        StringBuilder props = new StringBuilder();

        for (Property prop : propertyList) {
            props.append(" ").append(prop.accept(this));
        }

        // HTML code.
        return "<html>" + props + "</html>";
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

        String fitValue = "";
        switch (fitProperty.getValue()) {
            case cover:
                fitValue = "background-size: cover; ";
                break;
            case contains:
                fitValue = "background-size: contain; ";
                break;
        }
        return fitValue;
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
        StringBuilder value = new StringBuilder();
        value.append("height: ");
        value.append(heightProperty.getValue()).append("px").append(";");

        return value.toString();
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
        StringBuilder value = new StringBuilder();
        value.append("background-image: url(\'");
        value.append(urlProperty.getValue().replace("\"", "").replace("'", ""));
        value.append("\'); ");

        return value.toString();
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
        StringBuilder value = new StringBuilder();
        value.append("width: ");
        value.append(widthProperty.getValue()).append("px").append(";");

        return value.toString();
    }

    @Override
    public String visit(borderRadiusCircularRadiusProperty borderRadiusCircularRadiusProperty) {
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

        // appbar value
        String appbarValue = appBarProperty.getValue().accept(this);

        // HTML code.
        return "<title>" + appbarValue + "</title>";
    }

    @Override
    public String visit(BodyProperty bodyProperty) {

        // body value
        String bodyValue = bodyProperty.getValue().accept(this);

        // HTML code.
        return "<body>" + bodyValue + "</body>";
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

    @Override
    public String visit(LogicalAndExpression logicalAndExpression) {
        return null;
    }

    @Override
    public String visit(LogicalOrExpression logicalOrExpression) {
        return null;
    }

    @Override
    public String visit(EqualityExpression equalityExpression) {
        return null;
    }

    @Override
    public String visit(RelationalExpression relationalExpression) {
        return null;
    }

    @Override
    public String visit(ExpressionListExpression expressionList) {
        return null;
    }

    @Override
    public String visit(MultiplicativeExpression multiplicativeExpression) {
        return null;
    }

    @Override
    public String visit(AdditiveExpression additiveExpression) {
        return null;
    }

    @Override
    public String visit(LiteralExpression literalExpression) {
        return null;
    }

    @Override
    public String visit(PrimaryIdentifierExpression primaryIdentifierExpression) {
        return null;
    }

    @Override
    public String visit(PrimaryLiteralExpression primaryLiteralExpression) {
        return null;
    }

    @Override
    public String visit(IF If) {
        return null;
    }

    @Override
    public String visit(FOR For) {
        return null;
    }

    @Override
    public String visit(ConditionProperty conditionProperty) {
        return null;
    }

    @Override
    public String visit(IterationsProperty iterationsProperty) {
        return null;
    }
}
