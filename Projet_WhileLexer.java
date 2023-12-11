// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g 2023-12-11 14:42:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Projet_WhileLexer extends Lexer {
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

    public Projet_WhileLexer() {;} 
    public Projet_WhileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Projet_WhileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g"; }

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:3:7: ( 'function' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:3:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:4:7: ( ':' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:4:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:5:7: ( 'read' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:5:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:6:7: ( '%' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:6:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:7:7: ( 'write' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:7:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:8:7: ( ',' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:9:7: ( ';' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:10:7: ( 'nop' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:10:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:11:7: ( ':=' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:11:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:12:7: ( 'if' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:12:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:13:7: ( 'then' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:13:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:14:7: ( 'else' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:14:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:15:7: ( 'fi' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:15:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:16:7: ( 'while' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:16:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:17:7: ( 'do' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:17:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:18:7: ( 'od' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:18:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:19:7: ( 'for' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:19:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:20:7: ( 'foreach' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:20:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:21:7: ( 'in' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:21:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:22:7: ( 'nil' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:22:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:23:7: ( '(' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:24:7: ( 'cons' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:24:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:25:7: ( ')' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:25:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:26:7: ( 'hd' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:26:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:27:7: ( 'tl' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:27:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:28:7: ( 'list' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:28:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:29:7: ( '=?' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:29:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:38:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:38:6: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN ; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "Maj"
    public final void mMaj() throws RecognitionException {
        try {
            int _type = Maj;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:40:6: ( 'A' .. 'Z' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:40:8: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Maj"

    // $ANTLR start "Min"
    public final void mMin() throws RecognitionException {
        try {
            int _type = Min;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:41:6: ( 'a' .. 'z' )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:41:8: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Min"

    // $ANTLR start "Dec"
    public final void mDec() throws RecognitionException {
        try {
            int _type = Dec;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:42:4: ( ( '0' .. '9' )+ )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:42:5: ( '0' .. '9' )+
            {
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:42:5: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:42:6: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dec"

    // $ANTLR start "Variable"
    public final void mVariable() throws RecognitionException {
        try {
            int _type = Variable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:46:10: ( Maj ( Maj | Min | Dec )* ( '!' | '?' )? )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:46:12: Maj ( Maj | Min | Dec )* ( '!' | '?' )?
            {
            mMaj(); 
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:46:16: ( Maj | Min | Dec )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=1;
                    }
                    break;
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:46:17: Maj
            	    {
            	    mMaj(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:46:21: Min
            	    {
            	    mMin(); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:46:25: Dec
            	    {
            	    mDec(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:46:31: ( '!' | '?' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='!'||LA3_0=='?') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Variable"

    // $ANTLR start "Symbol"
    public final void mSymbol() throws RecognitionException {
        try {
            int _type = Symbol;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:7: ( Min ( Maj | Min | Dec )* ( '!' | '?' )? )
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:9: Min ( Maj | Min | Dec )* ( '!' | '?' )?
            {
            mMin(); 
            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:13: ( Maj | Min | Dec )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt4=1;
                    }
                    break;
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt4=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:14: Maj
            	    {
            	    mMaj(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:18: Min
            	    {
            	    mMin(); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:22: Dec
            	    {
            	    mDec(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:47:28: ( '!' | '?' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='!'||LA5_0=='?') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Symbol"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | WS | Maj | Min | Dec | Variable | Symbol )
        int alt6=33;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:10: T__35
                {
                mT__35(); 

                }
                break;
            case 2 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:16: T__36
                {
                mT__36(); 

                }
                break;
            case 3 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:22: T__37
                {
                mT__37(); 

                }
                break;
            case 4 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:28: T__38
                {
                mT__38(); 

                }
                break;
            case 5 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:34: T__39
                {
                mT__39(); 

                }
                break;
            case 6 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:40: T__40
                {
                mT__40(); 

                }
                break;
            case 7 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:46: T__41
                {
                mT__41(); 

                }
                break;
            case 8 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:52: T__42
                {
                mT__42(); 

                }
                break;
            case 9 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:58: T__43
                {
                mT__43(); 

                }
                break;
            case 10 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:64: T__44
                {
                mT__44(); 

                }
                break;
            case 11 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:70: T__45
                {
                mT__45(); 

                }
                break;
            case 12 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:76: T__46
                {
                mT__46(); 

                }
                break;
            case 13 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:82: T__47
                {
                mT__47(); 

                }
                break;
            case 14 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:88: T__48
                {
                mT__48(); 

                }
                break;
            case 15 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:94: T__49
                {
                mT__49(); 

                }
                break;
            case 16 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:100: T__50
                {
                mT__50(); 

                }
                break;
            case 17 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:106: T__51
                {
                mT__51(); 

                }
                break;
            case 18 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:112: T__52
                {
                mT__52(); 

                }
                break;
            case 19 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:118: T__53
                {
                mT__53(); 

                }
                break;
            case 20 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:124: T__54
                {
                mT__54(); 

                }
                break;
            case 21 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:130: T__55
                {
                mT__55(); 

                }
                break;
            case 22 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:136: T__56
                {
                mT__56(); 

                }
                break;
            case 23 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:142: T__57
                {
                mT__57(); 

                }
                break;
            case 24 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:148: T__58
                {
                mT__58(); 

                }
                break;
            case 25 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:154: T__59
                {
                mT__59(); 

                }
                break;
            case 26 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:160: T__60
                {
                mT__60(); 

                }
                break;
            case 27 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:166: T__61
                {
                mT__61(); 

                }
                break;
            case 28 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:172: WS
                {
                mWS(); 

                }
                break;
            case 29 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:175: Maj
                {
                mMaj(); 

                }
                break;
            case 30 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:179: Min
                {
                mMin(); 

                }
                break;
            case 31 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:183: Dec
                {
                mDec(); 

                }
                break;
            case 32 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:187: Variable
                {
                mVariable(); 

                }
                break;
            case 33 :
                // C:\\Users\\luis\\Desktop\\TLC\\Projet_While.g:1:196: Symbol
                {
                mSymbol(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\33\1\36\1\33\1\uffff\1\33\2\uffff\6\33\1\uffff\1\33"+
        "\1\uffff\2\33\2\uffff\1\56\1\33\1\uffff\1\34\1\61\1\34\4\uffff\5"+
        "\34\1\70\1\71\1\34\1\73\1\34\1\75\1\76\1\34\1\100\1\34\2\uffff\1"+
        "\34\1\uffff\1\104\3\34\1\110\1\111\2\uffff\1\34\1\uffff\1\34\2\uffff"+
        "\1\34\1\uffff\3\34\1\uffff\1\120\2\34\2\uffff\1\123\1\124\1\125"+
        "\1\126\2\34\1\uffff\1\131\1\132\4\uffff\2\34\2\uffff\1\34\1\136"+
        "\1\137\2\uffff";
    static final String DFA6_eofS =
        "\140\uffff";
    static final String DFA6_minS =
        "\1\11\1\41\1\75\1\41\1\uffff\1\41\2\uffff\6\41\1\uffff\1\41\1\uffff"+
        "\2\41\2\uffff\2\41\1\uffff\1\156\1\41\1\162\4\uffff\1\141\2\151"+
        "\1\160\1\154\2\41\1\145\1\41\1\163\2\41\1\156\1\41\1\163\2\uffff"+
        "\1\143\1\uffff\1\41\1\144\1\164\1\154\2\41\2\uffff\1\156\1\uffff"+
        "\1\145\2\uffff\1\163\1\uffff\2\164\1\141\1\uffff\1\41\2\145\2\uffff"+
        "\4\41\1\151\1\143\1\uffff\2\41\4\uffff\1\157\1\150\2\uffff\1\156"+
        "\2\41\2\uffff";
    static final String DFA6_maxS =
        "\2\172\1\75\1\172\1\uffff\1\172\2\uffff\6\172\1\uffff\1\172\1\uffff"+
        "\2\172\2\uffff\2\172\1\uffff\1\156\1\172\1\162\4\uffff\1\141\2\151"+
        "\1\160\1\154\2\172\1\145\1\172\1\163\2\172\1\156\1\172\1\163\2\uffff"+
        "\1\143\1\uffff\1\172\1\144\1\164\1\154\2\172\2\uffff\1\156\1\uffff"+
        "\1\145\2\uffff\1\163\1\uffff\2\164\1\141\1\uffff\1\172\2\145\2\uffff"+
        "\4\172\1\151\1\143\1\uffff\2\172\4\uffff\1\157\1\150\2\uffff\1\156"+
        "\2\172\2\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\6\uffff\1\25\1\uffff\1\27\2\uffff"+
        "\1\33\1\34\2\uffff\1\37\3\uffff\1\36\1\41\1\11\1\2\17\uffff\1\35"+
        "\1\40\1\uffff\1\15\6\uffff\1\12\1\23\1\uffff\1\31\1\uffff\1\17\1"+
        "\20\1\uffff\1\30\3\uffff\1\21\3\uffff\1\10\1\24\6\uffff\1\3\2\uffff"+
        "\1\13\1\14\1\26\1\32\2\uffff\1\5\1\16\3\uffff\1\22\1\1";
    static final String DFA6_specialS =
        "\140\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\4\uffff\1\4\2\uffff\1\16\1"+
            "\20\2\uffff\1\6\3\uffff\12\27\1\2\1\7\1\uffff\1\23\3\uffff\32"+
            "\25\6\uffff\2\26\1\17\1\14\1\13\1\1\1\26\1\21\1\11\2\26\1\22"+
            "\1\26\1\10\1\15\2\26\1\3\1\26\1\12\2\26\1\5\3\26",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\10"+
            "\34\1\31\5\34\1\32\5\34\1\30\5\34",
            "\1\35",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\4"+
            "\34\1\37\25\34",
            "",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\7"+
            "\34\1\41\11\34\1\40\10\34",
            "",
            "",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\10"+
            "\34\1\43\5\34\1\42\13\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\5"+
            "\34\1\44\7\34\1\45\14\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\7"+
            "\34\1\46\3\34\1\47\16\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\13"+
            "\34\1\50\16\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\16"+
            "\34\1\51\13\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\3"+
            "\34\1\52\26\34",
            "",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\16"+
            "\34\1\53\13\34",
            "",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\3"+
            "\34\1\54\26\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\10"+
            "\34\1\55\21\34",
            "",
            "",
            "\1\57\16\uffff\12\57\5\uffff\1\57\1\uffff\32\57\6\uffff\32"+
            "\57",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "",
            "\1\60",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\62",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\72",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\74",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\77",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\101",
            "",
            "",
            "\1\102",
            "",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\4"+
            "\34\1\103\25\34",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "",
            "",
            "\1\112",
            "",
            "\1\113",
            "",
            "",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\127",
            "\1\130",
            "",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            "\1\135",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32"+
            "\34",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | WS | Maj | Min | Dec | Variable | Symbol );";
        }
    }
 

}