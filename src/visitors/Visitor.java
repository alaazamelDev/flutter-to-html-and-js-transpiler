package visitors;

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
import widgets.*;

public interface Visitor {
    public void visit(AppBar appBar, String parent);

    public void visit(Border border, String parent);

    public void visit(BorderRadiusCircular borderRadiusCircular, String parent);

    public void visit(BorderRadiusOnly borderRadiusOnly, String parent);

    public void visit(BoxDecorationWidget boxDecorationWidget, String parent);

    public void visit(Button button, String parent);

    public void visit(Center center, String parent);

    public void visit(Column column, String parent);

    public void visit(Container container, String parent);

    public void visit(CustomWidget customWidget, String parent);

    public void visit(EdgeInsetsOnly edgeInsetsOnly, String parent);

    public void visit(EdgeInsetsSymmetric edgeInsetsSymmetric, String parent);

    public void visit(Expanded expanded, String parent);

    public void visit(GestureDetector gestureDetector, String parent);

    public void visit(Image image, String parent);

    public void visit(Padding padding, String parent);

    public void visit(Row row, String parent);

    public void visit(Scaffold scaffold, String parent);

    public void visit(Text text, String parent);

    public void visit(TextField textField, String parent);

    public void visit(BackgroundColorProperty backgroundColorProperty, String parent);

    public void visit(BorderProperty borderProperty, String parent);

    public void visit(CenterTitleProperty centerTitleProperty, String parent);

    public void visit(Children children, String parent);

    public void visit(ChildWidgetProperty childWidgetProperty, String parent);

    public void visit(ColorProperty colorProperty, String parent);

    public void visit(ContentAlignmentObjectProperty contentAlignmentObjectProperty, String parent);

    public void visit(CrossAxisAlignmentProperty crossAxisAlignmentProperty, String parent);

    public void visit(CustomWidgetProperty customWidgetProperty, String parent);

    public void visit(DecorationWidgetProperty decorationWidgetProperty, String parent);

    public void visit(FitProperty fitProperty, String parent);

    public void visit(Flex flex, String parent);

    public void visit(FontSizeDoubleProperty fontSizeDoubleProperty, String parent);

    public void visit(FontWeightObjectProperty fontWeightObjectProperty, String parent);

    public void visit(HeightProperty heightProperty, String parent);

    public void visit(HintProperty hintProperty, String parent);

    public void visit(Horizontal horizontal, String parent);

    public void visit(LabelProperty labelProperty, String parent);

    public void visit(LetterSpacingDoubleProperty letterSpacingDoubleProperty, String parent);

    public void visit(MainAxisSizeObjectProperty mainAxisSizeObjectProperty, String parent);

    public void visit(OnChangedProperty onChangedProperty, String parent);

    public void visit(OnPressedProperty onPressedProperty, String parent);

    public void visit(PaddingAttributeProperty paddingAttributeProperty, String parent);

    public void visit(TextAlignObjectProperty textAlignObjectProperty, String parent);

    public void visit(TextColorProperty textColorProperty, String parent);

    public void visit(ThicknessProperty thicknessProperty, String parent);

    public void visit(TitleColorProperty titleColorProperty, String parent);

    public void visit(TitleProperty titleProperty, String parent);

    public void visit(TopLeftIntProperty topLeftIntProperty, String parent);

    public void visit(TopRightIntProperty topRightIntProperty, String parent);

    public void visit(UrlProperty urlProperty, String parent);

    public void visit(ValueProperty valueProperty, String parent);

    public void visit(Vertical vertical, String parent);

    public void visit(WidthProperty widthProperty, String parent);

    public void visit(RadiusProperty radiusProperty, String parent);
////////////////////////////////////////////////////////////////////////////////
    public void visit(BottomLeftProperty bottomLeftProperty, String parent);

    public void visit(BottomRightProperty bottomRightProperty, String parent);

    public void visit(TopLeftProperty topLeftProperty, String parent);

    public void visit(TopRightProperty topRightProperty, String parent);

    public void visit(BorderRadiusProperty borderRadiusProperty, String parent);

    public void visit(ContainerContentAlignmentProperty containerContentAlignmentProperty, String parent);

    public void visit(DecorationProperty decorationProperty, String parent);

    public void visit(Left left, String parent);

    public void visit(Right right, String parent);

    public void visit(Bottom bottom, String parent);

    public void visit(Top top, String parent);

    //inside edgeInsetsSyme
//    public void visit(Horizontal horizontal, String parent);
//    public  void visit (Vertical vertical, String parent);

    public void visit(ExpandedFlexProperty expandedFlexProperty, String parent);

    public void visit(AppBarProperty appBarProperty, String parent);

    public void visit(BodyProperty bodyProperty, String parent);

    public void visit(TextContent textContent, String parent);



}
