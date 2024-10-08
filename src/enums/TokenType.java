package enums;

public enum TokenType {
    PLUS("+"),
    MINUS("-"),
    STAR("*"),
    SLASH("/"),
    EQUALS("=="),
    NOT_EQUALS("!="),
    GREATER_THAN(">"),
    LESS_THAN("<"),
    GREATER_THAN_OR_EQUALS(">="),
    LESS_THAN_OR_EQUALS("<=");

    private final String symbol;

    TokenType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    public static TokenType fromSymbol(String symbol) {
        for (TokenType tokenType : TokenType.values()) {
            if (tokenType.symbol.equals(symbol)) {
                return tokenType;
            }
        }
        throw new IllegalArgumentException("No TokenType found for symbol: " + symbol);
    }
}