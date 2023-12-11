// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g 2023-12-11 14:42:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Projet_WhileParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "INPUT", "DEFINITION", "CMD_LIST", "CMD", "EXPRESSION", "CONDITION", "COMANDES", "OUTPUT", "WHILE", "FOR", "FOREACH", "IF", "VAR", "BLOC", "VARIABLE", "VAR_LIST", "EXP_LIST", "EXP", "AFFECTATION", "SYMBOL", "TL", "HD", "LIST", "CONS", "WS", "Maj", "Min", "Dec", "Variable", "Symbol", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'hd'", "'tl'", "'list'", "'=?'"
    };
    public static final int EOF=-1;
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
    public static final int T__61=61;
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
    public static final int WS=29;
    public static final int Maj=30;
    public static final int Min=31;
    public static final int Dec=32;
    public static final int Variable=33;
    public static final int Symbol=34;

    // delegates
    // delegators


        public Projet_WhileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Projet_WhileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Projet_WhileParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g"; }


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:1: function : 'function' Symbol ':' definition -> ^( FUNCTION Symbol ^( BLOC definition ) ) ;
    public final Projet_WhileParser.function_return function() throws RecognitionException {
        Projet_WhileParser.function_return retval = new Projet_WhileParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token Symbol2=null;
        Token char_literal3=null;
        Projet_WhileParser.definition_return definition4 = null;


        Object string_literal1_tree=null;
        Object Symbol2_tree=null;
        Object char_literal3_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:11: ( 'function' Symbol ':' definition -> ^( FUNCTION Symbol ^( BLOC definition ) ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:13: 'function' Symbol ':' definition
            {
            string_literal1=(Token)match(input,35,FOLLOW_35_in_function237);  
            stream_35.add(string_literal1);

            Symbol2=(Token)match(input,Symbol,FOLLOW_Symbol_in_function239);  
            stream_Symbol.add(Symbol2);

            char_literal3=(Token)match(input,36,FOLLOW_36_in_function241);  
            stream_36.add(char_literal3);

            pushFollow(FOLLOW_definition_in_function243);
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
            // 50:46: -> ^( FUNCTION Symbol ^( BLOC definition ) )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:49: ^( FUNCTION Symbol ^( BLOC definition ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_Symbol.nextNode());
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:67: ^( BLOC definition )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_2);

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
        return retval;
    }
    // $ANTLR end "function"

    public static class definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:51:1: definition : 'read' input '%' commands '%' 'write' output -> ^( INPUT input ) commands ^( OUTPUT output ) ;
    public final Projet_WhileParser.definition_return definition() throws RecognitionException {
        Projet_WhileParser.definition_return retval = new Projet_WhileParser.definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token string_literal10=null;
        Projet_WhileParser.input_return input6 = null;

        Projet_WhileParser.commands_return commands8 = null;

        Projet_WhileParser.output_return output11 = null;


        Object string_literal5_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        Object string_literal10_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:52:2: ( 'read' input '%' commands '%' 'write' output -> ^( INPUT input ) commands ^( OUTPUT output ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:52:4: 'read' input '%' commands '%' 'write' output
            {
            string_literal5=(Token)match(input,37,FOLLOW_37_in_definition266);  
            stream_37.add(string_literal5);

            pushFollow(FOLLOW_input_in_definition268);
            input6=input();

            state._fsp--;

            stream_input.add(input6.getTree());
            char_literal7=(Token)match(input,38,FOLLOW_38_in_definition271);  
            stream_38.add(char_literal7);

            pushFollow(FOLLOW_commands_in_definition273);
            commands8=commands();

            state._fsp--;

            stream_commands.add(commands8.getTree());
            char_literal9=(Token)match(input,38,FOLLOW_38_in_definition275);  
            stream_38.add(char_literal9);

            string_literal10=(Token)match(input,39,FOLLOW_39_in_definition277);  
            stream_39.add(string_literal10);

            pushFollow(FOLLOW_output_in_definition279);
            output11=output();

            state._fsp--;

            stream_output.add(output11.getTree());


            // AST REWRITE
            // elements: input, commands, output
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 52:50: -> ^( INPUT input ) commands ^( OUTPUT output )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:52:53: ^( INPUT input )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);

                adaptor.addChild(root_1, stream_input.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_commands.nextTree());
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:52:77: ^( OUTPUT output )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);

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
        return retval;
    }
    // $ANTLR end "definition"

    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:53:1: input : ( inputSub | );
    public final Projet_WhileParser.input_return input() throws RecognitionException {
        Projet_WhileParser.input_return retval = new Projet_WhileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Projet_WhileParser.inputSub_return inputSub12 = null;



        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:53:7: ( inputSub | )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Variable) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:53:9: inputSub
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_inputSub_in_input305);
                    inputSub12=inputSub();

                    state._fsp--;

                    adaptor.addChild(root_0, inputSub12.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:53:19: 
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
        return retval;
    }
    // $ANTLR end "input"

    public static class inputSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputSub"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:1: inputSub : Variable ( ',' Variable )* -> ( ^( VAR Variable ) )+ ;
    public final Projet_WhileParser.inputSub_return inputSub() throws RecognitionException {
        Projet_WhileParser.inputSub_return retval = new Projet_WhileParser.inputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable13=null;
        Token char_literal14=null;
        Token Variable15=null;

        Object Variable13_tree=null;
        Object char_literal14_tree=null;
        Object Variable15_tree=null;
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");

        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:9: ( Variable ( ',' Variable )* -> ( ^( VAR Variable ) )+ )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:11: Variable ( ',' Variable )*
            {
            Variable13=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub314);  
            stream_Variable.add(Variable13);

            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:21: ( ',' Variable )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==40) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:22: ',' Variable
            	    {
            	    char_literal14=(Token)match(input,40,FOLLOW_40_in_inputSub318);  
            	    stream_40.add(char_literal14);

            	    Variable15=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub321);  
            	    stream_Variable.add(Variable15);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



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
            // 54:38: -> ( ^( VAR Variable ) )+
            {
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:42: ^( VAR Variable )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

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
        return retval;
    }
    // $ANTLR end "inputSub"

    public static class output_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:55:1: output : Variable ( ',' Variable )* -> ( ^( VAR Variable ) )+ ;
    public final Projet_WhileParser.output_return output() throws RecognitionException {
        Projet_WhileParser.output_return retval = new Projet_WhileParser.output_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable16=null;
        Token char_literal17=null;
        Token Variable18=null;

        Object Variable16_tree=null;
        Object char_literal17_tree=null;
        Object Variable18_tree=null;
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");

        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:55:7: ( Variable ( ',' Variable )* -> ( ^( VAR Variable ) )+ )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:55:8: Variable ( ',' Variable )*
            {
            Variable16=(Token)match(input,Variable,FOLLOW_Variable_in_output339);  
            stream_Variable.add(Variable16);

            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:55:17: ( ',' Variable )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==40) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:55:18: ',' Variable
            	    {
            	    char_literal17=(Token)match(input,40,FOLLOW_40_in_output342);  
            	    stream_40.add(char_literal17);

            	    Variable18=(Token)match(input,Variable,FOLLOW_Variable_in_output343);  
            	    stream_Variable.add(Variable18);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);



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
            // 55:31: -> ( ^( VAR Variable ) )+
            {
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:55:35: ^( VAR Variable )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

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
        return retval;
    }
    // $ANTLR end "output"

    public static class commands_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commands"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:1: commands : command ( ';' command )* -> ^( COMANDES ^( CMD_LIST ( ^( CMD command ) )+ ) ) ;
    public final Projet_WhileParser.commands_return commands() throws RecognitionException {
        Projet_WhileParser.commands_return retval = new Projet_WhileParser.commands_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        Projet_WhileParser.command_return command19 = null;

        Projet_WhileParser.command_return command21 = null;


        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:9: ( command ( ';' command )* -> ^( COMANDES ^( CMD_LIST ( ^( CMD command ) )+ ) ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:10: command ( ';' command )*
            {
            pushFollow(FOLLOW_command_in_commands363);
            command19=command();

            state._fsp--;

            stream_command.add(command19.getTree());
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:18: ( ';' command )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==41) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:19: ';' command
            	    {
            	    char_literal20=(Token)match(input,41,FOLLOW_41_in_commands366);  
            	    stream_41.add(char_literal20);

            	    pushFollow(FOLLOW_command_in_commands368);
            	    command21=command();

            	    state._fsp--;

            	    stream_command.add(command21.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



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
            // 59:33: -> ^( COMANDES ^( CMD_LIST ( ^( CMD command ) )+ ) )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:36: ^( COMANDES ^( CMD_LIST ( ^( CMD command ) )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMANDES, "COMANDES"), root_1);

                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:47: ^( CMD_LIST ( ^( CMD command ) )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CMD_LIST, "CMD_LIST"), root_2);

                if ( !(stream_command.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_command.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:58: ^( CMD command )
                    {
                    Object root_3 = (Object)adaptor.nil();
                    root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(CMD, "CMD"), root_3);

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
        return retval;
    }
    // $ANTLR end "commands"

    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:1: command : ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( AFFECTATION vars ':=' exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE 'while' expression 'do' commands 'od' ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( CONDITION expression ) commands ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' ) );
    public final Projet_WhileParser.command_return command() throws RecognitionException {
        Projet_WhileParser.command_return retval = new Projet_WhileParser.command_return();
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
        Projet_WhileParser.vars_return vars23 = null;

        Projet_WhileParser.exprs_return exprs25 = null;

        Projet_WhileParser.expression_return expression27 = null;

        Projet_WhileParser.commands_return commands29 = null;

        Projet_WhileParser.commands_return commands31 = null;

        Projet_WhileParser.expression_return expression34 = null;

        Projet_WhileParser.commands_return commands36 = null;

        Projet_WhileParser.expression_return expression39 = null;

        Projet_WhileParser.commands_return commands41 = null;

        Projet_WhileParser.expression_return expression46 = null;

        Projet_WhileParser.commands_return commands48 = null;


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
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:8: ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( AFFECTATION vars ':=' exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE 'while' expression 'do' commands 'od' ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( CONDITION expression ) commands ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt6=1;
                }
                break;
            case Variable:
                {
                alt6=2;
                }
                break;
            case 44:
                {
                alt6=3;
                }
                break;
            case 48:
                {
                alt6=4;
                }
                break;
            case 51:
                {
                alt6=5;
                }
                break;
            case 52:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:10: ( 'nop' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:10: ( 'nop' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:11: 'nop'
                    {
                    string_literal22=(Token)match(input,42,FOLLOW_42_in_command395); 
                    string_literal22_tree = (Object)adaptor.create(string_literal22);
                    adaptor.addChild(root_0, string_literal22_tree);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:62:4: ( vars ':=' exprs )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:62:4: ( vars ':=' exprs )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:62:5: vars ':=' exprs
                    {
                    pushFollow(FOLLOW_vars_in_command403);
                    vars23=vars();

                    state._fsp--;

                    stream_vars.add(vars23.getTree());
                    string_literal24=(Token)match(input,43,FOLLOW_43_in_command405);  
                    stream_43.add(string_literal24);

                    pushFollow(FOLLOW_exprs_in_command407);
                    exprs25=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs25.getTree());

                    }



                    // AST REWRITE
                    // elements: exprs, vars, 43
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:22: -> ^( AFFECTATION vars ':=' exprs )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:62:25: ^( AFFECTATION vars ':=' exprs )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECTATION, "AFFECTATION"), root_1);

                        adaptor.addChild(root_1, stream_vars.nextTree());
                        adaptor.addChild(root_1, stream_43.nextNode());
                        adaptor.addChild(root_1, stream_exprs.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
                    {
                    string_literal26=(Token)match(input,44,FOLLOW_44_in_command426);  
                    stream_44.add(string_literal26);

                    pushFollow(FOLLOW_expression_in_command428);
                    expression27=expression();

                    state._fsp--;

                    stream_expression.add(expression27.getTree());
                    string_literal28=(Token)match(input,45,FOLLOW_45_in_command430);  
                    stream_45.add(string_literal28);

                    pushFollow(FOLLOW_commands_in_command432);
                    commands29=commands();

                    state._fsp--;

                    stream_commands.add(commands29.getTree());
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:37: ( 'else' commands )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==46) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:38: 'else' commands
                            {
                            string_literal30=(Token)match(input,46,FOLLOW_46_in_command435);  
                            stream_46.add(string_literal30);

                            pushFollow(FOLLOW_commands_in_command437);
                            commands31=commands();

                            state._fsp--;

                            stream_commands.add(commands31.getTree());

                            }
                            break;

                    }

                    string_literal32=(Token)match(input,47,FOLLOW_47_in_command441);  
                    stream_47.add(string_literal32);


                    }



                    // AST REWRITE
                    // elements: commands, 44, commands, 47, expression, 45, 46
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:62: -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:64: ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_44.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_45.nextNode());
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:101: ( 'else' commands )?
                        if ( stream_commands.hasNext()||stream_46.hasNext() ) {
                            adaptor.addChild(root_1, stream_46.nextNode());
                            adaptor.addChild(root_1, stream_commands.nextTree());

                        }
                        stream_commands.reset();
                        stream_46.reset();
                        adaptor.addChild(root_1, stream_47.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:4: ( 'while' expression 'do' commands 'od' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:4: ( 'while' expression 'do' commands 'od' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:5: 'while' expression 'do' commands 'od'
                    {
                    string_literal33=(Token)match(input,48,FOLLOW_48_in_command470);  
                    stream_48.add(string_literal33);

                    pushFollow(FOLLOW_expression_in_command472);
                    expression34=expression();

                    state._fsp--;

                    stream_expression.add(expression34.getTree());
                    string_literal35=(Token)match(input,49,FOLLOW_49_in_command474);  
                    stream_49.add(string_literal35);

                    pushFollow(FOLLOW_commands_in_command476);
                    commands36=commands();

                    state._fsp--;

                    stream_commands.add(commands36.getTree());
                    string_literal37=(Token)match(input,50,FOLLOW_50_in_command478);  
                    stream_50.add(string_literal37);


                    }



                    // AST REWRITE
                    // elements: commands, 48, 50, expression, 49
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:44: -> ^( WHILE 'while' expression 'do' commands 'od' )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:46: ^( WHILE 'while' expression 'do' commands 'od' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_48.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_49.nextNode());
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        adaptor.addChild(root_1, stream_50.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:65:4: ( 'for' expression 'do' commands 'od' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:65:4: ( 'for' expression 'do' commands 'od' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:65:5: 'for' expression 'do' commands 'od'
                    {
                    string_literal38=(Token)match(input,51,FOLLOW_51_in_command500);  
                    stream_51.add(string_literal38);

                    pushFollow(FOLLOW_expression_in_command502);
                    expression39=expression();

                    state._fsp--;

                    stream_expression.add(expression39.getTree());
                    string_literal40=(Token)match(input,49,FOLLOW_49_in_command504);  
                    stream_49.add(string_literal40);

                    pushFollow(FOLLOW_commands_in_command506);
                    commands41=commands();

                    state._fsp--;

                    stream_commands.add(commands41.getTree());
                    string_literal42=(Token)match(input,50,FOLLOW_50_in_command508);  
                    stream_50.add(string_literal42);


                    }



                    // AST REWRITE
                    // elements: expression, commands
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:42: -> ^( FOR ^( CONDITION expression ) commands )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:65:45: ^( FOR ^( CONDITION expression ) commands )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:65:51: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:66:4: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:66:4: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:66:6: 'foreach' Variable 'in' expression 'do' commands 'od'
                    {
                    string_literal43=(Token)match(input,52,FOLLOW_52_in_command531);  
                    stream_52.add(string_literal43);

                    Variable44=(Token)match(input,Variable,FOLLOW_Variable_in_command533);  
                    stream_Variable.add(Variable44);

                    string_literal45=(Token)match(input,53,FOLLOW_53_in_command535);  
                    stream_53.add(string_literal45);

                    pushFollow(FOLLOW_expression_in_command537);
                    expression46=expression();

                    state._fsp--;

                    stream_expression.add(expression46.getTree());
                    string_literal47=(Token)match(input,49,FOLLOW_49_in_command539);  
                    stream_49.add(string_literal47);

                    pushFollow(FOLLOW_commands_in_command541);
                    commands48=commands();

                    state._fsp--;

                    stream_commands.add(commands48.getTree());
                    string_literal49=(Token)match(input,50,FOLLOW_50_in_command543);  
                    stream_50.add(string_literal49);


                    }



                    // AST REWRITE
                    // elements: 53, 50, 52, commands, Variable, 49, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:61: -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:66:64: ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);

                        adaptor.addChild(root_1, stream_52.nextNode());
                        adaptor.addChild(root_1, stream_Variable.nextNode());
                        adaptor.addChild(root_1, stream_53.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_49.nextNode());
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        adaptor.addChild(root_1, stream_50.nextNode());

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
        return retval;
    }
    // $ANTLR end "command"

    public static class vars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vars"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:1: vars : Variable ( ',' vars | Variable )? -> ^( VAR_LIST ( ^( VAR Variable ) )+ ) ;
    public final Projet_WhileParser.vars_return vars() throws RecognitionException {
        Projet_WhileParser.vars_return retval = new Projet_WhileParser.vars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable50=null;
        Token char_literal51=null;
        Token Variable53=null;
        Projet_WhileParser.vars_return vars52 = null;


        Object Variable50_tree=null;
        Object char_literal51_tree=null;
        Object Variable53_tree=null;
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:5: ( Variable ( ',' vars | Variable )? -> ^( VAR_LIST ( ^( VAR Variable ) )+ ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:6: Variable ( ',' vars | Variable )?
            {
            Variable50=(Token)match(input,Variable,FOLLOW_Variable_in_vars571);  
            stream_Variable.add(Variable50);

            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:15: ( ',' vars | Variable )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==40) ) {
                alt7=1;
            }
            else if ( (LA7_0==Variable) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:16: ',' vars
                    {
                    char_literal51=(Token)match(input,40,FOLLOW_40_in_vars574);  
                    stream_40.add(char_literal51);

                    pushFollow(FOLLOW_vars_in_vars576);
                    vars52=vars();

                    state._fsp--;

                    stream_vars.add(vars52.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:27: Variable
                    {
                    Variable53=(Token)match(input,Variable,FOLLOW_Variable_in_vars580);  
                    stream_Variable.add(Variable53);


                    }
                    break;

            }



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
            // 68:38: -> ^( VAR_LIST ( ^( VAR Variable ) )+ )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:41: ^( VAR_LIST ( ^( VAR Variable ) )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_LIST, "VAR_LIST"), root_1);

                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:53: ^( VAR Variable )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_2);

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
        return retval;
    }
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:1: exprs : expression ( ',' exprs | expression )? -> ^( EXP_LIST ( ^( EXP expression ) )+ ) ;
    public final Projet_WhileParser.exprs_return exprs() throws RecognitionException {
        Projet_WhileParser.exprs_return retval = new Projet_WhileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        Projet_WhileParser.expression_return expression54 = null;

        Projet_WhileParser.exprs_return exprs56 = null;

        Projet_WhileParser.expression_return expression57 = null;


        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:6: ( expression ( ',' exprs | expression )? -> ^( EXP_LIST ( ^( EXP expression ) )+ ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:8: expression ( ',' exprs | expression )?
            {
            pushFollow(FOLLOW_expression_in_exprs602);
            expression54=expression();

            state._fsp--;

            stream_expression.add(expression54.getTree());
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:19: ( ',' exprs | expression )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=Variable && LA8_0<=Symbol)||(LA8_0>=54 && LA8_0<=55)) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:20: ',' exprs
                    {
                    char_literal55=(Token)match(input,40,FOLLOW_40_in_exprs605);  
                    stream_40.add(char_literal55);

                    pushFollow(FOLLOW_exprs_in_exprs607);
                    exprs56=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs56.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:32: expression
                    {
                    pushFollow(FOLLOW_expression_in_exprs611);
                    expression57=expression();

                    state._fsp--;

                    stream_expression.add(expression57.getTree());

                    }
                    break;

            }



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
            // 69:45: -> ^( EXP_LIST ( ^( EXP expression ) )+ )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:48: ^( EXP_LIST ( ^( EXP expression ) )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:60: ^( EXP expression )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_2);

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
        return retval;
    }
    // $ANTLR end "exprs"

    public static class exprBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:1: exprBase : ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) );
    public final Projet_WhileParser.exprBase_return exprBase() throws RecognitionException {
        Projet_WhileParser.exprBase_return retval = new Projet_WhileParser.exprBase_return();
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
        Projet_WhileParser.lExpr_return lExpr63 = null;

        Projet_WhileParser.exprBase_return exprBase67 = null;

        Projet_WhileParser.exprBase_return exprBase71 = null;

        Projet_WhileParser.exprBase_return exprBase75 = null;

        Projet_WhileParser.lExpr_return lExpr79 = null;


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
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:9: ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:15: 'nil'
                    {
                    string_literal58=(Token)match(input,54,FOLLOW_54_in_exprBase640);  
                    stream_54.add(string_literal58);



                    // AST REWRITE
                    // elements: 54
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:20: -> ^( 'nil' )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:23: ^( 'nil' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_54.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:72:4: Variable
                    {
                    Variable59=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase650);  
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
                    // 72:13: -> ^( Variable )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:72:16: ^( Variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Variable.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:73:4: Symbol
                    {
                    Symbol60=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase661);  
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
                    // 73:11: -> ^( Symbol )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:73:14: ^( Symbol )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:74:4: ( '(' 'cons' lExpr ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:74:4: ( '(' 'cons' lExpr ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:74:5: '(' 'cons' lExpr ')'
                    {
                    char_literal61=(Token)match(input,55,FOLLOW_55_in_exprBase673);  
                    stream_55.add(char_literal61);

                    string_literal62=(Token)match(input,56,FOLLOW_56_in_exprBase675);  
                    stream_56.add(string_literal62);

                    pushFollow(FOLLOW_lExpr_in_exprBase677);
                    lExpr63=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr63.getTree());
                    char_literal64=(Token)match(input,57,FOLLOW_57_in_exprBase679);  
                    stream_57.add(char_literal64);


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
                    // 74:27: -> ^( CONS ^( lExpr ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:74:29: ^( CONS ^( lExpr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:74:36: ^( lExpr )
                        {
                        Object root_2 = (Object)adaptor.nil();
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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:75:4: ( '(' 'hd' exprBase ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:75:4: ( '(' 'hd' exprBase ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:75:5: '(' 'hd' exprBase ')'
                    {
                    char_literal65=(Token)match(input,55,FOLLOW_55_in_exprBase695);  
                    stream_55.add(char_literal65);

                    string_literal66=(Token)match(input,58,FOLLOW_58_in_exprBase697);  
                    stream_58.add(string_literal66);

                    pushFollow(FOLLOW_exprBase_in_exprBase699);
                    exprBase67=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase67.getTree());
                    char_literal68=(Token)match(input,57,FOLLOW_57_in_exprBase701);  
                    stream_57.add(char_literal68);


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
                    // 75:28: -> ^( HD ^( exprBase ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:75:30: ^( HD ^( exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:75:34: ^( exprBase )
                        {
                        Object root_2 = (Object)adaptor.nil();
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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:4: ( '(' 'tl' exprBase ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:4: ( '(' 'tl' exprBase ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:5: '(' 'tl' exprBase ')'
                    {
                    char_literal69=(Token)match(input,55,FOLLOW_55_in_exprBase716);  
                    stream_55.add(char_literal69);

                    string_literal70=(Token)match(input,59,FOLLOW_59_in_exprBase718);  
                    stream_59.add(string_literal70);

                    pushFollow(FOLLOW_exprBase_in_exprBase720);
                    exprBase71=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase71.getTree());
                    char_literal72=(Token)match(input,57,FOLLOW_57_in_exprBase722);  
                    stream_57.add(char_literal72);


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
                    // 76:28: -> ^( TL ^( 'tl' exprBase ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:30: ^( TL ^( 'tl' exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:34: ^( 'tl' exprBase )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_59.nextNode(), root_2);

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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:4: ( '(' 'list' exprBase ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:4: ( '(' 'list' exprBase ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:5: '(' 'list' exprBase ')'
                    {
                    char_literal73=(Token)match(input,55,FOLLOW_55_in_exprBase739);  
                    stream_55.add(char_literal73);

                    string_literal74=(Token)match(input,60,FOLLOW_60_in_exprBase741);  
                    stream_60.add(string_literal74);

                    pushFollow(FOLLOW_exprBase_in_exprBase743);
                    exprBase75=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase75.getTree());
                    char_literal76=(Token)match(input,57,FOLLOW_57_in_exprBase744);  
                    stream_57.add(char_literal76);


                    }



                    // AST REWRITE
                    // elements: exprBase, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:29: -> ^( LIST ^( 'list' exprBase ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:31: ^( LIST ^( 'list' exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:37: ^( 'list' exprBase )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_60.nextNode(), root_2);

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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:78:4: ( '(' Symbol lExpr ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:78:4: ( '(' Symbol lExpr ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:78:5: '(' Symbol lExpr ')'
                    {
                    char_literal77=(Token)match(input,55,FOLLOW_55_in_exprBase760);  
                    stream_55.add(char_literal77);

                    Symbol78=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase762);  
                    stream_Symbol.add(Symbol78);

                    pushFollow(FOLLOW_lExpr_in_exprBase764);
                    lExpr79=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr79.getTree());
                    char_literal80=(Token)match(input,57,FOLLOW_57_in_exprBase766);  
                    stream_57.add(char_literal80);


                    }



                    // AST REWRITE
                    // elements: lExpr, Symbol
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:27: -> ^( SYMBOL ^( Symbol lExpr ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:78:29: ^( SYMBOL ^( Symbol lExpr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYMBOL, "SYMBOL"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:78:37: ^( Symbol lExpr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_2);

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
        return retval;
    }
    // $ANTLR end "exprBase"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:81:1: expression : exprBase ( '=?' exprBase )? ;
    public final Projet_WhileParser.expression_return expression() throws RecognitionException {
        Projet_WhileParser.expression_return retval = new Projet_WhileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;
        Projet_WhileParser.exprBase_return exprBase81 = null;

        Projet_WhileParser.exprBase_return exprBase83 = null;


        Object string_literal82_tree=null;

        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:81:11: ( exprBase ( '=?' exprBase )? )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:81:13: exprBase ( '=?' exprBase )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBase_in_expression787);
            exprBase81=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, exprBase81.getTree());
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:81:22: ( '=?' exprBase )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==61) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:81:23: '=?' exprBase
                    {
                    string_literal82=(Token)match(input,61,FOLLOW_61_in_expression790); 
                    string_literal82_tree = (Object)adaptor.create(string_literal82);
                    adaptor.addChild(root_0, string_literal82_tree);

                    pushFollow(FOLLOW_exprBase_in_expression792);
                    exprBase83=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase83.getTree());

                    }
                    break;

            }


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
        return retval;
    }
    // $ANTLR end "expression"

    public static class lExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lExpr"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:82:1: lExpr : ( exprBase lExpr | );
    public final Projet_WhileParser.lExpr_return lExpr() throws RecognitionException {
        Projet_WhileParser.lExpr_return retval = new Projet_WhileParser.lExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Projet_WhileParser.exprBase_return exprBase84 = null;

        Projet_WhileParser.lExpr_return lExpr85 = null;



        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:82:7: ( exprBase lExpr | )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Variable && LA11_0<=Symbol)||(LA11_0>=54 && LA11_0<=55)) ) {
                alt11=1;
            }
            else if ( (LA11_0==57) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:82:9: exprBase lExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprBase_in_lExpr801);
                    exprBase84=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase84.getTree());
                    pushFollow(FOLLOW_lExpr_in_lExpr803);
                    lExpr85=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr85.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:82:26: 
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
        return retval;
    }
    // $ANTLR end "lExpr"

    public static class programme_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programme"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:85:1: programme : ( function )+ -> ( ^( FUNCTION function ) )+ ;
    public final Projet_WhileParser.programme_return programme() throws RecognitionException {
        Projet_WhileParser.programme_return retval = new Projet_WhileParser.programme_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Projet_WhileParser.function_return function86 = null;


        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:85:11: ( ( function )+ -> ( ^( FUNCTION function ) )+ )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:85:13: ( function )+
            {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:85:13: ( function )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:85:13: function
            	    {
            	    pushFollow(FOLLOW_function_in_programme815);
            	    function86=function();

            	    state._fsp--;

            	    stream_function.add(function86.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);



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
            // 85:23: -> ( ^( FUNCTION function ) )+
            {
                if ( !(stream_function.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:85:26: ^( FUNCTION function )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

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
        return retval;
    }
    // $ANTLR end "programme"

    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:86:1: prog : programme ;
    public final Projet_WhileParser.prog_return prog() throws RecognitionException {
        Projet_WhileParser.prog_return retval = new Projet_WhileParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Projet_WhileParser.programme_return programme87 = null;



        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:86:6: ( programme )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:86:7: programme
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_programme_in_prog831);
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
        "\1\41\3\uffff\1\42\5\uffff";
    static final String DFA9_maxS =
        "\1\67\3\uffff\1\74\5\uffff";
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
            return "71:1: exprBase : ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_35_in_function237 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_Symbol_in_function239 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_function241 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_definition_in_function243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_definition266 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_input_in_definition268 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition271 = new BitSet(new long[]{0x0019140200000000L});
    public static final BitSet FOLLOW_commands_in_definition273 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition275 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition277 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_output_in_definition279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputSub_in_input305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_inputSub314 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_inputSub318 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Variable_in_inputSub321 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_Variable_in_output339 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_output342 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Variable_in_output343 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_command_in_commands363 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_commands366 = new BitSet(new long[]{0x0019140200000000L});
    public static final BitSet FOLLOW_command_in_commands368 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_42_in_command395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command403 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_command405 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_exprs_in_command407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_command426 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_expression_in_command428 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command430 = new BitSet(new long[]{0x0019140200000000L});
    public static final BitSet FOLLOW_commands_in_command432 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_command435 = new BitSet(new long[]{0x0019140200000000L});
    public static final BitSet FOLLOW_commands_in_command437 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_command441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_command470 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_expression_in_command472 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_command474 = new BitSet(new long[]{0x0019140200000000L});
    public static final BitSet FOLLOW_commands_in_command476 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_command478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_command500 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_expression_in_command502 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_command504 = new BitSet(new long[]{0x0019140200000000L});
    public static final BitSet FOLLOW_commands_in_command506 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_command508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_command531 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Variable_in_command533 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_command535 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_expression_in_command537 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_command539 = new BitSet(new long[]{0x0019140200000000L});
    public static final BitSet FOLLOW_commands_in_command541 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_command543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_vars571 = new BitSet(new long[]{0x0000010200000002L});
    public static final BitSet FOLLOW_40_in_vars574 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_vars_in_vars576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_vars580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs602 = new BitSet(new long[]{0x00C0010600000002L});
    public static final BitSet FOLLOW_40_in_exprs605 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_exprs_in_exprs607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_exprBase640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_exprBase650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_exprBase673 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_exprBase675 = new BitSet(new long[]{0x02C0000600000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase677 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_exprBase679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_exprBase695 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_exprBase697 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase699 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_exprBase701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_exprBase716 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_exprBase718 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase720 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_exprBase722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_exprBase739 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_exprBase741 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase743 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_exprBase744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_exprBase760 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase762 = new BitSet(new long[]{0x02C0000600000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase764 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_exprBase766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression787 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_expression790 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_exprBase_in_expression792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lExpr801 = new BitSet(new long[]{0x00C0000600000000L});
    public static final BitSet FOLLOW_lExpr_in_lExpr803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_programme815 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_programme_in_prog831 = new BitSet(new long[]{0x0000000000000002L});

}