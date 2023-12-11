import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        Projet_WhileLexer lex = new Projet_WhileLexer(new ANTLRFileStream("C:\\Users\\luis\\Desktop\\TLC\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Projet_WhileParser g = new Projet_WhileParser(tokens);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}