/*
 * generated by Xtext 2.14.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package smarthome.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleHome
entryRuleHome returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHomeRule()); }
	iv_ruleHome=ruleHome
	{ $current=$iv_ruleHome.current; }
	EOF;

// Rule Home
ruleHome returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHomeAccess().getHomeAction_0(),
					$current);
			}
		)
		otherlv_1='Home'
		{
			newLeafNode(otherlv_1, grammarAccess.getHomeAccess().getHomeKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='eventFile'
			{
				newLeafNode(otherlv_3, grammarAccess.getHomeAccess().getEventFileKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHomeAccess().getFileEventsEStringParserRuleCall_3_1_0());
					}
					lv_fileEvents_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHomeRule());
						}
						set(
							$current,
							"fileEvents",
							lv_fileEvents_4_0,
							"smarthome.dsl.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_5='rooms'
			{
				newLeafNode(otherlv_5, grammarAccess.getHomeAccess().getRoomsKeyword_4_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_4_2_0());
					}
					lv_rooms_7_0=ruleRoom
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHomeRule());
						}
						add(
							$current,
							"rooms",
							lv_rooms_7_0,
							"smarthome.dsl.Dsl.Room");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getHomeAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getHomeAccess().getRoomsRoomParserRuleCall_4_3_1_0());
						}
						lv_rooms_9_0=ruleRoom
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getHomeRule());
							}
							add(
								$current,
								"rooms",
								lv_rooms_9_0,
								"smarthome.dsl.Dsl.Room");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_11='persons'
			{
				newLeafNode(otherlv_11, grammarAccess.getHomeAccess().getPersonsKeyword_5_0());
			}
			otherlv_12='{'
			{
				newLeafNode(otherlv_12, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_5_2_0());
					}
					lv_persons_13_0=rulePerson
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHomeRule());
						}
						add(
							$current,
							"persons",
							lv_persons_13_0,
							"smarthome.dsl.Dsl.Person");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getHomeAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getHomeAccess().getPersonsPersonParserRuleCall_5_3_1_0());
						}
						lv_persons_15_0=rulePerson
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getHomeRule());
							}
							add(
								$current,
								"persons",
								lv_persons_15_0,
								"smarthome.dsl.Dsl.Person");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16='}'
			{
				newLeafNode(otherlv_16, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		(
			otherlv_17='patterns'
			{
				newLeafNode(otherlv_17, grammarAccess.getHomeAccess().getPatternsKeyword_6_0());
			}
			otherlv_18='{'
			{
				newLeafNode(otherlv_18, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_6_2_0());
					}
					lv_patterns_19_0=rulePattern
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHomeRule());
						}
						add(
							$current,
							"patterns",
							lv_patterns_19_0,
							"smarthome.dsl.Dsl.Pattern");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=','
				{
					newLeafNode(otherlv_20, grammarAccess.getHomeAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getHomeAccess().getPatternsPatternParserRuleCall_6_3_1_0());
						}
						lv_patterns_21_0=rulePattern
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getHomeRule());
							}
							add(
								$current,
								"patterns",
								lv_patterns_21_0,
								"smarthome.dsl.Dsl.Pattern");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_22='}'
			{
				newLeafNode(otherlv_22, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		(
			otherlv_23='monitor'
			{
				newLeafNode(otherlv_23, grammarAccess.getHomeAccess().getMonitorKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHomeRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_7_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_25=','
				{
					newLeafNode(otherlv_25, grammarAccess.getHomeAccess().getCommaKeyword_7_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getHomeRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getHomeAccess().getMonitoredEntitiesNamedEntityCrossReference_7_2_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_27='start'
		{
			newLeafNode(otherlv_27, grammarAccess.getHomeAccess().getStartKeyword_8());
		}
		otherlv_28='}'
		{
			newLeafNode(otherlv_28, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSensorAccess().getAnalogSensorParserRuleCall_0());
		}
		this_AnalogSensor_0=ruleAnalogSensor
		{
			$current = $this_AnalogSensor_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSensorAccess().getDigitalSensorParserRuleCall_1());
		}
		this_DigitalSensor_1=ruleDigitalSensor
		{
			$current = $this_DigitalSensor_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePredicate
entryRulePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicateRule()); }
	iv_rulePredicate=rulePredicate
	{ $current=$iv_rulePredicate.current; }
	EOF;

// Rule Predicate
rulePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPredicateAccess().getSensorPredicateParserRuleCall_0());
		}
		this_SensorPredicate_0=ruleSensorPredicate
		{
			$current = $this_SensorPredicate_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPredicateAccess().getPersonPredicateParserRuleCall_1());
		}
		this_PersonPredicate_1=rulePersonPredicate
		{
			$current = $this_PersonPredicate_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRoom
entryRuleRoom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoomRule()); }
	iv_ruleRoom=ruleRoom
	{ $current=$iv_ruleRoom.current; }
	EOF;

// Rule Room
ruleRoom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRoomAccess().getRoomAction_0(),
					$current);
			}
		)
		otherlv_1='Room'
		{
			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoomRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"smarthome.dsl.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_0_0());
					}
					lv_sensors_4_0=ruleSensor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRoomRule());
						}
						add(
							$current,
							"sensors",
							lv_sensors_4_0,
							"smarthome.dsl.Dsl.Sensor");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_1_1_0());
						}
						lv_sensors_6_0=ruleSensor
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRoomRule());
							}
							add(
								$current,
								"sensors",
								lv_sensors_6_0,
								"smarthome.dsl.Dsl.Sensor");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulePerson
entryRulePerson returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonRule()); }
	iv_rulePerson=rulePerson
	{ $current=$iv_rulePerson.current; }
	EOF;

// Rule Person
rulePerson returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPersonAccess().getPersonAction_0(),
					$current);
			}
		)
		otherlv_1='Person'
		{
			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getPersonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"smarthome.dsl.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='left-ankle'
		{
			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getLeftAnkleKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getAnkleLeftTagParserRuleCall_5_0());
				}
				lv_ankleLeft_5_0=ruleTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"ankleLeft",
						lv_ankleLeft_5_0,
						"smarthome.dsl.Dsl.Tag");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='right-ankle'
		{
			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getRightAnkleKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getAnkleRightTagParserRuleCall_7_0());
				}
				lv_ankleRight_7_0=ruleTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"ankleRight",
						lv_ankleRight_7_0,
						"smarthome.dsl.Dsl.Tag");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='belt'
		{
			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getBeltKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getBeltTagParserRuleCall_9_0());
				}
				lv_belt_9_0=ruleTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"belt",
						lv_belt_9_0,
						"smarthome.dsl.Dsl.Tag");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='chest'
		{
			newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getChestKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getChestTagParserRuleCall_11_0());
				}
				lv_chest_11_0=ruleTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"chest",
						lv_chest_11_0,
						"smarthome.dsl.Dsl.Tag");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleTag
entryRuleTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTagRule()); }
	iv_ruleTag=ruleTag
	{ $current=$iv_ruleTag.current; }
	EOF;

// Rule Tag
ruleTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTagAccess().getTagAction_0(),
					$current);
			}
		)
		otherlv_1='ID'
		{
			newLeafNode(otherlv_1, grammarAccess.getTagAccess().getIDKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTagAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTagRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"smarthome.dsl.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	iv_rulePattern=rulePattern
	{ $current=$iv_rulePattern.current; }
	EOF;

// Rule Pattern
rulePattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPatternAccess().getPatternAction_0(),
					$current);
			}
		)
		otherlv_1='Pattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getPatternKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"smarthome.dsl.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_0_0());
					}
					lv_rules_4_0=ruleRule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPatternRule());
						}
						add(
							$current,
							"rules",
							lv_rules_4_0,
							"smarthome.dsl.Dsl.Rule");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPatternAccess().getRulesRuleParserRuleCall_4_1_1_0());
						}
						lv_rules_6_0=ruleRule
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPatternRule());
							}
							add(
								$current,
								"rules",
								lv_rules_6_0,
								"smarthome.dsl.Dsl.Rule");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleAnalogSensor
entryRuleAnalogSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnalogSensorRule()); }
	iv_ruleAnalogSensor=ruleAnalogSensor
	{ $current=$iv_ruleAnalogSensor.current; }
	EOF;

// Rule AnalogSensor
ruleAnalogSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0(),
					$current);
			}
		)
		otherlv_1='AnalogSensor'
		{
			newLeafNode(otherlv_1, grammarAccess.getAnalogSensorAccess().getAnalogSensorKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"smarthome.dsl.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDigitalSensor
entryRuleDigitalSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDigitalSensorRule()); }
	iv_ruleDigitalSensor=ruleDigitalSensor
	{ $current=$iv_ruleDigitalSensor.current; }
	EOF;

// Rule DigitalSensor
ruleDigitalSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDigitalSensorAccess().getDigitalSensorAction_0(),
					$current);
			}
		)
		otherlv_1='DigitalSensor'
		{
			newLeafNode(otherlv_1, grammarAccess.getDigitalSensorAccess().getDigitalSensorKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDigitalSensorAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDigitalSensorRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"smarthome.dsl.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRuleAccess().getRuleAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_1_0());
					}
					lv_predicates_3_0=rulePredicate
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						add(
							$current,
							"predicates",
							lv_predicates_3_0,
							"smarthome.dsl.Dsl.Predicate");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4='and'
				{
					newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getAndKeyword_2_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleAccess().getPredicatesPredicateParserRuleCall_2_2_1_0());
						}
						lv_predicates_5_0=rulePredicate
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleRule());
							}
							add(
								$current,
								"predicates",
								lv_predicates_5_0,
								"smarthome.dsl.Dsl.Predicate");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightParenthesisKeyword_2_3());
			}
		)?
		(
			(
				otherlv_7='for'
				{
					newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getForKeyword_3_0_0());
				}
				    |
				otherlv_8='since'
				{
					newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getSinceKeyword_3_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_3_1_0());
					}
					lv_duration_9_0=ruleDuration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						set(
							$current,
							"duration",
							lv_duration_9_0,
							"smarthome.dsl.Dsl.Duration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDuration
entryRuleDuration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDurationRule()); }
	iv_ruleDuration=ruleDuration
	{ $current=$iv_ruleDuration.current; }
	EOF;

// Rule Duration
ruleDuration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDurationAccess().getDurationAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDurationAccess().getTimeEIntParserRuleCall_1_0());
				}
				lv_time_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDurationRule());
					}
					set(
						$current,
						"time",
						lv_time_1_0,
						"smarthome.dsl.Dsl.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDurationAccess().getPrecisionPrecisionEnumRuleCall_2_0());
				}
				lv_precision_2_0=rulePrecision
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDurationRule());
					}
					set(
						$current,
						"precision",
						lv_precision_2_0,
						"smarthome.dsl.Dsl.Precision");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSensorPredicate
entryRuleSensorPredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorPredicateRule()); }
	iv_ruleSensorPredicate=ruleSensorPredicate
	{ $current=$iv_ruleSensorPredicate.current; }
	EOF;

// Rule SensorPredicate
ruleSensorPredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSensorPredicateAccess().getSensorPredicateAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSensorPredicateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSensorPredicateAccess().getSensorSensorCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorPredicateAccess().getOperatorOperatorEnumRuleCall_2_0());
				}
				lv_operator_2_0=ruleOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorPredicateRule());
					}
					set(
						$current,
						"operator",
						lv_operator_2_0,
						"smarthome.dsl.Dsl.Operator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorPredicateAccess().getValueEDoubleParserRuleCall_3_0());
				}
				lv_value_3_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorPredicateRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"smarthome.dsl.Dsl.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePersonPredicate
entryRulePersonPredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonPredicateRule()); }
	iv_rulePersonPredicate=rulePersonPredicate
	{ $current=$iv_rulePersonPredicate.current; }
	EOF;

// Rule PersonPredicate
rulePersonPredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPersonPredicateAccess().getPersonPredicateAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPersonPredicateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPersonPredicateAccess().getPersonPersonCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getPersonPredicateAccess().getIsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonPredicateAccess().getActivityActivityEnumRuleCall_3_0());
				}
				lv_activity_3_0=ruleActivity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonPredicateRule());
					}
					set(
						$current,
						"activity",
						lv_activity_3_0,
						"smarthome.dsl.Dsl.Activity");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Rule Operator
ruleOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='>'
			{
				$current = grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getSuperiorEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='<'
			{
				$current = grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getInferiorEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='='
			{
				$current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Activity
ruleActivity returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='standing'
			{
				$current = grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActivityAccess().getStandingEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='laying'
			{
				$current = grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActivityAccess().getLayingEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='sitting'
			{
				$current = grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActivityAccess().getSittingEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Precision
rulePrecision returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='millis'
			{
				$current = grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPrecisionAccess().getMsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='seconds'
			{
				$current = grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPrecisionAccess().getSEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='minutes'
			{
				$current = grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPrecisionAccess().getMEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
