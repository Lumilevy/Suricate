/*
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.fil2018.flomira.suricate.ui.internal.SuricateActivator;

public class SuricateUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SuricateActivator.getInstance().getInjector("org.fil2018.flomira.Suricate");
	}

}
