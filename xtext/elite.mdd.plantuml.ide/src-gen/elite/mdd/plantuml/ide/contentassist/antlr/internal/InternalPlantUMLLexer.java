package elite.mdd.plantuml.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlantUMLLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalPlantUMLLexer() {;} 
    public InternalPlantUMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPlantUMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPlantUML.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:11:7: ( 'actor' )
            // InternalPlantUML.g:11:9: 'actor'
            {
            match("actor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:12:7: ( 'boundary' )
            // InternalPlantUML.g:12:9: 'boundary'
            {
            match("boundary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:13:7: ( 'control' )
            // InternalPlantUML.g:13:9: 'control'
            {
            match("control"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:14:7: ( 'collections' )
            // InternalPlantUML.g:14:9: 'collections'
            {
            match("collections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:15:7: ( 'entity' )
            // InternalPlantUML.g:15:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:16:7: ( 'database' )
            // InternalPlantUML.g:16:9: 'database'
            {
            match("database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:17:7: ( 'participant' )
            // InternalPlantUML.g:17:9: 'participant'
            {
            match("participant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:18:7: ( '->' )
            // InternalPlantUML.g:18:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:19:7: ( '->>' )
            // InternalPlantUML.g:19:9: '->>'
            {
            match("->>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:20:7: ( '<-' )
            // InternalPlantUML.g:20:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:21:7: ( '<<-' )
            // InternalPlantUML.g:21:9: '<<-'
            {
            match("<<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:22:7: ( '-->>' )
            // InternalPlantUML.g:22:9: '-->>'
            {
            match("-->>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:23:7: ( '<<--' )
            // InternalPlantUML.g:23:9: '<<--'
            {
            match("<<--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:24:7: ( '@startuml' )
            // InternalPlantUML.g:24:9: '@startuml'
            {
            match("@startuml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:25:7: ( '@enduml' )
            // InternalPlantUML.g:25:9: '@enduml'
            {
            match("@enduml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:26:7: ( '\"' )
            // InternalPlantUML.g:26:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:27:7: ( ':' )
            // InternalPlantUML.g:27:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:28:7: ( '(' )
            // InternalPlantUML.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:29:7: ( ')' )
            // InternalPlantUML.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:30:7: ( ',' )
            // InternalPlantUML.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:1819:13: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalPlantUML.g:1819:15: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalPlantUML.g:1819:20: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPlantUML.g:1819:21: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPlantUML.g:1819:28: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:1821:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPlantUML.g:1821:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPlantUML.g:1821:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPlantUML.g:1821:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPlantUML.g:1821:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPlantUML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:1823:10: ( ( '0' .. '9' )+ )
            // InternalPlantUML.g:1823:12: ( '0' .. '9' )+
            {
            // InternalPlantUML.g:1823:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPlantUML.g:1823:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:1825:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPlantUML.g:1825:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPlantUML.g:1825:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPlantUML.g:1825:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:1827:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPlantUML.g:1827:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPlantUML.g:1827:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPlantUML.g:1827:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalPlantUML.g:1827:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPlantUML.g:1827:41: ( '\\r' )? '\\n'
                    {
                    // InternalPlantUML.g:1827:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPlantUML.g:1827:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:1829:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPlantUML.g:1829:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPlantUML.g:1829:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPlantUML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlantUML.g:1831:16: ( . )
            // InternalPlantUML.g:1831:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPlantUML.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=27;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalPlantUML.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalPlantUML.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalPlantUML.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalPlantUML.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalPlantUML.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalPlantUML.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalPlantUML.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalPlantUML.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalPlantUML.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalPlantUML.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalPlantUML.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalPlantUML.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalPlantUML.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalPlantUML.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalPlantUML.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalPlantUML.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalPlantUML.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalPlantUML.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalPlantUML.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalPlantUML.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalPlantUML.g:1:130: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalPlantUML.g:1:142: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalPlantUML.g:1:150: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalPlantUML.g:1:159: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalPlantUML.g:1:175: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalPlantUML.g:1:191: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalPlantUML.g:1:199: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\6\27\3\25\5\uffff\2\25\2\uffff\1\25\2\uffff\1\27\1\uffff\5\27\1\65\17\uffff\7\27\2\uffff\1\77\7\27\2\uffff\1\107\6\27\1\uffff\3\27\1\121\3\27\1\125\1\27\1\uffff\2\27\1\131\1\uffff\1\27\1\133\1\27\1\uffff\1\27\1\uffff\3\27\1\141\1\142\2\uffff";
    static final String DFA10_eofS =
        "\143\uffff";
    static final String DFA10_minS =
        "\1\0\1\143\2\157\1\156\2\141\2\55\1\145\5\uffff\1\0\1\101\2\uffff\1\52\2\uffff\1\164\1\uffff\1\165\1\154\2\164\1\162\1\76\2\uffff\1\55\14\uffff\1\157\1\156\1\164\1\154\1\151\1\141\1\164\2\uffff\1\55\1\162\1\144\1\162\1\145\1\164\1\142\1\151\2\uffff\1\60\1\141\1\157\1\143\1\171\1\141\1\143\1\uffff\1\162\1\154\1\164\1\60\1\163\1\151\1\171\1\60\1\151\1\uffff\1\145\1\160\1\60\1\uffff\1\157\1\60\1\141\1\uffff\1\156\1\uffff\1\156\1\163\1\164\2\60\2\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\143\2\157\1\156\2\141\1\76\1\74\1\163\5\uffff\1\uffff\1\172\2\uffff\1\57\2\uffff\1\164\1\uffff\1\165\1\156\2\164\1\162\1\76\2\uffff\1\55\14\uffff\1\157\1\156\1\164\1\154\1\151\1\141\1\164\2\uffff\1\55\1\162\1\144\1\162\1\145\1\164\1\142\1\151\2\uffff\1\172\1\141\1\157\1\143\1\171\1\141\1\143\1\uffff\1\162\1\154\1\164\1\172\1\163\1\151\1\171\1\172\1\151\1\uffff\1\145\1\160\1\172\1\uffff\1\157\1\172\1\141\1\uffff\1\156\1\uffff\1\156\1\163\1\164\2\172\2\uffff";
    static final String DFA10_acceptS =
        "\12\uffff\1\20\1\21\1\22\1\23\1\24\2\uffff\1\26\1\27\1\uffff\1\32\1\33\1\uffff\1\26\6\uffff\1\14\1\12\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\27\1\30\1\31\1\32\7\uffff\1\11\1\10\10\uffff\1\15\1\13\7\uffff\1\1\11\uffff\1\5\3\uffff\1\3\3\uffff\1\2\1\uffff\1\6\5\uffff\1\4\1\7";
    static final String DFA10_specialS =
        "\1\0\16\uffff\1\1\123\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\12\4\25\1\17\1\14\1\15\2\25\1\16\1\7\1\25\1\23\12\22\1\13\1\25\1\10\3\25\1\11\32\21\3\25\1\20\1\21\1\25\1\1\1\2\1\3\1\5\1\4\12\21\1\6\12\21\uff85\25",
            "\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\36\20\uffff\1\35",
            "\1\37\16\uffff\1\40",
            "\1\42\15\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "\0\50",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "\1\55",
            "",
            "\1\56",
            "\1\60\1\uffff\1\57",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\132",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\134",
            "",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='a') ) {s = 1;}

                        else if ( (LA10_0=='b') ) {s = 2;}

                        else if ( (LA10_0=='c') ) {s = 3;}

                        else if ( (LA10_0=='e') ) {s = 4;}

                        else if ( (LA10_0=='d') ) {s = 5;}

                        else if ( (LA10_0=='p') ) {s = 6;}

                        else if ( (LA10_0=='-') ) {s = 7;}

                        else if ( (LA10_0=='<') ) {s = 8;}

                        else if ( (LA10_0=='@') ) {s = 9;}

                        else if ( (LA10_0=='\"') ) {s = 10;}

                        else if ( (LA10_0==':') ) {s = 11;}

                        else if ( (LA10_0=='(') ) {s = 12;}

                        else if ( (LA10_0==')') ) {s = 13;}

                        else if ( (LA10_0==',') ) {s = 14;}

                        else if ( (LA10_0=='\'') ) {s = 15;}

                        else if ( (LA10_0=='^') ) {s = 16;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='f' && LA10_0<='o')||(LA10_0>='q' && LA10_0<='z')) ) {s = 17;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 18;}

                        else if ( (LA10_0=='/') ) {s = 19;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 20;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='#' && LA10_0<='&')||(LA10_0>='*' && LA10_0<='+')||LA10_0=='.'||LA10_0==';'||(LA10_0>='=' && LA10_0<='?')||(LA10_0>='[' && LA10_0<=']')||LA10_0=='`'||(LA10_0>='{' && LA10_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_15 = input.LA(1);

                        s = -1;
                        if ( ((LA10_15>='\u0000' && LA10_15<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}