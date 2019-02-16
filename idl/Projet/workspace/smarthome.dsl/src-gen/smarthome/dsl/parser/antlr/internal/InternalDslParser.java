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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eventFile'", "'rooms'", "'{'", "','", "'}'", "'persons'", "'patterns'", "'monitor'", "'start'", "'Room'", "'Person'", "'Pattern'", "'AnalogSensor'", "'DigitalSensor'", "'-'", "'.'", "'E'", "'e'", "'('", "'and'", "')'", "'for'", "'since'", "'is'", "'>'", "'<'", "'='", "'standing'", "'laying'", "'sitting'", "'millis'", "'seconds'", "'minutes'"
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
    // InternalDsl.g:72:1: ruleHome returns [EObject current=null] : ( () (otherlv_1= 'eventFile' ( (lv_fileEvents_2_0= ruleEString ) ) ) (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? (otherlv_21= 'monitor' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= 'start' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_fileEvents_2_0 = null;

        EObject lv_rooms_5_0 = null;

        EObject lv_rooms_7_0 = null;

        EObject lv_persons_11_0 = null;

        EObject lv_persons_13_0 = null;

        EObject lv_patterns_17_0 = null;

        EObject lv_patterns_19_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( () (otherlv_1= 'eventFile' ( (lv_fileEvents_2_0= ruleEString ) ) ) (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? (otherlv_21= 'monitor' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= 'start' ) )
            // InternalDsl.g:79:2: ( () (otherlv_1= 'eventFile' ( (lv_fileEvents_2_0= ruleEString ) ) ) (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? (otherlv_21= 'monitor' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= 'start' )
            {
            // InternalDsl.g:79:2: ( () (otherlv_1= 'eventFile' ( (lv_fileEvents_2_0= ruleEString ) ) ) (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? (otherlv_21= 'monitor' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= 'start' )
            // InternalDsl.g:80:3: () (otherlv_1= 'eventFile' ( (lv_fileEvents_2_0= ruleEString ) ) ) (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )? (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )? (otherlv_21= 'monitor' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )? otherlv_25= 'start'
            {
            // InternalDsl.g:80:3: ()
            // InternalDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeAccess().getHomeAction_0(),
            					current);
            			

            }

            // InternalDsl.g:87:3: (otherlv_1= 'eventFile' ( (lv_fileEvents_2_0= ruleEString ) ) )
            // InternalDsl.g:88:4: otherlv_1= 'eventFile' ( (lv_fileEvents_2_0= ruleEString ) )
            {
            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getHomeAccess().getEventFileKeyword_1_0());
            			
            // InternalDsl.g:92:4: ( (lv_fileEvents_2_0= ruleEString ) )
            // InternalDsl.g:93:5: (lv_fileEvents_2_0= ruleEString )
            {
            // InternalDsl.g:93:5: (lv_fileEvents_2_0= ruleEString )
            // InternalDsl.g:94:6: lv_fileEvents_2_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getHomeAccess().getFileEventsEStringParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_4);
            lv_fileEvents_2_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getHomeRule());
            						}
            						set(
            							current,
            							"fileEvents",
            							lv_fileEvents_2_0,
            							"smarthome.dsl.Dsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDsl.g:112:3: (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:113:4: otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getHomeAccess().getRoomsKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalDsl.g:121:4: ( (lv_rooms_5_0= ruleRoom ) )
                    // InternalDsl.g:122:5: (lv_rooms_5_0= ruleRoom )
                    {
                    // InternalDsl.g:122:5: (lv_rooms_5_0= ruleRoom )
                    // InternalDsl.g:123:6: lv_rooms_5_0= ruleRoom
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalDsl.g:140:4: (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:141:5: otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHomeAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalDsl.g:145:5: ( (lv_rooms_7_0= ruleRoom ) )
                    	    // InternalDsl.g:146:6: (lv_rooms_7_0= ruleRoom )
                    	    {
                    	    // InternalDsl.g:146:6: (lv_rooms_7_0= ruleRoom )
                    	    // InternalDsl.g:147:7: lv_rooms_7_0= ruleRoom
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:170:3: (otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:171:4: otherlv_9= 'persons' otherlv_10= '{' ( (lv_persons_11_0= rulePerson ) ) (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getHomeAccess().getPersonsKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:179:4: ( (lv_persons_11_0= rulePerson ) )
                    // InternalDsl.g:180:5: (lv_persons_11_0= rulePerson )
                    {
                    // InternalDsl.g:180:5: (lv_persons_11_0= rulePerson )
                    // InternalDsl.g:181:6: lv_persons_11_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalDsl.g:198:4: (otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:199:5: otherlv_12= ',' ( (lv_persons_13_0= rulePerson ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getHomeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:203:5: ( (lv_persons_13_0= rulePerson ) )
                    	    // InternalDsl.g:204:6: (lv_persons_13_0= rulePerson )
                    	    {
                    	    // InternalDsl.g:204:6: (lv_persons_13_0= rulePerson )
                    	    // InternalDsl.g:205:7: lv_persons_13_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:228:3: (otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:229:4: otherlv_15= 'patterns' otherlv_16= '{' ( (lv_patterns_17_0= rulePattern ) ) (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getHomeAccess().getPatternsKeyword_4_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:237:4: ( (lv_patterns_17_0= rulePattern ) )
                    // InternalDsl.g:238:5: (lv_patterns_17_0= rulePattern )
                    {
                    // InternalDsl.g:238:5: (lv_patterns_17_0= rulePattern )
                    // InternalDsl.g:239:6: lv_patterns_17_0= rulePattern
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalDsl.g:256:4: (otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:257:5: otherlv_18= ',' ( (lv_patterns_19_0= rulePattern ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getHomeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:261:5: ( (lv_patterns_19_0= rulePattern ) )
                    	    // InternalDsl.g:262:6: (lv_patterns_19_0= rulePattern )
                    	    {
                    	    // InternalDsl.g:262:6: (lv_patterns_19_0= rulePattern )
                    	    // InternalDsl.g:263:7: lv_patterns_19_0= rulePattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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

                    otherlv_20=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:286:3: (otherlv_21= 'monitor' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:287:4: otherlv_21= 'monitor' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getHomeAccess().getMonitorKeyword_5_0());
                    			
                    // InternalDsl.g:291:4: ( ( ruleEString ) )
                    // InternalDsl.g:292:5: ( ruleEString )
                    {
                    // InternalDsl.g:292:5: ( ruleEString )
                    // InternalDsl.g:293:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHomeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:307:4: (otherlv_23= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:308:5: otherlv_23= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getHomeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalDsl.g:312:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:313:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:313:6: ( ruleEString )
                    	    // InternalDsl.g:314:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHomeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getHomeAccess().getStartKeyword_6());
            		

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
    // InternalDsl.g:338:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDsl.g:338:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDsl.g:339:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalDsl.g:345:1: ruleSensor returns [EObject current=null] : (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_AnalogSensor_0 = null;

        EObject this_DigitalSensor_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:351:2: ( (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor ) )
            // InternalDsl.g:352:2: (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor )
            {
            // InternalDsl.g:352:2: (this_AnalogSensor_0= ruleAnalogSensor | this_DigitalSensor_1= ruleDigitalSensor )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:353:3: this_AnalogSensor_0= ruleAnalogSensor
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
                    // InternalDsl.g:362:3: this_DigitalSensor_1= ruleDigitalSensor
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


    // $ANTLR start "entryRulePredicate"
    // InternalDsl.g:374:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalDsl.g:374:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalDsl.g:375:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalDsl.g:381:1: rulePredicate returns [EObject current=null] : (this_SensorPredicate_0= ruleSensorPredicate | this_PersonPredicate_1= rulePersonPredicate ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_SensorPredicate_0 = null;

        EObject this_PersonPredicate_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:387:2: ( (this_SensorPredicate_0= ruleSensorPredicate | this_PersonPredicate_1= rulePersonPredicate ) )
            // InternalDsl.g:388:2: (this_SensorPredicate_0= ruleSensorPredicate | this_PersonPredicate_1= rulePersonPredicate )
            {
            // InternalDsl.g:388:2: (this_SensorPredicate_0= ruleSensorPredicate | this_PersonPredicate_1= rulePersonPredicate )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=35 && LA10_1<=37)) ) {
                    alt10=1;
                }
                else if ( (LA10_1==34) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=35 && LA10_2<=37)) ) {
                    alt10=1;
                }
                else if ( (LA10_2==34) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:389:3: this_SensorPredicate_0= ruleSensorPredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getSensorPredicateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SensorPredicate_0=ruleSensorPredicate();

                    state._fsp--;


                    			current = this_SensorPredicate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:398:3: this_PersonPredicate_1= rulePersonPredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getPersonPredicateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonPredicate_1=rulePersonPredicate();

                    state._fsp--;


                    			current = this_PersonPredicate_1;
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleRoom"
    // InternalDsl.g:410:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalDsl.g:410:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalDsl.g:411:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalDsl.g:417:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:423:2: ( ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' ) )
            // InternalDsl.g:424:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' )
            {
            // InternalDsl.g:424:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' )
            // InternalDsl.g:425:3: () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}'
            {
            // InternalDsl.g:425:3: ()
            // InternalDsl.g:426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalDsl.g:436:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:437:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:437:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:438:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:459:3: ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=23 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:460:4: ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )*
                    {
                    // InternalDsl.g:460:4: ( (lv_sensors_4_0= ruleSensor ) )
                    // InternalDsl.g:461:5: (lv_sensors_4_0= ruleSensor )
                    {
                    // InternalDsl.g:461:5: (lv_sensors_4_0= ruleSensor )
                    // InternalDsl.g:462:6: lv_sensors_4_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_sensors_4_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						add(
                    							current,
                    							"sensors",
                    							lv_sensors_4_0,
                    							"smarthome.dsl.Dsl.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:479:4: (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDsl.g:480:5: otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDsl.g:484:5: ( (lv_sensors_6_0= ruleSensor ) )
                    	    // InternalDsl.g:485:6: (lv_sensors_6_0= ruleSensor )
                    	    {
                    	    // InternalDsl.g:485:6: (lv_sensors_6_0= ruleSensor )
                    	    // InternalDsl.g:486:7: lv_sensors_6_0= ruleSensor
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDsl.g:513:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalDsl.g:513:47: (iv_rulePerson= rulePerson EOF )
            // InternalDsl.g:514:2: iv_rulePerson= rulePerson EOF
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
    // InternalDsl.g:520:1: rulePerson returns [EObject current=null] : ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:526:2: ( ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:527:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:527:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:528:3: () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:528:3: ()
            // InternalDsl.g:529:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getPersonKeyword_1());
            		
            // InternalDsl.g:539:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:540:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:540:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:541:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:562:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalDsl.g:562:48: (iv_rulePattern= rulePattern EOF )
            // InternalDsl.g:563:2: iv_rulePattern= rulePattern EOF
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
    // InternalDsl.g:569:1: rulePattern returns [EObject current=null] : ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rules_4_0 = null;

        EObject lv_rules_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:575:2: ( ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}' ) )
            // InternalDsl.g:576:2: ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}' )
            {
            // InternalDsl.g:576:2: ( () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}' )
            // InternalDsl.g:577:3: () otherlv_1= 'Pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )? otherlv_7= '}'
            {
            // InternalDsl.g:577:3: ()
            // InternalDsl.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getPatternKeyword_1());
            		
            // InternalDsl.g:588:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:589:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:589:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:590:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:611:3: ( ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:612:4: ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )*
                    {
                    // InternalDsl.g:612:4: ( (lv_rules_4_0= ruleRule ) )
                    // InternalDsl.g:613:5: (lv_rules_4_0= ruleRule )
                    {
                    // InternalDsl.g:613:5: (lv_rules_4_0= ruleRule )
                    // InternalDsl.g:614:6: lv_rules_4_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_rules_4_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_4_0,
                    							"smarthome.dsl.Dsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:631:4: (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:632:5: otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDsl.g:636:5: ( (lv_rules_6_0= ruleRule ) )
                    	    // InternalDsl.g:637:6: (lv_rules_6_0= ruleRule )
                    	    {
                    	    // InternalDsl.g:637:6: (lv_rules_6_0= ruleRule )
                    	    // InternalDsl.g:638:7: lv_rules_6_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_rules_6_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rules",
                    	    								lv_rules_6_0,
                    	    								"smarthome.dsl.Dsl.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDsl.g:665:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:665:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:666:2: iv_ruleEString= ruleEString EOF
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
    // InternalDsl.g:672:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:678:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:679:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:679:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:680:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:688:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleAnalogSensor"
    // InternalDsl.g:699:1: entryRuleAnalogSensor returns [EObject current=null] : iv_ruleAnalogSensor= ruleAnalogSensor EOF ;
    public final EObject entryRuleAnalogSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogSensor = null;


        try {
            // InternalDsl.g:699:53: (iv_ruleAnalogSensor= ruleAnalogSensor EOF )
            // InternalDsl.g:700:2: iv_ruleAnalogSensor= ruleAnalogSensor EOF
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
    // InternalDsl.g:706:1: ruleAnalogSensor returns [EObject current=null] : ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAnalogSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:712:2: ( ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:713:2: ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:713:2: ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:714:3: () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:714:3: ()
            // InternalDsl.g:715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1());
            		
            // InternalDsl.g:725:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:726:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:726:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:727:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalDsl.g:748:1: entryRuleDigitalSensor returns [EObject current=null] : iv_ruleDigitalSensor= ruleDigitalSensor EOF ;
    public final EObject entryRuleDigitalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalSensor = null;


        try {
            // InternalDsl.g:748:54: (iv_ruleDigitalSensor= ruleDigitalSensor EOF )
            // InternalDsl.g:749:2: iv_ruleDigitalSensor= ruleDigitalSensor EOF
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
    // InternalDsl.g:755:1: ruleDigitalSensor returns [EObject current=null] : ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDigitalSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:761:2: ( ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:762:2: ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:762:2: ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:763:3: () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:763:3: ()
            // InternalDsl.g:764:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1());
            		
            // InternalDsl.g:774:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:775:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:775:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:776:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalDsl.g:797:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:797:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:798:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalDsl.g:804:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:810:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:811:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:811:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:812:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:812:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:813:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:819:3: (this_INT_1= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:820:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:840:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=27 && LA20_0<=28)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:841:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:841:4: (kw= 'E' | kw= 'e' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==27) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==28) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDsl.g:842:5: kw= 'E'
                            {
                            kw=(Token)match(input,27,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:848:5: kw= 'e'
                            {
                            kw=(Token)match(input,28,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:854:4: (kw= '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==25) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDsl.g:855:5: kw= '-'
                            {
                            kw=(Token)match(input,25,FOLLOW_19); 

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


    // $ANTLR start "entryRuleRule"
    // InternalDsl.g:873:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDsl.g:873:45: (iv_ruleRule= ruleRule EOF )
            // InternalDsl.g:874:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDsl.g:880:1: ruleRule returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_predicates_3_0 = null;

        EObject lv_predicates_5_0 = null;

        EObject lv_duration_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:886:2: ( ( () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}' ) )
            // InternalDsl.g:887:2: ( () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}' )
            {
            // InternalDsl.g:887:2: ( () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}' )
            // InternalDsl.g:888:3: () otherlv_1= '{' (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )? ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )? otherlv_10= '}'
            {
            // InternalDsl.g:888:3: ()
            // InternalDsl.g:889:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleAccess().getRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:899:3: (otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:900:4: otherlv_2= '(' ( (lv_predicates_3_0= rulePredicate ) ) (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalDsl.g:904:4: ( (lv_predicates_3_0= rulePredicate ) )
                    // InternalDsl.g:905:5: (lv_predicates_3_0= rulePredicate )
                    {
                    // InternalDsl.g:905:5: (lv_predicates_3_0= rulePredicate )
                    // InternalDsl.g:906:6: lv_predicates_3_0= rulePredicate
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_predicates_3_0=rulePredicate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						add(
                    							current,
                    							"predicates",
                    							lv_predicates_3_0,
                    							"smarthome.dsl.Dsl.Predicate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:923:4: (otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==30) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalDsl.g:924:5: otherlv_4= 'and' ( (lv_predicates_5_0= rulePredicate ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getAndKeyword_2_2_0());
                    	    				
                    	    // InternalDsl.g:928:5: ( (lv_predicates_5_0= rulePredicate ) )
                    	    // InternalDsl.g:929:6: (lv_predicates_5_0= rulePredicate )
                    	    {
                    	    // InternalDsl.g:929:6: (lv_predicates_5_0= rulePredicate )
                    	    // InternalDsl.g:930:7: lv_predicates_5_0= rulePredicate
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_predicates_5_0=rulePredicate();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"predicates",
                    	    								lv_predicates_5_0,
                    	    								"smarthome.dsl.Dsl.Predicate");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalDsl.g:953:3: ( (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=32 && LA24_0<=33)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:954:4: (otherlv_7= 'for' | otherlv_8= 'since' ) ( (lv_duration_9_0= ruleDuration ) )
                    {
                    // InternalDsl.g:954:4: (otherlv_7= 'for' | otherlv_8= 'since' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==33) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalDsl.g:955:5: otherlv_7= 'for'
                            {
                            otherlv_7=(Token)match(input,32,FOLLOW_21); 

                            					newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getForKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:960:5: otherlv_8= 'since'
                            {
                            otherlv_8=(Token)match(input,33,FOLLOW_21); 

                            					newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getSinceKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:965:4: ( (lv_duration_9_0= ruleDuration ) )
                    // InternalDsl.g:966:5: (lv_duration_9_0= ruleDuration )
                    {
                    // InternalDsl.g:966:5: (lv_duration_9_0= ruleDuration )
                    // InternalDsl.g:967:6: lv_duration_9_0= ruleDuration
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_duration_9_0=ruleDuration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_9_0,
                    							"smarthome.dsl.Dsl.Duration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDuration"
    // InternalDsl.g:993:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalDsl.g:993:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalDsl.g:994:2: iv_ruleDuration= ruleDuration EOF
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
    // InternalDsl.g:1000:1: ruleDuration returns [EObject current=null] : ( () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_time_1_0 = null;

        Enumerator lv_precision_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1006:2: ( ( () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) ) ) )
            // InternalDsl.g:1007:2: ( () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) ) )
            {
            // InternalDsl.g:1007:2: ( () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) ) )
            // InternalDsl.g:1008:3: () ( (lv_time_1_0= ruleEInt ) ) ( (lv_precision_2_0= rulePrecision ) )
            {
            // InternalDsl.g:1008:3: ()
            // InternalDsl.g:1009:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1015:3: ( (lv_time_1_0= ruleEInt ) )
            // InternalDsl.g:1016:4: (lv_time_1_0= ruleEInt )
            {
            // InternalDsl.g:1016:4: (lv_time_1_0= ruleEInt )
            // InternalDsl.g:1017:5: lv_time_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getTimeEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_time_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_1_0,
            						"smarthome.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1034:3: ( (lv_precision_2_0= rulePrecision ) )
            // InternalDsl.g:1035:4: (lv_precision_2_0= rulePrecision )
            {
            // InternalDsl.g:1035:4: (lv_precision_2_0= rulePrecision )
            // InternalDsl.g:1036:5: lv_precision_2_0= rulePrecision
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getPrecisionPrecisionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_precision_2_0=rulePrecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"precision",
            						lv_precision_2_0,
            						"smarthome.dsl.Dsl.Precision");
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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleSensorPredicate"
    // InternalDsl.g:1057:1: entryRuleSensorPredicate returns [EObject current=null] : iv_ruleSensorPredicate= ruleSensorPredicate EOF ;
    public final EObject entryRuleSensorPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorPredicate = null;


        try {
            // InternalDsl.g:1057:56: (iv_ruleSensorPredicate= ruleSensorPredicate EOF )
            // InternalDsl.g:1058:2: iv_ruleSensorPredicate= ruleSensorPredicate EOF
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
    // InternalDsl.g:1064:1: ruleSensorPredicate returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) ) ) ;
    public final EObject ruleSensorPredicate() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1070:2: ( ( () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) ) ) )
            // InternalDsl.g:1071:2: ( () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) ) )
            {
            // InternalDsl.g:1071:2: ( () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) ) )
            // InternalDsl.g:1072:3: () ( ( ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_value_3_0= ruleEDouble ) )
            {
            // InternalDsl.g:1072:3: ()
            // InternalDsl.g:1073:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorPredicateAccess().getSensorPredicateAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1079:3: ( ( ruleEString ) )
            // InternalDsl.g:1080:4: ( ruleEString )
            {
            // InternalDsl.g:1080:4: ( ruleEString )
            // InternalDsl.g:1081:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorPredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensorPredicateAccess().getSensorSensorCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1095:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalDsl.g:1096:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalDsl.g:1096:4: (lv_operator_2_0= ruleOperator )
            // InternalDsl.g:1097:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getSensorPredicateAccess().getOperatorOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorPredicateRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"smarthome.dsl.Dsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1114:3: ( (lv_value_3_0= ruleEDouble ) )
            // InternalDsl.g:1115:4: (lv_value_3_0= ruleEDouble )
            {
            // InternalDsl.g:1115:4: (lv_value_3_0= ruleEDouble )
            // InternalDsl.g:1116:5: lv_value_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getSensorPredicateAccess().getValueEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorPredicateRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"smarthome.dsl.Dsl.EDouble");
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
    // $ANTLR end "ruleSensorPredicate"


    // $ANTLR start "entryRulePersonPredicate"
    // InternalDsl.g:1137:1: entryRulePersonPredicate returns [EObject current=null] : iv_rulePersonPredicate= rulePersonPredicate EOF ;
    public final EObject entryRulePersonPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonPredicate = null;


        try {
            // InternalDsl.g:1137:56: (iv_rulePersonPredicate= rulePersonPredicate EOF )
            // InternalDsl.g:1138:2: iv_rulePersonPredicate= rulePersonPredicate EOF
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
    // InternalDsl.g:1144:1: rulePersonPredicate returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) ) ) ;
    public final EObject rulePersonPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_activity_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1150:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) ) ) )
            // InternalDsl.g:1151:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) ) )
            {
            // InternalDsl.g:1151:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) ) )
            // InternalDsl.g:1152:3: () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_activity_3_0= ruleActivity ) )
            {
            // InternalDsl.g:1152:3: ()
            // InternalDsl.g:1153:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonPredicateAccess().getPersonPredicateAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1159:3: ( ( ruleEString ) )
            // InternalDsl.g:1160:4: ( ruleEString )
            {
            // InternalDsl.g:1160:4: ( ruleEString )
            // InternalDsl.g:1161:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonPredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPersonPredicateAccess().getPersonPersonCrossReference_1_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonPredicateAccess().getIsKeyword_2());
            		
            // InternalDsl.g:1179:3: ( (lv_activity_3_0= ruleActivity ) )
            // InternalDsl.g:1180:4: (lv_activity_3_0= ruleActivity )
            {
            // InternalDsl.g:1180:4: (lv_activity_3_0= ruleActivity )
            // InternalDsl.g:1181:5: lv_activity_3_0= ruleActivity
            {

            					newCompositeNode(grammarAccess.getPersonPredicateAccess().getActivityActivityEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_activity_3_0=ruleActivity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonPredicateRule());
            					}
            					set(
            						current,
            						"activity",
            						lv_activity_3_0,
            						"smarthome.dsl.Dsl.Activity");
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
    // $ANTLR end "rulePersonPredicate"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:1202:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:1202:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:1203:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDsl.g:1209:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1215:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:1216:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:1216:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:1217:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:1217:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1218:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_19); 

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
    // InternalDsl.g:1235:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1241:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) ) )
            // InternalDsl.g:1242:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) )
            {
            // InternalDsl.g:1242:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt26=1;
                }
                break;
            case 36:
                {
                alt26=2;
                }
                break;
            case 37:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1243:3: (enumLiteral_0= '>' )
                    {
                    // InternalDsl.g:1243:3: (enumLiteral_0= '>' )
                    // InternalDsl.g:1244:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1251:3: (enumLiteral_1= '<' )
                    {
                    // InternalDsl.g:1251:3: (enumLiteral_1= '<' )
                    // InternalDsl.g:1252:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1259:3: (enumLiteral_2= '=' )
                    {
                    // InternalDsl.g:1259:3: (enumLiteral_2= '=' )
                    // InternalDsl.g:1260:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

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
    // InternalDsl.g:1270:1: ruleActivity returns [Enumerator current=null] : ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) ) ;
    public final Enumerator ruleActivity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1276:2: ( ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) ) )
            // InternalDsl.g:1277:2: ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) )
            {
            // InternalDsl.g:1277:2: ( (enumLiteral_0= 'standing' ) | (enumLiteral_1= 'laying' ) | (enumLiteral_2= 'sitting' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 40:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1278:3: (enumLiteral_0= 'standing' )
                    {
                    // InternalDsl.g:1278:3: (enumLiteral_0= 'standing' )
                    // InternalDsl.g:1279:4: enumLiteral_0= 'standing'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1286:3: (enumLiteral_1= 'laying' )
                    {
                    // InternalDsl.g:1286:3: (enumLiteral_1= 'laying' )
                    // InternalDsl.g:1287:4: enumLiteral_1= 'laying'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1294:3: (enumLiteral_2= 'sitting' )
                    {
                    // InternalDsl.g:1294:3: (enumLiteral_2= 'sitting' )
                    // InternalDsl.g:1295:4: enumLiteral_2= 'sitting'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

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
    // InternalDsl.g:1305:1: rulePrecision returns [Enumerator current=null] : ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) ;
    public final Enumerator rulePrecision() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1311:2: ( ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) )
            // InternalDsl.g:1312:2: ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            {
            // InternalDsl.g:1312:2: ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt28=1;
                }
                break;
            case 42:
                {
                alt28=2;
                }
                break;
            case 43:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1313:3: (enumLiteral_0= 'millis' )
                    {
                    // InternalDsl.g:1313:3: (enumLiteral_0= 'millis' )
                    // InternalDsl.g:1314:4: enumLiteral_0= 'millis'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1321:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalDsl.g:1321:3: (enumLiteral_1= 'seconds' )
                    // InternalDsl.g:1322:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1329:3: (enumLiteral_2= 'minutes' )
                    {
                    // InternalDsl.g:1329:3: (enumLiteral_2= 'minutes' )
                    // InternalDsl.g:1330:4: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000F1000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000320008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000006000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000001C000000000L});

}