/*
 * generated by Xtext 2.25.0
 */
package com.ktsv.asl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AslStandaloneSetup extends AslStandaloneSetupGenerated {

	public static void doSetup() {
		new AslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
