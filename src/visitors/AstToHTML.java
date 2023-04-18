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
        List<Property> properties = border.getProperties();
        StringBuilder borders = new StringBuilder();

        for (Property property : properties) {
            if (property.getName().equals("borderRadius")) {
                borders.append(property.accept(this)).append(" ");
            } else if (property.getName().equals("color")) {
                borders.append("border-color: ").append(property.accept(this)).append("; ");
            } else if (property.getName().equals("thickness")) {
                borders.append("border-width: ").append(property.accept(this)).append("px").append("; ");
            }
        }
        return borders.toString();
    }

    @Override
    public String visit(BorderRadiusCircular borderRadiusCircular) {
        StringBuilder border = new StringBuilder();


        border.append("border-radius: ")
                        .append(borderRadiusCircular.getProperties()
                        .get(0).accept(this)).append("px").append(";");

        return border.toString();
    }

    @Override
    public String visit(BorderRadiusOnly borderRadiusOnly) {
        List<Property> properties = borderRadiusOnly.getProperties();
        StringBuilder borders = new StringBuilder();

        for (int i = 0; i < properties.size(); i++) {
            borders.append(properties.get(i).accept(this)).append(" ");
        }

        return borders.toString();
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
        List<Property> properties = edgeInsetsOnly.getProperties();
        StringBuilder paddings = new StringBuilder();

        for (Property property: properties) {
            paddings.append(property.accept(this)).append(" ");
        }

        return paddings.toString();
    }

    @Override
    public String visit(EdgeInsetsSymmetric edgeInsetsSymmetric) {
        List<Property> properties = edgeInsetsSymmetric.getProperties();
        StringBuilder padding = new StringBuilder("padding: ");

        for (int i = 0; i < properties.size(); i++) {
            if (i == 0 && properties.get(i).getName().equals("horizontal")) {
                Property horizontal = properties.remove(i);
                properties.add(horizontal);
                break;
            }
        }

        for (Property property: properties) {
            padding.append(property.accept(this)).append("px").append(" ");
        }

        padding.append("; ");

        return padding.toString();
    }

    @Override
    public String visit(Expanded expanded) {
        return null;
    }

    @Override
    // TODO not completed
    public String visit(GestureDetector gestureDetector) {

        StringBuilder code = new StringBuilder();
        code.append("<div ");
        code.append("style=");
        List<Property> properties = gestureDetector.getProperties();
        int childIndex = -1;

        for (int i = 0; i < properties.size(); i++) {
            if (!properties.get(i).getName().equals("child")) {
                code.append(" ").append(properties.get(i).accept(this));
            } else {
                childIndex = i;
            }
        }

        code.append(" >\n");

        if (childIndex != -1) {
            code.append(properties.get(childIndex).accept(this));
        }

        code.append("</div>");

        return code.toString();
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
        StringBuilder code = new StringBuilder();
        code.append("<input ");
        List<Property> properties = textField.getProperties();
        int childIndex = -1;

        StringBuilder styles = new StringBuilder();
        styles.append("style=\" ");

        StringBuilder hint = new StringBuilder("");

        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getName().equals("label")) {
                code.append("placeholder=").append(properties.get(i).accept(this)).append(" ");
            } else if(properties.get(i).getName().equals("value")) {
                code.append("value=").append(properties.get(i).accept(this)).append(" ");
            } else if (properties.get(i).getName().equals("textColor")) {
                styles.append(properties.get(i).accept(this));
            } else if (properties.get(i).getName().equals("border")) {
                styles.append(properties.get(i).accept(this));
            } else if (properties.get(i).getName().equals("hint")) {
                hint.append(properties.get(i).accept(this));
            } else if (properties.get(i).getName().equals("padding")) {
                styles.append(properties.get(i).accept(this));
            } else {
                childIndex = i;
            }
        }

        if (styles.length() > 8) {
            code.append(styles).append("\" ");
        }

        code.append(" >\n");
        // append the hint if it's exist, if not it will append empty string
        code.append(hint);

        if (childIndex != -1) {
            code.append(properties.get(childIndex).accept(this));
        }

        return code.toString();
    }

    @Override
    public String visit(BackgroundColorProperty backgroundColorProperty) {
        return null;
    }

    @Override
    public String visit(BorderProperty borderProperty) {
        return borderProperty.getValue().accept(this);
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
        return colorProperty.getValue();
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
        StringBuilder hint = new StringBuilder();
        hint.append("<h4 style=\"margin-top: 0;\">\n").append(hintProperty.getValue().replace("\"", "")).append("\n").append("</h4>\n");

        return hint.toString();
    }

    @Override
    public String visit(Horizontal horizontal) {
        StringBuilder value = new StringBuilder();
        value.append(horizontal.getValue());

        return value.toString();
    }

    @Override
    public String visit(LabelProperty labelProperty) {
        return labelProperty.getValue();
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
        return paddingAttributeProperty.getValue().accept(this);
    }

    @Override
    public String visit(TextAlignProperty textAlignProperty) {
        return null;
    }

    @Override
    public String visit(TextColorProperty textColorProperty) {
        StringBuilder color = new StringBuilder();
        color.append("color: ").append(textColorProperty.getValue()).append("; ");
        return color.toString();
    }

    @Override
    public String visit(ThicknessProperty thicknessProperty) {
        StringBuilder value = new StringBuilder();
        value.append(thicknessProperty.getValue());

        return value.toString();
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
        return valueProperty.getValue();
    }

    @Override
    public String visit(Vertical vertical) {
        StringBuilder value = new StringBuilder();
        value.append(vertical.getValue());

        return value.toString();
    }

    @Override
    public String visit(WidthProperty widthProperty) {
        return null;
    }

    @Override
    public String visit(borderRadiusCircularRadiusProperty borderRadiusCircularRadiusProperty) {
        StringBuilder value = new StringBuilder();
        System.out.println(value);
        value.append(borderRadiusCircularRadiusProperty.getValue());
        return value.toString();
    }

    @Override
    public String visit(BottomLeftProperty bottomLeftProperty) {
        StringBuilder value = new StringBuilder();
        value.append("border-bottom-left-radius: ").append(bottomLeftProperty.getValue()).append("px").append(";");
        return value.toString();
    }

    @Override
    public String visit(BottomRightProperty bottomRightProperty) {
        StringBuilder value = new StringBuilder();
        value.append("border-bottom-right-radius: ").append(bottomRightProperty.getValue()).append("px").append(";");
        return value.toString();
    }

    @Override
    public String visit(TopLeftProperty topLeftProperty) {
        StringBuilder value = new StringBuilder();
        value.append("border-top-left-radius: ").append(topLeftProperty.getValue()).append("px").append(";");
        return value.toString();
    }

    @Override
    public String visit(TopRightProperty topRightProperty) {
        StringBuilder value = new StringBuilder();
        value.append("border-top-right-radius: ").append(topRightProperty.getValue()).append("px").append(";");
        return value.toString();
    }

    @Override
    public String visit(BorderRadiusProperty borderRadiusProperty) {
        return borderRadiusProperty.getWidget().accept(this);
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
        StringBuilder padding = new StringBuilder();
        padding.append("padding-left: ").append(left.getValue()).append("px").append("; ");

        return padding.toString();
    }

    @Override
    public String visit(Right right) {
        StringBuilder padding = new StringBuilder();
        padding.append("padding-right: ").append(right.getValue()).append("px").append("; ");

        return padding.toString();
    }

    @Override
    public String visit(Bottom bottom) {
        StringBuilder padding = new StringBuilder();
        padding.append("padding-bottom: ").append(bottom.getValue()).append("px").append("; ");

        return padding.toString();
    }

    @Override
    public String visit(Top top) {
        StringBuilder padding = new StringBuilder();
        padding.append("padding-top: ").append(top.getValue()).append("px").append("; ");

        return padding.toString();
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
