package App;

import antlr.DartLexer;
import antlr.DartParser;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.util.mxCellRenderer;
import error_lisitener.MyErrorLisitener;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultEdge;
import program.Program;
import utils.SymbolTable;
import utils.UTIL;
import visitors.AntlrObjectFactory;
import visitors.AntlrToProgram;
import visitors.AstToGraphVisitor;
import visitors.AstToHTML;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompilerApp {

    public static void main(String[] args) throws IOException {
        String fileName = "tests/gen.txt";
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

            AstToGraphVisitor graphVisitor = new AstToGraphVisitor();
            program.accept(graphVisitor);

            SymbolTable instance = SymbolTable.getInstance();

            JGraphXAdapter<String, DefaultEdge> graphAdapter = new JGraphXAdapter<>(UTIL.g);
            graphAdapter.getEdgeToCellMap().forEach((edge, cell) -> cell.setValue(null));
            mxIGraphLayout layout = new mxHierarchicalLayout(graphAdapter);
            layout.execute(graphAdapter.getDefaultParent());
            File imgFile = new File("src/graph.png");
            boolean created = imgFile.createNewFile();
            BufferedImage image = mxCellRenderer.createBufferedImage(
                    graphAdapter,
                    null,
                    2,
                    Color.WHITE,
                    true,
                    null
            );
            imgFile = new File("src/graph.png");
            ImageIO.write(image, "PNG", imgFile);
        }


        if (antlrToProgram.getSemanticError().isEmpty()) {


            if (program != null) {

                // call code generation visitor.
                AstToHTML codeGenerationVisitor = new AstToHTML();
                String htmlOutput = codeGenerationVisitor.visit(program);

                UTIL.writeToFile(htmlOutput,"output/compiled.html");

                // print message that tells that every thing is okay
                System.out.println("Code Compiled Successfully...");
            }

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

