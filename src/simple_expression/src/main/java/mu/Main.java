package mu;

import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        if (args.length == 0) {
            args = new String[]{"D:/Gits/ANTLR-toy-compilers/src/simple_expression/src/main/java/mu/test.txt"};
        }

        System.out.println("parsing: " + args[0]);

        MuLexer lexer = new MuLexer(new ANTLRFileStream(args[0]));
        MuParser parser = new MuParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
