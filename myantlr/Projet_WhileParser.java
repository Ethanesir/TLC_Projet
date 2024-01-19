package myantlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Projet_WhileParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "INPUT", "DEFINITION", "EXPRESSION", "CONDITION", "COMANDES", "OUTPUT", "WHILE", "FOR", "FOREACH", "IF", "VARIABLE", "VAR_LIST", "EXP_LIST", "AFFECTATION", "SYMBOL", "TL", "HD", "LIST", "CONS", "WS", "Maj", "Min", "Dec", "Variable", "Symbol", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'hd'", "'tl'", "'list'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
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
    public static final int FUNCTION=4;
    public static final int INPUT=5;
    public static final int DEFINITION=6;
    public static final int EXPRESSION=7;
    public static final int CONDITION=8;
    public static final int COMANDES=9;
    public static final int OUTPUT=10;
    public static final int WHILE=11;
    public static final int FOR=12;
    public static final int FOREACH=13;
    public static final int IF=14;
    public static final int VARIABLE=15;
    public static final int VAR_LIST=16;
    public static final int EXP_LIST=17;
    public static final int AFFECTATION=18;
    public static final int SYMBOL=19;
    public static final int TL=20;
    public static final int HD=21;
    public static final int LIST=22;
    public static final int CONS=23;
    public static final int WS=24;
    public static final int Maj=25;
    public static final int Min=26;
    public static final int Dec=27;
    public static final int Variable=28;
    public static final int Symbol=29;

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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:45:1: function : 'function' Symbol ':' definition -> ^( Symbol definition ) ;
    public final function_return function() throws RecognitionException {
        function_return retval = new function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token Symbol2=null;
        Token char_literal3=null;
        definition_return definition4 = null;


        Object string_literal1_tree=null;
        Object Symbol2_tree=null;
        Object char_literal3_tree=null;
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:45:11: ( 'function' Symbol ':' definition -> ^( Symbol definition ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:45:13: 'function' Symbol ':' definition
            {
            string_literal1=(Token)match(input,30,FOLLOW_30_in_function217);  
            stream_30.add(string_literal1);

            Symbol2=(Token)match(input,Symbol,FOLLOW_Symbol_in_function219);  
            stream_Symbol.add(Symbol2);

            char_literal3=(Token)match(input,31,FOLLOW_31_in_function221);  
            stream_31.add(char_literal3);

            pushFollow(FOLLOW_definition_in_function223);
            definition4=definition();

            state._fsp--;

            stream_definition.add(definition4.getTree());


            // AST REWRITE
            // elements: Symbol, definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:46: -> ^( Symbol definition )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:45:49: ^( Symbol definition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_1);

                adaptor.addChild(root_1, stream_definition.nextTree());

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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:46:1: definition : 'read' input '%' commands '%' 'write' output -> ^( INPUT input ) commands ^( OUTPUT output ) ;
    public final definition_return definition() throws RecognitionException {
        definition_return retval = new definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token string_literal10=null;
        input_return input6 = null;

        commands_return commands8 = null;

        output_return output11 = null;


        Object string_literal5_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        Object string_literal10_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:2: ( 'read' input '%' commands '%' 'write' output -> ^( INPUT input ) commands ^( OUTPUT output ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:4: 'read' input '%' commands '%' 'write' output
            {
            string_literal5=(Token)match(input,32,FOLLOW_32_in_definition240);  
            stream_32.add(string_literal5);

            pushFollow(FOLLOW_input_in_definition242);
            input6=input();

            state._fsp--;

            stream_input.add(input6.getTree());
            char_literal7=(Token)match(input,33,FOLLOW_33_in_definition245);  
            stream_33.add(char_literal7);

            pushFollow(FOLLOW_commands_in_definition247);
            commands8=commands();

            state._fsp--;

            stream_commands.add(commands8.getTree());
            char_literal9=(Token)match(input,33,FOLLOW_33_in_definition249);  
            stream_33.add(char_literal9);

            string_literal10=(Token)match(input,34,FOLLOW_34_in_definition251);  
            stream_34.add(string_literal10);

            pushFollow(FOLLOW_output_in_definition253);
            output11=output();

            state._fsp--;

            stream_output.add(output11.getTree());


            // AST REWRITE
            // elements: output, input, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:50: -> ^( INPUT input ) commands ^( OUTPUT output )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:53: ^( INPUT input )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);

                adaptor.addChild(root_1, stream_input.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_commands.nextTree());
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:77: ^( OUTPUT output )
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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:48:1: input : ( inputSub | );
    public final input_return input() throws RecognitionException {
        input_return retval = new input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        inputSub_return inputSub12 = null;



        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:48:7: ( inputSub | )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Variable) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:48:9: inputSub
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_inputSub_in_input279);
                    inputSub12=inputSub();

                    state._fsp--;

                    adaptor.addChild(root_0, inputSub12.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:48:19: 
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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:49:1: inputSub : Variable ( ',' Variable )* -> ( ^( Variable ) )+ ;
    public final inputSub_return inputSub() throws RecognitionException {
        inputSub_return retval = new inputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable13=null;
        Token char_literal14=null;
        Token Variable15=null;

        Object Variable13_tree=null;
        Object char_literal14_tree=null;
        Object Variable15_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:49:9: ( Variable ( ',' Variable )* -> ( ^( Variable ) )+ )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:49:11: Variable ( ',' Variable )*
            {
            Variable13=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub288);  
            stream_Variable.add(Variable13);

            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:49:21: ( ',' Variable )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:49:22: ',' Variable
            	    {
            	    char_literal14=(Token)match(input,35,FOLLOW_35_in_inputSub292);  
            	    stream_35.add(char_literal14);

            	    Variable15=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub295);  
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
            // 49:38: -> ( ^( Variable ) )+
            {
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:49:42: ^( Variable )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_Variable.nextNode(), root_1);

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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:1: output : Variable ( ',' Variable )* -> ( ^( Variable ) )+ ;
    public final output_return output() throws RecognitionException {
        output_return retval = new output_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable16=null;
        Token char_literal17=null;
        Token Variable18=null;

        Object Variable16_tree=null;
        Object char_literal17_tree=null;
        Object Variable18_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:7: ( Variable ( ',' Variable )* -> ( ^( Variable ) )+ )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:8: Variable ( ',' Variable )*
            {
            Variable16=(Token)match(input,Variable,FOLLOW_Variable_in_output310);  
            stream_Variable.add(Variable16);

            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:17: ( ',' Variable )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:18: ',' Variable
            	    {
            	    char_literal17=(Token)match(input,35,FOLLOW_35_in_output313);  
            	    stream_35.add(char_literal17);

            	    Variable18=(Token)match(input,Variable,FOLLOW_Variable_in_output314);  
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
            // 50:31: -> ( ^( Variable ) )+
            {
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:50:35: ^( Variable )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_Variable.nextNode(), root_1);

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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:1: commands : command ( ';' command )* -> ^( COMANDES ( command )+ ) ;
    public final commands_return commands() throws RecognitionException {
        commands_return retval = new commands_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        command_return command19 = null;

        command_return command21 = null;


        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:9: ( command ( ';' command )* -> ^( COMANDES ( command )+ ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:10: command ( ';' command )*
            {
            pushFollow(FOLLOW_command_in_commands331);
            command19=command();

            state._fsp--;

            stream_command.add(command19.getTree());
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:18: ( ';' command )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:19: ';' command
            	    {
            	    char_literal20=(Token)match(input,36,FOLLOW_36_in_commands334);  
            	    stream_36.add(char_literal20);

            	    pushFollow(FOLLOW_command_in_commands336);
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
            // 54:33: -> ^( COMANDES ( command )+ )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:54:36: ^( COMANDES ( command )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMANDES, "COMANDES"), root_1);

                if ( !(stream_command.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_command.hasNext() ) {
                    adaptor.addChild(root_1, stream_command.nextTree());

                }
                stream_command.reset();

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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:56:1: command : ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( AFFECTATION vars ':=' exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE 'while' expression 'do' commands 'od' ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( CONDITION expression ) commands ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' ) );
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
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
        vars_return vars23 = null;

        exprs_return exprs25 = null;

        expression_return expression27 = null;

        commands_return commands29 = null;

        commands_return commands31 = null;

        expression_return expression34 = null;

        commands_return commands36 = null;

        expression_return expression39 = null;

        commands_return commands41 = null;

        expression_return expression46 = null;

        commands_return commands48 = null;


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
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:56:8: ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( AFFECTATION vars ':=' exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE 'while' expression 'do' commands 'od' ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( CONDITION expression ) commands ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt6=1;
                }
                break;
            case Variable:
                {
                alt6=2;
                }
                break;
            case 39:
                {
                alt6=3;
                }
                break;
            case 43:
                {
                alt6=4;
                }
                break;
            case 46:
                {
                alt6=5;
                }
                break;
            case 47:
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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:56:10: ( 'nop' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:56:10: ( 'nop' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:56:11: 'nop'
                    {
                    string_literal22=(Token)match(input,37,FOLLOW_37_in_command357); 
                    string_literal22_tree = (Object)adaptor.create(string_literal22);
                    adaptor.addChild(root_0, string_literal22_tree);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:57:4: ( vars ':=' exprs )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:57:4: ( vars ':=' exprs )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:57:5: vars ':=' exprs
                    {
                    pushFollow(FOLLOW_vars_in_command365);
                    vars23=vars();

                    state._fsp--;

                    stream_vars.add(vars23.getTree());
                    string_literal24=(Token)match(input,38,FOLLOW_38_in_command367);  
                    stream_38.add(string_literal24);

                    pushFollow(FOLLOW_exprs_in_command369);
                    exprs25=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs25.getTree());

                    }



                    // AST REWRITE
                    // elements: vars, 38, exprs
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 57:22: -> ^( AFFECTATION vars ':=' exprs )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:57:25: ^( AFFECTATION vars ':=' exprs )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECTATION, "AFFECTATION"), root_1);

                        adaptor.addChild(root_1, stream_vars.nextTree());
                        adaptor.addChild(root_1, stream_38.nextNode());
                        adaptor.addChild(root_1, stream_exprs.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:58:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:58:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:58:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
                    {
                    string_literal26=(Token)match(input,39,FOLLOW_39_in_command388);  
                    stream_39.add(string_literal26);

                    pushFollow(FOLLOW_expression_in_command390);
                    expression27=expression();

                    state._fsp--;

                    stream_expression.add(expression27.getTree());
                    string_literal28=(Token)match(input,40,FOLLOW_40_in_command392);  
                    stream_40.add(string_literal28);

                    pushFollow(FOLLOW_commands_in_command394);
                    commands29=commands();

                    state._fsp--;

                    stream_commands.add(commands29.getTree());
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:58:37: ( 'else' commands )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==41) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:58:38: 'else' commands
                            {
                            string_literal30=(Token)match(input,41,FOLLOW_41_in_command397);  
                            stream_41.add(string_literal30);

                            pushFollow(FOLLOW_commands_in_command399);
                            commands31=commands();

                            state._fsp--;

                            stream_commands.add(commands31.getTree());

                            }
                            break;

                    }

                    string_literal32=(Token)match(input,42,FOLLOW_42_in_command403);  
                    stream_42.add(string_literal32);


                    }



                    // AST REWRITE
                    // elements: 41, 40, commands, 39, commands, expression, 42
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 58:62: -> ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:58:64: ^( IF 'if' expression 'then' commands ( 'else' commands )? 'fi' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_39.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_40.nextNode());
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:58:101: ( 'else' commands )?
                        if ( stream_41.hasNext()||stream_commands.hasNext() ) {
                            adaptor.addChild(root_1, stream_41.nextNode());
                            adaptor.addChild(root_1, stream_commands.nextTree());

                        }
                        stream_41.reset();
                        stream_commands.reset();
                        adaptor.addChild(root_1, stream_42.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:4: ( 'while' expression 'do' commands 'od' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:4: ( 'while' expression 'do' commands 'od' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:5: 'while' expression 'do' commands 'od'
                    {
                    string_literal33=(Token)match(input,43,FOLLOW_43_in_command432);  
                    stream_43.add(string_literal33);

                    pushFollow(FOLLOW_expression_in_command434);
                    expression34=expression();

                    state._fsp--;

                    stream_expression.add(expression34.getTree());
                    string_literal35=(Token)match(input,44,FOLLOW_44_in_command436);  
                    stream_44.add(string_literal35);

                    pushFollow(FOLLOW_commands_in_command438);
                    commands36=commands();

                    state._fsp--;

                    stream_commands.add(commands36.getTree());
                    string_literal37=(Token)match(input,45,FOLLOW_45_in_command440);  
                    stream_45.add(string_literal37);


                    }



                    // AST REWRITE
                    // elements: 44, commands, 43, 45, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:44: -> ^( WHILE 'while' expression 'do' commands 'od' )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:59:46: ^( WHILE 'while' expression 'do' commands 'od' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_43.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_44.nextNode());
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        adaptor.addChild(root_1, stream_45.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:60:4: ( 'for' expression 'do' commands 'od' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:60:4: ( 'for' expression 'do' commands 'od' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:60:5: 'for' expression 'do' commands 'od'
                    {
                    string_literal38=(Token)match(input,46,FOLLOW_46_in_command462);  
                    stream_46.add(string_literal38);

                    pushFollow(FOLLOW_expression_in_command464);
                    expression39=expression();

                    state._fsp--;

                    stream_expression.add(expression39.getTree());
                    string_literal40=(Token)match(input,44,FOLLOW_44_in_command466);  
                    stream_44.add(string_literal40);

                    pushFollow(FOLLOW_commands_in_command468);
                    commands41=commands();

                    state._fsp--;

                    stream_commands.add(commands41.getTree());
                    string_literal42=(Token)match(input,45,FOLLOW_45_in_command470);  
                    stream_45.add(string_literal42);


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
                    // 60:42: -> ^( FOR ^( CONDITION expression ) commands )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:60:45: ^( FOR ^( CONDITION expression ) commands )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:60:51: ^( CONDITION expression )
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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:4: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:4: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:6: 'foreach' Variable 'in' expression 'do' commands 'od'
                    {
                    string_literal43=(Token)match(input,47,FOLLOW_47_in_command493);  
                    stream_47.add(string_literal43);

                    Variable44=(Token)match(input,Variable,FOLLOW_Variable_in_command495);  
                    stream_Variable.add(Variable44);

                    string_literal45=(Token)match(input,48,FOLLOW_48_in_command497);  
                    stream_48.add(string_literal45);

                    pushFollow(FOLLOW_expression_in_command499);
                    expression46=expression();

                    state._fsp--;

                    stream_expression.add(expression46.getTree());
                    string_literal47=(Token)match(input,44,FOLLOW_44_in_command501);  
                    stream_44.add(string_literal47);

                    pushFollow(FOLLOW_commands_in_command503);
                    commands48=commands();

                    state._fsp--;

                    stream_commands.add(commands48.getTree());
                    string_literal49=(Token)match(input,45,FOLLOW_45_in_command505);  
                    stream_45.add(string_literal49);


                    }



                    // AST REWRITE
                    // elements: 47, 48, expression, commands, 45, Variable, 44
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 61:61: -> ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:61:64: ^( FOREACH 'foreach' Variable 'in' expression 'do' commands 'od' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);

                        adaptor.addChild(root_1, stream_47.nextNode());
                        adaptor.addChild(root_1, stream_Variable.nextNode());
                        adaptor.addChild(root_1, stream_48.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_44.nextNode());
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        adaptor.addChild(root_1, stream_45.nextNode());

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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:1: vars : Variable ( ',' vars | Variable )? -> ^( VAR_LIST ( Variable )+ ) ;
    public final vars_return vars() throws RecognitionException {
        vars_return retval = new vars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable50=null;
        Token char_literal51=null;
        Token Variable53=null;
        vars_return vars52 = null;


        Object Variable50_tree=null;
        Object char_literal51_tree=null;
        Object Variable53_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:5: ( Variable ( ',' vars | Variable )? -> ^( VAR_LIST ( Variable )+ ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:6: Variable ( ',' vars | Variable )?
            {
            Variable50=(Token)match(input,Variable,FOLLOW_Variable_in_vars533);  
            stream_Variable.add(Variable50);

            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:15: ( ',' vars | Variable )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            else if ( (LA7_0==Variable) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:16: ',' vars
                    {
                    char_literal51=(Token)match(input,35,FOLLOW_35_in_vars536);  
                    stream_35.add(char_literal51);

                    pushFollow(FOLLOW_vars_in_vars538);
                    vars52=vars();

                    state._fsp--;

                    stream_vars.add(vars52.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:27: Variable
                    {
                    Variable53=(Token)match(input,Variable,FOLLOW_Variable_in_vars542);  
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
            // 63:38: -> ^( VAR_LIST ( Variable )+ )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:63:41: ^( VAR_LIST ( Variable )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_LIST, "VAR_LIST"), root_1);

                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_Variable.nextNode());

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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:1: exprs : expression ( ',' exprs | expression )? -> ^( EXP_LIST ( expression )+ ) ;
    public final exprs_return exprs() throws RecognitionException {
        exprs_return retval = new exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        expression_return expression54 = null;

        exprs_return exprs56 = null;

        expression_return expression57 = null;


        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:6: ( expression ( ',' exprs | expression )? -> ^( EXP_LIST ( expression )+ ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:8: expression ( ',' exprs | expression )?
            {
            pushFollow(FOLLOW_expression_in_exprs562);
            expression54=expression();

            state._fsp--;

            stream_expression.add(expression54.getTree());
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:19: ( ',' exprs | expression )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=Variable && LA8_0<=Symbol)||(LA8_0>=49 && LA8_0<=50)) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:20: ',' exprs
                    {
                    char_literal55=(Token)match(input,35,FOLLOW_35_in_exprs565);  
                    stream_35.add(char_literal55);

                    pushFollow(FOLLOW_exprs_in_exprs567);
                    exprs56=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs56.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:32: expression
                    {
                    pushFollow(FOLLOW_expression_in_exprs571);
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
            // 64:45: -> ^( EXP_LIST ( expression )+ )
            {
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:64:48: ^( EXP_LIST ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:66:1: exprBase : ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) );
    public final exprBase_return exprBase() throws RecognitionException {
        exprBase_return retval = new exprBase_return();
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
        lExpr_return lExpr63 = null;

        exprBase_return exprBase67 = null;

        exprBase_return exprBase71 = null;

        exprBase_return exprBase75 = null;

        lExpr_return lExpr79 = null;


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
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:66:9: ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:66:15: 'nil'
                    {
                    string_literal58=(Token)match(input,49,FOLLOW_49_in_exprBase598);  
                    stream_49.add(string_literal58);



                    // AST REWRITE
                    // elements: 49
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:20: -> ^( 'nil' )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:66:23: ^( 'nil' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_49.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:67:4: Variable
                    {
                    Variable59=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase608);  
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
                    // 67:13: -> ^( Variable )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:67:16: ^( Variable )
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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:4: Symbol
                    {
                    Symbol60=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase619);  
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
                    // 68:11: -> ^( Symbol )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:68:14: ^( Symbol )
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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:4: ( '(' 'cons' lExpr ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:4: ( '(' 'cons' lExpr ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:5: '(' 'cons' lExpr ')'
                    {
                    char_literal61=(Token)match(input,50,FOLLOW_50_in_exprBase631);  
                    stream_50.add(char_literal61);

                    string_literal62=(Token)match(input,51,FOLLOW_51_in_exprBase633);  
                    stream_51.add(string_literal62);

                    pushFollow(FOLLOW_lExpr_in_exprBase635);
                    lExpr63=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr63.getTree());
                    char_literal64=(Token)match(input,52,FOLLOW_52_in_exprBase637);  
                    stream_52.add(char_literal64);


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
                    // 69:27: -> ^( CONS ^( lExpr ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:29: ^( CONS ^( lExpr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:69:36: ^( lExpr )
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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:70:4: ( '(' 'hd' exprBase ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:70:4: ( '(' 'hd' exprBase ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:70:5: '(' 'hd' exprBase ')'
                    {
                    char_literal65=(Token)match(input,50,FOLLOW_50_in_exprBase653);  
                    stream_50.add(char_literal65);

                    string_literal66=(Token)match(input,53,FOLLOW_53_in_exprBase655);  
                    stream_53.add(string_literal66);

                    pushFollow(FOLLOW_exprBase_in_exprBase657);
                    exprBase67=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase67.getTree());
                    char_literal68=(Token)match(input,52,FOLLOW_52_in_exprBase659);  
                    stream_52.add(char_literal68);


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
                    // 70:28: -> ^( HD ^( exprBase ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:70:30: ^( HD ^( exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:70:34: ^( exprBase )
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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:4: ( '(' 'tl' exprBase ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:4: ( '(' 'tl' exprBase ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:5: '(' 'tl' exprBase ')'
                    {
                    char_literal69=(Token)match(input,50,FOLLOW_50_in_exprBase674);  
                    stream_50.add(char_literal69);

                    string_literal70=(Token)match(input,54,FOLLOW_54_in_exprBase676);  
                    stream_54.add(string_literal70);

                    pushFollow(FOLLOW_exprBase_in_exprBase678);
                    exprBase71=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase71.getTree());
                    char_literal72=(Token)match(input,52,FOLLOW_52_in_exprBase680);  
                    stream_52.add(char_literal72);


                    }



                    // AST REWRITE
                    // elements: exprBase, 54
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:28: -> ^( TL ^( 'tl' exprBase ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:30: ^( TL ^( 'tl' exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:71:34: ^( 'tl' exprBase )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_54.nextNode(), root_2);

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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:72:4: ( '(' 'list' exprBase ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:72:4: ( '(' 'list' exprBase ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:72:5: '(' 'list' exprBase ')'
                    {
                    char_literal73=(Token)match(input,50,FOLLOW_50_in_exprBase697);  
                    stream_50.add(char_literal73);

                    string_literal74=(Token)match(input,55,FOLLOW_55_in_exprBase699);  
                    stream_55.add(string_literal74);

                    pushFollow(FOLLOW_exprBase_in_exprBase701);
                    exprBase75=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase75.getTree());
                    char_literal76=(Token)match(input,52,FOLLOW_52_in_exprBase702);  
                    stream_52.add(char_literal76);


                    }



                    // AST REWRITE
                    // elements: 55, exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:29: -> ^( LIST ^( 'list' exprBase ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:72:31: ^( LIST ^( 'list' exprBase ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:72:37: ^( 'list' exprBase )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_55.nextNode(), root_2);

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
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:73:4: ( '(' Symbol lExpr ')' )
                    {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:73:4: ( '(' Symbol lExpr ')' )
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:73:5: '(' Symbol lExpr ')'
                    {
                    char_literal77=(Token)match(input,50,FOLLOW_50_in_exprBase718);  
                    stream_50.add(char_literal77);

                    Symbol78=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase720);  
                    stream_Symbol.add(Symbol78);

                    pushFollow(FOLLOW_lExpr_in_exprBase722);
                    lExpr79=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr79.getTree());
                    char_literal80=(Token)match(input,52,FOLLOW_52_in_exprBase724);  
                    stream_52.add(char_literal80);


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
                    // 73:27: -> ^( SYMBOL ^( Symbol lExpr ) )
                    {
                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:73:29: ^( SYMBOL ^( Symbol lExpr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYMBOL, "SYMBOL"), root_1);

                        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:73:37: ^( Symbol lExpr )
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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:1: expression : exprBase ( '=?' exprBase )? ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;
        exprBase_return exprBase81 = null;

        exprBase_return exprBase83 = null;


        Object string_literal82_tree=null;

        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:11: ( exprBase ( '=?' exprBase )? )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:13: exprBase ( '=?' exprBase )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBase_in_expression745);
            exprBase81=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, exprBase81.getTree());
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:22: ( '=?' exprBase )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==56) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:76:23: '=?' exprBase
                    {
                    string_literal82=(Token)match(input,56,FOLLOW_56_in_expression748); 
                    string_literal82_tree = (Object)adaptor.create(string_literal82);
                    adaptor.addChild(root_0, string_literal82_tree);

                    pushFollow(FOLLOW_exprBase_in_expression750);
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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:1: lExpr : ( exprBase lExpr | );
    public final lExpr_return lExpr() throws RecognitionException {
        lExpr_return retval = new lExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        exprBase_return exprBase84 = null;

        lExpr_return lExpr85 = null;



        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:7: ( exprBase lExpr | )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Variable && LA11_0<=Symbol)||(LA11_0>=49 && LA11_0<=50)) ) {
                alt11=1;
            }
            else if ( (LA11_0==52) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:9: exprBase lExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprBase_in_lExpr759);
                    exprBase84=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase84.getTree());
                    pushFollow(FOLLOW_lExpr_in_lExpr761);
                    lExpr85=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr85.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:77:26: 
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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:80:1: programme : ( function )+ -> ( ^( FUNCTION function ) )+ ;
    public final programme_return programme() throws RecognitionException {
        programme_return retval = new programme_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        function_return function86 = null;


        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:80:11: ( ( function )+ -> ( ^( FUNCTION function ) )+ )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:80:13: ( function )+
            {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:80:13: ( function )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:80:13: function
            	    {
            	    pushFollow(FOLLOW_function_in_programme773);
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
            // 80:23: -> ( ^( FUNCTION function ) )+
            {
                if ( !(stream_function.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function.hasNext() ) {
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:80:26: ^( FUNCTION function )
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
    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:81:1: prog : programme ;
    public final prog_return prog() throws RecognitionException {
        prog_return retval = new prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        programme_return programme87 = null;



        try {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:81:6: ( programme )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:81:7: programme
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_programme_in_prog789);
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
        "\1\34\3\uffff\1\35\5\uffff";
    static final String DFA9_maxS =
        "\1\62\3\uffff\1\67\5\uffff";
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
            return "66:1: exprBase : ( 'nil' -> ^( 'nil' ) | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) | ( '(' 'cons' lExpr ')' ) -> ^( CONS ^( lExpr ) ) | ( '(' 'hd' exprBase ')' ) -> ^( HD ^( exprBase ) ) | ( '(' 'tl' exprBase ')' ) -> ^( TL ^( 'tl' exprBase ) ) | ( '(' 'list' exprBase ')' ) -> ^( LIST ^( 'list' exprBase ) ) | ( '(' Symbol lExpr ')' ) -> ^( SYMBOL ^( Symbol lExpr ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_30_in_function217 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Symbol_in_function219 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_function221 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_definition_in_function223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_definition240 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_input_in_definition242 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_definition245 = new BitSet(new long[]{0x0000C8A010000000L});
    public static final BitSet FOLLOW_commands_in_definition247 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_definition249 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_definition251 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_output_in_definition253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputSub_in_input279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_inputSub288 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_inputSub292 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Variable_in_inputSub295 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_Variable_in_output310 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_output313 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Variable_in_output314 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_command_in_commands331 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_commands334 = new BitSet(new long[]{0x0000C8A010000000L});
    public static final BitSet FOLLOW_command_in_commands336 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_command357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command365 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_command367 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_exprs_in_command369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_command388 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_expression_in_command390 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_command392 = new BitSet(new long[]{0x0000C8A010000000L});
    public static final BitSet FOLLOW_commands_in_command394 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_command397 = new BitSet(new long[]{0x0000C8A010000000L});
    public static final BitSet FOLLOW_commands_in_command399 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_command432 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_expression_in_command434 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_command436 = new BitSet(new long[]{0x0000C8A010000000L});
    public static final BitSet FOLLOW_commands_in_command438 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_command462 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_expression_in_command464 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_command466 = new BitSet(new long[]{0x0000C8A010000000L});
    public static final BitSet FOLLOW_commands_in_command468 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_command493 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Variable_in_command495 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_command497 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_expression_in_command499 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_command501 = new BitSet(new long[]{0x0000C8A010000000L});
    public static final BitSet FOLLOW_commands_in_command503 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_vars533 = new BitSet(new long[]{0x0000000810000002L});
    public static final BitSet FOLLOW_35_in_vars536 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_vars_in_vars538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_vars542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs562 = new BitSet(new long[]{0x0006000830000002L});
    public static final BitSet FOLLOW_35_in_exprs565 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_exprs_in_exprs567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_exprBase598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_exprBase608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_exprBase631 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprBase633 = new BitSet(new long[]{0x0016000030000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase635 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_exprBase653 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase655 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase657 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_exprBase674 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_exprBase676 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase678 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_exprBase697 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_exprBase699 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase701 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_exprBase718 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase720 = new BitSet(new long[]{0x0016000030000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase722 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression745 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expression748 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_exprBase_in_expression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lExpr759 = new BitSet(new long[]{0x0006000030000000L});
    public static final BitSet FOLLOW_lExpr_in_lExpr761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_programme773 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_programme_in_prog789 = new BitSet(new long[]{0x0000000000000002L});

}