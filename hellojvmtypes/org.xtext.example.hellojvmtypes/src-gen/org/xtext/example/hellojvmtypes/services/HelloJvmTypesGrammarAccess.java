/*
* generated by Xtext
*/

package org.xtext.example.hellojvmtypes.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class HelloJvmTypesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cGreetingsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cGreetingsGreetingParserRuleCall_0 = (RuleCall)cGreetingsAssignment.eContents().get(0);
		
		//Model:
		//	greetings+=Greeting*;
		public ParserRule getRule() { return rule; }

		//greetings+=Greeting*
		public Assignment getGreetingsAssignment() { return cGreetingsAssignment; }

		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_0() { return cGreetingsGreetingParserRuleCall_0; }
	}

	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Greeting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHelloKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cJavaTypesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cJavaTypesJvmTypeCrossReference_3_0 = (CrossReference)cJavaTypesAssignment_3.eContents().get(0);
		private final RuleCall cJavaTypesJvmTypeQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cJavaTypesJvmTypeCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cJavaTypesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cJavaTypesJvmTypeCrossReference_4_1_0 = (CrossReference)cJavaTypesAssignment_4_1.eContents().get(0);
		private final RuleCall cJavaTypesJvmTypeQualifiedNameParserRuleCall_4_1_0_1 = (RuleCall)cJavaTypesJvmTypeCrossReference_4_1_0.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Greeting:
		//	"Hello" name=ID "from" javaTypes+=[jvmTypes::JvmType|QualifiedName] (","
		//	javaTypes+=[jvmTypes::JvmType|QualifiedName])* "!";
		public ParserRule getRule() { return rule; }

		//"Hello" name=ID "from" javaTypes+=[jvmTypes::JvmType|QualifiedName] ("," javaTypes+=[jvmTypes::JvmType|QualifiedName])*
		//"!"
		public Group getGroup() { return cGroup; }

		//"Hello"
		public Keyword getHelloKeyword_0() { return cHelloKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"from"
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }

		//javaTypes+=[jvmTypes::JvmType|QualifiedName]
		public Assignment getJavaTypesAssignment_3() { return cJavaTypesAssignment_3; }

		//[jvmTypes::JvmType|QualifiedName]
		public CrossReference getJavaTypesJvmTypeCrossReference_3_0() { return cJavaTypesJvmTypeCrossReference_3_0; }

		//QualifiedName
		public RuleCall getJavaTypesJvmTypeQualifiedNameParserRuleCall_3_0_1() { return cJavaTypesJvmTypeQualifiedNameParserRuleCall_3_0_1; }

		//("," javaTypes+=[jvmTypes::JvmType|QualifiedName])*
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//javaTypes+=[jvmTypes::JvmType|QualifiedName]
		public Assignment getJavaTypesAssignment_4_1() { return cJavaTypesAssignment_4_1; }

		//[jvmTypes::JvmType|QualifiedName]
		public CrossReference getJavaTypesJvmTypeCrossReference_4_1_0() { return cJavaTypesJvmTypeCrossReference_4_1_0; }

		//QualifiedName
		public RuleCall getJavaTypesJvmTypeQualifiedNameParserRuleCall_4_1_0_1() { return cJavaTypesJvmTypeQualifiedNameParserRuleCall_4_1_0_1; }

		//"!"
		public Keyword getExclamationMarkKeyword_5() { return cExclamationMarkKeyword_5; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private ModelElements pModel;
	private GreetingElements pGreeting;
	private QualifiedNameElements pQualifiedName;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public HelloJvmTypesGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	greetings+=Greeting*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Greeting:
	//	"Hello" name=ID "from" javaTypes+=[jvmTypes::JvmType|QualifiedName] (","
	//	javaTypes+=[jvmTypes::JvmType|QualifiedName])* "!";
	public GreetingElements getGreetingAccess() {
		return (pGreeting != null) ? pGreeting : (pGreeting = new GreetingElements());
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
