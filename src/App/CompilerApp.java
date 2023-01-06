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
import utils.UTIL;
import visitors.AntlrObjectFactory;
import visitors.AntlrToProgram;
import visitors.AstToGraphVisitor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompilerApp {

    public static void main(String[] args) throws IOException {
        String fileName = "test2.txt";
        DartParser parser = getParser(fileName);

        ParseTree antlrAST = parser.prog();
        IAntlrObjectFactory antlrObjectFactory = new AntlrObjectFactory();

        //check if there is any syntax error
        if (MyErrorLisitener.hasErorr) {


        } else {
            //visitor
            AntlrToProgram antlrToProgram = new AntlrToProgram(antlrObjectFactory);
            Program program = antlrToProgram.visit(antlrAST);

            AstToGraphVisitor graphVisitor = new AstToGraphVisitor();
            program.accept(graphVisitor);

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
