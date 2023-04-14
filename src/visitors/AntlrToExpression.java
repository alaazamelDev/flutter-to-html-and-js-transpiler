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

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressions = new ArrayList<>();

        List<DartParser.ExpressionContext> expressionContextList = ctx.expression();

        for(DartParser.ExpressionContext expressionContext : expressionContextList){
            Expression expression = visit(expressionContext);

            expressions.add(expression);
        }

        return new ExpressionListExpression(expressions,String.valueOf(lineNumber));
    }

    @Override
    public Expression visitLogicalOrExpression(DartParser.LogicalOrExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.LogicalAndExpressionContext> logicalAndExpressionContextList = ctx.logicalAndExpression();

        for(DartParser.LogicalAndExpressionContext logicalAndExpressionContext : logicalAndExpressionContextList){
            Expression expression = visit(logicalAndExpressionContext);
            expressionList.add(expression);
        }
        return new LogicalOrExpression(expressionList,String.valueOf(lineNumber));
    }

    @Override
    public Expression visitLogicalAndExpression(DartParser.LogicalAndExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.EqualityExpressionContext> equalityExpressionContextList = ctx.equalityExpression();

        for(DartParser.EqualityExpressionContext equalityExpressionContext : equalityExpressionContextList){
            Expression expression = visit(equalityExpressionContext);
            expressionList.add(expression);
        }
       return new LogicalAndExpression(expressionList,String.valueOf(lineNumber));
    }

    @Override
    public Expression visitEqualityExpression(DartParser.EqualityExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.RelationalExpressionContext> relationalExpressionContextList = ctx.relationalExpression();

        for(DartParser.RelationalExpressionContext relationalExpressionContext : relationalExpressionContextList){
            Expression expression = visit(relationalExpressionContext);
            expressionList.add(expression);
        }
        if(expressionList.size()>1){
            TokenType tokenType = TokenType.fromSymbol(ctx.getChild(1).getText());
            return new EqualityExpression(expressionList.get(0), expressionList.get(1),tokenType,String.valueOf(lineNumber));
        }
        else {
            return new EqualityExpression(expressionList.get(0), null,null,String.valueOf(lineNumber));
        }
    }

    @Override
    public Expression visitRelationalExpression(DartParser.RelationalExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.AdditiveExpressionContext> additiveExpressionContextList = ctx.additiveExpression();

        for(DartParser.AdditiveExpressionContext additiveExpressionContext : additiveExpressionContextList){
            Expression expression = visit(additiveExpressionContext);

            expressionList.add(expression);
        }
        if(expressionList.size()>1){
            TokenType tokenType = TokenType.fromSymbol(ctx.getChild(1).getText());
            return new RelationalExpression(expressionList.get(0), expressionList.get(1),tokenType,String.valueOf(lineNumber));
        }
        else {
            return new RelationalExpression(expressionList.get(0), null,null,String.valueOf(lineNumber));
        }
    }

    @Override
    public Expression visitAdditiveExpression(DartParser.AdditiveExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.AdditiveExpressionContext> additiveExpressionContextList = ctx.multiplicativeExpression();

        for(DartParser.AdditiveExpressionContext additiveExpressionContext : additiveExpressionContextList){
            Expression expression = visit(additiveExpressionContext);
            expressionList.add(expression);
        }
        if(expressionList.size()>1){
            TokenType tokenType = TokenType.fromSymbol(ctx.getChild(1).getText());
            return new RelationalExpression(expressionList.get(0), expressionList.get(1),tokenType,String.valueOf(lineNumber));
        }
        else {
            return new RelationalExpression(expressionList.get(0), null,null,String.valueOf(lineNumber));
        }
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
