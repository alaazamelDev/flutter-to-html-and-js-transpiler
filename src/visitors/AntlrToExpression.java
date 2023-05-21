package visitors;


import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import enums.TokenType;
import expressions.*;
import expressions.primary.PrimaryLiteralExpression;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import utils.Symbol;
import utils.SymbolTable;
import utils.UTIL;

import java.util.ArrayList;
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

        if (expressions.size() > 1) {
            return new ExpressionListExpression(expressions, String.valueOf(lineNumber), expressions.get(expressions.size() - 1).getValue());
        } else return expressions.get(0);
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

        if (expressionList.size() > 1) {
            boolean result = false;
            for (Expression expression : expressionList) {
                Object value = expression.getValue();
                result = result || (Boolean) value;
            }
            return new LogicalOrExpression(expressionList, String.valueOf(lineNumber), result);
        } else return expressionList.get(0);


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
        if (expressionList.size() > 1) {
            boolean result = true;
            for (Expression expression : expressionList) {
                Object value = expression.getValue();
                result = result && (Boolean) value;
            }
            return new LogicalAndExpression(expressionList, String.valueOf(lineNumber), result);
        } else return expressionList.get(0);

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


            //Handle type mismatch errors first
            if ((value1 instanceof Boolean && value2 instanceof Number) || (value1 instanceof Number && value2 instanceof Boolean)) {
                semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "comparing", "boolean", "number"));
                return new EqualityExpression(expressionList.get(0), expressionList.get(1), tokenType, String.valueOf(lineNumber), null);
            } else if ((value1 instanceof String && value2 instanceof Boolean) || (value1 instanceof Boolean && value2 instanceof String)) {
                semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "comparing", "boolean", "string"));
                return new EqualityExpression(expressionList.get(0), expressionList.get(1), tokenType, String.valueOf(lineNumber), null);

            } else if ((value1 instanceof String && value2 instanceof Number) || (value1 instanceof Number && value2 instanceof String)) {
                semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "comparing", "number", "string"));
                return new EqualityExpression(expressionList.get(0), expressionList.get(1), tokenType, String.valueOf(lineNumber), null);

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
            if (value1 instanceof String && value2 instanceof String) {
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
            } else if ((value1 instanceof Boolean && value2 instanceof Number) || (value1 instanceof Number && value2 instanceof Boolean)) {
                semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "comparing", "boolean", "number"));
                return new RelationalExpression(expressionList.get(0), expressionList.get(1), tokenType, String.valueOf(lineNumber), null);
            } else if ((value1 instanceof String && value2 instanceof Boolean) || (value1 instanceof Boolean && value2 instanceof String)) {
                semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "comparing", "boolean", "string"));
                return new RelationalExpression(expressionList.get(0), expressionList.get(1), tokenType, String.valueOf(lineNumber), null);

            } else if ((value1 instanceof String && value2 instanceof Number) || (value1 instanceof Number && value2 instanceof String)) {
                semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "comparing", "number", "string"));
                return new RelationalExpression(expressionList.get(0), expressionList.get(1), tokenType, String.valueOf(lineNumber), null);

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
            for (int i = 0; i < expressionList.size() - 1; i++) {
                tokenTypeList.add(
                        TokenType.fromSymbol(ctx.getChild(i * 2 + 1).getText()));
            }
            Object result = expressionList.get(0).getValue();


            for (int i = 0; i < tokenTypeList.size(); i++) {
                TokenType tokenType = tokenTypeList.get(i);
                Object nextExpression = expressionList.get(i + 1).getValue();

                if (result instanceof Number && nextExpression instanceof Number) {
                    if (tokenType == TokenType.PLUS) {
                        result = ((Number) result).doubleValue() + ((Number) nextExpression).doubleValue();
                    } else if (tokenType == TokenType.MINUS) {
                        result = ((Number) result).doubleValue() - ((Number) nextExpression).doubleValue();
                    }
                } else if (result instanceof String && nextExpression instanceof String) {
                    if (tokenType == TokenType.PLUS) {
                        result = ((String) result) + ((String) nextExpression);
                    } else if (tokenType == TokenType.MINUS) {
                        semanticError.add(UTIL.semanticStringMinusString(lineNumber, ctx.getStart().getCharPositionInLine() + 1));
                        return new AdditiveExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);

                    }
                } else if (result instanceof String && nextExpression instanceof Number) {
                    if (tokenType == TokenType.PLUS) {
                        semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "adding", "number", "string"));
                        return new AdditiveExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);

                    } else if (tokenType == TokenType.MINUS) {
                        semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "substracting", "number", "string"));
                        return new AdditiveExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);

                    }
                } else if (result instanceof Number && nextExpression instanceof String) {
                    if (tokenType == TokenType.PLUS) {
                        semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "adding", "string", "number"));
                        return new AdditiveExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);

                    } else if (tokenType == TokenType.MINUS) {
                        semanticError.add(UTIL.semanticExpressionTypeMismatch(lineNumber, ctx.getStart().getCharPositionInLine() + 1, "substracting", "string", "number"));
                        return new AdditiveExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);

                    }
                } else if (nextExpression instanceof Boolean || result instanceof Boolean) {
                    semanticError.add(UTIL.semanticBooleanInAdditiveExpression(lineNumber, ctx.getStart().getCharPositionInLine() + 1));
                    return new AdditiveExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);
                }
            }
            return new AdditiveExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), String.valueOf(result));

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
            for (int i = 0; i < expressionList.size() - 1; i++) {
                tokenTypeList.add(
                        TokenType.fromSymbol(ctx.getChild(i * 2 + 1).getText()));
            }
            Object result = expressionList.get(0).getValue();

            for (int i = 0; i < tokenTypeList.size(); i++) {
                TokenType tokenType = tokenTypeList.get(i);
                Object nextExpression = expressionList.get(i + 1).getValue();
                if (result instanceof Boolean || nextExpression instanceof Boolean) {
                    semanticError.add(UTIL.semanticBooleanInMultiplicativeExpression(lineNumber, ctx.getStart().getCharPositionInLine() + 1));
                    return new MultiplicativeExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);

                } else if (result instanceof String || nextExpression instanceof String) {
                    semanticError.add(UTIL.semanticStringInMultiplicativeExpression(lineNumber, ctx.getStart().getCharPositionInLine() + 1));
                    return new MultiplicativeExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);
                } else if (result instanceof Number && nextExpression instanceof Number) {
                    if (tokenType == TokenType.STAR) {
                        result = ((Number) result).doubleValue() * ((Number) nextExpression).doubleValue();
                    } else if (tokenType == TokenType.SLASH) {
                        result = ((Number) result).doubleValue() / ((Number) nextExpression).doubleValue();
                    }

                } else {
                    return new MultiplicativeExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), null);
                }
            }
            return new MultiplicativeExpression(expressionList, tokenTypeList, String.valueOf(lineNumber), ((Number) result));

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

        DartParser.LiteralContext literalContext = ctx.literal();
        if (literalContext != null) {
            Token token = literalContext.getStart();
            int tokenType = token.getType();
            if (tokenType == DartParser.NUM) {
                return new PrimaryLiteralExpression(String.valueOf(lineNumber), Integer.parseInt(token.getText()));
            } else if (tokenType == DartParser.STRING) {
                return new PrimaryLiteralExpression(String.valueOf(lineNumber), token.getText());
            } else if (tokenType == DartParser.FLOAT) {
                return new PrimaryLiteralExpression(String.valueOf(lineNumber), Double.parseDouble(token.getText()));
            } else if (tokenType == DartParser.HEX_NUM) {
                return new PrimaryLiteralExpression(String.valueOf(lineNumber), Long.parseLong(token.getText(), 16));
            } else if (tokenType == DartParser.BOOLEAN) {
                return new PrimaryLiteralExpression(String.valueOf(lineNumber), Boolean.parseBoolean(token.getText()));
            }
        }
        return null;
    }

    @Override
    public Expression visitPrimaryNumericLiteral(DartParser.PrimaryNumericLiteralContext ctx) {
        int lineNumber = ctx.getStart().getLine();

        DartParser.NumericLiteralContext numericLiteral = ctx.numericLiteral();

        if (numericLiteral != null) {
            Token token = numericLiteral.getStart();
            int tokenType = token.getType();
            boolean isNegative = ctx.MINUS() != null;
            if (tokenType == DartParser.NUM) {
                return new PrimaryLiteralExpression(String.valueOf(lineNumber), isNegative ? -Integer.parseInt(token.getText()) : Integer.parseInt(token.getText()));
            } else if (tokenType == DartParser.FLOAT) {
                return new PrimaryLiteralExpression(String.valueOf(lineNumber), isNegative ? -Double.parseDouble(token.getText()) : Double.parseDouble(token.getText()));
            } else if (tokenType == DartParser.HEX_NUM) {
                return new PrimaryLiteralExpression(String.valueOf(lineNumber), isNegative ? -Long.parseLong(token.getText(), 16) : Long.parseLong(token.getText(), 16));
            }
        }
        return null;
    }

    @Override
    public Expression visitPrimaryIdentifierExpression(DartParser.PrimaryIdentifierExpressionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        //TODO get identifier value from ST
        //get the symbol table
        SymbolTable instance = SymbolTable.getInstance();
        //get the var name from the parse tree
        String var = ctx.IDENTIFIER().getText();

        Symbol symbol = instance.get(var);

        if (symbol == null) {
            semanticError.add(UTIL.semanticUndeclaredIdentifier(ctx.IDENTIFIER().getSymbol().getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1, var));
            return new PrimaryLiteralExpression(String.valueOf(lineNumber), null);
        }
        //get the type
        String type = symbol.getType();
        System.out.println(type);
        if (type.equals("string")) {
            String value = (String) symbol.getValue();
            return new PrimaryLiteralExpression(String.valueOf(lineNumber), value);
        } else if (type.equals("int")) {
            Number value = (Number) symbol.getValue();
            return new PrimaryLiteralExpression(String.valueOf(lineNumber), value);
        }

        return new PrimaryLiteralExpression(String.valueOf(lineNumber), null);
    }
}
