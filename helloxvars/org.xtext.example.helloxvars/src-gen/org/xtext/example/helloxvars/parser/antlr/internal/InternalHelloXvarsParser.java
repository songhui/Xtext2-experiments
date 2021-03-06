package org.xtext.example.helloxvars.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.helloxvars.services.HelloXvarsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHelloXvarsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Hello'", "'from'", "'!'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'extension'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalHelloXvarsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloXvarsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloXvarsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g"; }



     	private HelloXvarsGrammarAccess grammarAccess;
     	
        public InternalHelloXvarsParser(TokenStream input, HelloXvarsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HelloXvarsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_varDeclarations_1_0 = null;

        EObject lv_greetings_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:98:3: ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=62 && LA2_0<=63)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:99:1: (lv_varDeclarations_1_0= ruleXVariableDeclaration )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:99:1: (lv_varDeclarations_1_0= ruleXVariableDeclaration )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:100:3: lv_varDeclarations_1_0= ruleXVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getVarDeclarationsXVariableDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleModel153);
            	    lv_varDeclarations_1_0=ruleXVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"varDeclarations",
            	              		lv_varDeclarations_1_0, 
            	              		"XVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:116:3: ( (lv_greetings_2_0= ruleGreeting ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:117:1: (lv_greetings_2_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:117:1: (lv_greetings_2_0= ruleGreeting )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:118:3: lv_greetings_2_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel175);
            	    lv_greetings_2_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"greetings",
            	              		lv_greetings_2_0, 
            	              		"Greeting");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:142:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:143:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:144:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport212);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport222); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:151:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:154:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:155:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:155:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:155:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:159:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:160:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:160:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:161:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport280);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:185:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:186:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:187:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting316);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting326); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:194:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:197:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:198:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:198:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:198:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleGreeting363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:202:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:203:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:203:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:204:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGreetingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGreeting397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:224:1: ( (lv_expression_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:225:1: (lv_expression_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:225:1: (lv_expression_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:226:3: lv_expression_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreetingAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleGreeting418);
            lv_expression_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreetingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleGreeting430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:254:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:255:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:256:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression466);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression476); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:263:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:266:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:268:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression522);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:284:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:285:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:286:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment556);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment566); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:293:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:296:28: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:297:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:297:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=RULE_ID && LA5_1<=RULE_DECIMAL)||(LA5_1>=13 && LA5_1<=14)||LA5_1==16||(LA5_1>=18 && LA5_1<=47)||(LA5_1>=49 && LA5_1<=78)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==17) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||(LA5_2>=RULE_ID && LA5_2<=RULE_DECIMAL)||(LA5_2>=13 && LA5_2<=14)||LA5_2==16||(LA5_2>=18 && LA5_2<=47)||(LA5_2>=49 && LA5_2<=67)||(LA5_2>=69 && LA5_2<=78)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==17) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==EOF||(LA5_3>=RULE_ID && LA5_3<=RULE_DECIMAL)||(LA5_3>=13 && LA5_3<=14)||LA5_3==16||(LA5_3>=18 && LA5_3<=47)||(LA5_3>=49 && LA5_3<=67)||(LA5_3>=69 && LA5_3<=78)) ) {
                    alt5=2;
                }
                else if ( (LA5_3==17) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==17) ) {
                    alt5=1;
                }
                else if ( (LA5_4==EOF||(LA5_4>=RULE_ID && LA5_4<=RULE_DECIMAL)||(LA5_4>=13 && LA5_4<=14)||LA5_4==16||(LA5_4>=18 && LA5_4<=47)||(LA5_4>=49 && LA5_4<=67)||(LA5_4>=69 && LA5_4<=78)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                int LA5_5 = input.LA(2);

                if ( (LA5_5==17) ) {
                    alt5=1;
                }
                else if ( (LA5_5==EOF||(LA5_5>=RULE_ID && LA5_5<=RULE_DECIMAL)||(LA5_5>=13 && LA5_5<=14)||LA5_5==16||(LA5_5>=18 && LA5_5<=47)||(LA5_5>=49 && LA5_5<=67)||(LA5_5>=69 && LA5_5<=78)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 16:
            case 27:
            case 34:
            case 35:
            case 45:
            case 47:
            case 51:
            case 53:
            case 55:
            case 59:
            case 60:
            case 61:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:297:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:297:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:297:3: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:297:3: ()
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:298:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:303:2: ( ( ruleFeatureCallID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:304:1: ( ruleFeatureCallID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:304:1: ( ruleFeatureCallID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:305:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXAssignment624);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment640);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:326:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:327:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:327:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:328:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment660);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:345:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:345:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:346:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment690);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        int LA4_1 = input.LA(2);

                        if ( (synpred1_InternalHelloXvars()) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:359:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:359:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:359:7: ()
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:360:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:365:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:366:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:366:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:367:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment743);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:380:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:381:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:381:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:382:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment766);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:406:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:407:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:408:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign806);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign817); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:415:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:418:28: (kw= '=' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:420:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign854); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:433:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:434:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:435:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign894);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign905); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:442:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:445:28: (kw= '+=' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:447:2: kw= '+='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMultiAssign942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:460:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:461:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:462:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression981);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression991); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:469:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:472:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:473:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:473:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:474:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1038);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred2_InternalHelloXvars()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:487:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:487:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:487:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:488:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:493:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:494:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:494:1: ( ruleOpOr )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:495:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1091);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:508:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:509:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:509:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:510:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1114);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:534:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:535:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:536:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1153);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1164); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:543:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:546:28: (kw= '||' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:548:2: kw= '||'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpOr1201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:561:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:562:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:563:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1240);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1250); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:570:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:573:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:574:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:574:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:575:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1297);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_InternalHelloXvars()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:588:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:588:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:588:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:589:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:594:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:595:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:595:1: ( ruleOpAnd )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:596:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1350);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:609:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:610:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:610:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:611:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1373);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:635:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:636:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:637:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1412);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1423); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:644:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:647:28: (kw= '&&' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:649:2: kw= '&&'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpAnd1460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:662:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:663:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:664:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1499);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1509); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:671:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:674:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:675:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:675:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:676:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1556);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_InternalHelloXvars()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==22) ) {
                    int LA8_3 = input.LA(2);

                    if ( (synpred4_InternalHelloXvars()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:689:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:689:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:689:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:690:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:695:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:696:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:696:1: ( ruleOpEquality )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:697:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1609);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:710:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:711:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:711:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:712:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1632);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:736:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:737:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:738:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1671);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1682); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:745:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:748:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:749:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:749:1: (kw= '==' | kw= '!=' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:750:2: kw= '=='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:757:2: kw= '!='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:770:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:771:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:772:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1779);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1789); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:779:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:782:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:783:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:783:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:784:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1836);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred5_InternalHelloXvars()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt10=2;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:794:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:794:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:794:6: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:795:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXRelationalExpression1872); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:804:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:805:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:805:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:806:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1895);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:828:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:828:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:828:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:829:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:834:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:835:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:835:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:836:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1956);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:849:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:850:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:850:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:851:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1979);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:875:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:876:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:877:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2019);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2030); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:884:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:887:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:888:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:888:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:889:2: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:896:2: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:903:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:910:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:923:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:924:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:925:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2165);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:932:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:935:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:936:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:936:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:937:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2222);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:950:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:950:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:950:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:951:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:956:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:957:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:957:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:958:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2275);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:971:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:972:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:972:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:973:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2298);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:997:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:998:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:999:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2337);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2348); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1006:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1009:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1010:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1010:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 26:
                {
                alt15=4;
                }
                break;
            case 27:
                {
                alt15=5;
                }
                break;
            case 31:
                {
                alt15=6;
                }
                break;
            case 32:
                {
                alt15=7;
                }
                break;
            case 33:
                {
                alt15=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1011:2: kw= '->'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1018:2: kw= '..'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1025:2: kw= '=>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1031:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1031:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1032:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1037:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==26) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==26) && (synpred8_InternalHelloXvars())) {
                            alt13=1;
                        }
                        else if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_DECIMAL)||LA13_1==13||LA13_1==16||LA13_1==27||(LA13_1>=34 && LA13_1<=35)||LA13_1==45||LA13_1==47||LA13_1==51||LA13_1==53||LA13_1==55||(LA13_1>=59 && LA13_1<=61)||(LA13_1>=64 && LA13_1<=67)||(LA13_1>=69 && LA13_1<=76)) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1037:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1037:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1037:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1041:5: (kw= '>' kw= '>' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1042:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2475); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2488); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1055:2: kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2509); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1061:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1061:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1062:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1067:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred9_InternalHelloXvars()) ) {
                            alt14=1;
                        }
                        else if ( (true) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1067:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1067:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1067:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1071:5: (kw= '<' kw= '<' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1072:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2562); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2575); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1085:2: kw= '<'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2596); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1092:2: kw= '<>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1099:2: kw= '?:'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1106:2: kw= '<=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1119:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1120:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1121:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2695);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2705); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1128:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1131:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1132:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1132:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1133:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2752);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred10_InternalHelloXvars()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==35) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred10_InternalHelloXvars()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1146:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1146:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1146:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1147:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1152:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1153:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1153:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1154:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2805);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1167:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1168:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1168:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1169:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2828);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1193:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1194:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1195:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2867);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2878); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1202:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1205:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1206:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1206:1: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1207:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd2916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1214:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd2935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1227:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1228:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1229:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2975);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2985); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1236:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1239:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1240:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1240:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1241:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3032);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1254:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1254:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1254:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1255:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1260:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1261:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1261:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1262:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3085);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1275:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1276:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1276:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1277:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3108);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1301:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1302:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1303:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3147);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3158); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1310:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1313:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1314:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1314:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 38:
                {
                alt19=3;
                }
                break;
            case 39:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1315:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1322:2: kw= '**'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1329:2: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1336:2: kw= '%'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1349:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1350:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1351:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3293);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3303); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1358:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1361:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1362:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1362:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16||(LA20_0>=34 && LA20_0<=35)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_DECIMAL)||LA20_0==13||LA20_0==27||LA20_0==45||LA20_0==47||LA20_0==51||LA20_0==53||LA20_0==55||(LA20_0>=59 && LA20_0<=61)||(LA20_0>=64 && LA20_0<=67)||(LA20_0>=69 && LA20_0<=76)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1362:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1362:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1362:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1362:3: ()
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1363:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1368:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1369:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1369:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1370:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3361);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1383:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1384:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1384:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1385:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3382);
                    lv_operand_2_0=ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XUnaryOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1403:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3411);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1419:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1420:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1421:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3447);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3458); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1428:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1431:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt21=1;
                }
                break;
            case 35:
                {
                alt21=2;
                }
                break;
            case 34:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1433:2: kw= '!'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpUnary3496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1440:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1447:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1460:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1461:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1462:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3574);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3584); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1469:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1472:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1473:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1473:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1474:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3631);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred12_InternalHelloXvars()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1484:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1484:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1484:6: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1485:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXCastedExpression3666); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1494:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1495:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1495:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1496:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3689);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1521:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1522:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3727);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3737); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1529:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1532:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1533:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1533:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1534:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3784);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:1: ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop30:
            do {
                int alt30=3;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred13_InternalHelloXvars()) ) {
                        alt30=1;
                    }
                    else if ( (synpred14_InternalHelloXvars()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred14_InternalHelloXvars()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred14_InternalHelloXvars()) ) {
                        alt30=2;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1548:25: ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1548:26: () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1548:26: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1549:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3833); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1558:1: ( ( ruleFeatureCallID ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1559:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1559:1: ( ruleFeatureCallID )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1560:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3856);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3872);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1581:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1582:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1582:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1583:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3894);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1616:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1616:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1616:8: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1617:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1622:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1622:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3980); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1627:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1627:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1628:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1628:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1629:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4004); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1643:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1643:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1644:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1644:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1645:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4041); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1658:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==27) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1658:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4070); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1662:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1663:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1663:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1664:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4091);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1680:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==44) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1680:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4104); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1684:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1685:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1685:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1686:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4125);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4139); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1706:3: ( ( ruleFeatureCallID ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1707:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1707:1: ( ruleFeatureCallID )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1708:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4164);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1721:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1721:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1721:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1721:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1728:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1729:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4198); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt27=3;
            	            alt27 = dfa27.predict(input);
            	            switch (alt27) {
            	                case 1 :
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1759:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1760:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4283);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1777:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1777:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1777:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1777:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1778:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1778:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1779:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4311);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1795:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==44) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1795:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4324); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1799:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1800:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1800:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1801:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4345);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4362); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1821:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1821:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1824:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1825:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4397);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1849:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1850:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1851:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4437);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4447); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1858:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1861:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1862:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1862:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt31=13;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1863:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4494);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1873:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4521);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1883:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4548);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1893:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4575);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1903:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4602);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1913:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4629);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1923:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4656);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1933:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4683);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1943:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4710);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1953:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4737);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1963:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4764);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1973:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4791);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1983:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4818);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1999:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2000:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2001:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4853);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4863); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2008:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2011:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt32=6;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) && (synpred18_InternalHelloXvars())) {
                alt32=1;
            }
            else if ( ((LA32_0>=70 && LA32_0<=71)) ) {
                alt32=2;
            }
            else if ( ((LA32_0>=RULE_HEX && LA32_0<=RULE_DECIMAL)) ) {
                alt32=3;
            }
            else if ( (LA32_0==72) ) {
                alt32=4;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=5;
            }
            else if ( (LA32_0==73) ) {
                alt32=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4923);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2025:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4951);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2035:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4978);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2045:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5005);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2055:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5032);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2065:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5059);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2081:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2082:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2083:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5094);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5104); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2090:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2093:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2094:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2094:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2094:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2094:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2094:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2096:5: ( () otherlv_1= '[' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2096:6: () otherlv_1= '['
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2096:6: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2097:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2121:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2121:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2121:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==30||LA34_0==45) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2121:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2121:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2122:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2122:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2123:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5237);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2139:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==44) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2139:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5250); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2143:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2145:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5271);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2161:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2162:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2162:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2163:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2176:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2177:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2177:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2178:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5330);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2206:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2207:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2208:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5378);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5388); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2215:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2218:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2219:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2219:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2219:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2219:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2220:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2225:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_DECIMAL)||LA37_0==13||LA37_0==16||LA37_0==27||(LA37_0>=34 && LA37_0<=35)||LA37_0==45||LA37_0==47||LA37_0==51||LA37_0==53||LA37_0==55||(LA37_0>=59 && LA37_0<=67)||(LA37_0>=69 && LA37_0<=76)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2225:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2225:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2226:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2226:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2227:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5444);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2243:2: (otherlv_2= ';' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==50) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2243:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXExpressionInClosure5457); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2255:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2256:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2257:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5497);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5507); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2264:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2267:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2268:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2268:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2268:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2268:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2268:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2284:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2284:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2284:7: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2285:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2290:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==30||LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2290:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2290:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2291:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2291:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2292:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5615);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2308:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==44) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2308:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXShortClosure5628); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2312:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2313:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2313:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2314:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5649);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2330:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2331:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2331:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2332:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,48,FOLLOW_48_in_ruleXShortClosure5671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2345:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2346:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2346:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2347:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5707);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2371:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2372:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2373:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5743);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5753); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2380:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2383:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2384:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2384:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2384:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression5790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5812);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression5823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2409:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2410:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2411:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5859);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5869); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2418:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2421:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2422:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2422:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2422:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2422:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2423:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression5915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2436:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2437:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2437:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2438:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5948);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2458:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2459:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2459:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2460:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5981);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==52) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred22_InternalHelloXvars()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2481:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2482:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2482:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2483:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6024);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2507:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2508:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2509:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6062);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6072); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2516:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2519:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2520:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2520:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2520:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2520:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2521:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_DECIMAL)||LA42_0==13||LA42_0==16||LA42_0==27||(LA42_0>=34 && LA42_0<=35)||LA42_0==47||LA42_0==51||LA42_0==53||LA42_0==55||(LA42_0>=59 && LA42_0<=61)||(LA42_0>=64 && LA42_0<=67)||(LA42_0>=69 && LA42_0<=76)) ) {
                alt42=1;
            }
            else if ( (LA42_0==45) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==RULE_ID) ) {
                    int LA42_3 = input.LA(3);

                    if ( ((LA42_3>=17 && LA42_3<=43)||(LA42_3>=45 && LA42_3<=47)||LA42_3==68) ) {
                        alt42=1;
                    }
                    else if ( (LA42_3==54) && (synpred24_InternalHelloXvars())) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA42_2>=RULE_STRING && LA42_2<=RULE_DECIMAL)||LA42_2==13||LA42_2==16||LA42_2==27||(LA42_2>=34 && LA42_2<=35)||LA42_2==45||LA42_2==47||LA42_2==51||LA42_2==53||LA42_2==55||(LA42_2>=59 && LA42_2<=61)||(LA42_2>=64 && LA42_2<=67)||(LA42_2>=69 && LA42_2<=76)) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        int LA41_1 = input.LA(2);

                        if ( (LA41_1==54) && (synpred23_InternalHelloXvars())) {
                            alt41=1;
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2535:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2535:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2535:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2536:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2536:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2537:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6161);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6173); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2557:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2558:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2558:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2559:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6197);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2582:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2582:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression6241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2586:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2587:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2587:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2588:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6262);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2608:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2609:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2609:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2610:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6297);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression6309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2634:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==30||LA43_0==45||LA43_0==54||LA43_0==58) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2635:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2635:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2636:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6344);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2652:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2652:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2660:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2661:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2661:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2662:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6391);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2690:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2691:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2692:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6441);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6451); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2699:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2702:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2703:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2703:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2703:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2703:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==30||LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2704:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2704:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2705:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6497);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2721:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2721:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart6511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2725:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2726:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2726:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2727:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6532);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart6546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2747:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2748:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2748:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2749:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6567);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2773:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2774:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2775:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6603);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6613); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2782:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2785:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2786:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2786:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2786:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2786:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2787:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression6659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression6671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2800:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2801:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2801:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2802:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6692);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression6704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2822:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2823:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2823:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2824:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6725);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2844:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2845:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2845:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2846:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6758);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2870:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2871:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2872:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6794);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6804); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2879:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2882:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2883:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2883:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2883:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2883:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2884:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression6850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression6862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2897:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2898:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2898:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2899:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6883);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXWhileExpression6895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2919:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2920:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2920:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2921:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6916);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2945:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2946:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2947:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6952);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6962); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2954:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2957:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2958:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2958:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2958:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2958:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2959:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2968:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2969:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2969:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2970:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7029);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression7053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2994:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2995:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2995:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2996:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7074);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXDoWhileExpression7086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3024:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3025:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3026:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7122);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7132); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3033:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3036:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3037:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3037:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3037:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3037:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3038:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3047:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==13||LA48_0==16||LA48_0==27||(LA48_0>=34 && LA48_0<=35)||LA48_0==45||LA48_0==47||LA48_0==51||LA48_0==53||LA48_0==55||(LA48_0>=59 && LA48_0<=67)||(LA48_0>=69 && LA48_0<=76)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3047:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3047:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3048:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3048:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3049:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7200);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3065:2: (otherlv_3= ';' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==50) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3065:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression7213); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleXBlockExpression7229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3081:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3082:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3083:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7265);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7275); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3090:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3093:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3094:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3094:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=62 && LA49_0<=63)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_DECIMAL)||LA49_0==13||LA49_0==16||LA49_0==27||(LA49_0>=34 && LA49_0<=35)||LA49_0==45||LA49_0==47||LA49_0==51||LA49_0==53||LA49_0==55||(LA49_0>=59 && LA49_0<=61)||(LA49_0>=64 && LA49_0<=67)||(LA49_0>=69 && LA49_0<=76)) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3095:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7322);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3105:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7349);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3121:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3122:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3123:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7384);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7394); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3130:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3133:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3134:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3134:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3134:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3134:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3135:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3140:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==62) ) {
                alt50=1;
            }
            else if ( (LA50_0==63) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3140:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3140:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3141:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3141:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3142:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3156:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred25_InternalHelloXvars()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==45) && (synpred25_InternalHelloXvars())) {
                alt51=1;
            }
            else if ( (LA51_0==30) && (synpred25_InternalHelloXvars())) {
                alt51=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3168:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3168:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3168:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3169:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3169:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3170:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7526);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3186:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3187:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3187:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3188:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7547);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3205:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3205:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3206:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3206:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3207:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7576);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3223:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==17) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3223:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXVariableDeclaration7590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3227:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3228:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3228:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3229:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7611);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3253:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3254:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3255:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7649);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7659); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3262:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3265:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3266:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3266:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3266:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3266:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_ID||LA53_1==27||LA53_1==41||LA53_1==47) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==30||LA53_0==45) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3267:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3267:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3268:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7705);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3284:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3285:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3285:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3286:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7727);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3310:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3311:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3312:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7763);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7773); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3319:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3322:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3323:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3323:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3323:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3323:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3324:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3324:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3325:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7819);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3341:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3342:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3342:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3343:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7840);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3367:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3368:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3369:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7876);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7886); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3376:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3379:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3380:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3380:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3380:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3380:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3381:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3386:2: ( ( ruleStaticQualifier ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==68) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3387:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3387:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3388:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7943);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3401:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==27) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3401:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3405:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3406:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3406:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3407:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7978);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3423:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==44) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3423:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall7991); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3427:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3428:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3428:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3429:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8012);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3449:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3450:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3450:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3451:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8051);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3464:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3464:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3464:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3464:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3471:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3472:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt58=3;
                    alt58 = dfa58.predict(input);
                    switch (alt58) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3502:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3503:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8170);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3520:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3520:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3520:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3520:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3521:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3521:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3522:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8198);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3538:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==44) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3538:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8211); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3542:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3543:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3543:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3544:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8232);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop57;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3564:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3564:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3567:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3568:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8284);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleFeatureCallID"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3592:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3593:2: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3594:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID8322);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCallID8333); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCallID"


    // $ANTLR start "ruleFeatureCallID"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3601:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3604:28: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3605:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3605:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt61=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt61=1;
                }
                break;
            case 64:
                {
                alt61=2;
                }
                break;
            case 65:
                {
                alt61=3;
                }
                break;
            case 13:
                {
                alt61=4;
                }
                break;
            case 66:
                {
                alt61=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3606:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleFeatureCallID8380);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3618:2: kw= 'extends'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleFeatureCallID8404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3625:2: kw= 'static'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleFeatureCallID8423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3632:2: kw= 'import'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleFeatureCallID8442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3639:2: kw= 'extension'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleFeatureCallID8461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtensionKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3652:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3653:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3654:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8502);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8513); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3661:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3664:28: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3665:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3665:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||LA62_0==13||(LA62_0>=64 && LA62_0<=66)) ) {
                alt62=1;
            }
            else if ( (LA62_0==67) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3666:5: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper8560);
                    this_FeatureCallID_0=ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FeatureCallID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3678:2: kw= 'super'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleIdOrSuper8584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3691:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3692:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3693:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8625);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8636); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3700:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3703:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3704:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3704:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==68) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3705:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8683);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleStaticQualifier8701); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3729:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3730:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3731:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8742);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3738:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3741:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3742:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3742:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3742:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3742:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3743:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXConstructorCall8798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3752:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3753:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3753:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3754:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8821);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3767:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3767:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3767:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3767:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3772:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3773:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3773:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3774:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8864);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3790:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==44) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3790:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8877); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3794:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3795:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3795:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3796:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8898);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3816:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3816:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3816:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3816:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3838:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3839:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9008);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3856:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3856:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3856:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3856:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3857:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3857:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3858:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9036);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3874:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==44) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3874:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall9049); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3878:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3879:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3879:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3880:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9070);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall9087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3900:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3900:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3903:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3904:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9122);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3928:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3929:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3930:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9159);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9169); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3937:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3940:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3941:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3941:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3941:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3941:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3942:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3947:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==70) ) {
                alt70=1;
            }
            else if ( (LA70_0==71) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3947:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3952:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3952:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3953:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3953:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3954:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3975:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3976:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3977:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9290);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9300); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3984:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3987:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3988:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3988:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3988:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3988:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3989:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXNullLiteral9346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4006:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4007:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4008:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9382);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9392); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4015:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4018:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4019:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4019:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4019:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4019:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4020:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4025:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4026:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4026:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4027:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9447);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4051:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4052:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4053:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9483);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9493); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4060:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4063:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4064:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4064:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4064:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4064:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4065:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4070:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4071:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4071:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4072:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4096:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4097:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4098:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9585);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9595); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4105:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4108:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4109:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4109:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4109:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4109:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4110:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTypeLiteral9641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral9653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4123:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4124:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4124:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9676);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4138:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==47) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4139:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4139:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4140:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral9697);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXTypeLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arrayDimensions",
            	              		lv_arrayDimensions_4_0, 
            	              		"ArrayBrackets");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXTypeLiteral9710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4168:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4169:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4170:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9746);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9756); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4177:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4180:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4181:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4181:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4181:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4181:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4182:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXThrowExpression9802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4191:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4192:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4192:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4193:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9823);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4217:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4218:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4219:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9859);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9869); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4226:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4229:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4230:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4230:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4230:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4230:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4231:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXReturnExpression9915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4240:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4240:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4245:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4246:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9946);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4270:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4272:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9983);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9993); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4279:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4282:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4283:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4283:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4283:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4283:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4284:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4293:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4294:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4294:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4295:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10060);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4311:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==78) ) {
                alt75=1;
            }
            else if ( (LA75_0==77) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4311:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4311:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4311:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4311:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==78) ) {
                            int LA73_2 = input.LA(2);

                            if ( (synpred34_InternalHelloXvars()) ) {
                                alt73=1;
                            }


                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4311:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4313:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4314:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10090);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4330:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==77) ) {
                        int LA74_1 = input.LA(2);

                        if ( (synpred35_InternalHelloXvars()) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4330:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4330:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4330:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10112); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4335:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4336:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4336:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4337:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10134);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4354:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4354:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4354:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4358:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4359:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4359:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4360:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10177);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4384:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4385:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4386:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10215);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4393:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4396:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4397:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4397:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4397:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4397:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4397:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleXCatchClause10270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause10283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4406:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4407:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4407:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4408:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10304);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXCatchClause10316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4428:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4429:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4429:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4430:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10337);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4454:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4455:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4456:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10374);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10385); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4463:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4466:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4467:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4467:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4468:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10432);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4478:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==41) ) {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==RULE_ID) ) {
                        int LA76_3 = input.LA(3);

                        if ( (synpred37_InternalHelloXvars()) ) {
                            alt76=1;
                        }


                    }


                }


                switch (alt76) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4478:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4478:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4478:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleQualifiedName10460); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10483);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4505:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4509:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4510:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10537);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10548); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4520:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4524:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4525:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4525:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_HEX) ) {
                alt80=1;
            }
            else if ( ((LA80_0>=RULE_INT && LA80_0<=RULE_DECIMAL)) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4525:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4533:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4533:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4533:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4533:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_INT) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==RULE_DECIMAL) ) {
                        alt77=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4533:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10620); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4541:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10646); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4548:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==41) ) {
                        int LA79_1 = input.LA(2);

                        if ( ((LA79_1>=RULE_INT && LA79_1<=RULE_DECIMAL)) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4549:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleNumber10666); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4554:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==RULE_INT) ) {
                                alt78=1;
                            }
                            else if ( (LA78_0==RULE_DECIMAL) ) {
                                alt78=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 0, input);

                                throw nvae;
                            }
                            switch (alt78) {
                                case 1 :
                                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4554:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10682); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4562:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10708); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4580:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4581:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4582:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10761);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10771); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4589:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4592:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4593:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4593:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            else if ( (LA82_0==30||LA82_0==45) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4593:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4593:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4594:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10819);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4602:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==47) ) {
                            int LA81_2 = input.LA(2);

                            if ( (LA81_2==49) ) {
                                int LA81_3 = input.LA(3);

                                if ( (synpred38_InternalHelloXvars()) ) {
                                    alt81=1;
                                }


                            }


                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4602:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4603:24: ( () ruleArrayBrackets )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4603:25: () ruleArrayBrackets
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4603:25: ()
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4604:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference10855);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4619:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10886);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4635:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4636:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4637:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets10922);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayBrackets10933); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4644:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4647:28: ( (kw= '[' kw= ']' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4648:1: (kw= '[' kw= ']' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4648:1: (kw= '[' kw= ']' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4649:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,47,FOLLOW_47_in_ruleArrayBrackets10971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,49,FOLLOW_49_in_ruleArrayBrackets10984); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4668:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4669:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4670:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11024);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11034); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4677:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4680:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4681:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4681:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4681:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4681:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==45) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4681:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef11072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4685:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_ID||LA84_0==30||LA84_0==45) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4685:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4685:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4686:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4686:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4687:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11094);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4703:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==44) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4703:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef11107); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4707:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4708:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4708:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4709:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11128);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop83;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef11144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleXFunctionTypeRef11158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4733:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4734:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4734:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4735:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11179);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4759:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4760:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4761:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11215);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4768:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4771:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4772:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4772:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4772:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4772:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4773:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4773:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4774:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11273);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4787:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4787:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4787:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4787:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4792:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4793:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4793:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4794:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11316);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4810:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==44) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4810:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleJvmParameterizedTypeReference11329); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4814:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4815:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4815:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4816:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11350);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference11364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4844:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4845:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4846:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11402);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11412); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4853:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4856:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4857:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4857:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID||LA88_0==30||LA88_0==45) ) {
                alt88=1;
            }
            else if ( (LA88_0==79) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4858:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11459);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4868:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11486);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4884:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4885:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4886:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11521);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11531); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4893:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4896:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4897:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4897:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4897:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4897:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4898:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleJvmWildcardTypeReference11577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4907:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt89=3;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==64) ) {
                alt89=1;
            }
            else if ( (LA89_0==67) ) {
                alt89=2;
            }
            switch (alt89) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4907:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4907:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4908:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4908:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4909:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11599);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4926:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4926:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4927:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4927:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4928:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11626);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4952:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4953:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4954:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11664);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11674); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4961:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4964:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4965:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4965:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4965:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleJvmUpperBound11711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4969:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4970:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4970:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4971:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11732);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4995:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4996:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4997:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11768);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11778); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5004:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5007:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5008:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5008:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5008:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBoundAnded11815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5012:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5013:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5013:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5014:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11836);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5038:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5039:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5040:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11872);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11882); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5047:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5050:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5051:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5051:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5051:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleJvmLowerBound11919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5055:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5056:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5056:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5057:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11940);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5083:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5084:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5085:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard11979);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard11990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5092:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5095:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5096:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5096:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5097:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12037);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,41,FOLLOW_41_in_ruleQualifiedNameWithWildcard12055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,36,FOLLOW_36_in_ruleQualifiedNameWithWildcard12068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5127:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5128:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5129:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12109);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12120); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5136:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5139:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5140:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5157:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5158:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5159:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration12205);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportDeclaration12215); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5166:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5169:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5170:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5170:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5170:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXImportDeclaration12252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5174:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt91=3;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5174:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5174:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5174:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5174:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5175:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5175:1: (lv_static_1_0= 'static' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5176:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,65,FOLLOW_65_in_ruleXImportDeclaration12272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5189:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==66) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5190:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5190:1: (lv_extension_2_0= 'extension' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5191:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXImportDeclaration12303); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5204:3: ( ( ruleQualifiedName ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5205:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5205:1: ( ruleQualifiedName )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5206:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12340);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXImportDeclaration12352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXImportDeclarationAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleXImportDeclaration12364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXImportDeclarationAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5228:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5228:6: ( ( ruleQualifiedName ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5229:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5229:1: ( ruleQualifiedName )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5230:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12394);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5244:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5244:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5245:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5245:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5246:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration12421);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_7_0, 
                              		"QualifiedNameWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5262:3: (otherlv_8= ';' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==50) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5262:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleXImportDeclaration12435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"

    // $ANTLR start synpred1_InternalHelloXvars
    public final void synpred1_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:354:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:355:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:355:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:356:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:356:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:357:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXvars711);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalHelloXvars

    // $ANTLR start synpred2_InternalHelloXvars
    public final void synpred2_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:482:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:483:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:483:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:484:1: ( ruleOpOr )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:484:1: ( ruleOpOr )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:485:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHelloXvars1059);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHelloXvars

    // $ANTLR start synpred3_InternalHelloXvars
    public final void synpred3_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:583:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:584:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:584:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:585:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:585:1: ( ruleOpAnd )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:586:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXvars1318);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHelloXvars

    // $ANTLR start synpred4_InternalHelloXvars
    public final void synpred4_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:684:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:685:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:685:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:686:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:686:1: ( ruleOpEquality )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:687:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXvars1577);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHelloXvars

    // $ANTLR start synpred5_InternalHelloXvars
    public final void synpred5_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:5: ( () 'instanceof' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:6: () 'instanceof'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:792:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:793:1: 
        {
        }

        match(input,23,FOLLOW_23_in_synpred5_InternalHelloXvars1853); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloXvars

    // $ANTLR start synpred6_InternalHelloXvars
    public final void synpred6_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:823:10: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:824:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:824:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:825:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:825:1: ( ruleOpCompare )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:826:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXvars1924);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHelloXvars

    // $ANTLR start synpred7_InternalHelloXvars
    public final void synpred7_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:946:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:946:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:947:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:947:1: ( ruleOpOther )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:948:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloXvars2243);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHelloXvars

    // $ANTLR start synpred8_InternalHelloXvars
    public final void synpred8_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1037:3: ( ( '>' '>' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1037:4: ( '>' '>' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1037:4: ( '>' '>' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1038:2: '>' '>'
        {
        match(input,26,FOLLOW_26_in_synpred8_InternalHelloXvars2459); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred8_InternalHelloXvars2464); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHelloXvars

    // $ANTLR start synpred9_InternalHelloXvars
    public final void synpred9_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1067:3: ( ( '<' '<' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1067:4: ( '<' '<' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1067:4: ( '<' '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1068:2: '<' '<'
        {
        match(input,27,FOLLOW_27_in_synpred9_InternalHelloXvars2546); if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred9_InternalHelloXvars2551); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHelloXvars

    // $ANTLR start synpred10_InternalHelloXvars
    public final void synpred10_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1142:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1142:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1143:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1143:1: ( ruleOpAdd )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1144:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHelloXvars2773);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHelloXvars

    // $ANTLR start synpred11_InternalHelloXvars
    public final void synpred11_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1250:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1250:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1251:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1251:1: ( ruleOpMulti )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1252:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHelloXvars3053);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHelloXvars

    // $ANTLR start synpred12_InternalHelloXvars
    public final void synpred12_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:4: ( () 'as' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:4: ( () 'as' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:5: () 'as'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1483:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred12_InternalHelloXvars3647); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHelloXvars

    // $ANTLR start synpred13_InternalHelloXvars
    public final void synpred13_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:6: () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1542:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1543:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred13_InternalHelloXvars3801); if (state.failed) return ;
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1544:1: ( ( ruleFeatureCallID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1545:1: ( ruleFeatureCallID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1545:1: ( ruleFeatureCallID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1546:3: ruleFeatureCallID
        {
        pushFollow(FOLLOW_ruleFeatureCallID_in_synpred13_InternalHelloXvars3810);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloXvars3816);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloXvars

    // $ANTLR start synpred14_InternalHelloXvars
    public final void synpred14_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1600:10: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1601:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1601:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt93=3;
        switch ( input.LA(1) ) {
        case 41:
            {
            alt93=1;
            }
            break;
        case 42:
            {
            alt93=2;
            }
            break;
        case 43:
            {
            alt93=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }

        switch (alt93) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1601:4: '.'
                {
                match(input,41,FOLLOW_41_in_synpred14_InternalHelloXvars3919); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1603:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1603:6: ( ( '?.' ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1604:1: ( '?.' )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1604:1: ( '?.' )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1605:2: '?.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalHelloXvars3933); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1610:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1610:6: ( ( '*.' ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1611:1: ( '*.' )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1611:1: ( '*.' )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1612:2: '*.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalHelloXvars3953); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloXvars

    // $ANTLR start synpred15_InternalHelloXvars
    public final void synpred15_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1721:4: ( ( '(' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1722:1: ( '(' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1722:1: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1723:2: '('
        {
        match(input,45,FOLLOW_45_in_synpred15_InternalHelloXvars4180); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloXvars

    // $ANTLR start synpred16_InternalHelloXvars
    public final void synpred16_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1743:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1743:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==30||LA95_0==45) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1743:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1743:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1744:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1744:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1745:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars4232);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1747:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==44) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1747:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred16_InternalHelloXvars4239); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1748:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1749:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1749:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1750:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars4246);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1752:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1753:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1753:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1754:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred16_InternalHelloXvars4260); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloXvars

    // $ANTLR start synpred17_InternalHelloXvars
    public final void synpred17_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1821:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1821:5: ( () '[' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1821:5: ( () '[' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1821:6: () '['
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1821:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1822:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred17_InternalHelloXvars4380); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHelloXvars

    // $ANTLR start synpred18_InternalHelloXvars
    public final void synpred18_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:3: ( ( () '[' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:4: ( () '[' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:4: ( () '[' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:5: () '['
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2013:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred18_InternalHelloXvars4904); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHelloXvars

    // $ANTLR start synpred20_InternalHelloXvars
    public final void synpred20_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==30||LA97_0==45) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2107:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2107:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2108:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXvars5183);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2110:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==44) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2110:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred20_InternalHelloXvars5190); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2111:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2112:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2112:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2113:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXvars5197);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2115:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2116:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2116:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2117:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred20_InternalHelloXvars5211); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloXvars

    // $ANTLR start synpred22_InternalHelloXvars
    public final void synpred22_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:4: ( 'else' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:6: 'else'
        {
        match(input,52,FOLLOW_52_in_synpred22_InternalHelloXvars5994); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHelloXvars

    // $ANTLR start synpred23_InternalHelloXvars
    public final void synpred23_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2531:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2531:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2532:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHelloXvars6136);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred23_InternalHelloXvars6142); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloXvars

    // $ANTLR start synpred24_InternalHelloXvars
    public final void synpred24_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2576:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,45,FOLLOW_45_in_synpred24_InternalHelloXvars6218); if (state.failed) return ;
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2577:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2578:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2578:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2579:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHelloXvars6225);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred24_InternalHelloXvars6231); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloXvars

    // $ANTLR start synpred25_InternalHelloXvars
    public final void synpred25_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3161:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3161:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3162:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloXvars7496);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3164:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3165:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3165:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3166:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHelloXvars7505);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHelloXvars

    // $ANTLR start synpred26_InternalHelloXvars
    public final void synpred26_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3464:4: ( ( '(' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3465:1: ( '(' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3465:1: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3466:2: '('
        {
        match(input,45,FOLLOW_45_in_synpred26_InternalHelloXvars8067); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloXvars

    // $ANTLR start synpred27_InternalHelloXvars
    public final void synpred27_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3486:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3486:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==30||LA101_0==45) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3486:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3486:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3487:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3487:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3488:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8119);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3490:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==44) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3490:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred27_InternalHelloXvars8126); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3491:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3492:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3492:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3493:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8133);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3495:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3496:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3496:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3497:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred27_InternalHelloXvars8147); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloXvars

    // $ANTLR start synpred28_InternalHelloXvars
    public final void synpred28_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3564:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3564:5: ( () '[' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3564:5: ( () '[' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3564:6: () '['
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3564:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3565:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred28_InternalHelloXvars8267); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloXvars

    // $ANTLR start synpred29_InternalHelloXvars
    public final void synpred29_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3767:4: ( '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3767:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred29_InternalHelloXvars8834); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHelloXvars

    // $ANTLR start synpred30_InternalHelloXvars
    public final void synpred30_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3816:5: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3816:7: '('
        {
        match(input,45,FOLLOW_45_in_synpred30_InternalHelloXvars8927); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloXvars

    // $ANTLR start synpred31_InternalHelloXvars
    public final void synpred31_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3822:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3822:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_ID||LA103_0==30||LA103_0==45) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3822:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3822:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3823:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3823:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3824:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXvars8957);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3826:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==44) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3826:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred31_InternalHelloXvars8964); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3827:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3828:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3828:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3829:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXvars8971);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop102;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3831:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3832:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3832:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3833:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred31_InternalHelloXvars8985); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHelloXvars

    // $ANTLR start synpred32_InternalHelloXvars
    public final void synpred32_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3900:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3900:5: ( () '[' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3900:5: ( () '[' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3900:6: () '['
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3900:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3901:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred32_InternalHelloXvars9105); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHelloXvars

    // $ANTLR start synpred33_InternalHelloXvars
    public final void synpred33_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4240:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4241:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4241:1: ( ruleXExpression )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4242:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHelloXvars9929);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHelloXvars

    // $ANTLR start synpred34_InternalHelloXvars
    public final void synpred34_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4311:5: ( 'catch' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4311:7: 'catch'
        {
        match(input,78,FOLLOW_78_in_synpred34_InternalHelloXvars10074); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHelloXvars

    // $ANTLR start synpred35_InternalHelloXvars
    public final void synpred35_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4330:5: ( 'finally' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4330:7: 'finally'
        {
        match(input,77,FOLLOW_77_in_synpred35_InternalHelloXvars10104); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloXvars

    // $ANTLR start synpred37_InternalHelloXvars
    public final void synpred37_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4478:3: ( '.' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4479:2: '.'
        {
        match(input,41,FOLLOW_41_in_synpred37_InternalHelloXvars10451); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHelloXvars

    // $ANTLR start synpred38_InternalHelloXvars
    public final void synpred38_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4602:2: ( ( () ruleArrayBrackets ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4602:3: ( () ruleArrayBrackets )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4602:3: ( () ruleArrayBrackets )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4602:4: () ruleArrayBrackets
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4602:4: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4603:1: 
        {
        }

        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred38_InternalHelloXvars10834);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHelloXvars

    // $ANTLR start synpred39_InternalHelloXvars
    public final void synpred39_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4787:4: ( '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4787:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred39_InternalHelloXvars11286); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalHelloXvars

    // Delegated rules

    public final boolean synpred34_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\1\1\12\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA12_maxS =
        "\1\116\1\uffff\10\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA12_specialS =
        "\2\uffff\1\3\1\5\1\2\1\7\1\6\1\1\1\0\1\4\1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\5\1\4\uffff\2\1\1\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\16\1\1\uffff\23\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 945:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\106\uffff";
    static final String DFA28_eofS =
        "\1\2\105\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA28_maxS =
        "\1\116\1\0\104\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\4\uffff\2\2\1\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\23"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1721:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\42\uffff";
    static final String DFA27_eofS =
        "\42\uffff";
    static final String DFA27_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA27_maxS =
        "\1\114\2\0\37\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA27_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\4\5\4\uffff\1\5\2\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\11\uffff\1\2\1\41\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\4\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1742:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==RULE_ID) ) {s = 1;}

                        else if ( (LA27_0==45) ) {s = 2;}

                        else if ( (LA27_0==30) && (synpred16_InternalHelloXvars())) {s = 3;}

                        else if ( (LA27_0==48) && (synpred16_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_DECIMAL)||LA27_0==13||LA27_0==16||LA27_0==27||(LA27_0>=34 && LA27_0<=35)||LA27_0==47||LA27_0==51||LA27_0==53||LA27_0==55||(LA27_0>=59 && LA27_0<=61)||(LA27_0>=64 && LA27_0<=67)||(LA27_0>=69 && LA27_0<=76)) ) {s = 5;}

                        else if ( (LA27_0==46) ) {s = 33;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\106\uffff";
    static final String DFA29_eofS =
        "\1\2\105\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA29_maxS =
        "\1\116\1\0\104\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\4\uffff\2\2\1\uffff\1\2\1\uffff\35\2\1\1\1\uffff\23\2\1"+
            "\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1821:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\16\uffff";
    static final String DFA31_eofS =
        "\16\uffff";
    static final String DFA31_minS =
        "\1\4\15\uffff";
    static final String DFA31_maxS =
        "\1\114\15\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA31_specialS =
        "\16\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\4\4\5\4\uffff\1\4\15\uffff\1\4\21\uffff\1\15\1\uffff\1\5"+
            "\3\uffff\1\6\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2"+
            "\uffff\4\4\1\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1862:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA35_eotS =
        "\44\uffff";
    static final String DFA35_eofS =
        "\44\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA35_maxS =
        "\1\114\2\0\41\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\36\uffff";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\4\5\4\uffff\1\5\2\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\11\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\11\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2106:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==45) ) {s = 2;}

                        else if ( (LA35_0==30) && (synpred20_InternalHelloXvars())) {s = 3;}

                        else if ( (LA35_0==48) && (synpred20_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_DECIMAL)||LA35_0==13||LA35_0==16||LA35_0==27||(LA35_0>=34 && LA35_0<=35)||LA35_0==47||LA35_0==49||LA35_0==51||LA35_0==53||LA35_0==55||(LA35_0>=59 && LA35_0<=67)||(LA35_0>=69 && LA35_0<=76)) ) {s = 5;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\106\uffff";
    static final String DFA59_eofS =
        "\1\2\105\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA59_maxS =
        "\1\116\1\0\104\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA59_transitionS = {
            "\5\2\4\uffff\2\2\1\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\23"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3464:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\42\uffff";
    static final String DFA58_eofS =
        "\42\uffff";
    static final String DFA58_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA58_maxS =
        "\1\114\2\0\37\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA58_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\4\5\4\uffff\1\5\2\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\11\uffff\1\2\1\41\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\4\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3485:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA58_0==RULE_ID) ) {s = 1;}

                        else if ( (LA58_0==45) ) {s = 2;}

                        else if ( (LA58_0==30) && (synpred27_InternalHelloXvars())) {s = 3;}

                        else if ( (LA58_0==48) && (synpred27_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_DECIMAL)||LA58_0==13||LA58_0==16||LA58_0==27||(LA58_0>=34 && LA58_0<=35)||LA58_0==47||LA58_0==51||LA58_0==53||LA58_0==55||(LA58_0>=59 && LA58_0<=61)||(LA58_0>=64 && LA58_0<=67)||(LA58_0>=69 && LA58_0<=76)) ) {s = 5;}

                        else if ( (LA58_0==46) ) {s = 33;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\106\uffff";
    static final String DFA60_eofS =
        "\1\2\105\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA60_maxS =
        "\1\116\1\0\104\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA60_transitionS = {
            "\5\2\4\uffff\2\2\1\uffff\1\2\1\uffff\35\2\1\1\1\uffff\23\2\1"+
            "\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3564:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\106\uffff";
    static final String DFA65_eofS =
        "\1\2\105\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA65_maxS =
        "\1\116\1\0\104\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\4\uffff\2\2\1\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\23"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3767:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\106\uffff";
    static final String DFA68_eofS =
        "\1\2\105\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA68_maxS =
        "\1\116\1\0\104\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\4\uffff\2\2\1\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\23"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3816:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\42\uffff";
    static final String DFA67_eofS =
        "\42\uffff";
    static final String DFA67_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA67_maxS =
        "\1\114\2\0\37\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\4\5\4\uffff\1\5\2\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\11\uffff\1\2\1\41\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\4\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3821:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==45) ) {s = 2;}

                        else if ( (LA67_0==30) && (synpred31_InternalHelloXvars())) {s = 3;}

                        else if ( (LA67_0==48) && (synpred31_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_DECIMAL)||LA67_0==13||LA67_0==16||LA67_0==27||(LA67_0>=34 && LA67_0<=35)||LA67_0==47||LA67_0==51||LA67_0==53||LA67_0==55||(LA67_0>=59 && LA67_0<=61)||(LA67_0>=64 && LA67_0<=67)||(LA67_0>=69 && LA67_0<=76)) ) {s = 5;}

                        else if ( (LA67_0==46) ) {s = 33;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\106\uffff";
    static final String DFA69_eofS =
        "\1\2\105\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA69_maxS =
        "\1\116\1\0\104\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\4\uffff\2\2\1\uffff\1\2\1\uffff\35\2\1\1\1\uffff\23\2\1"+
            "\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "3900:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\106\uffff";
    static final String DFA72_eofS =
        "\1\37\105\uffff";
    static final String DFA72_minS =
        "\1\4\36\0\47\uffff";
    static final String DFA72_maxS =
        "\1\116\36\0\47\uffff";
    static final String DFA72_acceptS =
        "\37\uffff\1\2\45\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\47\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\1\25\1\21\1\22\1\23\4\uffff\1\4\1\37\1\uffff\1\6\1\uffff"+
            "\11\37\1\14\6\37\1\10\1\7\11\37\1\36\1\37\1\16\1\uffff\2\37"+
            "\1\27\1\37\1\13\1\37\1\12\3\37\1\30\1\31\1\32\2\37\1\2\1\3\1"+
            "\5\1\15\1\uffff\1\11\1\17\1\20\1\24\1\26\1\33\1\34\1\35\2\37",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4240:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_3 = input.LA(1);

                         
                        int index72_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA72_4 = input.LA(1);

                         
                        int index72_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA72_5 = input.LA(1);

                         
                        int index72_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA72_6 = input.LA(1);

                         
                        int index72_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA72_7 = input.LA(1);

                         
                        int index72_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA72_8 = input.LA(1);

                         
                        int index72_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA72_9 = input.LA(1);

                         
                        int index72_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA72_10 = input.LA(1);

                         
                        int index72_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA72_11 = input.LA(1);

                         
                        int index72_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA72_12 = input.LA(1);

                         
                        int index72_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA72_13 = input.LA(1);

                         
                        int index72_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA72_14 = input.LA(1);

                         
                        int index72_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA72_15 = input.LA(1);

                         
                        int index72_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA72_16 = input.LA(1);

                         
                        int index72_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA72_17 = input.LA(1);

                         
                        int index72_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA72_18 = input.LA(1);

                         
                        int index72_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA72_19 = input.LA(1);

                         
                        int index72_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA72_20 = input.LA(1);

                         
                        int index72_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA72_21 = input.LA(1);

                         
                        int index72_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA72_22 = input.LA(1);

                         
                        int index72_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA72_23 = input.LA(1);

                         
                        int index72_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA72_24 = input.LA(1);

                         
                        int index72_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA72_25 = input.LA(1);

                         
                        int index72_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA72_26 = input.LA(1);

                         
                        int index72_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA72_27 = input.LA(1);

                         
                        int index72_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA72_28 = input.LA(1);

                         
                        int index72_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA72_29 = input.LA(1);

                         
                        int index72_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA72_30 = input.LA(1);

                         
                        int index72_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index72_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA87_eotS =
        "\106\uffff";
    static final String DFA87_eofS =
        "\1\2\105\uffff";
    static final String DFA87_minS =
        "\1\4\1\0\104\uffff";
    static final String DFA87_maxS =
        "\1\116\1\0\104\uffff";
    static final String DFA87_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA87_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA87_transitionS = {
            "\5\2\4\uffff\2\2\1\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\23"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "4787:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_1 = input.LA(1);

                         
                        int index87_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalHelloXvars()) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\7\uffff";
    static final String DFA91_eofS =
        "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String DFA91_minS =
        "\1\4\1\uffff\1\51\1\4\1\uffff\1\51\1\uffff";
    static final String DFA91_maxS =
        "\1\101\1\uffff\1\62\1\44\1\uffff\1\62\1\uffff";
    static final String DFA91_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String DFA91_specialS =
        "\7\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\2\74\uffff\1\1",
            "",
            "\1\3\10\uffff\1\4",
            "\1\5\37\uffff\1\6",
            "",
            "\1\3\10\uffff\1\4",
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "5174:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0xC000000000006002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleModel153 = new BitSet(new long[]{0xC000000000004002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel175 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGreeting363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGreeting397 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleGreeting418 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGreeting430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXAssignment624 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment640 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment690 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment743 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMultiAssign942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1038 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1091 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1114 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpOr1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1297 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1350 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1373 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpAnd1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1556 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1609 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1632 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1836 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_23_in_ruleXRelationalExpression1872 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1895 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1956 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1979 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2222 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2275 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2298 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2444 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2475 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2531 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2562 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2752 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2805 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2828 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3032 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3085 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3108 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3361 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpUnary3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3631 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXCastedExpression3666 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3689 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3784 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3833 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3856 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3872 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3894 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3980 = new BitSet(new long[]{0x0000000008002010L,0x0000000000000007L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4004 = new BitSet(new long[]{0x0000000008002010L,0x0000000000000007L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4041 = new BitSet(new long[]{0x0000000008002010L,0x0000000000000007L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4070 = new BitSet(new long[]{0x0000200040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4091 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4104 = new BitSet(new long[]{0x0000200040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4125 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4139 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4164 = new BitSet(new long[]{0x0000AE0000000002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4198 = new BitSet(new long[]{0x38A9E00C480121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4283 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4311 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4324 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4345 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4362 = new BitSet(new long[]{0x00008E0000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4397 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5164 = new BitSet(new long[]{0xF8ABA00C480121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5237 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5250 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5271 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5293 = new BitSet(new long[]{0xF8AAA00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5330 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5444 = new BitSet(new long[]{0xF8ACA00C080121F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_50_in_ruleXExpressionInClosure5457 = new BitSet(new long[]{0xF8A8A00C080121F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5615 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXShortClosure5628 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5649 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_ruleXShortClosure5671 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression5790 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5812 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression5915 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5927 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5948 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5960 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5981 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6002 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6118 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6161 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6173 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6197 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression6241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6262 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6274 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6297 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression6309 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6323 = new BitSet(new long[]{0x0440200040000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6344 = new BitSet(new long[]{0x0740200040000010L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6358 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6370 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6391 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6497 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart6511 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6532 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart6546 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression6659 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression6671 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6692 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression6704 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6725 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6737 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression6850 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression6862 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6883 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXWhileExpression6895 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7008 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7029 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7041 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression7053 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7074 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXDoWhileExpression7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7178 = new BitSet(new long[]{0xFAA8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7200 = new BitSet(new long[]{0xFAACA00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression7213 = new BitSet(new long[]{0xFAA8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_57_in_ruleXBlockExpression7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7447 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7478 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7547 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7576 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXVariableDeclaration7590 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7943 = new BitSet(new long[]{0x0000000008002010L,0x000000000000000FL});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7957 = new BitSet(new long[]{0x0000200040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7978 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall7991 = new BitSet(new long[]{0x0000200040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8012 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8026 = new BitSet(new long[]{0x0000000008002010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8051 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8085 = new BitSet(new long[]{0x38A9E00C480121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8170 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8198 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8211 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8232 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8249 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID8322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCallID8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFeatureCallID8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleFeatureCallID8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFeatureCallID8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFeatureCallID8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFeatureCallID8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIdOrSuper8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticQualifier8701 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXConstructorCall8798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8821 = new BitSet(new long[]{0x0000A00008000002L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8842 = new BitSet(new long[]{0x0000200040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8864 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8877 = new BitSet(new long[]{0x0000200040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8898 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8912 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8935 = new BitSet(new long[]{0x38A9E00C480121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9008 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9036 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall9049 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9070 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall9087 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXNullLiteral9346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTypeLiteral9641 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral9653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9676 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral9697 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleXTypeLiteral9710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXThrowExpression9802 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXReturnExpression9915 = new BitSet(new long[]{0x38A8A00C080121F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10039 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10112 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10156 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXCatchClause10270 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause10283 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10304 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCatchClause10316 = new BitSet(new long[]{0x38A8A00C080121F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10432 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleQualifiedName10460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10483 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10620 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10646 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleNumber10666 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10819 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference10855 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets10922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayBrackets10933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleArrayBrackets10971 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleArrayBrackets10984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef11072 = new BitSet(new long[]{0x0000600040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11094 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef11107 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11128 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef11144 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXFunctionTypeRef11158 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11273 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11294 = new BitSet(new long[]{0x0000200040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11316 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_44_in_ruleJvmParameterizedTypeReference11329 = new BitSet(new long[]{0x0000200040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11350 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference11364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmWildcardTypeReference11577 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleJvmUpperBound11711 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBoundAnded11815 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmLowerBound11919 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard11979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard11990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12037 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleQualifiedNameWithWildcard12055 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleQualifiedNameWithWildcard12068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration12205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportDeclaration12215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXImportDeclaration12252 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXImportDeclaration12272 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXImportDeclaration12303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12340 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXImportDeclaration12352 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXImportDeclaration12364 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12394 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration12421 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXImportDeclaration12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXvars711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloXvars1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXvars1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXvars1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalHelloXvars1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXvars1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloXvars2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred8_InternalHelloXvars2459 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred8_InternalHelloXvars2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred9_InternalHelloXvars2546 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred9_InternalHelloXvars2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHelloXvars2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHelloXvars3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalHelloXvars3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred13_InternalHelloXvars3801 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_synpred13_InternalHelloXvars3810 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloXvars3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalHelloXvars3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalHelloXvars3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalHelloXvars3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred15_InternalHelloXvars4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars4232 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred16_InternalHelloXvars4239 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars4246 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalHelloXvars4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred17_InternalHelloXvars4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred18_InternalHelloXvars4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXvars5183 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred20_InternalHelloXvars5190 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXvars5197 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred20_InternalHelloXvars5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred22_InternalHelloXvars5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHelloXvars6136 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred23_InternalHelloXvars6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred24_InternalHelloXvars6218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHelloXvars6225 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred24_InternalHelloXvars6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloXvars7496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHelloXvars7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred26_InternalHelloXvars8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8119 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred27_InternalHelloXvars8126 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8133 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred27_InternalHelloXvars8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred28_InternalHelloXvars8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred29_InternalHelloXvars8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred30_InternalHelloXvars8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXvars8957 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred31_InternalHelloXvars8964 = new BitSet(new long[]{0x0000200040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXvars8971 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred31_InternalHelloXvars8985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred32_InternalHelloXvars9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHelloXvars9929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred34_InternalHelloXvars10074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred35_InternalHelloXvars10104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred37_InternalHelloXvars10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred38_InternalHelloXvars10834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred39_InternalHelloXvars11286 = new BitSet(new long[]{0x0000000000000002L});

}