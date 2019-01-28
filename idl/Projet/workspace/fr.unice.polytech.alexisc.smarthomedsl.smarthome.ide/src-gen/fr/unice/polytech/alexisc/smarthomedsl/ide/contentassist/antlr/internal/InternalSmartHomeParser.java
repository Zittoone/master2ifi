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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'}'", "'rooms'", "','", "'activities'", "'Room'", "'sensors'", "'Sensor'", "'on'", "'reacts'", "'to'", "'Activity'"
    };
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleRoom"
    // InternalSmartHome.g:78:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalSmartHome.g:79:1: ( ruleRoom EOF )
            // InternalSmartHome.g:80:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalSmartHome.g:87:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:91:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalSmartHome.g:92:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalSmartHome.g:92:2: ( ( rule__Room__Group__0 ) )
            // InternalSmartHome.g:93:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalSmartHome.g:94:3: ( rule__Room__Group__0 )
            // InternalSmartHome.g:94:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleSensor"
    // InternalSmartHome.g:103:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSmartHome.g:104:1: ( ruleSensor EOF )
            // InternalSmartHome.g:105:1: ruleSensor EOF
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
    // InternalSmartHome.g:112:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:116:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSmartHome.g:117:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSmartHome.g:117:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSmartHome.g:118:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSmartHome.g:119:3: ( rule__Sensor__Group__0 )
            // InternalSmartHome.g:119:4: rule__Sensor__Group__0
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


    // $ANTLR start "entryRuleActivity"
    // InternalSmartHome.g:128:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalSmartHome.g:129:1: ( ruleActivity EOF )
            // InternalSmartHome.g:130:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalSmartHome.g:137:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:141:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalSmartHome.g:142:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalSmartHome.g:142:2: ( ( rule__Activity__Group__0 ) )
            // InternalSmartHome.g:143:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalSmartHome.g:144:3: ( rule__Activity__Group__0 )
            // InternalSmartHome.g:144:4: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleEString"
    // InternalSmartHome.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmartHome.g:154:1: ( ruleEString EOF )
            // InternalSmartHome.g:155:1: ruleEString EOF
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
    // InternalSmartHome.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmartHome.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmartHome.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalSmartHome.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmartHome.g:169:3: ( rule__EString__Alternatives )
            // InternalSmartHome.g:169:4: rule__EString__Alternatives
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
    // InternalSmartHome.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSmartHome.g:182:2: ( RULE_STRING )
                    {
                    // InternalSmartHome.g:182:2: ( RULE_STRING )
                    // InternalSmartHome.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:188:2: ( RULE_ID )
                    {
                    // InternalSmartHome.g:188:2: ( RULE_ID )
                    // InternalSmartHome.g:189:3: RULE_ID
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
    // InternalSmartHome.g:198:1: rule__Home__Group__0 : rule__Home__Group__0__Impl rule__Home__Group__1 ;
    public final void rule__Home__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:202:1: ( rule__Home__Group__0__Impl rule__Home__Group__1 )
            // InternalSmartHome.g:203:2: rule__Home__Group__0__Impl rule__Home__Group__1
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
    // InternalSmartHome.g:210:1: rule__Home__Group__0__Impl : ( () ) ;
    public final void rule__Home__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:214:1: ( ( () ) )
            // InternalSmartHome.g:215:1: ( () )
            {
            // InternalSmartHome.g:215:1: ( () )
            // InternalSmartHome.g:216:2: ()
            {
             before(grammarAccess.getHomeAccess().getHomeAction_0()); 
            // InternalSmartHome.g:217:2: ()
            // InternalSmartHome.g:217:3: 
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
    // InternalSmartHome.g:225:1: rule__Home__Group__1 : rule__Home__Group__1__Impl rule__Home__Group__2 ;
    public final void rule__Home__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:229:1: ( rule__Home__Group__1__Impl rule__Home__Group__2 )
            // InternalSmartHome.g:230:2: rule__Home__Group__1__Impl rule__Home__Group__2
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
    // InternalSmartHome.g:237:1: rule__Home__Group__1__Impl : ( 'Home' ) ;
    public final void rule__Home__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:241:1: ( ( 'Home' ) )
            // InternalSmartHome.g:242:1: ( 'Home' )
            {
            // InternalSmartHome.g:242:1: ( 'Home' )
            // InternalSmartHome.g:243:2: 'Home'
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
    // InternalSmartHome.g:252:1: rule__Home__Group__2 : rule__Home__Group__2__Impl rule__Home__Group__3 ;
    public final void rule__Home__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:256:1: ( rule__Home__Group__2__Impl rule__Home__Group__3 )
            // InternalSmartHome.g:257:2: rule__Home__Group__2__Impl rule__Home__Group__3
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
    // InternalSmartHome.g:264:1: rule__Home__Group__2__Impl : ( '{' ) ;
    public final void rule__Home__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:268:1: ( ( '{' ) )
            // InternalSmartHome.g:269:1: ( '{' )
            {
            // InternalSmartHome.g:269:1: ( '{' )
            // InternalSmartHome.g:270:2: '{'
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
    // InternalSmartHome.g:279:1: rule__Home__Group__3 : rule__Home__Group__3__Impl rule__Home__Group__4 ;
    public final void rule__Home__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:283:1: ( rule__Home__Group__3__Impl rule__Home__Group__4 )
            // InternalSmartHome.g:284:2: rule__Home__Group__3__Impl rule__Home__Group__4
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
    // InternalSmartHome.g:291:1: rule__Home__Group__3__Impl : ( ( rule__Home__Group_3__0 )? ) ;
    public final void rule__Home__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:295:1: ( ( ( rule__Home__Group_3__0 )? ) )
            // InternalSmartHome.g:296:1: ( ( rule__Home__Group_3__0 )? )
            {
            // InternalSmartHome.g:296:1: ( ( rule__Home__Group_3__0 )? )
            // InternalSmartHome.g:297:2: ( rule__Home__Group_3__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_3()); 
            // InternalSmartHome.g:298:2: ( rule__Home__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmartHome.g:298:3: rule__Home__Group_3__0
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
    // InternalSmartHome.g:306:1: rule__Home__Group__4 : rule__Home__Group__4__Impl rule__Home__Group__5 ;
    public final void rule__Home__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:310:1: ( rule__Home__Group__4__Impl rule__Home__Group__5 )
            // InternalSmartHome.g:311:2: rule__Home__Group__4__Impl rule__Home__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__5();

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
    // InternalSmartHome.g:318:1: rule__Home__Group__4__Impl : ( ( rule__Home__Group_4__0 )? ) ;
    public final void rule__Home__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:322:1: ( ( ( rule__Home__Group_4__0 )? ) )
            // InternalSmartHome.g:323:1: ( ( rule__Home__Group_4__0 )? )
            {
            // InternalSmartHome.g:323:1: ( ( rule__Home__Group_4__0 )? )
            // InternalSmartHome.g:324:2: ( rule__Home__Group_4__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_4()); 
            // InternalSmartHome.g:325:2: ( rule__Home__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmartHome.g:325:3: rule__Home__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Home__Group__5"
    // InternalSmartHome.g:333:1: rule__Home__Group__5 : rule__Home__Group__5__Impl ;
    public final void rule__Home__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:337:1: ( rule__Home__Group__5__Impl )
            // InternalSmartHome.g:338:2: rule__Home__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__5__Impl();

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
    // $ANTLR end "rule__Home__Group__5"


    // $ANTLR start "rule__Home__Group__5__Impl"
    // InternalSmartHome.g:344:1: rule__Home__Group__5__Impl : ( '}' ) ;
    public final void rule__Home__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:348:1: ( ( '}' ) )
            // InternalSmartHome.g:349:1: ( '}' )
            {
            // InternalSmartHome.g:349:1: ( '}' )
            // InternalSmartHome.g:350:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Home__Group__5__Impl"


    // $ANTLR start "rule__Home__Group_3__0"
    // InternalSmartHome.g:360:1: rule__Home__Group_3__0 : rule__Home__Group_3__0__Impl rule__Home__Group_3__1 ;
    public final void rule__Home__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:364:1: ( rule__Home__Group_3__0__Impl rule__Home__Group_3__1 )
            // InternalSmartHome.g:365:2: rule__Home__Group_3__0__Impl rule__Home__Group_3__1
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
    // InternalSmartHome.g:372:1: rule__Home__Group_3__0__Impl : ( 'rooms' ) ;
    public final void rule__Home__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:376:1: ( ( 'rooms' ) )
            // InternalSmartHome.g:377:1: ( 'rooms' )
            {
            // InternalSmartHome.g:377:1: ( 'rooms' )
            // InternalSmartHome.g:378:2: 'rooms'
            {
             before(grammarAccess.getHomeAccess().getRoomsKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRoomsKeyword_3_0()); 

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
    // InternalSmartHome.g:387:1: rule__Home__Group_3__1 : rule__Home__Group_3__1__Impl rule__Home__Group_3__2 ;
    public final void rule__Home__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:391:1: ( rule__Home__Group_3__1__Impl rule__Home__Group_3__2 )
            // InternalSmartHome.g:392:2: rule__Home__Group_3__1__Impl rule__Home__Group_3__2
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
    // InternalSmartHome.g:399:1: rule__Home__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:403:1: ( ( '{' ) )
            // InternalSmartHome.g:404:1: ( '{' )
            {
            // InternalSmartHome.g:404:1: ( '{' )
            // InternalSmartHome.g:405:2: '{'
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
    // InternalSmartHome.g:414:1: rule__Home__Group_3__2 : rule__Home__Group_3__2__Impl rule__Home__Group_3__3 ;
    public final void rule__Home__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:418:1: ( rule__Home__Group_3__2__Impl rule__Home__Group_3__3 )
            // InternalSmartHome.g:419:2: rule__Home__Group_3__2__Impl rule__Home__Group_3__3
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
    // InternalSmartHome.g:426:1: rule__Home__Group_3__2__Impl : ( ( rule__Home__RoomsAssignment_3_2 ) ) ;
    public final void rule__Home__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:430:1: ( ( ( rule__Home__RoomsAssignment_3_2 ) ) )
            // InternalSmartHome.g:431:1: ( ( rule__Home__RoomsAssignment_3_2 ) )
            {
            // InternalSmartHome.g:431:1: ( ( rule__Home__RoomsAssignment_3_2 ) )
            // InternalSmartHome.g:432:2: ( rule__Home__RoomsAssignment_3_2 )
            {
             before(grammarAccess.getHomeAccess().getRoomsAssignment_3_2()); 
            // InternalSmartHome.g:433:2: ( rule__Home__RoomsAssignment_3_2 )
            // InternalSmartHome.g:433:3: rule__Home__RoomsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__RoomsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getRoomsAssignment_3_2()); 

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
    // InternalSmartHome.g:441:1: rule__Home__Group_3__3 : rule__Home__Group_3__3__Impl rule__Home__Group_3__4 ;
    public final void rule__Home__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:445:1: ( rule__Home__Group_3__3__Impl rule__Home__Group_3__4 )
            // InternalSmartHome.g:446:2: rule__Home__Group_3__3__Impl rule__Home__Group_3__4
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
    // InternalSmartHome.g:453:1: rule__Home__Group_3__3__Impl : ( ( rule__Home__Group_3_3__0 )* ) ;
    public final void rule__Home__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:457:1: ( ( ( rule__Home__Group_3_3__0 )* ) )
            // InternalSmartHome.g:458:1: ( ( rule__Home__Group_3_3__0 )* )
            {
            // InternalSmartHome.g:458:1: ( ( rule__Home__Group_3_3__0 )* )
            // InternalSmartHome.g:459:2: ( rule__Home__Group_3_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_3_3()); 
            // InternalSmartHome.g:460:2: ( rule__Home__Group_3_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartHome.g:460:3: rule__Home__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Home__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalSmartHome.g:468:1: rule__Home__Group_3__4 : rule__Home__Group_3__4__Impl ;
    public final void rule__Home__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:472:1: ( rule__Home__Group_3__4__Impl )
            // InternalSmartHome.g:473:2: rule__Home__Group_3__4__Impl
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
    // InternalSmartHome.g:479:1: rule__Home__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:483:1: ( ( '}' ) )
            // InternalSmartHome.g:484:1: ( '}' )
            {
            // InternalSmartHome.g:484:1: ( '}' )
            // InternalSmartHome.g:485:2: '}'
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
    // InternalSmartHome.g:495:1: rule__Home__Group_3_3__0 : rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1 ;
    public final void rule__Home__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:499:1: ( rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1 )
            // InternalSmartHome.g:500:2: rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1
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
    // InternalSmartHome.g:507:1: rule__Home__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:511:1: ( ( ',' ) )
            // InternalSmartHome.g:512:1: ( ',' )
            {
            // InternalSmartHome.g:512:1: ( ',' )
            // InternalSmartHome.g:513:2: ','
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
    // InternalSmartHome.g:522:1: rule__Home__Group_3_3__1 : rule__Home__Group_3_3__1__Impl ;
    public final void rule__Home__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:526:1: ( rule__Home__Group_3_3__1__Impl )
            // InternalSmartHome.g:527:2: rule__Home__Group_3_3__1__Impl
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
    // InternalSmartHome.g:533:1: rule__Home__Group_3_3__1__Impl : ( ( rule__Home__RoomsAssignment_3_3_1 ) ) ;
    public final void rule__Home__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:537:1: ( ( ( rule__Home__RoomsAssignment_3_3_1 ) ) )
            // InternalSmartHome.g:538:1: ( ( rule__Home__RoomsAssignment_3_3_1 ) )
            {
            // InternalSmartHome.g:538:1: ( ( rule__Home__RoomsAssignment_3_3_1 ) )
            // InternalSmartHome.g:539:2: ( rule__Home__RoomsAssignment_3_3_1 )
            {
             before(grammarAccess.getHomeAccess().getRoomsAssignment_3_3_1()); 
            // InternalSmartHome.g:540:2: ( rule__Home__RoomsAssignment_3_3_1 )
            // InternalSmartHome.g:540:3: rule__Home__RoomsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__RoomsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getRoomsAssignment_3_3_1()); 

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


    // $ANTLR start "rule__Home__Group_4__0"
    // InternalSmartHome.g:549:1: rule__Home__Group_4__0 : rule__Home__Group_4__0__Impl rule__Home__Group_4__1 ;
    public final void rule__Home__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:553:1: ( rule__Home__Group_4__0__Impl rule__Home__Group_4__1 )
            // InternalSmartHome.g:554:2: rule__Home__Group_4__0__Impl rule__Home__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4__1();

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
    // $ANTLR end "rule__Home__Group_4__0"


    // $ANTLR start "rule__Home__Group_4__0__Impl"
    // InternalSmartHome.g:561:1: rule__Home__Group_4__0__Impl : ( 'activities' ) ;
    public final void rule__Home__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:565:1: ( ( 'activities' ) )
            // InternalSmartHome.g:566:1: ( 'activities' )
            {
            // InternalSmartHome.g:566:1: ( 'activities' )
            // InternalSmartHome.g:567:2: 'activities'
            {
             before(grammarAccess.getHomeAccess().getActivitiesKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getActivitiesKeyword_4_0()); 

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
    // $ANTLR end "rule__Home__Group_4__0__Impl"


    // $ANTLR start "rule__Home__Group_4__1"
    // InternalSmartHome.g:576:1: rule__Home__Group_4__1 : rule__Home__Group_4__1__Impl rule__Home__Group_4__2 ;
    public final void rule__Home__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:580:1: ( rule__Home__Group_4__1__Impl rule__Home__Group_4__2 )
            // InternalSmartHome.g:581:2: rule__Home__Group_4__1__Impl rule__Home__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Home__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4__2();

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
    // $ANTLR end "rule__Home__Group_4__1"


    // $ANTLR start "rule__Home__Group_4__1__Impl"
    // InternalSmartHome.g:588:1: rule__Home__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:592:1: ( ( '{' ) )
            // InternalSmartHome.g:593:1: ( '{' )
            {
            // InternalSmartHome.g:593:1: ( '{' )
            // InternalSmartHome.g:594:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Home__Group_4__1__Impl"


    // $ANTLR start "rule__Home__Group_4__2"
    // InternalSmartHome.g:603:1: rule__Home__Group_4__2 : rule__Home__Group_4__2__Impl rule__Home__Group_4__3 ;
    public final void rule__Home__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:607:1: ( rule__Home__Group_4__2__Impl rule__Home__Group_4__3 )
            // InternalSmartHome.g:608:2: rule__Home__Group_4__2__Impl rule__Home__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Home__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4__3();

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
    // $ANTLR end "rule__Home__Group_4__2"


    // $ANTLR start "rule__Home__Group_4__2__Impl"
    // InternalSmartHome.g:615:1: rule__Home__Group_4__2__Impl : ( ( rule__Home__ActivitiesAssignment_4_2 ) ) ;
    public final void rule__Home__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:619:1: ( ( ( rule__Home__ActivitiesAssignment_4_2 ) ) )
            // InternalSmartHome.g:620:1: ( ( rule__Home__ActivitiesAssignment_4_2 ) )
            {
            // InternalSmartHome.g:620:1: ( ( rule__Home__ActivitiesAssignment_4_2 ) )
            // InternalSmartHome.g:621:2: ( rule__Home__ActivitiesAssignment_4_2 )
            {
             before(grammarAccess.getHomeAccess().getActivitiesAssignment_4_2()); 
            // InternalSmartHome.g:622:2: ( rule__Home__ActivitiesAssignment_4_2 )
            // InternalSmartHome.g:622:3: rule__Home__ActivitiesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__ActivitiesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getActivitiesAssignment_4_2()); 

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
    // $ANTLR end "rule__Home__Group_4__2__Impl"


    // $ANTLR start "rule__Home__Group_4__3"
    // InternalSmartHome.g:630:1: rule__Home__Group_4__3 : rule__Home__Group_4__3__Impl rule__Home__Group_4__4 ;
    public final void rule__Home__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:634:1: ( rule__Home__Group_4__3__Impl rule__Home__Group_4__4 )
            // InternalSmartHome.g:635:2: rule__Home__Group_4__3__Impl rule__Home__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Home__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4__4();

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
    // $ANTLR end "rule__Home__Group_4__3"


    // $ANTLR start "rule__Home__Group_4__3__Impl"
    // InternalSmartHome.g:642:1: rule__Home__Group_4__3__Impl : ( ( rule__Home__Group_4_3__0 )* ) ;
    public final void rule__Home__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:646:1: ( ( ( rule__Home__Group_4_3__0 )* ) )
            // InternalSmartHome.g:647:1: ( ( rule__Home__Group_4_3__0 )* )
            {
            // InternalSmartHome.g:647:1: ( ( rule__Home__Group_4_3__0 )* )
            // InternalSmartHome.g:648:2: ( rule__Home__Group_4_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_4_3()); 
            // InternalSmartHome.g:649:2: ( rule__Home__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartHome.g:649:3: rule__Home__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Home__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Home__Group_4__3__Impl"


    // $ANTLR start "rule__Home__Group_4__4"
    // InternalSmartHome.g:657:1: rule__Home__Group_4__4 : rule__Home__Group_4__4__Impl ;
    public final void rule__Home__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:661:1: ( rule__Home__Group_4__4__Impl )
            // InternalSmartHome.g:662:2: rule__Home__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_4__4__Impl();

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
    // $ANTLR end "rule__Home__Group_4__4"


    // $ANTLR start "rule__Home__Group_4__4__Impl"
    // InternalSmartHome.g:668:1: rule__Home__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:672:1: ( ( '}' ) )
            // InternalSmartHome.g:673:1: ( '}' )
            {
            // InternalSmartHome.g:673:1: ( '}' )
            // InternalSmartHome.g:674:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Home__Group_4__4__Impl"


    // $ANTLR start "rule__Home__Group_4_3__0"
    // InternalSmartHome.g:684:1: rule__Home__Group_4_3__0 : rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1 ;
    public final void rule__Home__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:688:1: ( rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1 )
            // InternalSmartHome.g:689:2: rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Home__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_4_3__1();

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
    // $ANTLR end "rule__Home__Group_4_3__0"


    // $ANTLR start "rule__Home__Group_4_3__0__Impl"
    // InternalSmartHome.g:696:1: rule__Home__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:700:1: ( ( ',' ) )
            // InternalSmartHome.g:701:1: ( ',' )
            {
            // InternalSmartHome.g:701:1: ( ',' )
            // InternalSmartHome.g:702:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Home__Group_4_3__0__Impl"


    // $ANTLR start "rule__Home__Group_4_3__1"
    // InternalSmartHome.g:711:1: rule__Home__Group_4_3__1 : rule__Home__Group_4_3__1__Impl ;
    public final void rule__Home__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:715:1: ( rule__Home__Group_4_3__1__Impl )
            // InternalSmartHome.g:716:2: rule__Home__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Home__Group_4_3__1"


    // $ANTLR start "rule__Home__Group_4_3__1__Impl"
    // InternalSmartHome.g:722:1: rule__Home__Group_4_3__1__Impl : ( ( rule__Home__ActivitiesAssignment_4_3_1 ) ) ;
    public final void rule__Home__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:726:1: ( ( ( rule__Home__ActivitiesAssignment_4_3_1 ) ) )
            // InternalSmartHome.g:727:1: ( ( rule__Home__ActivitiesAssignment_4_3_1 ) )
            {
            // InternalSmartHome.g:727:1: ( ( rule__Home__ActivitiesAssignment_4_3_1 ) )
            // InternalSmartHome.g:728:2: ( rule__Home__ActivitiesAssignment_4_3_1 )
            {
             before(grammarAccess.getHomeAccess().getActivitiesAssignment_4_3_1()); 
            // InternalSmartHome.g:729:2: ( rule__Home__ActivitiesAssignment_4_3_1 )
            // InternalSmartHome.g:729:3: rule__Home__ActivitiesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__ActivitiesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getActivitiesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Home__Group_4_3__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalSmartHome.g:738:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:742:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalSmartHome.g:743:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

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
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalSmartHome.g:750:1: rule__Room__Group__0__Impl : ( () ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:754:1: ( ( () ) )
            // InternalSmartHome.g:755:1: ( () )
            {
            // InternalSmartHome.g:755:1: ( () )
            // InternalSmartHome.g:756:2: ()
            {
             before(grammarAccess.getRoomAccess().getRoomAction_0()); 
            // InternalSmartHome.g:757:2: ()
            // InternalSmartHome.g:757:3: 
            {
            }

             after(grammarAccess.getRoomAccess().getRoomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalSmartHome.g:765:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:769:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalSmartHome.g:770:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

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
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalSmartHome.g:777:1: rule__Room__Group__1__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:781:1: ( ( 'Room' ) )
            // InternalSmartHome.g:782:1: ( 'Room' )
            {
            // InternalSmartHome.g:782:1: ( 'Room' )
            // InternalSmartHome.g:783:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_1()); 

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
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalSmartHome.g:792:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:796:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalSmartHome.g:797:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

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
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalSmartHome.g:804:1: rule__Room__Group__2__Impl : ( ( rule__Room__NameAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:808:1: ( ( ( rule__Room__NameAssignment_2 ) ) )
            // InternalSmartHome.g:809:1: ( ( rule__Room__NameAssignment_2 ) )
            {
            // InternalSmartHome.g:809:1: ( ( rule__Room__NameAssignment_2 ) )
            // InternalSmartHome.g:810:2: ( rule__Room__NameAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_2()); 
            // InternalSmartHome.g:811:2: ( rule__Room__NameAssignment_2 )
            // InternalSmartHome.g:811:3: rule__Room__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalSmartHome.g:819:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:823:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalSmartHome.g:824:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

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
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalSmartHome.g:831:1: rule__Room__Group__3__Impl : ( '{' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:835:1: ( ( '{' ) )
            // InternalSmartHome.g:836:1: ( '{' )
            {
            // InternalSmartHome.g:836:1: ( '{' )
            // InternalSmartHome.g:837:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalSmartHome.g:846:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:850:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalSmartHome.g:851:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

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
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalSmartHome.g:858:1: rule__Room__Group__4__Impl : ( ( rule__Room__Group_4__0 )? ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:862:1: ( ( ( rule__Room__Group_4__0 )? ) )
            // InternalSmartHome.g:863:1: ( ( rule__Room__Group_4__0 )? )
            {
            // InternalSmartHome.g:863:1: ( ( rule__Room__Group_4__0 )? )
            // InternalSmartHome.g:864:2: ( rule__Room__Group_4__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_4()); 
            // InternalSmartHome.g:865:2: ( rule__Room__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartHome.g:865:3: rule__Room__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalSmartHome.g:873:1: rule__Room__Group__5 : rule__Room__Group__5__Impl ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:877:1: ( rule__Room__Group__5__Impl )
            // InternalSmartHome.g:878:2: rule__Room__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__5__Impl();

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
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalSmartHome.g:884:1: rule__Room__Group__5__Impl : ( '}' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:888:1: ( ( '}' ) )
            // InternalSmartHome.g:889:1: ( '}' )
            {
            // InternalSmartHome.g:889:1: ( '}' )
            // InternalSmartHome.g:890:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group_4__0"
    // InternalSmartHome.g:900:1: rule__Room__Group_4__0 : rule__Room__Group_4__0__Impl rule__Room__Group_4__1 ;
    public final void rule__Room__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:904:1: ( rule__Room__Group_4__0__Impl rule__Room__Group_4__1 )
            // InternalSmartHome.g:905:2: rule__Room__Group_4__0__Impl rule__Room__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4__1();

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
    // $ANTLR end "rule__Room__Group_4__0"


    // $ANTLR start "rule__Room__Group_4__0__Impl"
    // InternalSmartHome.g:912:1: rule__Room__Group_4__0__Impl : ( 'sensors' ) ;
    public final void rule__Room__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:916:1: ( ( 'sensors' ) )
            // InternalSmartHome.g:917:1: ( 'sensors' )
            {
            // InternalSmartHome.g:917:1: ( 'sensors' )
            // InternalSmartHome.g:918:2: 'sensors'
            {
             before(grammarAccess.getRoomAccess().getSensorsKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getSensorsKeyword_4_0()); 

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
    // $ANTLR end "rule__Room__Group_4__0__Impl"


    // $ANTLR start "rule__Room__Group_4__1"
    // InternalSmartHome.g:927:1: rule__Room__Group_4__1 : rule__Room__Group_4__1__Impl rule__Room__Group_4__2 ;
    public final void rule__Room__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:931:1: ( rule__Room__Group_4__1__Impl rule__Room__Group_4__2 )
            // InternalSmartHome.g:932:2: rule__Room__Group_4__1__Impl rule__Room__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Room__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4__2();

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
    // $ANTLR end "rule__Room__Group_4__1"


    // $ANTLR start "rule__Room__Group_4__1__Impl"
    // InternalSmartHome.g:939:1: rule__Room__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Room__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:943:1: ( ( '{' ) )
            // InternalSmartHome.g:944:1: ( '{' )
            {
            // InternalSmartHome.g:944:1: ( '{' )
            // InternalSmartHome.g:945:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Room__Group_4__1__Impl"


    // $ANTLR start "rule__Room__Group_4__2"
    // InternalSmartHome.g:954:1: rule__Room__Group_4__2 : rule__Room__Group_4__2__Impl rule__Room__Group_4__3 ;
    public final void rule__Room__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:958:1: ( rule__Room__Group_4__2__Impl rule__Room__Group_4__3 )
            // InternalSmartHome.g:959:2: rule__Room__Group_4__2__Impl rule__Room__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4__3();

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
    // $ANTLR end "rule__Room__Group_4__2"


    // $ANTLR start "rule__Room__Group_4__2__Impl"
    // InternalSmartHome.g:966:1: rule__Room__Group_4__2__Impl : ( ( rule__Room__SensorsAssignment_4_2 ) ) ;
    public final void rule__Room__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:970:1: ( ( ( rule__Room__SensorsAssignment_4_2 ) ) )
            // InternalSmartHome.g:971:1: ( ( rule__Room__SensorsAssignment_4_2 ) )
            {
            // InternalSmartHome.g:971:1: ( ( rule__Room__SensorsAssignment_4_2 ) )
            // InternalSmartHome.g:972:2: ( rule__Room__SensorsAssignment_4_2 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_4_2()); 
            // InternalSmartHome.g:973:2: ( rule__Room__SensorsAssignment_4_2 )
            // InternalSmartHome.g:973:3: rule__Room__SensorsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAssignment_4_2()); 

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
    // $ANTLR end "rule__Room__Group_4__2__Impl"


    // $ANTLR start "rule__Room__Group_4__3"
    // InternalSmartHome.g:981:1: rule__Room__Group_4__3 : rule__Room__Group_4__3__Impl rule__Room__Group_4__4 ;
    public final void rule__Room__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:985:1: ( rule__Room__Group_4__3__Impl rule__Room__Group_4__4 )
            // InternalSmartHome.g:986:2: rule__Room__Group_4__3__Impl rule__Room__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4__4();

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
    // $ANTLR end "rule__Room__Group_4__3"


    // $ANTLR start "rule__Room__Group_4__3__Impl"
    // InternalSmartHome.g:993:1: rule__Room__Group_4__3__Impl : ( ( rule__Room__Group_4_3__0 )* ) ;
    public final void rule__Room__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:997:1: ( ( ( rule__Room__Group_4_3__0 )* ) )
            // InternalSmartHome.g:998:1: ( ( rule__Room__Group_4_3__0 )* )
            {
            // InternalSmartHome.g:998:1: ( ( rule__Room__Group_4_3__0 )* )
            // InternalSmartHome.g:999:2: ( rule__Room__Group_4_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_4_3()); 
            // InternalSmartHome.g:1000:2: ( rule__Room__Group_4_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartHome.g:1000:3: rule__Room__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Room__Group_4__3__Impl"


    // $ANTLR start "rule__Room__Group_4__4"
    // InternalSmartHome.g:1008:1: rule__Room__Group_4__4 : rule__Room__Group_4__4__Impl ;
    public final void rule__Room__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1012:1: ( rule__Room__Group_4__4__Impl )
            // InternalSmartHome.g:1013:2: rule__Room__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_4__4__Impl();

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
    // $ANTLR end "rule__Room__Group_4__4"


    // $ANTLR start "rule__Room__Group_4__4__Impl"
    // InternalSmartHome.g:1019:1: rule__Room__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Room__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1023:1: ( ( '}' ) )
            // InternalSmartHome.g:1024:1: ( '}' )
            {
            // InternalSmartHome.g:1024:1: ( '}' )
            // InternalSmartHome.g:1025:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Room__Group_4__4__Impl"


    // $ANTLR start "rule__Room__Group_4_3__0"
    // InternalSmartHome.g:1035:1: rule__Room__Group_4_3__0 : rule__Room__Group_4_3__0__Impl rule__Room__Group_4_3__1 ;
    public final void rule__Room__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1039:1: ( rule__Room__Group_4_3__0__Impl rule__Room__Group_4_3__1 )
            // InternalSmartHome.g:1040:2: rule__Room__Group_4_3__0__Impl rule__Room__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Room__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4_3__1();

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
    // $ANTLR end "rule__Room__Group_4_3__0"


    // $ANTLR start "rule__Room__Group_4_3__0__Impl"
    // InternalSmartHome.g:1047:1: rule__Room__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1051:1: ( ( ',' ) )
            // InternalSmartHome.g:1052:1: ( ',' )
            {
            // InternalSmartHome.g:1052:1: ( ',' )
            // InternalSmartHome.g:1053:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Room__Group_4_3__0__Impl"


    // $ANTLR start "rule__Room__Group_4_3__1"
    // InternalSmartHome.g:1062:1: rule__Room__Group_4_3__1 : rule__Room__Group_4_3__1__Impl ;
    public final void rule__Room__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1066:1: ( rule__Room__Group_4_3__1__Impl )
            // InternalSmartHome.g:1067:2: rule__Room__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Room__Group_4_3__1"


    // $ANTLR start "rule__Room__Group_4_3__1__Impl"
    // InternalSmartHome.g:1073:1: rule__Room__Group_4_3__1__Impl : ( ( rule__Room__SensorsAssignment_4_3_1 ) ) ;
    public final void rule__Room__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1077:1: ( ( ( rule__Room__SensorsAssignment_4_3_1 ) ) )
            // InternalSmartHome.g:1078:1: ( ( rule__Room__SensorsAssignment_4_3_1 ) )
            {
            // InternalSmartHome.g:1078:1: ( ( rule__Room__SensorsAssignment_4_3_1 ) )
            // InternalSmartHome.g:1079:2: ( rule__Room__SensorsAssignment_4_3_1 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_4_3_1()); 
            // InternalSmartHome.g:1080:2: ( rule__Room__SensorsAssignment_4_3_1 )
            // InternalSmartHome.g:1080:3: rule__Room__SensorsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Room__Group_4_3__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalSmartHome.g:1089:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1093:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSmartHome.g:1094:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSmartHome.g:1101:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1105:1: ( ( () ) )
            // InternalSmartHome.g:1106:1: ( () )
            {
            // InternalSmartHome.g:1106:1: ( () )
            // InternalSmartHome.g:1107:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSmartHome.g:1108:2: ()
            // InternalSmartHome.g:1108:3: 
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
    // InternalSmartHome.g:1116:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1120:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSmartHome.g:1121:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSmartHome.g:1128:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1132:1: ( ( 'Sensor' ) )
            // InternalSmartHome.g:1133:1: ( 'Sensor' )
            {
            // InternalSmartHome.g:1133:1: ( 'Sensor' )
            // InternalSmartHome.g:1134:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSmartHome.g:1143:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1147:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalSmartHome.g:1148:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

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
    // InternalSmartHome.g:1155:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__NameAssignment_2 ) ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1159:1: ( ( ( rule__Sensor__NameAssignment_2 ) ) )
            // InternalSmartHome.g:1160:1: ( ( rule__Sensor__NameAssignment_2 ) )
            {
            // InternalSmartHome.g:1160:1: ( ( rule__Sensor__NameAssignment_2 ) )
            // InternalSmartHome.g:1161:2: ( rule__Sensor__NameAssignment_2 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_2()); 
            // InternalSmartHome.g:1162:2: ( rule__Sensor__NameAssignment_2 )
            // InternalSmartHome.g:1162:3: rule__Sensor__NameAssignment_2
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


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalSmartHome.g:1170:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1174:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalSmartHome.g:1175:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

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
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalSmartHome.g:1182:1: rule__Sensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1186:1: ( ( 'on' ) )
            // InternalSmartHome.g:1187:1: ( 'on' )
            {
            // InternalSmartHome.g:1187:1: ( 'on' )
            // InternalSmartHome.g:1188:2: 'on'
            {
             before(grammarAccess.getSensorAccess().getOnKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getOnKeyword_3()); 

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
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalSmartHome.g:1197:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1201:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalSmartHome.g:1202:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

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
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalSmartHome.g:1209:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__LocationAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1213:1: ( ( ( rule__Sensor__LocationAssignment_4 ) ) )
            // InternalSmartHome.g:1214:1: ( ( rule__Sensor__LocationAssignment_4 ) )
            {
            // InternalSmartHome.g:1214:1: ( ( rule__Sensor__LocationAssignment_4 ) )
            // InternalSmartHome.g:1215:2: ( rule__Sensor__LocationAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getLocationAssignment_4()); 
            // InternalSmartHome.g:1216:2: ( rule__Sensor__LocationAssignment_4 )
            // InternalSmartHome.g:1216:3: rule__Sensor__LocationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__LocationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getLocationAssignment_4()); 

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
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalSmartHome.g:1224:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1228:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalSmartHome.g:1229:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

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
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalSmartHome.g:1236:1: rule__Sensor__Group__5__Impl : ( 'reacts' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1240:1: ( ( 'reacts' ) )
            // InternalSmartHome.g:1241:1: ( 'reacts' )
            {
            // InternalSmartHome.g:1241:1: ( 'reacts' )
            // InternalSmartHome.g:1242:2: 'reacts'
            {
             before(grammarAccess.getSensorAccess().getReactsKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getReactsKeyword_5()); 

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
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalSmartHome.g:1251:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl rule__Sensor__Group__7 ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1255:1: ( rule__Sensor__Group__6__Impl rule__Sensor__Group__7 )
            // InternalSmartHome.g:1256:2: rule__Sensor__Group__6__Impl rule__Sensor__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Sensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7();

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
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalSmartHome.g:1263:1: rule__Sensor__Group__6__Impl : ( 'to' ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1267:1: ( ( 'to' ) )
            // InternalSmartHome.g:1268:1: ( 'to' )
            {
            // InternalSmartHome.g:1268:1: ( 'to' )
            // InternalSmartHome.g:1269:2: 'to'
            {
             before(grammarAccess.getSensorAccess().getToKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getToKeyword_6()); 

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
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__7"
    // InternalSmartHome.g:1278:1: rule__Sensor__Group__7 : rule__Sensor__Group__7__Impl ;
    public final void rule__Sensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1282:1: ( rule__Sensor__Group__7__Impl )
            // InternalSmartHome.g:1283:2: rule__Sensor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7__Impl();

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
    // $ANTLR end "rule__Sensor__Group__7"


    // $ANTLR start "rule__Sensor__Group__7__Impl"
    // InternalSmartHome.g:1289:1: rule__Sensor__Group__7__Impl : ( ( rule__Sensor__TypeAssignment_7 ) ) ;
    public final void rule__Sensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1293:1: ( ( ( rule__Sensor__TypeAssignment_7 ) ) )
            // InternalSmartHome.g:1294:1: ( ( rule__Sensor__TypeAssignment_7 ) )
            {
            // InternalSmartHome.g:1294:1: ( ( rule__Sensor__TypeAssignment_7 ) )
            // InternalSmartHome.g:1295:2: ( rule__Sensor__TypeAssignment_7 )
            {
             before(grammarAccess.getSensorAccess().getTypeAssignment_7()); 
            // InternalSmartHome.g:1296:2: ( rule__Sensor__TypeAssignment_7 )
            // InternalSmartHome.g:1296:3: rule__Sensor__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getTypeAssignment_7()); 

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
    // $ANTLR end "rule__Sensor__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // InternalSmartHome.g:1305:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1309:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalSmartHome.g:1310:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__1();

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
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // InternalSmartHome.g:1317:1: rule__Activity__Group__0__Impl : ( () ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1321:1: ( ( () ) )
            // InternalSmartHome.g:1322:1: ( () )
            {
            // InternalSmartHome.g:1322:1: ( () )
            // InternalSmartHome.g:1323:2: ()
            {
             before(grammarAccess.getActivityAccess().getActivityAction_0()); 
            // InternalSmartHome.g:1324:2: ()
            // InternalSmartHome.g:1324:3: 
            {
            }

             after(grammarAccess.getActivityAccess().getActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // InternalSmartHome.g:1332:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1336:1: ( rule__Activity__Group__1__Impl )
            // InternalSmartHome.g:1337:2: rule__Activity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__1__Impl();

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
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // InternalSmartHome.g:1343:1: rule__Activity__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1347:1: ( ( 'Activity' ) )
            // InternalSmartHome.g:1348:1: ( 'Activity' )
            {
            // InternalSmartHome.g:1348:1: ( 'Activity' )
            // InternalSmartHome.g:1349:2: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_1()); 

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
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Home__RoomsAssignment_3_2"
    // InternalSmartHome.g:1359:1: rule__Home__RoomsAssignment_3_2 : ( ruleRoom ) ;
    public final void rule__Home__RoomsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1363:1: ( ( ruleRoom ) )
            // InternalSmartHome.g:1364:2: ( ruleRoom )
            {
            // InternalSmartHome.g:1364:2: ( ruleRoom )
            // InternalSmartHome.g:1365:3: ruleRoom
            {
             before(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Home__RoomsAssignment_3_2"


    // $ANTLR start "rule__Home__RoomsAssignment_3_3_1"
    // InternalSmartHome.g:1374:1: rule__Home__RoomsAssignment_3_3_1 : ( ruleRoom ) ;
    public final void rule__Home__RoomsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1378:1: ( ( ruleRoom ) )
            // InternalSmartHome.g:1379:2: ( ruleRoom )
            {
            // InternalSmartHome.g:1379:2: ( ruleRoom )
            // InternalSmartHome.g:1380:3: ruleRoom
            {
             before(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Home__RoomsAssignment_3_3_1"


    // $ANTLR start "rule__Home__ActivitiesAssignment_4_2"
    // InternalSmartHome.g:1389:1: rule__Home__ActivitiesAssignment_4_2 : ( ruleActivity ) ;
    public final void rule__Home__ActivitiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1393:1: ( ( ruleActivity ) )
            // InternalSmartHome.g:1394:2: ( ruleActivity )
            {
            // InternalSmartHome.g:1394:2: ( ruleActivity )
            // InternalSmartHome.g:1395:3: ruleActivity
            {
             before(grammarAccess.getHomeAccess().getActivitiesActivityParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getActivitiesActivityParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Home__ActivitiesAssignment_4_2"


    // $ANTLR start "rule__Home__ActivitiesAssignment_4_3_1"
    // InternalSmartHome.g:1404:1: rule__Home__ActivitiesAssignment_4_3_1 : ( ruleActivity ) ;
    public final void rule__Home__ActivitiesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1408:1: ( ( ruleActivity ) )
            // InternalSmartHome.g:1409:2: ( ruleActivity )
            {
            // InternalSmartHome.g:1409:2: ( ruleActivity )
            // InternalSmartHome.g:1410:3: ruleActivity
            {
             before(grammarAccess.getHomeAccess().getActivitiesActivityParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getActivitiesActivityParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Home__ActivitiesAssignment_4_3_1"


    // $ANTLR start "rule__Room__NameAssignment_2"
    // InternalSmartHome.g:1419:1: rule__Room__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1423:1: ( ( ruleEString ) )
            // InternalSmartHome.g:1424:2: ( ruleEString )
            {
            // InternalSmartHome.g:1424:2: ( ruleEString )
            // InternalSmartHome.g:1425:3: ruleEString
            {
             before(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Room__NameAssignment_2"


    // $ANTLR start "rule__Room__SensorsAssignment_4_2"
    // InternalSmartHome.g:1434:1: rule__Room__SensorsAssignment_4_2 : ( ruleSensor ) ;
    public final void rule__Room__SensorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1438:1: ( ( ruleSensor ) )
            // InternalSmartHome.g:1439:2: ( ruleSensor )
            {
            // InternalSmartHome.g:1439:2: ( ruleSensor )
            // InternalSmartHome.g:1440:3: ruleSensor
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Room__SensorsAssignment_4_2"


    // $ANTLR start "rule__Room__SensorsAssignment_4_3_1"
    // InternalSmartHome.g:1449:1: rule__Room__SensorsAssignment_4_3_1 : ( ruleSensor ) ;
    public final void rule__Room__SensorsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1453:1: ( ( ruleSensor ) )
            // InternalSmartHome.g:1454:2: ( ruleSensor )
            {
            // InternalSmartHome.g:1454:2: ( ruleSensor )
            // InternalSmartHome.g:1455:3: ruleSensor
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Room__SensorsAssignment_4_3_1"


    // $ANTLR start "rule__Sensor__NameAssignment_2"
    // InternalSmartHome.g:1464:1: rule__Sensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1468:1: ( ( ruleEString ) )
            // InternalSmartHome.g:1469:2: ( ruleEString )
            {
            // InternalSmartHome.g:1469:2: ( ruleEString )
            // InternalSmartHome.g:1470:3: ruleEString
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


    // $ANTLR start "rule__Sensor__LocationAssignment_4"
    // InternalSmartHome.g:1479:1: rule__Sensor__LocationAssignment_4 : ( ruleEString ) ;
    public final void rule__Sensor__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1483:1: ( ( ruleEString ) )
            // InternalSmartHome.g:1484:2: ( ruleEString )
            {
            // InternalSmartHome.g:1484:2: ( ruleEString )
            // InternalSmartHome.g:1485:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getLocationEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getLocationEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Sensor__LocationAssignment_4"


    // $ANTLR start "rule__Sensor__TypeAssignment_7"
    // InternalSmartHome.g:1494:1: rule__Sensor__TypeAssignment_7 : ( ruleEString ) ;
    public final void rule__Sensor__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1498:1: ( ( ruleEString ) )
            // InternalSmartHome.g:1499:2: ( ruleEString )
            {
            // InternalSmartHome.g:1499:2: ( ruleEString )
            // InternalSmartHome.g:1500:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getTypeEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getTypeEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Sensor__TypeAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});

}