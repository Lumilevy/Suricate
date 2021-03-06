/*
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.fil2018.flomira.ide.contentassist.antlr.internal.InternalSuricateParser;
import org.fil2018.flomira.services.SuricateGrammarAccess;

public class SuricateParser extends AbstractContentAssistParser {

	@Inject
	private SuricateGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSuricateParser createParser() {
		InternalSuricateParser result = new InternalSuricateParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLigneAccess().getAlternatives(), "rule__Ligne__Alternatives");
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getAppelMethodeAccess().getAlternatives(), "rule__AppelMethode__Alternatives");
					put(grammarAccess.getTypePrimaireAccess().getAlternatives(), "rule__TypePrimaire__Alternatives");
					put(grammarAccess.getParametreAccess().getAlternatives(), "rule__Parametre__Alternatives");
					put(grammarAccess.getLigneAccess().getGroup_0(), "rule__Ligne__Group_0__0");
					put(grammarAccess.getLigneAccess().getGroup_0_1(), "rule__Ligne__Group_0_1__0");
					put(grammarAccess.getAffectationAccess().getGroup(), "rule__Affectation__Group__0");
					put(grammarAccess.getIfBoucleAccess().getGroup(), "rule__IfBoucle__Group__0");
					put(grammarAccess.getAppelMethCompositeAccess().getGroup(), "rule__AppelMethComposite__Group__0");
					put(grammarAccess.getAppelMethCompositeAccess().getGroup_1(), "rule__AppelMethComposite__Group_1__0");
					put(grammarAccess.getAppelMethSimpleAccess().getGroup(), "rule__AppelMethSimple__Group__0");
					put(grammarAccess.getAppelMethSimpleAccess().getGroup_2(), "rule__AppelMethSimple__Group_2__0");
					put(grammarAccess.getAppelMethSimpleAccess().getGroup_2_1(), "rule__AppelMethSimple__Group_2_1__0");
					put(grammarAccess.getProgrammeAccess().getElementsAssignment(), "rule__Programme__ElementsAssignment");
					put(grammarAccess.getLigneAccess().getInstrAssignment_0_0(), "rule__Ligne__InstrAssignment_0_0");
					put(grammarAccess.getLigneAccess().getVariableAssignment_0_1_1(), "rule__Ligne__VariableAssignment_0_1_1");
					put(grammarAccess.getLigneAccess().getAffAssignment_1(), "rule__Ligne__AffAssignment_1");
					put(grammarAccess.getAffectationAccess().getValeurAssignment_0(), "rule__Affectation__ValeurAssignment_0");
					put(grammarAccess.getAffectationAccess().getVariableAssignment_2(), "rule__Affectation__VariableAssignment_2");
					put(grammarAccess.getInstructionAccess().getMethodeAssignment_0(), "rule__Instruction__MethodeAssignment_0");
					put(grammarAccess.getInstructionAccess().getBoucleAssignment_1(), "rule__Instruction__BoucleAssignment_1");
					put(grammarAccess.getIfBoucleAccess().getIfBodyAssignment_4(), "rule__IfBoucle__IfBodyAssignment_4");
					put(grammarAccess.getAppelMethodeAccess().getSimpleAssignment_0(), "rule__AppelMethode__SimpleAssignment_0");
					put(grammarAccess.getAppelMethodeAccess().getCompositeAssignment_1(), "rule__AppelMethode__CompositeAssignment_1");
					put(grammarAccess.getAppelMethCompositeAccess().getNameAssignment_0(), "rule__AppelMethComposite__NameAssignment_0");
					put(grammarAccess.getAppelMethCompositeAccess().getMethodeAssignment_1_1(), "rule__AppelMethComposite__MethodeAssignment_1_1");
					put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
					put(grammarAccess.getAppelMethSimpleAccess().getMethodeNameAssignment_0(), "rule__AppelMethSimple__MethodeNameAssignment_0");
					put(grammarAccess.getAppelMethSimpleAccess().getParamsAssignment_2_0(), "rule__AppelMethSimple__ParamsAssignment_2_0");
					put(grammarAccess.getAppelMethSimpleAccess().getParamsAssignment_2_1_1(), "rule__AppelMethSimple__ParamsAssignment_2_1_1");
					put(grammarAccess.getParametreAccess().getMethodeAssignment_0(), "rule__Parametre__MethodeAssignment_0");
					put(grammarAccess.getParametreAccess().getVariableAssignment_1(), "rule__Parametre__VariableAssignment_1");
					put(grammarAccess.getParametreAccess().getValeurAssignment_2(), "rule__Parametre__ValeurAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SuricateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SuricateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
