package App;

import antlr.DartLexer;
import antlr.DartParser;
import error_lisitener.MyErrorLisitener;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import program.Program;
import properties.Property;
import properties.ScaffoldName;
import utils.SymbolTable;
import utils.UTIL;
import visitors.AntlrObjectFactory;
import visitors.AntlrToProgram;
import visitors.AstToHTML;

import java.io.IOException;

public class CompilerApp {

    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        DartParser parser = getParser(fileName);
        Program program = null;

        ParseTree antlrAST = parser.prog();
        IAntlrObjectFactory antlrObjectFactory = new AntlrObjectFactory();

        //check if there is any syntax error
        AntlrToProgram antlrToProgram = null;
        if (MyErrorLisitener.hasErorr) {


        } else {
            //visitor
            antlrToProgram = new AntlrToProgram(antlrObjectFactory);
            program = antlrToProgram.visit(antlrAST);

            SymbolTable instance = SymbolTable.getInstance();
        }


        assert antlrToProgram != null;
        if (antlrToProgram.getSemanticError().isEmpty()) {


            // call code generation visitor.
            AstToHTML codeGenerationVisitor = new AstToHTML();
            String htmlOutput = codeGenerationVisitor.visit(program);

            String htmlName = "defaultName";

            for (Property property : program.getScaffold().getProperties()) {
                if(property.getName().equals("name")) {
                    ScaffoldName scaffoldName = (ScaffoldName)property;
                    htmlName = scaffoldName.getValue().replace("\"", "");
                }
            }

            UTIL.writeToFile(htmlOutput,"output/" + htmlName + ".html");

            // print message that tells that every thing is okay
            System.out.println("Code Compiled Successfully...");

        } else {
            for (String semantic : antlrToProgram.getSemanticError()) {
                System.err.println(semantic);
            }
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

