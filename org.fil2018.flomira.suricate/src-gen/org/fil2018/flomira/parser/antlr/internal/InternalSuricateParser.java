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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSuricateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'If'", "'Then'", "'{'", "'}'", "'.'", "'('", "','", "')'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSuricateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSuricateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSuricateParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSuricate.g"; }



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




    // $ANTLR start "entryRuleProgramme"
    // InternalSuricate.g:64:1: entryRuleProgramme returns [EObject current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final EObject entryRuleProgramme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramme = null;


        try {
            // InternalSuricate.g:64:50: (iv_ruleProgramme= ruleProgramme EOF )
            // InternalSuricate.g:65:2: iv_ruleProgramme= ruleProgramme EOF
            {
             newCompositeNode(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;

             current =iv_ruleProgramme; 
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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalSuricate.g:71:1: ruleProgramme returns [EObject current=null] : ( (lv_elements_0_0= ruleLigne ) )* ;
    public final EObject ruleProgramme() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:77:2: ( ( (lv_elements_0_0= ruleLigne ) )* )
            // InternalSuricate.g:78:2: ( (lv_elements_0_0= ruleLigne ) )*
            {
            // InternalSuricate.g:78:2: ( (lv_elements_0_0= ruleLigne ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSuricate.g:79:3: (lv_elements_0_0= ruleLigne )
            	    {
            	    // InternalSuricate.g:79:3: (lv_elements_0_0= ruleLigne )
            	    // InternalSuricate.g:80:4: lv_elements_0_0= ruleLigne
            	    {

            	    				newCompositeNode(grammarAccess.getProgrammeAccess().getElementsLigneParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleLigne();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.fil2018.flomira.Suricate.Ligne");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleLigne"
    // InternalSuricate.g:100:1: entryRuleLigne returns [EObject current=null] : iv_ruleLigne= ruleLigne EOF ;
    public final EObject entryRuleLigne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigne = null;


        try {
            // InternalSuricate.g:100:46: (iv_ruleLigne= ruleLigne EOF )
            // InternalSuricate.g:101:2: iv_ruleLigne= ruleLigne EOF
            {
             newCompositeNode(grammarAccess.getLigneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLigne=ruleLigne();

            state._fsp--;

             current =iv_ruleLigne; 
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
    // $ANTLR end "entryRuleLigne"


    // $ANTLR start "ruleLigne"
    // InternalSuricate.g:107:1: ruleLigne returns [EObject current=null] : ( ( ( (lv_instr_0_0= ruleInstruction ) ) (otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) ) )? ) | ( (lv_aff_3_0= ruleAffectation ) ) ) ;
    public final EObject ruleLigne() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_instr_0_0 = null;

        EObject lv_var_2_0 = null;

        EObject lv_aff_3_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:113:2: ( ( ( ( (lv_instr_0_0= ruleInstruction ) ) (otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) ) )? ) | ( (lv_aff_3_0= ruleAffectation ) ) ) )
            // InternalSuricate.g:114:2: ( ( ( (lv_instr_0_0= ruleInstruction ) ) (otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) ) )? ) | ( (lv_aff_3_0= ruleAffectation ) ) )
            {
            // InternalSuricate.g:114:2: ( ( ( (lv_instr_0_0= ruleInstruction ) ) (otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) ) )? ) | ( (lv_aff_3_0= ruleAffectation ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==12) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSuricate.g:115:3: ( ( (lv_instr_0_0= ruleInstruction ) ) (otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) ) )? )
                    {
                    // InternalSuricate.g:115:3: ( ( (lv_instr_0_0= ruleInstruction ) ) (otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) ) )? )
                    // InternalSuricate.g:116:4: ( (lv_instr_0_0= ruleInstruction ) ) (otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) ) )?
                    {
                    // InternalSuricate.g:116:4: ( (lv_instr_0_0= ruleInstruction ) )
                    // InternalSuricate.g:117:5: (lv_instr_0_0= ruleInstruction )
                    {
                    // InternalSuricate.g:117:5: (lv_instr_0_0= ruleInstruction )
                    // InternalSuricate.g:118:6: lv_instr_0_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getLigneAccess().getInstrInstructionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_instr_0_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLigneRule());
                    						}
                    						set(
                    							current,
                    							"instr",
                    							lv_instr_0_0,
                    							"org.fil2018.flomira.Suricate.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSuricate.g:135:4: (otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==11) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSuricate.g:136:5: otherlv_1= '->' ( (lv_var_2_0= ruleVariable ) )
                            {
                            otherlv_1=(Token)match(input,11,FOLLOW_5); 

                            					newLeafNode(otherlv_1, grammarAccess.getLigneAccess().getHyphenMinusGreaterThanSignKeyword_0_1_0());
                            				
                            // InternalSuricate.g:140:5: ( (lv_var_2_0= ruleVariable ) )
                            // InternalSuricate.g:141:6: (lv_var_2_0= ruleVariable )
                            {
                            // InternalSuricate.g:141:6: (lv_var_2_0= ruleVariable )
                            // InternalSuricate.g:142:7: lv_var_2_0= ruleVariable
                            {

                            							newCompositeNode(grammarAccess.getLigneAccess().getVarVariableParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_var_2_0=ruleVariable();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLigneRule());
                            							}
                            							set(
                            								current,
                            								"var",
                            								lv_var_2_0,
                            								"org.fil2018.flomira.Suricate.Variable");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSuricate.g:162:3: ( (lv_aff_3_0= ruleAffectation ) )
                    {
                    // InternalSuricate.g:162:3: ( (lv_aff_3_0= ruleAffectation ) )
                    // InternalSuricate.g:163:4: (lv_aff_3_0= ruleAffectation )
                    {
                    // InternalSuricate.g:163:4: (lv_aff_3_0= ruleAffectation )
                    // InternalSuricate.g:164:5: lv_aff_3_0= ruleAffectation
                    {

                    					newCompositeNode(grammarAccess.getLigneAccess().getAffAffectationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_aff_3_0=ruleAffectation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLigneRule());
                    					}
                    					set(
                    						current,
                    						"aff",
                    						lv_aff_3_0,
                    						"org.fil2018.flomira.Suricate.Affectation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleLigne"


    // $ANTLR start "entryRuleAffectation"
    // InternalSuricate.g:185:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalSuricate.g:185:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalSuricate.g:186:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalSuricate.g:192:1: ruleAffectation returns [EObject current=null] : ( () ( (lv_valeur_1_0= ruleTypePrimaire ) ) (otherlv_2= '->' ( (lv_variable_3_0= ruleVariable ) ) )? ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_valeur_1_0 = null;

        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:198:2: ( ( () ( (lv_valeur_1_0= ruleTypePrimaire ) ) (otherlv_2= '->' ( (lv_variable_3_0= ruleVariable ) ) )? ) )
            // InternalSuricate.g:199:2: ( () ( (lv_valeur_1_0= ruleTypePrimaire ) ) (otherlv_2= '->' ( (lv_variable_3_0= ruleVariable ) ) )? )
            {
            // InternalSuricate.g:199:2: ( () ( (lv_valeur_1_0= ruleTypePrimaire ) ) (otherlv_2= '->' ( (lv_variable_3_0= ruleVariable ) ) )? )
            // InternalSuricate.g:200:3: () ( (lv_valeur_1_0= ruleTypePrimaire ) ) (otherlv_2= '->' ( (lv_variable_3_0= ruleVariable ) ) )?
            {
            // InternalSuricate.g:200:3: ()
            // InternalSuricate.g:201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAffectationAccess().getAffectationAction_0(),
            					current);
            			

            }

            // InternalSuricate.g:207:3: ( (lv_valeur_1_0= ruleTypePrimaire ) )
            // InternalSuricate.g:208:4: (lv_valeur_1_0= ruleTypePrimaire )
            {
            // InternalSuricate.g:208:4: (lv_valeur_1_0= ruleTypePrimaire )
            // InternalSuricate.g:209:5: lv_valeur_1_0= ruleTypePrimaire
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getValeurTypePrimaireParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_valeur_1_0=ruleTypePrimaire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"valeur",
            						lv_valeur_1_0,
            						"org.fil2018.flomira.Suricate.TypePrimaire");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSuricate.g:226:3: (otherlv_2= '->' ( (lv_variable_3_0= ruleVariable ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSuricate.g:227:4: otherlv_2= '->' ( (lv_variable_3_0= ruleVariable ) )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAffectationAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalSuricate.g:231:4: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalSuricate.g:232:5: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalSuricate.g:232:5: (lv_variable_3_0= ruleVariable )
                    // InternalSuricate.g:233:6: lv_variable_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAffectationRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_3_0,
                    							"org.fil2018.flomira.Suricate.Variable");
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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleInstruction"
    // InternalSuricate.g:255:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalSuricate.g:255:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalSuricate.g:256:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalSuricate.g:262:1: ruleInstruction returns [EObject current=null] : (this_AppelMethode_0= ruleAppelMethode | this_Boucle_1= ruleBoucle ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_AppelMethode_0 = null;

        EObject this_Boucle_1 = null;



        	enterRule();

        try {
            // InternalSuricate.g:268:2: ( (this_AppelMethode_0= ruleAppelMethode | this_Boucle_1= ruleBoucle ) )
            // InternalSuricate.g:269:2: (this_AppelMethode_0= ruleAppelMethode | this_Boucle_1= ruleBoucle )
            {
            // InternalSuricate.g:269:2: (this_AppelMethode_0= ruleAppelMethode | this_Boucle_1= ruleBoucle )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSuricate.g:270:3: this_AppelMethode_0= ruleAppelMethode
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAppelMethodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppelMethode_0=ruleAppelMethode();

                    state._fsp--;


                    			current = this_AppelMethode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSuricate.g:279:3: this_Boucle_1= ruleBoucle
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getBoucleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boucle_1=ruleBoucle();

                    state._fsp--;


                    			current = this_Boucle_1;
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleBoucle"
    // InternalSuricate.g:291:1: entryRuleBoucle returns [EObject current=null] : iv_ruleBoucle= ruleBoucle EOF ;
    public final EObject entryRuleBoucle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoucle = null;


        try {
            // InternalSuricate.g:291:47: (iv_ruleBoucle= ruleBoucle EOF )
            // InternalSuricate.g:292:2: iv_ruleBoucle= ruleBoucle EOF
            {
             newCompositeNode(grammarAccess.getBoucleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoucle=ruleBoucle();

            state._fsp--;

             current =iv_ruleBoucle; 
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
    // $ANTLR end "entryRuleBoucle"


    // $ANTLR start "ruleBoucle"
    // InternalSuricate.g:298:1: ruleBoucle returns [EObject current=null] : this_IfBoucle_0= ruleIfBoucle ;
    public final EObject ruleBoucle() throws RecognitionException {
        EObject current = null;

        EObject this_IfBoucle_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:304:2: (this_IfBoucle_0= ruleIfBoucle )
            // InternalSuricate.g:305:2: this_IfBoucle_0= ruleIfBoucle
            {

            		newCompositeNode(grammarAccess.getBoucleAccess().getIfBoucleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_IfBoucle_0=ruleIfBoucle();

            state._fsp--;


            		current = this_IfBoucle_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleBoucle"


    // $ANTLR start "entryRuleIfBoucle"
    // InternalSuricate.g:316:1: entryRuleIfBoucle returns [EObject current=null] : iv_ruleIfBoucle= ruleIfBoucle EOF ;
    public final EObject entryRuleIfBoucle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBoucle = null;


        try {
            // InternalSuricate.g:316:49: (iv_ruleIfBoucle= ruleIfBoucle EOF )
            // InternalSuricate.g:317:2: iv_ruleIfBoucle= ruleIfBoucle EOF
            {
             newCompositeNode(grammarAccess.getIfBoucleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfBoucle=ruleIfBoucle();

            state._fsp--;

             current =iv_ruleIfBoucle; 
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
    // $ANTLR end "entryRuleIfBoucle"


    // $ANTLR start "ruleIfBoucle"
    // InternalSuricate.g:323:1: ruleIfBoucle returns [EObject current=null] : (otherlv_0= 'If' this_AppelMethode_1= ruleAppelMethode otherlv_2= 'Then' otherlv_3= '{' ( (lv_ifBody_4_0= ruleLigne ) )+ otherlv_5= '}' ) ;
    public final EObject ruleIfBoucle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_AppelMethode_1 = null;

        EObject lv_ifBody_4_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:329:2: ( (otherlv_0= 'If' this_AppelMethode_1= ruleAppelMethode otherlv_2= 'Then' otherlv_3= '{' ( (lv_ifBody_4_0= ruleLigne ) )+ otherlv_5= '}' ) )
            // InternalSuricate.g:330:2: (otherlv_0= 'If' this_AppelMethode_1= ruleAppelMethode otherlv_2= 'Then' otherlv_3= '{' ( (lv_ifBody_4_0= ruleLigne ) )+ otherlv_5= '}' )
            {
            // InternalSuricate.g:330:2: (otherlv_0= 'If' this_AppelMethode_1= ruleAppelMethode otherlv_2= 'Then' otherlv_3= '{' ( (lv_ifBody_4_0= ruleLigne ) )+ otherlv_5= '}' )
            // InternalSuricate.g:331:3: otherlv_0= 'If' this_AppelMethode_1= ruleAppelMethode otherlv_2= 'Then' otherlv_3= '{' ( (lv_ifBody_4_0= ruleLigne ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIfBoucleAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getIfBoucleAccess().getAppelMethodeParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_AppelMethode_1=ruleAppelMethode();

            state._fsp--;


            			current = this_AppelMethode_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getIfBoucleAccess().getThenKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getIfBoucleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSuricate.g:351:3: ( (lv_ifBody_4_0= ruleLigne ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSuricate.g:352:4: (lv_ifBody_4_0= ruleLigne )
            	    {
            	    // InternalSuricate.g:352:4: (lv_ifBody_4_0= ruleLigne )
            	    // InternalSuricate.g:353:5: lv_ifBody_4_0= ruleLigne
            	    {

            	    					newCompositeNode(grammarAccess.getIfBoucleAccess().getIfBodyLigneParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ifBody_4_0=ruleLigne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfBoucleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ifBody",
            	    						lv_ifBody_4_0,
            	    						"org.fil2018.flomira.Suricate.Ligne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIfBoucleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleIfBoucle"


    // $ANTLR start "entryRuleAppelMethode"
    // InternalSuricate.g:378:1: entryRuleAppelMethode returns [EObject current=null] : iv_ruleAppelMethode= ruleAppelMethode EOF ;
    public final EObject entryRuleAppelMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppelMethode = null;


        try {
            // InternalSuricate.g:378:53: (iv_ruleAppelMethode= ruleAppelMethode EOF )
            // InternalSuricate.g:379:2: iv_ruleAppelMethode= ruleAppelMethode EOF
            {
             newCompositeNode(grammarAccess.getAppelMethodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppelMethode=ruleAppelMethode();

            state._fsp--;

             current =iv_ruleAppelMethode; 
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
    // $ANTLR end "entryRuleAppelMethode"


    // $ANTLR start "ruleAppelMethode"
    // InternalSuricate.g:385:1: ruleAppelMethode returns [EObject current=null] : (this_AppelMethSimple_0= ruleAppelMethSimple | this_AppelMethComposite_1= ruleAppelMethComposite ) ;
    public final EObject ruleAppelMethode() throws RecognitionException {
        EObject current = null;

        EObject this_AppelMethSimple_0 = null;

        EObject this_AppelMethComposite_1 = null;



        	enterRule();

        try {
            // InternalSuricate.g:391:2: ( (this_AppelMethSimple_0= ruleAppelMethSimple | this_AppelMethComposite_1= ruleAppelMethComposite ) )
            // InternalSuricate.g:392:2: (this_AppelMethSimple_0= ruleAppelMethSimple | this_AppelMethComposite_1= ruleAppelMethComposite )
            {
            // InternalSuricate.g:392:2: (this_AppelMethSimple_0= ruleAppelMethSimple | this_AppelMethComposite_1= ruleAppelMethComposite )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==16) ) {
                    alt7=2;
                }
                else if ( (LA7_1==17) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSuricate.g:393:3: this_AppelMethSimple_0= ruleAppelMethSimple
                    {

                    			newCompositeNode(grammarAccess.getAppelMethodeAccess().getAppelMethSimpleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppelMethSimple_0=ruleAppelMethSimple();

                    state._fsp--;


                    			current = this_AppelMethSimple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSuricate.g:402:3: this_AppelMethComposite_1= ruleAppelMethComposite
                    {

                    			newCompositeNode(grammarAccess.getAppelMethodeAccess().getAppelMethCompositeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppelMethComposite_1=ruleAppelMethComposite();

                    state._fsp--;


                    			current = this_AppelMethComposite_1;
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
    // $ANTLR end "ruleAppelMethode"


    // $ANTLR start "entryRuleAppelMethComposite"
    // InternalSuricate.g:414:1: entryRuleAppelMethComposite returns [EObject current=null] : iv_ruleAppelMethComposite= ruleAppelMethComposite EOF ;
    public final EObject entryRuleAppelMethComposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppelMethComposite = null;


        try {
            // InternalSuricate.g:414:59: (iv_ruleAppelMethComposite= ruleAppelMethComposite EOF )
            // InternalSuricate.g:415:2: iv_ruleAppelMethComposite= ruleAppelMethComposite EOF
            {
             newCompositeNode(grammarAccess.getAppelMethCompositeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppelMethComposite=ruleAppelMethComposite();

            state._fsp--;

             current =iv_ruleAppelMethComposite; 
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
    // $ANTLR end "entryRuleAppelMethComposite"


    // $ANTLR start "ruleAppelMethComposite"
    // InternalSuricate.g:421:1: ruleAppelMethComposite returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_methode_2_0= ruleAppelMethSimple ) ) )+ ) ;
    public final EObject ruleAppelMethComposite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_methode_2_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:427:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_methode_2_0= ruleAppelMethSimple ) ) )+ ) )
            // InternalSuricate.g:428:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_methode_2_0= ruleAppelMethSimple ) ) )+ )
            {
            // InternalSuricate.g:428:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_methode_2_0= ruleAppelMethSimple ) ) )+ )
            // InternalSuricate.g:429:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_methode_2_0= ruleAppelMethSimple ) ) )+
            {
            // InternalSuricate.g:429:3: ( (otherlv_0= RULE_ID ) )
            // InternalSuricate.g:430:4: (otherlv_0= RULE_ID )
            {
            // InternalSuricate.g:430:4: (otherlv_0= RULE_ID )
            // InternalSuricate.g:431:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppelMethCompositeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getAppelMethCompositeAccess().getNameVariableCrossReference_0_0());
            				

            }


            }

            // InternalSuricate.g:442:3: (otherlv_1= '.' ( (lv_methode_2_0= ruleAppelMethSimple ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSuricate.g:443:4: otherlv_1= '.' ( (lv_methode_2_0= ruleAppelMethSimple ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAppelMethCompositeAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalSuricate.g:447:4: ( (lv_methode_2_0= ruleAppelMethSimple ) )
            	    // InternalSuricate.g:448:5: (lv_methode_2_0= ruleAppelMethSimple )
            	    {
            	    // InternalSuricate.g:448:5: (lv_methode_2_0= ruleAppelMethSimple )
            	    // InternalSuricate.g:449:6: lv_methode_2_0= ruleAppelMethSimple
            	    {

            	    						newCompositeNode(grammarAccess.getAppelMethCompositeAccess().getMethodeAppelMethSimpleParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_methode_2_0=ruleAppelMethSimple();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppelMethCompositeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"methode",
            	    							lv_methode_2_0,
            	    							"org.fil2018.flomira.Suricate.AppelMethSimple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


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
    // $ANTLR end "ruleAppelMethComposite"


    // $ANTLR start "entryRuleTypePrimaire"
    // InternalSuricate.g:471:1: entryRuleTypePrimaire returns [String current=null] : iv_ruleTypePrimaire= ruleTypePrimaire EOF ;
    public final String entryRuleTypePrimaire() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypePrimaire = null;


        try {
            // InternalSuricate.g:471:52: (iv_ruleTypePrimaire= ruleTypePrimaire EOF )
            // InternalSuricate.g:472:2: iv_ruleTypePrimaire= ruleTypePrimaire EOF
            {
             newCompositeNode(grammarAccess.getTypePrimaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypePrimaire=ruleTypePrimaire();

            state._fsp--;

             current =iv_ruleTypePrimaire.getText(); 
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
    // $ANTLR end "entryRuleTypePrimaire"


    // $ANTLR start "ruleTypePrimaire"
    // InternalSuricate.g:478:1: ruleTypePrimaire returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final AntlrDatatypeRuleToken ruleTypePrimaire() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntLiteral_0 = null;

        AntlrDatatypeRuleToken this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalSuricate.g:484:2: ( (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalSuricate.g:485:2: (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalSuricate.g:485:2: (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSuricate.g:486:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getTypePrimaireAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current.merge(this_IntLiteral_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSuricate.g:497:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getTypePrimaireAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current.merge(this_StringLiteral_1);
                    		

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
    // $ANTLR end "ruleTypePrimaire"


    // $ANTLR start "entryRuleVariable"
    // InternalSuricate.g:511:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSuricate.g:511:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSuricate.g:512:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSuricate.g:518:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSuricate.g:524:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSuricate.g:525:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSuricate.g:525:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSuricate.g:526:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSuricate.g:526:3: (lv_name_0_0= RULE_ID )
            // InternalSuricate.g:527:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalSuricate.g:546:1: entryRuleIntLiteral returns [String current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final String entryRuleIntLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntLiteral = null;


        try {
            // InternalSuricate.g:546:50: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalSuricate.g:547:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral.getText(); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalSuricate.g:553:1: ruleIntLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSuricate.g:559:2: (this_INT_0= RULE_INT )
            // InternalSuricate.g:560:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntLiteralAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalSuricate.g:570:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalSuricate.g:570:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalSuricate.g:571:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral.getText(); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalSuricate.g:577:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSuricate.g:583:2: (this_STRING_0= RULE_STRING )
            // InternalSuricate.g:584:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleAppelMethSimple"
    // InternalSuricate.g:594:1: entryRuleAppelMethSimple returns [EObject current=null] : iv_ruleAppelMethSimple= ruleAppelMethSimple EOF ;
    public final EObject entryRuleAppelMethSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppelMethSimple = null;


        try {
            // InternalSuricate.g:594:56: (iv_ruleAppelMethSimple= ruleAppelMethSimple EOF )
            // InternalSuricate.g:595:2: iv_ruleAppelMethSimple= ruleAppelMethSimple EOF
            {
             newCompositeNode(grammarAccess.getAppelMethSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppelMethSimple=ruleAppelMethSimple();

            state._fsp--;

             current =iv_ruleAppelMethSimple; 
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
    // $ANTLR end "entryRuleAppelMethSimple"


    // $ANTLR start "ruleAppelMethSimple"
    // InternalSuricate.g:601:1: ruleAppelMethSimple returns [EObject current=null] : ( () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAppelMethSimple() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:607:2: ( ( () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )? otherlv_6= ')' ) )
            // InternalSuricate.g:608:2: ( () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )? otherlv_6= ')' )
            {
            // InternalSuricate.g:608:2: ( () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )? otherlv_6= ')' )
            // InternalSuricate.g:609:3: () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )? otherlv_6= ')'
            {
            // InternalSuricate.g:609:3: ()
            // InternalSuricate.g:610:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAppelMethSimpleAccess().getMethodeAction_0(),
            					current);
            			

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(this_ID_1, grammarAccess.getAppelMethSimpleAccess().getIDTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAppelMethSimpleAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSuricate.g:624:3: ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSuricate.g:625:4: ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )*
                    {
                    // InternalSuricate.g:625:4: ( (lv_params_3_0= ruleParametre ) )
                    // InternalSuricate.g:626:5: (lv_params_3_0= ruleParametre )
                    {
                    // InternalSuricate.g:626:5: (lv_params_3_0= ruleParametre )
                    // InternalSuricate.g:627:6: lv_params_3_0= ruleParametre
                    {

                    						newCompositeNode(grammarAccess.getAppelMethSimpleAccess().getParamsParametreParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_params_3_0=ruleParametre();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppelMethSimpleRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"org.fil2018.flomira.Suricate.Parametre");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSuricate.g:644:4: (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSuricate.g:645:5: otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_14); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAppelMethSimpleAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSuricate.g:649:5: ( (lv_params_5_0= ruleParametre ) )
                    	    // InternalSuricate.g:650:6: (lv_params_5_0= ruleParametre )
                    	    {
                    	    // InternalSuricate.g:650:6: (lv_params_5_0= ruleParametre )
                    	    // InternalSuricate.g:651:7: lv_params_5_0= ruleParametre
                    	    {

                    	    							newCompositeNode(grammarAccess.getAppelMethSimpleAccess().getParamsParametreParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_params_5_0=ruleParametre();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAppelMethSimpleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"org.fil2018.flomira.Suricate.Parametre");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAppelMethSimpleAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleAppelMethSimple"


    // $ANTLR start "entryRuleParametre"
    // InternalSuricate.g:678:1: entryRuleParametre returns [EObject current=null] : iv_ruleParametre= ruleParametre EOF ;
    public final EObject entryRuleParametre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametre = null;


        try {
            // InternalSuricate.g:678:50: (iv_ruleParametre= ruleParametre EOF )
            // InternalSuricate.g:679:2: iv_ruleParametre= ruleParametre EOF
            {
             newCompositeNode(grammarAccess.getParametreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametre=ruleParametre();

            state._fsp--;

             current =iv_ruleParametre; 
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
    // $ANTLR end "entryRuleParametre"


    // $ANTLR start "ruleParametre"
    // InternalSuricate.g:685:1: ruleParametre returns [EObject current=null] : (this_Instruction_0= ruleInstruction | this_Variable_1= ruleVariable | ruleTypePrimaire ) ;
    public final EObject ruleParametre() throws RecognitionException {
        EObject current = null;

        EObject this_Instruction_0 = null;

        EObject this_Variable_1 = null;



        	enterRule();

        try {
            // InternalSuricate.g:691:2: ( (this_Instruction_0= ruleInstruction | this_Variable_1= ruleVariable | ruleTypePrimaire ) )
            // InternalSuricate.g:692:2: (this_Instruction_0= ruleInstruction | this_Variable_1= ruleVariable | ruleTypePrimaire )
            {
            // InternalSuricate.g:692:2: (this_Instruction_0= ruleInstruction | this_Variable_1= ruleVariable | ruleTypePrimaire )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=18 && LA12_1<=19)) ) {
                    alt12=2;
                }
                else if ( ((LA12_1>=16 && LA12_1<=17)) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSuricate.g:693:3: this_Instruction_0= ruleInstruction
                    {

                    			newCompositeNode(grammarAccess.getParametreAccess().getInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instruction_0=ruleInstruction();

                    state._fsp--;


                    			current = this_Instruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSuricate.g:702:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getParametreAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSuricate.g:711:3: ruleTypePrimaire
                    {

                    			newCompositeNode(grammarAccess.getParametreAccess().getTypePrimaireParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    ruleTypePrimaire();

                    state._fsp--;


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
    // $ANTLR end "ruleParametre"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000081070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001070L});

}