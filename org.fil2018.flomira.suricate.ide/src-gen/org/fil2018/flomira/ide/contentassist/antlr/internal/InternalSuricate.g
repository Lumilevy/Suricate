/*
 * generated by Xtext 2.10.0
 */
grammar InternalSuricate;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.fil2018.flomira.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.fil2018.flomira.ide.contentassist.antlr.internal;

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
import org.fil2018.flomira.services.SuricateGrammarAccess;

}
@parser::members {
	private SuricateGrammarAccess grammarAccess;

	public void setGrammarAccess(SuricateGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleProgramme
entryRuleProgramme
:
{ before(grammarAccess.getProgrammeRule()); }
	 ruleProgramme
{ after(grammarAccess.getProgrammeRule()); } 
	 EOF 
;

// Rule Programme
ruleProgramme 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgrammeAccess().getElementsAssignment()); }
		(rule__Programme__ElementsAssignment)*
		{ after(grammarAccess.getProgrammeAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLigne
entryRuleLigne
:
{ before(grammarAccess.getLigneRule()); }
	 ruleLigne
{ after(grammarAccess.getLigneRule()); } 
	 EOF 
;

// Rule Ligne
ruleLigne 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLigneAccess().getAlternatives()); }
		(rule__Ligne__Alternatives)
		{ after(grammarAccess.getLigneAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAffectation
entryRuleAffectation
:
{ before(grammarAccess.getAffectationRule()); }
	 ruleAffectation
{ after(grammarAccess.getAffectationRule()); } 
	 EOF 
;

// Rule Affectation
ruleAffectation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAffectationAccess().getGroup()); }
		(rule__Affectation__Group__0)
		{ after(grammarAccess.getAffectationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariable
entryRuleVariable
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAccess().getNameAssignment()); }
		(rule__Variable__NameAssignment)
		{ after(grammarAccess.getVariableAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObjet
entryRuleObjet
:
{ before(grammarAccess.getObjetRule()); }
	 ruleObjet
{ after(grammarAccess.getObjetRule()); } 
	 EOF 
;

// Rule Objet
ruleObjet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObjetAccess().getAlternatives()); }
		(rule__Objet__Alternatives)
		{ after(grammarAccess.getObjetAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntLiteral
entryRuleIntLiteral
:
{ before(grammarAccess.getIntLiteralRule()); }
	 ruleIntLiteral
{ after(grammarAccess.getIntLiteralRule()); } 
	 EOF 
;

// Rule IntLiteral
ruleIntLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntLiteralAccess().getNameAssignment()); }
		(rule__IntLiteral__NameAssignment)
		{ after(grammarAccess.getIntLiteralAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral
:
{ before(grammarAccess.getStringLiteralRule()); }
	 ruleStringLiteral
{ after(grammarAccess.getStringLiteralRule()); } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringLiteralAccess().getNameAssignment()); }
		(rule__StringLiteral__NameAssignment)
		{ after(grammarAccess.getStringLiteralAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstructeur
entryRuleConstructeur
:
{ before(grammarAccess.getConstructeurRule()); }
	 ruleConstructeur
{ after(grammarAccess.getConstructeurRule()); } 
	 EOF 
;

// Rule Constructeur
ruleConstructeur 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstructeurAccess().getGroup()); }
		(rule__Constructeur__Group__0)
		{ after(grammarAccess.getConstructeurAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperation
entryRuleOperation
:
{ before(grammarAccess.getOperationRule()); }
	 ruleOperation
{ after(grammarAccess.getOperationRule()); } 
	 EOF 
;

// Rule Operation
ruleOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperationAccess().getGroup()); }
		(rule__Operation__Group__0)
		{ after(grammarAccess.getOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMethode
entryRuleMethode
:
{ before(grammarAccess.getMethodeRule()); }
	 ruleMethode
{ after(grammarAccess.getMethodeRule()); } 
	 EOF 
;

// Rule Methode
ruleMethode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMethodeAccess().getGroup()); }
		(rule__Methode__Group__0)
		{ after(grammarAccess.getMethodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParametre
entryRuleParametre
:
{ before(grammarAccess.getParametreRule()); }
	 ruleParametre
{ after(grammarAccess.getParametreRule()); } 
	 EOF 
;

// Rule Parametre
ruleParametre 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParametreAccess().getAlternatives()); }
		(rule__Parametre__Alternatives)
		{ after(grammarAccess.getParametreAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ligne__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLigneAccess().getAffectationParserRuleCall_0()); }
		ruleAffectation
		{ after(grammarAccess.getLigneAccess().getAffectationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLigneAccess().getOperationParserRuleCall_1()); }
		ruleOperation
		{ after(grammarAccess.getLigneAccess().getOperationParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Objet__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjetAccess().getConstructeurParserRuleCall_0()); }
		ruleConstructeur
		{ after(grammarAccess.getObjetAccess().getConstructeurParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getObjetAccess().getStringLiteralParserRuleCall_1()); }
		ruleStringLiteral
		{ after(grammarAccess.getObjetAccess().getStringLiteralParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getObjetAccess().getIntLiteralParserRuleCall_2()); }
		ruleIntLiteral
		{ after(grammarAccess.getObjetAccess().getIntLiteralParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getObjetAccess().getOperationParserRuleCall_3()); }
		ruleOperation
		{ after(grammarAccess.getObjetAccess().getOperationParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parametre__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParametreAccess().getObjetParserRuleCall_0()); }
		ruleObjet
		{ after(grammarAccess.getParametreAccess().getObjetParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getParametreAccess().getVariableParserRuleCall_1()); }
		ruleVariable
		{ after(grammarAccess.getParametreAccess().getVariableParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affectation__Group__0__Impl
	rule__Affectation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectationAccess().getColonKeyword_0()); }
	':'
	{ after(grammarAccess.getAffectationAccess().getColonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affectation__Group__1__Impl
	rule__Affectation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectationAccess().getObjAssignment_1()); }
	(rule__Affectation__ObjAssignment_1)
	{ after(grammarAccess.getAffectationAccess().getObjAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affectation__Group__2__Impl
	rule__Affectation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectationAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
	'->'
	{ after(grammarAccess.getAffectationAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affectation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectationAccess().getVarAssignment_3()); }
	(rule__Affectation__VarAssignment_3)
	{ after(grammarAccess.getAffectationAccess().getVarAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Constructeur__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constructeur__Group__0__Impl
	rule__Constructeur__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Constructeur__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructeurAccess().getNameAssignment_0()); }
	(rule__Constructeur__NameAssignment_0)
	{ after(grammarAccess.getConstructeurAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constructeur__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constructeur__Group__1__Impl
	rule__Constructeur__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Constructeur__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructeurAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getConstructeurAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constructeur__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constructeur__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Constructeur__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructeurAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getConstructeurAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Operation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Operation__Group__0__Impl
	rule__Operation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationAccess().getNameAssignment_0()); }
	(rule__Operation__NameAssignment_0)
	{ after(grammarAccess.getOperationAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Operation__Group__1__Impl
	rule__Operation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getOperationAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Operation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationAccess().getMethodeAssignment_2()); }
	(rule__Operation__MethodeAssignment_2)
	{ after(grammarAccess.getOperationAccess().getMethodeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__0__Impl
	rule__Methode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getMethodeAction_0()); }
	()
	{ after(grammarAccess.getMethodeAccess().getMethodeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__1__Impl
	rule__Methode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getMethodeAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__2__Impl
	rule__Methode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__3__Impl
	rule__Methode__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getGroup_3()); }
	(rule__Methode__Group_3__0)*
	{ after(grammarAccess.getMethodeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3__0__Impl
	rule__Methode__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getParamsAssignment_3_0()); }
	(rule__Methode__ParamsAssignment_3_0)
	{ after(grammarAccess.getMethodeAccess().getParamsAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getGroup_3_1()); }
	(rule__Methode__Group_3_1__0)*
	{ after(grammarAccess.getMethodeAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3_1__0__Impl
	rule__Methode__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getMethodeAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getParamsAssignment_3_1_1()); }
	(rule__Methode__ParamsAssignment_3_1_1)
	{ after(grammarAccess.getMethodeAccess().getParamsAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Programme__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgrammeAccess().getElementsLigneParserRuleCall_0()); }
		ruleLigne
		{ after(grammarAccess.getProgrammeAccess().getElementsLigneParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__ObjAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAffectationAccess().getObjObjetParserRuleCall_1_0()); }
		ruleObjet
		{ after(grammarAccess.getAffectationAccess().getObjObjetParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affectation__VarAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAffectationAccess().getVarVariableParserRuleCall_3_0()); }
		ruleVariable
		{ after(grammarAccess.getAffectationAccess().getVarVariableParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntLiteral__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntLiteralAccess().getNameINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getIntLiteralAccess().getNameINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getNameSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringLiteralAccess().getNameSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constructeur__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstructeurAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getConstructeurAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationAccess().getNameVariableCrossReference_0_0()); }
		(
			{ before(grammarAccess.getOperationAccess().getNameVariableIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getOperationAccess().getNameVariableIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getOperationAccess().getNameVariableCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__MethodeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationAccess().getMethodeMethodeParserRuleCall_2_0()); }
		ruleMethode
		{ after(grammarAccess.getOperationAccess().getMethodeMethodeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__ParamsAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getParamsParametreParserRuleCall_3_0_0()); }
		ruleParametre
		{ after(grammarAccess.getMethodeAccess().getParamsParametreParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__ParamsAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getParamsParametreParserRuleCall_3_1_1_0()); }
		ruleParametre
		{ after(grammarAccess.getMethodeAccess().getParamsParametreParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
