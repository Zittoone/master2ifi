/*
 * generated by Xtext 2.12.0
 */
package fr.unice.polytech.alexisc.smarthomedsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.unice.polytech.alexisc.smarthomedsl.ide.contentassist.antlr.internal.InternalSmartHomeParser;
import fr.unice.polytech.alexisc.smarthomedsl.services.SmartHomeGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SmartHomeParser extends AbstractContentAssistParser {

	@Inject
	private SmartHomeGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSmartHomeParser createParser() {
		InternalSmartHomeParser result = new InternalSmartHomeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getHomeAccess().getGroup(), "rule__Home__Group__0");
					put(grammarAccess.getHomeAccess().getGroup_3(), "rule__Home__Group_3__0");
					put(grammarAccess.getHomeAccess().getGroup_3_3(), "rule__Home__Group_3_3__0");
					put(grammarAccess.getHomeAccess().getGroup_4(), "rule__Home__Group_4__0");
					put(grammarAccess.getHomeAccess().getGroup_4_3(), "rule__Home__Group_4_3__0");
					put(grammarAccess.getRoomAccess().getGroup(), "rule__Room__Group__0");
					put(grammarAccess.getRoomAccess().getGroup_4(), "rule__Room__Group_4__0");
					put(grammarAccess.getRoomAccess().getGroup_4_3(), "rule__Room__Group_4_3__0");
					put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getHomeAccess().getRoomsAssignment_3_2(), "rule__Home__RoomsAssignment_3_2");
					put(grammarAccess.getHomeAccess().getRoomsAssignment_3_3_1(), "rule__Home__RoomsAssignment_3_3_1");
					put(grammarAccess.getHomeAccess().getActivitiesAssignment_4_2(), "rule__Home__ActivitiesAssignment_4_2");
					put(grammarAccess.getHomeAccess().getActivitiesAssignment_4_3_1(), "rule__Home__ActivitiesAssignment_4_3_1");
					put(grammarAccess.getRoomAccess().getNameAssignment_2(), "rule__Room__NameAssignment_2");
					put(grammarAccess.getRoomAccess().getSensorsAssignment_4_2(), "rule__Room__SensorsAssignment_4_2");
					put(grammarAccess.getRoomAccess().getSensorsAssignment_4_3_1(), "rule__Room__SensorsAssignment_4_3_1");
					put(grammarAccess.getSensorAccess().getNameAssignment_2(), "rule__Sensor__NameAssignment_2");
					put(grammarAccess.getSensorAccess().getLocationAssignment_4(), "rule__Sensor__LocationAssignment_4");
					put(grammarAccess.getSensorAccess().getTypeAssignment_7(), "rule__Sensor__TypeAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmartHomeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmartHomeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
