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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'sensors'", "','", "'}'", "'Sensor'"
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
    // InternalSmartHome.g:71:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= '{' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_sensors_5_0 = null;

        EObject lv_sensors_7_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:77:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= '{' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSmartHome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= '{' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSmartHome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= '{' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSmartHome.g:79:3: () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= '{' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? otherlv_9= '}'
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
            		
            // InternalSmartHome.g:94:3: (otherlv_3= 'sensors' otherlv_4= '{' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmartHome.g:95:4: otherlv_3= 'sensors' otherlv_4= '{' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getHomeAccess().getSensorsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSmartHome.g:103:4: ( (lv_sensors_5_0= ruleSensor ) )
                    // InternalSmartHome.g:104:5: (lv_sensors_5_0= ruleSensor )
                    {
                    // InternalSmartHome.g:104:5: (lv_sensors_5_0= ruleSensor )
                    // InternalSmartHome.g:105:6: lv_sensors_5_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_sensors_5_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"sensors",
                    							lv_sensors_5_0,
                    							"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartHome.g:122:4: (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmartHome.g:123:5: otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHomeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmartHome.g:127:5: ( (lv_sensors_7_0= ruleSensor ) )
                    	    // InternalSmartHome.g:128:6: (lv_sensors_7_0= ruleSensor )
                    	    {
                    	    // InternalSmartHome.g:128:6: (lv_sensors_7_0= ruleSensor )
                    	    // InternalSmartHome.g:129:7: lv_sensors_7_0= ruleSensor
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_sensors_7_0=ruleSensor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensors",
                    	    								lv_sensors_7_0,
                    	    								"fr.unice.polytech.alexisc.smarthomedsl.SmartHome.Sensor");
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

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalSmartHome.g:160:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartHome.g:160:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartHome.g:161:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalSmartHome.g:167:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:173:2: ( ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmartHome.g:174:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmartHome.g:174:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmartHome.g:175:3: () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmartHome.g:175:3: ()
            // InternalSmartHome.g:176:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalSmartHome.g:186:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHome.g:187:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHome.g:187:4: (lv_name_2_0= ruleEString )
            // InternalSmartHome.g:188:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleEString"
    // InternalSmartHome.g:209:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmartHome.g:209:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmartHome.g:210:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmartHome.g:216:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmartHome.g:222:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmartHome.g:223:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmartHome.g:223:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalSmartHome.g:224:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:232:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});

}