package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import enums.TokenType;
import expressions.*;
import interfaces.IAntlrObjectFactory;
import properties.Property;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpression extends DartParserBaseVisitor<Expression> {

    private final IAntlrObjectFactory factory;
    private List<String> semanticError;

    public AntlrToExpression(IAntlrObjectFactory factory,List<String> semanticError) {
        this.factory = factory;
        this.semanticError=semanticError;
    }


    @Override
    public Expression visitExpressionList(DartParser.ExpressionListContext ctx) {
        AntlrToExpression antlrToExpressionVisitor = factory.createAntlrToExpression(semanticError);

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressions = new ArrayList<>();

        List<DartParser.ExpressionContext> expressionContextList = ctx.expression();

        for(DartParser.ExpressionContext expressionContext : expressionContextList){
            Expression expression = antlrToExpressionVisitor.visit(expressionContext);

            expressions.add(expression);
        }

        return new ExpressionListExpression(expressions,String.valueOf(lineNumber));
    }

    @Override
    public Expression visitLogicalOrExpression(DartParser.LogicalOrExpressionContext ctx) {
        AntlrToExpression antlrToExpressionVisitor = factory.createAntlrToExpression(semanticError);

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.LogicalAndExpressionContext> logicalAndExpressionContextList = ctx.logicalAndExpression();

        for(DartParser.LogicalAndExpressionContext logicalAndExpressionContext : logicalAndExpressionContextList){
            Expression expression = antlrToExpressionVisitor.visit(logicalAndExpressionContext);
            expressionList.add(expression);
        }
        if(expressionList.size()>1){
            return new LogicalOrExpression(expressionList.get(0), expressionList.get(1),String.valueOf(lineNumber));
        }
        else {
            return new LogicalOrExpression(expressionList.get(0), null,String.valueOf(lineNumber));

        }
    }

    @Override
    public Expression visitLogicalAndExpression(DartParser.LogicalAndExpressionContext ctx) {
        AntlrToExpression antlrToExpressionVisitor = factory.createAntlrToExpression(semanticError);

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.EqualityExpressionContext> equalityExpressionContextList = ctx.equalityExpression();

        for(DartParser.EqualityExpressionContext equalityExpressionContext : equalityExpressionContextList){
            Expression expression = antlrToExpressionVisitor.visit(equalityExpressionContext);
            expressionList.add(expression);
        }
        if(expressionList.size()>1){
            return new LogicalAndExpression(expressionList.get(0), expressionList.get(1),String.valueOf(lineNumber));
        }
        else {
            return new LogicalOrExpression(expressionList.get(0), null,String.valueOf(lineNumber));
        }
    }

    @Override
    public Expression visitEqualityExpression(DartParser.EqualityExpressionContext ctx) {
        AntlrToExpression antlrToExpressionVisitor = factory.createAntlrToExpression(semanticError);

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.RelationalExpressionContext> relationalExpressionContextList = ctx.relationalExpression();

        for(DartParser.RelationalExpressionContext relationalExpressionContext : relationalExpressionContextList){
            Expression expression = antlrToExpressionVisitor.visit(relationalExpressionContext);
            expressionList.add(expression);
        }
        if(expressionList.size()>1){
            TokenType tokenType = TokenType.fromSymbol(ctx.EE().getSymbol().getText());
            return new EqualityExpression(expressionList.get(0), expressionList.get(1),tokenType,String.valueOf(lineNumber));
        }
        else {
            return new EqualityExpression(expressionList.get(0), null,null,String.valueOf(lineNumber));
        }
    }

    @Override
    public Expression visitRelationalExpression(DartParser.RelationalExpressionContext ctx) {
        return super.visitRelationalExpression(ctx);
    }

    @Override
    public Expression visitAdditiveExpression(DartParser.AdditiveExpressionContext ctx) {
        return super.visitAdditiveExpression(ctx);
    }

    @Override
    public Expression visitMultiplicativeExpression(DartParser.MultiplicativeExpressionContext ctx) {
        return super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public Expression visitPrimary(DartParser.PrimaryContext ctx) {
        return super.visitPrimary(ctx);
    }
}
