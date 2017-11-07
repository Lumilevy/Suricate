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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'->'", "'('", "')'", "'.'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
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
    // InternalSuricate.g:107:1: ruleLigne returns [EObject current=null] : (this_Affectation_0= ruleAffectation | this_Operation_1= ruleOperation ) ;
    public final EObject ruleLigne() throws RecognitionException {
        EObject current = null;

        EObject this_Affectation_0 = null;

        EObject this_Operation_1 = null;



        	enterRule();

        try {
            // InternalSuricate.g:113:2: ( (this_Affectation_0= ruleAffectation | this_Operation_1= ruleOperation ) )
            // InternalSuricate.g:114:2: (this_Affectation_0= ruleAffectation | this_Operation_1= ruleOperation )
            {
            // InternalSuricate.g:114:2: (this_Affectation_0= ruleAffectation | this_Operation_1= ruleOperation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSuricate.g:115:3: this_Affectation_0= ruleAffectation
                    {

                    			newCompositeNode(grammarAccess.getLigneAccess().getAffectationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Affectation_0=ruleAffectation();

                    state._fsp--;


                    			current = this_Affectation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSuricate.g:124:3: this_Operation_1= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getLigneAccess().getOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_1=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_1;
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
    // $ANTLR end "ruleLigne"


    // $ANTLR start "entryRuleAffectation"
    // InternalSuricate.g:136:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalSuricate.g:136:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalSuricate.g:137:2: iv_ruleAffectation= ruleAffectation EOF
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
    // InternalSuricate.g:143:1: ruleAffectation returns [EObject current=null] : (otherlv_0= ':' ( (lv_obj_1_0= ruleObjet ) ) otherlv_2= '->' ( (lv_var_3_0= ruleVariable ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_obj_1_0 = null;

        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:149:2: ( (otherlv_0= ':' ( (lv_obj_1_0= ruleObjet ) ) otherlv_2= '->' ( (lv_var_3_0= ruleVariable ) ) ) )
            // InternalSuricate.g:150:2: (otherlv_0= ':' ( (lv_obj_1_0= ruleObjet ) ) otherlv_2= '->' ( (lv_var_3_0= ruleVariable ) ) )
            {
            // InternalSuricate.g:150:2: (otherlv_0= ':' ( (lv_obj_1_0= ruleObjet ) ) otherlv_2= '->' ( (lv_var_3_0= ruleVariable ) ) )
            // InternalSuricate.g:151:3: otherlv_0= ':' ( (lv_obj_1_0= ruleObjet ) ) otherlv_2= '->' ( (lv_var_3_0= ruleVariable ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAffectationAccess().getColonKeyword_0());
            		
            // InternalSuricate.g:155:3: ( (lv_obj_1_0= ruleObjet ) )
            // InternalSuricate.g:156:4: (lv_obj_1_0= ruleObjet )
            {
            // InternalSuricate.g:156:4: (lv_obj_1_0= ruleObjet )
            // InternalSuricate.g:157:5: lv_obj_1_0= ruleObjet
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getObjObjetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_obj_1_0=ruleObjet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_1_0,
            						"org.fil2018.flomira.Suricate.Objet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAffectationAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSuricate.g:178:3: ( (lv_var_3_0= ruleVariable ) )
            // InternalSuricate.g:179:4: (lv_var_3_0= ruleVariable )
            {
            // InternalSuricate.g:179:4: (lv_var_3_0= ruleVariable )
            // InternalSuricate.g:180:5: lv_var_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getVarVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_3_0,
            						"org.fil2018.flomira.Suricate.Variable");
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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleVariable"
    // InternalSuricate.g:201:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSuricate.g:201:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSuricate.g:202:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSuricate.g:208:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSuricate.g:214:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSuricate.g:215:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSuricate.g:215:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSuricate.g:216:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSuricate.g:216:3: (lv_name_0_0= RULE_ID )
            // InternalSuricate.g:217:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleObjet"
    // InternalSuricate.g:236:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalSuricate.g:236:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalSuricate.g:237:2: iv_ruleObjet= ruleObjet EOF
            {
             newCompositeNode(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjet=ruleObjet();

            state._fsp--;

             current =iv_ruleObjet; 
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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalSuricate.g:243:1: ruleObjet returns [EObject current=null] : (this_Constructeur_0= ruleConstructeur | this_StringLiteral_1= ruleStringLiteral | this_IntLiteral_2= ruleIntLiteral | this_Operation_3= ruleOperation ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        EObject this_Constructeur_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_IntLiteral_2 = null;

        EObject this_Operation_3 = null;



        	enterRule();

        try {
            // InternalSuricate.g:249:2: ( (this_Constructeur_0= ruleConstructeur | this_StringLiteral_1= ruleStringLiteral | this_IntLiteral_2= ruleIntLiteral | this_Operation_3= ruleOperation ) )
            // InternalSuricate.g:250:2: (this_Constructeur_0= ruleConstructeur | this_StringLiteral_1= ruleStringLiteral | this_IntLiteral_2= ruleIntLiteral | this_Operation_3= ruleOperation )
            {
            // InternalSuricate.g:250:2: (this_Constructeur_0= ruleConstructeur | this_StringLiteral_1= ruleStringLiteral | this_IntLiteral_2= ruleIntLiteral | this_Operation_3= ruleOperation )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==13) ) {
                    alt3=1;
                }
                else if ( (LA3_1==15) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSuricate.g:251:3: this_Constructeur_0= ruleConstructeur
                    {

                    			newCompositeNode(grammarAccess.getObjetAccess().getConstructeurParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constructeur_0=ruleConstructeur();

                    state._fsp--;


                    			current = this_Constructeur_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSuricate.g:260:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getObjetAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSuricate.g:269:3: this_IntLiteral_2= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getObjetAccess().getIntLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_2=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSuricate.g:278:3: this_Operation_3= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getObjetAccess().getOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_3=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_3;
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
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalSuricate.g:290:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalSuricate.g:290:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalSuricate.g:291:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // InternalSuricate.g:297:1: ruleIntLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSuricate.g:303:2: ( ( (lv_name_0_0= RULE_INT ) ) )
            // InternalSuricate.g:304:2: ( (lv_name_0_0= RULE_INT ) )
            {
            // InternalSuricate.g:304:2: ( (lv_name_0_0= RULE_INT ) )
            // InternalSuricate.g:305:3: (lv_name_0_0= RULE_INT )
            {
            // InternalSuricate.g:305:3: (lv_name_0_0= RULE_INT )
            // InternalSuricate.g:306:4: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getIntLiteralAccess().getNameINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalSuricate.g:325:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalSuricate.g:325:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalSuricate.g:326:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // InternalSuricate.g:332:1: ruleStringLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSuricate.g:338:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalSuricate.g:339:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalSuricate.g:339:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalSuricate.g:340:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalSuricate.g:340:3: (lv_name_0_0= RULE_STRING )
            // InternalSuricate.g:341:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStringLiteralAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleConstructeur"
    // InternalSuricate.g:360:1: entryRuleConstructeur returns [EObject current=null] : iv_ruleConstructeur= ruleConstructeur EOF ;
    public final EObject entryRuleConstructeur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructeur = null;


        try {
            // InternalSuricate.g:360:53: (iv_ruleConstructeur= ruleConstructeur EOF )
            // InternalSuricate.g:361:2: iv_ruleConstructeur= ruleConstructeur EOF
            {
             newCompositeNode(grammarAccess.getConstructeurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructeur=ruleConstructeur();

            state._fsp--;

             current =iv_ruleConstructeur; 
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
    // $ANTLR end "entryRuleConstructeur"


    // $ANTLR start "ruleConstructeur"
    // InternalSuricate.g:367:1: ruleConstructeur returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleConstructeur() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSuricate.g:373:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalSuricate.g:374:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalSuricate.g:374:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalSuricate.g:375:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalSuricate.g:375:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSuricate.g:376:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSuricate.g:376:4: (lv_name_0_0= RULE_ID )
            // InternalSuricate.g:377:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstructeurAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructeurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructeurAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConstructeurAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleConstructeur"


    // $ANTLR start "entryRuleOperation"
    // InternalSuricate.g:405:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSuricate.g:405:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSuricate.g:406:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSuricate.g:412:1: ruleOperation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_methode_2_0= ruleMethode ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_methode_2_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:418:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_methode_2_0= ruleMethode ) ) ) )
            // InternalSuricate.g:419:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_methode_2_0= ruleMethode ) ) )
            {
            // InternalSuricate.g:419:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_methode_2_0= ruleMethode ) ) )
            // InternalSuricate.g:420:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_methode_2_0= ruleMethode ) )
            {
            // InternalSuricate.g:420:3: ( (otherlv_0= RULE_ID ) )
            // InternalSuricate.g:421:4: (otherlv_0= RULE_ID )
            {
            // InternalSuricate.g:421:4: (otherlv_0= RULE_ID )
            // InternalSuricate.g:422:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getNameVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getFullStopKeyword_1());
            		
            // InternalSuricate.g:437:3: ( (lv_methode_2_0= ruleMethode ) )
            // InternalSuricate.g:438:4: (lv_methode_2_0= ruleMethode )
            {
            // InternalSuricate.g:438:4: (lv_methode_2_0= ruleMethode )
            // InternalSuricate.g:439:5: lv_methode_2_0= ruleMethode
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getMethodeMethodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_methode_2_0=ruleMethode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"methode",
            						lv_methode_2_0,
            						"org.fil2018.flomira.Suricate.Methode");
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleMethode"
    // InternalSuricate.g:460:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // InternalSuricate.g:460:48: (iv_ruleMethode= ruleMethode EOF )
            // InternalSuricate.g:461:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
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
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalSuricate.g:467:1: ruleMethode returns [EObject current=null] : ( () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )* otherlv_6= ')' ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalSuricate.g:473:2: ( ( () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )* otherlv_6= ')' ) )
            // InternalSuricate.g:474:2: ( () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )* otherlv_6= ')' )
            {
            // InternalSuricate.g:474:2: ( () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )* otherlv_6= ')' )
            // InternalSuricate.g:475:3: () this_ID_1= RULE_ID otherlv_2= '(' ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )* otherlv_6= ')'
            {
            // InternalSuricate.g:475:3: ()
            // InternalSuricate.g:476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodeAccess().getMethodeAction_0(),
            					current);
            			

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            			newLeafNode(this_ID_1, grammarAccess.getMethodeAccess().getIDTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSuricate.g:490:3: ( ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSuricate.g:491:4: ( (lv_params_3_0= ruleParametre ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )*
            	    {
            	    // InternalSuricate.g:491:4: ( (lv_params_3_0= ruleParametre ) )
            	    // InternalSuricate.g:492:5: (lv_params_3_0= ruleParametre )
            	    {
            	    // InternalSuricate.g:492:5: (lv_params_3_0= ruleParametre )
            	    // InternalSuricate.g:493:6: lv_params_3_0= ruleParametre
            	    {

            	    						newCompositeNode(grammarAccess.getMethodeAccess().getParamsParametreParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_params_3_0=ruleParametre();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_3_0,
            	    							"org.fil2018.flomira.Suricate.Parametre");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSuricate.g:510:4: (otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==16) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalSuricate.g:511:5: otherlv_4= ',' ( (lv_params_5_0= ruleParametre ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getCommaKeyword_3_1_0());
            	    	    				
            	    	    // InternalSuricate.g:515:5: ( (lv_params_5_0= ruleParametre ) )
            	    	    // InternalSuricate.g:516:6: (lv_params_5_0= ruleParametre )
            	    	    {
            	    	    // InternalSuricate.g:516:6: (lv_params_5_0= ruleParametre )
            	    	    // InternalSuricate.g:517:7: lv_params_5_0= ruleParametre
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMethodeAccess().getParamsParametreParserRuleCall_3_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_params_5_0=ruleParametre();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMethodeRule());
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
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleParametre"
    // InternalSuricate.g:544:1: entryRuleParametre returns [EObject current=null] : iv_ruleParametre= ruleParametre EOF ;
    public final EObject entryRuleParametre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametre = null;


        try {
            // InternalSuricate.g:544:50: (iv_ruleParametre= ruleParametre EOF )
            // InternalSuricate.g:545:2: iv_ruleParametre= ruleParametre EOF
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
    // InternalSuricate.g:551:1: ruleParametre returns [EObject current=null] : (this_Objet_0= ruleObjet | this_Variable_1= ruleVariable ) ;
    public final EObject ruleParametre() throws RecognitionException {
        EObject current = null;

        EObject this_Objet_0 = null;

        EObject this_Variable_1 = null;



        	enterRule();

        try {
            // InternalSuricate.g:557:2: ( (this_Objet_0= ruleObjet | this_Variable_1= ruleVariable ) )
            // InternalSuricate.g:558:2: (this_Objet_0= ruleObjet | this_Variable_1= ruleVariable )
            {
            // InternalSuricate.g:558:2: (this_Objet_0= ruleObjet | this_Variable_1= ruleVariable )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_ID && LA6_1<=RULE_STRING)||LA6_1==14||LA6_1==16) ) {
                    alt6=2;
                }
                else if ( (LA6_1==13||LA6_1==15) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)) ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSuricate.g:559:3: this_Objet_0= ruleObjet
                    {

                    			newCompositeNode(grammarAccess.getParametreAccess().getObjetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Objet_0=ruleObjet();

                    state._fsp--;


                    			current = this_Objet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSuricate.g:568:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getParametreAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004870L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000014870L});

}