package myantlr;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.io.FileReader;
import java.io.IOException;

public class AST {

    public CommonTree getAST() throws IOException, RecognitionException {
        FileReader reader = new FileReader("myantlr/__Test___input.txt") ;
        Projet_WhileLexer lexer = new Projet_WhileLexer(new ANTLRReaderStream(reader));
        TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        Projet_WhileParser grammar = new Projet_WhileParser(tokens);

        grammar.setTreeAdaptor(adaptor);
        Projet_WhileParser.prog_return ret = grammar.prog();

        CommonTree ast = (CommonTree) ret.getTree();

        return ast;
    }

    final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        public Object create(Token payload) {
            return new CommonTree(payload);
        }
    };

}
