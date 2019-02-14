package fr.unice.polytech.alexisc.smarthomedsl.parser.antlr.internal;

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
import fr.unice.polytech.alexisc.smarthomedsl.services.SmartHomeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartHomeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rooms'", "'{'", "','", "'}'", "'patterns'", "'Room'", "'sensors'", "'AnalogSensor'", "'on'", "'reacts'", "'to'", "'DigitalSensor'", "'SensorCSV'", "'from'", "'Activity'", "'rules'", "'and'", "'for'", "'='", "'<'", "'>'", "'seconds'", "'milliseconds'", "'minutes'", "'laying'", "'sitting'", "'standing'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

        public InternalSmartHomeParser(TokenStream input, SmartHomeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Home";
       	}

       	@Override
       	protected SmartHomeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHome"
    // InternalSmartHome.g:65:1: entryRuleHome returns [EObject current=null] : iv_ruleHome= ruleHome EOF ;
    public final EObject entryRuleHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHome = null;


        try {
            // InternalSmartHome.g:65:45: (iv_ruleHome= ruleHome EOF )
            // InternalSmartHome.g:66:2: iv_ruleHome= ruleHome EOF
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
    // InternalSmartHome.g:72:1: ruleHome returns [EObject current=null] : ( () (otherlv_1= 'rooms' otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) ) (otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) ) )* otherlv_6= '}' )? (otherlv_7= 'patterns' otherlv_8= '{' ( (lv_activities_9_0= rulePattern ) ) (otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_rooms_3_0 = null;

        EObject lv_rooms_5_0 = null;

        EObject lv_activities_9_0 = null;

        EObject lv_activities_11_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:78:2: ( ( () (otherlv_1= 'rooms' otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) ) (otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) ) )* otherlv_6= '}' )? (otherlv_7= 'patterns' otherlv_8= '{' ( (lv_activities_9_0= rulePattern ) ) (otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) ) )* otherlv_12= '}' )? ) )
            // InternalSmartHome.g:79:2: ( () (otherlv_1= 'rooms' otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) ) (otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) ) )* otherlv_6= '}' )? (otherlv_7= 'patterns' otherlv_8= '{' ( (lv_activities_9_0= rulePattern ) ) (otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) ) )* otherlv_12= '}' )? )
            {
            // InternalSmartHome.g:79:2: ( () (otherlv_1= 'rooms' otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) ) (otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) ) )* otherlv_6= '}' )? (otherlv_7= 'patterns' otherlv_8= '{' ( (lv_activities_9_0= rulePattern ) ) (otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) ) )* otherlv_12= '}' )? )
            // InternalSmartHome.g:80:3: () (otherlv_1= 'rooms' otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) ) (otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) ) )* otherlv_6= '}' )? (otherlv_7= 'patterns' otherlv_8= '{' ( (lv_activities_9_0= rulePattern ) ) (otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) ) )* otherlv_12= '}' )?
            {
            // InternalSmartHome.g:80:3: ()
            // InternalSmartHome.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeAccess().getHomeAction_0(),
            					current);
            			

            }

            // InternalSmartHome.g:87:3: (otherlv_1= 'rooms' otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) ) (otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) ) )* otherlv_6= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmartHome.g:88:4: otherlv_1= 'rooms' otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) ) (otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) ) )* otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getHomeAccess().getRoomsKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalSmartHome.g:96:4: ( (lv_rooms_3_0= ruleRoom ) )
                    // InternalSmartHome.g:97:5: (lv_rooms_3_0= ruleRoom )
                    {
                    // InternalSmartHome.g:97:5: (lv_rooms_3_0= ruleRoom )
                    // InternalSmartHome.g:98:6: lv_rooms_3_0= ruleRoom
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_rooms_3_0=ruleRoom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"rooms",
                    							lv_rooms_3_0,
                    							"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Room");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartHome.g:115:4: (otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmartHome.g:116:5: otherlv_4= ',' ( (lv_rooms_5_0= ruleRoom ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getHomeAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalSmartHome.g:120:5: ( (lv_rooms_5_0= ruleRoom ) )
                    	    // InternalSmartHome.g:121:6: (lv_rooms_5_0= ruleRoom )
                    	    {
                    	    // InternalSmartHome.g:121:6: (lv_rooms_5_0= ruleRoom )
                    	    // InternalSmartHome.g:122:7: lv_rooms_5_0= ruleRoom
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_rooms_5_0=ruleRoom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rooms",
                    	    								lv_rooms_5_0,
                    	    								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Room");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalSmartHome.g:145:3: (otherlv_7= 'patterns' otherlv_8= '{' ( (lv_activities_9_0= rulePattern ) ) (otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmartHome.g:146:4: otherlv_7= 'patterns' otherlv_8= '{' ( (lv_activities_9_0= rulePattern ) ) (otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getHomeAccess().getPatternsKeyword_2_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalSmartHome.g:154:4: ( (lv_activities_9_0= rulePattern ) )
                    // InternalSmartHome.g:155:5: (lv_activities_9_0= rulePattern )
                    {
                    // InternalSmartHome.g:155:5: (lv_activities_9_0= rulePattern )
                    // InternalSmartHome.g:156:6: lv_activities_9_0= rulePattern
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getActivitiesPatternParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_activities_9_0=rulePattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"activities",
                    							lv_activities_9_0,
                    							"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Pattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartHome.g:173:4: (otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmartHome.g:174:5: otherlv_10= ',' ( (lv_activities_11_0= rulePattern ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getHomeAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalSmartHome.g:178:5: ( (lv_activities_11_0= rulePattern ) )
                    	    // InternalSmartHome.g:179:6: (lv_activities_11_0= rulePattern )
                    	    {
                    	    // InternalSmartHome.g:179:6: (lv_activities_11_0= rulePattern )
                    	    // InternalSmartHome.g:180:7: lv_activities_11_0= rulePattern
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getActivitiesPatternParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_activities_11_0=rulePattern();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activities",
                    	    								lv_activities_11_0,
                    	    								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Pattern");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_2_4());
                    			

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
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleRoom"
    // InternalSmartHome.g:207:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalSmartHome.g:207:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalSmartHome.g:208:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalSmartHome.g:214:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) ) ) (otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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

        EObject lv_sensors_6_1 = null;

        EObject lv_sensors_6_2 = null;

        EObject lv_sensors_6_3 = null;

        EObject lv_sensors_8_1 = null;

        EObject lv_sensors_8_2 = null;

        EObject lv_sensors_8_3 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:220:2: ( ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) ) ) (otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalSmartHome.g:221:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) ) ) (otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalSmartHome.g:221:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) ) ) (otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalSmartHome.g:222:3: () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) ) ) (otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalSmartHome.g:222:3: ()
            // InternalSmartHome.g:223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalSmartHome.g:233:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHome.g:234:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHome.g:234:4: (lv_name_2_0= ruleEString )
            // InternalSmartHome.g:235:5: lv_name_2_0= ruleEString
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
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartHome.g:256:3: (otherlv_4= 'sensors' otherlv_5= '{' ( ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) ) ) (otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmartHome.g:257:4: otherlv_4= 'sensors' otherlv_5= '{' ( ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) ) ) (otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoomAccess().getSensorsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmartHome.g:265:4: ( ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) ) )
                    // InternalSmartHome.g:266:5: ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) )
                    {
                    // InternalSmartHome.g:266:5: ( (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV ) )
                    // InternalSmartHome.g:267:6: (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV )
                    {
                    // InternalSmartHome.g:267:6: (lv_sensors_6_1= ruleAnalogSensor | lv_sensors_6_2= ruleDigitalSensor | lv_sensors_6_3= ruleSensorCSV )
                    int alt5=3;
                    switch ( input.LA(1) ) {
                    case 18:
                        {
                        alt5=1;
                        }
                        break;
                    case 22:
                        {
                        alt5=2;
                        }
                        break;
                    case 23:
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
                            // InternalSmartHome.g:268:7: lv_sensors_6_1= ruleAnalogSensor
                            {

                            							newCompositeNode(grammarAccess.getRoomAccess().getSensorsAnalogSensorParserRuleCall_4_2_0_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_sensors_6_1=ruleAnalogSensor();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRoomRule());
                            							}
                            							add(
                            								current,
                            								"sensors",
                            								lv_sensors_6_1,
                            								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.AnalogSensor");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalSmartHome.g:284:7: lv_sensors_6_2= ruleDigitalSensor
                            {

                            							newCompositeNode(grammarAccess.getRoomAccess().getSensorsDigitalSensorParserRuleCall_4_2_0_1());
                            						
                            pushFollow(FOLLOW_5);
                            lv_sensors_6_2=ruleDigitalSensor();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRoomRule());
                            							}
                            							add(
                            								current,
                            								"sensors",
                            								lv_sensors_6_2,
                            								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.DigitalSensor");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalSmartHome.g:300:7: lv_sensors_6_3= ruleSensorCSV
                            {

                            							newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorCSVParserRuleCall_4_2_0_2());
                            						
                            pushFollow(FOLLOW_5);
                            lv_sensors_6_3=ruleSensorCSV();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRoomRule());
                            							}
                            							add(
                            								current,
                            								"sensors",
                            								lv_sensors_6_3,
                            								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.SensorCSV");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalSmartHome.g:318:4: (otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSmartHome.g:319:5: otherlv_7= ',' ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmartHome.g:323:5: ( ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) ) )
                    	    // InternalSmartHome.g:324:6: ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) )
                    	    {
                    	    // InternalSmartHome.g:324:6: ( (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV ) )
                    	    // InternalSmartHome.g:325:7: (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV )
                    	    {
                    	    // InternalSmartHome.g:325:7: (lv_sensors_8_1= ruleAnalogSensor | lv_sensors_8_2= ruleDigitalSensor | lv_sensors_8_3= ruleSensorCSV )
                    	    int alt6=3;
                    	    switch ( input.LA(1) ) {
                    	    case 18:
                    	        {
                    	        alt6=1;
                    	        }
                    	        break;
                    	    case 22:
                    	        {
                    	        alt6=2;
                    	        }
                    	        break;
                    	    case 23:
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
                    	            // InternalSmartHome.g:326:8: lv_sensors_8_1= ruleAnalogSensor
                    	            {

                    	            								newCompositeNode(grammarAccess.getRoomAccess().getSensorsAnalogSensorParserRuleCall_4_3_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_sensors_8_1=ruleAnalogSensor();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getRoomRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"sensors",
                    	            									lv_sensors_8_1,
                    	            									"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.AnalogSensor");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSmartHome.g:342:8: lv_sensors_8_2= ruleDigitalSensor
                    	            {

                    	            								newCompositeNode(grammarAccess.getRoomAccess().getSensorsDigitalSensorParserRuleCall_4_3_1_0_1());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_sensors_8_2=ruleDigitalSensor();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getRoomRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"sensors",
                    	            									lv_sensors_8_2,
                    	            									"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.DigitalSensor");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalSmartHome.g:358:8: lv_sensors_8_3= ruleSensorCSV
                    	            {

                    	            								newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorCSVParserRuleCall_4_3_1_0_2());
                    	            							
                    	            pushFollow(FOLLOW_5);
                    	            lv_sensors_8_3=ruleSensorCSV();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getRoomRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"sensors",
                    	            									lv_sensors_8_3,
                    	            									"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.SensorCSV");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAnalogSensor"
    // InternalSmartHome.g:390:1: entryRuleAnalogSensor returns [EObject current=null] : iv_ruleAnalogSensor= ruleAnalogSensor EOF ;
    public final EObject entryRuleAnalogSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogSensor = null;


        try {
            // InternalSmartHome.g:390:53: (iv_ruleAnalogSensor= ruleAnalogSensor EOF )
            // InternalSmartHome.g:391:2: iv_ruleAnalogSensor= ruleAnalogSensor EOF
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
    // InternalSmartHome.g:397:1: ruleAnalogSensor returns [EObject current=null] : ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) ) ;
    public final EObject ruleAnalogSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_location_4_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:403:2: ( ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) ) )
            // InternalSmartHome.g:404:2: ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) )
            {
            // InternalSmartHome.g:404:2: ( () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) )
            // InternalSmartHome.g:405:3: () otherlv_1= 'AnalogSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) )
            {
            // InternalSmartHome.g:405:3: ()
            // InternalSmartHome.g:406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1());
            		
            // InternalSmartHome.g:416:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHome.g:417:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHome.g:417:4: (lv_name_2_0= ruleEString )
            // InternalSmartHome.g:418:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAnalogSensorAccess().getOnKeyword_3());
            		
            // InternalSmartHome.g:439:3: ( (lv_location_4_0= ruleEString ) )
            // InternalSmartHome.g:440:4: (lv_location_4_0= ruleEString )
            {
            // InternalSmartHome.g:440:4: (lv_location_4_0= ruleEString )
            // InternalSmartHome.g:441:5: lv_location_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getLocationEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_location_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_4_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getAnalogSensorAccess().getReactsKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getAnalogSensorAccess().getToKeyword_6());
            		
            // InternalSmartHome.g:466:3: ( (lv_type_7_0= ruleEString ) )
            // InternalSmartHome.g:467:4: (lv_type_7_0= ruleEString )
            {
            // InternalSmartHome.g:467:4: (lv_type_7_0= ruleEString )
            // InternalSmartHome.g:468:5: lv_type_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getTypeEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
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
    // InternalSmartHome.g:489:1: entryRuleDigitalSensor returns [EObject current=null] : iv_ruleDigitalSensor= ruleDigitalSensor EOF ;
    public final EObject entryRuleDigitalSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalSensor = null;


        try {
            // InternalSmartHome.g:489:54: (iv_ruleDigitalSensor= ruleDigitalSensor EOF )
            // InternalSmartHome.g:490:2: iv_ruleDigitalSensor= ruleDigitalSensor EOF
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
    // InternalSmartHome.g:496:1: ruleDigitalSensor returns [EObject current=null] : ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) ) ;
    public final EObject ruleDigitalSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_location_4_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:502:2: ( ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) ) )
            // InternalSmartHome.g:503:2: ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) )
            {
            // InternalSmartHome.g:503:2: ( () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) )
            // InternalSmartHome.g:504:3: () otherlv_1= 'DigitalSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) )
            {
            // InternalSmartHome.g:504:3: ()
            // InternalSmartHome.g:505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1());
            		
            // InternalSmartHome.g:515:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHome.g:516:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHome.g:516:4: (lv_name_2_0= ruleEString )
            // InternalSmartHome.g:517:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDigitalSensorAccess().getOnKeyword_3());
            		
            // InternalSmartHome.g:538:3: ( (lv_location_4_0= ruleEString ) )
            // InternalSmartHome.g:539:4: (lv_location_4_0= ruleEString )
            {
            // InternalSmartHome.g:539:4: (lv_location_4_0= ruleEString )
            // InternalSmartHome.g:540:5: lv_location_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDigitalSensorAccess().getLocationEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_location_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalSensorRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_4_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getDigitalSensorAccess().getReactsKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getDigitalSensorAccess().getToKeyword_6());
            		
            // InternalSmartHome.g:565:3: ( (lv_type_7_0= ruleEString ) )
            // InternalSmartHome.g:566:4: (lv_type_7_0= ruleEString )
            {
            // InternalSmartHome.g:566:4: (lv_type_7_0= ruleEString )
            // InternalSmartHome.g:567:5: lv_type_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDigitalSensorAccess().getTypeEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDigitalSensorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
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


    // $ANTLR start "entryRuleSensorCSV"
    // InternalSmartHome.g:588:1: entryRuleSensorCSV returns [EObject current=null] : iv_ruleSensorCSV= ruleSensorCSV EOF ;
    public final EObject entryRuleSensorCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorCSV = null;


        try {
            // InternalSmartHome.g:588:50: (iv_ruleSensorCSV= ruleSensorCSV EOF )
            // InternalSmartHome.g:589:2: iv_ruleSensorCSV= ruleSensorCSV EOF
            {
             newCompositeNode(grammarAccess.getSensorCSVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorCSV=ruleSensorCSV();

            state._fsp--;

             current =iv_ruleSensorCSV; 
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
    // $ANTLR end "entryRuleSensorCSV"


    // $ANTLR start "ruleSensorCSV"
    // InternalSmartHome.g:595:1: ruleSensorCSV returns [EObject current=null] : ( () otherlv_1= 'SensorCSV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( (lv_file_4_0= ruleEString ) ) ) ;
    public final EObject ruleSensorCSV() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:601:2: ( ( () otherlv_1= 'SensorCSV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( (lv_file_4_0= ruleEString ) ) ) )
            // InternalSmartHome.g:602:2: ( () otherlv_1= 'SensorCSV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( (lv_file_4_0= ruleEString ) ) )
            {
            // InternalSmartHome.g:602:2: ( () otherlv_1= 'SensorCSV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( (lv_file_4_0= ruleEString ) ) )
            // InternalSmartHome.g:603:3: () otherlv_1= 'SensorCSV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( (lv_file_4_0= ruleEString ) )
            {
            // InternalSmartHome.g:603:3: ()
            // InternalSmartHome.g:604:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorCSVAccess().getSensorCSVAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorCSVAccess().getSensorCSVKeyword_1());
            		
            // InternalSmartHome.g:614:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHome.g:615:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHome.g:615:4: (lv_name_2_0= ruleEString )
            // InternalSmartHome.g:616:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorCSVAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorCSVRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorCSVAccess().getFromKeyword_3());
            		
            // InternalSmartHome.g:637:3: ( (lv_file_4_0= ruleEString ) )
            // InternalSmartHome.g:638:4: (lv_file_4_0= ruleEString )
            {
            // InternalSmartHome.g:638:4: (lv_file_4_0= ruleEString )
            // InternalSmartHome.g:639:5: lv_file_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorCSVAccess().getFileEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_file_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorCSVRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_4_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
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
    // $ANTLR end "ruleSensorCSV"


    // $ANTLR start "entryRulePattern"
    // InternalSmartHome.g:660:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalSmartHome.g:660:48: (iv_rulePattern= rulePattern EOF )
            // InternalSmartHome.g:661:2: iv_rulePattern= rulePattern EOF
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
    // InternalSmartHome.g:667:1: rulePattern returns [EObject current=null] : ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) ) (otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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

        EObject lv_rules_6_0 = null;

        EObject lv_rules_8_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:673:2: ( ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) ) (otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalSmartHome.g:674:2: ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) ) (otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalSmartHome.g:674:2: ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) ) (otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalSmartHome.g:675:3: () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) ) (otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalSmartHome.g:675:3: ()
            // InternalSmartHome.g:676:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getActivityKeyword_1());
            		
            // InternalSmartHome.g:686:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHome.g:687:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHome.g:687:4: (lv_name_2_0= ruleEString )
            // InternalSmartHome.g:688:5: lv_name_2_0= ruleEString
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
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartHome.g:709:3: (otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) ) (otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmartHome.g:710:4: otherlv_4= 'rules' otherlv_5= '{' ( (lv_rules_6_0= ruleRule ) ) (otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getRulesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmartHome.g:718:4: ( (lv_rules_6_0= ruleRule ) )
                    // InternalSmartHome.g:719:5: (lv_rules_6_0= ruleRule )
                    {
                    // InternalSmartHome.g:719:5: (lv_rules_6_0= ruleRule )
                    // InternalSmartHome.g:720:6: lv_rules_6_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_rules_6_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_6_0,
                    							"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartHome.g:737:4: (otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSmartHome.g:738:5: otherlv_7= 'and' ( (lv_rules_8_0= ruleRule ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getAndKeyword_4_3_0());
                    	    				
                    	    // InternalSmartHome.g:742:5: ( (lv_rules_8_0= ruleRule ) )
                    	    // InternalSmartHome.g:743:6: (lv_rules_8_0= ruleRule )
                    	    {
                    	    // InternalSmartHome.g:743:6: (lv_rules_8_0= ruleRule )
                    	    // InternalSmartHome.g:744:7: lv_rules_8_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_rules_8_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rules",
                    	    								lv_rules_8_0,
                    	    								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRule"
    // InternalSmartHome.g:775:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSmartHome.g:775:45: (iv_ruleRule= ruleRule EOF )
            // InternalSmartHome.g:776:2: iv_ruleRule= ruleRule EOF
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
    // InternalSmartHome.g:782:1: ruleRule returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:788:2: ( ( () ( ( ruleEString ) ) (otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) ) )? ) )
            // InternalSmartHome.g:789:2: ( () ( ( ruleEString ) ) (otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) ) )? )
            {
            // InternalSmartHome.g:789:2: ( () ( ( ruleEString ) ) (otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) ) )? )
            // InternalSmartHome.g:790:3: () ( ( ruleEString ) ) (otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) ) )?
            {
            // InternalSmartHome.g:790:3: ()
            // InternalSmartHome.g:791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleAccess().getRuleAction_0(),
            					current);
            			

            }

            // InternalSmartHome.g:797:3: ( ( ruleEString ) )
            // InternalSmartHome.g:798:4: ( ruleEString )
            {
            // InternalSmartHome.g:798:4: ( ruleEString )
            // InternalSmartHome.g:799:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRuleAccess().getPredicatePredicateCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHome.g:813:3: (otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmartHome.g:814:4: otherlv_2= 'for' ( (lv_duration_3_0= ruleDuration ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getForKeyword_2_0());
                    			
                    // InternalSmartHome.g:818:4: ( (lv_duration_3_0= ruleDuration ) )
                    // InternalSmartHome.g:819:5: (lv_duration_3_0= ruleDuration )
                    {
                    // InternalSmartHome.g:819:5: (lv_duration_3_0= ruleDuration )
                    // InternalSmartHome.g:820:6: lv_duration_3_0= ruleDuration
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_3_0=ruleDuration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_3_0,
                    							"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Duration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDuration"
    // InternalSmartHome.g:842:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalSmartHome.g:842:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalSmartHome.g:843:2: iv_ruleDuration= ruleDuration EOF
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
    // InternalSmartHome.g:849:1: ruleDuration returns [EObject current=null] : ( () ( (lv_duration_1_0= RULE_INT ) ) ( (lv_precision_2_0= rulePrecision ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token lv_duration_1_0=null;
        Enumerator lv_precision_2_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:855:2: ( ( () ( (lv_duration_1_0= RULE_INT ) ) ( (lv_precision_2_0= rulePrecision ) ) ) )
            // InternalSmartHome.g:856:2: ( () ( (lv_duration_1_0= RULE_INT ) ) ( (lv_precision_2_0= rulePrecision ) ) )
            {
            // InternalSmartHome.g:856:2: ( () ( (lv_duration_1_0= RULE_INT ) ) ( (lv_precision_2_0= rulePrecision ) ) )
            // InternalSmartHome.g:857:3: () ( (lv_duration_1_0= RULE_INT ) ) ( (lv_precision_2_0= rulePrecision ) )
            {
            // InternalSmartHome.g:857:3: ()
            // InternalSmartHome.g:858:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            // InternalSmartHome.g:864:3: ( (lv_duration_1_0= RULE_INT ) )
            // InternalSmartHome.g:865:4: (lv_duration_1_0= RULE_INT )
            {
            // InternalSmartHome.g:865:4: (lv_duration_1_0= RULE_INT )
            // InternalSmartHome.g:866:5: lv_duration_1_0= RULE_INT
            {
            lv_duration_1_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_duration_1_0, grammarAccess.getDurationAccess().getDurationINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmartHome.g:882:3: ( (lv_precision_2_0= rulePrecision ) )
            // InternalSmartHome.g:883:4: (lv_precision_2_0= rulePrecision )
            {
            // InternalSmartHome.g:883:4: (lv_precision_2_0= rulePrecision )
            // InternalSmartHome.g:884:5: lv_precision_2_0= rulePrecision
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
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Precision");
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


    // $ANTLR start "entryRuleEString"
    // InternalSmartHome.g:905:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmartHome.g:905:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmartHome.g:906:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmartHome.g:912:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmartHome.g:918:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmartHome.g:919:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmartHome.g:919:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalSmartHome.g:920:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:928:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleOperator"
    // InternalSmartHome.g:939:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartHome.g:945:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // InternalSmartHome.g:946:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // InternalSmartHome.g:946:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSmartHome.g:947:3: (enumLiteral_0= '=' )
                    {
                    // InternalSmartHome.g:947:3: (enumLiteral_0= '=' )
                    // InternalSmartHome.g:948:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:955:3: (enumLiteral_1= '<' )
                    {
                    // InternalSmartHome.g:955:3: (enumLiteral_1= '<' )
                    // InternalSmartHome.g:956:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:963:3: (enumLiteral_2= '>' )
                    {
                    // InternalSmartHome.g:963:3: (enumLiteral_2= '>' )
                    // InternalSmartHome.g:964:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_2());
                    			

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


    // $ANTLR start "rulePrecision"
    // InternalSmartHome.g:974:1: rulePrecision returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'milliseconds' ) | (enumLiteral_2= 'minutes' ) ) ;
    public final Enumerator rulePrecision() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartHome.g:980:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'milliseconds' ) | (enumLiteral_2= 'minutes' ) ) )
            // InternalSmartHome.g:981:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'milliseconds' ) | (enumLiteral_2= 'minutes' ) )
            {
            // InternalSmartHome.g:981:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'milliseconds' ) | (enumLiteral_2= 'minutes' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSmartHome.g:982:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalSmartHome.g:982:3: (enumLiteral_0= 'seconds' )
                    // InternalSmartHome.g:983:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:990:3: (enumLiteral_1= 'milliseconds' )
                    {
                    // InternalSmartHome.g:990:3: (enumLiteral_1= 'milliseconds' )
                    // InternalSmartHome.g:991:4: enumLiteral_1= 'milliseconds'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:998:3: (enumLiteral_2= 'minutes' )
                    {
                    // InternalSmartHome.g:998:3: (enumLiteral_2= 'minutes' )
                    // InternalSmartHome.g:999:4: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

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


    // $ANTLR start "ruleActivity"
    // InternalSmartHome.g:1009:1: ruleActivity returns [Enumerator current=null] : ( (enumLiteral_0= 'laying' ) | (enumLiteral_1= 'sitting' ) | (enumLiteral_2= 'standing' ) ) ;
    public final Enumerator ruleActivity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartHome.g:1015:2: ( ( (enumLiteral_0= 'laying' ) | (enumLiteral_1= 'sitting' ) | (enumLiteral_2= 'standing' ) ) )
            // InternalSmartHome.g:1016:2: ( (enumLiteral_0= 'laying' ) | (enumLiteral_1= 'sitting' ) | (enumLiteral_2= 'standing' ) )
            {
            // InternalSmartHome.g:1016:2: ( (enumLiteral_0= 'laying' ) | (enumLiteral_1= 'sitting' ) | (enumLiteral_2= 'standing' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSmartHome.g:1017:3: (enumLiteral_0= 'laying' )
                    {
                    // InternalSmartHome.g:1017:3: (enumLiteral_0= 'laying' )
                    // InternalSmartHome.g:1018:4: enumLiteral_0= 'laying'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:1025:3: (enumLiteral_1= 'sitting' )
                    {
                    // InternalSmartHome.g:1025:3: (enumLiteral_1= 'sitting' )
                    // InternalSmartHome.g:1026:4: enumLiteral_1= 'sitting'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:1033:3: (enumLiteral_2= 'standing' )
                    {
                    // InternalSmartHome.g:1033:3: (enumLiteral_2= 'standing' )
                    // InternalSmartHome.g:1034:4: enumLiteral_2= 'standing'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_2());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000700000000L});

}