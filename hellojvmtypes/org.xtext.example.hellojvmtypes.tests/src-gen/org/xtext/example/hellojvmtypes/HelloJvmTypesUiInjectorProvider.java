/*
* generated by Xtext
*/
package org.xtext.example.hellojvmtypes;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class HelloJvmTypesUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.hellojvmtypes.ui.internal.HelloJvmTypesActivator.getInstance().getInjector("org.xtext.example.hellojvmtypes.HelloJvmTypes");
	}
	
}
