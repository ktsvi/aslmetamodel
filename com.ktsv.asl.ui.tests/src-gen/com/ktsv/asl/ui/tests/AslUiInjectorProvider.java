/*
 * generated by Xtext 2.25.0
 */
package com.ktsv.asl.ui.tests;

import com.google.inject.Injector;
import com.ktsv.asl.ui.internal.AslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AslActivator.getInstance().getInjector("com.ktsv.asl.Asl");
	}

}