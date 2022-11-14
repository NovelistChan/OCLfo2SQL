import ANTLR.OCL2RALexer;
import ANTLR.OCL2RAParser;
import OCLConstructor.OCLClass;
import OCLConstructor.OCLClassReader;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStream is = args.length > 0 ? new FileInputStream(args[0]) : System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        OCL2RALexer lexer = new OCL2RALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OCL2RAParser parser = new OCL2RAParser(tokens);
        ParseTree tree = parser.oclText();
        OCL2RAVisitor visitor = new OCL2RAVisitor();

        visitor.freeTransAssoc();
        visitor.freeTransClasses();
        for (int i = 1; i < args.length; i++) {
            OCLClass oc = OCLClassReader.readClassFromFile(args[i]);
            visitor.addTransClass(oc);
            visitor.addTransAssoc(oc.getAssocs());
        }

        System.out.println(visitor.visit(tree).print());

    }
}
