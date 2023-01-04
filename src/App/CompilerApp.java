package App;

import error_lisitener.MyErrorLisitener;
import antlr.DartLexer;
import antlr.DartParser;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import program.Program;
import visitors.AntlrObjectFactory;
import visitors.AntlrToProgram;

import java.io.IOException;

public class CompilerApp {

    public static void main(String[] args) {
        String fileName = args[0];
        DartParser parser = getParser(fileName);

        ParseTree antlrAST = parser.prog();
        IAntlrObjectFactory antlrObjectFactory = new AntlrObjectFactory();

        //check if there any syntax error
        if (MyErrorLisitener.hasErorr) {

        } else {
            //visitor
            AntlrToProgram antlrToProgram = new AntlrToProgram(antlrObjectFactory);
            Program prog = antlrToProgram.visit(antlrAST);

//            if(antlrToProgram.semanticError.isEmpty()){
//                // no semantic errors
//            }
//            else{
//                //there are semantic errors
//                for(String err :antlrToProgram.semanticError){
//                    System.err.println(err);
//                }
//            }
        }
    }

    private static DartParser getParser(String fileName) {
        DartParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
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
