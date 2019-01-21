package fr.unice.polytech.alexisc.smarthomedsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.unice.polytech.alexisc.smarthomedsl.services.SmartHomeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartHomeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'}'", "'sensors'", "','", "'Sensor'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSmartHomeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartHomeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartHomeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartHome.g"; }


    	private SmartHomeGrammarAccess grammarAccess;

    	public void setGrammarAccess(SmartHomeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleHome"
    // InternalSmartHome.g:53:1: entryRuleHome : ruleHome EOF ;
    public final void entryRuleHome() throws RecognitionException {
        try {
            // InternalSmartHome.g:54:1: ( ruleHome EOF )
            // InternalSmartHome.g:55:1: ruleHome EOF
            {
             before(grammarAccess.getHomeRule()); 
            pushFollow(FOLLOW_1);
            ruleHome();

            state._fsp--;

             after(grammarAccess.getHomeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHome"


    // $ANTLR start "ruleHome"
    // InternalSmartHome.g:62:1: ruleHome : ( ( rule__Home__Group__0 ) ) ;
    public final void ruleHome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:66:2: ( ( ( rule__Home__Group__0 ) ) )
            // InternalSmartHome.g:67:2: ( ( rule__Home__Group__0 ) )
            {
            // InternalSmartHome.g:67:2: ( ( rule__Home__Group__0 ) )
            // InternalSmartHome.g:68:3: ( rule__Home__Group__0 )
            {
             before(grammarAccess.getHomeAccess().getGroup()); 
            // InternalSmartHome.g:69:3: ( rule__Home__Group__0 )
            // InternalSmartHome.g:69:4: rule__Home__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleSensor"
    // InternalSmartHome.g:78:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSmartHome.g:79:1: ( ruleSensor EOF )
            // InternalSmartHome.g:80:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSmartHome.g:87:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:91:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSmartHome.g:92:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSmartHome.g:92:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSmartHome.g:93:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSmartHome.g:94:3: ( rule__Sensor__Group__0 )
            // InternalSmartHome.g:94:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleEString"
    // InternalSmartHome.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmartHome.g:104:1: ( ruleEString EOF )
            // InternalSmartHome.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmartHome.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmartHome.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmartHome.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSmartHome.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmartHome.g:119:3: ( rule__EString__Alternatives )
            // InternalSmartHome.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmartHome.g:127:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:131:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmartHome.g:132:2: ( RULE_STRING )
                    {
                    // InternalSmartHome.g:132:2: ( RULE_STRING )
                    // InternalSmartHome.g:133:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:138:2: ( RULE_ID )
                    {
                    // InternalSmartHome.g:138:2: ( RULE_ID )
                    // InternalSmartHome.g:139:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Home__Group__0"
    // InternalSmartHome.g:148:1: rule__Home__Group__0 : rule__Home__Group__0__Impl rule__Home__Group__1 ;
    public final void rule__Home__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:152:1: ( rule__Home__Group__0__Impl rule__Home__Group__1 )
            // InternalSmartHome.g:153:2: rule__Home__Group__0__Impl rule__Home__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Home__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__0"


    // $ANTLR start "rule__Home__Group__0__Impl"
    // InternalSmartHome.g:160:1: rule__Home__Group__0__Impl : ( () ) ;
    public final void rule__Home__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:164:1: ( ( () ) )
            // InternalSmartHome.g:165:1: ( () )
            {
            // InternalSmartHome.g:165:1: ( () )
            // InternalSmartHome.g:166:2: ()
            {
             before(grammarAccess.getHomeAccess().getHomeAction_0()); 
            // InternalSmartHome.g:167:2: ()
            // InternalSmartHome.g:167:3: 
            {
            }

             after(grammarAccess.getHomeAccess().getHomeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__0__Impl"


    // $ANTLR start "rule__Home__Group__1"
    // InternalSmartHome.g:175:1: rule__Home__Group__1 : rule__Home__Group__1__Impl rule__Home__Group__2 ;
    public final void rule__Home__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:179:1: ( rule__Home__Group__1__Impl rule__Home__Group__2 )
            // InternalSmartHome.g:180:2: rule__Home__Group__1__Impl rule__Home__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__1"


    // $ANTLR start "rule__Home__Group__1__Impl"
    // InternalSmartHome.g:187:1: rule__Home__Group__1__Impl : ( 'Home' ) ;
    public final void rule__Home__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:191:1: ( ( 'Home' ) )
            // InternalSmartHome.g:192:1: ( 'Home' )
            {
            // InternalSmartHome.g:192:1: ( 'Home' )
            // InternalSmartHome.g:193:2: 'Home'
            {
             before(grammarAccess.getHomeAccess().getHomeKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getHomeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__1__Impl"


    // $ANTLR start "rule__Home__Group__2"
    // InternalSmartHome.g:202:1: rule__Home__Group__2 : rule__Home__Group__2__Impl rule__Home__Group__3 ;
    public final void rule__Home__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:206:1: ( rule__Home__Group__2__Impl rule__Home__Group__3 )
            // InternalSmartHome.g:207:2: rule__Home__Group__2__Impl rule__Home__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__2"


    // $ANTLR start "rule__Home__Group__2__Impl"
    // InternalSmartHome.g:214:1: rule__Home__Group__2__Impl : ( '{' ) ;
    public final void rule__Home__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:218:1: ( ( '{' ) )
            // InternalSmartHome.g:219:1: ( '{' )
            {
            // InternalSmartHome.g:219:1: ( '{' )
            // InternalSmartHome.g:220:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__2__Impl"


    // $ANTLR start "rule__Home__Group__3"
    // InternalSmartHome.g:229:1: rule__Home__Group__3 : rule__Home__Group__3__Impl rule__Home__Group__4 ;
    public final void rule__Home__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:233:1: ( rule__Home__Group__3__Impl rule__Home__Group__4 )
            // InternalSmartHome.g:234:2: rule__Home__Group__3__Impl rule__Home__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__3"


    // $ANTLR start "rule__Home__Group__3__Impl"
    // InternalSmartHome.g:241:1: rule__Home__Group__3__Impl : ( ( rule__Home__Group_3__0 )? ) ;
    public final void rule__Home__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:245:1: ( ( ( rule__Home__Group_3__0 )? ) )
            // InternalSmartHome.g:246:1: ( ( rule__Home__Group_3__0 )? )
            {
            // InternalSmartHome.g:246:1: ( ( rule__Home__Group_3__0 )? )
            // InternalSmartHome.g:247:2: ( rule__Home__Group_3__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_3()); 
            // InternalSmartHome.g:248:2: ( rule__Home__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmartHome.g:248:3: rule__Home__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__3__Impl"


    // $ANTLR start "rule__Home__Group__4"
    // InternalSmartHome.g:256:1: rule__Home__Group__4 : rule__Home__Group__4__Impl ;
    public final void rule__Home__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:260:1: ( rule__Home__Group__4__Impl )
            // InternalSmartHome.g:261:2: rule__Home__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__4"


    // $ANTLR start "rule__Home__Group__4__Impl"
    // InternalSmartHome.g:267:1: rule__Home__Group__4__Impl : ( '}' ) ;
    public final void rule__Home__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:271:1: ( ( '}' ) )
            // InternalSmartHome.g:272:1: ( '}' )
            {
            // InternalSmartHome.g:272:1: ( '}' )
            // InternalSmartHome.g:273:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__4__Impl"


    // $ANTLR start "rule__Home__Group_3__0"
    // InternalSmartHome.g:283:1: rule__Home__Group_3__0 : rule__Home__Group_3__0__Impl rule__Home__Group_3__1 ;
    public final void rule__Home__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:287:1: ( rule__Home__Group_3__0__Impl rule__Home__Group_3__1 )
            // InternalSmartHome.g:288:2: rule__Home__Group_3__0__Impl rule__Home__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__0"


    // $ANTLR start "rule__Home__Group_3__0__Impl"
    // InternalSmartHome.g:295:1: rule__Home__Group_3__0__Impl : ( 'sensors' ) ;
    public final void rule__Home__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:299:1: ( ( 'sensors' ) )
            // InternalSmartHome.g:300:1: ( 'sensors' )
            {
            // InternalSmartHome.g:300:1: ( 'sensors' )
            // InternalSmartHome.g:301:2: 'sensors'
            {
             before(grammarAccess.getHomeAccess().getSensorsKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getSensorsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__0__Impl"


    // $ANTLR start "rule__Home__Group_3__1"
    // InternalSmartHome.g:310:1: rule__Home__Group_3__1 : rule__Home__Group_3__1__Impl rule__Home__Group_3__2 ;
    public final void rule__Home__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:314:1: ( rule__Home__Group_3__1__Impl rule__Home__Group_3__2 )
            // InternalSmartHome.g:315:2: rule__Home__Group_3__1__Impl rule__Home__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__1"


    // $ANTLR start "rule__Home__Group_3__1__Impl"
    // InternalSmartHome.g:322:1: rule__Home__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:326:1: ( ( '{' ) )
            // InternalSmartHome.g:327:1: ( '{' )
            {
            // InternalSmartHome.g:327:1: ( '{' )
            // InternalSmartHome.g:328:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__1__Impl"


    // $ANTLR start "rule__Home__Group_3__2"
    // InternalSmartHome.g:337:1: rule__Home__Group_3__2 : rule__Home__Group_3__2__Impl rule__Home__Group_3__3 ;
    public final void rule__Home__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:341:1: ( rule__Home__Group_3__2__Impl rule__Home__Group_3__3 )
            // InternalSmartHome.g:342:2: rule__Home__Group_3__2__Impl rule__Home__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Home__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__2"


    // $ANTLR start "rule__Home__Group_3__2__Impl"
    // InternalSmartHome.g:349:1: rule__Home__Group_3__2__Impl : ( ( rule__Home__SensorsAssignment_3_2 ) ) ;
    public final void rule__Home__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:353:1: ( ( ( rule__Home__SensorsAssignment_3_2 ) ) )
            // InternalSmartHome.g:354:1: ( ( rule__Home__SensorsAssignment_3_2 ) )
            {
            // InternalSmartHome.g:354:1: ( ( rule__Home__SensorsAssignment_3_2 ) )
            // InternalSmartHome.g:355:2: ( rule__Home__SensorsAssignment_3_2 )
            {
             before(grammarAccess.getHomeAccess().getSensorsAssignment_3_2()); 
            // InternalSmartHome.g:356:2: ( rule__Home__SensorsAssignment_3_2 )
            // InternalSmartHome.g:356:3: rule__Home__SensorsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__SensorsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getSensorsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__2__Impl"


    // $ANTLR start "rule__Home__Group_3__3"
    // InternalSmartHome.g:364:1: rule__Home__Group_3__3 : rule__Home__Group_3__3__Impl rule__Home__Group_3__4 ;
    public final void rule__Home__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:368:1: ( rule__Home__Group_3__3__Impl rule__Home__Group_3__4 )
            // InternalSmartHome.g:369:2: rule__Home__Group_3__3__Impl rule__Home__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Home__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__3"


    // $ANTLR start "rule__Home__Group_3__3__Impl"
    // InternalSmartHome.g:376:1: rule__Home__Group_3__3__Impl : ( ( rule__Home__Group_3_3__0 )* ) ;
    public final void rule__Home__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:380:1: ( ( ( rule__Home__Group_3_3__0 )* ) )
            // InternalSmartHome.g:381:1: ( ( rule__Home__Group_3_3__0 )* )
            {
            // InternalSmartHome.g:381:1: ( ( rule__Home__Group_3_3__0 )* )
            // InternalSmartHome.g:382:2: ( rule__Home__Group_3_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_3_3()); 
            // InternalSmartHome.g:383:2: ( rule__Home__Group_3_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartHome.g:383:3: rule__Home__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Home__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__3__Impl"


    // $ANTLR start "rule__Home__Group_3__4"
    // InternalSmartHome.g:391:1: rule__Home__Group_3__4 : rule__Home__Group_3__4__Impl ;
    public final void rule__Home__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:395:1: ( rule__Home__Group_3__4__Impl )
            // InternalSmartHome.g:396:2: rule__Home__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__4"


    // $ANTLR start "rule__Home__Group_3__4__Impl"
    // InternalSmartHome.g:402:1: rule__Home__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:406:1: ( ( '}' ) )
            // InternalSmartHome.g:407:1: ( '}' )
            {
            // InternalSmartHome.g:407:1: ( '}' )
            // InternalSmartHome.g:408:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__4__Impl"


    // $ANTLR start "rule__Home__Group_3_3__0"
    // InternalSmartHome.g:418:1: rule__Home__Group_3_3__0 : rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1 ;
    public final void rule__Home__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:422:1: ( rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1 )
            // InternalSmartHome.g:423:2: rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3_3__0"


    // $ANTLR start "rule__Home__Group_3_3__0__Impl"
    // InternalSmartHome.g:430:1: rule__Home__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:434:1: ( ( ',' ) )
            // InternalSmartHome.g:435:1: ( ',' )
            {
            // InternalSmartHome.g:435:1: ( ',' )
            // InternalSmartHome.g:436:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3_3__0__Impl"


    // $ANTLR start "rule__Home__Group_3_3__1"
    // InternalSmartHome.g:445:1: rule__Home__Group_3_3__1 : rule__Home__Group_3_3__1__Impl ;
    public final void rule__Home__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:449:1: ( rule__Home__Group_3_3__1__Impl )
            // InternalSmartHome.g:450:2: rule__Home__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3_3__1"


    // $ANTLR start "rule__Home__Group_3_3__1__Impl"
    // InternalSmartHome.g:456:1: rule__Home__Group_3_3__1__Impl : ( ( rule__Home__SensorsAssignment_3_3_1 ) ) ;
    public final void rule__Home__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:460:1: ( ( ( rule__Home__SensorsAssignment_3_3_1 ) ) )
            // InternalSmartHome.g:461:1: ( ( rule__Home__SensorsAssignment_3_3_1 ) )
            {
            // InternalSmartHome.g:461:1: ( ( rule__Home__SensorsAssignment_3_3_1 ) )
            // InternalSmartHome.g:462:2: ( rule__Home__SensorsAssignment_3_3_1 )
            {
             before(grammarAccess.getHomeAccess().getSensorsAssignment_3_3_1()); 
            // InternalSmartHome.g:463:2: ( rule__Home__SensorsAssignment_3_3_1 )
            // InternalSmartHome.g:463:3: rule__Home__SensorsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__SensorsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getSensorsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3_3__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalSmartHome.g:472:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:476:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSmartHome.g:477:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalSmartHome.g:484:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:488:1: ( ( () ) )
            // InternalSmartHome.g:489:1: ( () )
            {
            // InternalSmartHome.g:489:1: ( () )
            // InternalSmartHome.g:490:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSmartHome.g:491:2: ()
            // InternalSmartHome.g:491:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalSmartHome.g:499:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:503:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSmartHome.g:504:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalSmartHome.g:511:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:515:1: ( ( 'Sensor' ) )
            // InternalSmartHome.g:516:1: ( 'Sensor' )
            {
            // InternalSmartHome.g:516:1: ( 'Sensor' )
            // InternalSmartHome.g:517:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalSmartHome.g:526:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:530:1: ( rule__Sensor__Group__2__Impl )
            // InternalSmartHome.g:531:2: rule__Sensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalSmartHome.g:537:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__NameAssignment_2 ) ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:541:1: ( ( ( rule__Sensor__NameAssignment_2 ) ) )
            // InternalSmartHome.g:542:1: ( ( rule__Sensor__NameAssignment_2 ) )
            {
            // InternalSmartHome.g:542:1: ( ( rule__Sensor__NameAssignment_2 ) )
            // InternalSmartHome.g:543:2: ( rule__Sensor__NameAssignment_2 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_2()); 
            // InternalSmartHome.g:544:2: ( rule__Sensor__NameAssignment_2 )
            // InternalSmartHome.g:544:3: rule__Sensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Home__SensorsAssignment_3_2"
    // InternalSmartHome.g:553:1: rule__Home__SensorsAssignment_3_2 : ( ruleSensor ) ;
    public final void rule__Home__SensorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:557:1: ( ( ruleSensor ) )
            // InternalSmartHome.g:558:2: ( ruleSensor )
            {
            // InternalSmartHome.g:558:2: ( ruleSensor )
            // InternalSmartHome.g:559:3: ruleSensor
            {
             before(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__SensorsAssignment_3_2"


    // $ANTLR start "rule__Home__SensorsAssignment_3_3_1"
    // InternalSmartHome.g:568:1: rule__Home__SensorsAssignment_3_3_1 : ( ruleSensor ) ;
    public final void rule__Home__SensorsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:572:1: ( ( ruleSensor ) )
            // InternalSmartHome.g:573:2: ( ruleSensor )
            {
            // InternalSmartHome.g:573:2: ( ruleSensor )
            // InternalSmartHome.g:574:3: ruleSensor
            {
             before(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__SensorsAssignment_3_3_1"


    // $ANTLR start "rule__Sensor__NameAssignment_2"
    // InternalSmartHome.g:583:1: rule__Sensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:587:1: ( ( ruleEString ) )
            // InternalSmartHome.g:588:2: ( ruleEString )
            {
            // InternalSmartHome.g:588:2: ( ruleEString )
            // InternalSmartHome.g:589:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});

}