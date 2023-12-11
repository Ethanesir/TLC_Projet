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
        //System.out.println(ast);
    }
    static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        public Object create(Token payload) {
            return new CommonTree(payload);
        }
    };
}
