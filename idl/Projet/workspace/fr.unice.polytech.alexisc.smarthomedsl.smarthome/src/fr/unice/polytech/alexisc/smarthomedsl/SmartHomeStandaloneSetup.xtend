/*
 * generated by Xtext 2.12.0
 */
package fr.unice.polytech.alexisc.smarthomedsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SmartHomeStandaloneSetup extends SmartHomeStandaloneSetupGenerated {

	def static void doSetup() {
		new SmartHomeStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}