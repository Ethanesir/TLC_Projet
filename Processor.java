import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.io.FileReader;
import java.io.IOException;

public class Processor {
    public static void main(String[] args) throws IOException, RecognitionException {
        processFile();
    }

    private static void processFile() throws IOException, RecognitionException {
        FileReader reader = new FileReader("C:\\Users\\luis\\Desktop\\TLC\\output\\__Test___input.txt") ;
        Projet_WhileLexer lexer = new Projet_WhileLexer(new ANTLRReaderStream(reader));
        TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        Projet_WhileParser grammar = new Projet_WhileParser(tokens);

        grammar.setTreeAdaptor(adaptor);
        Projet_WhileParser.prog_return ret = grammar.prog();

        CommonTree tree = (CommonTree)ret.getTree();

        System.out.println(tree.toStringTree());
        printTree(tree, 1);
    }
    static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        public Object create(Token payload) {
            return new CommonTree(payload);
        }
    };

    public static void printTree(CommonTree t, int indent) {
        if ( t != null ) {
            StringBuffer sb = new StringBuffer(indent);

            if (t.getParent() == null){
                System.out.println(sb.toString() + t.getText().toString());
            }
            for ( int i = 0; i < indent; i++ )
                sb = sb.append("   ");
            for ( int i = 0; i < t.getChildCount(); i++ ) {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree)t.getChild(i), indent+1);
            }
        }
    }
}
