// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/rolyster/Documents/TLC/ProjetWhile.g 2023-12-11 13:23:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ProjetWhileParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "INPUT", "DEFINITION", "CMD_LIST", "CMD", "EXPRESSION", "CONDITION", "COMANDES", "OUTPUT", "WHILE", "FOR", "FOREACH", "IF", "VAR", "BLOC", "VARIABLE", "VAR_LIST", "EXP_LIST", "EXP", "AFFECTATION", "SYMBOL", "TL", "HD", "LIST", "CONS", "Maj", "Min", "Dec", "Variable", "Symbol", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'hd'", "'tl'", "'list'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int FUNCTION=4;
    public static final int INPUT=5;
    public static final int DEFINITION=6;
    public static final int CMD_LIST=7;
    public static final int CMD=8;
    public static final int EXPRESSION=9;
    public static final int CONDITION=10;
    public static final int COMANDES=11;
    public static final int OUTPUT=12;
    public static final int WHILE=13;
    public static final int FOR=14;
    public static final int FOREACH=15;
    public static final int IF=16;
    public static final int VAR=17;
    public static final int BLOC=18;
    public static final int VARIABLE=19;
    public static final int VAR_LIST=20;
    public static final int EXP_LIST=21;
    public static final int EXP=22;
    public static final int AFFECTATION=23;
    public static final int SYMBOL=24;
    public static final int TL=25;
    public static final int HD=26;
    public static final int LIST=27;
    public static final int CONS=28;
    public static final int Maj=29;
    public static final int Min=30;
    public static final int Dec=31;
    public static final int Variable=32;
    public static final int Symbol=33;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "expression", "function", "commands", "command", 
        "exprs", "output", "exprBase", "inputSub", "programme", "prog", 
        "input", "definition", "vars", "lExpr"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, false, 
            false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public ProjetWhileParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public ProjetWhileParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public ProjetWhileParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return ProjetWhileParser.tokenNames; }
    public String getGrammarFileName() { return "/home/rolyster/Documents/TLC/ProjetWhile.g"; }


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:47:1: function : 'function' Symbol ':' definition -> ^( FUNCTION Symbol ^( BLOC definition ) ) ;
    public final ProjetWhileParser.function_return function() throws RecognitionException {
        ProjetWhileParser.function_return retval = new ProjetWhileParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token Symbol2=null;
        Token char_literal3=null;
        ProjetWhileParser.definition_return definition4 = null;


        Object string_literal1_tree=null;
        Object Symbol2_tree=null;
        Object char_literal3_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:47:11: ( 'function' Symbol ':' definition -> ^( FUNCTION Symbol ^( BLOC definition ) ) )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:47:13: 'function' Symbol ':' definition
            {
            dbg.location(47,13);
            string_literal1=(Token)match(input,34,FOLLOW_34_in_function211);  
            stream_34.add(string_literal1);

            dbg.location(47,24);
            Symbol2=(Token)match(input,Symbol,FOLLOW_Symbol_in_function213);  
            stream_Symbol.add(Symbol2);

            dbg.location(47,31);
            char_literal3=(Token)match(input,35,FOLLOW_35_in_function215);  
            stream_35.add(char_literal3);

            dbg.location(47,35);
            pushFollow(FOLLOW_definition_in_function217);
            definition4=definition();

            state._fsp--;

            stream_definition.add(definition4.getTree());


            // AST REWRITE
            // elements: definition, Symbol
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:46: -> ^( FUNCTION Symbol ^( BLOC definition ) )
            {
                dbg.location(47,49);
                // /home/rolyster/Documents/TLC/ProjetWhile.g:47:49: ^( FUNCTION Symbol ^( BLOC definition ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(47,51);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                dbg.location(47,60);
                adaptor.addChild(root_1, stream_Symbol.nextNode());
                dbg.location(47,67);
                // /home/rolyster/Documents/TLC/ProjetWhile.g:47:67: ^( BLOC definition )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(47,69);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_2);

                dbg.location(47,74);
                adaptor.addChild(root_2, stream_definition.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(47, 86);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function"

    public static class definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:48:1: definition : 'read' input '%' commands '%' 'write' output -> ^( INPUT input ) commands ^( OUTPUT output ) ;
    public final ProjetWhileParser.definition_return definition() throws RecognitionException {
        ProjetWhileParser.definition_return retval = new ProjetWhileParser.definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token string_literal10=null;
        ProjetWhileParser.input_return input6 = null;

        ProjetWhileParser.commands_return commands8 = null;

        ProjetWhileParser.output_return output11 = null;


        Object string_literal5_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        Object string_literal10_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:49:2: ( 'read' input '%' commands '%' 'write' output -> ^( INPUT input ) commands ^( OUTPUT output ) )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:49:4: 'read' input '%' commands '%' 'write' output
            {
            dbg.location(49,4);
            string_literal5=(Token)match(input,36,FOLLOW_36_in_definition240);  
            stream_36.add(string_literal5);

            dbg.location(49,11);
            pushFollow(FOLLOW_input_in_definition242);
            input6=input();

            state._fsp--;

            stream_input.add(input6.getTree());
            dbg.location(49,18);
            char_literal7=(Token)match(input,37,FOLLOW_37_in_definition245);  
            stream_37.add(char_literal7);

            dbg.location(49,22);
            pushFollow(FOLLOW_commands_in_definition247);
            commands8=commands();

            state._fsp--;

            stream_commands.add(commands8.getTree());
            dbg.location(49,31);
            char_literal9=(Token)match(input,37,FOLLOW_37_in_definition249);  
            stream_37.add(char_literal9);

            dbg.location(49,35);
            string_literal10=(Token)match(input,38,FOLLOW_38_in_definition251);  
            stream_38.add(string_literal10);

            dbg.location(49,43);
            pushFollow(FOLLOW_output_in_definition253);
            output11=output();

            state._fsp--;

            stream_output.add(output11.getTree());


            // AST REWRITE
            // elements: input, output, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:50: -> ^( INPUT input ) commands ^( OUTPUT output )
            {
                dbg.location(49,53);
                // /home/rolyster/Documents/TLC/ProjetWhile.g:49:53: ^( INPUT input )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(49,55);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);

                dbg.location(49,61);
                adaptor.addChild(root_1, stream_input.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(49,68);
                adaptor.addChild(root_0, stream_commands.nextTree());
                dbg.location(49,77);
                // /home/rolyster/Documents/TLC/ProjetWhile.g:49:77: ^( OUTPUT output )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(49,79);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);

                dbg.location(49,86);
                adaptor.addChild(root_1, stream_output.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(49, 93);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "definition"

    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:50:1: input : ( inputSub | );
    public final ProjetWhileParser.input_return input() throws RecognitionException {
        ProjetWhileParser.input_return retval = new ProjetWhileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProjetWhileParser.inputSub_return inputSub12 = null;



        try { dbg.enterRule(getGrammarFileName(), "input");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:50:7: ( inputSub | )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==Variable) ) {
                alt1=1;
            }
            else if ( (LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:50:9: inputSub
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,9);
                    pushFollow(FOLLOW_inputSub_in_input279);
                    inputSub12=inputSub();

                    state._fsp--;

                    adaptor.addChild(root_0, inputSub12.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:50:19: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(50, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "input");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "input"

    public static class inputSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputSub"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:51:1: inputSub : Variable ( ',' Variable )* -> ( ^( VAR Variable ) )+ ;
    public final ProjetWhileParser.inputSub_return inputSub() throws RecognitionException {
        ProjetWhileParser.inputSub_return retval = new ProjetWhileParser.inputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable13=null;
        Token char_literal14=null;
        Token Variable15=null;

        Object Variable13_tree=null;
        Object char_literal14_tree=null;
        Object Variable15_tree=null;
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try { dbg.enterRule(getGrammarFileName(), "inputSub");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:51:9: ( Variable ( ',' Variable )* -> ( ^( VAR Variable ) )+ )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:51:11: Variable ( ',' Variable )*
            {
            dbg.location(51,11);
            Variable13=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub288);  
            stream_Variable.add(Variable13);

            dbg.location(51,21);
            // /home/rolyster/Documents/TLC/ProjetWhile.g:51:21: ( ',' Variable )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==39) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/rolyster/Documents/TLC/ProjetWhile.g:51:22: ',' Variable
            	    {
            	    dbg.location(51,22);
            	    char_literal14=(Token)match(input,39,FOLLOW_39_in_inputSub292);  
            	    stream_39.add(char_literal14);

            	    dbg.location(51,27);
            	    Variable15=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub295);  
            	    stream_Variable.add(Variable15);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 51:38: -> ( ^( VAR Variable ) )+
            {
                dbg.location(51,42);
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    dbg.location(51,42);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:51:42: ^( VAR Variable )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(51,45);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                    dbg.location(51,49);
                    adaptor.addChild(root_1, stream_Variable.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_Variable.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(51, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inputSub");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inputSub"

    public static class output_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:52:1: output : Variable ( ',' Variable )* -> ( ^( VAR Variable ) )+ ;
    public final ProjetWhileParser.output_return output() throws RecognitionException {
        ProjetWhileParser.output_return retval = new ProjetWhileParser.output_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable16=null;
        Token char_literal17=null;
        Token Variable18=null;

        Object Variable16_tree=null;
        Object char_literal17_tree=null;
        Object Variable18_tree=null;
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try { dbg.enterRule(getGrammarFileName(), "output");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:52:7: ( Variable ( ',' Variable )* -> ( ^( VAR Variable ) )+ )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:52:8: Variable ( ',' Variable )*
            {
            dbg.location(52,8);
            Variable16=(Token)match(input,Variable,FOLLOW_Variable_in_output313);  
            stream_Variable.add(Variable16);

            dbg.location(52,17);
            // /home/rolyster/Documents/TLC/ProjetWhile.g:52:17: ( ',' Variable )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==39) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/rolyster/Documents/TLC/ProjetWhile.g:52:18: ',' Variable
            	    {
            	    dbg.location(52,18);
            	    char_literal17=(Token)match(input,39,FOLLOW_39_in_output316);  
            	    stream_39.add(char_literal17);

            	    dbg.location(52,21);
            	    Variable18=(Token)match(input,Variable,FOLLOW_Variable_in_output317);  
            	    stream_Variable.add(Variable18);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 52:31: -> ( ^( VAR Variable ) )+
            {
                dbg.location(52,35);
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    dbg.location(52,35);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:52:35: ^( VAR Variable )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(52,38);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                    dbg.location(52,42);
                    adaptor.addChild(root_1, stream_Variable.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_Variable.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(52, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "output");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "output"

    public static class commands_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commands"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:56:1: commands : command ( ';' command )* -> ^( COMANDES ^( CMD_LIST ( ^( CMD command ) )+ ) ) ;
    public final ProjetWhileParser.commands_return commands() throws RecognitionException {
        ProjetWhileParser.commands_return retval = new ProjetWhileParser.commands_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        ProjetWhileParser.command_return command19 = null;

        ProjetWhileParser.command_return command21 = null;


        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try { dbg.enterRule(getGrammarFileName(), "commands");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:56:9: ( command ( ';' command )* -> ^( COMANDES ^( CMD_LIST ( ^( CMD command ) )+ ) ) )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:56:10: command ( ';' command )*
            {
            dbg.location(56,10);
            pushFollow(FOLLOW_command_in_commands337);
            command19=command();

            state._fsp--;

            stream_command.add(command19.getTree());
            dbg.location(56,18);
            // /home/rolyster/Documents/TLC/ProjetWhile.g:56:18: ( ';' command )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==40) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/rolyster/Documents/TLC/ProjetWhile.g:56:19: ';' command
            	    {
            	    dbg.location(56,19);
            	    char_literal20=(Token)match(input,40,FOLLOW_40_in_commands340);  
            	    stream_40.add(char_literal20);

            	    dbg.location(56,23);
            	    pushFollow(FOLLOW_command_in_commands342);
            	    command21=command();

            	    state._fsp--;

            	    stream_command.add(command21.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}



            // AST REWRITE
            // elements: command
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:33: -> ^( COMANDES ^( CMD_LIST ( ^( CMD command ) )+ ) )
            {
                dbg.location(56,36);
                // /home/rolyster/Documents/TLC/ProjetWhile.g:56:36: ^( COMANDES ^( CMD_LIST ( ^( CMD command ) )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(56,38);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMANDES, "COMANDES"), root_1);

                dbg.location(56,47);
                // /home/rolyster/Documents/TLC/ProjetWhile.g:56:47: ^( CMD_LIST ( ^( CMD command ) )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(56,49);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CMD_LIST, "CMD_LIST"), root_2);

                dbg.location(56,58);
                if ( !(stream_command.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_command.hasNext() ) {
                    dbg.location(56,58);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:56:58: ^( CMD command )
                    {
                    Object root_3 = (Object)adaptor.nil();
                    dbg.location(56,60);
                    root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(CMD, "CMD"), root_3);

                    dbg.location(56,64);
                    adaptor.addChild(root_3, stream_command.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_command.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(56, 75);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commands");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "commands"

    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:58:1: command : ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( AFFECTATION vars ':=' exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE 'while' expression 'do' commands 'od' ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( CONDITION expression ) commands ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' ) );
    public final ProjetWhileParser.command_return command() throws RecognitionException {
        ProjetWhileParser.command_return retval = new ProjetWhileParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal22=null;
        Token string_literal24=null;
        Token string_literal26=null;
        Token string_literal28=null;
        Token string_literal30=null;
        Token string_literal32=null;
        Token string_literal33=null;
        Token string_literal35=null;
        Token string_literal37=null;
        Token string_literal38=null;
        Token string_literal40=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token Variable44=null;
        Token string_literal45=null;
        Token string_literal47=null;
        Token string_literal49=null;
        ProjetWhileParser.vars_return vars23 = null;

        ProjetWhileParser.exprs_return exprs25 = null;

        ProjetWhileParser.expression_return expression27 = null;

        ProjetWhileParser.commands_return commands29 = null;

        ProjetWhileParser.commands_return commands31 = null;

        ProjetWhileParser.expression_return expression34 = null;

        ProjetWhileParser.commands_return commands36 = null;

        ProjetWhileParser.expression_return expression39 = null;

        ProjetWhileParser.commands_return commands41 = null;

        ProjetWhileParser.expression_return expression46 = null;

        ProjetWhileParser.commands_return commands48 = null;


        Object string_literal22_tree=null;
        Object string_literal24_tree=null;
        Object string_literal26_tree=null;
        Object string_literal28_tree=null;
        Object string_literal30_tree=null;
        Object string_literal32_tree=null;
        Object string_literal33_tree=null;
        Object string_literal35_tree=null;
        Object string_literal37_tree=null;
        Object string_literal38_tree=null;
        Object string_literal40_tree=null;
        Object string_literal42_tree=null;
        Object string_literal43_tree=null;
        Object Variable44_tree=null;
        Object string_literal45_tree=null;
        Object string_literal47_tree=null;
        Object string_literal49_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:58:8: ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( AFFECTATION vars ':=' exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE 'while' expression 'do' commands 'od' ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( CONDITION expression ) commands ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' ) )
            int alt6=6;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case 41:
                {
                alt6=1;
                }
                break;
            case Variable:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            case 47:
                {
                alt6=4;
                }
                break;
            case 50:
                {
                alt6=5;
                }
                break;
            case 51:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:58:10: ( 'nop' )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,10);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:58:10: ( 'nop' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:58:11: 'nop'
                    {
                    dbg.location(58,11);
                    string_literal22=(Token)match(input,41,FOLLOW_41_in_command369); 
                    string_literal22_tree = (Object)adaptor.create(string_literal22);
                    adaptor.addChild(root_0, string_literal22_tree);


                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:59:4: ( vars ':=' exprs )
                    {
                    dbg.location(59,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:59:4: ( vars ':=' exprs )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:59:5: vars ':=' exprs
                    {
                    dbg.location(59,5);
                    pushFollow(FOLLOW_vars_in_command377);
                    vars23=vars();

                    state._fsp--;

                    stream_vars.add(vars23.getTree());
                    dbg.location(59,10);
                    string_literal24=(Token)match(input,42,FOLLOW_42_in_command379);  
                    stream_42.add(string_literal24);

                    dbg.location(59,15);
                    pushFollow(FOLLOW_exprs_in_command381);
                    exprs25=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs25.getTree());

                    }



                    // AST REWRITE
                    // elements: 42, exprs, vars
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:22: -> ^( AFFECTATION vars ':=' exprs )
                    {
                        dbg.location(59,25);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:59:25: ^( AFFECTATION vars ':=' exprs )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(59,27);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECTATION, "AFFECTATION"), root_1);

                        dbg.location(59,39);
                        adaptor.addChild(root_1, stream_vars.nextTree());
                        dbg.location(59,44);
                        adaptor.addChild(root_1, stream_42.nextNode());
                        dbg.location(59,49);
                        adaptor.addChild(root_1, stream_exprs.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:60:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    {
                    dbg.location(60,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:60:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:60:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
                    {
                    dbg.location(60,5);
                    string_literal26=(Token)match(input,43,FOLLOW_43_in_command400);  
                    stream_43.add(string_literal26);

                    dbg.location(60,10);
                    pushFollow(FOLLOW_expression_in_command402);
                    expression27=expression();

                    state._fsp--;

                    stream_expression.add(expression27.getTree());
                    dbg.location(60,21);
                    string_literal28=(Token)match(input,44,FOLLOW_44_in_command404);  
                    stream_44.add(string_literal28);

                    dbg.location(60,28);
                    pushFollow(FOLLOW_commands_in_command406);
                    commands29=commands();

                    state._fsp--;

                    stream_commands.add(commands29.getTree());
                    dbg.location(60,37);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:60:37: ( 'else' commands )?
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==45) ) {
                        alt5=1;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/rolyster/Documents/TLC/ProjetWhile.g:60:38: 'else' commands
                            {
                            dbg.location(60,38);
                            string_literal30=(Token)match(input,45,FOLLOW_45_in_command409);  
                            stream_45.add(string_literal30);

                            dbg.location(60,45);
                            pushFollow(FOLLOW_commands_in_command411);
                            commands31=commands();

                            state._fsp--;

                            stream_commands.add(commands31.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(60,56);
                    string_literal32=(Token)match(input,46,FOLLOW_46_in_command415);  
                    stream_46.add(string_literal32);


                    }



                    // AST REWRITE
                    // elements: 43, expression, 44, 45, 46, commands, commands
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:62: -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    {
                        dbg.location(60,64);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:60:64: ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(60,66);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        dbg.location(60,69);
                        adaptor.addChild(root_1, stream_43.nextNode());
                        dbg.location(60,74);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        dbg.location(60,85);
                        adaptor.addChild(root_1, stream_44.nextNode());
                        dbg.location(60,92);
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        dbg.location(60,101);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:60:101: ( 'else' commands )?
                        if ( stream_45.hasNext()||stream_commands.hasNext() ) {
                            dbg.location(60,102);
                            adaptor.addChild(root_1, stream_45.nextNode());
                            dbg.location(60,109);
                            adaptor.addChild(root_1, stream_commands.nextTree());

                        }
                        stream_45.reset();
                        stream_commands.reset();
                        dbg.location(60,120);
                        adaptor.addChild(root_1, stream_46.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:61:4: ( 'while' expression 'do' commands 'od' )
                    {
                    dbg.location(61,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:61:4: ( 'while' expression 'do' commands 'od' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:61:5: 'while' expression 'do' commands 'od'
                    {
                    dbg.location(61,5);
                    string_literal33=(Token)match(input,47,FOLLOW_47_in_command444);  
                    stream_47.add(string_literal33);

                    dbg.location(61,13);
                    pushFollow(FOLLOW_expression_in_command446);
                    expression34=expression();

                    state._fsp--;

                    stream_expression.add(expression34.getTree());
                    dbg.location(61,24);
                    string_literal35=(Token)match(input,48,FOLLOW_48_in_command448);  
                    stream_48.add(string_literal35);

                    dbg.location(61,29);
                    pushFollow(FOLLOW_commands_in_command450);
                    commands36=commands();

                    state._fsp--;

                    stream_commands.add(commands36.getTree());
                    dbg.location(61,38);
                    string_literal37=(Token)match(input,49,FOLLOW_49_in_command452);  
                    stream_49.add(string_literal37);


                    }



                    // AST REWRITE
                    // elements: 48, commands, expression, 47, 49
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 61:44: -> ^( WHILE 'while' expression 'do' commands 'od' )
                    {
                        dbg.location(61,46);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:61:46: ^( WHILE 'while' expression 'do' commands 'od' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(61,48);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                        dbg.location(61,54);
                        adaptor.addChild(root_1, stream_47.nextNode());
                        dbg.location(61,62);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        dbg.location(61,73);
                        adaptor.addChild(root_1, stream_48.nextNode());
                        dbg.location(61,78);
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        dbg.location(61,87);
                        adaptor.addChild(root_1, stream_49.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:62:4: ( 'for' expression 'do' commands 'od' )
                    {
                    dbg.location(62,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:62:4: ( 'for' expression 'do' commands 'od' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:62:5: 'for' expression 'do' commands 'od'
                    {
                    dbg.location(62,5);
                    string_literal38=(Token)match(input,50,FOLLOW_50_in_command474);  
                    stream_50.add(string_literal38);

                    dbg.location(62,11);
                    pushFollow(FOLLOW_expression_in_command476);
                    expression39=expression();

                    state._fsp--;

                    stream_expression.add(expression39.getTree());
                    dbg.location(62,22);
                    string_literal40=(Token)match(input,48,FOLLOW_48_in_command478);  
                    stream_48.add(string_literal40);

                    dbg.location(62,27);
                    pushFollow(FOLLOW_commands_in_command480);
                    commands41=commands();

                    state._fsp--;

                    stream_commands.add(commands41.getTree());
                    dbg.location(62,36);
                    string_literal42=(Token)match(input,49,FOLLOW_49_in_command482);  
                    stream_49.add(string_literal42);


                    }



                    // AST REWRITE
                    // elements: commands, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:42: -> ^( FOR ^( CONDITION expression ) commands )
                    {
                        dbg.location(62,45);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:62:45: ^( FOR ^( CONDITION expression ) commands )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(62,47);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        dbg.location(62,51);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:62:51: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(62,53);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(62,63);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(62,75);
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:63:4: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
                    {
                    dbg.location(63,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:63:4: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:63:6: 'foreach' Variable 'in' expression 'do' commands 'od'
                    {
                    dbg.location(63,6);
                    string_literal43=(Token)match(input,51,FOLLOW_51_in_command505);  
                    stream_51.add(string_literal43);

                    dbg.location(63,16);
                    Variable44=(Token)match(input,Variable,FOLLOW_Variable_in_command507);  
                    stream_Variable.add(Variable44);

                    dbg.location(63,25);
                    string_literal45=(Token)match(input,52,FOLLOW_52_in_command509);  
                    stream_52.add(string_literal45);

                    dbg.location(63,30);
                    pushFollow(FOLLOW_expression_in_command511);
                    expression46=expression();

                    state._fsp--;

                    stream_expression.add(expression46.getTree());
                    dbg.location(63,41);
                    string_literal47=(Token)match(input,48,FOLLOW_48_in_command513);  
                    stream_48.add(string_literal47);

                    dbg.location(63,46);
                    pushFollow(FOLLOW_commands_in_command515);
                    commands48=commands();

                    state._fsp--;

                    stream_commands.add(commands48.getTree());
                    dbg.location(63,55);
                    string_literal49=(Token)match(input,49,FOLLOW_49_in_command517);  
                    stream_49.add(string_literal49);


                    }



                    // AST REWRITE
                    // elements: 52, expression, 48, Variable, 49, 51, commands
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:61: -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' )
                    {
                        dbg.location(63,64);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:63:64: ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(63,66);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);

                        dbg.location(63,74);
                        adaptor.addChild(root_1, stream_51.nextNode());
                        dbg.location(63,84);
                        adaptor.addChild(root_1, stream_Variable.nextNode());
                        dbg.location(63,93);
                        adaptor.addChild(root_1, stream_52.nextNode());
                        dbg.location(63,98);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        dbg.location(63,109);
                        adaptor.addChild(root_1, stream_48.nextNode());
                        dbg.location(63,114);
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        dbg.location(63,123);
                        adaptor.addChild(root_1, stream_49.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(63, 128);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command"

    public static class vars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vars"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:65:1: vars : Variable ( ',' vars | Variable )? -> ^( VAR_LIST ( ^( VAR Variable ) )+ ) ;
    public final ProjetWhileParser.vars_return vars() throws RecognitionException {
        ProjetWhileParser.vars_return retval = new ProjetWhileParser.vars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable50=null;
        Token char_literal51=null;
        Token Variable53=null;
        ProjetWhileParser.vars_return vars52 = null;


        Object Variable50_tree=null;
        Object char_literal51_tree=null;
        Object Variable53_tree=null;
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        try { dbg.enterRule(getGrammarFileName(), "vars");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:65:5: ( Variable ( ',' vars | Variable )? -> ^( VAR_LIST ( ^( VAR Variable ) )+ ) )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:65:6: Variable ( ',' vars | Variable )?
            {
            dbg.location(65,6);
            Variable50=(Token)match(input,Variable,FOLLOW_Variable_in_vars545);  
            stream_Variable.add(Variable50);

            dbg.location(65,15);
            // /home/rolyster/Documents/TLC/ProjetWhile.g:65:15: ( ',' vars | Variable )?
            int alt7=3;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            else if ( (LA7_0==Variable) ) {
                alt7=2;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:65:16: ',' vars
                    {
                    dbg.location(65,16);
                    char_literal51=(Token)match(input,39,FOLLOW_39_in_vars548);  
                    stream_39.add(char_literal51);

                    dbg.location(65,20);
                    pushFollow(FOLLOW_vars_in_vars550);
                    vars52=vars();

                    state._fsp--;

                    stream_vars.add(vars52.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:65:27: Variable
                    {
                    dbg.location(65,27);
                    Variable53=(Token)match(input,Variable,FOLLOW_Variable_in_vars554);  
                    stream_Variable.add(Variable53);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:38: -> ^( VAR_LIST ( ^( VAR Variable ) )+ )
            {
                dbg.location(65,41);
                // /home/rolyster/Documents/TLC/ProjetWhile.g:65:41: ^( VAR_LIST ( ^( VAR Variable ) )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(65,43);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_LIST, "VAR_LIST"), root_1);

                dbg.location(65,53);
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    dbg.location(65,53);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:65:53: ^( VAR Variable )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(65,55);
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_2);

                    dbg.location(65,59);
                    adaptor.addChild(root_2, stream_Variable.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_Variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(65, 70);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vars");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:66:1: exprs : expression ( ',' exprs | expression )? -> ^( EXP_LIST ( ^( EXP expression ) )+ ) ;
    public final ProjetWhileParser.exprs_return exprs() throws RecognitionException {
        ProjetWhileParser.exprs_return retval = new ProjetWhileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        ProjetWhileParser.expression_return expression54 = null;

        ProjetWhileParser.exprs_return exprs56 = null;

        ProjetWhileParser.expression_return expression57 = null;


        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        try { dbg.enterRule(getGrammarFileName(), "exprs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:66:6: ( expression ( ',' exprs | expression )? -> ^( EXP_LIST ( ^( EXP expression ) )+ ) )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:66:8: expression ( ',' exprs | expression )?
            {
            dbg.location(66,8);
            pushFollow(FOLLOW_expression_in_exprs576);
            expression54=expression();

            state._fsp--;

            stream_expression.add(expression54.getTree());
            dbg.location(66,19);
            // /home/rolyster/Documents/TLC/ProjetWhile.g:66:19: ( ',' exprs | expression )?
            int alt8=3;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=Variable && LA8_0<=Symbol)||(LA8_0>=53 && LA8_0<=54)) ) {
                alt8=2;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:66:20: ',' exprs
                    {
                    dbg.location(66,20);
                    char_literal55=(Token)match(input,39,FOLLOW_39_in_exprs579);  
                    stream_39.add(char_literal55);

                    dbg.location(66,24);
                    pushFollow(FOLLOW_exprs_in_exprs581);
                    exprs56=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs56.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:66:32: expression
                    {
                    dbg.location(66,32);
                    pushFollow(FOLLOW_expression_in_exprs585);
                    expression57=expression();

                    state._fsp--;

                    stream_expression.add(expression57.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:45: -> ^( EXP_LIST ( ^( EXP expression ) )+ )
            {
                dbg.location(66,48);
                // /home/rolyster/Documents/TLC/ProjetWhile.g:66:48: ^( EXP_LIST ( ^( EXP expression ) )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(66,50);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);

                dbg.location(66,60);
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    dbg.location(66,60);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:66:60: ^( EXP expression )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(66,62);
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_2);

                    dbg.location(66,66);
                    adaptor.addChild(root_2, stream_expression.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(66, 81);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprs"

    public static class exprBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:68:1: exprBase : ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) );
    public final ProjetWhileParser.exprBase_return exprBase() throws RecognitionException {
        ProjetWhileParser.exprBase_return retval = new ProjetWhileParser.exprBase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal58=null;
        Token Variable59=null;
        Token Symbol60=null;
        Token char_literal61=null;
        Token string_literal62=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token string_literal66=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token string_literal70=null;
        Token char_literal72=null;
        Token char_literal73=null;
        Token string_literal74=null;
        Token char_literal76=null;
        Token char_literal77=null;
        Token Symbol78=null;
        Token char_literal80=null;
        ProjetWhileParser.lExpr_return lExpr63 = null;

        ProjetWhileParser.exprBase_return exprBase67 = null;

        ProjetWhileParser.exprBase_return exprBase71 = null;

        ProjetWhileParser.exprBase_return exprBase75 = null;

        ProjetWhileParser.lExpr_return lExpr79 = null;


        Object string_literal58_tree=null;
        Object Variable59_tree=null;
        Object Symbol60_tree=null;
        Object char_literal61_tree=null;
        Object string_literal62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object string_literal70_tree=null;
        Object char_literal72_tree=null;
        Object char_literal73_tree=null;
        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
        Object char_literal77_tree=null;
        Object Symbol78_tree=null;
        Object char_literal80_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");
        try { dbg.enterRule(getGrammarFileName(), "exprBase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:68:9: ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) )
            int alt9=8;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            try {
                isCyclicDecision = true;
                alt9 = dfa9.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:68:15: 'nil'
                    {
                    dbg.location(68,15);
                    string_literal58=(Token)match(input,53,FOLLOW_53_in_exprBase614);  
                    stream_53.add(string_literal58);



                    // AST REWRITE
                    // elements: 53
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:20: -> ^( 'nil' )
                    {
                        dbg.location(68,23);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:68:23: ^( 'nil' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(68,25);
                        root_1 = (Object)adaptor.becomeRoot(stream_53.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:69:4: Variable
                    {
                    dbg.location(69,4);
                    Variable59=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase624);  
                    stream_Variable.add(Variable59);



                    // AST REWRITE
                    // elements: Variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:13: -> ^( Variable )
                    {
                        dbg.location(69,16);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:69:16: ^( Variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(69,18);
                        root_1 = (Object)adaptor.becomeRoot(stream_Variable.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:70:4: Symbol
                    {
                    dbg.location(70,4);
                    Symbol60=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase635);  
                    stream_Symbol.add(Symbol60);



                    // AST REWRITE
                    // elements: Symbol
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:11: -> ^( Symbol )
                    {
                        dbg.location(70,14);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:70:14: ^( Symbol )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(70,16);
                        root_1 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:71:4: ( '(' 'cons' lExpr ')' )
                    {
                    dbg.location(71,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:71:4: ( '(' 'cons' lExpr ')' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:71:5: '(' 'cons' lExpr ')'
                    {
                    dbg.location(71,5);
                    char_literal61=(Token)match(input,54,FOLLOW_54_in_exprBase647);  
                    stream_54.add(char_literal61);

                    dbg.location(71,9);
                    string_literal62=(Token)match(input,55,FOLLOW_55_in_exprBase649);  
                    stream_55.add(string_literal62);

                    dbg.location(71,16);
                    pushFollow(FOLLOW_lExpr_in_exprBase651);
                    lExpr63=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr63.getTree());
                    dbg.location(71,22);
                    char_literal64=(Token)match(input,56,FOLLOW_56_in_exprBase653);  
                    stream_56.add(char_literal64);


                    }



                    // AST REWRITE
                    // elements: lExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:27: -> ^( CONS ^( lExpr ) )
                    {
                        dbg.location(71,29);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:71:29: ^( CONS ^( lExpr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(71,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);

                        dbg.location(71,36);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:71:36: ^( lExpr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(71,38);
                        root_2 = (Object)adaptor.becomeRoot(stream_lExpr.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:72:4: ( '(' 'hd' exprBase ')' )
                    {
                    dbg.location(72,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:72:4: ( '(' 'hd' exprBase ')' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:72:5: '(' 'hd' exprBase ')'
                    {
                    dbg.location(72,5);
                    char_literal65=(Token)match(input,54,FOLLOW_54_in_exprBase669);  
                    stream_54.add(char_literal65);

                    dbg.location(72,9);
                    string_literal66=(Token)match(input,57,FOLLOW_57_in_exprBase671);  
                    stream_57.add(string_literal66);

                    dbg.location(72,14);
                    pushFollow(FOLLOW_exprBase_in_exprBase673);
                    exprBase67=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase67.getTree());
                    dbg.location(72,23);
                    char_literal68=(Token)match(input,56,FOLLOW_56_in_exprBase675);  
                    stream_56.add(char_literal68);


                    }



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:28: -> ^( HD ^( exprBase ) )
                    {
                        dbg.location(72,30);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:72:30: ^( HD ^( exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(72,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);

                        dbg.location(72,34);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:72:34: ^( exprBase )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(72,36);
                        root_2 = (Object)adaptor.becomeRoot(stream_exprBase.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:73:4: ( '(' 'tl' exprBase ')' )
                    {
                    dbg.location(73,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:73:4: ( '(' 'tl' exprBase ')' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:73:5: '(' 'tl' exprBase ')'
                    {
                    dbg.location(73,5);
                    char_literal69=(Token)match(input,54,FOLLOW_54_in_exprBase690);  
                    stream_54.add(char_literal69);

                    dbg.location(73,9);
                    string_literal70=(Token)match(input,58,FOLLOW_58_in_exprBase692);  
                    stream_58.add(string_literal70);

                    dbg.location(73,14);
                    pushFollow(FOLLOW_exprBase_in_exprBase694);
                    exprBase71=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase71.getTree());
                    dbg.location(73,23);
                    char_literal72=(Token)match(input,56,FOLLOW_56_in_exprBase696);  
                    stream_56.add(char_literal72);


                    }



                    // AST REWRITE
                    // elements: 58, exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:28: -> ^( TL ^( 'tl' exprBase ) )
                    {
                        dbg.location(73,30);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:73:30: ^( TL ^( 'tl' exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(73,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);

                        dbg.location(73,34);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:73:34: ^( 'tl' exprBase )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(73,36);
                        root_2 = (Object)adaptor.becomeRoot(stream_58.nextNode(), root_2);

                        dbg.location(73,41);
                        adaptor.addChild(root_2, stream_exprBase.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:74:4: ( '(' 'list' exprBase ')' )
                    {
                    dbg.location(74,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:74:4: ( '(' 'list' exprBase ')' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:74:5: '(' 'list' exprBase ')'
                    {
                    dbg.location(74,5);
                    char_literal73=(Token)match(input,54,FOLLOW_54_in_exprBase713);  
                    stream_54.add(char_literal73);

                    dbg.location(74,9);
                    string_literal74=(Token)match(input,59,FOLLOW_59_in_exprBase715);  
                    stream_59.add(string_literal74);

                    dbg.location(74,16);
                    pushFollow(FOLLOW_exprBase_in_exprBase717);
                    exprBase75=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase75.getTree());
                    dbg.location(74,24);
                    char_literal76=(Token)match(input,56,FOLLOW_56_in_exprBase718);  
                    stream_56.add(char_literal76);


                    }



                    // AST REWRITE
                    // elements: 59, exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:29: -> ^( LIST ^( 'list' exprBase ) )
                    {
                        dbg.location(74,31);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:74:31: ^( LIST ^( 'list' exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(74,33);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                        dbg.location(74,37);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:74:37: ^( 'list' exprBase )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(74,39);
                        root_2 = (Object)adaptor.becomeRoot(stream_59.nextNode(), root_2);

                        dbg.location(74,45);
                        adaptor.addChild(root_2, stream_exprBase.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:75:4: ( '(' Symbol lExpr ')' )
                    {
                    dbg.location(75,4);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:75:4: ( '(' Symbol lExpr ')' )
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:75:5: '(' Symbol lExpr ')'
                    {
                    dbg.location(75,5);
                    char_literal77=(Token)match(input,54,FOLLOW_54_in_exprBase734);  
                    stream_54.add(char_literal77);

                    dbg.location(75,9);
                    Symbol78=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase736);  
                    stream_Symbol.add(Symbol78);

                    dbg.location(75,16);
                    pushFollow(FOLLOW_lExpr_in_exprBase738);
                    lExpr79=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr79.getTree());
                    dbg.location(75,22);
                    char_literal80=(Token)match(input,56,FOLLOW_56_in_exprBase740);  
                    stream_56.add(char_literal80);


                    }



                    // AST REWRITE
                    // elements: Symbol, lExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:27: -> ^( SYMBOL ^( Symbol lExpr ) )
                    {
                        dbg.location(75,29);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:75:29: ^( SYMBOL ^( Symbol lExpr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(75,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYMBOL, "SYMBOL"), root_1);

                        dbg.location(75,37);
                        // /home/rolyster/Documents/TLC/ProjetWhile.g:75:37: ^( Symbol lExpr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(75,39);
                        root_2 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_2);

                        dbg.location(75,46);
                        adaptor.addChild(root_2, stream_lExpr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(75, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprBase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprBase"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:78:1: expression : exprBase ( '=?' exprBase )? ;
    public final ProjetWhileParser.expression_return expression() throws RecognitionException {
        ProjetWhileParser.expression_return retval = new ProjetWhileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;
        ProjetWhileParser.exprBase_return exprBase81 = null;

        ProjetWhileParser.exprBase_return exprBase83 = null;


        Object string_literal82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:78:11: ( exprBase ( '=?' exprBase )? )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:78:13: exprBase ( '=?' exprBase )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(78,13);
            pushFollow(FOLLOW_exprBase_in_expression761);
            exprBase81=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, exprBase81.getTree());
            dbg.location(78,22);
            // /home/rolyster/Documents/TLC/ProjetWhile.g:78:22: ( '=?' exprBase )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==60) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:78:23: '=?' exprBase
                    {
                    dbg.location(78,23);
                    string_literal82=(Token)match(input,60,FOLLOW_60_in_expression764); 
                    string_literal82_tree = (Object)adaptor.create(string_literal82);
                    adaptor.addChild(root_0, string_literal82_tree);

                    dbg.location(78,28);
                    pushFollow(FOLLOW_exprBase_in_expression766);
                    exprBase83=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase83.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(78, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class lExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lExpr"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:79:1: lExpr : ( exprBase lExpr | );
    public final ProjetWhileParser.lExpr_return lExpr() throws RecognitionException {
        ProjetWhileParser.lExpr_return retval = new ProjetWhileParser.lExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProjetWhileParser.exprBase_return exprBase84 = null;

        ProjetWhileParser.lExpr_return lExpr85 = null;



        try { dbg.enterRule(getGrammarFileName(), "lExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:79:7: ( exprBase lExpr | )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Variable && LA11_0<=Symbol)||(LA11_0>=53 && LA11_0<=54)) ) {
                alt11=1;
            }
            else if ( (LA11_0==56) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:79:9: exprBase lExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,9);
                    pushFollow(FOLLOW_exprBase_in_lExpr775);
                    exprBase84=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase84.getTree());
                    dbg.location(79,18);
                    pushFollow(FOLLOW_lExpr_in_lExpr777);
                    lExpr85=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr85.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/rolyster/Documents/TLC/ProjetWhile.g:79:26: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(79, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "lExpr"

    public static class programme_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programme"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:82:1: programme : ( function )+ -> ( ^( FUNCTION function ) )+ ;
    public final ProjetWhileParser.programme_return programme() throws RecognitionException {
        ProjetWhileParser.programme_return retval = new ProjetWhileParser.programme_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProjetWhileParser.function_return function86 = null;


        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try { dbg.enterRule(getGrammarFileName(), "programme");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:82:11: ( ( function )+ -> ( ^( FUNCTION function ) )+ )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:82:13: ( function )+
            {
            dbg.location(82,13);
            // /home/rolyster/Documents/TLC/ProjetWhile.g:82:13: ( function )+
            int cnt12=0;
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/rolyster/Documents/TLC/ProjetWhile.g:82:13: function
            	    {
            	    dbg.location(82,13);
            	    pushFollow(FOLLOW_function_in_programme789);
            	    function86=function();

            	    state._fsp--;

            	    stream_function.add(function86.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt12++;
            } while (true);
            } finally {dbg.exitSubRule(12);}



            // AST REWRITE
            // elements: function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:23: -> ( ^( FUNCTION function ) )+
            {
                dbg.location(82,26);
                if ( !(stream_function.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function.hasNext() ) {
                    dbg.location(82,26);
                    // /home/rolyster/Documents/TLC/ProjetWhile.g:82:26: ^( FUNCTION function )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(82,28);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                    dbg.location(82,37);
                    adaptor.addChild(root_1, stream_function.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_function.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(82, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "programme");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "programme"

    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/rolyster/Documents/TLC/ProjetWhile.g:83:1: prog : programme ;
    public final ProjetWhileParser.prog_return prog() throws RecognitionException {
        ProjetWhileParser.prog_return retval = new ProjetWhileParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ProjetWhileParser.programme_return programme87 = null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // /home/rolyster/Documents/TLC/ProjetWhile.g:83:6: ( programme )
            dbg.enterAlt(1);

            // /home/rolyster/Documents/TLC/ProjetWhile.g:83:7: programme
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(83,7);
            pushFollow(FOLLOW_programme_in_prog805);
            programme87=programme();

            state._fsp--;

            adaptor.addChild(root_0, programme87.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(83, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\40\3\uffff\1\41\5\uffff";
    static final String DFA9_maxS =
        "\1\66\3\uffff\1\73\5\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\3\23\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\11\25\uffff\1\5\1\uffff\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "68:1: exprBase : ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_34_in_function211 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Symbol_in_function213 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_function215 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_definition_in_function217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_definition240 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_input_in_definition242 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_definition245 = new BitSet(new long[]{0x000C8A0100000000L});
    public static final BitSet FOLLOW_commands_in_definition247 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_definition249 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition251 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_output_in_definition253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputSub_in_input279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_inputSub288 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_inputSub292 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Variable_in_inputSub295 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Variable_in_output313 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_output316 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Variable_in_output317 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_command_in_commands337 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_commands340 = new BitSet(new long[]{0x000C8A0100000000L});
    public static final BitSet FOLLOW_command_in_commands342 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_41_in_command369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command377 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command379 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_exprs_in_command381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_command400 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_expression_in_command402 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_command404 = new BitSet(new long[]{0x000C8A0100000000L});
    public static final BitSet FOLLOW_commands_in_command406 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_command409 = new BitSet(new long[]{0x000C8A0100000000L});
    public static final BitSet FOLLOW_commands_in_command411 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_command415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_command444 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_expression_in_command446 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_command448 = new BitSet(new long[]{0x000C8A0100000000L});
    public static final BitSet FOLLOW_commands_in_command450 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_command452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_command474 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_expression_in_command476 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_command478 = new BitSet(new long[]{0x000C8A0100000000L});
    public static final BitSet FOLLOW_commands_in_command480 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_command482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_command505 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Variable_in_command507 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_command509 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_expression_in_command511 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_command513 = new BitSet(new long[]{0x000C8A0100000000L});
    public static final BitSet FOLLOW_commands_in_command515 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_command517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_vars545 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_39_in_vars548 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_vars_in_vars550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_vars554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs576 = new BitSet(new long[]{0x0060008300000002L});
    public static final BitSet FOLLOW_39_in_exprs579 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_exprs_in_exprs581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_exprBase614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_exprBase624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_exprBase647 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_exprBase649 = new BitSet(new long[]{0x0160000300000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase651 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_exprBase653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_exprBase669 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_exprBase671 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase673 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_exprBase675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_exprBase690 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_exprBase692 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase694 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_exprBase696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_exprBase713 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_exprBase715 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase717 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_exprBase718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_exprBase734 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase736 = new BitSet(new long[]{0x0160000300000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase738 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_exprBase740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression761 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_expression764 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_exprBase_in_expression766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lExpr775 = new BitSet(new long[]{0x0060000300000000L});
    public static final BitSet FOLLOW_lExpr_in_lExpr777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_programme789 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_programme_in_prog805 = new BitSet(new long[]{0x0000000000000002L});

}