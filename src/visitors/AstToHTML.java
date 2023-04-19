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
import statements.*;
import utils.UTIL;
import widgets.*;

import java.util.List;
import java.util.Objects;

public class AstToHTML implements Visitor<String> {
    @Override
    public String visit(Program program) {

        // TODO: Needs to be modified
        return program.getScaffold().accept(this);
    }

    @Override
    public String visit(AppBar appBar) {

        String appbarTitleProperty = "";
        String appbarCenterTitleProperty = "";


        for (Property property : appBar.getProperties()) {
            if (property.getName().equals("title")) {
                appbarTitleProperty = property.accept(this);
                UTIL.pageName = appbarTitleProperty.replace("<h3>", "").replace("</h3>", "");
            } else if (property.getName().equals("centerTitle")) {
                appbarCenterTitleProperty = property.accept(this);
            }
        }

        // Create div with some styling
        StringBuilder div = new StringBuilder("<div style=\"");
        div.append("padding: 0.5rem 1.5rem 0.5rem 1.5rem; ");   // padding attribute
        div.append("background-color: #044389; ");   // background color attribute
        div.append("color: #FFFFFF; ");   // background color attribute
        div.append("margin-bottom: 20px; ");
        div.append(appbarCenterTitleProperty);  // center title attribute
        div.append(" \">"); // close style attribute
        div.append("\n");   // break the line
        div.append(appbarTitleProperty);    // add title attribute as heading tag
        div.append("\n");
        div.append("</div>");   // close div tag

        return div.toString();
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
        StringBuilder attributes = new StringBuilder();
        List<Property> properties = boxDecorationWidget.getProperties();

        for (Property property : properties) {
            System.out.println(property.getName());
            if (property.getName().equals("color")) {
                attributes.append("background-color:" + property.accept(this) + ";");
            } else attributes.append(property.accept(this));
        }
        return attributes.toString();
    }

    @Override
    public String visit(Button button) {
        List<Property> properties = button.getProperties();
        StringBuilder btn = new StringBuilder("<button ");
        StringBuilder styles = new StringBuilder("style=\" ");
        StringBuilder listeners = new StringBuilder("onClick=\" ");
        Property titleProperty = null;
        Property titleColorProperty = null;

        for (Property property : properties) {
            if (property.getName().equals("width")) {
                styles.append(property.accept(this)).append(" ");
            } else if (property.getName().equals("height")) {
                styles.append(property.accept(this)).append(" ");
            } else if (property.getName().equals("backgroundColor")) {
                styles.append(property.accept(this)).append(" ");
            } else if (property.getName().equals("title")) {
                titleProperty = property;
            } else if (property.getName().equals("titleColor")) {
                titleColorProperty = property;
            } else if (property.getName().equals("onPressed")) {
                listeners.append(property.accept(this));

            }
        }
        styles.append("\" ");
        listeners.append("\" ");

        // don't add them if they are empty
        if (styles.length() > 10)
            btn.append(styles);
        if (listeners.length() > 12)
            btn.append(listeners);

        btn.append(">");

        if (titleProperty != null) {
            StringBuilder title = new StringBuilder();

            if (titleColorProperty != null) {
                title.append("<div style=\" ")
                        .append(titleColorProperty.accept(this))
                        .append(" \"").append(">");

            }

            title.append(titleProperty.accept(this).replace("<h3>", "").replace("</h3>", ""));

            if (titleColorProperty != null) {
                title.append("</div>");
            }

            btn.append(title);
        }

        btn.append("</button>");
        return btn.toString();
    }

    @Override
    public String visit(Center center) {
        StringBuilder tag = new StringBuilder();

        //delete first \n
        tag.append("\n<center>\n");


        for (Property property : center.getProperties())
            tag.append(property.accept(this));

        tag.append("</center>\n");
        return tag.toString();

    }

    @Override
    public String visit(Column column) {
        return null;
    }


    @Override
    public String visit(Container container) {
        StringBuilder tag = new StringBuilder();
        tag.append("<div class=\"container\" ");
        List<Property> properties = container.getProperties();
        int childIndex = -1;

        StringBuilder styleAttribute = new StringBuilder();
        styleAttribute.append("style=\" ");

        for (int i = 0; i < properties.size(); i++) {
            switch (properties.get(i).getName()) {
                case "width", "Decoration", "height" -> styleAttribute.append(properties.get(i).accept(this));
                case "ContainerContentAlignment" -> {
                    String align = properties.get(i).accept(this);
                    switch (align) {
                        case "center" -> styleAttribute.append("text-align:center; ");
                        case "left" -> styleAttribute.append("text-align:left; ");
                        case "right" -> styleAttribute.append("text-align:right; ");
                    }
                }
                case "child" -> childIndex = i;
            }
        }
        tag.append(styleAttribute).append("\" >");

        if (childIndex != -1) {
            tag.append(properties.get(childIndex).accept(this));
        }

        tag.append("</div>\n");
        return tag.toString();
    }

    @Override
    public String visit(CustomWidget customWidget) {
        return null;
    }

    @Override
    public String visit(EdgeInsetsOnly edgeInsetsOnly) {
        List<Property> properties = edgeInsetsOnly.getProperties();
        StringBuilder paddings = new StringBuilder();

        for (Property property : properties) {
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

        for (Property property : properties) {
            padding.append(property.accept(this)).append("px").append(" ");
        }

        padding.append("; ");

        return padding.toString();
    }

    @Override
    //TODO make sure parent display set to FLEX
    public String visit(Expanded expanded) {
        StringBuilder tag = new StringBuilder();
        tag.append("<div  class=\"Expanded\" ");
        List<Property> properties = expanded.getProperties();

        StringBuilder styleAttribute = new StringBuilder();
        styleAttribute.append("style=\" ");
        styleAttribute.append("flex-grow: 1; ");
        styleAttribute.append("flex-shrink: 1; ");

        int childIndex = -1;
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getName().equals("ExpandedFlex")) {
                styleAttribute.append("flex: ").append(properties.get(i).accept(this)).append("; ");
            } else if (properties.get(i).getName().equals("child")) {
                childIndex = i;
            }
        }
        tag.append(styleAttribute).append("\" >");

        if (childIndex != -1) {
            tag.append(properties.get(childIndex).accept(this));
        }
        tag.append("</div>\n");

        return tag.toString();
    }

    @Override
    // TODO not completed
    public String visit(GestureDetector gestureDetector) {

        StringBuilder code = new StringBuilder();
        StringBuilder listeners = new StringBuilder("onClick=\" ");

        code.append("<div ");
        List<Property> properties = gestureDetector.getProperties();
        int childIndex = -1;

        for (int i = 0; i < properties.size(); i++) {
            if (!properties.get(i).getName().equals("child")) {
                listeners.append(properties.get(i).accept(this));
            } else {
                childIndex = i;
            }
        }

        code.append(listeners).append("\"");
        code.append(" >\n");

        if (childIndex != -1) {
            code.append(properties.get(childIndex).accept(this));
        }

        code.append("</div>");

        return code.toString();
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
        StringBuilder tag = new StringBuilder();
        tag.append("<div class=\"padding\" ");

        StringBuilder styleAttribute = new StringBuilder();
        styleAttribute.append("style=\" ");

        List<Property> properties = padding.getProperties();

        int childIndex = -1;
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getName().equals("padding")) {
                styleAttribute.append(properties.get(i).accept(this)).append("; ");
            } else if (properties.get(i).getName().equals("child")) {
                childIndex = i;
            }
        }
        tag.append(styleAttribute).append("\" >");

        if (childIndex != -1) {
            tag.append(properties.get(childIndex).accept(this));
        }
        tag.append("</div>\n");

        return tag.toString();
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

        // check for "appBar" property and append to beginning of props list
        for (Property prop : propertyList) {
            if (prop.getName().equals("appBar")) {
                props.insert(0, prop.accept(this) + "\n");
            }
        }

        // append the rest of the properties
        for (Property prop : propertyList) {
            if (!prop.getName().equals("appBar")) {
                props.append(prop.accept(this)).append("\n");
            }
        }

        // HTML code.
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>" + UTIL.pageName + "</title>\n" +
                "    <style>\n" +
                "      body {\n" +
                "        margin: 0;\n" +
                "      }\n" +
                "      html {\n" +
                "        box-sizing: border-box;\n" +
                "      }\n" +
                "      \n" +
                "      *,\n" +
                "      *:before,\n" +
                "      *:after {\n" +
                "        box-sizing: inherit;\n" +
                "      }\n" +
                "      \n" +
                "      html,\n" +
                "      body,\n" +
                "      #root {\n" +
                "        height: 100%;\n" +
                "      }\n" +
                "    </style>\n" +
                "  </head>\n" +
                props +
                "</html>";
    }

    @Override
    public String visit(Text text) {
        StringBuilder tag = new StringBuilder();
        tag.append("<p");
        List<Property> properties = text.getProperties();

        StringBuilder styleAttribute = new StringBuilder();
        styleAttribute.append(" style=\"");
        int contentIndex = -1;
        for (int i = 0; i < properties.size(); i++) {
            switch (properties.get(i).getName()) {
                case "fontWeight" ->
                        styleAttribute.append("font-weight: ").append(properties.get(i).accept(this)).append("; ");
                case "fontSize" ->
                        styleAttribute.append("font-size: ").append(properties.get(i).accept(this)).append("px; ");
                case "letterSpacing" ->
                        styleAttribute.append("letter-spacing: ").append(properties.get(i).accept(this)).append("px; ");
                case "textAlign" ->
                        styleAttribute.append("text-align: ").append(properties.get(i).accept(this)).append("; ");
                case "text" -> contentIndex = i;
            }
        }
        if (properties.size() != 0)
            if (!(properties.size() == 1 && Objects.equals(properties.get(0).getName(), "text")))
                tag.append(styleAttribute).append("\"");
        tag.append(">");
        String content = "";
        if (contentIndex != -1) {
            content = properties.get(contentIndex).accept(this);
            tag.append(content.replace("\"", "")); //delete all double quotes ("") from the String
        }

        tag.append("</p>\n");

        return tag.toString();

    }

    @Override
    public String visit(TextField textField) {
        StringBuilder code = new StringBuilder();
        code.append("<input ");
        List<Property> properties = textField.getProperties();
        int childIndex = -1;

        StringBuilder styles = new StringBuilder();
        styles.append("style=\" ");

        StringBuilder hint = new StringBuilder();

        for (int i = 0; i < properties.size(); i++) {
            switch (properties.get(i).getName()) {
                case "label" -> code.append("placeholder=").append(properties.get(i).accept(this)).append(" ");
                case "value" -> code.append("value=").append(properties.get(i).accept(this)).append(" ");
                case "textColor", "border", "padding" -> styles.append(properties.get(i).accept(this));
                case "hint" -> hint.append(properties.get(i).accept(this));
                default -> childIndex = i;
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
        StringBuilder color = new StringBuilder();
        color.append("background-color: ").append(backgroundColorProperty.getValue()).append(";");

        return color.toString();
    }

    @Override
    public String visit(BorderProperty borderProperty) {
        return borderProperty.getValue().accept(this);
    }

    @Override
    public String visit(CenterTitleProperty centerTitleProperty) {

        boolean centerTitle = centerTitleProperty.getValue();

        if (centerTitle) {
            return "text-align: center;";
        }

        return "";
    }

    @Override
    public String visit(Children children) {
        return null;
    }

    @Override
    public String visit(ChildWidgetProperty childWidgetProperty) {
        return childWidgetProperty.getValue().accept(this);
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

        return switch (fitProperty.getValue()) {
            case cover -> "background-size: cover; ";
            case contains -> "background-size: contain; ";
        };
    }

    @Override
    public String visit(Flex flex) {
        return null;
    }

    @Override
    public String visit(FontSizeProperty fontSizeProperty) {
        return String.valueOf(fontSizeProperty.getValue());
    }

    @Override
    public String visit(FontWeightProperty fontWeightProperty) {
        return fontWeightProperty.getValue().toString();
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
        return String.valueOf(letterSpacingProperty.getValue());
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
        List<Statement> statements = onPressedProperty.getValue().getStatements();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < statements.size(); i++) {
            code.append(statements.get(i).accept(this));
            if (i != statements.size() - 1) {
                code.append(", ");
            }
        }

        return code.toString();
    }

    @Override
    public String visit(PaddingAttributeProperty paddingAttributeProperty) {
        return paddingAttributeProperty.getValue().accept(this);
    }

    @Override
    public String visit(TextAlignProperty textAlignProperty) {
        return textAlignProperty.getValue().toString();
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
        StringBuilder value = new StringBuilder();
        value.append("color: ").append(titleColorProperty.getValue()).append(";");

        return value.toString();
    }

    @Override
    public String visit(TitleProperty titleProperty) {

        // extract title content
        String titleValue = titleProperty.getValue().replace("\"", "").replace("'", "");

        StringBuilder title = new StringBuilder("<h3>");
        title.append(titleValue);
        title.append("</h3>");

        return title.toString();
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
        StringBuilder value = new StringBuilder();
        value.append("width: ");
        value.append(widthProperty.getValue()).append("px").append(";");

        return value.toString();
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
        return containerContentAlignmentProperty.getContentAlignmentValue().toString();
    }

    @Override
    public String visit(DecorationProperty decorationProperty) {
        return decorationProperty.getWidget().accept(this);
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
        return String.valueOf(expandedFlexProperty.getValue());
    }

    @Override
    public String visit(AppBarProperty appBarProperty) {
        // HTML code.
        return appBarProperty.getValue().accept(this);
    }

    @Override
    public String visit(BodyProperty bodyProperty) {

        // HTML code.
        return bodyProperty.getValue().accept(this);
    }

    @Override
    public String visit(TextContent textContent) {
        return textContent.getValue();
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
        // extract props
        List<Property> propertyList = If.getProperties();
        int childIndex = -1;
        for (int i = 0; i < propertyList.size(); i++) {
            if (propertyList.get(i).getName().equals("condition")) {
                if (propertyList.get(i).accept(this).equals("false")) {
                    return "";
                }
            } else if (propertyList.get(i).getName().equals("child")) {
                childIndex = i;
            }
        }
        if (childIndex != -1) {
            return propertyList.get(childIndex).accept(this);
        }
        return "";
    }

    @Override
    public String visit(FOR For) {
        return null;
    }

    @Override
    public String visit(ConditionProperty conditionProperty) {
        return conditionProperty.getExpression().getValue().toString();
    }

    @Override
    public String visit(IterationsProperty iterationsProperty) {
        return null;
    }

    @Override
    public String visit(Navigation navigation) {
        StringBuilder code = new StringBuilder();
        code.append("window.location.assign('").append(navigation.getDestination().replace("\"", "")).append("')");

        return code.toString();
    }

    @Override
    public String visit(PopUp popUp) {
        StringBuilder code = new StringBuilder();
        code.append("alert('").append(popUp.getMessage().replace("\"", "")).append("')");

        return code.toString();
    }

    @Override
    public String visit(VideoPlayer videoPlayer) {
        StringBuilder code = new StringBuilder("<video ");
        List<Property> properties = videoPlayer.getProperties();

        StringBuilder styles = new StringBuilder("style=\" ");
        StringBuilder src = new StringBuilder();

        for (Property property : properties) {
            if (!property.getName().equals("src")) {
                styles.append(property.accept(this)).append(" ");
            } else {
                src.append(property.accept(this));
            }
        }

        code.append(src).append(" ");
        code.append(styles.append("\""));

        code.append(" controls >");

        code.append("</video>");

        return code.toString();
    }

    @Override
    public String visit(SrcProperty srcProperty) {
        StringBuilder src = new StringBuilder();
        src.append("src=").append(srcProperty.getValue());

        return src.toString();
    }
}
