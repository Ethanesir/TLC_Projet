package tableSymbole;

import myantlr.AST;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import java.io.IOException;

public class MainTableSymboles {
    public static void main(String[] args) throws IOException, RecognitionException {
        AST ast = new AST();
        CommonTree tree = ast.getAST();
        VisitAST visitAST = new VisitAST();
        visitAST.visitCommonTree(tree);
    }
}
