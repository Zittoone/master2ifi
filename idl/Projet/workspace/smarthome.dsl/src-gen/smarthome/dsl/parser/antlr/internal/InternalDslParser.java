package smarthome.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import smarthome.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'rooms'", "','", "'}'", "'persons'", "'patterns'", "'Room'", "'sensors'", "'Person'", "'Pattern'", "'rules'", "'('", "')'", "'Value'", "'value'", "'AnalogSensor'", "'DigitalSensor'", "'-'", "'.'", "'E'", "'e'", "'Duration'", "'time'", "'precision'", "'SensorPredicate'", "'operator'", "'sensor'", "'PersonPredicate'", "'activity'", "'person'", "'superior'", "'inferior'", "'equal'", "'standing'", "'laying'", "'sitting'", "'ms'", "'s'", "'m'"
    };
    public static final int T__50=50;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Home";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHome"
    // InternalDsl.g:65:1: entryRuleHome returns [EObject current=null] : iv_ruleHome= ruleHome EOF ;
    public final EObject entryRuleHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHome = null;


        try {
            // InternalDsl.g:65:45: (iv_ruleHome= ruleHome EOF )
            // InternalDsl.g:66:2: iv_ruleHome= ruleHome EOF
            {
             newCompositeNode(grammarAccess.getHomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHome=ruleHome();

            state._fsp--;

             current =iv_ruleHome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHome"


    // $ANTLR start "ruleHome"
    // InternalDsl.g:72:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_rooms_5_0 = null;

        EObject lv_rooms_7_0 = null;

        EObject lv_persons_11_0 = null;

        EObject lv_persons_13_0 = null;

        EObject lv_patterns_17_0 = null;

        EObject lv_patterns_19_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalDsl.g:79:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalDsl.g:79:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalDsl.g:80:3: () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalDsl.g:80:3: ()
            // InternalDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeAccess().getHomeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeAccess().getHomeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:95:3: (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:96:4: otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getHomeAccess().getRoomsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:104:4: ( (lv_rooms_5_0= ruleRoom ) )
                    // InternalDsl.g:105:5: (lv_rooms_5_0= ruleRoom )
                    {
                    // InternalDsl.g:105:5: (lv_rooms_5_0= ruleRoom )
                    // InternalDsl.g:106:6: lv_rooms_5_0= ruleRoom
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_rooms_5_0=ruleRoom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"rooms",
                    							lv_rooms_5_0,
                    							"smarthome.dsl.Dsl.Room");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:123:4: (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:124:5: otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHomeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:128:5: ( (lv_rooms_7_0= ruleRoom ) )
                    	    // InternalDsl.g:129:6: (lv_rooms_7_0= ruleRoom )
                    	    {
                    	    // InternalDsl.g:129:6: (lv_rooms_7_0= ruleRoom )
                    	    // InternalDsl.g:130:7: lv_rooms_7_0= ruleRoom
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_rooms_7_0=ruleRoom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rooms",
                    	    								lv_rooms_7_0,
                    	    								"smarthome.dsl.Dsl.Room");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:153:3: (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:154:4: otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getHomeAccess().getPersonsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:162:4: ( (lv_persons_11_0= rulePerson ) )
                    // InternalDsl.g:163:5: (lv_persons_11_0= rulePerson )
                    {
                    // InternalDsl.g:163:5: (lv_persons_11_0= rulePerson )
                    // InternalDsl.g:164:6: lv_persons_11_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_persons_11_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"persons",
                    							lv_persons_11_0,
                    							"smarthome.dsl.Dsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:181:4: (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:182:5: otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getHomeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:186:5: ( (lv_persons_13_0= rulePerson ) )
                    	    // InternalDsl.g:187:6: (lv_persons_13_0= rulePerson )
                    	    {
                    	    // InternalDsl.g:187:6: (lv_persons_13_0= rulePerson )
                    	    // InternalDsl.g:188:7: lv_persons_13_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_persons_13_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"persons",
                    	    								lv_persons_13_0,
                    	    								"smarthome.dsl.Dsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:211:3: (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:212:4: otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getHomeAccess().getPatternsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:220:4: ( (lv_patterns_17_0= rulePattern ) )
                    // InternalDsl.g:221:5: (lv_patterns_17_0= rulePattern )
                    {
                    // InternalDsl.g:221:5: (lv_patterns_17_0= rulePattern )
                    // InternalDsl.g:222:6: lv_patterns_17_0= rulePattern
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_patterns_17_0=rulePattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"patterns",
                    							lv_patterns_17_0,
                    							"smarthome.dsl.Dsl.Pattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:239:4: (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:240:5: otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getHomeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:244:5: ( (lv_patterns_19_0= rulePattern ) )
                    	    // InternalDsl.g:245:6: (lv_patterns_19_0= rulePattern )
                    	    {
                    	    // InternalDsl.g:245:6: (lv_patterns_19_0= rulePattern )
                    	    // InternalDsl.g:246:7: lv_patterns_19_0= rulePattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_patterns_19_0=rulePattern();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"patterns",
                    	    								lv_patterns_19_0,
                    	    								"smarthome.dsl.Dsl.Pattern");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleSensor"
    // InternalDsl.g:277:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDsl.g:277:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDsl.g:278:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalDsl.g:284:1: ruleSensor returns [EObject current=null] : (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_AnalogSensor_0 = null;

        EObject this_DigitalSensor_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:290:2: ( (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor ) )
            // InternalDsl.g:291:2: (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor )
            {
            // InternalDsl.g:291:2: (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:292:3: this_AnalogSensor_0= ruleAnalogSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getAnalogSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalogSensor_0=ruleAnalogSensor();

                    state._fsp--;


                    			current = this_AnalogSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:301:3: this_DigitalSensor_1= ruleDigitalSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getDigitalSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DigitalSensor_1=ruleDigitalSensor();

                    state._fsp--;


                    			current = this_DigitalSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleRoom"
    // InternalDsl.g:313:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalDsl.g:313:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalDsl.g:314:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalDsl.g:320:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_6_0 = null;

        EObject lv_sensors_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:326:2: ( ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDsl.g:327:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDsl.g:327:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDsl.g:328:3: () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDsl.g:328:3: ()
            // InternalDsl.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalDsl.g:339:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:340:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:340:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:341:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:362:3: (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:363:4: otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoomAccess().getSensorsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:371:4: ( (lv_sensors_6_0= ruleSensor ) )
                    // InternalDsl.g:372:5: (lv_sensors_6_0= ruleSensor )
                    {
                    // InternalDsl.g:372:5: (lv_sensors_6_0= ruleSensor )
                    // InternalDsl.g:373:6: lv_sensors_6_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_sensors_6_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						add(
                    							current,
                    							"sensors",
                    							lv_sensors_6_0,
                    							"smarthome.dsl.Dsl.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:390:4: (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDsl.g:391:5: otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:395:5: ( (lv_sensors_8_0= ruleSensor ) )
                    	    // InternalDsl.g:396:6: (lv_sensors_8_0= ruleSensor )
                    	    {
                    	    // InternalDsl.g:396:6: (lv_sensors_8_0= ruleSensor )
                    	    // InternalDsl.g:397:7: lv_sensors_8_0= ruleSensor
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_sensors_8_0=ruleSensor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensors",
                    	    								lv_sensors_8_0,
                    	    								"smarthome.dsl.Dsl.Sensor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:428:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalDsl.g:428:47: (iv_rulePerson= rulePerson EOF )
            // InternalDsl.g:429:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:435:1: rulePerson returns [EObject current=null] : ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:441:2: ( ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:442:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:442:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:443:3: () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:443:3: ()
            // InternalDsl.g:444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getPersonKeyword_1());
            		
            // InternalDsl.g:454:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:455:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:455:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:456:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRulePattern"
    // InternalDsl.g:477:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalDsl.g:477:48: (iv_rulePattern= rulePattern EOF )
            // InternalDsl.g:478:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalDsl.g:484:1: rulePattern returns [EObject current=null] : ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:490:2: ( ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalDsl.g:491:2: ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalDsl.g:491:2: ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalDsl.g:492:3: () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalDsl.g:492:3: ()
            // InternalDsl.g:493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getPatternKeyword_1());
            		
            // InternalDsl.g:503:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:504:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:504:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:505:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:526:3: (otherlv_4= 'rules' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:527:4: otherlv_4= 'rules' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getRulesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:535:4: ( ( ruleEString ) )
                    // InternalDsl.g:536:5: ( ruleEString )
                    {
                    // InternalDsl.g:536:5: ( ruleEString )
                    // InternalDsl.g:537:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatternRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:551:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:552:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:556:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:557:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:557:6: ( ruleEString )
                    	    // InternalDsl.g:558:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPatternRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:586:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:586:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:587:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:593:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:599:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:600:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:600:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:601:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:609:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleValue"
    // InternalDsl.g:620:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalDsl.g:620:46: (iv_ruleValue= ruleValue EOF )
            // InternalDsl.g:621:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalDsl.g:627:1: ruleValue returns [EObject current=null] : ( () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:633:2: ( ( () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalDsl.g:634:2: ( () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalDsl.g:634:2: ( () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalDsl.g:635:3: () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalDsl.g:635:3: ()
            // InternalDsl.g:636:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getValueAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:650:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:651:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getValueAccess().getValueKeyword_3_0());
                    			
                    // InternalDsl.g:655:4: ( (lv_value_4_0= ruleEDouble ) )
                    // InternalDsl.g:656:5: (lv_value_4_0= ruleEDouble )
                    {
                    // InternalDsl.g:656:5: (lv_value_4_0= ruleEDouble )
                    // InternalDsl.g:657:6: lv_value_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getValueEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"smarthome.dsl.Dsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAnalogSensor"
    // InternalDsl.g:683:1: entryRuleAnalogSensor returns [EObject current=null] : iv_ruleAnalogSensor= ruleAnalogSensor EOF ;
    public final EObject entryRuleAnalogSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogSensor = null;


        try {
            // InternalDsl.g:683:53: (iv_ruleAnalogSensor= ruleAnalogSensor EOF )
            // InternalDsl.g:684:2: iv_ruleAnalogSensor= ruleAnalogSensor EOF
            {
             newCompositeNode(grammarAccess.getAnalogSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogSensor=ruleAnalogSensor();

            state._fsp--;

             current =iv_ruleAnalogSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalogSensor"


    // $ANTLR start "ruleAnalogSensor"
    // InternalDsl.g:690:1: ruleAnalogSensor returns [EObject current=null] : ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAnalogSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:696:2: ( ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}' ) )
            // InternalDsl.g:697:2: ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}' )
            {
            // InternalDsl.g:697:2: ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}' )
            // InternalDsl.g:698:3: () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}'
            {
            // InternalDsl.g:698:3: ()
            // InternalDsl.g:699:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1());
            		
            // InternalDsl.g:709:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:710:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:710:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:711:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAnalogSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:732:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:733:4: otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getAnalogSensorAccess().getValueKeyword_4_0());
                    			
                    // InternalDsl.g:737:4: ( (lv_value_5_0= ruleValue ) )
                    // InternalDsl.g:738:5: (lv_value_5_0= ruleValue )
                    {
                    // InternalDsl.g:738:5: (lv_value_5_0= ruleValue )
                    // InternalDsl.g:739:6: lv_value_5_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getAnalogSensorAccess().getValueValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_5_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"smarthome.dsl.Dsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAnalogSensorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalogSensor"


    // $ANTLR start "entryRuleDigitalSensor"
    // InternalDsl.g:765:1: entryRuleDigitalSensor returns [EObject current=null] : iv_ruleDigitalSensor= ruleDigitalSensor EOF ;
    public final EObject entryRuleDigitalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalSensor = null;


        try {
            // InternalDsl.g:765:54: (iv_ruleDigitalSensor= ruleDigitalSensor EOF )
            // InternalDsl.g:766:2: iv_ruleDigitalSensor= ruleDigitalSensor EOF
            {
             newCompositeNode(grammarAccess.getDigitalSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigitalSensor=ruleDigitalSensor();

            state._fsp--;

             current =iv_ruleDigitalSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigitalSensor"


    // $ANTLR start "ruleDigitalSensor"
    // InternalDsl.g:772:1: ruleDigitalSensor returns [EObject current=null] : ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDigitalSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:778:2: ( ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}' ) )
            // InternalDsl.g:779:2: ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}' )
            {
            // InternalDsl.g:779:2: ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}' )
            // InternalDsl.g:780:3: () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= '}'
            {
            // InternalDsl.g:780:3: ()
            // InternalDsl.g:781:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1());
            		
            // InternalDsl.g:791:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:792:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:792:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:793:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smarthome.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getDigitalSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:814:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:815:4: otherlv_4= 'value' ( (lv_value_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getDigitalSensorAccess().getValueKeyword_4_0());
                    			
                    // InternalDsl.g:819:4: ( (lv_value_5_0= ruleValue ) )
                    // InternalDsl.g:820:5: (lv_value_5_0= ruleValue )
                    {
                    // InternalDsl.g:820:5: (lv_value_5_0= ruleValue )
                    // InternalDsl.g:821:6: lv_value_5_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getDigitalSensorAccess().getValueValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_5_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDigitalSensorRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"smarthome.dsl.Dsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDigitalSensorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigitalSensor"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:847:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:847:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:848:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:854:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:860:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:861:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:861:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:862:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:862:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:863:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:869:3: (this_INT_1= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:870:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_22); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,30,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_24); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:890:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=31 && LA20_0<=32)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:891:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:891:4: (kw= 'E' | kw= 'e' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==31) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==32) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDsl.g:892:5: kw= 'E'
                            {
                            kw=(Token)match(input,31,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:898:5: kw= 'e'
                            {
                            kw=(Token)match(input,32,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:904:4: (kw= '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDsl.g:905:5: kw= '-'
                            {
                            kw=(Token)match(input,29,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleDuration"
    // InternalDsl.g:923:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalDsl.g:923:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalDsl.g:924:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalDsl.g:930:1: ruleDuration returns [EObject current=null] : ( () otherlv_1= 'Duration' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEInt ) ) )? (otherlv_5= 'precision' ( (lv_precision_6_0= rulePrecision ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_time_4_0 = null;

        Enumerator lv_precision_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:936:2: ( ( () otherlv_1= 'Duration' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEInt ) ) )? (otherlv_5= 'precision' ( (lv_precision_6_0= rulePrecision ) ) )? otherlv_7= '}' ) )
            // InternalDsl.g:937:2: ( () otherlv_1= 'Duration' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEInt ) ) )? (otherlv_5= 'precision' ( (lv_precision_6_0= rulePrecision ) ) )? otherlv_7= '}' )
            {
            // InternalDsl.g:937:2: ( () otherlv_1= 'Duration' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEInt ) ) )? (otherlv_5= 'precision' ( (lv_precision_6_0= rulePrecision ) ) )? otherlv_7= '}' )
            // InternalDsl.g:938:3: () otherlv_1= 'Duration' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEInt ) ) )? (otherlv_5= 'precision' ( (lv_precision_6_0= rulePrecision ) ) )? otherlv_7= '}'
            {
            // InternalDsl.g:938:3: ()
            // InternalDsl.g:939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDurationAccess().getDurationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:953:3: (otherlv_3= 'time' ( (lv_time_4_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:954:4: otherlv_3= 'time' ( (lv_time_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getDurationAccess().getTimeKeyword_3_0());
                    			
                    // InternalDsl.g:958:4: ( (lv_time_4_0= ruleEInt ) )
                    // InternalDsl.g:959:5: (lv_time_4_0= ruleEInt )
                    {
                    // InternalDsl.g:959:5: (lv_time_4_0= ruleEInt )
                    // InternalDsl.g:960:6: lv_time_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDurationAccess().getTimeEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_time_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDurationRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_4_0,
                    							"smarthome.dsl.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:978:3: (otherlv_5= 'precision' ( (lv_precision_6_0= rulePrecision ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:979:4: otherlv_5= 'precision' ( (lv_precision_6_0= rulePrecision ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getDurationAccess().getPrecisionKeyword_4_0());
                    			
                    // InternalDsl.g:983:4: ( (lv_precision_6_0= rulePrecision ) )
                    // InternalDsl.g:984:5: (lv_precision_6_0= rulePrecision )
                    {
                    // InternalDsl.g:984:5: (lv_precision_6_0= rulePrecision )
                    // InternalDsl.g:985:6: lv_precision_6_0= rulePrecision
                    {

                    						newCompositeNode(grammarAccess.getDurationAccess().getPrecisionPrecisionEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_precision_6_0=rulePrecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDurationRule());
                    						}
                    						set(
                    							current,
                    							"precision",
                    							lv_precision_6_0,
                    							"smarthome.dsl.Dsl.Precision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDurationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleSensorPredicate"
    // InternalDsl.g:1011:1: entryRuleSensorPredicate returns [EObject current=null] : iv_ruleSensorPredicate= ruleSensorPredicate EOF ;
    public final EObject entryRuleSensorPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorPredicate = null;


        try {
            // InternalDsl.g:1011:56: (iv_ruleSensorPredicate= ruleSensorPredicate EOF )
            // InternalDsl.g:1012:2: iv_ruleSensorPredicate= ruleSensorPredicate EOF
            {
             newCompositeNode(grammarAccess.getSensorPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorPredicate=ruleSensorPredicate();

            state._fsp--;

             current =iv_ruleSensorPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorPredicate"


    // $ANTLR start "ruleSensorPredicate"
    // InternalDsl.g:1018:1: ruleSensorPredicate returns [EObject current=null] : ( () otherlv_1= 'SensorPredicate' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'sensor' ( ( ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleSensorPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_operator_4_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1024:2: ( ( () otherlv_1= 'SensorPredicate' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'sensor' ( ( ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= '}' ) )
            // InternalDsl.g:1025:2: ( () otherlv_1= 'SensorPredicate' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'sensor' ( ( ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= '}' )
            {
            // InternalDsl.g:1025:2: ( () otherlv_1= 'SensorPredicate' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'sensor' ( ( ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= '}' )
            // InternalDsl.g:1026:3: () otherlv_1= 'SensorPredicate' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'sensor' ( ( ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= '}'
            {
            // InternalDsl.g:1026:3: ()
            // InternalDsl.g:1027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorPredicateAccess().getSensorPredicateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorPredicateAccess().getSensorPredicateKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorPredicateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1041:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1042:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorPredicateAccess().getOperatorKeyword_3_0());
                    			
                    // InternalDsl.g:1046:4: ( (lv_operator_4_0= ruleOperator ) )
                    // InternalDsl.g:1047:5: (lv_operator_4_0= ruleOperator )
                    {
                    // InternalDsl.g:1047:5: (lv_operator_4_0= ruleOperator )
                    // InternalDsl.g:1048:6: lv_operator_4_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getSensorPredicateAccess().getOperatorOperatorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_operator_4_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorPredicateRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"smarthome.dsl.Dsl.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1066:3: (otherlv_5= 'sensor' ( ( ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1067:4: otherlv_5= 'sensor' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorPredicateAccess().getSensorKeyword_4_0());
                    			
                    // InternalDsl.g:1071:4: ( ( ruleEString ) )
                    // InternalDsl.g:1072:5: ( ruleEString )
                    {
                    // InternalDsl.g:1072:5: ( ruleEString )
                    // InternalDsl.g:1073:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorPredicateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSensorPredicateAccess().getSensorSensorCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1088:3: (otherlv_7= 'value' ( (lv_value_8_0= ruleValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1089:4: otherlv_7= 'value' ( (lv_value_8_0= ruleValue ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorPredicateAccess().getValueKeyword_5_0());
                    			
                    // InternalDsl.g:1093:4: ( (lv_value_8_0= ruleValue ) )
                    // InternalDsl.g:1094:5: (lv_value_8_0= ruleValue )
                    {
                    // InternalDsl.g:1094:5: (lv_value_8_0= ruleValue )
                    // InternalDsl.g:1095:6: lv_value_8_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getSensorPredicateAccess().getValueValueParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_8_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorPredicateRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"smarthome.dsl.Dsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSensorPredicateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorPredicate"


    // $ANTLR start "entryRulePersonPredicate"
    // InternalDsl.g:1121:1: entryRulePersonPredicate returns [EObject current=null] : iv_rulePersonPredicate= rulePersonPredicate EOF ;
    public final EObject entryRulePersonPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonPredicate = null;


        try {
            // InternalDsl.g:1121:56: (iv_rulePersonPredicate= rulePersonPredicate EOF )
            // InternalDsl.g:1122:2: iv_rulePersonPredicate= rulePersonPredicate EOF
            {
             newCompositeNode(grammarAccess.getPersonPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonPredicate=rulePersonPredicate();

            state._fsp--;

             current =iv_rulePersonPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonPredicate"


    // $ANTLR start "rulePersonPredicate"
    // InternalDsl.g:1128:1: rulePersonPredicate returns [EObject current=null] : ( () otherlv_1= 'PersonPredicate' otherlv_2= '{' (otherlv_3= 'activity' ( (lv_activity_4_0= ruleActivity ) ) )? (otherlv_5= 'person' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject rulePersonPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_activity_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1134:2: ( ( () otherlv_1= 'PersonPredicate' otherlv_2= '{' (otherlv_3= 'activity' ( (lv_activity_4_0= ruleActivity ) ) )? (otherlv_5= 'person' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalDsl.g:1135:2: ( () otherlv_1= 'PersonPredicate' otherlv_2= '{' (otherlv_3= 'activity' ( (lv_activity_4_0= ruleActivity ) ) )? (otherlv_5= 'person' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalDsl.g:1135:2: ( () otherlv_1= 'PersonPredicate' otherlv_2= '{' (otherlv_3= 'activity' ( (lv_activity_4_0= ruleActivity ) ) )? (otherlv_5= 'person' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalDsl.g:1136:3: () otherlv_1= 'PersonPredicate' otherlv_2= '{' (otherlv_3= 'activity' ( (lv_activity_4_0= ruleActivity ) ) )? (otherlv_5= 'person' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalDsl.g:1136:3: ()
            // InternalDsl.g:1137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonPredicateAccess().getPersonPredicateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonPredicateAccess().getPersonPredicateKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonPredicateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1151:3: (otherlv_3= 'activity' ( (lv_activity_4_0= ruleActivity ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1152:4: otherlv_3= 'activity' ( (lv_activity_4_0= ruleActivity ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonPredicateAccess().getActivityKeyword_3_0());
                    			
                    // InternalDsl.g:1156:4: ( (lv_activity_4_0= ruleActivity ) )
                    // InternalDsl.g:1157:5: (lv_activity_4_0= ruleActivity )
                    {
                    // InternalDsl.g:1157:5: (lv_activity_4_0= ruleActivity )
                    // InternalDsl.g:1158:6: lv_activity_4_0= ruleActivity
                    {

                    						newCompositeNode(grammarAccess.getPersonPredicateAccess().getActivityActivityEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_activity_4_0=ruleActivity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonPredicateRule());
                    						}
                    						set(
                    							current,
                    							"activity",
                    							lv_activity_4_0,
                    							"smarthome.dsl.Dsl.Activity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1176:3: (otherlv_5= 'person' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1177:4: otherlv_5= 'person' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonPredicateAccess().getPersonKeyword_4_0());
                    			
                    // InternalDsl.g:1181:4: ( ( ruleEString ) )
                    // InternalDsl.g:1182:5: ( ruleEString )
                    {
                    // InternalDsl.g:1182:5: ( ruleEString )
                    // InternalDsl.g:1183:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonPredicateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPersonPredicateAccess().getPersonPersonCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonPredicateAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonPredicate"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:1206:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:1206:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:1207:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:1213:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1219:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:1220:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:1220:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:1221:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:1221:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1222:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleOperator"
    // InternalDsl.g:1239:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'superior' ) | (enumLiteral_1= 'inferior' ) | (enumLiteral_2= 'equal' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1245:2: ( ( (enumLiteral_0= 'superior' ) | (enumLiteral_1= 'inferior' ) | (enumLiteral_2= 'equal' ) ) )
            // InternalDsl.g:1246:2: ( (enumLiteral_0= 'superior' ) | (enumLiteral_1= 'inferior' ) | (enumLiteral_2= 'equal' ) )
            {
            // InternalDsl.g:1246:2: ( (enumLiteral_0= 'superior' ) | (enumLiteral_1= 'inferior' ) | (enumLiteral_2= 'equal' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt29=1;
                }
                break;
            case 43:
                {
                alt29=2;
                }
                break;
            case 44:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1247:3: (enumLiteral_0= 'superior' )
                    {
                    // InternalDsl.g:1247:3: (enumLiteral_0= 'superior' )
                    // InternalDsl.g:1248:4: enumLiteral_0= 'superior'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1255:3: (enumLiteral_1= 'inferior' )
                    {
                    // InternalDsl.g:1255:3: (enumLiteral_1= 'inferior' )
                    // InternalDsl.g:1256:4: enumLiteral_1= 'inferior'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1263:3: (enumLiteral_2= 'equal' )
                    {
                    // InternalDsl.g:1263:3: (enumLiteral_2= 'equal' )
                    // InternalDsl.g:1264:4: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleActivity"
    // InternalDsl.g:1274:1: ruleActivity returns [Enumerator current=null] : ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) ) ;
    public final Enumerator ruleActivity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1280:2: ( ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) ) )
            // InternalDsl.g:1281:2: ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) )
            {
            // InternalDsl.g:1281:2: ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case 47:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1282:3: (enumLiteral_0= 'standing' )
                    {
                    // InternalDsl.g:1282:3: (enumLiteral_0= 'standing' )
                    // InternalDsl.g:1283:4: enumLiteral_0= 'standing'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1290:3: (enumLiteral_1= 'laying' )
                    {
                    // InternalDsl.g:1290:3: (enumLiteral_1= 'laying' )
                    // InternalDsl.g:1291:4: enumLiteral_1= 'laying'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1298:3: (enumLiteral_2= 'sitting' )
                    {
                    // InternalDsl.g:1298:3: (enumLiteral_2= 'sitting' )
                    // InternalDsl.g:1299:4: enumLiteral_2= 'sitting'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "rulePrecision"
    // InternalDsl.g:1309:1: rulePrecision returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'm' ) ) ;
    public final Enumerator rulePrecision() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1315:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'm' ) ) )
            // InternalDsl.g:1316:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'm' ) )
            {
            // InternalDsl.g:1316:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'm' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt31=1;
                }
                break;
            case 49:
                {
                alt31=2;
                }
                break;
            case 50:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1317:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalDsl.g:1317:3: (enumLiteral_0= 'ms' )
                    // InternalDsl.g:1318:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1325:3: (enumLiteral_1= 's' )
                    {
                    // InternalDsl.g:1325:3: (enumLiteral_1= 's' )
                    // InternalDsl.g:1326:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1333:3: (enumLiteral_2= 'm' )
                    {
                    // InternalDsl.g:1333:3: (enumLiteral_2= 'm' )
                    // InternalDsl.g:1334:4: enumLiteral_2= 'm'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecision"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000006004008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004004008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000008000L});

}