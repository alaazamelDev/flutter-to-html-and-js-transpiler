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

public class AstBaseVisitor<T> implements Visitor<T>{
    @Override
    public T visit(LogicalAndExpression logicalAndExpression) {
        return null;
    }

    @Override
    public T visit(LogicalOrExpression logicalOrExpression) {
        return null;
    }

    @Override
    public T visit(EqualityExpression equalityExpression) {
        return null;
    }

    @Override
    public T visit(RelationalExpression relationalExpression) {
        return null;
    }

    @Override
    public T visit(ExpressionListExpression expressionList) {
        return null;
    }

    @Override
    public T visit(MultiplicativeExpression multiplicativeExpression) {
        return null;
    }

    @Override
    public T visit(AdditiveExpression additiveExpression) {
        return null;
    }

    @Override
    public T visit(LiteralExpression literalExpression) {
        return null;
    }

    @Override
    public T visit(PrimaryIdentifierExpression primaryIdentifierExpression) {
        return null;
    }

    @Override
    public T visit(PrimaryLiteralExpression primaryLiteralExpression) {
        return null;
    }

    @Override
    public T visit(IF If) {
        return null;
    }

    @Override
    public T visit(FOR For) {
        return null;
    }

    @Override
    public T visit(ConditionProperty conditionProperty) {
        return null;
    }

    @Override
    public T visit(IterationsProperty iterationsProperty) {
        return null;
    }

    @Override
    public T visit(Navigation navigation) {
        return null;
    }

    @Override
    public T visit(PopUp popUp) {
        return null;
    }

    @Override
    public T visit(VideoPlayer videoPlayer) {
        return null;
    }

    @Override
    public T visit(SrcProperty srcProperty) {
        return null;
    }

    @Override
    public T visit(ScaffoldName scaffoldName) {
        return null;
    }

    @Override
    public T visit(Form form) {
        return null;
    }

    @Override
    public T visit(OnSubmitProperty onSubmitProperty) {
        return null;
    }

    @Override
    public T visit(IdProperty idProperty) {
        return null;
    }

    @Override
    public T visit(SetState setState) {
        return null;
    }

    @Override
    public T visit(GetState getState) {
        return null;
    }

    @Override
    public T visit(ItemValue itemValue) {
        return null;
    }

    @Override
    public T visit(SetValueProperty setValueProperty) {
        return null;
    }

    @Override
    public T visit(SetValueStatement setValueStatement) {
        return null;
    }

    @Override
    public T visit(Program program) {
        return null;
    }

    @Override
    public T visit(AppBar appBar) {
        return null;
    }

    @Override
    public T visit(Border border) {
        return null;
    }

    @Override
    public T visit(BorderRadiusCircular borderRadiusCircular) {
        return null;
    }

    @Override
    public T visit(BorderRadiusOnly borderRadiusOnly) {
        return null;
    }

    @Override
    public T visit(BoxDecorationWidget boxDecorationWidget) {
        return null;
    }

    @Override
    public T visit(Button button) {
        return null;
    }

    @Override
    public T visit(Center center) {
        return null;
    }

    @Override
    public T visit(Column column) {
        return null;
    }

    @Override
    public T visit(Container container) {
        return null;
    }

    @Override
    public T visit(CustomWidget customWidget) {
        return null;
    }

    @Override
    public T visit(EdgeInsetsOnly edgeInsetsOnly) {
        return null;
    }

    @Override
    public T visit(EdgeInsetsSymmetric edgeInsetsSymmetric) {
        return null;
    }

    @Override
    public T visit(Expanded expanded) {
        return null;
    }

    @Override
    public T visit(GestureDetector gestureDetector) {
        return null;
    }

    @Override
    public T visit(Image image) {
        return null;
    }

    @Override
    public T visit(Padding padding) {
        return null;
    }

    @Override
    public T visit(Row row) {
        return null;
    }

    @Override
    public T visit(Scaffold scaffold) {
        return null;
    }

    @Override
    public T visit(Text text) {
        return null;
    }

    @Override
    public T visit(TextField textField) {
        return null;
    }

    @Override
    public T visit(BackgroundColorProperty backgroundColorProperty) {
        return null;
    }

    @Override
    public T visit(properties.appbar.BackgroundColorProperty backgroundColorProperty) {
        return null;
    }

    @Override
    public T visit(BorderProperty borderProperty) {
        return null;
    }

    @Override
    public T visit(CenterTitleProperty centerTitleProperty) {
        return null;
    }

    @Override
    public T visit(Children children) {
        return null;
    }

    @Override
    public T visit(ChildWidgetProperty childWidgetProperty) {
        return null;
    }

    @Override
    public T visit(ColorProperty colorProperty) {
        return null;
    }

    @Override
    public T visit(ContentAlignmentObjectProperty contentAlignmentObjectProperty) {
        return null;
    }

    @Override
    public T visit(CrossAxisAlignmentProperty crossAxisAlignmentProperty) {
        return null;
    }

    @Override
    public T visit(CustomWidgetProperty customWidgetProperty) {
        return null;
    }

    @Override
    public T visit(DecorationWidgetProperty decorationWidgetProperty) {
        return null;
    }

    @Override
    public T visit(FitProperty fitProperty) {
        return null;
    }

    @Override
    public T visit(Flex flex) {
        return null;
    }

    @Override
    public T visit(FontSizeProperty fontSizeProperty) {
        return null;
    }

    @Override
    public T visit(FontWeightProperty fontWeightProperty) {
        return null;
    }

    @Override
    public T visit(HeightProperty heightProperty) {
        return null;
    }

    @Override
    public T visit(HintProperty hintProperty) {
        return null;
    }

    @Override
    public T visit(Horizontal horizontal) {
        return null;
    }

    @Override
    public T visit(LabelProperty labelProperty) {
        return null;
    }

    @Override
    public T visit(LetterSpacingProperty letterSpacingProperty) {
        return null;
    }

    @Override
    public T visit(MainAxisSizeObjectProperty mainAxisSizeObjectProperty) {
        return null;
    }

    @Override
    public T visit(OnChangedProperty onChangedProperty) {
        return null;
    }

    @Override
    public T visit(OnPressedProperty onPressedProperty) {
        return null;
    }

    @Override
    public T visit(PaddingAttributeProperty paddingAttributeProperty) {
        return null;
    }

    @Override
    public T visit(TextAlignProperty textAlignProperty) {
        return null;
    }

    @Override
    public T visit(TextColorProperty textColorProperty) {
        return null;
    }

    @Override
    public T visit(ThicknessProperty thicknessProperty) {
        return null;
    }

    @Override
    public T visit(TitleColorProperty titleColorProperty) {
        return null;
    }

    @Override
    public T visit(TitleProperty titleProperty) {
        return null;
    }

    @Override
    public T visit(TopLeftIntProperty topLeftIntProperty) {
        return null;
    }

    @Override
    public T visit(TopRightIntProperty topRightIntProperty) {
        return null;
    }

    @Override
    public T visit(UrlProperty urlProperty) {
        return null;
    }

    @Override
    public T visit(ValueProperty valueProperty) {
        return null;
    }

    @Override
    public T visit(Vertical vertical) {
        return null;
    }

    @Override
    public T visit(WidthProperty widthProperty) {
        return null;
    }

    @Override
    public T visit(borderRadiusCircularRadiusProperty borderRadiusCircularRadiusProperty) {
        return null;
    }

    @Override
    public T visit(BottomLeftProperty bottomLeftProperty) {
        return null;
    }

    @Override
    public T visit(BottomRightProperty bottomRightProperty) {
        return null;
    }

    @Override
    public T visit(TopLeftProperty topLeftProperty) {
        return null;
    }

    @Override
    public T visit(TopRightProperty topRightProperty) {
        return null;
    }

    @Override
    public T visit(BorderRadiusProperty borderRadiusProperty) {
        return null;
    }

    @Override
    public T visit(ContainerContentAlignmentProperty containerContentAlignmentProperty) {
        return null;
    }

    @Override
    public T visit(DecorationProperty decorationProperty) {
        return null;
    }

    @Override
    public T visit(Left left) {
        return null;
    }

    @Override
    public T visit(Right right) {
        return null;
    }

    @Override
    public T visit(Bottom bottom) {
        return null;
    }

    @Override
    public T visit(Top top) {
        return null;
    }

    @Override
    public T visit(ExpandedFlexProperty expandedFlexProperty) {
        return null;
    }

    @Override
    public T visit(AppBarProperty appBarProperty) {
        return null;
    }

    @Override
    public T visit(BodyProperty bodyProperty) {
        return null;
    }

    @Override
    public T visit(TextContent textContent) {
        return null;
    }

    @Override
    public T visit(CustomWidgetDeclarationStatement customWidgetDeclarationStatement) {
        return null;
    }

    @Override
    public T visit(VariableAssignmentStatement variableAssignmentStatement) {
        return null;
    }

    @Override
    public T visit(VariableDeclarationStatement variableDeclarationStatement) {
        return null;
    }
}
