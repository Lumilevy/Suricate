/*
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SuricateGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ProgrammeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Programme");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsLigneParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Programme:
		//	elements+=Ligne*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Ligne*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Ligne
		public RuleCall getElementsLigneParserRuleCall_0() { return cElementsLigneParserRuleCall_0; }
	}
	public class LigneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Ligne");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAffectationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Ligne:
		//	Affectation | Operation;
		@Override public ParserRule getRule() { return rule; }
		
		//Affectation | Operation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Affectation
		public RuleCall getAffectationParserRuleCall_0() { return cAffectationParserRuleCall_0; }
		
		//Operation
		public RuleCall getOperationParserRuleCall_1() { return cOperationParserRuleCall_1; }
	}
	public class AffectationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Affectation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cObjObjetParserRuleCall_0_0 = (RuleCall)cObjAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVarVariableParserRuleCall_2_0 = (RuleCall)cVarAssignment_2.eContents().get(0);
		
		//Affectation:
		//	obj=Objet "->" var=Variable;
		@Override public ParserRule getRule() { return rule; }
		
		//obj=Objet "->" var=Variable
		public Group getGroup() { return cGroup; }
		
		//obj=Objet
		public Assignment getObjAssignment_0() { return cObjAssignment_0; }
		
		//Objet
		public RuleCall getObjObjetParserRuleCall_0_0() { return cObjObjetParserRuleCall_0_0; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//var=Variable
		public Assignment getVarAssignment_2() { return cVarAssignment_2; }
		
		//Variable
		public RuleCall getVarVariableParserRuleCall_2_0() { return cVarVariableParserRuleCall_2_0; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Variable");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Variable:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ObjetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Objet");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConstructeurParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Objet:
		//	Constructeur | STRING | INT;
		@Override public ParserRule getRule() { return rule; }
		
		//Constructeur | STRING | INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Constructeur
		public RuleCall getConstructeurParserRuleCall_0() { return cConstructeurParserRuleCall_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	public class ConstructeurElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Constructeur");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Constructeur:
		//	name=ID "(" ")";
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID "(" ")"
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cNameVariableCrossReference_0_0 = (CrossReference)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNameVariableIDTerminalRuleCall_0_0_1 = (RuleCall)cNameVariableCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMethodeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMethodeMethodeParserRuleCall_2_0 = (RuleCall)cMethodeAssignment_2.eContents().get(0);
		
		//Operation:
		//	name=[Variable] "." methode=Methode;
		@Override public ParserRule getRule() { return rule; }
		
		//name=[Variable] "." methode=Methode
		public Group getGroup() { return cGroup; }
		
		//name=[Variable]
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//[Variable]
		public CrossReference getNameVariableCrossReference_0_0() { return cNameVariableCrossReference_0_0; }
		
		//ID
		public RuleCall getNameVariableIDTerminalRuleCall_0_0_1() { return cNameVariableIDTerminalRuleCall_0_0_1; }
		
		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//methode=Methode
		public Assignment getMethodeAssignment_2() { return cMethodeAssignment_2; }
		
		//Methode
		public RuleCall getMethodeMethodeParserRuleCall_2_0() { return cMethodeMethodeParserRuleCall_2_0; }
	}
	public class MethodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Methode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParaAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParaParametreParserRuleCall_2_0_0 = (RuleCall)cParaAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParaAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParaParametreParserRuleCall_2_1_1_0 = (RuleCall)cParaAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Methode:
		//	ID "(" (para=Parametre ("," para=Parametre)*)* ")";
		@Override public ParserRule getRule() { return rule; }
		
		//ID "(" (para=Parametre ("," para=Parametre)*)* ")"
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(para=Parametre ("," para=Parametre)*)*
		public Group getGroup_2() { return cGroup_2; }
		
		//para=Parametre
		public Assignment getParaAssignment_2_0() { return cParaAssignment_2_0; }
		
		//Parametre
		public RuleCall getParaParametreParserRuleCall_2_0_0() { return cParaParametreParserRuleCall_2_0_0; }
		
		//("," para=Parametre)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//para=Parametre
		public Assignment getParaAssignment_2_1_1() { return cParaAssignment_2_1_1; }
		
		//Parametre
		public RuleCall getParaParametreParserRuleCall_2_1_1_0() { return cParaParametreParserRuleCall_2_1_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ParametreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.fil2018.flomira.Suricate.Parametre");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cObjetParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVariableParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Parametre:
		//	Objet | Variable;
		@Override public ParserRule getRule() { return rule; }
		
		//Objet | Variable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Objet
		public RuleCall getObjetParserRuleCall_0() { return cObjetParserRuleCall_0; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_1() { return cVariableParserRuleCall_1; }
	}
	
	
	private final ProgrammeElements pProgramme;
	private final LigneElements pLigne;
	private final AffectationElements pAffectation;
	private final VariableElements pVariable;
	private final ObjetElements pObjet;
	private final ConstructeurElements pConstructeur;
	private final OperationElements pOperation;
	private final MethodeElements pMethode;
	private final ParametreElements pParametre;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SuricateGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgramme = new ProgrammeElements();
		this.pLigne = new LigneElements();
		this.pAffectation = new AffectationElements();
		this.pVariable = new VariableElements();
		this.pObjet = new ObjetElements();
		this.pConstructeur = new ConstructeurElements();
		this.pOperation = new OperationElements();
		this.pMethode = new MethodeElements();
		this.pParametre = new ParametreElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.fil2018.flomira.Suricate".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Programme:
	//	elements+=Ligne*;
	public ProgrammeElements getProgrammeAccess() {
		return pProgramme;
	}
	
	public ParserRule getProgrammeRule() {
		return getProgrammeAccess().getRule();
	}
	
	//Ligne:
	//	Affectation | Operation;
	public LigneElements getLigneAccess() {
		return pLigne;
	}
	
	public ParserRule getLigneRule() {
		return getLigneAccess().getRule();
	}
	
	//Affectation:
	//	obj=Objet "->" var=Variable;
	public AffectationElements getAffectationAccess() {
		return pAffectation;
	}
	
	public ParserRule getAffectationRule() {
		return getAffectationAccess().getRule();
	}
	
	//Variable:
	//	name=ID;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//Objet:
	//	Constructeur | STRING | INT;
	public ObjetElements getObjetAccess() {
		return pObjet;
	}
	
	public ParserRule getObjetRule() {
		return getObjetAccess().getRule();
	}
	
	//Constructeur:
	//	name=ID "(" ")";
	public ConstructeurElements getConstructeurAccess() {
		return pConstructeur;
	}
	
	public ParserRule getConstructeurRule() {
		return getConstructeurAccess().getRule();
	}
	
	//Operation:
	//	name=[Variable] "." methode=Methode;
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//Methode:
	//	ID "(" (para=Parametre ("," para=Parametre)*)* ")";
	public MethodeElements getMethodeAccess() {
		return pMethode;
	}
	
	public ParserRule getMethodeRule() {
		return getMethodeAccess().getRule();
	}
	
	//Parametre:
	//	Objet | Variable;
	public ParametreElements getParametreAccess() {
		return pParametre;
	}
	
	public ParserRule getParametreRule() {
		return getParametreAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
