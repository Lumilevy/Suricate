/*
 * generated by Xtext 2.12.0
 */
grammar InternalSuricate;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.fil2018.flomira.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.fil2018.flomira.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.fil2018.flomira.services.SuricateGrammarAccess;

}

@parser::members {

 	private SuricateGrammarAccess grammarAccess;

    public InternalSuricateParser(TokenStream input, SuricateGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Programme";
   	}

   	@Override
   	protected SuricateGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgramme
entryRuleProgramme returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgrammeRule()); }
	iv_ruleProgramme=ruleProgramme
	{ $current=$iv_ruleProgramme.current; }
	EOF;

// Rule Programme
ruleProgramme returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getProgrammeAccess().getElementsLigneParserRuleCall_0());
			}
			lv_elements_0_0=ruleLigne
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getProgrammeRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.fil2018.flomira.Suricate.Ligne");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleLigne
entryRuleLigne returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLigneRule()); }
	iv_ruleLigne=ruleLigne
	{ $current=$iv_ruleLigne.current; }
	EOF;

// Rule Ligne
ruleLigne returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLigneAccess().getAffectationParserRuleCall_0());
		}
		this_Affectation_0=ruleAffectation
		{
			$current = $this_Affectation_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLigneAccess().getOperationParserRuleCall_1());
		}
		this_Operation_1=ruleOperation
		{
			$current = $this_Operation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAffectation
entryRuleAffectation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAffectationRule()); }
	iv_ruleAffectation=ruleAffectation
	{ $current=$iv_ruleAffectation.current; }
	EOF;

// Rule Affectation
ruleAffectation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAffectationAccess().getObjObjetParserRuleCall_0_0());
				}
				lv_obj_0_0=ruleObjet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAffectationRule());
					}
					set(
						$current,
						"obj",
						lv_obj_0_0,
						"org.fil2018.flomira.Suricate.Objet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='->'
		{
			newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getHyphenMinusGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAffectationAccess().getVarVariableParserRuleCall_2_0());
				}
				lv_var_2_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAffectationRule());
					}
					set(
						$current,
						"var",
						lv_var_2_0,
						"org.fil2018.flomira.Suricate.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleObjet
entryRuleObjet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjetRule()); }
	iv_ruleObjet=ruleObjet
	{ $current=$iv_ruleObjet.current; }
	EOF;

// Rule Objet
ruleObjet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getObjetAccess().getConstructeurParserRuleCall_0());
		}
		this_Constructeur_0=ruleConstructeur
		{
			$current = $this_Constructeur_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		this_STRING_1=RULE_STRING
		{
			newLeafNode(this_STRING_1, grammarAccess.getObjetAccess().getSTRINGTerminalRuleCall_1());
		}
		    |
		this_INT_2=RULE_INT
		{
			newLeafNode(this_INT_2, grammarAccess.getObjetAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleConstructeur
entryRuleConstructeur returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstructeurRule()); }
	iv_ruleConstructeur=ruleConstructeur
	{ $current=$iv_ruleConstructeur.current; }
	EOF;

// Rule Constructeur
ruleConstructeur returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getConstructeurAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstructeurRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getConstructeurAccess().getLeftParenthesisKeyword_1());
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstructeurAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getNameVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationAccess().getMethodeMethodeParserRuleCall_2_0());
				}
				lv_methode_2_0=ruleMethode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationRule());
					}
					set(
						$current,
						"methode",
						lv_methode_2_0,
						"org.fil2018.flomira.Suricate.Methode");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMethode
entryRuleMethode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodeRule()); }
	iv_ruleMethode=ruleMethode
	{ $current=$iv_ruleMethode.current; }
	EOF;

// Rule Methode
ruleMethode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			newLeafNode(this_ID_0, grammarAccess.getMethodeAccess().getIDTerminalRuleCall_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodeAccess().getParaParametreParserRuleCall_2_0_0());
					}
					lv_para_2_0=ruleParametre
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodeRule());
						}
						set(
							$current,
							"para",
							lv_para_2_0,
							"org.fil2018.flomira.Suricate.Parametre");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getMethodeAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodeAccess().getParaParametreParserRuleCall_2_1_1_0());
						}
						lv_para_4_0=ruleParametre
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodeRule());
							}
							set(
								$current,
								"para",
								lv_para_4_0,
								"org.fil2018.flomira.Suricate.Parametre");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)*
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleParametre
entryRuleParametre returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParametreRule()); }
	iv_ruleParametre=ruleParametre
	{ $current=$iv_ruleParametre.current; }
	EOF;

// Rule Parametre
ruleParametre returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getParametreAccess().getObjetParserRuleCall_0());
		}
		this_Objet_0=ruleObjet
		{
			$current = $this_Objet_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getParametreAccess().getVariableParserRuleCall_1());
		}
		this_Variable_1=ruleVariable
		{
			$current = $this_Variable_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;