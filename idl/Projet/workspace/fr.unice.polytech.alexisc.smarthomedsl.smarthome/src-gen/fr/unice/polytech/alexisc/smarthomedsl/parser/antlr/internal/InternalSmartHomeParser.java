package fr.unice.polytech.alexisc.smarthomedsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'rooms'", "','", "'}'", "'activities'", "'Room'", "'sensors'", "'Sensor'", "'on'", "'reacts'", "'to'", "'Activity'"
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
    // InternalSmartHome.g:64:1: entryRuleHome returns [EObject current=null] : iv_ruleHome= ruleHome EOF ;
    public final EObject entryRuleHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHome = null;


        try {
            // InternalSmartHome.g:64:45: (iv_ruleHome= ruleHome EOF )
            // InternalSmartHome.g:65:2: iv_ruleHome= ruleHome EOF
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
    // InternalSmartHome.g:71:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'activities' otherlv_10= '{' ( (lv_activities_11_0= ruleActivity ) ) (otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
        EObject lv_rooms_5_0 = null;

        EObject lv_rooms_7_0 = null;

        EObject lv_activities_11_0 = null;

        EObject lv_activities_13_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:77:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'activities' otherlv_10= '{' ( (lv_activities_11_0= ruleActivity ) ) (otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSmartHome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'activities' otherlv_10= '{' ( (lv_activities_11_0= ruleActivity ) ) (otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSmartHome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'activities' otherlv_10= '{' ( (lv_activities_11_0= ruleActivity ) ) (otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSmartHome.g:79:3: () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )? (otherlv_9= 'activities' otherlv_10= '{' ( (lv_activities_11_0= ruleActivity ) ) (otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalSmartHome.g:79:3: ()
            // InternalSmartHome.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeAccess().getHomeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeAccess().getHomeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartHome.g:94:3: (otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmartHome.g:95:4: otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getHomeAccess().getRoomsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSmartHome.g:103:4: ( (lv_rooms_5_0= ruleRoom ) )
                    // InternalSmartHome.g:104:5: (lv_rooms_5_0= ruleRoom )
                    {
                    // InternalSmartHome.g:104:5: (lv_rooms_5_0= ruleRoom )
                    // InternalSmartHome.g:105:6: lv_rooms_5_0= ruleRoom
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
                    							"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Room");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartHome.g:122:4: (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmartHome.g:123:5: otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHomeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmartHome.g:127:5: ( (lv_rooms_7_0= ruleRoom ) )
                    	    // InternalSmartHome.g:128:6: (lv_rooms_7_0= ruleRoom )
                    	    {
                    	    // InternalSmartHome.g:128:6: (lv_rooms_7_0= ruleRoom )
                    	    // InternalSmartHome.g:129:7: lv_rooms_7_0= ruleRoom
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

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSmartHome.g:152:3: (otherlv_9= 'activities' otherlv_10= '{' ( (lv_activities_11_0= ruleActivity ) ) (otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmartHome.g:153:4: otherlv_9= 'activities' otherlv_10= '{' ( (lv_activities_11_0= ruleActivity ) ) (otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getHomeAccess().getActivitiesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmartHome.g:161:4: ( (lv_activities_11_0= ruleActivity ) )
                    // InternalSmartHome.g:162:5: (lv_activities_11_0= ruleActivity )
                    {
                    // InternalSmartHome.g:162:5: (lv_activities_11_0= ruleActivity )
                    // InternalSmartHome.g:163:6: lv_activities_11_0= ruleActivity
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getActivitiesActivityParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_activities_11_0=ruleActivity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"activities",
                    							lv_activities_11_0,
                    							"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Activity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartHome.g:180:4: (otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmartHome.g:181:5: otherlv_12= ',' ( (lv_activities_13_0= ruleActivity ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getHomeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmartHome.g:185:5: ( (lv_activities_13_0= ruleActivity ) )
                    	    // InternalSmartHome.g:186:6: (lv_activities_13_0= ruleActivity )
                    	    {
                    	    // InternalSmartHome.g:186:6: (lv_activities_13_0= ruleActivity )
                    	    // InternalSmartHome.g:187:7: lv_activities_13_0= ruleActivity
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getActivitiesActivityParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_activities_13_0=ruleActivity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activities",
                    	    								lv_activities_13_0,
                    	    								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Activity");
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

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSmartHome.g:218:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalSmartHome.g:218:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalSmartHome.g:219:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalSmartHome.g:225:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalSmartHome.g:231:2: ( ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalSmartHome.g:232:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalSmartHome.g:232:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalSmartHome.g:233:3: () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalSmartHome.g:233:3: ()
            // InternalSmartHome.g:234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalSmartHome.g:244:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHome.g:245:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHome.g:245:4: (lv_name_2_0= ruleEString )
            // InternalSmartHome.g:246:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartHome.g:267:3: (otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartHome.g:268:4: otherlv_4= 'sensors' otherlv_5= '{' ( (lv_sensors_6_0= ruleSensor ) ) (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoomAccess().getSensorsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmartHome.g:276:4: ( (lv_sensors_6_0= ruleSensor ) )
                    // InternalSmartHome.g:277:5: (lv_sensors_6_0= ruleSensor )
                    {
                    // InternalSmartHome.g:277:5: (lv_sensors_6_0= ruleSensor )
                    // InternalSmartHome.g:278:6: lv_sensors_6_0= ruleSensor
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
                    							"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartHome.g:295:4: (otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSmartHome.g:296:5: otherlv_7= ',' ( (lv_sensors_8_0= ruleSensor ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmartHome.g:300:5: ( (lv_sensors_8_0= ruleSensor ) )
                    	    // InternalSmartHome.g:301:6: (lv_sensors_8_0= ruleSensor )
                    	    {
                    	    // InternalSmartHome.g:301:6: (lv_sensors_8_0= ruleSensor )
                    	    // InternalSmartHome.g:302:7: lv_sensors_8_0= ruleSensor
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
                    	    								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Sensor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

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


    // $ANTLR start "entryRuleSensor"
    // InternalSmartHome.g:333:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartHome.g:333:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartHome.g:334:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalSmartHome.g:340:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
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
            // InternalSmartHome.g:346:2: ( ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) ) )
            // InternalSmartHome.g:347:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) )
            {
            // InternalSmartHome.g:347:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) ) )
            // InternalSmartHome.g:348:3: () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( (lv_location_4_0= ruleEString ) ) otherlv_5= 'reacts' otherlv_6= 'to' ( (lv_type_7_0= ruleEString ) )
            {
            // InternalSmartHome.g:348:3: ()
            // InternalSmartHome.g:349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalSmartHome.g:359:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHome.g:360:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHome.g:360:4: (lv_name_2_0= ruleEString )
            // InternalSmartHome.g:361:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getOnKeyword_3());
            		
            // InternalSmartHome.g:382:3: ( (lv_location_4_0= ruleEString ) )
            // InternalSmartHome.g:383:4: (lv_location_4_0= ruleEString )
            {
            // InternalSmartHome.g:383:4: (lv_location_4_0= ruleEString )
            // InternalSmartHome.g:384:5: lv_location_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getLocationEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_location_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_4_0,
            						"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getReactsKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getToKeyword_6());
            		
            // InternalSmartHome.g:409:3: ( (lv_type_7_0= ruleEString ) )
            // InternalSmartHome.g:410:4: (lv_type_7_0= ruleEString )
            {
            // InternalSmartHome.g:410:4: (lv_type_7_0= ruleEString )
            // InternalSmartHome.g:411:5: lv_type_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActivity"
    // InternalSmartHome.g:432:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalSmartHome.g:432:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalSmartHome.g:433:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalSmartHome.g:439:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'Activity' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmartHome.g:445:2: ( ( () otherlv_1= 'Activity' ) )
            // InternalSmartHome.g:446:2: ( () otherlv_1= 'Activity' )
            {
            // InternalSmartHome.g:446:2: ( () otherlv_1= 'Activity' )
            // InternalSmartHome.g:447:3: () otherlv_1= 'Activity'
            {
            // InternalSmartHome.g:447:3: ()
            // InternalSmartHome.g:448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityAccess().getActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalSmartHome.g:462:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmartHome.g:462:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmartHome.g:463:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmartHome.g:469:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmartHome.g:475:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmartHome.g:476:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmartHome.g:476:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmartHome.g:477:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:485:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});

}