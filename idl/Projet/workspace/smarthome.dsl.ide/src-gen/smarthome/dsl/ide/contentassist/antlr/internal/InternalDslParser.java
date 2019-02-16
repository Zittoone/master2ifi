package smarthome.dsl.ide.contentassist.antlr.internal;

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
import smarthome.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'for'", "'since'", "'>'", "'<'", "'='", "'standing'", "'laying'", "'sitting'", "'millis'", "'seconds'", "'minutes'", "'start'", "'eventFile'", "'rooms'", "'{'", "'}'", "','", "'persons'", "'patterns'", "'monitor'", "'Room'", "'Person'", "'Pattern'", "'AnalogSensor'", "'DigitalSensor'", "'-'", "'.'", "'('", "')'", "'and'", "'is'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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
    // InternalDsl.g:53:1: entryRuleHome : ruleHome EOF ;
    public final void entryRuleHome() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleHome EOF )
            // InternalDsl.g:55:1: ruleHome EOF
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
    // InternalDsl.g:62:1: ruleHome : ( ( rule__Home__Group__0 ) ) ;
    public final void ruleHome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Home__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Home__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Home__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Home__Group__0 )
            {
             before(grammarAccess.getHomeAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Home__Group__0 )
            // InternalDsl.g:69:4: rule__Home__Group__0
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
    // InternalDsl.g:78:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleSensor EOF )
            // InternalDsl.g:80:1: ruleSensor EOF
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
    // InternalDsl.g:87:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Sensor__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Sensor__Alternatives )
            // InternalDsl.g:94:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

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


    // $ANTLR start "entryRulePredicate"
    // InternalDsl.g:103:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( rulePredicate EOF )
            // InternalDsl.g:105:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalDsl.g:112:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__Predicate__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Predicate__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__Predicate__Alternatives )
            // InternalDsl.g:119:4: rule__Predicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives()); 

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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleRoom"
    // InternalDsl.g:128:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleRoom EOF )
            // InternalDsl.g:130:1: ruleRoom EOF
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
    // InternalDsl.g:137:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Room__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Room__Group__0 )
            // InternalDsl.g:144:4: rule__Room__Group__0
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


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:153:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( rulePerson EOF )
            // InternalDsl.g:155:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:162:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Person__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Person__Group__0 )
            // InternalDsl.g:169:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRulePattern"
    // InternalDsl.g:178:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( rulePattern EOF )
            // InternalDsl.g:180:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalDsl.g:187:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Pattern__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Pattern__Group__0 )
            // InternalDsl.g:194:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleEString EOF )
            // InternalDsl.g:205:1: ruleEString EOF
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
    // InternalDsl.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:219:3: ( rule__EString__Alternatives )
            // InternalDsl.g:219:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleAnalogSensor"
    // InternalDsl.g:228:1: entryRuleAnalogSensor : ruleAnalogSensor EOF ;
    public final void entryRuleAnalogSensor() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleAnalogSensor EOF )
            // InternalDsl.g:230:1: ruleAnalogSensor EOF
            {
             before(grammarAccess.getAnalogSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleAnalogSensor();

            state._fsp--;

             after(grammarAccess.getAnalogSensorRule()); 
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
    // $ANTLR end "entryRuleAnalogSensor"


    // $ANTLR start "ruleAnalogSensor"
    // InternalDsl.g:237:1: ruleAnalogSensor : ( ( rule__AnalogSensor__Group__0 ) ) ;
    public final void ruleAnalogSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__AnalogSensor__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__AnalogSensor__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__AnalogSensor__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__AnalogSensor__Group__0 )
            {
             before(grammarAccess.getAnalogSensorAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__AnalogSensor__Group__0 )
            // InternalDsl.g:244:4: rule__AnalogSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnalogSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleAnalogSensor"


    // $ANTLR start "entryRuleDigitalSensor"
    // InternalDsl.g:253:1: entryRuleDigitalSensor : ruleDigitalSensor EOF ;
    public final void entryRuleDigitalSensor() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleDigitalSensor EOF )
            // InternalDsl.g:255:1: ruleDigitalSensor EOF
            {
             before(grammarAccess.getDigitalSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleDigitalSensor();

            state._fsp--;

             after(grammarAccess.getDigitalSensorRule()); 
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
    // $ANTLR end "entryRuleDigitalSensor"


    // $ANTLR start "ruleDigitalSensor"
    // InternalDsl.g:262:1: ruleDigitalSensor : ( ( rule__DigitalSensor__Group__0 ) ) ;
    public final void ruleDigitalSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__DigitalSensor__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__DigitalSensor__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__DigitalSensor__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__DigitalSensor__Group__0 )
            {
             before(grammarAccess.getDigitalSensorAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__DigitalSensor__Group__0 )
            // InternalDsl.g:269:4: rule__DigitalSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDigitalSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleDigitalSensor"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:278:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleEDouble EOF )
            // InternalDsl.g:280:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:287:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__EDouble__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__EDouble__Group__0 )
            // InternalDsl.g:294:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleRule"
    // InternalDsl.g:303:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleRule EOF )
            // InternalDsl.g:305:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDsl.g:312:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Rule__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Rule__Group__0 )
            // InternalDsl.g:319:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDuration"
    // InternalDsl.g:328:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleDuration EOF )
            // InternalDsl.g:330:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalDsl.g:337:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Duration__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Duration__Group__0 )
            // InternalDsl.g:344:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleSensorPredicate"
    // InternalDsl.g:353:1: entryRuleSensorPredicate : ruleSensorPredicate EOF ;
    public final void entryRuleSensorPredicate() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleSensorPredicate EOF )
            // InternalDsl.g:355:1: ruleSensorPredicate EOF
            {
             before(grammarAccess.getSensorPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorPredicate();

            state._fsp--;

             after(grammarAccess.getSensorPredicateRule()); 
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
    // $ANTLR end "entryRuleSensorPredicate"


    // $ANTLR start "ruleSensorPredicate"
    // InternalDsl.g:362:1: ruleSensorPredicate : ( ( rule__SensorPredicate__Group__0 ) ) ;
    public final void ruleSensorPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__SensorPredicate__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__SensorPredicate__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__SensorPredicate__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__SensorPredicate__Group__0 )
            {
             before(grammarAccess.getSensorPredicateAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__SensorPredicate__Group__0 )
            // InternalDsl.g:369:4: rule__SensorPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorPredicateAccess().getGroup()); 

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
    // $ANTLR end "ruleSensorPredicate"


    // $ANTLR start "entryRulePersonPredicate"
    // InternalDsl.g:378:1: entryRulePersonPredicate : rulePersonPredicate EOF ;
    public final void entryRulePersonPredicate() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( rulePersonPredicate EOF )
            // InternalDsl.g:380:1: rulePersonPredicate EOF
            {
             before(grammarAccess.getPersonPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePersonPredicate();

            state._fsp--;

             after(grammarAccess.getPersonPredicateRule()); 
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
    // $ANTLR end "entryRulePersonPredicate"


    // $ANTLR start "rulePersonPredicate"
    // InternalDsl.g:387:1: rulePersonPredicate : ( ( rule__PersonPredicate__Group__0 ) ) ;
    public final void rulePersonPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__PersonPredicate__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__PersonPredicate__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__PersonPredicate__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__PersonPredicate__Group__0 )
            {
             before(grammarAccess.getPersonPredicateAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__PersonPredicate__Group__0 )
            // InternalDsl.g:394:4: rule__PersonPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonPredicateAccess().getGroup()); 

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
    // $ANTLR end "rulePersonPredicate"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:403:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleEInt EOF )
            // InternalDsl.g:405:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:412:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__EInt__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__EInt__Group__0 )
            // InternalDsl.g:419:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleOperator"
    // InternalDsl.g:428:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:432:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalDsl.g:433:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalDsl.g:433:2: ( ( rule__Operator__Alternatives ) )
            // InternalDsl.g:434:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalDsl.g:435:3: ( rule__Operator__Alternatives )
            // InternalDsl.g:435:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleActivity"
    // InternalDsl.g:444:1: ruleActivity : ( ( rule__Activity__Alternatives ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:448:1: ( ( ( rule__Activity__Alternatives ) ) )
            // InternalDsl.g:449:2: ( ( rule__Activity__Alternatives ) )
            {
            // InternalDsl.g:449:2: ( ( rule__Activity__Alternatives ) )
            // InternalDsl.g:450:3: ( rule__Activity__Alternatives )
            {
             before(grammarAccess.getActivityAccess().getAlternatives()); 
            // InternalDsl.g:451:3: ( rule__Activity__Alternatives )
            // InternalDsl.g:451:4: rule__Activity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives()); 

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


    // $ANTLR start "rulePrecision"
    // InternalDsl.g:460:1: rulePrecision : ( ( rule__Precision__Alternatives ) ) ;
    public final void rulePrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:464:1: ( ( ( rule__Precision__Alternatives ) ) )
            // InternalDsl.g:465:2: ( ( rule__Precision__Alternatives ) )
            {
            // InternalDsl.g:465:2: ( ( rule__Precision__Alternatives ) )
            // InternalDsl.g:466:3: ( rule__Precision__Alternatives )
            {
             before(grammarAccess.getPrecisionAccess().getAlternatives()); 
            // InternalDsl.g:467:3: ( rule__Precision__Alternatives )
            // InternalDsl.g:467:4: rule__Precision__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Precision__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrecisionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrecision"


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalDsl.g:475:1: rule__Sensor__Alternatives : ( ( ruleAnalogSensor ) | ( ruleDigitalSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:479:1: ( ( ruleAnalogSensor ) | ( ruleDigitalSensor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:480:2: ( ruleAnalogSensor )
                    {
                    // InternalDsl.g:480:2: ( ruleAnalogSensor )
                    // InternalDsl.g:481:3: ruleAnalogSensor
                    {
                     before(grammarAccess.getSensorAccess().getAnalogSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAnalogSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getAnalogSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:486:2: ( ruleDigitalSensor )
                    {
                    // InternalDsl.g:486:2: ( ruleDigitalSensor )
                    // InternalDsl.g:487:3: ruleDigitalSensor
                    {
                     before(grammarAccess.getSensorAccess().getDigitalSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDigitalSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getDigitalSensorParserRuleCall_1()); 

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
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__Predicate__Alternatives"
    // InternalDsl.g:496:1: rule__Predicate__Alternatives : ( ( ruleSensorPredicate ) | ( rulePersonPredicate ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:500:1: ( ( ruleSensorPredicate ) | ( rulePersonPredicate ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==43) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=15 && LA2_1<=17)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=15 && LA2_2<=17)) ) {
                    alt2=1;
                }
                else if ( (LA2_2==43) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:501:2: ( ruleSensorPredicate )
                    {
                    // InternalDsl.g:501:2: ( ruleSensorPredicate )
                    // InternalDsl.g:502:3: ruleSensorPredicate
                    {
                     before(grammarAccess.getPredicateAccess().getSensorPredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorPredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getSensorPredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:507:2: ( rulePersonPredicate )
                    {
                    // InternalDsl.g:507:2: ( rulePersonPredicate )
                    // InternalDsl.g:508:3: rulePersonPredicate
                    {
                     before(grammarAccess.getPredicateAccess().getPersonPredicateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePersonPredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getPersonPredicateParserRuleCall_1()); 

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
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:517:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:521:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:522:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:522:2: ( RULE_STRING )
                    // InternalDsl.g:523:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:528:2: ( RULE_ID )
                    {
                    // InternalDsl.g:528:2: ( RULE_ID )
                    // InternalDsl.g:529:3: RULE_ID
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


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalDsl.g:538:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:542:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:543:2: ( 'E' )
                    {
                    // InternalDsl.g:543:2: ( 'E' )
                    // InternalDsl.g:544:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:549:2: ( 'e' )
                    {
                    // InternalDsl.g:549:2: ( 'e' )
                    // InternalDsl.g:550:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Rule__Alternatives_3_0"
    // InternalDsl.g:559:1: rule__Rule__Alternatives_3_0 : ( ( 'for' ) | ( 'since' ) );
    public final void rule__Rule__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:563:1: ( ( 'for' ) | ( 'since' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:564:2: ( 'for' )
                    {
                    // InternalDsl.g:564:2: ( 'for' )
                    // InternalDsl.g:565:3: 'for'
                    {
                     before(grammarAccess.getRuleAccess().getForKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getForKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:570:2: ( 'since' )
                    {
                    // InternalDsl.g:570:2: ( 'since' )
                    // InternalDsl.g:571:3: 'since'
                    {
                     before(grammarAccess.getRuleAccess().getSinceKeyword_3_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getSinceKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Rule__Alternatives_3_0"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalDsl.g:580:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:584:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:585:2: ( ( '>' ) )
                    {
                    // InternalDsl.g:585:2: ( ( '>' ) )
                    // InternalDsl.g:586:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:587:3: ( '>' )
                    // InternalDsl.g:587:4: '>'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:591:2: ( ( '<' ) )
                    {
                    // InternalDsl.g:591:2: ( ( '<' ) )
                    // InternalDsl.g:592:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:593:3: ( '<' )
                    // InternalDsl.g:593:4: '<'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:597:2: ( ( '=' ) )
                    {
                    // InternalDsl.g:597:2: ( ( '=' ) )
                    // InternalDsl.g:598:3: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:599:3: ( '=' )
                    // InternalDsl.g:599:4: '='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Activity__Alternatives"
    // InternalDsl.g:607:1: rule__Activity__Alternatives : ( ( ( 'standing' ) ) | ( ( 'laying' ) ) | ( ( 'sitting' ) ) );
    public final void rule__Activity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:611:1: ( ( ( 'standing' ) ) | ( ( 'laying' ) ) | ( ( 'sitting' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:612:2: ( ( 'standing' ) )
                    {
                    // InternalDsl.g:612:2: ( ( 'standing' ) )
                    // InternalDsl.g:613:3: ( 'standing' )
                    {
                     before(grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:614:3: ( 'standing' )
                    // InternalDsl.g:614:4: 'standing'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:618:2: ( ( 'laying' ) )
                    {
                    // InternalDsl.g:618:2: ( ( 'laying' ) )
                    // InternalDsl.g:619:3: ( 'laying' )
                    {
                     before(grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:620:3: ( 'laying' )
                    // InternalDsl.g:620:4: 'laying'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:624:2: ( ( 'sitting' ) )
                    {
                    // InternalDsl.g:624:2: ( ( 'sitting' ) )
                    // InternalDsl.g:625:3: ( 'sitting' )
                    {
                     before(grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:626:3: ( 'sitting' )
                    // InternalDsl.g:626:4: 'sitting'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Activity__Alternatives"


    // $ANTLR start "rule__Precision__Alternatives"
    // InternalDsl.g:634:1: rule__Precision__Alternatives : ( ( ( 'millis' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) );
    public final void rule__Precision__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:638:1: ( ( ( 'millis' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:639:2: ( ( 'millis' ) )
                    {
                    // InternalDsl.g:639:2: ( ( 'millis' ) )
                    // InternalDsl.g:640:3: ( 'millis' )
                    {
                     before(grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:641:3: ( 'millis' )
                    // InternalDsl.g:641:4: 'millis'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:645:2: ( ( 'seconds' ) )
                    {
                    // InternalDsl.g:645:2: ( ( 'seconds' ) )
                    // InternalDsl.g:646:3: ( 'seconds' )
                    {
                     before(grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:647:3: ( 'seconds' )
                    // InternalDsl.g:647:4: 'seconds'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:651:2: ( ( 'minutes' ) )
                    {
                    // InternalDsl.g:651:2: ( ( 'minutes' ) )
                    // InternalDsl.g:652:3: ( 'minutes' )
                    {
                     before(grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:653:3: ( 'minutes' )
                    // InternalDsl.g:653:4: 'minutes'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Precision__Alternatives"


    // $ANTLR start "rule__Home__Group__0"
    // InternalDsl.g:661:1: rule__Home__Group__0 : rule__Home__Group__0__Impl rule__Home__Group__1 ;
    public final void rule__Home__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:665:1: ( rule__Home__Group__0__Impl rule__Home__Group__1 )
            // InternalDsl.g:666:2: rule__Home__Group__0__Impl rule__Home__Group__1
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
    // InternalDsl.g:673:1: rule__Home__Group__0__Impl : ( () ) ;
    public final void rule__Home__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:677:1: ( ( () ) )
            // InternalDsl.g:678:1: ( () )
            {
            // InternalDsl.g:678:1: ( () )
            // InternalDsl.g:679:2: ()
            {
             before(grammarAccess.getHomeAccess().getHomeAction_0()); 
            // InternalDsl.g:680:2: ()
            // InternalDsl.g:680:3: 
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
    // InternalDsl.g:688:1: rule__Home__Group__1 : rule__Home__Group__1__Impl rule__Home__Group__2 ;
    public final void rule__Home__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:692:1: ( rule__Home__Group__1__Impl rule__Home__Group__2 )
            // InternalDsl.g:693:2: rule__Home__Group__1__Impl rule__Home__Group__2
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
    // InternalDsl.g:700:1: rule__Home__Group__1__Impl : ( ( rule__Home__Group_1__0 ) ) ;
    public final void rule__Home__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:704:1: ( ( ( rule__Home__Group_1__0 ) ) )
            // InternalDsl.g:705:1: ( ( rule__Home__Group_1__0 ) )
            {
            // InternalDsl.g:705:1: ( ( rule__Home__Group_1__0 ) )
            // InternalDsl.g:706:2: ( rule__Home__Group_1__0 )
            {
             before(grammarAccess.getHomeAccess().getGroup_1()); 
            // InternalDsl.g:707:2: ( rule__Home__Group_1__0 )
            // InternalDsl.g:707:3: rule__Home__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getGroup_1()); 

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
    // InternalDsl.g:715:1: rule__Home__Group__2 : rule__Home__Group__2__Impl rule__Home__Group__3 ;
    public final void rule__Home__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:719:1: ( rule__Home__Group__2__Impl rule__Home__Group__3 )
            // InternalDsl.g:720:2: rule__Home__Group__2__Impl rule__Home__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:727:1: rule__Home__Group__2__Impl : ( ( rule__Home__Group_2__0 )? ) ;
    public final void rule__Home__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:731:1: ( ( ( rule__Home__Group_2__0 )? ) )
            // InternalDsl.g:732:1: ( ( rule__Home__Group_2__0 )? )
            {
            // InternalDsl.g:732:1: ( ( rule__Home__Group_2__0 )? )
            // InternalDsl.g:733:2: ( rule__Home__Group_2__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_2()); 
            // InternalDsl.g:734:2: ( rule__Home__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:734:3: rule__Home__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_2()); 

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
    // InternalDsl.g:742:1: rule__Home__Group__3 : rule__Home__Group__3__Impl rule__Home__Group__4 ;
    public final void rule__Home__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:746:1: ( rule__Home__Group__3__Impl rule__Home__Group__4 )
            // InternalDsl.g:747:2: rule__Home__Group__3__Impl rule__Home__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:754:1: rule__Home__Group__3__Impl : ( ( rule__Home__Group_3__0 )? ) ;
    public final void rule__Home__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:758:1: ( ( ( rule__Home__Group_3__0 )? ) )
            // InternalDsl.g:759:1: ( ( rule__Home__Group_3__0 )? )
            {
            // InternalDsl.g:759:1: ( ( rule__Home__Group_3__0 )? )
            // InternalDsl.g:760:2: ( rule__Home__Group_3__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_3()); 
            // InternalDsl.g:761:2: ( rule__Home__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:761:3: rule__Home__Group_3__0
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
    // InternalDsl.g:769:1: rule__Home__Group__4 : rule__Home__Group__4__Impl rule__Home__Group__5 ;
    public final void rule__Home__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:773:1: ( rule__Home__Group__4__Impl rule__Home__Group__5 )
            // InternalDsl.g:774:2: rule__Home__Group__4__Impl rule__Home__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:781:1: rule__Home__Group__4__Impl : ( ( rule__Home__Group_4__0 )? ) ;
    public final void rule__Home__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:785:1: ( ( ( rule__Home__Group_4__0 )? ) )
            // InternalDsl.g:786:1: ( ( rule__Home__Group_4__0 )? )
            {
            // InternalDsl.g:786:1: ( ( rule__Home__Group_4__0 )? )
            // InternalDsl.g:787:2: ( rule__Home__Group_4__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_4()); 
            // InternalDsl.g:788:2: ( rule__Home__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:788:3: rule__Home__Group_4__0
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
    // InternalDsl.g:796:1: rule__Home__Group__5 : rule__Home__Group__5__Impl rule__Home__Group__6 ;
    public final void rule__Home__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:800:1: ( rule__Home__Group__5__Impl rule__Home__Group__6 )
            // InternalDsl.g:801:2: rule__Home__Group__5__Impl rule__Home__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__6();

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
    // InternalDsl.g:808:1: rule__Home__Group__5__Impl : ( ( rule__Home__Group_5__0 )? ) ;
    public final void rule__Home__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:812:1: ( ( ( rule__Home__Group_5__0 )? ) )
            // InternalDsl.g:813:1: ( ( rule__Home__Group_5__0 )? )
            {
            // InternalDsl.g:813:1: ( ( rule__Home__Group_5__0 )? )
            // InternalDsl.g:814:2: ( rule__Home__Group_5__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_5()); 
            // InternalDsl.g:815:2: ( rule__Home__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:815:3: rule__Home__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_5()); 

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


    // $ANTLR start "rule__Home__Group__6"
    // InternalDsl.g:823:1: rule__Home__Group__6 : rule__Home__Group__6__Impl ;
    public final void rule__Home__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:827:1: ( rule__Home__Group__6__Impl )
            // InternalDsl.g:828:2: rule__Home__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__6__Impl();

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
    // $ANTLR end "rule__Home__Group__6"


    // $ANTLR start "rule__Home__Group__6__Impl"
    // InternalDsl.g:834:1: rule__Home__Group__6__Impl : ( 'start' ) ;
    public final void rule__Home__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:838:1: ( ( 'start' ) )
            // InternalDsl.g:839:1: ( 'start' )
            {
            // InternalDsl.g:839:1: ( 'start' )
            // InternalDsl.g:840:2: 'start'
            {
             before(grammarAccess.getHomeAccess().getStartKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getStartKeyword_6()); 

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
    // $ANTLR end "rule__Home__Group__6__Impl"


    // $ANTLR start "rule__Home__Group_1__0"
    // InternalDsl.g:850:1: rule__Home__Group_1__0 : rule__Home__Group_1__0__Impl rule__Home__Group_1__1 ;
    public final void rule__Home__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:854:1: ( rule__Home__Group_1__0__Impl rule__Home__Group_1__1 )
            // InternalDsl.g:855:2: rule__Home__Group_1__0__Impl rule__Home__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_1__1();

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
    // $ANTLR end "rule__Home__Group_1__0"


    // $ANTLR start "rule__Home__Group_1__0__Impl"
    // InternalDsl.g:862:1: rule__Home__Group_1__0__Impl : ( 'eventFile' ) ;
    public final void rule__Home__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:1: ( ( 'eventFile' ) )
            // InternalDsl.g:867:1: ( 'eventFile' )
            {
            // InternalDsl.g:867:1: ( 'eventFile' )
            // InternalDsl.g:868:2: 'eventFile'
            {
             before(grammarAccess.getHomeAccess().getEventFileKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getEventFileKeyword_1_0()); 

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
    // $ANTLR end "rule__Home__Group_1__0__Impl"


    // $ANTLR start "rule__Home__Group_1__1"
    // InternalDsl.g:877:1: rule__Home__Group_1__1 : rule__Home__Group_1__1__Impl ;
    public final void rule__Home__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:881:1: ( rule__Home__Group_1__1__Impl )
            // InternalDsl.g:882:2: rule__Home__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_1__1__Impl();

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
    // $ANTLR end "rule__Home__Group_1__1"


    // $ANTLR start "rule__Home__Group_1__1__Impl"
    // InternalDsl.g:888:1: rule__Home__Group_1__1__Impl : ( ( rule__Home__FileEventsAssignment_1_1 ) ) ;
    public final void rule__Home__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:892:1: ( ( ( rule__Home__FileEventsAssignment_1_1 ) ) )
            // InternalDsl.g:893:1: ( ( rule__Home__FileEventsAssignment_1_1 ) )
            {
            // InternalDsl.g:893:1: ( ( rule__Home__FileEventsAssignment_1_1 ) )
            // InternalDsl.g:894:2: ( rule__Home__FileEventsAssignment_1_1 )
            {
             before(grammarAccess.getHomeAccess().getFileEventsAssignment_1_1()); 
            // InternalDsl.g:895:2: ( rule__Home__FileEventsAssignment_1_1 )
            // InternalDsl.g:895:3: rule__Home__FileEventsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__FileEventsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getFileEventsAssignment_1_1()); 

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
    // $ANTLR end "rule__Home__Group_1__1__Impl"


    // $ANTLR start "rule__Home__Group_2__0"
    // InternalDsl.g:904:1: rule__Home__Group_2__0 : rule__Home__Group_2__0__Impl rule__Home__Group_2__1 ;
    public final void rule__Home__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:908:1: ( rule__Home__Group_2__0__Impl rule__Home__Group_2__1 )
            // InternalDsl.g:909:2: rule__Home__Group_2__0__Impl rule__Home__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_2__1();

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
    // $ANTLR end "rule__Home__Group_2__0"


    // $ANTLR start "rule__Home__Group_2__0__Impl"
    // InternalDsl.g:916:1: rule__Home__Group_2__0__Impl : ( 'rooms' ) ;
    public final void rule__Home__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:920:1: ( ( 'rooms' ) )
            // InternalDsl.g:921:1: ( 'rooms' )
            {
            // InternalDsl.g:921:1: ( 'rooms' )
            // InternalDsl.g:922:2: 'rooms'
            {
             before(grammarAccess.getHomeAccess().getRoomsKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRoomsKeyword_2_0()); 

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
    // $ANTLR end "rule__Home__Group_2__0__Impl"


    // $ANTLR start "rule__Home__Group_2__1"
    // InternalDsl.g:931:1: rule__Home__Group_2__1 : rule__Home__Group_2__1__Impl rule__Home__Group_2__2 ;
    public final void rule__Home__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:935:1: ( rule__Home__Group_2__1__Impl rule__Home__Group_2__2 )
            // InternalDsl.g:936:2: rule__Home__Group_2__1__Impl rule__Home__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Home__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_2__2();

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
    // $ANTLR end "rule__Home__Group_2__1"


    // $ANTLR start "rule__Home__Group_2__1__Impl"
    // InternalDsl.g:943:1: rule__Home__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:947:1: ( ( '{' ) )
            // InternalDsl.g:948:1: ( '{' )
            {
            // InternalDsl.g:948:1: ( '{' )
            // InternalDsl.g:949:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__Home__Group_2__1__Impl"


    // $ANTLR start "rule__Home__Group_2__2"
    // InternalDsl.g:958:1: rule__Home__Group_2__2 : rule__Home__Group_2__2__Impl rule__Home__Group_2__3 ;
    public final void rule__Home__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:962:1: ( rule__Home__Group_2__2__Impl rule__Home__Group_2__3 )
            // InternalDsl.g:963:2: rule__Home__Group_2__2__Impl rule__Home__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__Home__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_2__3();

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
    // $ANTLR end "rule__Home__Group_2__2"


    // $ANTLR start "rule__Home__Group_2__2__Impl"
    // InternalDsl.g:970:1: rule__Home__Group_2__2__Impl : ( ( rule__Home__RoomsAssignment_2_2 ) ) ;
    public final void rule__Home__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:974:1: ( ( ( rule__Home__RoomsAssignment_2_2 ) ) )
            // InternalDsl.g:975:1: ( ( rule__Home__RoomsAssignment_2_2 ) )
            {
            // InternalDsl.g:975:1: ( ( rule__Home__RoomsAssignment_2_2 ) )
            // InternalDsl.g:976:2: ( rule__Home__RoomsAssignment_2_2 )
            {
             before(grammarAccess.getHomeAccess().getRoomsAssignment_2_2()); 
            // InternalDsl.g:977:2: ( rule__Home__RoomsAssignment_2_2 )
            // InternalDsl.g:977:3: rule__Home__RoomsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__RoomsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getRoomsAssignment_2_2()); 

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
    // $ANTLR end "rule__Home__Group_2__2__Impl"


    // $ANTLR start "rule__Home__Group_2__3"
    // InternalDsl.g:985:1: rule__Home__Group_2__3 : rule__Home__Group_2__3__Impl rule__Home__Group_2__4 ;
    public final void rule__Home__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:989:1: ( rule__Home__Group_2__3__Impl rule__Home__Group_2__4 )
            // InternalDsl.g:990:2: rule__Home__Group_2__3__Impl rule__Home__Group_2__4
            {
            pushFollow(FOLLOW_8);
            rule__Home__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_2__4();

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
    // $ANTLR end "rule__Home__Group_2__3"


    // $ANTLR start "rule__Home__Group_2__3__Impl"
    // InternalDsl.g:997:1: rule__Home__Group_2__3__Impl : ( ( rule__Home__Group_2_3__0 )* ) ;
    public final void rule__Home__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1001:1: ( ( ( rule__Home__Group_2_3__0 )* ) )
            // InternalDsl.g:1002:1: ( ( rule__Home__Group_2_3__0 )* )
            {
            // InternalDsl.g:1002:1: ( ( rule__Home__Group_2_3__0 )* )
            // InternalDsl.g:1003:2: ( rule__Home__Group_2_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_2_3()); 
            // InternalDsl.g:1004:2: ( rule__Home__Group_2_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1004:3: rule__Home__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Home__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Home__Group_2__3__Impl"


    // $ANTLR start "rule__Home__Group_2__4"
    // InternalDsl.g:1012:1: rule__Home__Group_2__4 : rule__Home__Group_2__4__Impl ;
    public final void rule__Home__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1016:1: ( rule__Home__Group_2__4__Impl )
            // InternalDsl.g:1017:2: rule__Home__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_2__4__Impl();

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
    // $ANTLR end "rule__Home__Group_2__4"


    // $ANTLR start "rule__Home__Group_2__4__Impl"
    // InternalDsl.g:1023:1: rule__Home__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1027:1: ( ( '}' ) )
            // InternalDsl.g:1028:1: ( '}' )
            {
            // InternalDsl.g:1028:1: ( '}' )
            // InternalDsl.g:1029:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_2_4()); 

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
    // $ANTLR end "rule__Home__Group_2__4__Impl"


    // $ANTLR start "rule__Home__Group_2_3__0"
    // InternalDsl.g:1039:1: rule__Home__Group_2_3__0 : rule__Home__Group_2_3__0__Impl rule__Home__Group_2_3__1 ;
    public final void rule__Home__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1043:1: ( rule__Home__Group_2_3__0__Impl rule__Home__Group_2_3__1 )
            // InternalDsl.g:1044:2: rule__Home__Group_2_3__0__Impl rule__Home__Group_2_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Home__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_2_3__1();

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
    // $ANTLR end "rule__Home__Group_2_3__0"


    // $ANTLR start "rule__Home__Group_2_3__0__Impl"
    // InternalDsl.g:1051:1: rule__Home__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1055:1: ( ( ',' ) )
            // InternalDsl.g:1056:1: ( ',' )
            {
            // InternalDsl.g:1056:1: ( ',' )
            // InternalDsl.g:1057:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_2_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Home__Group_2_3__0__Impl"


    // $ANTLR start "rule__Home__Group_2_3__1"
    // InternalDsl.g:1066:1: rule__Home__Group_2_3__1 : rule__Home__Group_2_3__1__Impl ;
    public final void rule__Home__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1070:1: ( rule__Home__Group_2_3__1__Impl )
            // InternalDsl.g:1071:2: rule__Home__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Home__Group_2_3__1"


    // $ANTLR start "rule__Home__Group_2_3__1__Impl"
    // InternalDsl.g:1077:1: rule__Home__Group_2_3__1__Impl : ( ( rule__Home__RoomsAssignment_2_3_1 ) ) ;
    public final void rule__Home__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1081:1: ( ( ( rule__Home__RoomsAssignment_2_3_1 ) ) )
            // InternalDsl.g:1082:1: ( ( rule__Home__RoomsAssignment_2_3_1 ) )
            {
            // InternalDsl.g:1082:1: ( ( rule__Home__RoomsAssignment_2_3_1 ) )
            // InternalDsl.g:1083:2: ( rule__Home__RoomsAssignment_2_3_1 )
            {
             before(grammarAccess.getHomeAccess().getRoomsAssignment_2_3_1()); 
            // InternalDsl.g:1084:2: ( rule__Home__RoomsAssignment_2_3_1 )
            // InternalDsl.g:1084:3: rule__Home__RoomsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__RoomsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getRoomsAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Home__Group_2_3__1__Impl"


    // $ANTLR start "rule__Home__Group_3__0"
    // InternalDsl.g:1093:1: rule__Home__Group_3__0 : rule__Home__Group_3__0__Impl rule__Home__Group_3__1 ;
    public final void rule__Home__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1097:1: ( rule__Home__Group_3__0__Impl rule__Home__Group_3__1 )
            // InternalDsl.g:1098:2: rule__Home__Group_3__0__Impl rule__Home__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1105:1: rule__Home__Group_3__0__Impl : ( 'persons' ) ;
    public final void rule__Home__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1109:1: ( ( 'persons' ) )
            // InternalDsl.g:1110:1: ( 'persons' )
            {
            // InternalDsl.g:1110:1: ( 'persons' )
            // InternalDsl.g:1111:2: 'persons'
            {
             before(grammarAccess.getHomeAccess().getPersonsKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getPersonsKeyword_3_0()); 

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
    // InternalDsl.g:1120:1: rule__Home__Group_3__1 : rule__Home__Group_3__1__Impl rule__Home__Group_3__2 ;
    public final void rule__Home__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1124:1: ( rule__Home__Group_3__1__Impl rule__Home__Group_3__2 )
            // InternalDsl.g:1125:2: rule__Home__Group_3__1__Impl rule__Home__Group_3__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1132:1: rule__Home__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1136:1: ( ( '{' ) )
            // InternalDsl.g:1137:1: ( '{' )
            {
            // InternalDsl.g:1137:1: ( '{' )
            // InternalDsl.g:1138:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1147:1: rule__Home__Group_3__2 : rule__Home__Group_3__2__Impl rule__Home__Group_3__3 ;
    public final void rule__Home__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1151:1: ( rule__Home__Group_3__2__Impl rule__Home__Group_3__3 )
            // InternalDsl.g:1152:2: rule__Home__Group_3__2__Impl rule__Home__Group_3__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1159:1: rule__Home__Group_3__2__Impl : ( ( rule__Home__PersonsAssignment_3_2 ) ) ;
    public final void rule__Home__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1163:1: ( ( ( rule__Home__PersonsAssignment_3_2 ) ) )
            // InternalDsl.g:1164:1: ( ( rule__Home__PersonsAssignment_3_2 ) )
            {
            // InternalDsl.g:1164:1: ( ( rule__Home__PersonsAssignment_3_2 ) )
            // InternalDsl.g:1165:2: ( rule__Home__PersonsAssignment_3_2 )
            {
             before(grammarAccess.getHomeAccess().getPersonsAssignment_3_2()); 
            // InternalDsl.g:1166:2: ( rule__Home__PersonsAssignment_3_2 )
            // InternalDsl.g:1166:3: rule__Home__PersonsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__PersonsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getPersonsAssignment_3_2()); 

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
    // InternalDsl.g:1174:1: rule__Home__Group_3__3 : rule__Home__Group_3__3__Impl rule__Home__Group_3__4 ;
    public final void rule__Home__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1178:1: ( rule__Home__Group_3__3__Impl rule__Home__Group_3__4 )
            // InternalDsl.g:1179:2: rule__Home__Group_3__3__Impl rule__Home__Group_3__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1186:1: rule__Home__Group_3__3__Impl : ( ( rule__Home__Group_3_3__0 )* ) ;
    public final void rule__Home__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1190:1: ( ( ( rule__Home__Group_3_3__0 )* ) )
            // InternalDsl.g:1191:1: ( ( rule__Home__Group_3_3__0 )* )
            {
            // InternalDsl.g:1191:1: ( ( rule__Home__Group_3_3__0 )* )
            // InternalDsl.g:1192:2: ( rule__Home__Group_3_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_3_3()); 
            // InternalDsl.g:1193:2: ( rule__Home__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1193:3: rule__Home__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Home__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDsl.g:1201:1: rule__Home__Group_3__4 : rule__Home__Group_3__4__Impl ;
    public final void rule__Home__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1205:1: ( rule__Home__Group_3__4__Impl )
            // InternalDsl.g:1206:2: rule__Home__Group_3__4__Impl
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
    // InternalDsl.g:1212:1: rule__Home__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1216:1: ( ( '}' ) )
            // InternalDsl.g:1217:1: ( '}' )
            {
            // InternalDsl.g:1217:1: ( '}' )
            // InternalDsl.g:1218:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:1228:1: rule__Home__Group_3_3__0 : rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1 ;
    public final void rule__Home__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1232:1: ( rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1 )
            // InternalDsl.g:1233:2: rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1240:1: rule__Home__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1244:1: ( ( ',' ) )
            // InternalDsl.g:1245:1: ( ',' )
            {
            // InternalDsl.g:1245:1: ( ',' )
            // InternalDsl.g:1246:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_3_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDsl.g:1255:1: rule__Home__Group_3_3__1 : rule__Home__Group_3_3__1__Impl ;
    public final void rule__Home__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1259:1: ( rule__Home__Group_3_3__1__Impl )
            // InternalDsl.g:1260:2: rule__Home__Group_3_3__1__Impl
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
    // InternalDsl.g:1266:1: rule__Home__Group_3_3__1__Impl : ( ( rule__Home__PersonsAssignment_3_3_1 ) ) ;
    public final void rule__Home__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1270:1: ( ( ( rule__Home__PersonsAssignment_3_3_1 ) ) )
            // InternalDsl.g:1271:1: ( ( rule__Home__PersonsAssignment_3_3_1 ) )
            {
            // InternalDsl.g:1271:1: ( ( rule__Home__PersonsAssignment_3_3_1 ) )
            // InternalDsl.g:1272:2: ( rule__Home__PersonsAssignment_3_3_1 )
            {
             before(grammarAccess.getHomeAccess().getPersonsAssignment_3_3_1()); 
            // InternalDsl.g:1273:2: ( rule__Home__PersonsAssignment_3_3_1 )
            // InternalDsl.g:1273:3: rule__Home__PersonsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__PersonsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getPersonsAssignment_3_3_1()); 

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
    // InternalDsl.g:1282:1: rule__Home__Group_4__0 : rule__Home__Group_4__0__Impl rule__Home__Group_4__1 ;
    public final void rule__Home__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1286:1: ( rule__Home__Group_4__0__Impl rule__Home__Group_4__1 )
            // InternalDsl.g:1287:2: rule__Home__Group_4__0__Impl rule__Home__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1294:1: rule__Home__Group_4__0__Impl : ( 'patterns' ) ;
    public final void rule__Home__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1298:1: ( ( 'patterns' ) )
            // InternalDsl.g:1299:1: ( 'patterns' )
            {
            // InternalDsl.g:1299:1: ( 'patterns' )
            // InternalDsl.g:1300:2: 'patterns'
            {
             before(grammarAccess.getHomeAccess().getPatternsKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getPatternsKeyword_4_0()); 

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
    // InternalDsl.g:1309:1: rule__Home__Group_4__1 : rule__Home__Group_4__1__Impl rule__Home__Group_4__2 ;
    public final void rule__Home__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1313:1: ( rule__Home__Group_4__1__Impl rule__Home__Group_4__2 )
            // InternalDsl.g:1314:2: rule__Home__Group_4__1__Impl rule__Home__Group_4__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1321:1: rule__Home__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1325:1: ( ( '{' ) )
            // InternalDsl.g:1326:1: ( '{' )
            {
            // InternalDsl.g:1326:1: ( '{' )
            // InternalDsl.g:1327:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1336:1: rule__Home__Group_4__2 : rule__Home__Group_4__2__Impl rule__Home__Group_4__3 ;
    public final void rule__Home__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1340:1: ( rule__Home__Group_4__2__Impl rule__Home__Group_4__3 )
            // InternalDsl.g:1341:2: rule__Home__Group_4__2__Impl rule__Home__Group_4__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1348:1: rule__Home__Group_4__2__Impl : ( ( rule__Home__PatternsAssignment_4_2 ) ) ;
    public final void rule__Home__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1352:1: ( ( ( rule__Home__PatternsAssignment_4_2 ) ) )
            // InternalDsl.g:1353:1: ( ( rule__Home__PatternsAssignment_4_2 ) )
            {
            // InternalDsl.g:1353:1: ( ( rule__Home__PatternsAssignment_4_2 ) )
            // InternalDsl.g:1354:2: ( rule__Home__PatternsAssignment_4_2 )
            {
             before(grammarAccess.getHomeAccess().getPatternsAssignment_4_2()); 
            // InternalDsl.g:1355:2: ( rule__Home__PatternsAssignment_4_2 )
            // InternalDsl.g:1355:3: rule__Home__PatternsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__PatternsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getPatternsAssignment_4_2()); 

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
    // InternalDsl.g:1363:1: rule__Home__Group_4__3 : rule__Home__Group_4__3__Impl rule__Home__Group_4__4 ;
    public final void rule__Home__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1367:1: ( rule__Home__Group_4__3__Impl rule__Home__Group_4__4 )
            // InternalDsl.g:1368:2: rule__Home__Group_4__3__Impl rule__Home__Group_4__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:1375:1: rule__Home__Group_4__3__Impl : ( ( rule__Home__Group_4_3__0 )* ) ;
    public final void rule__Home__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1379:1: ( ( ( rule__Home__Group_4_3__0 )* ) )
            // InternalDsl.g:1380:1: ( ( rule__Home__Group_4_3__0 )* )
            {
            // InternalDsl.g:1380:1: ( ( rule__Home__Group_4_3__0 )* )
            // InternalDsl.g:1381:2: ( rule__Home__Group_4_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_4_3()); 
            // InternalDsl.g:1382:2: ( rule__Home__Group_4_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1382:3: rule__Home__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Home__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDsl.g:1390:1: rule__Home__Group_4__4 : rule__Home__Group_4__4__Impl ;
    public final void rule__Home__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1394:1: ( rule__Home__Group_4__4__Impl )
            // InternalDsl.g:1395:2: rule__Home__Group_4__4__Impl
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
    // InternalDsl.g:1401:1: rule__Home__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1405:1: ( ( '}' ) )
            // InternalDsl.g:1406:1: ( '}' )
            {
            // InternalDsl.g:1406:1: ( '}' )
            // InternalDsl.g:1407:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:1417:1: rule__Home__Group_4_3__0 : rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1 ;
    public final void rule__Home__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1421:1: ( rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1 )
            // InternalDsl.g:1422:2: rule__Home__Group_4_3__0__Impl rule__Home__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1429:1: rule__Home__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1433:1: ( ( ',' ) )
            // InternalDsl.g:1434:1: ( ',' )
            {
            // InternalDsl.g:1434:1: ( ',' )
            // InternalDsl.g:1435:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_4_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDsl.g:1444:1: rule__Home__Group_4_3__1 : rule__Home__Group_4_3__1__Impl ;
    public final void rule__Home__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1448:1: ( rule__Home__Group_4_3__1__Impl )
            // InternalDsl.g:1449:2: rule__Home__Group_4_3__1__Impl
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
    // InternalDsl.g:1455:1: rule__Home__Group_4_3__1__Impl : ( ( rule__Home__PatternsAssignment_4_3_1 ) ) ;
    public final void rule__Home__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1459:1: ( ( ( rule__Home__PatternsAssignment_4_3_1 ) ) )
            // InternalDsl.g:1460:1: ( ( rule__Home__PatternsAssignment_4_3_1 ) )
            {
            // InternalDsl.g:1460:1: ( ( rule__Home__PatternsAssignment_4_3_1 ) )
            // InternalDsl.g:1461:2: ( rule__Home__PatternsAssignment_4_3_1 )
            {
             before(grammarAccess.getHomeAccess().getPatternsAssignment_4_3_1()); 
            // InternalDsl.g:1462:2: ( rule__Home__PatternsAssignment_4_3_1 )
            // InternalDsl.g:1462:3: rule__Home__PatternsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__PatternsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getPatternsAssignment_4_3_1()); 

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


    // $ANTLR start "rule__Home__Group_5__0"
    // InternalDsl.g:1471:1: rule__Home__Group_5__0 : rule__Home__Group_5__0__Impl rule__Home__Group_5__1 ;
    public final void rule__Home__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1475:1: ( rule__Home__Group_5__0__Impl rule__Home__Group_5__1 )
            // InternalDsl.g:1476:2: rule__Home__Group_5__0__Impl rule__Home__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_5__1();

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
    // $ANTLR end "rule__Home__Group_5__0"


    // $ANTLR start "rule__Home__Group_5__0__Impl"
    // InternalDsl.g:1483:1: rule__Home__Group_5__0__Impl : ( 'monitor' ) ;
    public final void rule__Home__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1487:1: ( ( 'monitor' ) )
            // InternalDsl.g:1488:1: ( 'monitor' )
            {
            // InternalDsl.g:1488:1: ( 'monitor' )
            // InternalDsl.g:1489:2: 'monitor'
            {
             before(grammarAccess.getHomeAccess().getMonitorKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getMonitorKeyword_5_0()); 

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
    // $ANTLR end "rule__Home__Group_5__0__Impl"


    // $ANTLR start "rule__Home__Group_5__1"
    // InternalDsl.g:1498:1: rule__Home__Group_5__1 : rule__Home__Group_5__1__Impl rule__Home__Group_5__2 ;
    public final void rule__Home__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1502:1: ( rule__Home__Group_5__1__Impl rule__Home__Group_5__2 )
            // InternalDsl.g:1503:2: rule__Home__Group_5__1__Impl rule__Home__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Home__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_5__2();

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
    // $ANTLR end "rule__Home__Group_5__1"


    // $ANTLR start "rule__Home__Group_5__1__Impl"
    // InternalDsl.g:1510:1: rule__Home__Group_5__1__Impl : ( ( rule__Home__MonitoredEntitiesAssignment_5_1 ) ) ;
    public final void rule__Home__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1514:1: ( ( ( rule__Home__MonitoredEntitiesAssignment_5_1 ) ) )
            // InternalDsl.g:1515:1: ( ( rule__Home__MonitoredEntitiesAssignment_5_1 ) )
            {
            // InternalDsl.g:1515:1: ( ( rule__Home__MonitoredEntitiesAssignment_5_1 ) )
            // InternalDsl.g:1516:2: ( rule__Home__MonitoredEntitiesAssignment_5_1 )
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesAssignment_5_1()); 
            // InternalDsl.g:1517:2: ( rule__Home__MonitoredEntitiesAssignment_5_1 )
            // InternalDsl.g:1517:3: rule__Home__MonitoredEntitiesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__MonitoredEntitiesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesAssignment_5_1()); 

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
    // $ANTLR end "rule__Home__Group_5__1__Impl"


    // $ANTLR start "rule__Home__Group_5__2"
    // InternalDsl.g:1525:1: rule__Home__Group_5__2 : rule__Home__Group_5__2__Impl ;
    public final void rule__Home__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1529:1: ( rule__Home__Group_5__2__Impl )
            // InternalDsl.g:1530:2: rule__Home__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_5__2__Impl();

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
    // $ANTLR end "rule__Home__Group_5__2"


    // $ANTLR start "rule__Home__Group_5__2__Impl"
    // InternalDsl.g:1536:1: rule__Home__Group_5__2__Impl : ( ( rule__Home__Group_5_2__0 )* ) ;
    public final void rule__Home__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1540:1: ( ( ( rule__Home__Group_5_2__0 )* ) )
            // InternalDsl.g:1541:1: ( ( rule__Home__Group_5_2__0 )* )
            {
            // InternalDsl.g:1541:1: ( ( rule__Home__Group_5_2__0 )* )
            // InternalDsl.g:1542:2: ( rule__Home__Group_5_2__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_5_2()); 
            // InternalDsl.g:1543:2: ( rule__Home__Group_5_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1543:3: rule__Home__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Home__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__Home__Group_5__2__Impl"


    // $ANTLR start "rule__Home__Group_5_2__0"
    // InternalDsl.g:1552:1: rule__Home__Group_5_2__0 : rule__Home__Group_5_2__0__Impl rule__Home__Group_5_2__1 ;
    public final void rule__Home__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1556:1: ( rule__Home__Group_5_2__0__Impl rule__Home__Group_5_2__1 )
            // InternalDsl.g:1557:2: rule__Home__Group_5_2__0__Impl rule__Home__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_5_2__1();

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
    // $ANTLR end "rule__Home__Group_5_2__0"


    // $ANTLR start "rule__Home__Group_5_2__0__Impl"
    // InternalDsl.g:1564:1: rule__Home__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1568:1: ( ( ',' ) )
            // InternalDsl.g:1569:1: ( ',' )
            {
            // InternalDsl.g:1569:1: ( ',' )
            // InternalDsl.g:1570:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_5_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__Home__Group_5_2__0__Impl"


    // $ANTLR start "rule__Home__Group_5_2__1"
    // InternalDsl.g:1579:1: rule__Home__Group_5_2__1 : rule__Home__Group_5_2__1__Impl ;
    public final void rule__Home__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1583:1: ( rule__Home__Group_5_2__1__Impl )
            // InternalDsl.g:1584:2: rule__Home__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__Home__Group_5_2__1"


    // $ANTLR start "rule__Home__Group_5_2__1__Impl"
    // InternalDsl.g:1590:1: rule__Home__Group_5_2__1__Impl : ( ( rule__Home__MonitoredEntitiesAssignment_5_2_1 ) ) ;
    public final void rule__Home__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1594:1: ( ( ( rule__Home__MonitoredEntitiesAssignment_5_2_1 ) ) )
            // InternalDsl.g:1595:1: ( ( rule__Home__MonitoredEntitiesAssignment_5_2_1 ) )
            {
            // InternalDsl.g:1595:1: ( ( rule__Home__MonitoredEntitiesAssignment_5_2_1 ) )
            // InternalDsl.g:1596:2: ( rule__Home__MonitoredEntitiesAssignment_5_2_1 )
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesAssignment_5_2_1()); 
            // InternalDsl.g:1597:2: ( rule__Home__MonitoredEntitiesAssignment_5_2_1 )
            // InternalDsl.g:1597:3: rule__Home__MonitoredEntitiesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__MonitoredEntitiesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesAssignment_5_2_1()); 

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
    // $ANTLR end "rule__Home__Group_5_2__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalDsl.g:1606:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1610:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalDsl.g:1611:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1618:1: rule__Room__Group__0__Impl : ( () ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1622:1: ( ( () ) )
            // InternalDsl.g:1623:1: ( () )
            {
            // InternalDsl.g:1623:1: ( () )
            // InternalDsl.g:1624:2: ()
            {
             before(grammarAccess.getRoomAccess().getRoomAction_0()); 
            // InternalDsl.g:1625:2: ()
            // InternalDsl.g:1625:3: 
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
    // InternalDsl.g:1633:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1637:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalDsl.g:1638:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDsl.g:1645:1: rule__Room__Group__1__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1649:1: ( ( 'Room' ) )
            // InternalDsl.g:1650:1: ( 'Room' )
            {
            // InternalDsl.g:1650:1: ( 'Room' )
            // InternalDsl.g:1651:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDsl.g:1660:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1664:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalDsl.g:1665:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1672:1: rule__Room__Group__2__Impl : ( ( rule__Room__NameAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1676:1: ( ( ( rule__Room__NameAssignment_2 ) ) )
            // InternalDsl.g:1677:1: ( ( rule__Room__NameAssignment_2 ) )
            {
            // InternalDsl.g:1677:1: ( ( rule__Room__NameAssignment_2 ) )
            // InternalDsl.g:1678:2: ( rule__Room__NameAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_2()); 
            // InternalDsl.g:1679:2: ( rule__Room__NameAssignment_2 )
            // InternalDsl.g:1679:3: rule__Room__NameAssignment_2
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
    // InternalDsl.g:1687:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1691:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalDsl.g:1692:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1699:1: rule__Room__Group__3__Impl : ( '{' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1703:1: ( ( '{' ) )
            // InternalDsl.g:1704:1: ( '{' )
            {
            // InternalDsl.g:1704:1: ( '{' )
            // InternalDsl.g:1705:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1714:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1718:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalDsl.g:1719:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1726:1: rule__Room__Group__4__Impl : ( ( rule__Room__Group_4__0 )? ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1730:1: ( ( ( rule__Room__Group_4__0 )? ) )
            // InternalDsl.g:1731:1: ( ( rule__Room__Group_4__0 )? )
            {
            // InternalDsl.g:1731:1: ( ( rule__Room__Group_4__0 )? )
            // InternalDsl.g:1732:2: ( rule__Room__Group_4__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_4()); 
            // InternalDsl.g:1733:2: ( rule__Room__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=36 && LA17_0<=37)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1733:3: rule__Room__Group_4__0
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
    // InternalDsl.g:1741:1: rule__Room__Group__5 : rule__Room__Group__5__Impl ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1745:1: ( rule__Room__Group__5__Impl )
            // InternalDsl.g:1746:2: rule__Room__Group__5__Impl
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
    // InternalDsl.g:1752:1: rule__Room__Group__5__Impl : ( '}' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1756:1: ( ( '}' ) )
            // InternalDsl.g:1757:1: ( '}' )
            {
            // InternalDsl.g:1757:1: ( '}' )
            // InternalDsl.g:1758:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:1768:1: rule__Room__Group_4__0 : rule__Room__Group_4__0__Impl rule__Room__Group_4__1 ;
    public final void rule__Room__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1772:1: ( rule__Room__Group_4__0__Impl rule__Room__Group_4__1 )
            // InternalDsl.g:1773:2: rule__Room__Group_4__0__Impl rule__Room__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1780:1: rule__Room__Group_4__0__Impl : ( ( rule__Room__SensorsAssignment_4_0 ) ) ;
    public final void rule__Room__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1784:1: ( ( ( rule__Room__SensorsAssignment_4_0 ) ) )
            // InternalDsl.g:1785:1: ( ( rule__Room__SensorsAssignment_4_0 ) )
            {
            // InternalDsl.g:1785:1: ( ( rule__Room__SensorsAssignment_4_0 ) )
            // InternalDsl.g:1786:2: ( rule__Room__SensorsAssignment_4_0 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_4_0()); 
            // InternalDsl.g:1787:2: ( rule__Room__SensorsAssignment_4_0 )
            // InternalDsl.g:1787:3: rule__Room__SensorsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAssignment_4_0()); 

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
    // InternalDsl.g:1795:1: rule__Room__Group_4__1 : rule__Room__Group_4__1__Impl ;
    public final void rule__Room__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1799:1: ( rule__Room__Group_4__1__Impl )
            // InternalDsl.g:1800:2: rule__Room__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_4__1__Impl();

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
    // InternalDsl.g:1806:1: rule__Room__Group_4__1__Impl : ( ( rule__Room__Group_4_1__0 )* ) ;
    public final void rule__Room__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1810:1: ( ( ( rule__Room__Group_4_1__0 )* ) )
            // InternalDsl.g:1811:1: ( ( rule__Room__Group_4_1__0 )* )
            {
            // InternalDsl.g:1811:1: ( ( rule__Room__Group_4_1__0 )* )
            // InternalDsl.g:1812:2: ( rule__Room__Group_4_1__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_4_1()); 
            // InternalDsl.g:1813:2: ( rule__Room__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1813:3: rule__Room__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Room__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_4_1()); 

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


    // $ANTLR start "rule__Room__Group_4_1__0"
    // InternalDsl.g:1822:1: rule__Room__Group_4_1__0 : rule__Room__Group_4_1__0__Impl rule__Room__Group_4_1__1 ;
    public final void rule__Room__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1826:1: ( rule__Room__Group_4_1__0__Impl rule__Room__Group_4_1__1 )
            // InternalDsl.g:1827:2: rule__Room__Group_4_1__0__Impl rule__Room__Group_4_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Room__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4_1__1();

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
    // $ANTLR end "rule__Room__Group_4_1__0"


    // $ANTLR start "rule__Room__Group_4_1__0__Impl"
    // InternalDsl.g:1834:1: rule__Room__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1838:1: ( ( ',' ) )
            // InternalDsl.g:1839:1: ( ',' )
            {
            // InternalDsl.g:1839:1: ( ',' )
            // InternalDsl.g:1840:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_4_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Room__Group_4_1__0__Impl"


    // $ANTLR start "rule__Room__Group_4_1__1"
    // InternalDsl.g:1849:1: rule__Room__Group_4_1__1 : rule__Room__Group_4_1__1__Impl ;
    public final void rule__Room__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1853:1: ( rule__Room__Group_4_1__1__Impl )
            // InternalDsl.g:1854:2: rule__Room__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Room__Group_4_1__1"


    // $ANTLR start "rule__Room__Group_4_1__1__Impl"
    // InternalDsl.g:1860:1: rule__Room__Group_4_1__1__Impl : ( ( rule__Room__SensorsAssignment_4_1_1 ) ) ;
    public final void rule__Room__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1864:1: ( ( ( rule__Room__SensorsAssignment_4_1_1 ) ) )
            // InternalDsl.g:1865:1: ( ( rule__Room__SensorsAssignment_4_1_1 ) )
            {
            // InternalDsl.g:1865:1: ( ( rule__Room__SensorsAssignment_4_1_1 ) )
            // InternalDsl.g:1866:2: ( rule__Room__SensorsAssignment_4_1_1 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_4_1_1()); 
            // InternalDsl.g:1867:2: ( rule__Room__SensorsAssignment_4_1_1 )
            // InternalDsl.g:1867:3: rule__Room__SensorsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Room__Group_4_1__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalDsl.g:1876:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1880:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalDsl.g:1881:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalDsl.g:1888:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1892:1: ( ( () ) )
            // InternalDsl.g:1893:1: ( () )
            {
            // InternalDsl.g:1893:1: ( () )
            // InternalDsl.g:1894:2: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // InternalDsl.g:1895:2: ()
            // InternalDsl.g:1895:3: 
            {
            }

             after(grammarAccess.getPersonAccess().getPersonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalDsl.g:1903:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1907:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalDsl.g:1908:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalDsl.g:1915:1: rule__Person__Group__1__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1919:1: ( ( 'Person' ) )
            // InternalDsl.g:1920:1: ( 'Person' )
            {
            // InternalDsl.g:1920:1: ( 'Person' )
            // InternalDsl.g:1921:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalDsl.g:1930:1: rule__Person__Group__2 : rule__Person__Group__2__Impl ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1934:1: ( rule__Person__Group__2__Impl )
            // InternalDsl.g:1935:2: rule__Person__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__2__Impl();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalDsl.g:1941:1: rule__Person__Group__2__Impl : ( ( rule__Person__NameAssignment_2 ) ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1945:1: ( ( ( rule__Person__NameAssignment_2 ) ) )
            // InternalDsl.g:1946:1: ( ( rule__Person__NameAssignment_2 ) )
            {
            // InternalDsl.g:1946:1: ( ( rule__Person__NameAssignment_2 ) )
            // InternalDsl.g:1947:2: ( rule__Person__NameAssignment_2 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_2()); 
            // InternalDsl.g:1948:2: ( rule__Person__NameAssignment_2 )
            // InternalDsl.g:1948:3: rule__Person__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalDsl.g:1957:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1961:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalDsl.g:1962:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

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
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalDsl.g:1969:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1973:1: ( ( () ) )
            // InternalDsl.g:1974:1: ( () )
            {
            // InternalDsl.g:1974:1: ( () )
            // InternalDsl.g:1975:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalDsl.g:1976:2: ()
            // InternalDsl.g:1976:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalDsl.g:1984:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1988:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalDsl.g:1989:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

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
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalDsl.g:1996:1: rule__Pattern__Group__1__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2000:1: ( ( 'Pattern' ) )
            // InternalDsl.g:2001:1: ( 'Pattern' )
            {
            // InternalDsl.g:2001:1: ( 'Pattern' )
            // InternalDsl.g:2002:2: 'Pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_1()); 

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
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalDsl.g:2011:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2015:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalDsl.g:2016:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

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
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalDsl.g:2023:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__NameAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2027:1: ( ( ( rule__Pattern__NameAssignment_2 ) ) )
            // InternalDsl.g:2028:1: ( ( rule__Pattern__NameAssignment_2 ) )
            {
            // InternalDsl.g:2028:1: ( ( rule__Pattern__NameAssignment_2 ) )
            // InternalDsl.g:2029:2: ( rule__Pattern__NameAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_2()); 
            // InternalDsl.g:2030:2: ( rule__Pattern__NameAssignment_2 )
            // InternalDsl.g:2030:3: rule__Pattern__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalDsl.g:2038:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2042:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalDsl.g:2043:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

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
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalDsl.g:2050:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2054:1: ( ( '{' ) )
            // InternalDsl.g:2055:1: ( '{' )
            {
            // InternalDsl.g:2055:1: ( '{' )
            // InternalDsl.g:2056:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalDsl.g:2065:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2069:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalDsl.g:2070:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Pattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

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
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalDsl.g:2077:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )? ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2081:1: ( ( ( rule__Pattern__Group_4__0 )? ) )
            // InternalDsl.g:2082:1: ( ( rule__Pattern__Group_4__0 )? )
            {
            // InternalDsl.g:2082:1: ( ( rule__Pattern__Group_4__0 )? )
            // InternalDsl.g:2083:2: ( rule__Pattern__Group_4__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalDsl.g:2084:2: ( rule__Pattern__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:2084:3: rule__Pattern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__5"
    // InternalDsl.g:2092:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2096:1: ( rule__Pattern__Group__5__Impl )
            // InternalDsl.g:2097:2: rule__Pattern__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5__Impl();

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
    // $ANTLR end "rule__Pattern__Group__5"


    // $ANTLR start "rule__Pattern__Group__5__Impl"
    // InternalDsl.g:2103:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2107:1: ( ( '}' ) )
            // InternalDsl.g:2108:1: ( '}' )
            {
            // InternalDsl.g:2108:1: ( '}' )
            // InternalDsl.g:2109:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Pattern__Group__5__Impl"


    // $ANTLR start "rule__Pattern__Group_4__0"
    // InternalDsl.g:2119:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2123:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalDsl.g:2124:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

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
    // $ANTLR end "rule__Pattern__Group_4__0"


    // $ANTLR start "rule__Pattern__Group_4__0__Impl"
    // InternalDsl.g:2131:1: rule__Pattern__Group_4__0__Impl : ( ( rule__Pattern__RulesAssignment_4_0 ) ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2135:1: ( ( ( rule__Pattern__RulesAssignment_4_0 ) ) )
            // InternalDsl.g:2136:1: ( ( rule__Pattern__RulesAssignment_4_0 ) )
            {
            // InternalDsl.g:2136:1: ( ( rule__Pattern__RulesAssignment_4_0 ) )
            // InternalDsl.g:2137:2: ( rule__Pattern__RulesAssignment_4_0 )
            {
             before(grammarAccess.getPatternAccess().getRulesAssignment_4_0()); 
            // InternalDsl.g:2138:2: ( rule__Pattern__RulesAssignment_4_0 )
            // InternalDsl.g:2138:3: rule__Pattern__RulesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RulesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRulesAssignment_4_0()); 

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
    // $ANTLR end "rule__Pattern__Group_4__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4__1"
    // InternalDsl.g:2146:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2150:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalDsl.g:2151:2: rule__Pattern__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_4__1"


    // $ANTLR start "rule__Pattern__Group_4__1__Impl"
    // InternalDsl.g:2157:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__Group_4_1__0 )* ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2161:1: ( ( ( rule__Pattern__Group_4_1__0 )* ) )
            // InternalDsl.g:2162:1: ( ( rule__Pattern__Group_4_1__0 )* )
            {
            // InternalDsl.g:2162:1: ( ( rule__Pattern__Group_4_1__0 )* )
            // InternalDsl.g:2163:2: ( rule__Pattern__Group_4_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_4_1()); 
            // InternalDsl.g:2164:2: ( rule__Pattern__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:2164:3: rule__Pattern__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Pattern__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Pattern__Group_4__1__Impl"


    // $ANTLR start "rule__Pattern__Group_4_1__0"
    // InternalDsl.g:2173:1: rule__Pattern__Group_4_1__0 : rule__Pattern__Group_4_1__0__Impl rule__Pattern__Group_4_1__1 ;
    public final void rule__Pattern__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2177:1: ( rule__Pattern__Group_4_1__0__Impl rule__Pattern__Group_4_1__1 )
            // InternalDsl.g:2178:2: rule__Pattern__Group_4_1__0__Impl rule__Pattern__Group_4_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Pattern__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4_1__1();

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
    // $ANTLR end "rule__Pattern__Group_4_1__0"


    // $ANTLR start "rule__Pattern__Group_4_1__0__Impl"
    // InternalDsl.g:2185:1: rule__Pattern__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2189:1: ( ( ',' ) )
            // InternalDsl.g:2190:1: ( ',' )
            {
            // InternalDsl.g:2190:1: ( ',' )
            // InternalDsl.g:2191:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_4_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Pattern__Group_4_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4_1__1"
    // InternalDsl.g:2200:1: rule__Pattern__Group_4_1__1 : rule__Pattern__Group_4_1__1__Impl ;
    public final void rule__Pattern__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2204:1: ( rule__Pattern__Group_4_1__1__Impl )
            // InternalDsl.g:2205:2: rule__Pattern__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_4_1__1"


    // $ANTLR start "rule__Pattern__Group_4_1__1__Impl"
    // InternalDsl.g:2211:1: rule__Pattern__Group_4_1__1__Impl : ( ( rule__Pattern__RulesAssignment_4_1_1 ) ) ;
    public final void rule__Pattern__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2215:1: ( ( ( rule__Pattern__RulesAssignment_4_1_1 ) ) )
            // InternalDsl.g:2216:1: ( ( rule__Pattern__RulesAssignment_4_1_1 ) )
            {
            // InternalDsl.g:2216:1: ( ( rule__Pattern__RulesAssignment_4_1_1 ) )
            // InternalDsl.g:2217:2: ( rule__Pattern__RulesAssignment_4_1_1 )
            {
             before(grammarAccess.getPatternAccess().getRulesAssignment_4_1_1()); 
            // InternalDsl.g:2218:2: ( rule__Pattern__RulesAssignment_4_1_1 )
            // InternalDsl.g:2218:3: rule__Pattern__RulesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RulesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRulesAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Pattern__Group_4_1__1__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__0"
    // InternalDsl.g:2227:1: rule__AnalogSensor__Group__0 : rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1 ;
    public final void rule__AnalogSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2231:1: ( rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1 )
            // InternalDsl.g:2232:2: rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AnalogSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__1();

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
    // $ANTLR end "rule__AnalogSensor__Group__0"


    // $ANTLR start "rule__AnalogSensor__Group__0__Impl"
    // InternalDsl.g:2239:1: rule__AnalogSensor__Group__0__Impl : ( () ) ;
    public final void rule__AnalogSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2243:1: ( ( () ) )
            // InternalDsl.g:2244:1: ( () )
            {
            // InternalDsl.g:2244:1: ( () )
            // InternalDsl.g:2245:2: ()
            {
             before(grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0()); 
            // InternalDsl.g:2246:2: ()
            // InternalDsl.g:2246:3: 
            {
            }

             after(grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalogSensor__Group__0__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__1"
    // InternalDsl.g:2254:1: rule__AnalogSensor__Group__1 : rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2 ;
    public final void rule__AnalogSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2258:1: ( rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2 )
            // InternalDsl.g:2259:2: rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AnalogSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__2();

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
    // $ANTLR end "rule__AnalogSensor__Group__1"


    // $ANTLR start "rule__AnalogSensor__Group__1__Impl"
    // InternalDsl.g:2266:1: rule__AnalogSensor__Group__1__Impl : ( 'AnalogSensor' ) ;
    public final void rule__AnalogSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2270:1: ( ( 'AnalogSensor' ) )
            // InternalDsl.g:2271:1: ( 'AnalogSensor' )
            {
            // InternalDsl.g:2271:1: ( 'AnalogSensor' )
            // InternalDsl.g:2272:2: 'AnalogSensor'
            {
             before(grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1()); 

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
    // $ANTLR end "rule__AnalogSensor__Group__1__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__2"
    // InternalDsl.g:2281:1: rule__AnalogSensor__Group__2 : rule__AnalogSensor__Group__2__Impl ;
    public final void rule__AnalogSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2285:1: ( rule__AnalogSensor__Group__2__Impl )
            // InternalDsl.g:2286:2: rule__AnalogSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__2__Impl();

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
    // $ANTLR end "rule__AnalogSensor__Group__2"


    // $ANTLR start "rule__AnalogSensor__Group__2__Impl"
    // InternalDsl.g:2292:1: rule__AnalogSensor__Group__2__Impl : ( ( rule__AnalogSensor__NameAssignment_2 ) ) ;
    public final void rule__AnalogSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2296:1: ( ( ( rule__AnalogSensor__NameAssignment_2 ) ) )
            // InternalDsl.g:2297:1: ( ( rule__AnalogSensor__NameAssignment_2 ) )
            {
            // InternalDsl.g:2297:1: ( ( rule__AnalogSensor__NameAssignment_2 ) )
            // InternalDsl.g:2298:2: ( rule__AnalogSensor__NameAssignment_2 )
            {
             before(grammarAccess.getAnalogSensorAccess().getNameAssignment_2()); 
            // InternalDsl.g:2299:2: ( rule__AnalogSensor__NameAssignment_2 )
            // InternalDsl.g:2299:3: rule__AnalogSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnalogSensorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__AnalogSensor__Group__2__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__0"
    // InternalDsl.g:2308:1: rule__DigitalSensor__Group__0 : rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1 ;
    public final void rule__DigitalSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2312:1: ( rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1 )
            // InternalDsl.g:2313:2: rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__DigitalSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__1();

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
    // $ANTLR end "rule__DigitalSensor__Group__0"


    // $ANTLR start "rule__DigitalSensor__Group__0__Impl"
    // InternalDsl.g:2320:1: rule__DigitalSensor__Group__0__Impl : ( () ) ;
    public final void rule__DigitalSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2324:1: ( ( () ) )
            // InternalDsl.g:2325:1: ( () )
            {
            // InternalDsl.g:2325:1: ( () )
            // InternalDsl.g:2326:2: ()
            {
             before(grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0()); 
            // InternalDsl.g:2327:2: ()
            // InternalDsl.g:2327:3: 
            {
            }

             after(grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSensor__Group__0__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__1"
    // InternalDsl.g:2335:1: rule__DigitalSensor__Group__1 : rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2 ;
    public final void rule__DigitalSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2339:1: ( rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2 )
            // InternalDsl.g:2340:2: rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DigitalSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__2();

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
    // $ANTLR end "rule__DigitalSensor__Group__1"


    // $ANTLR start "rule__DigitalSensor__Group__1__Impl"
    // InternalDsl.g:2347:1: rule__DigitalSensor__Group__1__Impl : ( 'DigitalSensor' ) ;
    public final void rule__DigitalSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2351:1: ( ( 'DigitalSensor' ) )
            // InternalDsl.g:2352:1: ( 'DigitalSensor' )
            {
            // InternalDsl.g:2352:1: ( 'DigitalSensor' )
            // InternalDsl.g:2353:2: 'DigitalSensor'
            {
             before(grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1()); 

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
    // $ANTLR end "rule__DigitalSensor__Group__1__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__2"
    // InternalDsl.g:2362:1: rule__DigitalSensor__Group__2 : rule__DigitalSensor__Group__2__Impl ;
    public final void rule__DigitalSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2366:1: ( rule__DigitalSensor__Group__2__Impl )
            // InternalDsl.g:2367:2: rule__DigitalSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__2__Impl();

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
    // $ANTLR end "rule__DigitalSensor__Group__2"


    // $ANTLR start "rule__DigitalSensor__Group__2__Impl"
    // InternalDsl.g:2373:1: rule__DigitalSensor__Group__2__Impl : ( ( rule__DigitalSensor__NameAssignment_2 ) ) ;
    public final void rule__DigitalSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2377:1: ( ( ( rule__DigitalSensor__NameAssignment_2 ) ) )
            // InternalDsl.g:2378:1: ( ( rule__DigitalSensor__NameAssignment_2 ) )
            {
            // InternalDsl.g:2378:1: ( ( rule__DigitalSensor__NameAssignment_2 ) )
            // InternalDsl.g:2379:2: ( rule__DigitalSensor__NameAssignment_2 )
            {
             before(grammarAccess.getDigitalSensorAccess().getNameAssignment_2()); 
            // InternalDsl.g:2380:2: ( rule__DigitalSensor__NameAssignment_2 )
            // InternalDsl.g:2380:3: rule__DigitalSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDigitalSensorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DigitalSensor__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalDsl.g:2389:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2393:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDsl.g:2394:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalDsl.g:2401:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2405:1: ( ( ( '-' )? ) )
            // InternalDsl.g:2406:1: ( ( '-' )? )
            {
            // InternalDsl.g:2406:1: ( ( '-' )? )
            // InternalDsl.g:2407:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:2408:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:2408:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalDsl.g:2416:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2420:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDsl.g:2421:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalDsl.g:2428:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2432:1: ( ( ( RULE_INT )? ) )
            // InternalDsl.g:2433:1: ( ( RULE_INT )? )
            {
            // InternalDsl.g:2433:1: ( ( RULE_INT )? )
            // InternalDsl.g:2434:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalDsl.g:2435:2: ( RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2435:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalDsl.g:2443:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2447:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDsl.g:2448:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalDsl.g:2455:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2459:1: ( ( '.' ) )
            // InternalDsl.g:2460:1: ( '.' )
            {
            // InternalDsl.g:2460:1: ( '.' )
            // InternalDsl.g:2461:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalDsl.g:2470:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2474:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalDsl.g:2475:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalDsl.g:2482:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2486:1: ( ( RULE_INT ) )
            // InternalDsl.g:2487:1: ( RULE_INT )
            {
            // InternalDsl.g:2487:1: ( RULE_INT )
            // InternalDsl.g:2488:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalDsl.g:2497:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2501:1: ( rule__EDouble__Group__4__Impl )
            // InternalDsl.g:2502:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalDsl.g:2508:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2512:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalDsl.g:2513:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalDsl.g:2513:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalDsl.g:2514:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalDsl.g:2515:2: ( rule__EDouble__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=11 && LA23_0<=12)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2515:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalDsl.g:2524:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2528:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalDsl.g:2529:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalDsl.g:2536:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2540:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalDsl.g:2541:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalDsl.g:2541:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalDsl.g:2542:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalDsl.g:2543:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalDsl.g:2543:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalDsl.g:2551:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2555:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalDsl.g:2556:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalDsl.g:2563:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2567:1: ( ( ( '-' )? ) )
            // InternalDsl.g:2568:1: ( ( '-' )? )
            {
            // InternalDsl.g:2568:1: ( ( '-' )? )
            // InternalDsl.g:2569:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalDsl.g:2570:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2570:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalDsl.g:2578:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2582:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalDsl.g:2583:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalDsl.g:2589:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2593:1: ( ( RULE_INT ) )
            // InternalDsl.g:2594:1: ( RULE_INT )
            {
            // InternalDsl.g:2594:1: ( RULE_INT )
            // InternalDsl.g:2595:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalDsl.g:2605:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2609:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDsl.g:2610:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalDsl.g:2617:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2621:1: ( ( () ) )
            // InternalDsl.g:2622:1: ( () )
            {
            // InternalDsl.g:2622:1: ( () )
            // InternalDsl.g:2623:2: ()
            {
             before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            // InternalDsl.g:2624:2: ()
            // InternalDsl.g:2624:3: 
            {
            }

             after(grammarAccess.getRuleAccess().getRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalDsl.g:2632:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2636:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDsl.g:2637:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalDsl.g:2644:1: rule__Rule__Group__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2648:1: ( ( '{' ) )
            // InternalDsl.g:2649:1: ( '{' )
            {
            // InternalDsl.g:2649:1: ( '{' )
            // InternalDsl.g:2650:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalDsl.g:2659:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2663:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDsl.g:2664:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalDsl.g:2671:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Group_2__0 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2675:1: ( ( ( rule__Rule__Group_2__0 )? ) )
            // InternalDsl.g:2676:1: ( ( rule__Rule__Group_2__0 )? )
            {
            // InternalDsl.g:2676:1: ( ( rule__Rule__Group_2__0 )? )
            // InternalDsl.g:2677:2: ( rule__Rule__Group_2__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_2()); 
            // InternalDsl.g:2678:2: ( rule__Rule__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:2678:3: rule__Rule__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalDsl.g:2686:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2690:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDsl.g:2691:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalDsl.g:2698:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Group_3__0 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2702:1: ( ( ( rule__Rule__Group_3__0 )? ) )
            // InternalDsl.g:2703:1: ( ( rule__Rule__Group_3__0 )? )
            {
            // InternalDsl.g:2703:1: ( ( rule__Rule__Group_3__0 )? )
            // InternalDsl.g:2704:2: ( rule__Rule__Group_3__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_3()); 
            // InternalDsl.g:2705:2: ( rule__Rule__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=13 && LA26_0<=14)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:2705:3: rule__Rule__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalDsl.g:2713:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2717:1: ( rule__Rule__Group__4__Impl )
            // InternalDsl.g:2718:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalDsl.g:2724:1: rule__Rule__Group__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2728:1: ( ( '}' ) )
            // InternalDsl.g:2729:1: ( '}' )
            {
            // InternalDsl.g:2729:1: ( '}' )
            // InternalDsl.g:2730:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group_2__0"
    // InternalDsl.g:2740:1: rule__Rule__Group_2__0 : rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 ;
    public final void rule__Rule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2744:1: ( rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 )
            // InternalDsl.g:2745:2: rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__1();

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
    // $ANTLR end "rule__Rule__Group_2__0"


    // $ANTLR start "rule__Rule__Group_2__0__Impl"
    // InternalDsl.g:2752:1: rule__Rule__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Rule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2756:1: ( ( '(' ) )
            // InternalDsl.g:2757:1: ( '(' )
            {
            // InternalDsl.g:2757:1: ( '(' )
            // InternalDsl.g:2758:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Rule__Group_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_2__1"
    // InternalDsl.g:2767:1: rule__Rule__Group_2__1 : rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 ;
    public final void rule__Rule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2771:1: ( rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 )
            // InternalDsl.g:2772:2: rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__2();

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
    // $ANTLR end "rule__Rule__Group_2__1"


    // $ANTLR start "rule__Rule__Group_2__1__Impl"
    // InternalDsl.g:2779:1: rule__Rule__Group_2__1__Impl : ( ( rule__Rule__PredicatesAssignment_2_1 ) ) ;
    public final void rule__Rule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2783:1: ( ( ( rule__Rule__PredicatesAssignment_2_1 ) ) )
            // InternalDsl.g:2784:1: ( ( rule__Rule__PredicatesAssignment_2_1 ) )
            {
            // InternalDsl.g:2784:1: ( ( rule__Rule__PredicatesAssignment_2_1 ) )
            // InternalDsl.g:2785:2: ( rule__Rule__PredicatesAssignment_2_1 )
            {
             before(grammarAccess.getRuleAccess().getPredicatesAssignment_2_1()); 
            // InternalDsl.g:2786:2: ( rule__Rule__PredicatesAssignment_2_1 )
            // InternalDsl.g:2786:3: rule__Rule__PredicatesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PredicatesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicatesAssignment_2_1()); 

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
    // $ANTLR end "rule__Rule__Group_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_2__2"
    // InternalDsl.g:2794:1: rule__Rule__Group_2__2 : rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 ;
    public final void rule__Rule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2798:1: ( rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 )
            // InternalDsl.g:2799:2: rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__3();

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
    // $ANTLR end "rule__Rule__Group_2__2"


    // $ANTLR start "rule__Rule__Group_2__2__Impl"
    // InternalDsl.g:2806:1: rule__Rule__Group_2__2__Impl : ( ( rule__Rule__Group_2_2__0 )* ) ;
    public final void rule__Rule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2810:1: ( ( ( rule__Rule__Group_2_2__0 )* ) )
            // InternalDsl.g:2811:1: ( ( rule__Rule__Group_2_2__0 )* )
            {
            // InternalDsl.g:2811:1: ( ( rule__Rule__Group_2_2__0 )* )
            // InternalDsl.g:2812:2: ( rule__Rule__Group_2_2__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_2_2()); 
            // InternalDsl.g:2813:2: ( rule__Rule__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:2813:3: rule__Rule__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Rule__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Rule__Group_2__2__Impl"


    // $ANTLR start "rule__Rule__Group_2__3"
    // InternalDsl.g:2821:1: rule__Rule__Group_2__3 : rule__Rule__Group_2__3__Impl ;
    public final void rule__Rule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2825:1: ( rule__Rule__Group_2__3__Impl )
            // InternalDsl.g:2826:2: rule__Rule__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__3__Impl();

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
    // $ANTLR end "rule__Rule__Group_2__3"


    // $ANTLR start "rule__Rule__Group_2__3__Impl"
    // InternalDsl.g:2832:1: rule__Rule__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Rule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2836:1: ( ( ')' ) )
            // InternalDsl.g:2837:1: ( ')' )
            {
            // InternalDsl.g:2837:1: ( ')' )
            // InternalDsl.g:2838:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__Rule__Group_2__3__Impl"


    // $ANTLR start "rule__Rule__Group_2_2__0"
    // InternalDsl.g:2848:1: rule__Rule__Group_2_2__0 : rule__Rule__Group_2_2__0__Impl rule__Rule__Group_2_2__1 ;
    public final void rule__Rule__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2852:1: ( rule__Rule__Group_2_2__0__Impl rule__Rule__Group_2_2__1 )
            // InternalDsl.g:2853:2: rule__Rule__Group_2_2__0__Impl rule__Rule__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_2__1();

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
    // $ANTLR end "rule__Rule__Group_2_2__0"


    // $ANTLR start "rule__Rule__Group_2_2__0__Impl"
    // InternalDsl.g:2860:1: rule__Rule__Group_2_2__0__Impl : ( 'and' ) ;
    public final void rule__Rule__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2864:1: ( ( 'and' ) )
            // InternalDsl.g:2865:1: ( 'and' )
            {
            // InternalDsl.g:2865:1: ( 'and' )
            // InternalDsl.g:2866:2: 'and'
            {
             before(grammarAccess.getRuleAccess().getAndKeyword_2_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAndKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Rule__Group_2_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_2_2__1"
    // InternalDsl.g:2875:1: rule__Rule__Group_2_2__1 : rule__Rule__Group_2_2__1__Impl ;
    public final void rule__Rule__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2879:1: ( rule__Rule__Group_2_2__1__Impl )
            // InternalDsl.g:2880:2: rule__Rule__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_2_2__1"


    // $ANTLR start "rule__Rule__Group_2_2__1__Impl"
    // InternalDsl.g:2886:1: rule__Rule__Group_2_2__1__Impl : ( ( rule__Rule__PredicatesAssignment_2_2_1 ) ) ;
    public final void rule__Rule__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2890:1: ( ( ( rule__Rule__PredicatesAssignment_2_2_1 ) ) )
            // InternalDsl.g:2891:1: ( ( rule__Rule__PredicatesAssignment_2_2_1 ) )
            {
            // InternalDsl.g:2891:1: ( ( rule__Rule__PredicatesAssignment_2_2_1 ) )
            // InternalDsl.g:2892:2: ( rule__Rule__PredicatesAssignment_2_2_1 )
            {
             before(grammarAccess.getRuleAccess().getPredicatesAssignment_2_2_1()); 
            // InternalDsl.g:2893:2: ( rule__Rule__PredicatesAssignment_2_2_1 )
            // InternalDsl.g:2893:3: rule__Rule__PredicatesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PredicatesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicatesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Rule__Group_2_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_3__0"
    // InternalDsl.g:2902:1: rule__Rule__Group_3__0 : rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 ;
    public final void rule__Rule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2906:1: ( rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 )
            // InternalDsl.g:2907:2: rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_3__1();

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
    // $ANTLR end "rule__Rule__Group_3__0"


    // $ANTLR start "rule__Rule__Group_3__0__Impl"
    // InternalDsl.g:2914:1: rule__Rule__Group_3__0__Impl : ( ( rule__Rule__Alternatives_3_0 ) ) ;
    public final void rule__Rule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2918:1: ( ( ( rule__Rule__Alternatives_3_0 ) ) )
            // InternalDsl.g:2919:1: ( ( rule__Rule__Alternatives_3_0 ) )
            {
            // InternalDsl.g:2919:1: ( ( rule__Rule__Alternatives_3_0 ) )
            // InternalDsl.g:2920:2: ( rule__Rule__Alternatives_3_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_3_0()); 
            // InternalDsl.g:2921:2: ( rule__Rule__Alternatives_3_0 )
            // InternalDsl.g:2921:3: rule__Rule__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_3_0()); 

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
    // $ANTLR end "rule__Rule__Group_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3__1"
    // InternalDsl.g:2929:1: rule__Rule__Group_3__1 : rule__Rule__Group_3__1__Impl ;
    public final void rule__Rule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2933:1: ( rule__Rule__Group_3__1__Impl )
            // InternalDsl.g:2934:2: rule__Rule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_3__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_3__1"


    // $ANTLR start "rule__Rule__Group_3__1__Impl"
    // InternalDsl.g:2940:1: rule__Rule__Group_3__1__Impl : ( ( rule__Rule__DurationAssignment_3_1 ) ) ;
    public final void rule__Rule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2944:1: ( ( ( rule__Rule__DurationAssignment_3_1 ) ) )
            // InternalDsl.g:2945:1: ( ( rule__Rule__DurationAssignment_3_1 ) )
            {
            // InternalDsl.g:2945:1: ( ( rule__Rule__DurationAssignment_3_1 ) )
            // InternalDsl.g:2946:2: ( rule__Rule__DurationAssignment_3_1 )
            {
             before(grammarAccess.getRuleAccess().getDurationAssignment_3_1()); 
            // InternalDsl.g:2947:2: ( rule__Rule__DurationAssignment_3_1 )
            // InternalDsl.g:2947:3: rule__Rule__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDurationAssignment_3_1()); 

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
    // $ANTLR end "rule__Rule__Group_3__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalDsl.g:2956:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2960:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalDsl.g:2961:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

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
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalDsl.g:2968:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2972:1: ( ( () ) )
            // InternalDsl.g:2973:1: ( () )
            {
            // InternalDsl.g:2973:1: ( () )
            // InternalDsl.g:2974:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0()); 
            // InternalDsl.g:2975:2: ()
            // InternalDsl.g:2975:3: 
            {
            }

             after(grammarAccess.getDurationAccess().getDurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalDsl.g:2983:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl rule__Duration__Group__2 ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2987:1: ( rule__Duration__Group__1__Impl rule__Duration__Group__2 )
            // InternalDsl.g:2988:2: rule__Duration__Group__1__Impl rule__Duration__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Duration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__2();

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
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalDsl.g:2995:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__TimeAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2999:1: ( ( ( rule__Duration__TimeAssignment_1 ) ) )
            // InternalDsl.g:3000:1: ( ( rule__Duration__TimeAssignment_1 ) )
            {
            // InternalDsl.g:3000:1: ( ( rule__Duration__TimeAssignment_1 ) )
            // InternalDsl.g:3001:2: ( rule__Duration__TimeAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getTimeAssignment_1()); 
            // InternalDsl.g:3002:2: ( rule__Duration__TimeAssignment_1 )
            // InternalDsl.g:3002:3: rule__Duration__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getTimeAssignment_1()); 

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
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__Duration__Group__2"
    // InternalDsl.g:3010:1: rule__Duration__Group__2 : rule__Duration__Group__2__Impl ;
    public final void rule__Duration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3014:1: ( rule__Duration__Group__2__Impl )
            // InternalDsl.g:3015:2: rule__Duration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__2__Impl();

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
    // $ANTLR end "rule__Duration__Group__2"


    // $ANTLR start "rule__Duration__Group__2__Impl"
    // InternalDsl.g:3021:1: rule__Duration__Group__2__Impl : ( ( rule__Duration__PrecisionAssignment_2 ) ) ;
    public final void rule__Duration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3025:1: ( ( ( rule__Duration__PrecisionAssignment_2 ) ) )
            // InternalDsl.g:3026:1: ( ( rule__Duration__PrecisionAssignment_2 ) )
            {
            // InternalDsl.g:3026:1: ( ( rule__Duration__PrecisionAssignment_2 ) )
            // InternalDsl.g:3027:2: ( rule__Duration__PrecisionAssignment_2 )
            {
             before(grammarAccess.getDurationAccess().getPrecisionAssignment_2()); 
            // InternalDsl.g:3028:2: ( rule__Duration__PrecisionAssignment_2 )
            // InternalDsl.g:3028:3: rule__Duration__PrecisionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Duration__PrecisionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getPrecisionAssignment_2()); 

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
    // $ANTLR end "rule__Duration__Group__2__Impl"


    // $ANTLR start "rule__SensorPredicate__Group__0"
    // InternalDsl.g:3037:1: rule__SensorPredicate__Group__0 : rule__SensorPredicate__Group__0__Impl rule__SensorPredicate__Group__1 ;
    public final void rule__SensorPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3041:1: ( rule__SensorPredicate__Group__0__Impl rule__SensorPredicate__Group__1 )
            // InternalDsl.g:3042:2: rule__SensorPredicate__Group__0__Impl rule__SensorPredicate__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SensorPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__1();

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
    // $ANTLR end "rule__SensorPredicate__Group__0"


    // $ANTLR start "rule__SensorPredicate__Group__0__Impl"
    // InternalDsl.g:3049:1: rule__SensorPredicate__Group__0__Impl : ( () ) ;
    public final void rule__SensorPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3053:1: ( ( () ) )
            // InternalDsl.g:3054:1: ( () )
            {
            // InternalDsl.g:3054:1: ( () )
            // InternalDsl.g:3055:2: ()
            {
             before(grammarAccess.getSensorPredicateAccess().getSensorPredicateAction_0()); 
            // InternalDsl.g:3056:2: ()
            // InternalDsl.g:3056:3: 
            {
            }

             after(grammarAccess.getSensorPredicateAccess().getSensorPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorPredicate__Group__0__Impl"


    // $ANTLR start "rule__SensorPredicate__Group__1"
    // InternalDsl.g:3064:1: rule__SensorPredicate__Group__1 : rule__SensorPredicate__Group__1__Impl rule__SensorPredicate__Group__2 ;
    public final void rule__SensorPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3068:1: ( rule__SensorPredicate__Group__1__Impl rule__SensorPredicate__Group__2 )
            // InternalDsl.g:3069:2: rule__SensorPredicate__Group__1__Impl rule__SensorPredicate__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__SensorPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__2();

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
    // $ANTLR end "rule__SensorPredicate__Group__1"


    // $ANTLR start "rule__SensorPredicate__Group__1__Impl"
    // InternalDsl.g:3076:1: rule__SensorPredicate__Group__1__Impl : ( ( rule__SensorPredicate__SensorAssignment_1 ) ) ;
    public final void rule__SensorPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3080:1: ( ( ( rule__SensorPredicate__SensorAssignment_1 ) ) )
            // InternalDsl.g:3081:1: ( ( rule__SensorPredicate__SensorAssignment_1 ) )
            {
            // InternalDsl.g:3081:1: ( ( rule__SensorPredicate__SensorAssignment_1 ) )
            // InternalDsl.g:3082:2: ( rule__SensorPredicate__SensorAssignment_1 )
            {
             before(grammarAccess.getSensorPredicateAccess().getSensorAssignment_1()); 
            // InternalDsl.g:3083:2: ( rule__SensorPredicate__SensorAssignment_1 )
            // InternalDsl.g:3083:3: rule__SensorPredicate__SensorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__SensorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorPredicateAccess().getSensorAssignment_1()); 

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
    // $ANTLR end "rule__SensorPredicate__Group__1__Impl"


    // $ANTLR start "rule__SensorPredicate__Group__2"
    // InternalDsl.g:3091:1: rule__SensorPredicate__Group__2 : rule__SensorPredicate__Group__2__Impl rule__SensorPredicate__Group__3 ;
    public final void rule__SensorPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3095:1: ( rule__SensorPredicate__Group__2__Impl rule__SensorPredicate__Group__3 )
            // InternalDsl.g:3096:2: rule__SensorPredicate__Group__2__Impl rule__SensorPredicate__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__SensorPredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__3();

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
    // $ANTLR end "rule__SensorPredicate__Group__2"


    // $ANTLR start "rule__SensorPredicate__Group__2__Impl"
    // InternalDsl.g:3103:1: rule__SensorPredicate__Group__2__Impl : ( ( rule__SensorPredicate__OperatorAssignment_2 ) ) ;
    public final void rule__SensorPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3107:1: ( ( ( rule__SensorPredicate__OperatorAssignment_2 ) ) )
            // InternalDsl.g:3108:1: ( ( rule__SensorPredicate__OperatorAssignment_2 ) )
            {
            // InternalDsl.g:3108:1: ( ( rule__SensorPredicate__OperatorAssignment_2 ) )
            // InternalDsl.g:3109:2: ( rule__SensorPredicate__OperatorAssignment_2 )
            {
             before(grammarAccess.getSensorPredicateAccess().getOperatorAssignment_2()); 
            // InternalDsl.g:3110:2: ( rule__SensorPredicate__OperatorAssignment_2 )
            // InternalDsl.g:3110:3: rule__SensorPredicate__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorPredicateAccess().getOperatorAssignment_2()); 

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
    // $ANTLR end "rule__SensorPredicate__Group__2__Impl"


    // $ANTLR start "rule__SensorPredicate__Group__3"
    // InternalDsl.g:3118:1: rule__SensorPredicate__Group__3 : rule__SensorPredicate__Group__3__Impl ;
    public final void rule__SensorPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3122:1: ( rule__SensorPredicate__Group__3__Impl )
            // InternalDsl.g:3123:2: rule__SensorPredicate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__Group__3__Impl();

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
    // $ANTLR end "rule__SensorPredicate__Group__3"


    // $ANTLR start "rule__SensorPredicate__Group__3__Impl"
    // InternalDsl.g:3129:1: rule__SensorPredicate__Group__3__Impl : ( ( rule__SensorPredicate__ValueAssignment_3 ) ) ;
    public final void rule__SensorPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3133:1: ( ( ( rule__SensorPredicate__ValueAssignment_3 ) ) )
            // InternalDsl.g:3134:1: ( ( rule__SensorPredicate__ValueAssignment_3 ) )
            {
            // InternalDsl.g:3134:1: ( ( rule__SensorPredicate__ValueAssignment_3 ) )
            // InternalDsl.g:3135:2: ( rule__SensorPredicate__ValueAssignment_3 )
            {
             before(grammarAccess.getSensorPredicateAccess().getValueAssignment_3()); 
            // InternalDsl.g:3136:2: ( rule__SensorPredicate__ValueAssignment_3 )
            // InternalDsl.g:3136:3: rule__SensorPredicate__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SensorPredicate__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorPredicateAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__SensorPredicate__Group__3__Impl"


    // $ANTLR start "rule__PersonPredicate__Group__0"
    // InternalDsl.g:3145:1: rule__PersonPredicate__Group__0 : rule__PersonPredicate__Group__0__Impl rule__PersonPredicate__Group__1 ;
    public final void rule__PersonPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3149:1: ( rule__PersonPredicate__Group__0__Impl rule__PersonPredicate__Group__1 )
            // InternalDsl.g:3150:2: rule__PersonPredicate__Group__0__Impl rule__PersonPredicate__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PersonPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__1();

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
    // $ANTLR end "rule__PersonPredicate__Group__0"


    // $ANTLR start "rule__PersonPredicate__Group__0__Impl"
    // InternalDsl.g:3157:1: rule__PersonPredicate__Group__0__Impl : ( () ) ;
    public final void rule__PersonPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3161:1: ( ( () ) )
            // InternalDsl.g:3162:1: ( () )
            {
            // InternalDsl.g:3162:1: ( () )
            // InternalDsl.g:3163:2: ()
            {
             before(grammarAccess.getPersonPredicateAccess().getPersonPredicateAction_0()); 
            // InternalDsl.g:3164:2: ()
            // InternalDsl.g:3164:3: 
            {
            }

             after(grammarAccess.getPersonPredicateAccess().getPersonPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersonPredicate__Group__0__Impl"


    // $ANTLR start "rule__PersonPredicate__Group__1"
    // InternalDsl.g:3172:1: rule__PersonPredicate__Group__1 : rule__PersonPredicate__Group__1__Impl rule__PersonPredicate__Group__2 ;
    public final void rule__PersonPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3176:1: ( rule__PersonPredicate__Group__1__Impl rule__PersonPredicate__Group__2 )
            // InternalDsl.g:3177:2: rule__PersonPredicate__Group__1__Impl rule__PersonPredicate__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__PersonPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__2();

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
    // $ANTLR end "rule__PersonPredicate__Group__1"


    // $ANTLR start "rule__PersonPredicate__Group__1__Impl"
    // InternalDsl.g:3184:1: rule__PersonPredicate__Group__1__Impl : ( ( rule__PersonPredicate__PersonAssignment_1 ) ) ;
    public final void rule__PersonPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3188:1: ( ( ( rule__PersonPredicate__PersonAssignment_1 ) ) )
            // InternalDsl.g:3189:1: ( ( rule__PersonPredicate__PersonAssignment_1 ) )
            {
            // InternalDsl.g:3189:1: ( ( rule__PersonPredicate__PersonAssignment_1 ) )
            // InternalDsl.g:3190:2: ( rule__PersonPredicate__PersonAssignment_1 )
            {
             before(grammarAccess.getPersonPredicateAccess().getPersonAssignment_1()); 
            // InternalDsl.g:3191:2: ( rule__PersonPredicate__PersonAssignment_1 )
            // InternalDsl.g:3191:3: rule__PersonPredicate__PersonAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PersonPredicate__PersonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonPredicateAccess().getPersonAssignment_1()); 

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
    // $ANTLR end "rule__PersonPredicate__Group__1__Impl"


    // $ANTLR start "rule__PersonPredicate__Group__2"
    // InternalDsl.g:3199:1: rule__PersonPredicate__Group__2 : rule__PersonPredicate__Group__2__Impl rule__PersonPredicate__Group__3 ;
    public final void rule__PersonPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3203:1: ( rule__PersonPredicate__Group__2__Impl rule__PersonPredicate__Group__3 )
            // InternalDsl.g:3204:2: rule__PersonPredicate__Group__2__Impl rule__PersonPredicate__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__PersonPredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__3();

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
    // $ANTLR end "rule__PersonPredicate__Group__2"


    // $ANTLR start "rule__PersonPredicate__Group__2__Impl"
    // InternalDsl.g:3211:1: rule__PersonPredicate__Group__2__Impl : ( 'is' ) ;
    public final void rule__PersonPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3215:1: ( ( 'is' ) )
            // InternalDsl.g:3216:1: ( 'is' )
            {
            // InternalDsl.g:3216:1: ( 'is' )
            // InternalDsl.g:3217:2: 'is'
            {
             before(grammarAccess.getPersonPredicateAccess().getIsKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPersonPredicateAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__PersonPredicate__Group__2__Impl"


    // $ANTLR start "rule__PersonPredicate__Group__3"
    // InternalDsl.g:3226:1: rule__PersonPredicate__Group__3 : rule__PersonPredicate__Group__3__Impl ;
    public final void rule__PersonPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3230:1: ( rule__PersonPredicate__Group__3__Impl )
            // InternalDsl.g:3231:2: rule__PersonPredicate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersonPredicate__Group__3__Impl();

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
    // $ANTLR end "rule__PersonPredicate__Group__3"


    // $ANTLR start "rule__PersonPredicate__Group__3__Impl"
    // InternalDsl.g:3237:1: rule__PersonPredicate__Group__3__Impl : ( ( rule__PersonPredicate__ActivityAssignment_3 ) ) ;
    public final void rule__PersonPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3241:1: ( ( ( rule__PersonPredicate__ActivityAssignment_3 ) ) )
            // InternalDsl.g:3242:1: ( ( rule__PersonPredicate__ActivityAssignment_3 ) )
            {
            // InternalDsl.g:3242:1: ( ( rule__PersonPredicate__ActivityAssignment_3 ) )
            // InternalDsl.g:3243:2: ( rule__PersonPredicate__ActivityAssignment_3 )
            {
             before(grammarAccess.getPersonPredicateAccess().getActivityAssignment_3()); 
            // InternalDsl.g:3244:2: ( rule__PersonPredicate__ActivityAssignment_3 )
            // InternalDsl.g:3244:3: rule__PersonPredicate__ActivityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PersonPredicate__ActivityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonPredicateAccess().getActivityAssignment_3()); 

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
    // $ANTLR end "rule__PersonPredicate__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDsl.g:3253:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3257:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDsl.g:3258:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDsl.g:3265:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3269:1: ( ( ( '-' )? ) )
            // InternalDsl.g:3270:1: ( ( '-' )? )
            {
            // InternalDsl.g:3270:1: ( ( '-' )? )
            // InternalDsl.g:3271:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:3272:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:3272:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDsl.g:3280:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3284:1: ( rule__EInt__Group__1__Impl )
            // InternalDsl.g:3285:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDsl.g:3291:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3295:1: ( ( RULE_INT ) )
            // InternalDsl.g:3296:1: ( RULE_INT )
            {
            // InternalDsl.g:3296:1: ( RULE_INT )
            // InternalDsl.g:3297:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Home__FileEventsAssignment_1_1"
    // InternalDsl.g:3307:1: rule__Home__FileEventsAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Home__FileEventsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3311:1: ( ( ruleEString ) )
            // InternalDsl.g:3312:2: ( ruleEString )
            {
            // InternalDsl.g:3312:2: ( ruleEString )
            // InternalDsl.g:3313:3: ruleEString
            {
             before(grammarAccess.getHomeAccess().getFileEventsEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getFileEventsEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Home__FileEventsAssignment_1_1"


    // $ANTLR start "rule__Home__RoomsAssignment_2_2"
    // InternalDsl.g:3322:1: rule__Home__RoomsAssignment_2_2 : ( ruleRoom ) ;
    public final void rule__Home__RoomsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3326:1: ( ( ruleRoom ) )
            // InternalDsl.g:3327:2: ( ruleRoom )
            {
            // InternalDsl.g:3327:2: ( ruleRoom )
            // InternalDsl.g:3328:3: ruleRoom
            {
             before(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Home__RoomsAssignment_2_2"


    // $ANTLR start "rule__Home__RoomsAssignment_2_3_1"
    // InternalDsl.g:3337:1: rule__Home__RoomsAssignment_2_3_1 : ( ruleRoom ) ;
    public final void rule__Home__RoomsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3341:1: ( ( ruleRoom ) )
            // InternalDsl.g:3342:2: ( ruleRoom )
            {
            // InternalDsl.g:3342:2: ( ruleRoom )
            // InternalDsl.g:3343:3: ruleRoom
            {
             before(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__Home__RoomsAssignment_2_3_1"


    // $ANTLR start "rule__Home__PersonsAssignment_3_2"
    // InternalDsl.g:3352:1: rule__Home__PersonsAssignment_3_2 : ( rulePerson ) ;
    public final void rule__Home__PersonsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3356:1: ( ( rulePerson ) )
            // InternalDsl.g:3357:2: ( rulePerson )
            {
            // InternalDsl.g:3357:2: ( rulePerson )
            // InternalDsl.g:3358:3: rulePerson
            {
             before(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Home__PersonsAssignment_3_2"


    // $ANTLR start "rule__Home__PersonsAssignment_3_3_1"
    // InternalDsl.g:3367:1: rule__Home__PersonsAssignment_3_3_1 : ( rulePerson ) ;
    public final void rule__Home__PersonsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3371:1: ( ( rulePerson ) )
            // InternalDsl.g:3372:2: ( rulePerson )
            {
            // InternalDsl.g:3372:2: ( rulePerson )
            // InternalDsl.g:3373:3: rulePerson
            {
             before(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Home__PersonsAssignment_3_3_1"


    // $ANTLR start "rule__Home__PatternsAssignment_4_2"
    // InternalDsl.g:3382:1: rule__Home__PatternsAssignment_4_2 : ( rulePattern ) ;
    public final void rule__Home__PatternsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3386:1: ( ( rulePattern ) )
            // InternalDsl.g:3387:2: ( rulePattern )
            {
            // InternalDsl.g:3387:2: ( rulePattern )
            // InternalDsl.g:3388:3: rulePattern
            {
             before(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Home__PatternsAssignment_4_2"


    // $ANTLR start "rule__Home__PatternsAssignment_4_3_1"
    // InternalDsl.g:3397:1: rule__Home__PatternsAssignment_4_3_1 : ( rulePattern ) ;
    public final void rule__Home__PatternsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3401:1: ( ( rulePattern ) )
            // InternalDsl.g:3402:2: ( rulePattern )
            {
            // InternalDsl.g:3402:2: ( rulePattern )
            // InternalDsl.g:3403:3: rulePattern
            {
             before(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Home__PatternsAssignment_4_3_1"


    // $ANTLR start "rule__Home__MonitoredEntitiesAssignment_5_1"
    // InternalDsl.g:3412:1: rule__Home__MonitoredEntitiesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Home__MonitoredEntitiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3416:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3417:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3417:2: ( ( ruleEString ) )
            // InternalDsl.g:3418:3: ( ruleEString )
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_5_1_0()); 
            // InternalDsl.g:3419:3: ( ruleEString )
            // InternalDsl.g:3420:4: ruleEString
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Home__MonitoredEntitiesAssignment_5_1"


    // $ANTLR start "rule__Home__MonitoredEntitiesAssignment_5_2_1"
    // InternalDsl.g:3431:1: rule__Home__MonitoredEntitiesAssignment_5_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Home__MonitoredEntitiesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3435:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3436:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3436:2: ( ( ruleEString ) )
            // InternalDsl.g:3437:3: ( ruleEString )
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_5_2_1_0()); 
            // InternalDsl.g:3438:3: ( ruleEString )
            // InternalDsl.g:3439:4: ruleEString
            {
             before(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityEStringParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityEStringParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__Home__MonitoredEntitiesAssignment_5_2_1"


    // $ANTLR start "rule__Room__NameAssignment_2"
    // InternalDsl.g:3450:1: rule__Room__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3454:1: ( ( ruleEString ) )
            // InternalDsl.g:3455:2: ( ruleEString )
            {
            // InternalDsl.g:3455:2: ( ruleEString )
            // InternalDsl.g:3456:3: ruleEString
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


    // $ANTLR start "rule__Room__SensorsAssignment_4_0"
    // InternalDsl.g:3465:1: rule__Room__SensorsAssignment_4_0 : ( ruleSensor ) ;
    public final void rule__Room__SensorsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3469:1: ( ( ruleSensor ) )
            // InternalDsl.g:3470:2: ( ruleSensor )
            {
            // InternalDsl.g:3470:2: ( ruleSensor )
            // InternalDsl.g:3471:3: ruleSensor
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Room__SensorsAssignment_4_0"


    // $ANTLR start "rule__Room__SensorsAssignment_4_1_1"
    // InternalDsl.g:3480:1: rule__Room__SensorsAssignment_4_1_1 : ( ruleSensor ) ;
    public final void rule__Room__SensorsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3484:1: ( ( ruleSensor ) )
            // InternalDsl.g:3485:2: ( ruleSensor )
            {
            // InternalDsl.g:3485:2: ( ruleSensor )
            // InternalDsl.g:3486:3: ruleSensor
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Room__SensorsAssignment_4_1_1"


    // $ANTLR start "rule__Person__NameAssignment_2"
    // InternalDsl.g:3495:1: rule__Person__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Person__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3499:1: ( ( ruleEString ) )
            // InternalDsl.g:3500:2: ( ruleEString )
            {
            // InternalDsl.g:3500:2: ( ruleEString )
            // InternalDsl.g:3501:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Person__NameAssignment_2"


    // $ANTLR start "rule__Pattern__NameAssignment_2"
    // InternalDsl.g:3510:1: rule__Pattern__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3514:1: ( ( ruleEString ) )
            // InternalDsl.g:3515:2: ( ruleEString )
            {
            // InternalDsl.g:3515:2: ( ruleEString )
            // InternalDsl.g:3516:3: ruleEString
            {
             before(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Pattern__NameAssignment_2"


    // $ANTLR start "rule__Pattern__RulesAssignment_4_0"
    // InternalDsl.g:3525:1: rule__Pattern__RulesAssignment_4_0 : ( ruleRule ) ;
    public final void rule__Pattern__RulesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3529:1: ( ( ruleRule ) )
            // InternalDsl.g:3530:2: ( ruleRule )
            {
            // InternalDsl.g:3530:2: ( ruleRule )
            // InternalDsl.g:3531:3: ruleRule
            {
             before(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Pattern__RulesAssignment_4_0"


    // $ANTLR start "rule__Pattern__RulesAssignment_4_1_1"
    // InternalDsl.g:3540:1: rule__Pattern__RulesAssignment_4_1_1 : ( ruleRule ) ;
    public final void rule__Pattern__RulesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3544:1: ( ( ruleRule ) )
            // InternalDsl.g:3545:2: ( ruleRule )
            {
            // InternalDsl.g:3545:2: ( ruleRule )
            // InternalDsl.g:3546:3: ruleRule
            {
             before(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Pattern__RulesAssignment_4_1_1"


    // $ANTLR start "rule__AnalogSensor__NameAssignment_2"
    // InternalDsl.g:3555:1: rule__AnalogSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AnalogSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3559:1: ( ( ruleEString ) )
            // InternalDsl.g:3560:2: ( ruleEString )
            {
            // InternalDsl.g:3560:2: ( ruleEString )
            // InternalDsl.g:3561:3: ruleEString
            {
             before(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AnalogSensor__NameAssignment_2"


    // $ANTLR start "rule__DigitalSensor__NameAssignment_2"
    // InternalDsl.g:3570:1: rule__DigitalSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DigitalSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3574:1: ( ( ruleEString ) )
            // InternalDsl.g:3575:2: ( ruleEString )
            {
            // InternalDsl.g:3575:2: ( ruleEString )
            // InternalDsl.g:3576:3: ruleEString
            {
             before(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DigitalSensor__NameAssignment_2"


    // $ANTLR start "rule__Rule__PredicatesAssignment_2_1"
    // InternalDsl.g:3585:1: rule__Rule__PredicatesAssignment_2_1 : ( rulePredicate ) ;
    public final void rule__Rule__PredicatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3589:1: ( ( rulePredicate ) )
            // InternalDsl.g:3590:2: ( rulePredicate )
            {
            // InternalDsl.g:3590:2: ( rulePredicate )
            // InternalDsl.g:3591:3: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Rule__PredicatesAssignment_2_1"


    // $ANTLR start "rule__Rule__PredicatesAssignment_2_2_1"
    // InternalDsl.g:3600:1: rule__Rule__PredicatesAssignment_2_2_1 : ( rulePredicate ) ;
    public final void rule__Rule__PredicatesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3604:1: ( ( rulePredicate ) )
            // InternalDsl.g:3605:2: ( rulePredicate )
            {
            // InternalDsl.g:3605:2: ( rulePredicate )
            // InternalDsl.g:3606:3: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Rule__PredicatesAssignment_2_2_1"


    // $ANTLR start "rule__Rule__DurationAssignment_3_1"
    // InternalDsl.g:3615:1: rule__Rule__DurationAssignment_3_1 : ( ruleDuration ) ;
    public final void rule__Rule__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3619:1: ( ( ruleDuration ) )
            // InternalDsl.g:3620:2: ( ruleDuration )
            {
            // InternalDsl.g:3620:2: ( ruleDuration )
            // InternalDsl.g:3621:3: ruleDuration
            {
             before(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Rule__DurationAssignment_3_1"


    // $ANTLR start "rule__Duration__TimeAssignment_1"
    // InternalDsl.g:3630:1: rule__Duration__TimeAssignment_1 : ( ruleEInt ) ;
    public final void rule__Duration__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3634:1: ( ( ruleEInt ) )
            // InternalDsl.g:3635:2: ( ruleEInt )
            {
            // InternalDsl.g:3635:2: ( ruleEInt )
            // InternalDsl.g:3636:3: ruleEInt
            {
             before(grammarAccess.getDurationAccess().getTimeEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getTimeEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Duration__TimeAssignment_1"


    // $ANTLR start "rule__Duration__PrecisionAssignment_2"
    // InternalDsl.g:3645:1: rule__Duration__PrecisionAssignment_2 : ( rulePrecision ) ;
    public final void rule__Duration__PrecisionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3649:1: ( ( rulePrecision ) )
            // InternalDsl.g:3650:2: ( rulePrecision )
            {
            // InternalDsl.g:3650:2: ( rulePrecision )
            // InternalDsl.g:3651:3: rulePrecision
            {
             before(grammarAccess.getDurationAccess().getPrecisionPrecisionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrecision();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getPrecisionPrecisionEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Duration__PrecisionAssignment_2"


    // $ANTLR start "rule__SensorPredicate__SensorAssignment_1"
    // InternalDsl.g:3660:1: rule__SensorPredicate__SensorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__SensorPredicate__SensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3664:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3665:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3665:2: ( ( ruleEString ) )
            // InternalDsl.g:3666:3: ( ruleEString )
            {
             before(grammarAccess.getSensorPredicateAccess().getSensorSensorCrossReference_1_0()); 
            // InternalDsl.g:3667:3: ( ruleEString )
            // InternalDsl.g:3668:4: ruleEString
            {
             before(grammarAccess.getSensorPredicateAccess().getSensorSensorEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorPredicateAccess().getSensorSensorEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSensorPredicateAccess().getSensorSensorCrossReference_1_0()); 

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
    // $ANTLR end "rule__SensorPredicate__SensorAssignment_1"


    // $ANTLR start "rule__SensorPredicate__OperatorAssignment_2"
    // InternalDsl.g:3679:1: rule__SensorPredicate__OperatorAssignment_2 : ( ruleOperator ) ;
    public final void rule__SensorPredicate__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3683:1: ( ( ruleOperator ) )
            // InternalDsl.g:3684:2: ( ruleOperator )
            {
            // InternalDsl.g:3684:2: ( ruleOperator )
            // InternalDsl.g:3685:3: ruleOperator
            {
             before(grammarAccess.getSensorPredicateAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getSensorPredicateAccess().getOperatorOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__SensorPredicate__OperatorAssignment_2"


    // $ANTLR start "rule__SensorPredicate__ValueAssignment_3"
    // InternalDsl.g:3694:1: rule__SensorPredicate__ValueAssignment_3 : ( ruleEDouble ) ;
    public final void rule__SensorPredicate__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3698:1: ( ( ruleEDouble ) )
            // InternalDsl.g:3699:2: ( ruleEDouble )
            {
            // InternalDsl.g:3699:2: ( ruleEDouble )
            // InternalDsl.g:3700:3: ruleEDouble
            {
             before(grammarAccess.getSensorPredicateAccess().getValueEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSensorPredicateAccess().getValueEDoubleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SensorPredicate__ValueAssignment_3"


    // $ANTLR start "rule__PersonPredicate__PersonAssignment_1"
    // InternalDsl.g:3709:1: rule__PersonPredicate__PersonAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__PersonPredicate__PersonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3713:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3714:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3714:2: ( ( ruleEString ) )
            // InternalDsl.g:3715:3: ( ruleEString )
            {
             before(grammarAccess.getPersonPredicateAccess().getPersonPersonCrossReference_1_0()); 
            // InternalDsl.g:3716:3: ( ruleEString )
            // InternalDsl.g:3717:4: ruleEString
            {
             before(grammarAccess.getPersonPredicateAccess().getPersonPersonEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonPredicateAccess().getPersonPersonEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPersonPredicateAccess().getPersonPersonCrossReference_1_0()); 

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
    // $ANTLR end "rule__PersonPredicate__PersonAssignment_1"


    // $ANTLR start "rule__PersonPredicate__ActivityAssignment_3"
    // InternalDsl.g:3728:1: rule__PersonPredicate__ActivityAssignment_3 : ( ruleActivity ) ;
    public final void rule__PersonPredicate__ActivityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3732:1: ( ( ruleActivity ) )
            // InternalDsl.g:3733:2: ( ruleActivity )
            {
            // InternalDsl.g:3733:2: ( ruleActivity )
            // InternalDsl.g:3734:3: ruleActivity
            {
             before(grammarAccess.getPersonPredicateAccess().getActivityActivityEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getPersonPredicateAccess().getActivityActivityEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__PersonPredicate__ActivityAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000001C5000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010010006000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000001C0000L});

}