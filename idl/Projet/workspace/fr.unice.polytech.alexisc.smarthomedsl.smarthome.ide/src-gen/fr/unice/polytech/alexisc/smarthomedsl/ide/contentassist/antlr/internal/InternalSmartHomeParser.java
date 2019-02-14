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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<'", "'>'", "'seconds'", "'milliseconds'", "'minutes'", "'laying'", "'sitting'", "'standing'", "'rooms'", "'{'", "'}'", "','", "'patterns'", "'Room'", "'sensors'", "'AnalogSensor'", "'on'", "'reacts'", "'to'", "'DigitalSensor'", "'SensorCSV'", "'from'", "'Activity'", "'rules'", "'and'", "'for'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleAnalogSensor"
    // InternalSmartHome.g:103:1: entryRuleAnalogSensor : ruleAnalogSensor EOF ;
    public final void entryRuleAnalogSensor() throws RecognitionException {
        try {
            // InternalSmartHome.g:104:1: ( ruleAnalogSensor EOF )
            // InternalSmartHome.g:105:1: ruleAnalogSensor EOF
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
    // InternalSmartHome.g:112:1: ruleAnalogSensor : ( ( rule__AnalogSensor__Group__0 ) ) ;
    public final void ruleAnalogSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:116:2: ( ( ( rule__AnalogSensor__Group__0 ) ) )
            // InternalSmartHome.g:117:2: ( ( rule__AnalogSensor__Group__0 ) )
            {
            // InternalSmartHome.g:117:2: ( ( rule__AnalogSensor__Group__0 ) )
            // InternalSmartHome.g:118:3: ( rule__AnalogSensor__Group__0 )
            {
             before(grammarAccess.getAnalogSensorAccess().getGroup()); 
            // InternalSmartHome.g:119:3: ( rule__AnalogSensor__Group__0 )
            // InternalSmartHome.g:119:4: rule__AnalogSensor__Group__0
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
    // InternalSmartHome.g:128:1: entryRuleDigitalSensor : ruleDigitalSensor EOF ;
    public final void entryRuleDigitalSensor() throws RecognitionException {
        try {
            // InternalSmartHome.g:129:1: ( ruleDigitalSensor EOF )
            // InternalSmartHome.g:130:1: ruleDigitalSensor EOF
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
    // InternalSmartHome.g:137:1: ruleDigitalSensor : ( ( rule__DigitalSensor__Group__0 ) ) ;
    public final void ruleDigitalSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:141:2: ( ( ( rule__DigitalSensor__Group__0 ) ) )
            // InternalSmartHome.g:142:2: ( ( rule__DigitalSensor__Group__0 ) )
            {
            // InternalSmartHome.g:142:2: ( ( rule__DigitalSensor__Group__0 ) )
            // InternalSmartHome.g:143:3: ( rule__DigitalSensor__Group__0 )
            {
             before(grammarAccess.getDigitalSensorAccess().getGroup()); 
            // InternalSmartHome.g:144:3: ( rule__DigitalSensor__Group__0 )
            // InternalSmartHome.g:144:4: rule__DigitalSensor__Group__0
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


    // $ANTLR start "entryRuleSensorCSV"
    // InternalSmartHome.g:153:1: entryRuleSensorCSV : ruleSensorCSV EOF ;
    public final void entryRuleSensorCSV() throws RecognitionException {
        try {
            // InternalSmartHome.g:154:1: ( ruleSensorCSV EOF )
            // InternalSmartHome.g:155:1: ruleSensorCSV EOF
            {
             before(grammarAccess.getSensorCSVRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorCSV();

            state._fsp--;

             after(grammarAccess.getSensorCSVRule()); 
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
    // $ANTLR end "entryRuleSensorCSV"


    // $ANTLR start "ruleSensorCSV"
    // InternalSmartHome.g:162:1: ruleSensorCSV : ( ( rule__SensorCSV__Group__0 ) ) ;
    public final void ruleSensorCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:166:2: ( ( ( rule__SensorCSV__Group__0 ) ) )
            // InternalSmartHome.g:167:2: ( ( rule__SensorCSV__Group__0 ) )
            {
            // InternalSmartHome.g:167:2: ( ( rule__SensorCSV__Group__0 ) )
            // InternalSmartHome.g:168:3: ( rule__SensorCSV__Group__0 )
            {
             before(grammarAccess.getSensorCSVAccess().getGroup()); 
            // InternalSmartHome.g:169:3: ( rule__SensorCSV__Group__0 )
            // InternalSmartHome.g:169:4: rule__SensorCSV__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorCSV__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorCSVAccess().getGroup()); 

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
    // $ANTLR end "ruleSensorCSV"


    // $ANTLR start "entryRulePattern"
    // InternalSmartHome.g:178:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalSmartHome.g:179:1: ( rulePattern EOF )
            // InternalSmartHome.g:180:1: rulePattern EOF
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
    // InternalSmartHome.g:187:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:191:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalSmartHome.g:192:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalSmartHome.g:192:2: ( ( rule__Pattern__Group__0 ) )
            // InternalSmartHome.g:193:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalSmartHome.g:194:3: ( rule__Pattern__Group__0 )
            // InternalSmartHome.g:194:4: rule__Pattern__Group__0
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


    // $ANTLR start "entryRuleRule"
    // InternalSmartHome.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalSmartHome.g:204:1: ( ruleRule EOF )
            // InternalSmartHome.g:205:1: ruleRule EOF
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
    // InternalSmartHome.g:212:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:216:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalSmartHome.g:217:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalSmartHome.g:217:2: ( ( rule__Rule__Group__0 ) )
            // InternalSmartHome.g:218:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalSmartHome.g:219:3: ( rule__Rule__Group__0 )
            // InternalSmartHome.g:219:4: rule__Rule__Group__0
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
    // InternalSmartHome.g:228:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalSmartHome.g:229:1: ( ruleDuration EOF )
            // InternalSmartHome.g:230:1: ruleDuration EOF
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
    // InternalSmartHome.g:237:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:241:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalSmartHome.g:242:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalSmartHome.g:242:2: ( ( rule__Duration__Group__0 ) )
            // InternalSmartHome.g:243:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalSmartHome.g:244:3: ( rule__Duration__Group__0 )
            // InternalSmartHome.g:244:4: rule__Duration__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalSmartHome.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmartHome.g:254:1: ( ruleEString EOF )
            // InternalSmartHome.g:255:1: ruleEString EOF
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
    // InternalSmartHome.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmartHome.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmartHome.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalSmartHome.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmartHome.g:269:3: ( rule__EString__Alternatives )
            // InternalSmartHome.g:269:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleOperator"
    // InternalSmartHome.g:278:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:282:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalSmartHome.g:283:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalSmartHome.g:283:2: ( ( rule__Operator__Alternatives ) )
            // InternalSmartHome.g:284:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalSmartHome.g:285:3: ( rule__Operator__Alternatives )
            // InternalSmartHome.g:285:4: rule__Operator__Alternatives
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


    // $ANTLR start "rulePrecision"
    // InternalSmartHome.g:294:1: rulePrecision : ( ( rule__Precision__Alternatives ) ) ;
    public final void rulePrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:298:1: ( ( ( rule__Precision__Alternatives ) ) )
            // InternalSmartHome.g:299:2: ( ( rule__Precision__Alternatives ) )
            {
            // InternalSmartHome.g:299:2: ( ( rule__Precision__Alternatives ) )
            // InternalSmartHome.g:300:3: ( rule__Precision__Alternatives )
            {
             before(grammarAccess.getPrecisionAccess().getAlternatives()); 
            // InternalSmartHome.g:301:3: ( rule__Precision__Alternatives )
            // InternalSmartHome.g:301:4: rule__Precision__Alternatives
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


    // $ANTLR start "ruleActivity"
    // InternalSmartHome.g:310:1: ruleActivity : ( ( rule__Activity__Alternatives ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:314:1: ( ( ( rule__Activity__Alternatives ) ) )
            // InternalSmartHome.g:315:2: ( ( rule__Activity__Alternatives ) )
            {
            // InternalSmartHome.g:315:2: ( ( rule__Activity__Alternatives ) )
            // InternalSmartHome.g:316:3: ( rule__Activity__Alternatives )
            {
             before(grammarAccess.getActivityAccess().getAlternatives()); 
            // InternalSmartHome.g:317:3: ( rule__Activity__Alternatives )
            // InternalSmartHome.g:317:4: rule__Activity__Alternatives
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


    // $ANTLR start "rule__Room__SensorsAlternatives_4_2_0"
    // InternalSmartHome.g:325:1: rule__Room__SensorsAlternatives_4_2_0 : ( ( ruleAnalogSensor ) | ( ruleDigitalSensor ) | ( ruleSensorCSV ) );
    public final void rule__Room__SensorsAlternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:329:1: ( ( ruleAnalogSensor ) | ( ruleDigitalSensor ) | ( ruleSensorCSV ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSmartHome.g:330:2: ( ruleAnalogSensor )
                    {
                    // InternalSmartHome.g:330:2: ( ruleAnalogSensor )
                    // InternalSmartHome.g:331:3: ruleAnalogSensor
                    {
                     before(grammarAccess.getRoomAccess().getSensorsAnalogSensorParserRuleCall_4_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAnalogSensor();

                    state._fsp--;

                     after(grammarAccess.getRoomAccess().getSensorsAnalogSensorParserRuleCall_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:336:2: ( ruleDigitalSensor )
                    {
                    // InternalSmartHome.g:336:2: ( ruleDigitalSensor )
                    // InternalSmartHome.g:337:3: ruleDigitalSensor
                    {
                     before(grammarAccess.getRoomAccess().getSensorsDigitalSensorParserRuleCall_4_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDigitalSensor();

                    state._fsp--;

                     after(grammarAccess.getRoomAccess().getSensorsDigitalSensorParserRuleCall_4_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:342:2: ( ruleSensorCSV )
                    {
                    // InternalSmartHome.g:342:2: ( ruleSensorCSV )
                    // InternalSmartHome.g:343:3: ruleSensorCSV
                    {
                     before(grammarAccess.getRoomAccess().getSensorsSensorCSVParserRuleCall_4_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorCSV();

                    state._fsp--;

                     after(grammarAccess.getRoomAccess().getSensorsSensorCSVParserRuleCall_4_2_0_2()); 

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
    // $ANTLR end "rule__Room__SensorsAlternatives_4_2_0"


    // $ANTLR start "rule__Room__SensorsAlternatives_4_3_1_0"
    // InternalSmartHome.g:352:1: rule__Room__SensorsAlternatives_4_3_1_0 : ( ( ruleAnalogSensor ) | ( ruleDigitalSensor ) | ( ruleSensorCSV ) );
    public final void rule__Room__SensorsAlternatives_4_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:356:1: ( ( ruleAnalogSensor ) | ( ruleDigitalSensor ) | ( ruleSensorCSV ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSmartHome.g:357:2: ( ruleAnalogSensor )
                    {
                    // InternalSmartHome.g:357:2: ( ruleAnalogSensor )
                    // InternalSmartHome.g:358:3: ruleAnalogSensor
                    {
                     before(grammarAccess.getRoomAccess().getSensorsAnalogSensorParserRuleCall_4_3_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAnalogSensor();

                    state._fsp--;

                     after(grammarAccess.getRoomAccess().getSensorsAnalogSensorParserRuleCall_4_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:363:2: ( ruleDigitalSensor )
                    {
                    // InternalSmartHome.g:363:2: ( ruleDigitalSensor )
                    // InternalSmartHome.g:364:3: ruleDigitalSensor
                    {
                     before(grammarAccess.getRoomAccess().getSensorsDigitalSensorParserRuleCall_4_3_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDigitalSensor();

                    state._fsp--;

                     after(grammarAccess.getRoomAccess().getSensorsDigitalSensorParserRuleCall_4_3_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:369:2: ( ruleSensorCSV )
                    {
                    // InternalSmartHome.g:369:2: ( ruleSensorCSV )
                    // InternalSmartHome.g:370:3: ruleSensorCSV
                    {
                     before(grammarAccess.getRoomAccess().getSensorsSensorCSVParserRuleCall_4_3_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorCSV();

                    state._fsp--;

                     after(grammarAccess.getRoomAccess().getSensorsSensorCSVParserRuleCall_4_3_1_0_2()); 

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
    // $ANTLR end "rule__Room__SensorsAlternatives_4_3_1_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmartHome.g:379:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:383:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSmartHome.g:384:2: ( RULE_STRING )
                    {
                    // InternalSmartHome.g:384:2: ( RULE_STRING )
                    // InternalSmartHome.g:385:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:390:2: ( RULE_ID )
                    {
                    // InternalSmartHome.g:390:2: ( RULE_ID )
                    // InternalSmartHome.g:391:3: RULE_ID
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


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalSmartHome.g:400:1: rule__Operator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:404:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSmartHome.g:405:2: ( ( '=' ) )
                    {
                    // InternalSmartHome.g:405:2: ( ( '=' ) )
                    // InternalSmartHome.g:406:3: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // InternalSmartHome.g:407:3: ( '=' )
                    // InternalSmartHome.g:407:4: '='
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:411:2: ( ( '<' ) )
                    {
                    // InternalSmartHome.g:411:2: ( ( '<' ) )
                    // InternalSmartHome.g:412:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1()); 
                    // InternalSmartHome.g:413:3: ( '<' )
                    // InternalSmartHome.g:413:4: '<'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:417:2: ( ( '>' ) )
                    {
                    // InternalSmartHome.g:417:2: ( ( '>' ) )
                    // InternalSmartHome.g:418:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_2()); 
                    // InternalSmartHome.g:419:3: ( '>' )
                    // InternalSmartHome.g:419:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_2()); 

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


    // $ANTLR start "rule__Precision__Alternatives"
    // InternalSmartHome.g:427:1: rule__Precision__Alternatives : ( ( ( 'seconds' ) ) | ( ( 'milliseconds' ) ) | ( ( 'minutes' ) ) );
    public final void rule__Precision__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:431:1: ( ( ( 'seconds' ) ) | ( ( 'milliseconds' ) ) | ( ( 'minutes' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSmartHome.g:432:2: ( ( 'seconds' ) )
                    {
                    // InternalSmartHome.g:432:2: ( ( 'seconds' ) )
                    // InternalSmartHome.g:433:3: ( 'seconds' )
                    {
                     before(grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_0()); 
                    // InternalSmartHome.g:434:3: ( 'seconds' )
                    // InternalSmartHome.g:434:4: 'seconds'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:438:2: ( ( 'milliseconds' ) )
                    {
                    // InternalSmartHome.g:438:2: ( ( 'milliseconds' ) )
                    // InternalSmartHome.g:439:3: ( 'milliseconds' )
                    {
                     before(grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_1()); 
                    // InternalSmartHome.g:440:3: ( 'milliseconds' )
                    // InternalSmartHome.g:440:4: 'milliseconds'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:444:2: ( ( 'minutes' ) )
                    {
                    // InternalSmartHome.g:444:2: ( ( 'minutes' ) )
                    // InternalSmartHome.g:445:3: ( 'minutes' )
                    {
                     before(grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2()); 
                    // InternalSmartHome.g:446:3: ( 'minutes' )
                    // InternalSmartHome.g:446:4: 'minutes'
                    {
                    match(input,16,FOLLOW_2); 

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


    // $ANTLR start "rule__Activity__Alternatives"
    // InternalSmartHome.g:454:1: rule__Activity__Alternatives : ( ( ( 'laying' ) ) | ( ( 'sitting' ) ) | ( ( 'standing' ) ) );
    public final void rule__Activity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:458:1: ( ( ( 'laying' ) ) | ( ( 'sitting' ) ) | ( ( 'standing' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
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
                    // InternalSmartHome.g:459:2: ( ( 'laying' ) )
                    {
                    // InternalSmartHome.g:459:2: ( ( 'laying' ) )
                    // InternalSmartHome.g:460:3: ( 'laying' )
                    {
                     before(grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_0()); 
                    // InternalSmartHome.g:461:3: ( 'laying' )
                    // InternalSmartHome.g:461:4: 'laying'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:465:2: ( ( 'sitting' ) )
                    {
                    // InternalSmartHome.g:465:2: ( ( 'sitting' ) )
                    // InternalSmartHome.g:466:3: ( 'sitting' )
                    {
                     before(grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_1()); 
                    // InternalSmartHome.g:467:3: ( 'sitting' )
                    // InternalSmartHome.g:467:4: 'sitting'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:471:2: ( ( 'standing' ) )
                    {
                    // InternalSmartHome.g:471:2: ( ( 'standing' ) )
                    // InternalSmartHome.g:472:3: ( 'standing' )
                    {
                     before(grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_2()); 
                    // InternalSmartHome.g:473:3: ( 'standing' )
                    // InternalSmartHome.g:473:4: 'standing'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_2()); 

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


    // $ANTLR start "rule__Home__Group__0"
    // InternalSmartHome.g:481:1: rule__Home__Group__0 : rule__Home__Group__0__Impl rule__Home__Group__1 ;
    public final void rule__Home__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:485:1: ( rule__Home__Group__0__Impl rule__Home__Group__1 )
            // InternalSmartHome.g:486:2: rule__Home__Group__0__Impl rule__Home__Group__1
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
    // InternalSmartHome.g:493:1: rule__Home__Group__0__Impl : ( () ) ;
    public final void rule__Home__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:497:1: ( ( () ) )
            // InternalSmartHome.g:498:1: ( () )
            {
            // InternalSmartHome.g:498:1: ( () )
            // InternalSmartHome.g:499:2: ()
            {
             before(grammarAccess.getHomeAccess().getHomeAction_0()); 
            // InternalSmartHome.g:500:2: ()
            // InternalSmartHome.g:500:3: 
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
    // InternalSmartHome.g:508:1: rule__Home__Group__1 : rule__Home__Group__1__Impl rule__Home__Group__2 ;
    public final void rule__Home__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:512:1: ( rule__Home__Group__1__Impl rule__Home__Group__2 )
            // InternalSmartHome.g:513:2: rule__Home__Group__1__Impl rule__Home__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmartHome.g:520:1: rule__Home__Group__1__Impl : ( ( rule__Home__Group_1__0 )? ) ;
    public final void rule__Home__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:524:1: ( ( ( rule__Home__Group_1__0 )? ) )
            // InternalSmartHome.g:525:1: ( ( rule__Home__Group_1__0 )? )
            {
            // InternalSmartHome.g:525:1: ( ( rule__Home__Group_1__0 )? )
            // InternalSmartHome.g:526:2: ( rule__Home__Group_1__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_1()); 
            // InternalSmartHome.g:527:2: ( rule__Home__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmartHome.g:527:3: rule__Home__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_1__0();

                    state._fsp--;


                    }
                    break;

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
    // InternalSmartHome.g:535:1: rule__Home__Group__2 : rule__Home__Group__2__Impl ;
    public final void rule__Home__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:539:1: ( rule__Home__Group__2__Impl )
            // InternalSmartHome.g:540:2: rule__Home__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__2__Impl();

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
    // InternalSmartHome.g:546:1: rule__Home__Group__2__Impl : ( ( rule__Home__Group_2__0 )? ) ;
    public final void rule__Home__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:550:1: ( ( ( rule__Home__Group_2__0 )? ) )
            // InternalSmartHome.g:551:1: ( ( rule__Home__Group_2__0 )? )
            {
            // InternalSmartHome.g:551:1: ( ( rule__Home__Group_2__0 )? )
            // InternalSmartHome.g:552:2: ( rule__Home__Group_2__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_2()); 
            // InternalSmartHome.g:553:2: ( rule__Home__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmartHome.g:553:3: rule__Home__Group_2__0
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


    // $ANTLR start "rule__Home__Group_1__0"
    // InternalSmartHome.g:562:1: rule__Home__Group_1__0 : rule__Home__Group_1__0__Impl rule__Home__Group_1__1 ;
    public final void rule__Home__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:566:1: ( rule__Home__Group_1__0__Impl rule__Home__Group_1__1 )
            // InternalSmartHome.g:567:2: rule__Home__Group_1__0__Impl rule__Home__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmartHome.g:574:1: rule__Home__Group_1__0__Impl : ( 'rooms' ) ;
    public final void rule__Home__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:578:1: ( ( 'rooms' ) )
            // InternalSmartHome.g:579:1: ( 'rooms' )
            {
            // InternalSmartHome.g:579:1: ( 'rooms' )
            // InternalSmartHome.g:580:2: 'rooms'
            {
             before(grammarAccess.getHomeAccess().getRoomsKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRoomsKeyword_1_0()); 

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
    // InternalSmartHome.g:589:1: rule__Home__Group_1__1 : rule__Home__Group_1__1__Impl rule__Home__Group_1__2 ;
    public final void rule__Home__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:593:1: ( rule__Home__Group_1__1__Impl rule__Home__Group_1__2 )
            // InternalSmartHome.g:594:2: rule__Home__Group_1__1__Impl rule__Home__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_1__2();

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
    // InternalSmartHome.g:601:1: rule__Home__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:605:1: ( ( '{' ) )
            // InternalSmartHome.g:606:1: ( '{' )
            {
            // InternalSmartHome.g:606:1: ( '{' )
            // InternalSmartHome.g:607:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_1_1()); 

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


    // $ANTLR start "rule__Home__Group_1__2"
    // InternalSmartHome.g:616:1: rule__Home__Group_1__2 : rule__Home__Group_1__2__Impl rule__Home__Group_1__3 ;
    public final void rule__Home__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:620:1: ( rule__Home__Group_1__2__Impl rule__Home__Group_1__3 )
            // InternalSmartHome.g:621:2: rule__Home__Group_1__2__Impl rule__Home__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_1__3();

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
    // $ANTLR end "rule__Home__Group_1__2"


    // $ANTLR start "rule__Home__Group_1__2__Impl"
    // InternalSmartHome.g:628:1: rule__Home__Group_1__2__Impl : ( ( rule__Home__RoomsAssignment_1_2 ) ) ;
    public final void rule__Home__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:632:1: ( ( ( rule__Home__RoomsAssignment_1_2 ) ) )
            // InternalSmartHome.g:633:1: ( ( rule__Home__RoomsAssignment_1_2 ) )
            {
            // InternalSmartHome.g:633:1: ( ( rule__Home__RoomsAssignment_1_2 ) )
            // InternalSmartHome.g:634:2: ( rule__Home__RoomsAssignment_1_2 )
            {
             before(grammarAccess.getHomeAccess().getRoomsAssignment_1_2()); 
            // InternalSmartHome.g:635:2: ( rule__Home__RoomsAssignment_1_2 )
            // InternalSmartHome.g:635:3: rule__Home__RoomsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__RoomsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getRoomsAssignment_1_2()); 

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
    // $ANTLR end "rule__Home__Group_1__2__Impl"


    // $ANTLR start "rule__Home__Group_1__3"
    // InternalSmartHome.g:643:1: rule__Home__Group_1__3 : rule__Home__Group_1__3__Impl rule__Home__Group_1__4 ;
    public final void rule__Home__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:647:1: ( rule__Home__Group_1__3__Impl rule__Home__Group_1__4 )
            // InternalSmartHome.g:648:2: rule__Home__Group_1__3__Impl rule__Home__Group_1__4
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_1__4();

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
    // $ANTLR end "rule__Home__Group_1__3"


    // $ANTLR start "rule__Home__Group_1__3__Impl"
    // InternalSmartHome.g:655:1: rule__Home__Group_1__3__Impl : ( ( rule__Home__Group_1_3__0 )* ) ;
    public final void rule__Home__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:659:1: ( ( ( rule__Home__Group_1_3__0 )* ) )
            // InternalSmartHome.g:660:1: ( ( rule__Home__Group_1_3__0 )* )
            {
            // InternalSmartHome.g:660:1: ( ( rule__Home__Group_1_3__0 )* )
            // InternalSmartHome.g:661:2: ( rule__Home__Group_1_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_1_3()); 
            // InternalSmartHome.g:662:2: ( rule__Home__Group_1_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmartHome.g:662:3: rule__Home__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Home__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__Home__Group_1__3__Impl"


    // $ANTLR start "rule__Home__Group_1__4"
    // InternalSmartHome.g:670:1: rule__Home__Group_1__4 : rule__Home__Group_1__4__Impl ;
    public final void rule__Home__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:674:1: ( rule__Home__Group_1__4__Impl )
            // InternalSmartHome.g:675:2: rule__Home__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_1__4__Impl();

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
    // $ANTLR end "rule__Home__Group_1__4"


    // $ANTLR start "rule__Home__Group_1__4__Impl"
    // InternalSmartHome.g:681:1: rule__Home__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:685:1: ( ( '}' ) )
            // InternalSmartHome.g:686:1: ( '}' )
            {
            // InternalSmartHome.g:686:1: ( '}' )
            // InternalSmartHome.g:687:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_1_4()); 

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
    // $ANTLR end "rule__Home__Group_1__4__Impl"


    // $ANTLR start "rule__Home__Group_1_3__0"
    // InternalSmartHome.g:697:1: rule__Home__Group_1_3__0 : rule__Home__Group_1_3__0__Impl rule__Home__Group_1_3__1 ;
    public final void rule__Home__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:701:1: ( rule__Home__Group_1_3__0__Impl rule__Home__Group_1_3__1 )
            // InternalSmartHome.g:702:2: rule__Home__Group_1_3__0__Impl rule__Home__Group_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_1_3__1();

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
    // $ANTLR end "rule__Home__Group_1_3__0"


    // $ANTLR start "rule__Home__Group_1_3__0__Impl"
    // InternalSmartHome.g:709:1: rule__Home__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:713:1: ( ( ',' ) )
            // InternalSmartHome.g:714:1: ( ',' )
            {
            // InternalSmartHome.g:714:1: ( ',' )
            // InternalSmartHome.g:715:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_1_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Home__Group_1_3__0__Impl"


    // $ANTLR start "rule__Home__Group_1_3__1"
    // InternalSmartHome.g:724:1: rule__Home__Group_1_3__1 : rule__Home__Group_1_3__1__Impl ;
    public final void rule__Home__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:728:1: ( rule__Home__Group_1_3__1__Impl )
            // InternalSmartHome.g:729:2: rule__Home__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Home__Group_1_3__1"


    // $ANTLR start "rule__Home__Group_1_3__1__Impl"
    // InternalSmartHome.g:735:1: rule__Home__Group_1_3__1__Impl : ( ( rule__Home__RoomsAssignment_1_3_1 ) ) ;
    public final void rule__Home__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:739:1: ( ( ( rule__Home__RoomsAssignment_1_3_1 ) ) )
            // InternalSmartHome.g:740:1: ( ( rule__Home__RoomsAssignment_1_3_1 ) )
            {
            // InternalSmartHome.g:740:1: ( ( rule__Home__RoomsAssignment_1_3_1 ) )
            // InternalSmartHome.g:741:2: ( rule__Home__RoomsAssignment_1_3_1 )
            {
             before(grammarAccess.getHomeAccess().getRoomsAssignment_1_3_1()); 
            // InternalSmartHome.g:742:2: ( rule__Home__RoomsAssignment_1_3_1 )
            // InternalSmartHome.g:742:3: rule__Home__RoomsAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__RoomsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getRoomsAssignment_1_3_1()); 

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
    // $ANTLR end "rule__Home__Group_1_3__1__Impl"


    // $ANTLR start "rule__Home__Group_2__0"
    // InternalSmartHome.g:751:1: rule__Home__Group_2__0 : rule__Home__Group_2__0__Impl rule__Home__Group_2__1 ;
    public final void rule__Home__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:755:1: ( rule__Home__Group_2__0__Impl rule__Home__Group_2__1 )
            // InternalSmartHome.g:756:2: rule__Home__Group_2__0__Impl rule__Home__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmartHome.g:763:1: rule__Home__Group_2__0__Impl : ( 'patterns' ) ;
    public final void rule__Home__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:767:1: ( ( 'patterns' ) )
            // InternalSmartHome.g:768:1: ( 'patterns' )
            {
            // InternalSmartHome.g:768:1: ( 'patterns' )
            // InternalSmartHome.g:769:2: 'patterns'
            {
             before(grammarAccess.getHomeAccess().getPatternsKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getPatternsKeyword_2_0()); 

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
    // InternalSmartHome.g:778:1: rule__Home__Group_2__1 : rule__Home__Group_2__1__Impl rule__Home__Group_2__2 ;
    public final void rule__Home__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:782:1: ( rule__Home__Group_2__1__Impl rule__Home__Group_2__2 )
            // InternalSmartHome.g:783:2: rule__Home__Group_2__1__Impl rule__Home__Group_2__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmartHome.g:790:1: rule__Home__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Home__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:794:1: ( ( '{' ) )
            // InternalSmartHome.g:795:1: ( '{' )
            {
            // InternalSmartHome.g:795:1: ( '{' )
            // InternalSmartHome.g:796:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmartHome.g:805:1: rule__Home__Group_2__2 : rule__Home__Group_2__2__Impl rule__Home__Group_2__3 ;
    public final void rule__Home__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:809:1: ( rule__Home__Group_2__2__Impl rule__Home__Group_2__3 )
            // InternalSmartHome.g:810:2: rule__Home__Group_2__2__Impl rule__Home__Group_2__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmartHome.g:817:1: rule__Home__Group_2__2__Impl : ( ( rule__Home__ActivitiesAssignment_2_2 ) ) ;
    public final void rule__Home__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:821:1: ( ( ( rule__Home__ActivitiesAssignment_2_2 ) ) )
            // InternalSmartHome.g:822:1: ( ( rule__Home__ActivitiesAssignment_2_2 ) )
            {
            // InternalSmartHome.g:822:1: ( ( rule__Home__ActivitiesAssignment_2_2 ) )
            // InternalSmartHome.g:823:2: ( rule__Home__ActivitiesAssignment_2_2 )
            {
             before(grammarAccess.getHomeAccess().getActivitiesAssignment_2_2()); 
            // InternalSmartHome.g:824:2: ( rule__Home__ActivitiesAssignment_2_2 )
            // InternalSmartHome.g:824:3: rule__Home__ActivitiesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__ActivitiesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getActivitiesAssignment_2_2()); 

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
    // InternalSmartHome.g:832:1: rule__Home__Group_2__3 : rule__Home__Group_2__3__Impl rule__Home__Group_2__4 ;
    public final void rule__Home__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:836:1: ( rule__Home__Group_2__3__Impl rule__Home__Group_2__4 )
            // InternalSmartHome.g:837:2: rule__Home__Group_2__3__Impl rule__Home__Group_2__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmartHome.g:844:1: rule__Home__Group_2__3__Impl : ( ( rule__Home__Group_2_3__0 )* ) ;
    public final void rule__Home__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:848:1: ( ( ( rule__Home__Group_2_3__0 )* ) )
            // InternalSmartHome.g:849:1: ( ( rule__Home__Group_2_3__0 )* )
            {
            // InternalSmartHome.g:849:1: ( ( rule__Home__Group_2_3__0 )* )
            // InternalSmartHome.g:850:2: ( rule__Home__Group_2_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_2_3()); 
            // InternalSmartHome.g:851:2: ( rule__Home__Group_2_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmartHome.g:851:3: rule__Home__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Home__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSmartHome.g:859:1: rule__Home__Group_2__4 : rule__Home__Group_2__4__Impl ;
    public final void rule__Home__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:863:1: ( rule__Home__Group_2__4__Impl )
            // InternalSmartHome.g:864:2: rule__Home__Group_2__4__Impl
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
    // InternalSmartHome.g:870:1: rule__Home__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Home__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:874:1: ( ( '}' ) )
            // InternalSmartHome.g:875:1: ( '}' )
            {
            // InternalSmartHome.g:875:1: ( '}' )
            // InternalSmartHome.g:876:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSmartHome.g:886:1: rule__Home__Group_2_3__0 : rule__Home__Group_2_3__0__Impl rule__Home__Group_2_3__1 ;
    public final void rule__Home__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:890:1: ( rule__Home__Group_2_3__0__Impl rule__Home__Group_2_3__1 )
            // InternalSmartHome.g:891:2: rule__Home__Group_2_3__0__Impl rule__Home__Group_2_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmartHome.g:898:1: rule__Home__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:902:1: ( ( ',' ) )
            // InternalSmartHome.g:903:1: ( ',' )
            {
            // InternalSmartHome.g:903:1: ( ',' )
            // InternalSmartHome.g:904:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_2_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSmartHome.g:913:1: rule__Home__Group_2_3__1 : rule__Home__Group_2_3__1__Impl ;
    public final void rule__Home__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:917:1: ( rule__Home__Group_2_3__1__Impl )
            // InternalSmartHome.g:918:2: rule__Home__Group_2_3__1__Impl
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
    // InternalSmartHome.g:924:1: rule__Home__Group_2_3__1__Impl : ( ( rule__Home__ActivitiesAssignment_2_3_1 ) ) ;
    public final void rule__Home__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:928:1: ( ( ( rule__Home__ActivitiesAssignment_2_3_1 ) ) )
            // InternalSmartHome.g:929:1: ( ( rule__Home__ActivitiesAssignment_2_3_1 ) )
            {
            // InternalSmartHome.g:929:1: ( ( rule__Home__ActivitiesAssignment_2_3_1 ) )
            // InternalSmartHome.g:930:2: ( rule__Home__ActivitiesAssignment_2_3_1 )
            {
             before(grammarAccess.getHomeAccess().getActivitiesAssignment_2_3_1()); 
            // InternalSmartHome.g:931:2: ( rule__Home__ActivitiesAssignment_2_3_1 )
            // InternalSmartHome.g:931:3: rule__Home__ActivitiesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__ActivitiesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getActivitiesAssignment_2_3_1()); 

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


    // $ANTLR start "rule__Room__Group__0"
    // InternalSmartHome.g:940:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:944:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalSmartHome.g:945:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSmartHome.g:952:1: rule__Room__Group__0__Impl : ( () ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:956:1: ( ( () ) )
            // InternalSmartHome.g:957:1: ( () )
            {
            // InternalSmartHome.g:957:1: ( () )
            // InternalSmartHome.g:958:2: ()
            {
             before(grammarAccess.getRoomAccess().getRoomAction_0()); 
            // InternalSmartHome.g:959:2: ()
            // InternalSmartHome.g:959:3: 
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
    // InternalSmartHome.g:967:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:971:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalSmartHome.g:972:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSmartHome.g:979:1: rule__Room__Group__1__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:983:1: ( ( 'Room' ) )
            // InternalSmartHome.g:984:1: ( 'Room' )
            {
            // InternalSmartHome.g:984:1: ( 'Room' )
            // InternalSmartHome.g:985:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSmartHome.g:994:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:998:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalSmartHome.g:999:2: rule__Room__Group__2__Impl rule__Room__Group__3
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
    // InternalSmartHome.g:1006:1: rule__Room__Group__2__Impl : ( ( rule__Room__NameAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1010:1: ( ( ( rule__Room__NameAssignment_2 ) ) )
            // InternalSmartHome.g:1011:1: ( ( rule__Room__NameAssignment_2 ) )
            {
            // InternalSmartHome.g:1011:1: ( ( rule__Room__NameAssignment_2 ) )
            // InternalSmartHome.g:1012:2: ( rule__Room__NameAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_2()); 
            // InternalSmartHome.g:1013:2: ( rule__Room__NameAssignment_2 )
            // InternalSmartHome.g:1013:3: rule__Room__NameAssignment_2
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
    // InternalSmartHome.g:1021:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1025:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalSmartHome.g:1026:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSmartHome.g:1033:1: rule__Room__Group__3__Impl : ( '{' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1037:1: ( ( '{' ) )
            // InternalSmartHome.g:1038:1: ( '{' )
            {
            // InternalSmartHome.g:1038:1: ( '{' )
            // InternalSmartHome.g:1039:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmartHome.g:1048:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1052:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalSmartHome.g:1053:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalSmartHome.g:1060:1: rule__Room__Group__4__Impl : ( ( rule__Room__Group_4__0 )? ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1064:1: ( ( ( rule__Room__Group_4__0 )? ) )
            // InternalSmartHome.g:1065:1: ( ( rule__Room__Group_4__0 )? )
            {
            // InternalSmartHome.g:1065:1: ( ( rule__Room__Group_4__0 )? )
            // InternalSmartHome.g:1066:2: ( rule__Room__Group_4__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_4()); 
            // InternalSmartHome.g:1067:2: ( rule__Room__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmartHome.g:1067:3: rule__Room__Group_4__0
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
    // InternalSmartHome.g:1075:1: rule__Room__Group__5 : rule__Room__Group__5__Impl ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1079:1: ( rule__Room__Group__5__Impl )
            // InternalSmartHome.g:1080:2: rule__Room__Group__5__Impl
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
    // InternalSmartHome.g:1086:1: rule__Room__Group__5__Impl : ( '}' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1090:1: ( ( '}' ) )
            // InternalSmartHome.g:1091:1: ( '}' )
            {
            // InternalSmartHome.g:1091:1: ( '}' )
            // InternalSmartHome.g:1092:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSmartHome.g:1102:1: rule__Room__Group_4__0 : rule__Room__Group_4__0__Impl rule__Room__Group_4__1 ;
    public final void rule__Room__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1106:1: ( rule__Room__Group_4__0__Impl rule__Room__Group_4__1 )
            // InternalSmartHome.g:1107:2: rule__Room__Group_4__0__Impl rule__Room__Group_4__1
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
    // InternalSmartHome.g:1114:1: rule__Room__Group_4__0__Impl : ( 'sensors' ) ;
    public final void rule__Room__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1118:1: ( ( 'sensors' ) )
            // InternalSmartHome.g:1119:1: ( 'sensors' )
            {
            // InternalSmartHome.g:1119:1: ( 'sensors' )
            // InternalSmartHome.g:1120:2: 'sensors'
            {
             before(grammarAccess.getRoomAccess().getSensorsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSmartHome.g:1129:1: rule__Room__Group_4__1 : rule__Room__Group_4__1__Impl rule__Room__Group_4__2 ;
    public final void rule__Room__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1133:1: ( rule__Room__Group_4__1__Impl rule__Room__Group_4__2 )
            // InternalSmartHome.g:1134:2: rule__Room__Group_4__1__Impl rule__Room__Group_4__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSmartHome.g:1141:1: rule__Room__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Room__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1145:1: ( ( '{' ) )
            // InternalSmartHome.g:1146:1: ( '{' )
            {
            // InternalSmartHome.g:1146:1: ( '{' )
            // InternalSmartHome.g:1147:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmartHome.g:1156:1: rule__Room__Group_4__2 : rule__Room__Group_4__2__Impl rule__Room__Group_4__3 ;
    public final void rule__Room__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1160:1: ( rule__Room__Group_4__2__Impl rule__Room__Group_4__3 )
            // InternalSmartHome.g:1161:2: rule__Room__Group_4__2__Impl rule__Room__Group_4__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmartHome.g:1168:1: rule__Room__Group_4__2__Impl : ( ( rule__Room__SensorsAssignment_4_2 ) ) ;
    public final void rule__Room__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1172:1: ( ( ( rule__Room__SensorsAssignment_4_2 ) ) )
            // InternalSmartHome.g:1173:1: ( ( rule__Room__SensorsAssignment_4_2 ) )
            {
            // InternalSmartHome.g:1173:1: ( ( rule__Room__SensorsAssignment_4_2 ) )
            // InternalSmartHome.g:1174:2: ( rule__Room__SensorsAssignment_4_2 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_4_2()); 
            // InternalSmartHome.g:1175:2: ( rule__Room__SensorsAssignment_4_2 )
            // InternalSmartHome.g:1175:3: rule__Room__SensorsAssignment_4_2
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
    // InternalSmartHome.g:1183:1: rule__Room__Group_4__3 : rule__Room__Group_4__3__Impl rule__Room__Group_4__4 ;
    public final void rule__Room__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1187:1: ( rule__Room__Group_4__3__Impl rule__Room__Group_4__4 )
            // InternalSmartHome.g:1188:2: rule__Room__Group_4__3__Impl rule__Room__Group_4__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmartHome.g:1195:1: rule__Room__Group_4__3__Impl : ( ( rule__Room__Group_4_3__0 )* ) ;
    public final void rule__Room__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1199:1: ( ( ( rule__Room__Group_4_3__0 )* ) )
            // InternalSmartHome.g:1200:1: ( ( rule__Room__Group_4_3__0 )* )
            {
            // InternalSmartHome.g:1200:1: ( ( rule__Room__Group_4_3__0 )* )
            // InternalSmartHome.g:1201:2: ( rule__Room__Group_4_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_4_3()); 
            // InternalSmartHome.g:1202:2: ( rule__Room__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmartHome.g:1202:3: rule__Room__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Room__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSmartHome.g:1210:1: rule__Room__Group_4__4 : rule__Room__Group_4__4__Impl ;
    public final void rule__Room__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1214:1: ( rule__Room__Group_4__4__Impl )
            // InternalSmartHome.g:1215:2: rule__Room__Group_4__4__Impl
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
    // InternalSmartHome.g:1221:1: rule__Room__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Room__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1225:1: ( ( '}' ) )
            // InternalSmartHome.g:1226:1: ( '}' )
            {
            // InternalSmartHome.g:1226:1: ( '}' )
            // InternalSmartHome.g:1227:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSmartHome.g:1237:1: rule__Room__Group_4_3__0 : rule__Room__Group_4_3__0__Impl rule__Room__Group_4_3__1 ;
    public final void rule__Room__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1241:1: ( rule__Room__Group_4_3__0__Impl rule__Room__Group_4_3__1 )
            // InternalSmartHome.g:1242:2: rule__Room__Group_4_3__0__Impl rule__Room__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSmartHome.g:1249:1: rule__Room__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1253:1: ( ( ',' ) )
            // InternalSmartHome.g:1254:1: ( ',' )
            {
            // InternalSmartHome.g:1254:1: ( ',' )
            // InternalSmartHome.g:1255:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_4_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSmartHome.g:1264:1: rule__Room__Group_4_3__1 : rule__Room__Group_4_3__1__Impl ;
    public final void rule__Room__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1268:1: ( rule__Room__Group_4_3__1__Impl )
            // InternalSmartHome.g:1269:2: rule__Room__Group_4_3__1__Impl
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
    // InternalSmartHome.g:1275:1: rule__Room__Group_4_3__1__Impl : ( ( rule__Room__SensorsAssignment_4_3_1 ) ) ;
    public final void rule__Room__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1279:1: ( ( ( rule__Room__SensorsAssignment_4_3_1 ) ) )
            // InternalSmartHome.g:1280:1: ( ( rule__Room__SensorsAssignment_4_3_1 ) )
            {
            // InternalSmartHome.g:1280:1: ( ( rule__Room__SensorsAssignment_4_3_1 ) )
            // InternalSmartHome.g:1281:2: ( rule__Room__SensorsAssignment_4_3_1 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_4_3_1()); 
            // InternalSmartHome.g:1282:2: ( rule__Room__SensorsAssignment_4_3_1 )
            // InternalSmartHome.g:1282:3: rule__Room__SensorsAssignment_4_3_1
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


    // $ANTLR start "rule__AnalogSensor__Group__0"
    // InternalSmartHome.g:1291:1: rule__AnalogSensor__Group__0 : rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1 ;
    public final void rule__AnalogSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1295:1: ( rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1 )
            // InternalSmartHome.g:1296:2: rule__AnalogSensor__Group__0__Impl rule__AnalogSensor__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSmartHome.g:1303:1: rule__AnalogSensor__Group__0__Impl : ( () ) ;
    public final void rule__AnalogSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1307:1: ( ( () ) )
            // InternalSmartHome.g:1308:1: ( () )
            {
            // InternalSmartHome.g:1308:1: ( () )
            // InternalSmartHome.g:1309:2: ()
            {
             before(grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0()); 
            // InternalSmartHome.g:1310:2: ()
            // InternalSmartHome.g:1310:3: 
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
    // InternalSmartHome.g:1318:1: rule__AnalogSensor__Group__1 : rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2 ;
    public final void rule__AnalogSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1322:1: ( rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2 )
            // InternalSmartHome.g:1323:2: rule__AnalogSensor__Group__1__Impl rule__AnalogSensor__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSmartHome.g:1330:1: rule__AnalogSensor__Group__1__Impl : ( 'AnalogSensor' ) ;
    public final void rule__AnalogSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1334:1: ( ( 'AnalogSensor' ) )
            // InternalSmartHome.g:1335:1: ( 'AnalogSensor' )
            {
            // InternalSmartHome.g:1335:1: ( 'AnalogSensor' )
            // InternalSmartHome.g:1336:2: 'AnalogSensor'
            {
             before(grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSmartHome.g:1345:1: rule__AnalogSensor__Group__2 : rule__AnalogSensor__Group__2__Impl rule__AnalogSensor__Group__3 ;
    public final void rule__AnalogSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1349:1: ( rule__AnalogSensor__Group__2__Impl rule__AnalogSensor__Group__3 )
            // InternalSmartHome.g:1350:2: rule__AnalogSensor__Group__2__Impl rule__AnalogSensor__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__AnalogSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__3();

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
    // InternalSmartHome.g:1357:1: rule__AnalogSensor__Group__2__Impl : ( ( rule__AnalogSensor__NameAssignment_2 ) ) ;
    public final void rule__AnalogSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1361:1: ( ( ( rule__AnalogSensor__NameAssignment_2 ) ) )
            // InternalSmartHome.g:1362:1: ( ( rule__AnalogSensor__NameAssignment_2 ) )
            {
            // InternalSmartHome.g:1362:1: ( ( rule__AnalogSensor__NameAssignment_2 ) )
            // InternalSmartHome.g:1363:2: ( rule__AnalogSensor__NameAssignment_2 )
            {
             before(grammarAccess.getAnalogSensorAccess().getNameAssignment_2()); 
            // InternalSmartHome.g:1364:2: ( rule__AnalogSensor__NameAssignment_2 )
            // InternalSmartHome.g:1364:3: rule__AnalogSensor__NameAssignment_2
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


    // $ANTLR start "rule__AnalogSensor__Group__3"
    // InternalSmartHome.g:1372:1: rule__AnalogSensor__Group__3 : rule__AnalogSensor__Group__3__Impl rule__AnalogSensor__Group__4 ;
    public final void rule__AnalogSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1376:1: ( rule__AnalogSensor__Group__3__Impl rule__AnalogSensor__Group__4 )
            // InternalSmartHome.g:1377:2: rule__AnalogSensor__Group__3__Impl rule__AnalogSensor__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__AnalogSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__4();

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
    // $ANTLR end "rule__AnalogSensor__Group__3"


    // $ANTLR start "rule__AnalogSensor__Group__3__Impl"
    // InternalSmartHome.g:1384:1: rule__AnalogSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__AnalogSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1388:1: ( ( 'on' ) )
            // InternalSmartHome.g:1389:1: ( 'on' )
            {
            // InternalSmartHome.g:1389:1: ( 'on' )
            // InternalSmartHome.g:1390:2: 'on'
            {
             before(grammarAccess.getAnalogSensorAccess().getOnKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAnalogSensorAccess().getOnKeyword_3()); 

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
    // $ANTLR end "rule__AnalogSensor__Group__3__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__4"
    // InternalSmartHome.g:1399:1: rule__AnalogSensor__Group__4 : rule__AnalogSensor__Group__4__Impl rule__AnalogSensor__Group__5 ;
    public final void rule__AnalogSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1403:1: ( rule__AnalogSensor__Group__4__Impl rule__AnalogSensor__Group__5 )
            // InternalSmartHome.g:1404:2: rule__AnalogSensor__Group__4__Impl rule__AnalogSensor__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__AnalogSensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__5();

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
    // $ANTLR end "rule__AnalogSensor__Group__4"


    // $ANTLR start "rule__AnalogSensor__Group__4__Impl"
    // InternalSmartHome.g:1411:1: rule__AnalogSensor__Group__4__Impl : ( ( rule__AnalogSensor__LocationAssignment_4 ) ) ;
    public final void rule__AnalogSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1415:1: ( ( ( rule__AnalogSensor__LocationAssignment_4 ) ) )
            // InternalSmartHome.g:1416:1: ( ( rule__AnalogSensor__LocationAssignment_4 ) )
            {
            // InternalSmartHome.g:1416:1: ( ( rule__AnalogSensor__LocationAssignment_4 ) )
            // InternalSmartHome.g:1417:2: ( rule__AnalogSensor__LocationAssignment_4 )
            {
             before(grammarAccess.getAnalogSensorAccess().getLocationAssignment_4()); 
            // InternalSmartHome.g:1418:2: ( rule__AnalogSensor__LocationAssignment_4 )
            // InternalSmartHome.g:1418:3: rule__AnalogSensor__LocationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__LocationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnalogSensorAccess().getLocationAssignment_4()); 

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
    // $ANTLR end "rule__AnalogSensor__Group__4__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__5"
    // InternalSmartHome.g:1426:1: rule__AnalogSensor__Group__5 : rule__AnalogSensor__Group__5__Impl rule__AnalogSensor__Group__6 ;
    public final void rule__AnalogSensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1430:1: ( rule__AnalogSensor__Group__5__Impl rule__AnalogSensor__Group__6 )
            // InternalSmartHome.g:1431:2: rule__AnalogSensor__Group__5__Impl rule__AnalogSensor__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__AnalogSensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__6();

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
    // $ANTLR end "rule__AnalogSensor__Group__5"


    // $ANTLR start "rule__AnalogSensor__Group__5__Impl"
    // InternalSmartHome.g:1438:1: rule__AnalogSensor__Group__5__Impl : ( 'reacts' ) ;
    public final void rule__AnalogSensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1442:1: ( ( 'reacts' ) )
            // InternalSmartHome.g:1443:1: ( 'reacts' )
            {
            // InternalSmartHome.g:1443:1: ( 'reacts' )
            // InternalSmartHome.g:1444:2: 'reacts'
            {
             before(grammarAccess.getAnalogSensorAccess().getReactsKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAnalogSensorAccess().getReactsKeyword_5()); 

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
    // $ANTLR end "rule__AnalogSensor__Group__5__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__6"
    // InternalSmartHome.g:1453:1: rule__AnalogSensor__Group__6 : rule__AnalogSensor__Group__6__Impl rule__AnalogSensor__Group__7 ;
    public final void rule__AnalogSensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1457:1: ( rule__AnalogSensor__Group__6__Impl rule__AnalogSensor__Group__7 )
            // InternalSmartHome.g:1458:2: rule__AnalogSensor__Group__6__Impl rule__AnalogSensor__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__AnalogSensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__7();

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
    // $ANTLR end "rule__AnalogSensor__Group__6"


    // $ANTLR start "rule__AnalogSensor__Group__6__Impl"
    // InternalSmartHome.g:1465:1: rule__AnalogSensor__Group__6__Impl : ( 'to' ) ;
    public final void rule__AnalogSensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1469:1: ( ( 'to' ) )
            // InternalSmartHome.g:1470:1: ( 'to' )
            {
            // InternalSmartHome.g:1470:1: ( 'to' )
            // InternalSmartHome.g:1471:2: 'to'
            {
             before(grammarAccess.getAnalogSensorAccess().getToKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAnalogSensorAccess().getToKeyword_6()); 

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
    // $ANTLR end "rule__AnalogSensor__Group__6__Impl"


    // $ANTLR start "rule__AnalogSensor__Group__7"
    // InternalSmartHome.g:1480:1: rule__AnalogSensor__Group__7 : rule__AnalogSensor__Group__7__Impl ;
    public final void rule__AnalogSensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1484:1: ( rule__AnalogSensor__Group__7__Impl )
            // InternalSmartHome.g:1485:2: rule__AnalogSensor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__Group__7__Impl();

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
    // $ANTLR end "rule__AnalogSensor__Group__7"


    // $ANTLR start "rule__AnalogSensor__Group__7__Impl"
    // InternalSmartHome.g:1491:1: rule__AnalogSensor__Group__7__Impl : ( ( rule__AnalogSensor__TypeAssignment_7 ) ) ;
    public final void rule__AnalogSensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1495:1: ( ( ( rule__AnalogSensor__TypeAssignment_7 ) ) )
            // InternalSmartHome.g:1496:1: ( ( rule__AnalogSensor__TypeAssignment_7 ) )
            {
            // InternalSmartHome.g:1496:1: ( ( rule__AnalogSensor__TypeAssignment_7 ) )
            // InternalSmartHome.g:1497:2: ( rule__AnalogSensor__TypeAssignment_7 )
            {
             before(grammarAccess.getAnalogSensorAccess().getTypeAssignment_7()); 
            // InternalSmartHome.g:1498:2: ( rule__AnalogSensor__TypeAssignment_7 )
            // InternalSmartHome.g:1498:3: rule__AnalogSensor__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AnalogSensor__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAnalogSensorAccess().getTypeAssignment_7()); 

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
    // $ANTLR end "rule__AnalogSensor__Group__7__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__0"
    // InternalSmartHome.g:1507:1: rule__DigitalSensor__Group__0 : rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1 ;
    public final void rule__DigitalSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1511:1: ( rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1 )
            // InternalSmartHome.g:1512:2: rule__DigitalSensor__Group__0__Impl rule__DigitalSensor__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmartHome.g:1519:1: rule__DigitalSensor__Group__0__Impl : ( () ) ;
    public final void rule__DigitalSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1523:1: ( ( () ) )
            // InternalSmartHome.g:1524:1: ( () )
            {
            // InternalSmartHome.g:1524:1: ( () )
            // InternalSmartHome.g:1525:2: ()
            {
             before(grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0()); 
            // InternalSmartHome.g:1526:2: ()
            // InternalSmartHome.g:1526:3: 
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
    // InternalSmartHome.g:1534:1: rule__DigitalSensor__Group__1 : rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2 ;
    public final void rule__DigitalSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1538:1: ( rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2 )
            // InternalSmartHome.g:1539:2: rule__DigitalSensor__Group__1__Impl rule__DigitalSensor__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSmartHome.g:1546:1: rule__DigitalSensor__Group__1__Impl : ( 'DigitalSensor' ) ;
    public final void rule__DigitalSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1550:1: ( ( 'DigitalSensor' ) )
            // InternalSmartHome.g:1551:1: ( 'DigitalSensor' )
            {
            // InternalSmartHome.g:1551:1: ( 'DigitalSensor' )
            // InternalSmartHome.g:1552:2: 'DigitalSensor'
            {
             before(grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSmartHome.g:1561:1: rule__DigitalSensor__Group__2 : rule__DigitalSensor__Group__2__Impl rule__DigitalSensor__Group__3 ;
    public final void rule__DigitalSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1565:1: ( rule__DigitalSensor__Group__2__Impl rule__DigitalSensor__Group__3 )
            // InternalSmartHome.g:1566:2: rule__DigitalSensor__Group__2__Impl rule__DigitalSensor__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__DigitalSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__3();

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
    // InternalSmartHome.g:1573:1: rule__DigitalSensor__Group__2__Impl : ( ( rule__DigitalSensor__NameAssignment_2 ) ) ;
    public final void rule__DigitalSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1577:1: ( ( ( rule__DigitalSensor__NameAssignment_2 ) ) )
            // InternalSmartHome.g:1578:1: ( ( rule__DigitalSensor__NameAssignment_2 ) )
            {
            // InternalSmartHome.g:1578:1: ( ( rule__DigitalSensor__NameAssignment_2 ) )
            // InternalSmartHome.g:1579:2: ( rule__DigitalSensor__NameAssignment_2 )
            {
             before(grammarAccess.getDigitalSensorAccess().getNameAssignment_2()); 
            // InternalSmartHome.g:1580:2: ( rule__DigitalSensor__NameAssignment_2 )
            // InternalSmartHome.g:1580:3: rule__DigitalSensor__NameAssignment_2
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


    // $ANTLR start "rule__DigitalSensor__Group__3"
    // InternalSmartHome.g:1588:1: rule__DigitalSensor__Group__3 : rule__DigitalSensor__Group__3__Impl rule__DigitalSensor__Group__4 ;
    public final void rule__DigitalSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1592:1: ( rule__DigitalSensor__Group__3__Impl rule__DigitalSensor__Group__4 )
            // InternalSmartHome.g:1593:2: rule__DigitalSensor__Group__3__Impl rule__DigitalSensor__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DigitalSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__4();

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
    // $ANTLR end "rule__DigitalSensor__Group__3"


    // $ANTLR start "rule__DigitalSensor__Group__3__Impl"
    // InternalSmartHome.g:1600:1: rule__DigitalSensor__Group__3__Impl : ( 'on' ) ;
    public final void rule__DigitalSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1604:1: ( ( 'on' ) )
            // InternalSmartHome.g:1605:1: ( 'on' )
            {
            // InternalSmartHome.g:1605:1: ( 'on' )
            // InternalSmartHome.g:1606:2: 'on'
            {
             before(grammarAccess.getDigitalSensorAccess().getOnKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDigitalSensorAccess().getOnKeyword_3()); 

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
    // $ANTLR end "rule__DigitalSensor__Group__3__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__4"
    // InternalSmartHome.g:1615:1: rule__DigitalSensor__Group__4 : rule__DigitalSensor__Group__4__Impl rule__DigitalSensor__Group__5 ;
    public final void rule__DigitalSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1619:1: ( rule__DigitalSensor__Group__4__Impl rule__DigitalSensor__Group__5 )
            // InternalSmartHome.g:1620:2: rule__DigitalSensor__Group__4__Impl rule__DigitalSensor__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__DigitalSensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__5();

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
    // $ANTLR end "rule__DigitalSensor__Group__4"


    // $ANTLR start "rule__DigitalSensor__Group__4__Impl"
    // InternalSmartHome.g:1627:1: rule__DigitalSensor__Group__4__Impl : ( ( rule__DigitalSensor__LocationAssignment_4 ) ) ;
    public final void rule__DigitalSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1631:1: ( ( ( rule__DigitalSensor__LocationAssignment_4 ) ) )
            // InternalSmartHome.g:1632:1: ( ( rule__DigitalSensor__LocationAssignment_4 ) )
            {
            // InternalSmartHome.g:1632:1: ( ( rule__DigitalSensor__LocationAssignment_4 ) )
            // InternalSmartHome.g:1633:2: ( rule__DigitalSensor__LocationAssignment_4 )
            {
             before(grammarAccess.getDigitalSensorAccess().getLocationAssignment_4()); 
            // InternalSmartHome.g:1634:2: ( rule__DigitalSensor__LocationAssignment_4 )
            // InternalSmartHome.g:1634:3: rule__DigitalSensor__LocationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__LocationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDigitalSensorAccess().getLocationAssignment_4()); 

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
    // $ANTLR end "rule__DigitalSensor__Group__4__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__5"
    // InternalSmartHome.g:1642:1: rule__DigitalSensor__Group__5 : rule__DigitalSensor__Group__5__Impl rule__DigitalSensor__Group__6 ;
    public final void rule__DigitalSensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1646:1: ( rule__DigitalSensor__Group__5__Impl rule__DigitalSensor__Group__6 )
            // InternalSmartHome.g:1647:2: rule__DigitalSensor__Group__5__Impl rule__DigitalSensor__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__DigitalSensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__6();

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
    // $ANTLR end "rule__DigitalSensor__Group__5"


    // $ANTLR start "rule__DigitalSensor__Group__5__Impl"
    // InternalSmartHome.g:1654:1: rule__DigitalSensor__Group__5__Impl : ( 'reacts' ) ;
    public final void rule__DigitalSensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1658:1: ( ( 'reacts' ) )
            // InternalSmartHome.g:1659:1: ( 'reacts' )
            {
            // InternalSmartHome.g:1659:1: ( 'reacts' )
            // InternalSmartHome.g:1660:2: 'reacts'
            {
             before(grammarAccess.getDigitalSensorAccess().getReactsKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDigitalSensorAccess().getReactsKeyword_5()); 

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
    // $ANTLR end "rule__DigitalSensor__Group__5__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__6"
    // InternalSmartHome.g:1669:1: rule__DigitalSensor__Group__6 : rule__DigitalSensor__Group__6__Impl rule__DigitalSensor__Group__7 ;
    public final void rule__DigitalSensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1673:1: ( rule__DigitalSensor__Group__6__Impl rule__DigitalSensor__Group__7 )
            // InternalSmartHome.g:1674:2: rule__DigitalSensor__Group__6__Impl rule__DigitalSensor__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__DigitalSensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__7();

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
    // $ANTLR end "rule__DigitalSensor__Group__6"


    // $ANTLR start "rule__DigitalSensor__Group__6__Impl"
    // InternalSmartHome.g:1681:1: rule__DigitalSensor__Group__6__Impl : ( 'to' ) ;
    public final void rule__DigitalSensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1685:1: ( ( 'to' ) )
            // InternalSmartHome.g:1686:1: ( 'to' )
            {
            // InternalSmartHome.g:1686:1: ( 'to' )
            // InternalSmartHome.g:1687:2: 'to'
            {
             before(grammarAccess.getDigitalSensorAccess().getToKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDigitalSensorAccess().getToKeyword_6()); 

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
    // $ANTLR end "rule__DigitalSensor__Group__6__Impl"


    // $ANTLR start "rule__DigitalSensor__Group__7"
    // InternalSmartHome.g:1696:1: rule__DigitalSensor__Group__7 : rule__DigitalSensor__Group__7__Impl ;
    public final void rule__DigitalSensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1700:1: ( rule__DigitalSensor__Group__7__Impl )
            // InternalSmartHome.g:1701:2: rule__DigitalSensor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__Group__7__Impl();

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
    // $ANTLR end "rule__DigitalSensor__Group__7"


    // $ANTLR start "rule__DigitalSensor__Group__7__Impl"
    // InternalSmartHome.g:1707:1: rule__DigitalSensor__Group__7__Impl : ( ( rule__DigitalSensor__TypeAssignment_7 ) ) ;
    public final void rule__DigitalSensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1711:1: ( ( ( rule__DigitalSensor__TypeAssignment_7 ) ) )
            // InternalSmartHome.g:1712:1: ( ( rule__DigitalSensor__TypeAssignment_7 ) )
            {
            // InternalSmartHome.g:1712:1: ( ( rule__DigitalSensor__TypeAssignment_7 ) )
            // InternalSmartHome.g:1713:2: ( rule__DigitalSensor__TypeAssignment_7 )
            {
             before(grammarAccess.getDigitalSensorAccess().getTypeAssignment_7()); 
            // InternalSmartHome.g:1714:2: ( rule__DigitalSensor__TypeAssignment_7 )
            // InternalSmartHome.g:1714:3: rule__DigitalSensor__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSensor__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDigitalSensorAccess().getTypeAssignment_7()); 

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
    // $ANTLR end "rule__DigitalSensor__Group__7__Impl"


    // $ANTLR start "rule__SensorCSV__Group__0"
    // InternalSmartHome.g:1723:1: rule__SensorCSV__Group__0 : rule__SensorCSV__Group__0__Impl rule__SensorCSV__Group__1 ;
    public final void rule__SensorCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1727:1: ( rule__SensorCSV__Group__0__Impl rule__SensorCSV__Group__1 )
            // InternalSmartHome.g:1728:2: rule__SensorCSV__Group__0__Impl rule__SensorCSV__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SensorCSV__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorCSV__Group__1();

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
    // $ANTLR end "rule__SensorCSV__Group__0"


    // $ANTLR start "rule__SensorCSV__Group__0__Impl"
    // InternalSmartHome.g:1735:1: rule__SensorCSV__Group__0__Impl : ( () ) ;
    public final void rule__SensorCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1739:1: ( ( () ) )
            // InternalSmartHome.g:1740:1: ( () )
            {
            // InternalSmartHome.g:1740:1: ( () )
            // InternalSmartHome.g:1741:2: ()
            {
             before(grammarAccess.getSensorCSVAccess().getSensorCSVAction_0()); 
            // InternalSmartHome.g:1742:2: ()
            // InternalSmartHome.g:1742:3: 
            {
            }

             after(grammarAccess.getSensorCSVAccess().getSensorCSVAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorCSV__Group__0__Impl"


    // $ANTLR start "rule__SensorCSV__Group__1"
    // InternalSmartHome.g:1750:1: rule__SensorCSV__Group__1 : rule__SensorCSV__Group__1__Impl rule__SensorCSV__Group__2 ;
    public final void rule__SensorCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1754:1: ( rule__SensorCSV__Group__1__Impl rule__SensorCSV__Group__2 )
            // InternalSmartHome.g:1755:2: rule__SensorCSV__Group__1__Impl rule__SensorCSV__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SensorCSV__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorCSV__Group__2();

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
    // $ANTLR end "rule__SensorCSV__Group__1"


    // $ANTLR start "rule__SensorCSV__Group__1__Impl"
    // InternalSmartHome.g:1762:1: rule__SensorCSV__Group__1__Impl : ( 'SensorCSV' ) ;
    public final void rule__SensorCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1766:1: ( ( 'SensorCSV' ) )
            // InternalSmartHome.g:1767:1: ( 'SensorCSV' )
            {
            // InternalSmartHome.g:1767:1: ( 'SensorCSV' )
            // InternalSmartHome.g:1768:2: 'SensorCSV'
            {
             before(grammarAccess.getSensorCSVAccess().getSensorCSVKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorCSVAccess().getSensorCSVKeyword_1()); 

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
    // $ANTLR end "rule__SensorCSV__Group__1__Impl"


    // $ANTLR start "rule__SensorCSV__Group__2"
    // InternalSmartHome.g:1777:1: rule__SensorCSV__Group__2 : rule__SensorCSV__Group__2__Impl rule__SensorCSV__Group__3 ;
    public final void rule__SensorCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1781:1: ( rule__SensorCSV__Group__2__Impl rule__SensorCSV__Group__3 )
            // InternalSmartHome.g:1782:2: rule__SensorCSV__Group__2__Impl rule__SensorCSV__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__SensorCSV__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorCSV__Group__3();

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
    // $ANTLR end "rule__SensorCSV__Group__2"


    // $ANTLR start "rule__SensorCSV__Group__2__Impl"
    // InternalSmartHome.g:1789:1: rule__SensorCSV__Group__2__Impl : ( ( rule__SensorCSV__NameAssignment_2 ) ) ;
    public final void rule__SensorCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1793:1: ( ( ( rule__SensorCSV__NameAssignment_2 ) ) )
            // InternalSmartHome.g:1794:1: ( ( rule__SensorCSV__NameAssignment_2 ) )
            {
            // InternalSmartHome.g:1794:1: ( ( rule__SensorCSV__NameAssignment_2 ) )
            // InternalSmartHome.g:1795:2: ( rule__SensorCSV__NameAssignment_2 )
            {
             before(grammarAccess.getSensorCSVAccess().getNameAssignment_2()); 
            // InternalSmartHome.g:1796:2: ( rule__SensorCSV__NameAssignment_2 )
            // InternalSmartHome.g:1796:3: rule__SensorCSV__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SensorCSV__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorCSVAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SensorCSV__Group__2__Impl"


    // $ANTLR start "rule__SensorCSV__Group__3"
    // InternalSmartHome.g:1804:1: rule__SensorCSV__Group__3 : rule__SensorCSV__Group__3__Impl rule__SensorCSV__Group__4 ;
    public final void rule__SensorCSV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1808:1: ( rule__SensorCSV__Group__3__Impl rule__SensorCSV__Group__4 )
            // InternalSmartHome.g:1809:2: rule__SensorCSV__Group__3__Impl rule__SensorCSV__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SensorCSV__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorCSV__Group__4();

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
    // $ANTLR end "rule__SensorCSV__Group__3"


    // $ANTLR start "rule__SensorCSV__Group__3__Impl"
    // InternalSmartHome.g:1816:1: rule__SensorCSV__Group__3__Impl : ( 'from' ) ;
    public final void rule__SensorCSV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1820:1: ( ( 'from' ) )
            // InternalSmartHome.g:1821:1: ( 'from' )
            {
            // InternalSmartHome.g:1821:1: ( 'from' )
            // InternalSmartHome.g:1822:2: 'from'
            {
             before(grammarAccess.getSensorCSVAccess().getFromKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensorCSVAccess().getFromKeyword_3()); 

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
    // $ANTLR end "rule__SensorCSV__Group__3__Impl"


    // $ANTLR start "rule__SensorCSV__Group__4"
    // InternalSmartHome.g:1831:1: rule__SensorCSV__Group__4 : rule__SensorCSV__Group__4__Impl ;
    public final void rule__SensorCSV__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1835:1: ( rule__SensorCSV__Group__4__Impl )
            // InternalSmartHome.g:1836:2: rule__SensorCSV__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorCSV__Group__4__Impl();

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
    // $ANTLR end "rule__SensorCSV__Group__4"


    // $ANTLR start "rule__SensorCSV__Group__4__Impl"
    // InternalSmartHome.g:1842:1: rule__SensorCSV__Group__4__Impl : ( ( rule__SensorCSV__FileAssignment_4 ) ) ;
    public final void rule__SensorCSV__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1846:1: ( ( ( rule__SensorCSV__FileAssignment_4 ) ) )
            // InternalSmartHome.g:1847:1: ( ( rule__SensorCSV__FileAssignment_4 ) )
            {
            // InternalSmartHome.g:1847:1: ( ( rule__SensorCSV__FileAssignment_4 ) )
            // InternalSmartHome.g:1848:2: ( rule__SensorCSV__FileAssignment_4 )
            {
             before(grammarAccess.getSensorCSVAccess().getFileAssignment_4()); 
            // InternalSmartHome.g:1849:2: ( rule__SensorCSV__FileAssignment_4 )
            // InternalSmartHome.g:1849:3: rule__SensorCSV__FileAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SensorCSV__FileAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorCSVAccess().getFileAssignment_4()); 

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
    // $ANTLR end "rule__SensorCSV__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalSmartHome.g:1858:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1862:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalSmartHome.g:1863:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmartHome.g:1870:1: rule__Pattern__Group__0__Impl : ( () ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1874:1: ( ( () ) )
            // InternalSmartHome.g:1875:1: ( () )
            {
            // InternalSmartHome.g:1875:1: ( () )
            // InternalSmartHome.g:1876:2: ()
            {
             before(grammarAccess.getPatternAccess().getPatternAction_0()); 
            // InternalSmartHome.g:1877:2: ()
            // InternalSmartHome.g:1877:3: 
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
    // InternalSmartHome.g:1885:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1889:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalSmartHome.g:1890:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSmartHome.g:1897:1: rule__Pattern__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1901:1: ( ( 'Activity' ) )
            // InternalSmartHome.g:1902:1: ( 'Activity' )
            {
            // InternalSmartHome.g:1902:1: ( 'Activity' )
            // InternalSmartHome.g:1903:2: 'Activity'
            {
             before(grammarAccess.getPatternAccess().getActivityKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getActivityKeyword_1()); 

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
    // InternalSmartHome.g:1912:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1916:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalSmartHome.g:1917:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmartHome.g:1924:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__NameAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1928:1: ( ( ( rule__Pattern__NameAssignment_2 ) ) )
            // InternalSmartHome.g:1929:1: ( ( rule__Pattern__NameAssignment_2 ) )
            {
            // InternalSmartHome.g:1929:1: ( ( rule__Pattern__NameAssignment_2 ) )
            // InternalSmartHome.g:1930:2: ( rule__Pattern__NameAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_2()); 
            // InternalSmartHome.g:1931:2: ( rule__Pattern__NameAssignment_2 )
            // InternalSmartHome.g:1931:3: rule__Pattern__NameAssignment_2
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
    // InternalSmartHome.g:1939:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1943:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalSmartHome.g:1944:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmartHome.g:1951:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1955:1: ( ( '{' ) )
            // InternalSmartHome.g:1956:1: ( '{' )
            {
            // InternalSmartHome.g:1956:1: ( '{' )
            // InternalSmartHome.g:1957:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmartHome.g:1966:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1970:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalSmartHome.g:1971:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmartHome.g:1978:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )? ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1982:1: ( ( ( rule__Pattern__Group_4__0 )? ) )
            // InternalSmartHome.g:1983:1: ( ( rule__Pattern__Group_4__0 )? )
            {
            // InternalSmartHome.g:1983:1: ( ( rule__Pattern__Group_4__0 )? )
            // InternalSmartHome.g:1984:2: ( rule__Pattern__Group_4__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalSmartHome.g:1985:2: ( rule__Pattern__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmartHome.g:1985:3: rule__Pattern__Group_4__0
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
    // InternalSmartHome.g:1993:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:1997:1: ( rule__Pattern__Group__5__Impl )
            // InternalSmartHome.g:1998:2: rule__Pattern__Group__5__Impl
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
    // InternalSmartHome.g:2004:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2008:1: ( ( '}' ) )
            // InternalSmartHome.g:2009:1: ( '}' )
            {
            // InternalSmartHome.g:2009:1: ( '}' )
            // InternalSmartHome.g:2010:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSmartHome.g:2020:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2024:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalSmartHome.g:2025:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmartHome.g:2032:1: rule__Pattern__Group_4__0__Impl : ( 'rules' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2036:1: ( ( 'rules' ) )
            // InternalSmartHome.g:2037:1: ( 'rules' )
            {
            // InternalSmartHome.g:2037:1: ( 'rules' )
            // InternalSmartHome.g:2038:2: 'rules'
            {
             before(grammarAccess.getPatternAccess().getRulesKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRulesKeyword_4_0()); 

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
    // InternalSmartHome.g:2047:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2051:1: ( rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 )
            // InternalSmartHome.g:2052:2: rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Pattern__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__2();

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
    // InternalSmartHome.g:2059:1: rule__Pattern__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2063:1: ( ( '{' ) )
            // InternalSmartHome.g:2064:1: ( '{' )
            {
            // InternalSmartHome.g:2064:1: ( '{' )
            // InternalSmartHome.g:2065:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_4_1()); 

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


    // $ANTLR start "rule__Pattern__Group_4__2"
    // InternalSmartHome.g:2074:1: rule__Pattern__Group_4__2 : rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 ;
    public final void rule__Pattern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2078:1: ( rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 )
            // InternalSmartHome.g:2079:2: rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__Pattern__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__3();

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
    // $ANTLR end "rule__Pattern__Group_4__2"


    // $ANTLR start "rule__Pattern__Group_4__2__Impl"
    // InternalSmartHome.g:2086:1: rule__Pattern__Group_4__2__Impl : ( ( rule__Pattern__RulesAssignment_4_2 ) ) ;
    public final void rule__Pattern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2090:1: ( ( ( rule__Pattern__RulesAssignment_4_2 ) ) )
            // InternalSmartHome.g:2091:1: ( ( rule__Pattern__RulesAssignment_4_2 ) )
            {
            // InternalSmartHome.g:2091:1: ( ( rule__Pattern__RulesAssignment_4_2 ) )
            // InternalSmartHome.g:2092:2: ( rule__Pattern__RulesAssignment_4_2 )
            {
             before(grammarAccess.getPatternAccess().getRulesAssignment_4_2()); 
            // InternalSmartHome.g:2093:2: ( rule__Pattern__RulesAssignment_4_2 )
            // InternalSmartHome.g:2093:3: rule__Pattern__RulesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RulesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRulesAssignment_4_2()); 

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
    // $ANTLR end "rule__Pattern__Group_4__2__Impl"


    // $ANTLR start "rule__Pattern__Group_4__3"
    // InternalSmartHome.g:2101:1: rule__Pattern__Group_4__3 : rule__Pattern__Group_4__3__Impl rule__Pattern__Group_4__4 ;
    public final void rule__Pattern__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2105:1: ( rule__Pattern__Group_4__3__Impl rule__Pattern__Group_4__4 )
            // InternalSmartHome.g:2106:2: rule__Pattern__Group_4__3__Impl rule__Pattern__Group_4__4
            {
            pushFollow(FOLLOW_19);
            rule__Pattern__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__4();

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
    // $ANTLR end "rule__Pattern__Group_4__3"


    // $ANTLR start "rule__Pattern__Group_4__3__Impl"
    // InternalSmartHome.g:2113:1: rule__Pattern__Group_4__3__Impl : ( ( rule__Pattern__Group_4_3__0 )* ) ;
    public final void rule__Pattern__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2117:1: ( ( ( rule__Pattern__Group_4_3__0 )* ) )
            // InternalSmartHome.g:2118:1: ( ( rule__Pattern__Group_4_3__0 )* )
            {
            // InternalSmartHome.g:2118:1: ( ( rule__Pattern__Group_4_3__0 )* )
            // InternalSmartHome.g:2119:2: ( rule__Pattern__Group_4_3__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_4_3()); 
            // InternalSmartHome.g:2120:2: ( rule__Pattern__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSmartHome.g:2120:3: rule__Pattern__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Pattern__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Pattern__Group_4__3__Impl"


    // $ANTLR start "rule__Pattern__Group_4__4"
    // InternalSmartHome.g:2128:1: rule__Pattern__Group_4__4 : rule__Pattern__Group_4__4__Impl ;
    public final void rule__Pattern__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2132:1: ( rule__Pattern__Group_4__4__Impl )
            // InternalSmartHome.g:2133:2: rule__Pattern__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__4__Impl();

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
    // $ANTLR end "rule__Pattern__Group_4__4"


    // $ANTLR start "rule__Pattern__Group_4__4__Impl"
    // InternalSmartHome.g:2139:1: rule__Pattern__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Pattern__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2143:1: ( ( '}' ) )
            // InternalSmartHome.g:2144:1: ( '}' )
            {
            // InternalSmartHome.g:2144:1: ( '}' )
            // InternalSmartHome.g:2145:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Pattern__Group_4__4__Impl"


    // $ANTLR start "rule__Pattern__Group_4_3__0"
    // InternalSmartHome.g:2155:1: rule__Pattern__Group_4_3__0 : rule__Pattern__Group_4_3__0__Impl rule__Pattern__Group_4_3__1 ;
    public final void rule__Pattern__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2159:1: ( rule__Pattern__Group_4_3__0__Impl rule__Pattern__Group_4_3__1 )
            // InternalSmartHome.g:2160:2: rule__Pattern__Group_4_3__0__Impl rule__Pattern__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Pattern__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4_3__1();

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
    // $ANTLR end "rule__Pattern__Group_4_3__0"


    // $ANTLR start "rule__Pattern__Group_4_3__0__Impl"
    // InternalSmartHome.g:2167:1: rule__Pattern__Group_4_3__0__Impl : ( 'and' ) ;
    public final void rule__Pattern__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2171:1: ( ( 'and' ) )
            // InternalSmartHome.g:2172:1: ( 'and' )
            {
            // InternalSmartHome.g:2172:1: ( 'and' )
            // InternalSmartHome.g:2173:2: 'and'
            {
             before(grammarAccess.getPatternAccess().getAndKeyword_4_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getAndKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Pattern__Group_4_3__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4_3__1"
    // InternalSmartHome.g:2182:1: rule__Pattern__Group_4_3__1 : rule__Pattern__Group_4_3__1__Impl ;
    public final void rule__Pattern__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2186:1: ( rule__Pattern__Group_4_3__1__Impl )
            // InternalSmartHome.g:2187:2: rule__Pattern__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_4_3__1"


    // $ANTLR start "rule__Pattern__Group_4_3__1__Impl"
    // InternalSmartHome.g:2193:1: rule__Pattern__Group_4_3__1__Impl : ( ( rule__Pattern__RulesAssignment_4_3_1 ) ) ;
    public final void rule__Pattern__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2197:1: ( ( ( rule__Pattern__RulesAssignment_4_3_1 ) ) )
            // InternalSmartHome.g:2198:1: ( ( rule__Pattern__RulesAssignment_4_3_1 ) )
            {
            // InternalSmartHome.g:2198:1: ( ( rule__Pattern__RulesAssignment_4_3_1 ) )
            // InternalSmartHome.g:2199:2: ( rule__Pattern__RulesAssignment_4_3_1 )
            {
             before(grammarAccess.getPatternAccess().getRulesAssignment_4_3_1()); 
            // InternalSmartHome.g:2200:2: ( rule__Pattern__RulesAssignment_4_3_1 )
            // InternalSmartHome.g:2200:3: rule__Pattern__RulesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__RulesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRulesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Pattern__Group_4_3__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalSmartHome.g:2209:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2213:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSmartHome.g:2214:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSmartHome.g:2221:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2225:1: ( ( () ) )
            // InternalSmartHome.g:2226:1: ( () )
            {
            // InternalSmartHome.g:2226:1: ( () )
            // InternalSmartHome.g:2227:2: ()
            {
             before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            // InternalSmartHome.g:2228:2: ()
            // InternalSmartHome.g:2228:3: 
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
    // InternalSmartHome.g:2236:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2240:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSmartHome.g:2241:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalSmartHome.g:2248:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__PredicateAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2252:1: ( ( ( rule__Rule__PredicateAssignment_1 ) ) )
            // InternalSmartHome.g:2253:1: ( ( rule__Rule__PredicateAssignment_1 ) )
            {
            // InternalSmartHome.g:2253:1: ( ( rule__Rule__PredicateAssignment_1 ) )
            // InternalSmartHome.g:2254:2: ( rule__Rule__PredicateAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getPredicateAssignment_1()); 
            // InternalSmartHome.g:2255:2: ( rule__Rule__PredicateAssignment_1 )
            // InternalSmartHome.g:2255:3: rule__Rule__PredicateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PredicateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicateAssignment_1()); 

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
    // InternalSmartHome.g:2263:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2267:1: ( rule__Rule__Group__2__Impl )
            // InternalSmartHome.g:2268:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

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
    // InternalSmartHome.g:2274:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Group_2__0 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2278:1: ( ( ( rule__Rule__Group_2__0 )? ) )
            // InternalSmartHome.g:2279:1: ( ( rule__Rule__Group_2__0 )? )
            {
            // InternalSmartHome.g:2279:1: ( ( rule__Rule__Group_2__0 )? )
            // InternalSmartHome.g:2280:2: ( rule__Rule__Group_2__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_2()); 
            // InternalSmartHome.g:2281:2: ( rule__Rule__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmartHome.g:2281:3: rule__Rule__Group_2__0
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


    // $ANTLR start "rule__Rule__Group_2__0"
    // InternalSmartHome.g:2290:1: rule__Rule__Group_2__0 : rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 ;
    public final void rule__Rule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2294:1: ( rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 )
            // InternalSmartHome.g:2295:2: rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSmartHome.g:2302:1: rule__Rule__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__Rule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2306:1: ( ( 'for' ) )
            // InternalSmartHome.g:2307:1: ( 'for' )
            {
            // InternalSmartHome.g:2307:1: ( 'for' )
            // InternalSmartHome.g:2308:2: 'for'
            {
             before(grammarAccess.getRuleAccess().getForKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getForKeyword_2_0()); 

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
    // InternalSmartHome.g:2317:1: rule__Rule__Group_2__1 : rule__Rule__Group_2__1__Impl ;
    public final void rule__Rule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2321:1: ( rule__Rule__Group_2__1__Impl )
            // InternalSmartHome.g:2322:2: rule__Rule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__1__Impl();

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
    // InternalSmartHome.g:2328:1: rule__Rule__Group_2__1__Impl : ( ( rule__Rule__DurationAssignment_2_1 ) ) ;
    public final void rule__Rule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2332:1: ( ( ( rule__Rule__DurationAssignment_2_1 ) ) )
            // InternalSmartHome.g:2333:1: ( ( rule__Rule__DurationAssignment_2_1 ) )
            {
            // InternalSmartHome.g:2333:1: ( ( rule__Rule__DurationAssignment_2_1 ) )
            // InternalSmartHome.g:2334:2: ( rule__Rule__DurationAssignment_2_1 )
            {
             before(grammarAccess.getRuleAccess().getDurationAssignment_2_1()); 
            // InternalSmartHome.g:2335:2: ( rule__Rule__DurationAssignment_2_1 )
            // InternalSmartHome.g:2335:3: rule__Rule__DurationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DurationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDurationAssignment_2_1()); 

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


    // $ANTLR start "rule__Duration__Group__0"
    // InternalSmartHome.g:2344:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2348:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalSmartHome.g:2349:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSmartHome.g:2356:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2360:1: ( ( () ) )
            // InternalSmartHome.g:2361:1: ( () )
            {
            // InternalSmartHome.g:2361:1: ( () )
            // InternalSmartHome.g:2362:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0()); 
            // InternalSmartHome.g:2363:2: ()
            // InternalSmartHome.g:2363:3: 
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
    // InternalSmartHome.g:2371:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl rule__Duration__Group__2 ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2375:1: ( rule__Duration__Group__1__Impl rule__Duration__Group__2 )
            // InternalSmartHome.g:2376:2: rule__Duration__Group__1__Impl rule__Duration__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSmartHome.g:2383:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__DurationAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2387:1: ( ( ( rule__Duration__DurationAssignment_1 ) ) )
            // InternalSmartHome.g:2388:1: ( ( rule__Duration__DurationAssignment_1 ) )
            {
            // InternalSmartHome.g:2388:1: ( ( rule__Duration__DurationAssignment_1 ) )
            // InternalSmartHome.g:2389:2: ( rule__Duration__DurationAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getDurationAssignment_1()); 
            // InternalSmartHome.g:2390:2: ( rule__Duration__DurationAssignment_1 )
            // InternalSmartHome.g:2390:3: rule__Duration__DurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__DurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getDurationAssignment_1()); 

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
    // InternalSmartHome.g:2398:1: rule__Duration__Group__2 : rule__Duration__Group__2__Impl ;
    public final void rule__Duration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2402:1: ( rule__Duration__Group__2__Impl )
            // InternalSmartHome.g:2403:2: rule__Duration__Group__2__Impl
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
    // InternalSmartHome.g:2409:1: rule__Duration__Group__2__Impl : ( ( rule__Duration__PrecisionAssignment_2 ) ) ;
    public final void rule__Duration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2413:1: ( ( ( rule__Duration__PrecisionAssignment_2 ) ) )
            // InternalSmartHome.g:2414:1: ( ( rule__Duration__PrecisionAssignment_2 ) )
            {
            // InternalSmartHome.g:2414:1: ( ( rule__Duration__PrecisionAssignment_2 ) )
            // InternalSmartHome.g:2415:2: ( rule__Duration__PrecisionAssignment_2 )
            {
             before(grammarAccess.getDurationAccess().getPrecisionAssignment_2()); 
            // InternalSmartHome.g:2416:2: ( rule__Duration__PrecisionAssignment_2 )
            // InternalSmartHome.g:2416:3: rule__Duration__PrecisionAssignment_2
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


    // $ANTLR start "rule__Home__RoomsAssignment_1_2"
    // InternalSmartHome.g:2425:1: rule__Home__RoomsAssignment_1_2 : ( ruleRoom ) ;
    public final void rule__Home__RoomsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2429:1: ( ( ruleRoom ) )
            // InternalSmartHome.g:2430:2: ( ruleRoom )
            {
            // InternalSmartHome.g:2430:2: ( ruleRoom )
            // InternalSmartHome.g:2431:3: ruleRoom
            {
             before(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Home__RoomsAssignment_1_2"


    // $ANTLR start "rule__Home__RoomsAssignment_1_3_1"
    // InternalSmartHome.g:2440:1: rule__Home__RoomsAssignment_1_3_1 : ( ruleRoom ) ;
    public final void rule__Home__RoomsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2444:1: ( ( ruleRoom ) )
            // InternalSmartHome.g:2445:2: ( ruleRoom )
            {
            // InternalSmartHome.g:2445:2: ( ruleRoom )
            // InternalSmartHome.g:2446:3: ruleRoom
            {
             before(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__Home__RoomsAssignment_1_3_1"


    // $ANTLR start "rule__Home__ActivitiesAssignment_2_2"
    // InternalSmartHome.g:2455:1: rule__Home__ActivitiesAssignment_2_2 : ( rulePattern ) ;
    public final void rule__Home__ActivitiesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2459:1: ( ( rulePattern ) )
            // InternalSmartHome.g:2460:2: ( rulePattern )
            {
            // InternalSmartHome.g:2460:2: ( rulePattern )
            // InternalSmartHome.g:2461:3: rulePattern
            {
             before(grammarAccess.getHomeAccess().getActivitiesPatternParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getActivitiesPatternParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Home__ActivitiesAssignment_2_2"


    // $ANTLR start "rule__Home__ActivitiesAssignment_2_3_1"
    // InternalSmartHome.g:2470:1: rule__Home__ActivitiesAssignment_2_3_1 : ( rulePattern ) ;
    public final void rule__Home__ActivitiesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2474:1: ( ( rulePattern ) )
            // InternalSmartHome.g:2475:2: ( rulePattern )
            {
            // InternalSmartHome.g:2475:2: ( rulePattern )
            // InternalSmartHome.g:2476:3: rulePattern
            {
             before(grammarAccess.getHomeAccess().getActivitiesPatternParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getActivitiesPatternParserRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__Home__ActivitiesAssignment_2_3_1"


    // $ANTLR start "rule__Room__NameAssignment_2"
    // InternalSmartHome.g:2485:1: rule__Room__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2489:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2490:2: ( ruleEString )
            {
            // InternalSmartHome.g:2490:2: ( ruleEString )
            // InternalSmartHome.g:2491:3: ruleEString
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
    // InternalSmartHome.g:2500:1: rule__Room__SensorsAssignment_4_2 : ( ( rule__Room__SensorsAlternatives_4_2_0 ) ) ;
    public final void rule__Room__SensorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2504:1: ( ( ( rule__Room__SensorsAlternatives_4_2_0 ) ) )
            // InternalSmartHome.g:2505:2: ( ( rule__Room__SensorsAlternatives_4_2_0 ) )
            {
            // InternalSmartHome.g:2505:2: ( ( rule__Room__SensorsAlternatives_4_2_0 ) )
            // InternalSmartHome.g:2506:3: ( rule__Room__SensorsAlternatives_4_2_0 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAlternatives_4_2_0()); 
            // InternalSmartHome.g:2507:3: ( rule__Room__SensorsAlternatives_4_2_0 )
            // InternalSmartHome.g:2507:4: rule__Room__SensorsAlternatives_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAlternatives_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAlternatives_4_2_0()); 

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
    // InternalSmartHome.g:2515:1: rule__Room__SensorsAssignment_4_3_1 : ( ( rule__Room__SensorsAlternatives_4_3_1_0 ) ) ;
    public final void rule__Room__SensorsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2519:1: ( ( ( rule__Room__SensorsAlternatives_4_3_1_0 ) ) )
            // InternalSmartHome.g:2520:2: ( ( rule__Room__SensorsAlternatives_4_3_1_0 ) )
            {
            // InternalSmartHome.g:2520:2: ( ( rule__Room__SensorsAlternatives_4_3_1_0 ) )
            // InternalSmartHome.g:2521:3: ( rule__Room__SensorsAlternatives_4_3_1_0 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAlternatives_4_3_1_0()); 
            // InternalSmartHome.g:2522:3: ( rule__Room__SensorsAlternatives_4_3_1_0 )
            // InternalSmartHome.g:2522:4: rule__Room__SensorsAlternatives_4_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAlternatives_4_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAlternatives_4_3_1_0()); 

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


    // $ANTLR start "rule__AnalogSensor__NameAssignment_2"
    // InternalSmartHome.g:2530:1: rule__AnalogSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AnalogSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2534:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2535:2: ( ruleEString )
            {
            // InternalSmartHome.g:2535:2: ( ruleEString )
            // InternalSmartHome.g:2536:3: ruleEString
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


    // $ANTLR start "rule__AnalogSensor__LocationAssignment_4"
    // InternalSmartHome.g:2545:1: rule__AnalogSensor__LocationAssignment_4 : ( ruleEString ) ;
    public final void rule__AnalogSensor__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2549:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2550:2: ( ruleEString )
            {
            // InternalSmartHome.g:2550:2: ( ruleEString )
            // InternalSmartHome.g:2551:3: ruleEString
            {
             before(grammarAccess.getAnalogSensorAccess().getLocationEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnalogSensorAccess().getLocationEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AnalogSensor__LocationAssignment_4"


    // $ANTLR start "rule__AnalogSensor__TypeAssignment_7"
    // InternalSmartHome.g:2560:1: rule__AnalogSensor__TypeAssignment_7 : ( ruleEString ) ;
    public final void rule__AnalogSensor__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2564:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2565:2: ( ruleEString )
            {
            // InternalSmartHome.g:2565:2: ( ruleEString )
            // InternalSmartHome.g:2566:3: ruleEString
            {
             before(grammarAccess.getAnalogSensorAccess().getTypeEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnalogSensorAccess().getTypeEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__AnalogSensor__TypeAssignment_7"


    // $ANTLR start "rule__DigitalSensor__NameAssignment_2"
    // InternalSmartHome.g:2575:1: rule__DigitalSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DigitalSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2579:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2580:2: ( ruleEString )
            {
            // InternalSmartHome.g:2580:2: ( ruleEString )
            // InternalSmartHome.g:2581:3: ruleEString
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


    // $ANTLR start "rule__DigitalSensor__LocationAssignment_4"
    // InternalSmartHome.g:2590:1: rule__DigitalSensor__LocationAssignment_4 : ( ruleEString ) ;
    public final void rule__DigitalSensor__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2594:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2595:2: ( ruleEString )
            {
            // InternalSmartHome.g:2595:2: ( ruleEString )
            // InternalSmartHome.g:2596:3: ruleEString
            {
             before(grammarAccess.getDigitalSensorAccess().getLocationEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDigitalSensorAccess().getLocationEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DigitalSensor__LocationAssignment_4"


    // $ANTLR start "rule__DigitalSensor__TypeAssignment_7"
    // InternalSmartHome.g:2605:1: rule__DigitalSensor__TypeAssignment_7 : ( ruleEString ) ;
    public final void rule__DigitalSensor__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2609:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2610:2: ( ruleEString )
            {
            // InternalSmartHome.g:2610:2: ( ruleEString )
            // InternalSmartHome.g:2611:3: ruleEString
            {
             before(grammarAccess.getDigitalSensorAccess().getTypeEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDigitalSensorAccess().getTypeEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__DigitalSensor__TypeAssignment_7"


    // $ANTLR start "rule__SensorCSV__NameAssignment_2"
    // InternalSmartHome.g:2620:1: rule__SensorCSV__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SensorCSV__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2624:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2625:2: ( ruleEString )
            {
            // InternalSmartHome.g:2625:2: ( ruleEString )
            // InternalSmartHome.g:2626:3: ruleEString
            {
             before(grammarAccess.getSensorCSVAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorCSVAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SensorCSV__NameAssignment_2"


    // $ANTLR start "rule__SensorCSV__FileAssignment_4"
    // InternalSmartHome.g:2635:1: rule__SensorCSV__FileAssignment_4 : ( ruleEString ) ;
    public final void rule__SensorCSV__FileAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2639:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2640:2: ( ruleEString )
            {
            // InternalSmartHome.g:2640:2: ( ruleEString )
            // InternalSmartHome.g:2641:3: ruleEString
            {
             before(grammarAccess.getSensorCSVAccess().getFileEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorCSVAccess().getFileEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SensorCSV__FileAssignment_4"


    // $ANTLR start "rule__Pattern__NameAssignment_2"
    // InternalSmartHome.g:2650:1: rule__Pattern__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2654:1: ( ( ruleEString ) )
            // InternalSmartHome.g:2655:2: ( ruleEString )
            {
            // InternalSmartHome.g:2655:2: ( ruleEString )
            // InternalSmartHome.g:2656:3: ruleEString
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


    // $ANTLR start "rule__Pattern__RulesAssignment_4_2"
    // InternalSmartHome.g:2665:1: rule__Pattern__RulesAssignment_4_2 : ( ruleRule ) ;
    public final void rule__Pattern__RulesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2669:1: ( ( ruleRule ) )
            // InternalSmartHome.g:2670:2: ( ruleRule )
            {
            // InternalSmartHome.g:2670:2: ( ruleRule )
            // InternalSmartHome.g:2671:3: ruleRule
            {
             before(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Pattern__RulesAssignment_4_2"


    // $ANTLR start "rule__Pattern__RulesAssignment_4_3_1"
    // InternalSmartHome.g:2680:1: rule__Pattern__RulesAssignment_4_3_1 : ( ruleRule ) ;
    public final void rule__Pattern__RulesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2684:1: ( ( ruleRule ) )
            // InternalSmartHome.g:2685:2: ( ruleRule )
            {
            // InternalSmartHome.g:2685:2: ( ruleRule )
            // InternalSmartHome.g:2686:3: ruleRule
            {
             before(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Pattern__RulesAssignment_4_3_1"


    // $ANTLR start "rule__Rule__PredicateAssignment_1"
    // InternalSmartHome.g:2695:1: rule__Rule__PredicateAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__PredicateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2699:1: ( ( ( ruleEString ) ) )
            // InternalSmartHome.g:2700:2: ( ( ruleEString ) )
            {
            // InternalSmartHome.g:2700:2: ( ( ruleEString ) )
            // InternalSmartHome.g:2701:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getPredicatePredicateCrossReference_1_0()); 
            // InternalSmartHome.g:2702:3: ( ruleEString )
            // InternalSmartHome.g:2703:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getPredicatePredicateEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatePredicateEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPredicatePredicateCrossReference_1_0()); 

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
    // $ANTLR end "rule__Rule__PredicateAssignment_1"


    // $ANTLR start "rule__Rule__DurationAssignment_2_1"
    // InternalSmartHome.g:2714:1: rule__Rule__DurationAssignment_2_1 : ( ruleDuration ) ;
    public final void rule__Rule__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2718:1: ( ( ruleDuration ) )
            // InternalSmartHome.g:2719:2: ( ruleDuration )
            {
            // InternalSmartHome.g:2719:2: ( ruleDuration )
            // InternalSmartHome.g:2720:3: ruleDuration
            {
             before(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Rule__DurationAssignment_2_1"


    // $ANTLR start "rule__Duration__DurationAssignment_1"
    // InternalSmartHome.g:2729:1: rule__Duration__DurationAssignment_1 : ( RULE_INT ) ;
    public final void rule__Duration__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2733:1: ( ( RULE_INT ) )
            // InternalSmartHome.g:2734:2: ( RULE_INT )
            {
            // InternalSmartHome.g:2734:2: ( RULE_INT )
            // InternalSmartHome.g:2735:3: RULE_INT
            {
             before(grammarAccess.getDurationAccess().getDurationINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getDurationINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Duration__DurationAssignment_1"


    // $ANTLR start "rule__Duration__PrecisionAssignment_2"
    // InternalSmartHome.g:2744:1: rule__Duration__PrecisionAssignment_2 : ( rulePrecision ) ;
    public final void rule__Duration__PrecisionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartHome.g:2748:1: ( ( rulePrecision ) )
            // InternalSmartHome.g:2749:2: ( rulePrecision )
            {
            // InternalSmartHome.g:2749:2: ( rulePrecision )
            // InternalSmartHome.g:2750:3: rulePrecision
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000188000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000001C000L});

}