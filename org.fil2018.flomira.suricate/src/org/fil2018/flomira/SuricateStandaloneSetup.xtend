/*
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SuricateStandaloneSetup extends SuricateStandaloneSetupGenerated {

	def static void doSetup() {
		new SuricateStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
