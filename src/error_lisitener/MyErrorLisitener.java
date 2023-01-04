package error_lisitener;

import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class MyErrorLisitener extends BaseErrorListener {

    public static boolean hasErorr = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        hasErorr = true ;
        List<String> stack = ((Parser) recognizer) .getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Syntax Error!");
        System. err.println( "Token" + "\"" + ((Token) offendingSymbol).getText() + "\""
                +
                " (line " + line + ", column " + (charPositionInLine + 1) + ")"
                +
                " : " + msg);
        System.err.println("Rule stack : "+stack);
    }
}
