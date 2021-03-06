/*
 * generated by Xtext
 */
package org.xtext.example.helloxvars.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.helloxvars.ui.internal.HelloXvarsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HelloXvarsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return HelloXvarsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return HelloXvarsActivator.getInstance().getInjector(HelloXvarsActivator.ORG_XTEXT_EXAMPLE_HELLOXVARS_HELLOXVARS);
	}
	
}
