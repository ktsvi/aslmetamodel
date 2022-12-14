/*
 * generated by Xtext 2.25.0
 */
package com.ktsv.asl.ui;

import com.google.inject.Injector;
import com.ktsv.asl.ui.internal.AslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(AslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		AslActivator activator = AslActivator.getInstance();
		return activator != null ? activator.getInjector(AslActivator.COM_KTSV_ASL_ASL) : null;
	}

}
