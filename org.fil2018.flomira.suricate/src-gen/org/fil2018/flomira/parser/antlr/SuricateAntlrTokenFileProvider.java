/*
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SuricateAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/fil2018/flomira/parser/antlr/internal/InternalSuricate.tokens");
	}
}