package org.xtext.example.helloxvars.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable
import org.xtext.example.helloxvars.helloXvars.Greeting
import org.xtext.example.helloxvars.helloXvars.Model

class HelloXvarsGenerator implements IGenerator {
	
	@Inject
	protected XbaseCompiler xbaseCompiler

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(greeting: resource.allContents.toIterable.filter(typeof(Greeting))) {
			fsa.generateFile(
				greeting.packageName + "/" + // package
				greeting.className + ".java", // class name
				greeting.compile)
		}
	}

	def getJvmType(Greeting greeting) {
		val declaredType = TypesFactory::eINSTANCE.createJvmGenericType
		declaredType.setSimpleName(greeting.className)
		declaredType.setPackageName(greeting.packageName)
		declaredType
	}

	def compile(Greeting greeting) '''
	«val importManager = new ImportManager(true, getJvmType(greeting))»
	«val mainMethod = compile(greeting, importManager)»
	package «greeting.packageName»;
	«IF !importManager.imports.empty»

	«FOR i : importManager.imports»
		import «i»;
	«ENDFOR»
	«ENDIF»

	«mainMethod»
	'''

	def compile(Greeting greeting, ImportManager importManager) {
		var result = new FakeTreeAppendable(importManager)
		for (varDecl : (greeting.eContainer as Model).varDeclarations) {
			result.append("\n// variable declaration")
			result = compile(varDecl, result)
		}
		result.append("\n// greeting expression")
		result = compile(greeting.expression, result)
		var expressionVar = result.getName(greeting.expression)
		if (greeting.expression instanceof XFeatureCall)
			expressionVar = result.getName((greeting.expression as XFeatureCall).feature)
		val compiled = '''
		public class «greeting.className» {
			public static void main(String args[]) {
				«result»

				Object expression = «expressionVar»;
				System.out.println("Hello «greeting.name» from " +
					expression.toString());
			}
		}
		'''
		compiled
	}
    
	def compile(XExpression xExpression, FakeTreeAppendable result) {
		xbaseCompiler.toJavaStatement(xExpression, result, true)
		result
	}

	def className(Greeting greeting) {
		greeting.name.toFirstUpper
	}

	def packageName(Greeting greeting) {
		greeting.name.toLowerCase
	}
}
