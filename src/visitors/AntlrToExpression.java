package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import enums.TokenType;
import expressions.*;
import expressions.primary.PrimaryLiteralExpression;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import properties.Property;
import statements.VariableAssignmentStatement;

import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;
import java.util.Objects;

public class AntlrToExpression extends DartParserBaseVisitor<Expression> {

    private final IAntlrObjectFactory factory;
    private List<String> semanticError;

    public AntlrToExpression(IAntlrObjectFactory factory, List<String> semanticError) {
        this.factory = factory;
        this.semanticError = semanticError;
    }


    @Override
    public Expression visitExpressionList(DartParser.ExpressionListContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressions = new ArrayList<>();

        List<DartParser.ExpressionContext> expressionContextList = ctx.expression();

        for (DartParser.ExpressionContext expressionContext : expressionContextList) {
            Expression expression = visit(expressionContext);
            expressions.add(expression);
        }

        return new ExpressionListExpression(expressions, String.valueOf(lineNumber), expressions.get(expressions.size() - 1).getValue());
    }

    @Override
    public Expression visitLogicalOrExpression(DartParser.LogicalOrExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.LogicalAndExpressionContext> logicalAndExpressionContextList = ctx.logicalAndExpression();

        for (DartParser.LogicalAndExpressionContext logicalAndExpressionContext : logicalAndExpressionContextList) {
            Expression expression = visit(logicalAndExpressionContext);
            expressionList.add(expression);
        }

        boolean result = false;
        for (Expression expression : expressionList) {
            Object value = expression.getValue();
            result = result || (Boolean) value;
        }

        return new LogicalOrExpression(expressionList, String.valueOf(lineNumber), result);
    }

    @Override
    public Expression visitLogicalAndExpression(DartParser.LogicalAndExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.EqualityExpressionContext> equalityExpressionContextList = ctx.equalityExpression();

        for (DartParser.EqualityExpressionContext equalityExpressionContext : equalityExpressionContextList) {
            Expression expression = visit(equalityExpressionContext);
            expressionList.add(expression);
        }

        boolean result = true;
        for (Expression expression : expressionList) {
            Object value = expression.getValue();
            result = result && (Boolean) value;
        }

        return new LogicalAndExpression(expressionList, String.valueOf(lineNumber), result);
    }

    @Override
    public Expression visitEqualityExpression(DartParser.EqualityExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.RelationalExpressionContext> relationalExpressionContextList = ctx.relationalExpression();

        for (DartParser.RelationalExpressionContext relationalExpressionContext : relationalExpressionContextList) {
            Expression expression = visit(relationalExpressionContext);
            expressionList.add(expression);
        }

        if (expressionList.size() > 1) {
            TokenType tokenType = TokenType.fromSymbol(ctx.getChild(1).getText());

            Object value1 = expressionList.get(0).getValue();
            Object value2 = expressionList.get(1).getValue();

            if ((value1 instanceof Boolean && value2 instanceof Number) || (value1 instanceof Number && value2 instanceof Boolean)) {
                //TODO Handle type mismatch error
                return null;
            } else {
                boolean result = switch (tokenType) {
                    case EQUALS -> Objects.equals(value1, value2);
                    case NOT_EQUALS -> !Objects.equals(value1, value2);
                    default -> false;
                };
                return new EqualityExpression(expressionList.get(0), expressionList.get(1), tokenType, String.valueOf(lineNumber), result);
            }
        } else {
            return expressionList.get(0);
        }
    }


    @Override
    public Expression visitRelationalExpression(DartParser.RelationalExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.AdditiveExpressionContext> additiveExpressionContextList = ctx.additiveExpression();

        for (DartParser.AdditiveExpressionContext additiveExpressionContext : additiveExpressionContextList) {
            Expression expression = visit(additiveExpressionContext);

            expressionList.add(expression);
        }
        if (expressionList.size() > 1) {
            TokenType tokenType = TokenType.fromSymbol(ctx.getChild(1).getText());

            Object value1 = expressionList.get(0).getValue();
            Object value2 = expressionList.get(1).getValue();

            boolean result = false;
            if (value1 instanceof String || value2 instanceof String) {
                String str1 = String.valueOf(value1);
                String str2 = String.valueOf(value2);
                int comparisonResult = str1.compareTo(str2);
                switch (tokenType) {
                    case LESS_THAN -> result = comparisonResult < 0;
                    case LESS_THAN_OR_EQUALS -> result = comparisonResult <= 0;
                    case GREATER_THAN -> result = comparisonResult > 0;
                    case GREATER_THAN_OR_EQUALS -> result = comparisonResult >= 0;
                }
            } else if (value1 instanceof Number && value2 instanceof Number) {
                double num1 = ((Number) value1).doubleValue();
                double num2 = ((Number) value2).doubleValue();
                int comparisonResult = Double.compare(num1, num2);
                switch (tokenType) {
                    case LESS_THAN -> result = comparisonResult < 0;
                    case LESS_THAN_OR_EQUALS -> result = comparisonResult <= 0;
                    case GREATER_THAN -> result = comparisonResult > 0;
                    case GREATER_THAN_OR_EQUALS -> result = comparisonResult >= 0;
                }
            } else {
                // TODO Handle type error
            }
            return new RelationalExpression(expressionList.get(0), expressionList.get(1), tokenType, String.valueOf(lineNumber), result);
        } else {
            return expressionList.get(0);
        }
    }

    @Override
    public Expression visitAdditiveExpression(DartParser.AdditiveExpressionContext ctx) {

        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();
        List<TokenType> tokenTypeList = new ArrayList<>();

        List<DartParser.MultiplicativeExpressionContext> multiplicativeExpressionContextList = ctx.multiplicativeExpression();

        for (DartParser.MultiplicativeExpressionContext multiplicativeExpressionContext : multiplicativeExpressionContextList) {
            Expression expression = visit(multiplicativeExpressionContext);
            expressionList.add(expression);
        }

        if (expressionList.size() > 1) {

            for (int i = 1; i < expressionList.size() - 1; i += 2) {
                tokenTypeList.add(
                        TokenType.fromSymbol(ctx.getChild(i).getText()));
            }
            Number result = (Number) expressionList.get(0).value;

            for (int i = 0; i < tokenTypeList.size(); i++) {  // Step 2
                TokenType tokenType = tokenTypeList.get(i);
                Number nextExpression = (Number) expressionList.get(i + 1).value;

                if (tokenType == TokenType.PLUS) {
                    result = result.doubleValue() + nextExpression.doubleValue();
                } else if (tokenType == TokenType.MINUS) {
                    result = result.doubleValue() - nextExpression.doubleValue();
                }
            }
            return new AdditiveExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), result);
        } else {
            return expressionList.get(0);
        }

    }


    @Override
    public Expression visitMultiplicativeExpression(DartParser.MultiplicativeExpressionContext ctx) {
        int lineNumber = ctx.getStart().getLine();

        List<Expression> expressionList = new ArrayList<>();

        List<DartParser.PrimaryContext> primaryContextList = ctx.primary();

        for (DartParser.PrimaryContext primaryContext : primaryContextList) {
            Expression expression = visit(primaryContext);
            expressionList.add(expression);
        }

        if (expressionList.size() > 1) {
            List<TokenType> tokenTypeList = new ArrayList<>();
            for (int i = 1; i < expressionList.size() - 1; i += 2) {
                tokenTypeList.add(
                        TokenType.fromSymbol(ctx.getChild(i).getText()));
            }

            Number result = (Number) expressionList.get(0).value;

            for (int i = 0; i < tokenTypeList.size(); i++) {
                TokenType tokenType = tokenTypeList.get(i);
                Number nextExpression = (Number) expressionList.get(i + 1).value;

                if (tokenType == TokenType.STAR) {
                    result = result.doubleValue() * nextExpression.doubleValue();
                } else if (tokenType == TokenType.SLASH) {
                    result = result.doubleValue() / nextExpression.doubleValue();
                }
            }
            return new MultiplicativeExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), result);
        } else {
            return expressionList.get(0);
        }
    }

    @Override
    public Expression visitPrimaryExpressionExpression(DartParser.PrimaryExpressionExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Expression visitPrimaryLiteralExpression(DartParser.PrimaryLiteralExpressionContext ctx) {
        int lineNumber = ctx.getStart().getLine();

        Object variableValue = new Object();

        ParseTree child = ctx.getChild(0);
        if (child instanceof TerminalNode terminalNode) {
            Token token = terminalNode.getSymbol();
            int tokenType = token.getType();
            if (tokenType == DartParser.NUM) {
                variableValue = Integer.parseInt(token.getText());
            } else if (tokenType == DartParser.STRING) {
                variableValue = token.getText();
            } else if (tokenType == DartParser.FLOAT) {
                variableValue = Double.parseDouble(token.getText());
            } else if (tokenType == DartParser.HEX_NUM) {
                variableValue = Long.parseLong(token.getText(), 16);
            } else if (tokenType == DartParser.BOOLEAN) {
                variableValue = Boolean.parseBoolean(token.getText());
            }
        }
        return new PrimaryLiteralExpression(String.valueOf(lineNumber), variableValue);
    }

    @Override
    public Expression visitPrimaryIdentifierExpression(DartParser.PrimaryIdentifierExpressionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        //TODO get identifier value from ST
        return new PrimaryLiteralExpression(String.valueOf(lineNumber), ctx.getChild(0).getText());
    }
}
