package ocl2ra;


import java.io.FileInputStream;
import java.io.InputStream;
import ocl2ra.ANTLR.OCL2RALexer;
import ocl2ra.ANTLR.OCL2RAParser;
import ocl2ra.OCLConstructor.OCLClass;
import ocl2ra.OCLConstructor.OCLClassReader;
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
        ParseTree tree = parser.oclExpr();
        OCL2RAVisitor visitor = new OCL2RAVisitor();
//        OCLAssociation oa = new OCLAssociation("pred", "next", "S", "S");

        for (int i = 1; i < args.length; i++) {
            visitor.freeTransAssoc();
            visitor.freeTransClasses();
            OCLClass oc = OCLClassReader.readClassFromFile(args[i]);
            visitor.addTransClass(oc);
            visitor.addTransAssoc(oc.getAssocs());
        }

//        visitor.freeTransAssoc();
//        visitor.addTransAssoc(oa);
        System.out.println(visitor.visit(tree));

    }
}
