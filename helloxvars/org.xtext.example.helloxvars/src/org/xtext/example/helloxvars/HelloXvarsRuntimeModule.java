/*
 * generated by Xtext
 */
package org.xtext.example.helloxvars;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.xtext.example.helloxvars.generator.HelloXvarsGenerator;
import org.xtext.example.helloxvars.scoping.HelloXvarsScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class HelloXvarsRuntimeModule extends
		org.xtext.example.helloxvars.AbstractHelloXvarsRuntimeModule {

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return HelloXvarsScopeProvider.class;
	}

	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return HelloXvarsGenerator.class;
	}

}
