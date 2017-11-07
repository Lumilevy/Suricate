/*
 * generated by Xtext 2.10.0
 */
package org.fil2018.flomira.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.fil2018.flomira.parser.antlr.internal.InternalSuricateParser;
import org.fil2018.flomira.services.SuricateGrammarAccess;

public class SuricateParser extends AbstractAntlrParser {

	@Inject
	private SuricateGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSuricateParser createParser(XtextTokenStream stream) {
		return new InternalSuricateParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Programme";
	}

	public SuricateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SuricateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
