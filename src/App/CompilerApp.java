package App;

import ErrorLisitener.MyErrorLisitener;
import antlr.DartLexer;
import antlr.DartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class CompilerApp {

    public static void main(String [] args){
        String fileName = "test2.txt";
        DartParser parser = getParser(fileName);

        ParseTree antlrAST = parser.prog();

        //check if there any syntax error
        if(MyErrorLisitener.hasErorr){

        }
        else{
            //visitor
            AntlrToProgram progVisitor = new AntlrToProgram();
            Program prog = progVisitor.visit(antlrAST);

            if(progVisitor.semanticError.isEmpty()){
                // no semantic errors
            }
            else{
                //there are semantic errors
                for(String err :progVisitor.semanticError){
                    System.err.println(err);
                }
            }
        }
    }
    private static DartParser getParser(String fileNmae){
        DartParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileNmae);
            DartLexer lexer = new DartLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new DartParser(tokens);

            //syntax error
            parser.removeErrorListeners();
            parser.addErrorListener(new MyErrorLisitener());

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return parser;
    }
}
