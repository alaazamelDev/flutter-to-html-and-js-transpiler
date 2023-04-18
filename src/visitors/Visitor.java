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
import widgets.*;

public interface Visitor<T> {

    public T visit(Program program);

    public T visit(AppBar appBar);

    public T visit(Border border);

    public T visit(BorderRadiusCircular borderRadiusCircular);

    public T visit(BorderRadiusOnly borderRadiusOnly);

    public T visit(BoxDecorationWidget boxDecorationWidget);

    public T visit(Button button);

    public T visit(Center center);

    public T visit(Column column);

    public T visit(Container container);

    public T visit(CustomWidget customWidget);

    public T visit(EdgeInsetsOnly edgeInsetsOnly);

    public T visit(EdgeInsetsSymmetric edgeInsetsSymmetric);

    public T visit(Expanded expanded);

    public T visit(GestureDetector gestureDetector);

    public T visit(Image image);

    public T visit(Padding padding);

    public T visit(Row row);

    public T visit(Scaffold scaffold);

    public T visit(Text text);

    public T visit(TextField textField);

    public T visit(BackgroundColorProperty backgroundColorProperty);

    public T visit(BorderProperty borderProperty);

    public T visit(CenterTitleProperty centerTitleProperty);

    public T visit(Children children);

    public T visit(ChildWidgetProperty childWidgetProperty);

    public T visit(ColorProperty colorProperty);

    public T visit(ContentAlignmentObjectProperty contentAlignmentObjectProperty);

    public T visit(CrossAxisAlignmentProperty crossAxisAlignmentProperty);

    public T visit(CustomWidgetProperty customWidgetProperty);

    public T visit(DecorationWidgetProperty decorationWidgetProperty);

    public T visit(FitProperty fitProperty);

    public T visit(Flex flex);

    public T visit(FontSizeProperty fontSizeProperty);

    public T visit(FontWeightProperty fontWeightProperty);

    public T visit(HeightProperty heightProperty);

    public T visit(HintProperty hintProperty);

    public T visit(Horizontal horizontal);

    public T visit(LabelProperty labelProperty);

    public T visit(LetterSpacingProperty letterSpacingProperty);

    public T visit(MainAxisSizeObjectProperty mainAxisSizeObjectProperty);

    public T visit(OnChangedProperty onChangedProperty);

    public T visit(OnPressedProperty onPressedProperty);

    public T visit(PaddingAttributeProperty paddingAttributeProperty);

    public T visit(TextAlignProperty textAlignProperty);

    public T visit(TextColorProperty textColorProperty);

    public T visit(ThicknessProperty thicknessProperty);

    public T visit(TitleColorProperty titleColorProperty);

    public T visit(TitleProperty titleProperty);

    public T visit(TopLeftIntProperty topLeftIntProperty);

    public T visit(TopRightIntProperty topRightIntProperty);

    public T visit(UrlProperty urlProperty);

    public T visit(ValueProperty valueProperty);

    public T visit(Vertical vertical);

    public T visit(WidthProperty widthProperty);

    public T visit(borderRadiusCircularRadiusProperty borderRadiusCircularRadiusProperty);

    public T visit(BottomLeftProperty bottomLeftProperty);

    public T visit(BottomRightProperty bottomRightProperty);

    public T visit(TopLeftProperty topLeftProperty);

    public T visit(TopRightProperty topRightProperty);

    public T visit(BorderRadiusProperty borderRadiusProperty);

    public T visit(ContainerContentAlignmentProperty containerContentAlignmentProperty);

    public T visit(DecorationProperty decorationProperty);

    public T visit(Left left);

    public T visit(Right right);

    public T visit(Bottom bottom);

    public T visit(Top top);

    public T visit(ExpandedFlexProperty expandedFlexProperty);

    public T visit(AppBarProperty appBarProperty);

    public T visit(BodyProperty bodyProperty);

    public T visit(TextContent textContent);

    public T visit(CustomWidgetDeclarationStatement customWidgetDeclarationStatement);

    public T visit(VariableAssignmentStatement variableAssignmentStatement);

    public T visit(VariableDeclarationStatement variableDeclarationStatement);

    public T visit(LogicalAndExpression logicalAndExpression);

    public T visit(LogicalOrExpression logicalOrExpression);

    public T visit(EqualityExpression equalityExpression);

    public T visit(RelationalExpression relationalExpression);

    public T visit(ExpressionListExpression expressionList);

    public T visit(MultiplicativeExpression multiplicativeExpression);

    public T visit(AdditiveExpression additiveExpression);

    public T visit(LiteralExpression literalExpression);

    public T visit(PrimaryIdentifierExpression primaryIdentifierExpression);

    public T visit(PrimaryLiteralExpression primaryLiteralExpression);

    public T visit(IF If);

    public T visit(FOR For);

    public T visit(ConditionProperty conditionProperty);

    public T visit(IterationsProperty iterationsProperty);

    public T visit(Navigation navigation);

    public T visit(PopUp popUp);
}
