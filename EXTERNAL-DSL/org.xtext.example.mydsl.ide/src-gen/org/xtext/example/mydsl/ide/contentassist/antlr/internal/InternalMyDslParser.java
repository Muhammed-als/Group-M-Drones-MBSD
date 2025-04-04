package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'Mission'", "'{'", "'droneGroup'", "'='", "'actions'", "'['", "']'", "'}'", "','", "'constraints'", "'DroneGroup'", "'drones'", "'Drone'", "'ip'", "'serialNumber'", "'Action'", "'description'", "'type'", "'Constraint'", "'PermissionConstraint'", "'RegulatoryConstraint'", "'Relation'", "'from'", "'to'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSystemRoot"
    // InternalMyDsl.g:78:1: entryRuleSystemRoot : ruleSystemRoot EOF ;
    public final void entryRuleSystemRoot() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleSystemRoot EOF )
            // InternalMyDsl.g:80:1: ruleSystemRoot EOF
            {
             before(grammarAccess.getSystemRootRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemRoot();

            state._fsp--;

             after(grammarAccess.getSystemRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemRoot"


    // $ANTLR start "ruleSystemRoot"
    // InternalMyDsl.g:87:1: ruleSystemRoot : ( ( rule__SystemRoot__Group__0 ) ) ;
    public final void ruleSystemRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__SystemRoot__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__SystemRoot__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__SystemRoot__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__SystemRoot__Group__0 )
            {
             before(grammarAccess.getSystemRootAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__SystemRoot__Group__0 )
            // InternalMyDsl.g:94:4: rule__SystemRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemRoot"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEntity EOF )
            // InternalMyDsl.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:112:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Entity__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Entity__Alternatives )
            // InternalMyDsl.g:119:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:128:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleMission EOF )
            // InternalMyDsl.g:130:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalMyDsl.g:137:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Mission__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Mission__Group__0 )
            // InternalMyDsl.g:144:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleDroneGroup"
    // InternalMyDsl.g:153:1: entryRuleDroneGroup : ruleDroneGroup EOF ;
    public final void entryRuleDroneGroup() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleDroneGroup EOF )
            // InternalMyDsl.g:155:1: ruleDroneGroup EOF
            {
             before(grammarAccess.getDroneGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleDroneGroup();

            state._fsp--;

             after(grammarAccess.getDroneGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDroneGroup"


    // $ANTLR start "ruleDroneGroup"
    // InternalMyDsl.g:162:1: ruleDroneGroup : ( ( rule__DroneGroup__Group__0 ) ) ;
    public final void ruleDroneGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__DroneGroup__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__DroneGroup__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__DroneGroup__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__DroneGroup__Group__0 )
            {
             before(grammarAccess.getDroneGroupAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__DroneGroup__Group__0 )
            // InternalMyDsl.g:169:4: rule__DroneGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDroneGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDroneGroup"


    // $ANTLR start "entryRuleDrone"
    // InternalMyDsl.g:178:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleDrone EOF )
            // InternalMyDsl.g:180:1: ruleDrone EOF
            {
             before(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getDroneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalMyDsl.g:187:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Drone__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Drone__Group__0 )
            // InternalMyDsl.g:194:4: rule__Drone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:203:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAction EOF )
            // InternalMyDsl.g:205:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:212:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Action__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Action__Group__0 )
            // InternalMyDsl.g:219:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleConstraintClasses"
    // InternalMyDsl.g:228:1: entryRuleConstraintClasses : ruleConstraintClasses EOF ;
    public final void entryRuleConstraintClasses() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleConstraintClasses EOF )
            // InternalMyDsl.g:230:1: ruleConstraintClasses EOF
            {
             before(grammarAccess.getConstraintClassesRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintClasses();

            state._fsp--;

             after(grammarAccess.getConstraintClassesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintClasses"


    // $ANTLR start "ruleConstraintClasses"
    // InternalMyDsl.g:237:1: ruleConstraintClasses : ( ( rule__ConstraintClasses__Alternatives ) ) ;
    public final void ruleConstraintClasses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ConstraintClasses__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ConstraintClasses__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ConstraintClasses__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__ConstraintClasses__Alternatives )
            {
             before(grammarAccess.getConstraintClassesAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__ConstraintClasses__Alternatives )
            // InternalMyDsl.g:244:4: rule__ConstraintClasses__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintClasses__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintClassesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintClasses"


    // $ANTLR start "entryRuleConstraint"
    // InternalMyDsl.g:253:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleConstraint EOF )
            // InternalMyDsl.g:255:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMyDsl.g:262:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Constraint__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Constraint__Group__0 )
            // InternalMyDsl.g:269:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePermissionConstraint"
    // InternalMyDsl.g:278:1: entryRulePermissionConstraint : rulePermissionConstraint EOF ;
    public final void entryRulePermissionConstraint() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( rulePermissionConstraint EOF )
            // InternalMyDsl.g:280:1: rulePermissionConstraint EOF
            {
             before(grammarAccess.getPermissionConstraintRule()); 
            pushFollow(FOLLOW_1);
            rulePermissionConstraint();

            state._fsp--;

             after(grammarAccess.getPermissionConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissionConstraint"


    // $ANTLR start "rulePermissionConstraint"
    // InternalMyDsl.g:287:1: rulePermissionConstraint : ( ( rule__PermissionConstraint__Group__0 ) ) ;
    public final void rulePermissionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__PermissionConstraint__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__PermissionConstraint__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__PermissionConstraint__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__PermissionConstraint__Group__0 )
            {
             before(grammarAccess.getPermissionConstraintAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__PermissionConstraint__Group__0 )
            // InternalMyDsl.g:294:4: rule__PermissionConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissionConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissionConstraint"


    // $ANTLR start "entryRuleRegulatoryConstraint"
    // InternalMyDsl.g:303:1: entryRuleRegulatoryConstraint : ruleRegulatoryConstraint EOF ;
    public final void entryRuleRegulatoryConstraint() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:305:1: ruleRegulatoryConstraint EOF
            {
             before(grammarAccess.getRegulatoryConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleRegulatoryConstraint();

            state._fsp--;

             after(grammarAccess.getRegulatoryConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegulatoryConstraint"


    // $ANTLR start "ruleRegulatoryConstraint"
    // InternalMyDsl.g:312:1: ruleRegulatoryConstraint : ( ( rule__RegulatoryConstraint__Group__0 ) ) ;
    public final void ruleRegulatoryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__RegulatoryConstraint__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__RegulatoryConstraint__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__RegulatoryConstraint__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__RegulatoryConstraint__Group__0 )
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__RegulatoryConstraint__Group__0 )
            // InternalMyDsl.g:319:4: rule__RegulatoryConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegulatoryConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegulatoryConstraint"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:328:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleRelation EOF )
            // InternalMyDsl.g:330:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:337:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Relation__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Relation__Group__0 )
            // InternalMyDsl.g:344:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalMyDsl.g:352:1: rule__Entity__Alternatives : ( ( ruleMission ) | ( ruleDroneGroup ) | ( ruleDrone ) | ( ruleAction ) | ( ruleConstraintClasses ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( ( ruleMission ) | ( ruleDroneGroup ) | ( ruleDrone ) | ( ruleAction ) | ( ruleConstraintClasses ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            case 31:
            case 32:
            case 33:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:357:2: ( ruleMission )
                    {
                    // InternalMyDsl.g:357:2: ( ruleMission )
                    // InternalMyDsl.g:358:3: ruleMission
                    {
                     before(grammarAccess.getEntityAccess().getMissionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMission();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getMissionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:363:2: ( ruleDroneGroup )
                    {
                    // InternalMyDsl.g:363:2: ( ruleDroneGroup )
                    // InternalMyDsl.g:364:3: ruleDroneGroup
                    {
                     before(grammarAccess.getEntityAccess().getDroneGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDroneGroup();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getDroneGroupParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:369:2: ( ruleDrone )
                    {
                    // InternalMyDsl.g:369:2: ( ruleDrone )
                    // InternalMyDsl.g:370:3: ruleDrone
                    {
                     before(grammarAccess.getEntityAccess().getDroneParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDrone();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getDroneParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:375:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:375:2: ( ruleAction )
                    // InternalMyDsl.g:376:3: ruleAction
                    {
                     before(grammarAccess.getEntityAccess().getActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getActionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:381:2: ( ruleConstraintClasses )
                    {
                    // InternalMyDsl.g:381:2: ( ruleConstraintClasses )
                    // InternalMyDsl.g:382:3: ruleConstraintClasses
                    {
                     before(grammarAccess.getEntityAccess().getConstraintClassesParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraintClasses();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getConstraintClassesParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__ConstraintClasses__Alternatives"
    // InternalMyDsl.g:391:1: rule__ConstraintClasses__Alternatives : ( ( ruleConstraint ) | ( rulePermissionConstraint ) | ( ruleRegulatoryConstraint ) );
    public final void rule__ConstraintClasses__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( ( ruleConstraint ) | ( rulePermissionConstraint ) | ( ruleRegulatoryConstraint ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:396:2: ( ruleConstraint )
                    {
                    // InternalMyDsl.g:396:2: ( ruleConstraint )
                    // InternalMyDsl.g:397:3: ruleConstraint
                    {
                     before(grammarAccess.getConstraintClassesAccess().getConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintClassesAccess().getConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:402:2: ( rulePermissionConstraint )
                    {
                    // InternalMyDsl.g:402:2: ( rulePermissionConstraint )
                    // InternalMyDsl.g:403:3: rulePermissionConstraint
                    {
                     before(grammarAccess.getConstraintClassesAccess().getPermissionConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePermissionConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintClassesAccess().getPermissionConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:408:2: ( ruleRegulatoryConstraint )
                    {
                    // InternalMyDsl.g:408:2: ( ruleRegulatoryConstraint )
                    // InternalMyDsl.g:409:3: ruleRegulatoryConstraint
                    {
                     before(grammarAccess.getConstraintClassesAccess().getRegulatoryConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRegulatoryConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintClassesAccess().getRegulatoryConstraintParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintClasses__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:418:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:423:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:430:1: rule__Model__Group__0__Impl : ( ( rule__Model__SystemRootAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( ( rule__Model__SystemRootAssignment_0 ) ) )
            // InternalMyDsl.g:435:1: ( ( rule__Model__SystemRootAssignment_0 ) )
            {
            // InternalMyDsl.g:435:1: ( ( rule__Model__SystemRootAssignment_0 ) )
            // InternalMyDsl.g:436:2: ( rule__Model__SystemRootAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getSystemRootAssignment_0()); 
            // InternalMyDsl.g:437:2: ( rule__Model__SystemRootAssignment_0 )
            // InternalMyDsl.g:437:3: rule__Model__SystemRootAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__SystemRootAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSystemRootAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:445:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:450:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:457:1: rule__Model__Group__1__Impl : ( ( rule__Model__EntitiesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( ( rule__Model__EntitiesAssignment_1 )* ) )
            // InternalMyDsl.g:462:1: ( ( rule__Model__EntitiesAssignment_1 )* )
            {
            // InternalMyDsl.g:462:1: ( ( rule__Model__EntitiesAssignment_1 )* )
            // InternalMyDsl.g:463:2: ( rule__Model__EntitiesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_1()); 
            // InternalMyDsl.g:464:2: ( rule__Model__EntitiesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==23||LA3_0==25||LA3_0==28||(LA3_0>=31 && LA3_0<=33)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:464:3: rule__Model__EntitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__EntitiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDsl.g:472:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__Model__Group__2__Impl )
            // InternalMyDsl.g:477:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDsl.g:483:1: rule__Model__Group__2__Impl : ( ( rule__Model__RelationsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( ( ( rule__Model__RelationsAssignment_2 )* ) )
            // InternalMyDsl.g:488:1: ( ( rule__Model__RelationsAssignment_2 )* )
            {
            // InternalMyDsl.g:488:1: ( ( rule__Model__RelationsAssignment_2 )* )
            // InternalMyDsl.g:489:2: ( rule__Model__RelationsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getRelationsAssignment_2()); 
            // InternalMyDsl.g:490:2: ( rule__Model__RelationsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:490:3: rule__Model__RelationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RelationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRelationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__SystemRoot__Group__0"
    // InternalMyDsl.g:499:1: rule__SystemRoot__Group__0 : rule__SystemRoot__Group__0__Impl rule__SystemRoot__Group__1 ;
    public final void rule__SystemRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__SystemRoot__Group__0__Impl rule__SystemRoot__Group__1 )
            // InternalMyDsl.g:504:2: rule__SystemRoot__Group__0__Impl rule__SystemRoot__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SystemRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__0"


    // $ANTLR start "rule__SystemRoot__Group__0__Impl"
    // InternalMyDsl.g:511:1: rule__SystemRoot__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( 'system' ) )
            // InternalMyDsl.g:516:1: ( 'system' )
            {
            // InternalMyDsl.g:516:1: ( 'system' )
            // InternalMyDsl.g:517:2: 'system'
            {
             before(grammarAccess.getSystemRootAccess().getSystemKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemRootAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__0__Impl"


    // $ANTLR start "rule__SystemRoot__Group__1"
    // InternalMyDsl.g:526:1: rule__SystemRoot__Group__1 : rule__SystemRoot__Group__1__Impl rule__SystemRoot__Group__2 ;
    public final void rule__SystemRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__SystemRoot__Group__1__Impl rule__SystemRoot__Group__2 )
            // InternalMyDsl.g:531:2: rule__SystemRoot__Group__1__Impl rule__SystemRoot__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SystemRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__1"


    // $ANTLR start "rule__SystemRoot__Group__1__Impl"
    // InternalMyDsl.g:538:1: rule__SystemRoot__Group__1__Impl : ( ( rule__SystemRoot__NameAssignment_1 ) ) ;
    public final void rule__SystemRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( ( ( rule__SystemRoot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:543:1: ( ( rule__SystemRoot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:543:1: ( ( rule__SystemRoot__NameAssignment_1 ) )
            // InternalMyDsl.g:544:2: ( rule__SystemRoot__NameAssignment_1 )
            {
             before(grammarAccess.getSystemRootAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:545:2: ( rule__SystemRoot__NameAssignment_1 )
            // InternalMyDsl.g:545:3: rule__SystemRoot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemRoot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemRootAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__1__Impl"


    // $ANTLR start "rule__SystemRoot__Group__2"
    // InternalMyDsl.g:553:1: rule__SystemRoot__Group__2 : rule__SystemRoot__Group__2__Impl rule__SystemRoot__Group__3 ;
    public final void rule__SystemRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__SystemRoot__Group__2__Impl rule__SystemRoot__Group__3 )
            // InternalMyDsl.g:558:2: rule__SystemRoot__Group__2__Impl rule__SystemRoot__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SystemRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__2"


    // $ANTLR start "rule__SystemRoot__Group__2__Impl"
    // InternalMyDsl.g:565:1: rule__SystemRoot__Group__2__Impl : ( ( rule__SystemRoot__EntitiesAssignment_2 )* ) ;
    public final void rule__SystemRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( ( rule__SystemRoot__EntitiesAssignment_2 )* ) )
            // InternalMyDsl.g:570:1: ( ( rule__SystemRoot__EntitiesAssignment_2 )* )
            {
            // InternalMyDsl.g:570:1: ( ( rule__SystemRoot__EntitiesAssignment_2 )* )
            // InternalMyDsl.g:571:2: ( rule__SystemRoot__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getSystemRootAccess().getEntitiesAssignment_2()); 
            // InternalMyDsl.g:572:2: ( rule__SystemRoot__EntitiesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:572:3: rule__SystemRoot__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SystemRoot__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSystemRootAccess().getEntitiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__2__Impl"


    // $ANTLR start "rule__SystemRoot__Group__3"
    // InternalMyDsl.g:580:1: rule__SystemRoot__Group__3 : rule__SystemRoot__Group__3__Impl ;
    public final void rule__SystemRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__SystemRoot__Group__3__Impl )
            // InternalMyDsl.g:585:2: rule__SystemRoot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__3"


    // $ANTLR start "rule__SystemRoot__Group__3__Impl"
    // InternalMyDsl.g:591:1: rule__SystemRoot__Group__3__Impl : ( ( rule__SystemRoot__RelationsAssignment_3 )* ) ;
    public final void rule__SystemRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( ( rule__SystemRoot__RelationsAssignment_3 )* ) )
            // InternalMyDsl.g:596:1: ( ( rule__SystemRoot__RelationsAssignment_3 )* )
            {
            // InternalMyDsl.g:596:1: ( ( rule__SystemRoot__RelationsAssignment_3 )* )
            // InternalMyDsl.g:597:2: ( rule__SystemRoot__RelationsAssignment_3 )*
            {
             before(grammarAccess.getSystemRootAccess().getRelationsAssignment_3()); 
            // InternalMyDsl.g:598:2: ( rule__SystemRoot__RelationsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:598:3: rule__SystemRoot__RelationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SystemRoot__RelationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSystemRootAccess().getRelationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalMyDsl.g:607:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalMyDsl.g:612:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalMyDsl.g:619:1: rule__Mission__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( 'Mission' ) )
            // InternalMyDsl.g:624:1: ( 'Mission' )
            {
            // InternalMyDsl.g:624:1: ( 'Mission' )
            // InternalMyDsl.g:625:2: 'Mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalMyDsl.g:634:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalMyDsl.g:639:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalMyDsl.g:646:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__NameAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ( rule__Mission__NameAssignment_1 ) ) )
            // InternalMyDsl.g:651:1: ( ( rule__Mission__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:651:1: ( ( rule__Mission__NameAssignment_1 ) )
            // InternalMyDsl.g:652:2: ( rule__Mission__NameAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:653:2: ( rule__Mission__NameAssignment_1 )
            // InternalMyDsl.g:653:3: rule__Mission__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalMyDsl.g:661:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalMyDsl.g:666:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalMyDsl.g:673:1: rule__Mission__Group__2__Impl : ( '{' ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( '{' ) )
            // InternalMyDsl.g:678:1: ( '{' )
            {
            // InternalMyDsl.g:678:1: ( '{' )
            // InternalMyDsl.g:679:2: '{'
            {
             before(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalMyDsl.g:688:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalMyDsl.g:693:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Mission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalMyDsl.g:700:1: rule__Mission__Group__3__Impl : ( 'droneGroup' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( ( 'droneGroup' ) )
            // InternalMyDsl.g:705:1: ( 'droneGroup' )
            {
            // InternalMyDsl.g:705:1: ( 'droneGroup' )
            // InternalMyDsl.g:706:2: 'droneGroup'
            {
             before(grammarAccess.getMissionAccess().getDroneGroupKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getDroneGroupKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__4"
    // InternalMyDsl.g:715:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalMyDsl.g:720:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Mission__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4"


    // $ANTLR start "rule__Mission__Group__4__Impl"
    // InternalMyDsl.g:727:1: rule__Mission__Group__4__Impl : ( '=' ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( '=' ) )
            // InternalMyDsl.g:732:1: ( '=' )
            {
            // InternalMyDsl.g:732:1: ( '=' )
            // InternalMyDsl.g:733:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4__Impl"


    // $ANTLR start "rule__Mission__Group__5"
    // InternalMyDsl.g:742:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalMyDsl.g:747:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5"


    // $ANTLR start "rule__Mission__Group__5__Impl"
    // InternalMyDsl.g:754:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__DroneGroupAssignment_5 ) ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( ( ( rule__Mission__DroneGroupAssignment_5 ) ) )
            // InternalMyDsl.g:759:1: ( ( rule__Mission__DroneGroupAssignment_5 ) )
            {
            // InternalMyDsl.g:759:1: ( ( rule__Mission__DroneGroupAssignment_5 ) )
            // InternalMyDsl.g:760:2: ( rule__Mission__DroneGroupAssignment_5 )
            {
             before(grammarAccess.getMissionAccess().getDroneGroupAssignment_5()); 
            // InternalMyDsl.g:761:2: ( rule__Mission__DroneGroupAssignment_5 )
            // InternalMyDsl.g:761:3: rule__Mission__DroneGroupAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mission__DroneGroupAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getDroneGroupAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5__Impl"


    // $ANTLR start "rule__Mission__Group__6"
    // InternalMyDsl.g:769:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalMyDsl.g:774:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Mission__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6"


    // $ANTLR start "rule__Mission__Group__6__Impl"
    // InternalMyDsl.g:781:1: rule__Mission__Group__6__Impl : ( 'actions' ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( ( 'actions' ) )
            // InternalMyDsl.g:786:1: ( 'actions' )
            {
            // InternalMyDsl.g:786:1: ( 'actions' )
            // InternalMyDsl.g:787:2: 'actions'
            {
             before(grammarAccess.getMissionAccess().getActionsKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getActionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6__Impl"


    // $ANTLR start "rule__Mission__Group__7"
    // InternalMyDsl.g:796:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalMyDsl.g:801:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Mission__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__7"


    // $ANTLR start "rule__Mission__Group__7__Impl"
    // InternalMyDsl.g:808:1: rule__Mission__Group__7__Impl : ( '=' ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( '=' ) )
            // InternalMyDsl.g:813:1: ( '=' )
            {
            // InternalMyDsl.g:813:1: ( '=' )
            // InternalMyDsl.g:814:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__7__Impl"


    // $ANTLR start "rule__Mission__Group__8"
    // InternalMyDsl.g:823:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl rule__Mission__Group__9 ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Mission__Group__8__Impl rule__Mission__Group__9 )
            // InternalMyDsl.g:828:2: rule__Mission__Group__8__Impl rule__Mission__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Mission__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__8"


    // $ANTLR start "rule__Mission__Group__8__Impl"
    // InternalMyDsl.g:835:1: rule__Mission__Group__8__Impl : ( '[' ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( '[' ) )
            // InternalMyDsl.g:840:1: ( '[' )
            {
            // InternalMyDsl.g:840:1: ( '[' )
            // InternalMyDsl.g:841:2: '['
            {
             before(grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__8__Impl"


    // $ANTLR start "rule__Mission__Group__9"
    // InternalMyDsl.g:850:1: rule__Mission__Group__9 : rule__Mission__Group__9__Impl rule__Mission__Group__10 ;
    public final void rule__Mission__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Mission__Group__9__Impl rule__Mission__Group__10 )
            // InternalMyDsl.g:855:2: rule__Mission__Group__9__Impl rule__Mission__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Mission__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__9"


    // $ANTLR start "rule__Mission__Group__9__Impl"
    // InternalMyDsl.g:862:1: rule__Mission__Group__9__Impl : ( ( rule__Mission__ActionsAssignment_9 ) ) ;
    public final void rule__Mission__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( ( rule__Mission__ActionsAssignment_9 ) ) )
            // InternalMyDsl.g:867:1: ( ( rule__Mission__ActionsAssignment_9 ) )
            {
            // InternalMyDsl.g:867:1: ( ( rule__Mission__ActionsAssignment_9 ) )
            // InternalMyDsl.g:868:2: ( rule__Mission__ActionsAssignment_9 )
            {
             before(grammarAccess.getMissionAccess().getActionsAssignment_9()); 
            // InternalMyDsl.g:869:2: ( rule__Mission__ActionsAssignment_9 )
            // InternalMyDsl.g:869:3: rule__Mission__ActionsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ActionsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getActionsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__9__Impl"


    // $ANTLR start "rule__Mission__Group__10"
    // InternalMyDsl.g:877:1: rule__Mission__Group__10 : rule__Mission__Group__10__Impl rule__Mission__Group__11 ;
    public final void rule__Mission__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__Mission__Group__10__Impl rule__Mission__Group__11 )
            // InternalMyDsl.g:882:2: rule__Mission__Group__10__Impl rule__Mission__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Mission__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__10"


    // $ANTLR start "rule__Mission__Group__10__Impl"
    // InternalMyDsl.g:889:1: rule__Mission__Group__10__Impl : ( ( rule__Mission__Group_10__0 )* ) ;
    public final void rule__Mission__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( ( rule__Mission__Group_10__0 )* ) )
            // InternalMyDsl.g:894:1: ( ( rule__Mission__Group_10__0 )* )
            {
            // InternalMyDsl.g:894:1: ( ( rule__Mission__Group_10__0 )* )
            // InternalMyDsl.g:895:2: ( rule__Mission__Group_10__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_10()); 
            // InternalMyDsl.g:896:2: ( rule__Mission__Group_10__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:896:3: rule__Mission__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Mission__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__10__Impl"


    // $ANTLR start "rule__Mission__Group__11"
    // InternalMyDsl.g:904:1: rule__Mission__Group__11 : rule__Mission__Group__11__Impl rule__Mission__Group__12 ;
    public final void rule__Mission__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__Mission__Group__11__Impl rule__Mission__Group__12 )
            // InternalMyDsl.g:909:2: rule__Mission__Group__11__Impl rule__Mission__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Mission__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__11"


    // $ANTLR start "rule__Mission__Group__11__Impl"
    // InternalMyDsl.g:916:1: rule__Mission__Group__11__Impl : ( ']' ) ;
    public final void rule__Mission__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ']' ) )
            // InternalMyDsl.g:921:1: ( ']' )
            {
            // InternalMyDsl.g:921:1: ( ']' )
            // InternalMyDsl.g:922:2: ']'
            {
             before(grammarAccess.getMissionAccess().getRightSquareBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getRightSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__11__Impl"


    // $ANTLR start "rule__Mission__Group__12"
    // InternalMyDsl.g:931:1: rule__Mission__Group__12 : rule__Mission__Group__12__Impl rule__Mission__Group__13 ;
    public final void rule__Mission__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__Mission__Group__12__Impl rule__Mission__Group__13 )
            // InternalMyDsl.g:936:2: rule__Mission__Group__12__Impl rule__Mission__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Mission__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__12"


    // $ANTLR start "rule__Mission__Group__12__Impl"
    // InternalMyDsl.g:943:1: rule__Mission__Group__12__Impl : ( ( rule__Mission__Group_12__0 )? ) ;
    public final void rule__Mission__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( ( rule__Mission__Group_12__0 )? ) )
            // InternalMyDsl.g:948:1: ( ( rule__Mission__Group_12__0 )? )
            {
            // InternalMyDsl.g:948:1: ( ( rule__Mission__Group_12__0 )? )
            // InternalMyDsl.g:949:2: ( rule__Mission__Group_12__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_12()); 
            // InternalMyDsl.g:950:2: ( rule__Mission__Group_12__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:950:3: rule__Mission__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__12__Impl"


    // $ANTLR start "rule__Mission__Group__13"
    // InternalMyDsl.g:958:1: rule__Mission__Group__13 : rule__Mission__Group__13__Impl ;
    public final void rule__Mission__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( rule__Mission__Group__13__Impl )
            // InternalMyDsl.g:963:2: rule__Mission__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__13"


    // $ANTLR start "rule__Mission__Group__13__Impl"
    // InternalMyDsl.g:969:1: rule__Mission__Group__13__Impl : ( '}' ) ;
    public final void rule__Mission__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( '}' ) )
            // InternalMyDsl.g:974:1: ( '}' )
            {
            // InternalMyDsl.g:974:1: ( '}' )
            // InternalMyDsl.g:975:2: '}'
            {
             before(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__13__Impl"


    // $ANTLR start "rule__Mission__Group_10__0"
    // InternalMyDsl.g:985:1: rule__Mission__Group_10__0 : rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 ;
    public final void rule__Mission__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 )
            // InternalMyDsl.g:990:2: rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1
            {
            pushFollow(FOLLOW_6);
            rule__Mission__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_10__0"


    // $ANTLR start "rule__Mission__Group_10__0__Impl"
    // InternalMyDsl.g:997:1: rule__Mission__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( ( ',' ) )
            // InternalMyDsl.g:1002:1: ( ',' )
            {
            // InternalMyDsl.g:1002:1: ( ',' )
            // InternalMyDsl.g:1003:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_10_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_10__0__Impl"


    // $ANTLR start "rule__Mission__Group_10__1"
    // InternalMyDsl.g:1012:1: rule__Mission__Group_10__1 : rule__Mission__Group_10__1__Impl ;
    public final void rule__Mission__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__Mission__Group_10__1__Impl )
            // InternalMyDsl.g:1017:2: rule__Mission__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_10__1"


    // $ANTLR start "rule__Mission__Group_10__1__Impl"
    // InternalMyDsl.g:1023:1: rule__Mission__Group_10__1__Impl : ( ( rule__Mission__ActionsAssignment_10_1 ) ) ;
    public final void rule__Mission__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( ( ( rule__Mission__ActionsAssignment_10_1 ) ) )
            // InternalMyDsl.g:1028:1: ( ( rule__Mission__ActionsAssignment_10_1 ) )
            {
            // InternalMyDsl.g:1028:1: ( ( rule__Mission__ActionsAssignment_10_1 ) )
            // InternalMyDsl.g:1029:2: ( rule__Mission__ActionsAssignment_10_1 )
            {
             before(grammarAccess.getMissionAccess().getActionsAssignment_10_1()); 
            // InternalMyDsl.g:1030:2: ( rule__Mission__ActionsAssignment_10_1 )
            // InternalMyDsl.g:1030:3: rule__Mission__ActionsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ActionsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getActionsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_10__1__Impl"


    // $ANTLR start "rule__Mission__Group_12__0"
    // InternalMyDsl.g:1039:1: rule__Mission__Group_12__0 : rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1 ;
    public final void rule__Mission__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1 )
            // InternalMyDsl.g:1044:2: rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1
            {
            pushFollow(FOLLOW_9);
            rule__Mission__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__0"


    // $ANTLR start "rule__Mission__Group_12__0__Impl"
    // InternalMyDsl.g:1051:1: rule__Mission__Group_12__0__Impl : ( 'constraints' ) ;
    public final void rule__Mission__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( 'constraints' ) )
            // InternalMyDsl.g:1056:1: ( 'constraints' )
            {
            // InternalMyDsl.g:1056:1: ( 'constraints' )
            // InternalMyDsl.g:1057:2: 'constraints'
            {
             before(grammarAccess.getMissionAccess().getConstraintsKeyword_12_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getConstraintsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__0__Impl"


    // $ANTLR start "rule__Mission__Group_12__1"
    // InternalMyDsl.g:1066:1: rule__Mission__Group_12__1 : rule__Mission__Group_12__1__Impl rule__Mission__Group_12__2 ;
    public final void rule__Mission__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__Mission__Group_12__1__Impl rule__Mission__Group_12__2 )
            // InternalMyDsl.g:1071:2: rule__Mission__Group_12__1__Impl rule__Mission__Group_12__2
            {
            pushFollow(FOLLOW_11);
            rule__Mission__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__1"


    // $ANTLR start "rule__Mission__Group_12__1__Impl"
    // InternalMyDsl.g:1078:1: rule__Mission__Group_12__1__Impl : ( '=' ) ;
    public final void rule__Mission__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( '=' ) )
            // InternalMyDsl.g:1083:1: ( '=' )
            {
            // InternalMyDsl.g:1083:1: ( '=' )
            // InternalMyDsl.g:1084:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_12_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__1__Impl"


    // $ANTLR start "rule__Mission__Group_12__2"
    // InternalMyDsl.g:1093:1: rule__Mission__Group_12__2 : rule__Mission__Group_12__2__Impl rule__Mission__Group_12__3 ;
    public final void rule__Mission__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( rule__Mission__Group_12__2__Impl rule__Mission__Group_12__3 )
            // InternalMyDsl.g:1098:2: rule__Mission__Group_12__2__Impl rule__Mission__Group_12__3
            {
            pushFollow(FOLLOW_15);
            rule__Mission__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__2"


    // $ANTLR start "rule__Mission__Group_12__2__Impl"
    // InternalMyDsl.g:1105:1: rule__Mission__Group_12__2__Impl : ( '[' ) ;
    public final void rule__Mission__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( ( '[' ) )
            // InternalMyDsl.g:1110:1: ( '[' )
            {
            // InternalMyDsl.g:1110:1: ( '[' )
            // InternalMyDsl.g:1111:2: '['
            {
             before(grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_12_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__2__Impl"


    // $ANTLR start "rule__Mission__Group_12__3"
    // InternalMyDsl.g:1120:1: rule__Mission__Group_12__3 : rule__Mission__Group_12__3__Impl rule__Mission__Group_12__4 ;
    public final void rule__Mission__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( rule__Mission__Group_12__3__Impl rule__Mission__Group_12__4 )
            // InternalMyDsl.g:1125:2: rule__Mission__Group_12__3__Impl rule__Mission__Group_12__4
            {
            pushFollow(FOLLOW_15);
            rule__Mission__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__3"


    // $ANTLR start "rule__Mission__Group_12__3__Impl"
    // InternalMyDsl.g:1132:1: rule__Mission__Group_12__3__Impl : ( ( rule__Mission__Group_12_3__0 )? ) ;
    public final void rule__Mission__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ( rule__Mission__Group_12_3__0 )? ) )
            // InternalMyDsl.g:1137:1: ( ( rule__Mission__Group_12_3__0 )? )
            {
            // InternalMyDsl.g:1137:1: ( ( rule__Mission__Group_12_3__0 )? )
            // InternalMyDsl.g:1138:2: ( rule__Mission__Group_12_3__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_12_3()); 
            // InternalMyDsl.g:1139:2: ( rule__Mission__Group_12_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1139:3: rule__Mission__Group_12_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_12_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__3__Impl"


    // $ANTLR start "rule__Mission__Group_12__4"
    // InternalMyDsl.g:1147:1: rule__Mission__Group_12__4 : rule__Mission__Group_12__4__Impl ;
    public final void rule__Mission__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( rule__Mission__Group_12__4__Impl )
            // InternalMyDsl.g:1152:2: rule__Mission__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__4"


    // $ANTLR start "rule__Mission__Group_12__4__Impl"
    // InternalMyDsl.g:1158:1: rule__Mission__Group_12__4__Impl : ( ']' ) ;
    public final void rule__Mission__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ']' ) )
            // InternalMyDsl.g:1163:1: ( ']' )
            {
            // InternalMyDsl.g:1163:1: ( ']' )
            // InternalMyDsl.g:1164:2: ']'
            {
             before(grammarAccess.getMissionAccess().getRightSquareBracketKeyword_12_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getRightSquareBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12__4__Impl"


    // $ANTLR start "rule__Mission__Group_12_3__0"
    // InternalMyDsl.g:1174:1: rule__Mission__Group_12_3__0 : rule__Mission__Group_12_3__0__Impl rule__Mission__Group_12_3__1 ;
    public final void rule__Mission__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__Mission__Group_12_3__0__Impl rule__Mission__Group_12_3__1 )
            // InternalMyDsl.g:1179:2: rule__Mission__Group_12_3__0__Impl rule__Mission__Group_12_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Mission__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12_3__0"


    // $ANTLR start "rule__Mission__Group_12_3__0__Impl"
    // InternalMyDsl.g:1186:1: rule__Mission__Group_12_3__0__Impl : ( ( rule__Mission__ConstraintsAssignment_12_3_0 ) ) ;
    public final void rule__Mission__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( ( rule__Mission__ConstraintsAssignment_12_3_0 ) ) )
            // InternalMyDsl.g:1191:1: ( ( rule__Mission__ConstraintsAssignment_12_3_0 ) )
            {
            // InternalMyDsl.g:1191:1: ( ( rule__Mission__ConstraintsAssignment_12_3_0 ) )
            // InternalMyDsl.g:1192:2: ( rule__Mission__ConstraintsAssignment_12_3_0 )
            {
             before(grammarAccess.getMissionAccess().getConstraintsAssignment_12_3_0()); 
            // InternalMyDsl.g:1193:2: ( rule__Mission__ConstraintsAssignment_12_3_0 )
            // InternalMyDsl.g:1193:3: rule__Mission__ConstraintsAssignment_12_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ConstraintsAssignment_12_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getConstraintsAssignment_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12_3__0__Impl"


    // $ANTLR start "rule__Mission__Group_12_3__1"
    // InternalMyDsl.g:1201:1: rule__Mission__Group_12_3__1 : rule__Mission__Group_12_3__1__Impl ;
    public final void rule__Mission__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__Mission__Group_12_3__1__Impl )
            // InternalMyDsl.g:1206:2: rule__Mission__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12_3__1"


    // $ANTLR start "rule__Mission__Group_12_3__1__Impl"
    // InternalMyDsl.g:1212:1: rule__Mission__Group_12_3__1__Impl : ( ( rule__Mission__Group_12_3_1__0 )* ) ;
    public final void rule__Mission__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( ( rule__Mission__Group_12_3_1__0 )* ) )
            // InternalMyDsl.g:1217:1: ( ( rule__Mission__Group_12_3_1__0 )* )
            {
            // InternalMyDsl.g:1217:1: ( ( rule__Mission__Group_12_3_1__0 )* )
            // InternalMyDsl.g:1218:2: ( rule__Mission__Group_12_3_1__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_12_3_1()); 
            // InternalMyDsl.g:1219:2: ( rule__Mission__Group_12_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1219:3: rule__Mission__Group_12_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Mission__Group_12_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12_3__1__Impl"


    // $ANTLR start "rule__Mission__Group_12_3_1__0"
    // InternalMyDsl.g:1228:1: rule__Mission__Group_12_3_1__0 : rule__Mission__Group_12_3_1__0__Impl rule__Mission__Group_12_3_1__1 ;
    public final void rule__Mission__Group_12_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( rule__Mission__Group_12_3_1__0__Impl rule__Mission__Group_12_3_1__1 )
            // InternalMyDsl.g:1233:2: rule__Mission__Group_12_3_1__0__Impl rule__Mission__Group_12_3_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Mission__Group_12_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_12_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12_3_1__0"


    // $ANTLR start "rule__Mission__Group_12_3_1__0__Impl"
    // InternalMyDsl.g:1240:1: rule__Mission__Group_12_3_1__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_12_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( ( ',' ) )
            // InternalMyDsl.g:1245:1: ( ',' )
            {
            // InternalMyDsl.g:1245:1: ( ',' )
            // InternalMyDsl.g:1246:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_12_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12_3_1__0__Impl"


    // $ANTLR start "rule__Mission__Group_12_3_1__1"
    // InternalMyDsl.g:1255:1: rule__Mission__Group_12_3_1__1 : rule__Mission__Group_12_3_1__1__Impl ;
    public final void rule__Mission__Group_12_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( rule__Mission__Group_12_3_1__1__Impl )
            // InternalMyDsl.g:1260:2: rule__Mission__Group_12_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_12_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12_3_1__1"


    // $ANTLR start "rule__Mission__Group_12_3_1__1__Impl"
    // InternalMyDsl.g:1266:1: rule__Mission__Group_12_3_1__1__Impl : ( ( rule__Mission__ConstraintsAssignment_12_3_1_1 ) ) ;
    public final void rule__Mission__Group_12_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ( rule__Mission__ConstraintsAssignment_12_3_1_1 ) ) )
            // InternalMyDsl.g:1271:1: ( ( rule__Mission__ConstraintsAssignment_12_3_1_1 ) )
            {
            // InternalMyDsl.g:1271:1: ( ( rule__Mission__ConstraintsAssignment_12_3_1_1 ) )
            // InternalMyDsl.g:1272:2: ( rule__Mission__ConstraintsAssignment_12_3_1_1 )
            {
             before(grammarAccess.getMissionAccess().getConstraintsAssignment_12_3_1_1()); 
            // InternalMyDsl.g:1273:2: ( rule__Mission__ConstraintsAssignment_12_3_1_1 )
            // InternalMyDsl.g:1273:3: rule__Mission__ConstraintsAssignment_12_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ConstraintsAssignment_12_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getConstraintsAssignment_12_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_12_3_1__1__Impl"


    // $ANTLR start "rule__DroneGroup__Group__0"
    // InternalMyDsl.g:1282:1: rule__DroneGroup__Group__0 : rule__DroneGroup__Group__0__Impl rule__DroneGroup__Group__1 ;
    public final void rule__DroneGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( rule__DroneGroup__Group__0__Impl rule__DroneGroup__Group__1 )
            // InternalMyDsl.g:1287:2: rule__DroneGroup__Group__0__Impl rule__DroneGroup__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DroneGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__0"


    // $ANTLR start "rule__DroneGroup__Group__0__Impl"
    // InternalMyDsl.g:1294:1: rule__DroneGroup__Group__0__Impl : ( 'DroneGroup' ) ;
    public final void rule__DroneGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( 'DroneGroup' ) )
            // InternalMyDsl.g:1299:1: ( 'DroneGroup' )
            {
            // InternalMyDsl.g:1299:1: ( 'DroneGroup' )
            // InternalMyDsl.g:1300:2: 'DroneGroup'
            {
             before(grammarAccess.getDroneGroupAccess().getDroneGroupKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getDroneGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__0__Impl"


    // $ANTLR start "rule__DroneGroup__Group__1"
    // InternalMyDsl.g:1309:1: rule__DroneGroup__Group__1 : rule__DroneGroup__Group__1__Impl rule__DroneGroup__Group__2 ;
    public final void rule__DroneGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__DroneGroup__Group__1__Impl rule__DroneGroup__Group__2 )
            // InternalMyDsl.g:1314:2: rule__DroneGroup__Group__1__Impl rule__DroneGroup__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DroneGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__1"


    // $ANTLR start "rule__DroneGroup__Group__1__Impl"
    // InternalMyDsl.g:1321:1: rule__DroneGroup__Group__1__Impl : ( ( rule__DroneGroup__NameAssignment_1 ) ) ;
    public final void rule__DroneGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( ( rule__DroneGroup__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1326:1: ( ( rule__DroneGroup__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1326:1: ( ( rule__DroneGroup__NameAssignment_1 ) )
            // InternalMyDsl.g:1327:2: ( rule__DroneGroup__NameAssignment_1 )
            {
             before(grammarAccess.getDroneGroupAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1328:2: ( rule__DroneGroup__NameAssignment_1 )
            // InternalMyDsl.g:1328:3: rule__DroneGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DroneGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDroneGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__1__Impl"


    // $ANTLR start "rule__DroneGroup__Group__2"
    // InternalMyDsl.g:1336:1: rule__DroneGroup__Group__2 : rule__DroneGroup__Group__2__Impl rule__DroneGroup__Group__3 ;
    public final void rule__DroneGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__DroneGroup__Group__2__Impl rule__DroneGroup__Group__3 )
            // InternalMyDsl.g:1341:2: rule__DroneGroup__Group__2__Impl rule__DroneGroup__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__DroneGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__2"


    // $ANTLR start "rule__DroneGroup__Group__2__Impl"
    // InternalMyDsl.g:1348:1: rule__DroneGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__DroneGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( '{' ) )
            // InternalMyDsl.g:1353:1: ( '{' )
            {
            // InternalMyDsl.g:1353:1: ( '{' )
            // InternalMyDsl.g:1354:2: '{'
            {
             before(grammarAccess.getDroneGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__2__Impl"


    // $ANTLR start "rule__DroneGroup__Group__3"
    // InternalMyDsl.g:1363:1: rule__DroneGroup__Group__3 : rule__DroneGroup__Group__3__Impl rule__DroneGroup__Group__4 ;
    public final void rule__DroneGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__DroneGroup__Group__3__Impl rule__DroneGroup__Group__4 )
            // InternalMyDsl.g:1368:2: rule__DroneGroup__Group__3__Impl rule__DroneGroup__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DroneGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__3"


    // $ANTLR start "rule__DroneGroup__Group__3__Impl"
    // InternalMyDsl.g:1375:1: rule__DroneGroup__Group__3__Impl : ( 'drones' ) ;
    public final void rule__DroneGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( 'drones' ) )
            // InternalMyDsl.g:1380:1: ( 'drones' )
            {
            // InternalMyDsl.g:1380:1: ( 'drones' )
            // InternalMyDsl.g:1381:2: 'drones'
            {
             before(grammarAccess.getDroneGroupAccess().getDronesKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getDronesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__3__Impl"


    // $ANTLR start "rule__DroneGroup__Group__4"
    // InternalMyDsl.g:1390:1: rule__DroneGroup__Group__4 : rule__DroneGroup__Group__4__Impl rule__DroneGroup__Group__5 ;
    public final void rule__DroneGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( rule__DroneGroup__Group__4__Impl rule__DroneGroup__Group__5 )
            // InternalMyDsl.g:1395:2: rule__DroneGroup__Group__4__Impl rule__DroneGroup__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__DroneGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__4"


    // $ANTLR start "rule__DroneGroup__Group__4__Impl"
    // InternalMyDsl.g:1402:1: rule__DroneGroup__Group__4__Impl : ( '=' ) ;
    public final void rule__DroneGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( ( '=' ) )
            // InternalMyDsl.g:1407:1: ( '=' )
            {
            // InternalMyDsl.g:1407:1: ( '=' )
            // InternalMyDsl.g:1408:2: '='
            {
             before(grammarAccess.getDroneGroupAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__4__Impl"


    // $ANTLR start "rule__DroneGroup__Group__5"
    // InternalMyDsl.g:1417:1: rule__DroneGroup__Group__5 : rule__DroneGroup__Group__5__Impl rule__DroneGroup__Group__6 ;
    public final void rule__DroneGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( rule__DroneGroup__Group__5__Impl rule__DroneGroup__Group__6 )
            // InternalMyDsl.g:1422:2: rule__DroneGroup__Group__5__Impl rule__DroneGroup__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__DroneGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__5"


    // $ANTLR start "rule__DroneGroup__Group__5__Impl"
    // InternalMyDsl.g:1429:1: rule__DroneGroup__Group__5__Impl : ( '[' ) ;
    public final void rule__DroneGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( ( '[' ) )
            // InternalMyDsl.g:1434:1: ( '[' )
            {
            // InternalMyDsl.g:1434:1: ( '[' )
            // InternalMyDsl.g:1435:2: '['
            {
             before(grammarAccess.getDroneGroupAccess().getLeftSquareBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__5__Impl"


    // $ANTLR start "rule__DroneGroup__Group__6"
    // InternalMyDsl.g:1444:1: rule__DroneGroup__Group__6 : rule__DroneGroup__Group__6__Impl rule__DroneGroup__Group__7 ;
    public final void rule__DroneGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( rule__DroneGroup__Group__6__Impl rule__DroneGroup__Group__7 )
            // InternalMyDsl.g:1449:2: rule__DroneGroup__Group__6__Impl rule__DroneGroup__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__DroneGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__6"


    // $ANTLR start "rule__DroneGroup__Group__6__Impl"
    // InternalMyDsl.g:1456:1: rule__DroneGroup__Group__6__Impl : ( ( rule__DroneGroup__DronesAssignment_6 ) ) ;
    public final void rule__DroneGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( ( rule__DroneGroup__DronesAssignment_6 ) ) )
            // InternalMyDsl.g:1461:1: ( ( rule__DroneGroup__DronesAssignment_6 ) )
            {
            // InternalMyDsl.g:1461:1: ( ( rule__DroneGroup__DronesAssignment_6 ) )
            // InternalMyDsl.g:1462:2: ( rule__DroneGroup__DronesAssignment_6 )
            {
             before(grammarAccess.getDroneGroupAccess().getDronesAssignment_6()); 
            // InternalMyDsl.g:1463:2: ( rule__DroneGroup__DronesAssignment_6 )
            // InternalMyDsl.g:1463:3: rule__DroneGroup__DronesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DroneGroup__DronesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDroneGroupAccess().getDronesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__6__Impl"


    // $ANTLR start "rule__DroneGroup__Group__7"
    // InternalMyDsl.g:1471:1: rule__DroneGroup__Group__7 : rule__DroneGroup__Group__7__Impl rule__DroneGroup__Group__8 ;
    public final void rule__DroneGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( rule__DroneGroup__Group__7__Impl rule__DroneGroup__Group__8 )
            // InternalMyDsl.g:1476:2: rule__DroneGroup__Group__7__Impl rule__DroneGroup__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__DroneGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__7"


    // $ANTLR start "rule__DroneGroup__Group__7__Impl"
    // InternalMyDsl.g:1483:1: rule__DroneGroup__Group__7__Impl : ( ( rule__DroneGroup__Group_7__0 )* ) ;
    public final void rule__DroneGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( ( rule__DroneGroup__Group_7__0 )* ) )
            // InternalMyDsl.g:1488:1: ( ( rule__DroneGroup__Group_7__0 )* )
            {
            // InternalMyDsl.g:1488:1: ( ( rule__DroneGroup__Group_7__0 )* )
            // InternalMyDsl.g:1489:2: ( rule__DroneGroup__Group_7__0 )*
            {
             before(grammarAccess.getDroneGroupAccess().getGroup_7()); 
            // InternalMyDsl.g:1490:2: ( rule__DroneGroup__Group_7__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1490:3: rule__DroneGroup__Group_7__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DroneGroup__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDroneGroupAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__7__Impl"


    // $ANTLR start "rule__DroneGroup__Group__8"
    // InternalMyDsl.g:1498:1: rule__DroneGroup__Group__8 : rule__DroneGroup__Group__8__Impl rule__DroneGroup__Group__9 ;
    public final void rule__DroneGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( rule__DroneGroup__Group__8__Impl rule__DroneGroup__Group__9 )
            // InternalMyDsl.g:1503:2: rule__DroneGroup__Group__8__Impl rule__DroneGroup__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__DroneGroup__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__8"


    // $ANTLR start "rule__DroneGroup__Group__8__Impl"
    // InternalMyDsl.g:1510:1: rule__DroneGroup__Group__8__Impl : ( ']' ) ;
    public final void rule__DroneGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ']' ) )
            // InternalMyDsl.g:1515:1: ( ']' )
            {
            // InternalMyDsl.g:1515:1: ( ']' )
            // InternalMyDsl.g:1516:2: ']'
            {
             before(grammarAccess.getDroneGroupAccess().getRightSquareBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__8__Impl"


    // $ANTLR start "rule__DroneGroup__Group__9"
    // InternalMyDsl.g:1525:1: rule__DroneGroup__Group__9 : rule__DroneGroup__Group__9__Impl ;
    public final void rule__DroneGroup__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( rule__DroneGroup__Group__9__Impl )
            // InternalMyDsl.g:1530:2: rule__DroneGroup__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__9"


    // $ANTLR start "rule__DroneGroup__Group__9__Impl"
    // InternalMyDsl.g:1536:1: rule__DroneGroup__Group__9__Impl : ( '}' ) ;
    public final void rule__DroneGroup__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( ( '}' ) )
            // InternalMyDsl.g:1541:1: ( '}' )
            {
            // InternalMyDsl.g:1541:1: ( '}' )
            // InternalMyDsl.g:1542:2: '}'
            {
             before(grammarAccess.getDroneGroupAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group__9__Impl"


    // $ANTLR start "rule__DroneGroup__Group_7__0"
    // InternalMyDsl.g:1552:1: rule__DroneGroup__Group_7__0 : rule__DroneGroup__Group_7__0__Impl rule__DroneGroup__Group_7__1 ;
    public final void rule__DroneGroup__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( rule__DroneGroup__Group_7__0__Impl rule__DroneGroup__Group_7__1 )
            // InternalMyDsl.g:1557:2: rule__DroneGroup__Group_7__0__Impl rule__DroneGroup__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__DroneGroup__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group_7__0"


    // $ANTLR start "rule__DroneGroup__Group_7__0__Impl"
    // InternalMyDsl.g:1564:1: rule__DroneGroup__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DroneGroup__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( ( ',' ) )
            // InternalMyDsl.g:1569:1: ( ',' )
            {
            // InternalMyDsl.g:1569:1: ( ',' )
            // InternalMyDsl.g:1570:2: ','
            {
             before(grammarAccess.getDroneGroupAccess().getCommaKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group_7__0__Impl"


    // $ANTLR start "rule__DroneGroup__Group_7__1"
    // InternalMyDsl.g:1579:1: rule__DroneGroup__Group_7__1 : rule__DroneGroup__Group_7__1__Impl ;
    public final void rule__DroneGroup__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( rule__DroneGroup__Group_7__1__Impl )
            // InternalMyDsl.g:1584:2: rule__DroneGroup__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DroneGroup__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group_7__1"


    // $ANTLR start "rule__DroneGroup__Group_7__1__Impl"
    // InternalMyDsl.g:1590:1: rule__DroneGroup__Group_7__1__Impl : ( ( rule__DroneGroup__DronesAssignment_7_1 ) ) ;
    public final void rule__DroneGroup__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( ( ( rule__DroneGroup__DronesAssignment_7_1 ) ) )
            // InternalMyDsl.g:1595:1: ( ( rule__DroneGroup__DronesAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1595:1: ( ( rule__DroneGroup__DronesAssignment_7_1 ) )
            // InternalMyDsl.g:1596:2: ( rule__DroneGroup__DronesAssignment_7_1 )
            {
             before(grammarAccess.getDroneGroupAccess().getDronesAssignment_7_1()); 
            // InternalMyDsl.g:1597:2: ( rule__DroneGroup__DronesAssignment_7_1 )
            // InternalMyDsl.g:1597:3: rule__DroneGroup__DronesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DroneGroup__DronesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDroneGroupAccess().getDronesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__Group_7__1__Impl"


    // $ANTLR start "rule__Drone__Group__0"
    // InternalMyDsl.g:1606:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalMyDsl.g:1611:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Drone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__0"


    // $ANTLR start "rule__Drone__Group__0__Impl"
    // InternalMyDsl.g:1618:1: rule__Drone__Group__0__Impl : ( 'Drone' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( ( 'Drone' ) )
            // InternalMyDsl.g:1623:1: ( 'Drone' )
            {
            // InternalMyDsl.g:1623:1: ( 'Drone' )
            // InternalMyDsl.g:1624:2: 'Drone'
            {
             before(grammarAccess.getDroneAccess().getDroneKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getDroneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__0__Impl"


    // $ANTLR start "rule__Drone__Group__1"
    // InternalMyDsl.g:1633:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl rule__Drone__Group__2 ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( rule__Drone__Group__1__Impl rule__Drone__Group__2 )
            // InternalMyDsl.g:1638:2: rule__Drone__Group__1__Impl rule__Drone__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Drone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__1"


    // $ANTLR start "rule__Drone__Group__1__Impl"
    // InternalMyDsl.g:1645:1: rule__Drone__Group__1__Impl : ( ( rule__Drone__NameAssignment_1 ) ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( ( ( rule__Drone__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1650:1: ( ( rule__Drone__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1650:1: ( ( rule__Drone__NameAssignment_1 ) )
            // InternalMyDsl.g:1651:2: ( rule__Drone__NameAssignment_1 )
            {
             before(grammarAccess.getDroneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1652:2: ( rule__Drone__NameAssignment_1 )
            // InternalMyDsl.g:1652:3: rule__Drone__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Drone__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__1__Impl"


    // $ANTLR start "rule__Drone__Group__2"
    // InternalMyDsl.g:1660:1: rule__Drone__Group__2 : rule__Drone__Group__2__Impl rule__Drone__Group__3 ;
    public final void rule__Drone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( rule__Drone__Group__2__Impl rule__Drone__Group__3 )
            // InternalMyDsl.g:1665:2: rule__Drone__Group__2__Impl rule__Drone__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Drone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__2"


    // $ANTLR start "rule__Drone__Group__2__Impl"
    // InternalMyDsl.g:1672:1: rule__Drone__Group__2__Impl : ( '{' ) ;
    public final void rule__Drone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( ( '{' ) )
            // InternalMyDsl.g:1677:1: ( '{' )
            {
            // InternalMyDsl.g:1677:1: ( '{' )
            // InternalMyDsl.g:1678:2: '{'
            {
             before(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__2__Impl"


    // $ANTLR start "rule__Drone__Group__3"
    // InternalMyDsl.g:1687:1: rule__Drone__Group__3 : rule__Drone__Group__3__Impl rule__Drone__Group__4 ;
    public final void rule__Drone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( rule__Drone__Group__3__Impl rule__Drone__Group__4 )
            // InternalMyDsl.g:1692:2: rule__Drone__Group__3__Impl rule__Drone__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Drone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__3"


    // $ANTLR start "rule__Drone__Group__3__Impl"
    // InternalMyDsl.g:1699:1: rule__Drone__Group__3__Impl : ( 'ip' ) ;
    public final void rule__Drone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( ( 'ip' ) )
            // InternalMyDsl.g:1704:1: ( 'ip' )
            {
            // InternalMyDsl.g:1704:1: ( 'ip' )
            // InternalMyDsl.g:1705:2: 'ip'
            {
             before(grammarAccess.getDroneAccess().getIpKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getIpKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__3__Impl"


    // $ANTLR start "rule__Drone__Group__4"
    // InternalMyDsl.g:1714:1: rule__Drone__Group__4 : rule__Drone__Group__4__Impl rule__Drone__Group__5 ;
    public final void rule__Drone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( rule__Drone__Group__4__Impl rule__Drone__Group__5 )
            // InternalMyDsl.g:1719:2: rule__Drone__Group__4__Impl rule__Drone__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Drone__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__4"


    // $ANTLR start "rule__Drone__Group__4__Impl"
    // InternalMyDsl.g:1726:1: rule__Drone__Group__4__Impl : ( '=' ) ;
    public final void rule__Drone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( ( '=' ) )
            // InternalMyDsl.g:1731:1: ( '=' )
            {
            // InternalMyDsl.g:1731:1: ( '=' )
            // InternalMyDsl.g:1732:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__4__Impl"


    // $ANTLR start "rule__Drone__Group__5"
    // InternalMyDsl.g:1741:1: rule__Drone__Group__5 : rule__Drone__Group__5__Impl rule__Drone__Group__6 ;
    public final void rule__Drone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( rule__Drone__Group__5__Impl rule__Drone__Group__6 )
            // InternalMyDsl.g:1746:2: rule__Drone__Group__5__Impl rule__Drone__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Drone__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__5"


    // $ANTLR start "rule__Drone__Group__5__Impl"
    // InternalMyDsl.g:1753:1: rule__Drone__Group__5__Impl : ( ( rule__Drone__IpAssignment_5 ) ) ;
    public final void rule__Drone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( ( ( rule__Drone__IpAssignment_5 ) ) )
            // InternalMyDsl.g:1758:1: ( ( rule__Drone__IpAssignment_5 ) )
            {
            // InternalMyDsl.g:1758:1: ( ( rule__Drone__IpAssignment_5 ) )
            // InternalMyDsl.g:1759:2: ( rule__Drone__IpAssignment_5 )
            {
             before(grammarAccess.getDroneAccess().getIpAssignment_5()); 
            // InternalMyDsl.g:1760:2: ( rule__Drone__IpAssignment_5 )
            // InternalMyDsl.g:1760:3: rule__Drone__IpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Drone__IpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getIpAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__5__Impl"


    // $ANTLR start "rule__Drone__Group__6"
    // InternalMyDsl.g:1768:1: rule__Drone__Group__6 : rule__Drone__Group__6__Impl rule__Drone__Group__7 ;
    public final void rule__Drone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( rule__Drone__Group__6__Impl rule__Drone__Group__7 )
            // InternalMyDsl.g:1773:2: rule__Drone__Group__6__Impl rule__Drone__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Drone__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__6"


    // $ANTLR start "rule__Drone__Group__6__Impl"
    // InternalMyDsl.g:1780:1: rule__Drone__Group__6__Impl : ( 'serialNumber' ) ;
    public final void rule__Drone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( ( 'serialNumber' ) )
            // InternalMyDsl.g:1785:1: ( 'serialNumber' )
            {
            // InternalMyDsl.g:1785:1: ( 'serialNumber' )
            // InternalMyDsl.g:1786:2: 'serialNumber'
            {
             before(grammarAccess.getDroneAccess().getSerialNumberKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getSerialNumberKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__6__Impl"


    // $ANTLR start "rule__Drone__Group__7"
    // InternalMyDsl.g:1795:1: rule__Drone__Group__7 : rule__Drone__Group__7__Impl rule__Drone__Group__8 ;
    public final void rule__Drone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( rule__Drone__Group__7__Impl rule__Drone__Group__8 )
            // InternalMyDsl.g:1800:2: rule__Drone__Group__7__Impl rule__Drone__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Drone__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__7"


    // $ANTLR start "rule__Drone__Group__7__Impl"
    // InternalMyDsl.g:1807:1: rule__Drone__Group__7__Impl : ( '=' ) ;
    public final void rule__Drone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( ( '=' ) )
            // InternalMyDsl.g:1812:1: ( '=' )
            {
            // InternalMyDsl.g:1812:1: ( '=' )
            // InternalMyDsl.g:1813:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__7__Impl"


    // $ANTLR start "rule__Drone__Group__8"
    // InternalMyDsl.g:1822:1: rule__Drone__Group__8 : rule__Drone__Group__8__Impl rule__Drone__Group__9 ;
    public final void rule__Drone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( rule__Drone__Group__8__Impl rule__Drone__Group__9 )
            // InternalMyDsl.g:1827:2: rule__Drone__Group__8__Impl rule__Drone__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Drone__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__8"


    // $ANTLR start "rule__Drone__Group__8__Impl"
    // InternalMyDsl.g:1834:1: rule__Drone__Group__8__Impl : ( ( rule__Drone__SerialNumberAssignment_8 ) ) ;
    public final void rule__Drone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( ( rule__Drone__SerialNumberAssignment_8 ) ) )
            // InternalMyDsl.g:1839:1: ( ( rule__Drone__SerialNumberAssignment_8 ) )
            {
            // InternalMyDsl.g:1839:1: ( ( rule__Drone__SerialNumberAssignment_8 ) )
            // InternalMyDsl.g:1840:2: ( rule__Drone__SerialNumberAssignment_8 )
            {
             before(grammarAccess.getDroneAccess().getSerialNumberAssignment_8()); 
            // InternalMyDsl.g:1841:2: ( rule__Drone__SerialNumberAssignment_8 )
            // InternalMyDsl.g:1841:3: rule__Drone__SerialNumberAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Drone__SerialNumberAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getSerialNumberAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__8__Impl"


    // $ANTLR start "rule__Drone__Group__9"
    // InternalMyDsl.g:1849:1: rule__Drone__Group__9 : rule__Drone__Group__9__Impl ;
    public final void rule__Drone__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( rule__Drone__Group__9__Impl )
            // InternalMyDsl.g:1854:2: rule__Drone__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__9"


    // $ANTLR start "rule__Drone__Group__9__Impl"
    // InternalMyDsl.g:1860:1: rule__Drone__Group__9__Impl : ( '}' ) ;
    public final void rule__Drone__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( '}' ) )
            // InternalMyDsl.g:1865:1: ( '}' )
            {
            // InternalMyDsl.g:1865:1: ( '}' )
            // InternalMyDsl.g:1866:2: '}'
            {
             before(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__9__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalMyDsl.g:1876:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMyDsl.g:1881:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalMyDsl.g:1888:1: rule__Action__Group__0__Impl : ( 'Action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( ( 'Action' ) )
            // InternalMyDsl.g:1893:1: ( 'Action' )
            {
            // InternalMyDsl.g:1893:1: ( 'Action' )
            // InternalMyDsl.g:1894:2: 'Action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalMyDsl.g:1903:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMyDsl.g:1908:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalMyDsl.g:1915:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1920:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1920:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalMyDsl.g:1921:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1922:2: ( rule__Action__NameAssignment_1 )
            // InternalMyDsl.g:1922:3: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalMyDsl.g:1930:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalMyDsl.g:1935:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalMyDsl.g:1942:1: rule__Action__Group__2__Impl : ( '{' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( ( '{' ) )
            // InternalMyDsl.g:1947:1: ( '{' )
            {
            // InternalMyDsl.g:1947:1: ( '{' )
            // InternalMyDsl.g:1948:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalMyDsl.g:1957:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalMyDsl.g:1962:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalMyDsl.g:1969:1: rule__Action__Group__3__Impl : ( 'description' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( 'description' ) )
            // InternalMyDsl.g:1974:1: ( 'description' )
            {
            // InternalMyDsl.g:1974:1: ( 'description' )
            // InternalMyDsl.g:1975:2: 'description'
            {
             before(grammarAccess.getActionAccess().getDescriptionKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalMyDsl.g:1984:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalMyDsl.g:1989:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalMyDsl.g:1996:1: rule__Action__Group__4__Impl : ( '=' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( ( '=' ) )
            // InternalMyDsl.g:2001:1: ( '=' )
            {
            // InternalMyDsl.g:2001:1: ( '=' )
            // InternalMyDsl.g:2002:2: '='
            {
             before(grammarAccess.getActionAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalMyDsl.g:2011:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalMyDsl.g:2016:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalMyDsl.g:2023:1: rule__Action__Group__5__Impl : ( ( rule__Action__DescriptionAssignment_5 ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( ( ( rule__Action__DescriptionAssignment_5 ) ) )
            // InternalMyDsl.g:2028:1: ( ( rule__Action__DescriptionAssignment_5 ) )
            {
            // InternalMyDsl.g:2028:1: ( ( rule__Action__DescriptionAssignment_5 ) )
            // InternalMyDsl.g:2029:2: ( rule__Action__DescriptionAssignment_5 )
            {
             before(grammarAccess.getActionAccess().getDescriptionAssignment_5()); 
            // InternalMyDsl.g:2030:2: ( rule__Action__DescriptionAssignment_5 )
            // InternalMyDsl.g:2030:3: rule__Action__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Action__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalMyDsl.g:2038:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalMyDsl.g:2043:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalMyDsl.g:2050:1: rule__Action__Group__6__Impl : ( 'type' ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( ( 'type' ) )
            // InternalMyDsl.g:2055:1: ( 'type' )
            {
            // InternalMyDsl.g:2055:1: ( 'type' )
            // InternalMyDsl.g:2056:2: 'type'
            {
             before(grammarAccess.getActionAccess().getTypeKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getTypeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // InternalMyDsl.g:2065:1: rule__Action__Group__7 : rule__Action__Group__7__Impl rule__Action__Group__8 ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( rule__Action__Group__7__Impl rule__Action__Group__8 )
            // InternalMyDsl.g:2070:2: rule__Action__Group__7__Impl rule__Action__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Action__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // InternalMyDsl.g:2077:1: rule__Action__Group__7__Impl : ( '=' ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2081:1: ( ( '=' ) )
            // InternalMyDsl.g:2082:1: ( '=' )
            {
            // InternalMyDsl.g:2082:1: ( '=' )
            // InternalMyDsl.g:2083:2: '='
            {
             before(grammarAccess.getActionAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__Action__Group__8"
    // InternalMyDsl.g:2092:1: rule__Action__Group__8 : rule__Action__Group__8__Impl rule__Action__Group__9 ;
    public final void rule__Action__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( rule__Action__Group__8__Impl rule__Action__Group__9 )
            // InternalMyDsl.g:2097:2: rule__Action__Group__8__Impl rule__Action__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Action__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__8"


    // $ANTLR start "rule__Action__Group__8__Impl"
    // InternalMyDsl.g:2104:1: rule__Action__Group__8__Impl : ( ( rule__Action__TypeAssignment_8 ) ) ;
    public final void rule__Action__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( ( ( rule__Action__TypeAssignment_8 ) ) )
            // InternalMyDsl.g:2109:1: ( ( rule__Action__TypeAssignment_8 ) )
            {
            // InternalMyDsl.g:2109:1: ( ( rule__Action__TypeAssignment_8 ) )
            // InternalMyDsl.g:2110:2: ( rule__Action__TypeAssignment_8 )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_8()); 
            // InternalMyDsl.g:2111:2: ( rule__Action__TypeAssignment_8 )
            // InternalMyDsl.g:2111:3: rule__Action__TypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Action__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__8__Impl"


    // $ANTLR start "rule__Action__Group__9"
    // InternalMyDsl.g:2119:1: rule__Action__Group__9 : rule__Action__Group__9__Impl ;
    public final void rule__Action__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( rule__Action__Group__9__Impl )
            // InternalMyDsl.g:2124:2: rule__Action__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__9"


    // $ANTLR start "rule__Action__Group__9__Impl"
    // InternalMyDsl.g:2130:1: rule__Action__Group__9__Impl : ( '}' ) ;
    public final void rule__Action__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( ( '}' ) )
            // InternalMyDsl.g:2135:1: ( '}' )
            {
            // InternalMyDsl.g:2135:1: ( '}' )
            // InternalMyDsl.g:2136:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__9__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalMyDsl.g:2146:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyDsl.g:2151:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalMyDsl.g:2158:1: rule__Constraint__Group__0__Impl : ( 'Constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( ( 'Constraint' ) )
            // InternalMyDsl.g:2163:1: ( 'Constraint' )
            {
            // InternalMyDsl.g:2163:1: ( 'Constraint' )
            // InternalMyDsl.g:2164:2: 'Constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalMyDsl.g:2173:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyDsl.g:2178:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalMyDsl.g:2185:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2190:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2190:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalMyDsl.g:2191:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2192:2: ( rule__Constraint__NameAssignment_1 )
            // InternalMyDsl.g:2192:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalMyDsl.g:2200:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalMyDsl.g:2205:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalMyDsl.g:2212:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( ( '{' ) )
            // InternalMyDsl.g:2217:1: ( '{' )
            {
            // InternalMyDsl.g:2217:1: ( '{' )
            // InternalMyDsl.g:2218:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalMyDsl.g:2227:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalMyDsl.g:2232:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalMyDsl.g:2239:1: rule__Constraint__Group__3__Impl : ( 'description' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( ( 'description' ) )
            // InternalMyDsl.g:2244:1: ( 'description' )
            {
            // InternalMyDsl.g:2244:1: ( 'description' )
            // InternalMyDsl.g:2245:2: 'description'
            {
             before(grammarAccess.getConstraintAccess().getDescriptionKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalMyDsl.g:2254:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // InternalMyDsl.g:2259:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalMyDsl.g:2266:1: rule__Constraint__Group__4__Impl : ( '=' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( ( '=' ) )
            // InternalMyDsl.g:2271:1: ( '=' )
            {
            // InternalMyDsl.g:2271:1: ( '=' )
            // InternalMyDsl.g:2272:2: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__5"
    // InternalMyDsl.g:2281:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // InternalMyDsl.g:2286:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5"


    // $ANTLR start "rule__Constraint__Group__5__Impl"
    // InternalMyDsl.g:2293:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__DescriptionAssignment_5 ) ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( ( ( rule__Constraint__DescriptionAssignment_5 ) ) )
            // InternalMyDsl.g:2298:1: ( ( rule__Constraint__DescriptionAssignment_5 ) )
            {
            // InternalMyDsl.g:2298:1: ( ( rule__Constraint__DescriptionAssignment_5 ) )
            // InternalMyDsl.g:2299:2: ( rule__Constraint__DescriptionAssignment_5 )
            {
             before(grammarAccess.getConstraintAccess().getDescriptionAssignment_5()); 
            // InternalMyDsl.g:2300:2: ( rule__Constraint__DescriptionAssignment_5 )
            // InternalMyDsl.g:2300:3: rule__Constraint__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5__Impl"


    // $ANTLR start "rule__Constraint__Group__6"
    // InternalMyDsl.g:2308:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( rule__Constraint__Group__6__Impl )
            // InternalMyDsl.g:2313:2: rule__Constraint__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6"


    // $ANTLR start "rule__Constraint__Group__6__Impl"
    // InternalMyDsl.g:2319:1: rule__Constraint__Group__6__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( ( '}' ) )
            // InternalMyDsl.g:2324:1: ( '}' )
            {
            // InternalMyDsl.g:2324:1: ( '}' )
            // InternalMyDsl.g:2325:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6__Impl"


    // $ANTLR start "rule__PermissionConstraint__Group__0"
    // InternalMyDsl.g:2335:1: rule__PermissionConstraint__Group__0 : rule__PermissionConstraint__Group__0__Impl rule__PermissionConstraint__Group__1 ;
    public final void rule__PermissionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( rule__PermissionConstraint__Group__0__Impl rule__PermissionConstraint__Group__1 )
            // InternalMyDsl.g:2340:2: rule__PermissionConstraint__Group__0__Impl rule__PermissionConstraint__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PermissionConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__0"


    // $ANTLR start "rule__PermissionConstraint__Group__0__Impl"
    // InternalMyDsl.g:2347:1: rule__PermissionConstraint__Group__0__Impl : ( 'PermissionConstraint' ) ;
    public final void rule__PermissionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( ( 'PermissionConstraint' ) )
            // InternalMyDsl.g:2352:1: ( 'PermissionConstraint' )
            {
            // InternalMyDsl.g:2352:1: ( 'PermissionConstraint' )
            // InternalMyDsl.g:2353:2: 'PermissionConstraint'
            {
             before(grammarAccess.getPermissionConstraintAccess().getPermissionConstraintKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPermissionConstraintAccess().getPermissionConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__0__Impl"


    // $ANTLR start "rule__PermissionConstraint__Group__1"
    // InternalMyDsl.g:2362:1: rule__PermissionConstraint__Group__1 : rule__PermissionConstraint__Group__1__Impl rule__PermissionConstraint__Group__2 ;
    public final void rule__PermissionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( rule__PermissionConstraint__Group__1__Impl rule__PermissionConstraint__Group__2 )
            // InternalMyDsl.g:2367:2: rule__PermissionConstraint__Group__1__Impl rule__PermissionConstraint__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__PermissionConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__1"


    // $ANTLR start "rule__PermissionConstraint__Group__1__Impl"
    // InternalMyDsl.g:2374:1: rule__PermissionConstraint__Group__1__Impl : ( ( rule__PermissionConstraint__NameAssignment_1 ) ) ;
    public final void rule__PermissionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( ( ( rule__PermissionConstraint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2379:1: ( ( rule__PermissionConstraint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2379:1: ( ( rule__PermissionConstraint__NameAssignment_1 ) )
            // InternalMyDsl.g:2380:2: ( rule__PermissionConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getPermissionConstraintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2381:2: ( rule__PermissionConstraint__NameAssignment_1 )
            // InternalMyDsl.g:2381:3: rule__PermissionConstraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPermissionConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__1__Impl"


    // $ANTLR start "rule__PermissionConstraint__Group__2"
    // InternalMyDsl.g:2389:1: rule__PermissionConstraint__Group__2 : rule__PermissionConstraint__Group__2__Impl rule__PermissionConstraint__Group__3 ;
    public final void rule__PermissionConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( rule__PermissionConstraint__Group__2__Impl rule__PermissionConstraint__Group__3 )
            // InternalMyDsl.g:2394:2: rule__PermissionConstraint__Group__2__Impl rule__PermissionConstraint__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__PermissionConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__2"


    // $ANTLR start "rule__PermissionConstraint__Group__2__Impl"
    // InternalMyDsl.g:2401:1: rule__PermissionConstraint__Group__2__Impl : ( '{' ) ;
    public final void rule__PermissionConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( ( '{' ) )
            // InternalMyDsl.g:2406:1: ( '{' )
            {
            // InternalMyDsl.g:2406:1: ( '{' )
            // InternalMyDsl.g:2407:2: '{'
            {
             before(grammarAccess.getPermissionConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPermissionConstraintAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__2__Impl"


    // $ANTLR start "rule__PermissionConstraint__Group__3"
    // InternalMyDsl.g:2416:1: rule__PermissionConstraint__Group__3 : rule__PermissionConstraint__Group__3__Impl rule__PermissionConstraint__Group__4 ;
    public final void rule__PermissionConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( rule__PermissionConstraint__Group__3__Impl rule__PermissionConstraint__Group__4 )
            // InternalMyDsl.g:2421:2: rule__PermissionConstraint__Group__3__Impl rule__PermissionConstraint__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__PermissionConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__3"


    // $ANTLR start "rule__PermissionConstraint__Group__3__Impl"
    // InternalMyDsl.g:2428:1: rule__PermissionConstraint__Group__3__Impl : ( 'description' ) ;
    public final void rule__PermissionConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( ( 'description' ) )
            // InternalMyDsl.g:2433:1: ( 'description' )
            {
            // InternalMyDsl.g:2433:1: ( 'description' )
            // InternalMyDsl.g:2434:2: 'description'
            {
             before(grammarAccess.getPermissionConstraintAccess().getDescriptionKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPermissionConstraintAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__3__Impl"


    // $ANTLR start "rule__PermissionConstraint__Group__4"
    // InternalMyDsl.g:2443:1: rule__PermissionConstraint__Group__4 : rule__PermissionConstraint__Group__4__Impl rule__PermissionConstraint__Group__5 ;
    public final void rule__PermissionConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( rule__PermissionConstraint__Group__4__Impl rule__PermissionConstraint__Group__5 )
            // InternalMyDsl.g:2448:2: rule__PermissionConstraint__Group__4__Impl rule__PermissionConstraint__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__PermissionConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__4"


    // $ANTLR start "rule__PermissionConstraint__Group__4__Impl"
    // InternalMyDsl.g:2455:1: rule__PermissionConstraint__Group__4__Impl : ( '=' ) ;
    public final void rule__PermissionConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( ( '=' ) )
            // InternalMyDsl.g:2460:1: ( '=' )
            {
            // InternalMyDsl.g:2460:1: ( '=' )
            // InternalMyDsl.g:2461:2: '='
            {
             before(grammarAccess.getPermissionConstraintAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPermissionConstraintAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__4__Impl"


    // $ANTLR start "rule__PermissionConstraint__Group__5"
    // InternalMyDsl.g:2470:1: rule__PermissionConstraint__Group__5 : rule__PermissionConstraint__Group__5__Impl rule__PermissionConstraint__Group__6 ;
    public final void rule__PermissionConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( rule__PermissionConstraint__Group__5__Impl rule__PermissionConstraint__Group__6 )
            // InternalMyDsl.g:2475:2: rule__PermissionConstraint__Group__5__Impl rule__PermissionConstraint__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__PermissionConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__5"


    // $ANTLR start "rule__PermissionConstraint__Group__5__Impl"
    // InternalMyDsl.g:2482:1: rule__PermissionConstraint__Group__5__Impl : ( ( rule__PermissionConstraint__DescriptionAssignment_5 )? ) ;
    public final void rule__PermissionConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( ( ( rule__PermissionConstraint__DescriptionAssignment_5 )? ) )
            // InternalMyDsl.g:2487:1: ( ( rule__PermissionConstraint__DescriptionAssignment_5 )? )
            {
            // InternalMyDsl.g:2487:1: ( ( rule__PermissionConstraint__DescriptionAssignment_5 )? )
            // InternalMyDsl.g:2488:2: ( rule__PermissionConstraint__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getPermissionConstraintAccess().getDescriptionAssignment_5()); 
            // InternalMyDsl.g:2489:2: ( rule__PermissionConstraint__DescriptionAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:2489:3: rule__PermissionConstraint__DescriptionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__PermissionConstraint__DescriptionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPermissionConstraintAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__5__Impl"


    // $ANTLR start "rule__PermissionConstraint__Group__6"
    // InternalMyDsl.g:2497:1: rule__PermissionConstraint__Group__6 : rule__PermissionConstraint__Group__6__Impl ;
    public final void rule__PermissionConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( rule__PermissionConstraint__Group__6__Impl )
            // InternalMyDsl.g:2502:2: rule__PermissionConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PermissionConstraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__6"


    // $ANTLR start "rule__PermissionConstraint__Group__6__Impl"
    // InternalMyDsl.g:2508:1: rule__PermissionConstraint__Group__6__Impl : ( '}' ) ;
    public final void rule__PermissionConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( ( '}' ) )
            // InternalMyDsl.g:2513:1: ( '}' )
            {
            // InternalMyDsl.g:2513:1: ( '}' )
            // InternalMyDsl.g:2514:2: '}'
            {
             before(grammarAccess.getPermissionConstraintAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPermissionConstraintAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__Group__6__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__0"
    // InternalMyDsl.g:2524:1: rule__RegulatoryConstraint__Group__0 : rule__RegulatoryConstraint__Group__0__Impl rule__RegulatoryConstraint__Group__1 ;
    public final void rule__RegulatoryConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( rule__RegulatoryConstraint__Group__0__Impl rule__RegulatoryConstraint__Group__1 )
            // InternalMyDsl.g:2529:2: rule__RegulatoryConstraint__Group__0__Impl rule__RegulatoryConstraint__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RegulatoryConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__0"


    // $ANTLR start "rule__RegulatoryConstraint__Group__0__Impl"
    // InternalMyDsl.g:2536:1: rule__RegulatoryConstraint__Group__0__Impl : ( 'RegulatoryConstraint' ) ;
    public final void rule__RegulatoryConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( ( 'RegulatoryConstraint' ) )
            // InternalMyDsl.g:2541:1: ( 'RegulatoryConstraint' )
            {
            // InternalMyDsl.g:2541:1: ( 'RegulatoryConstraint' )
            // InternalMyDsl.g:2542:2: 'RegulatoryConstraint'
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__0__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__1"
    // InternalMyDsl.g:2551:1: rule__RegulatoryConstraint__Group__1 : rule__RegulatoryConstraint__Group__1__Impl rule__RegulatoryConstraint__Group__2 ;
    public final void rule__RegulatoryConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( rule__RegulatoryConstraint__Group__1__Impl rule__RegulatoryConstraint__Group__2 )
            // InternalMyDsl.g:2556:2: rule__RegulatoryConstraint__Group__1__Impl rule__RegulatoryConstraint__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RegulatoryConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__1"


    // $ANTLR start "rule__RegulatoryConstraint__Group__1__Impl"
    // InternalMyDsl.g:2563:1: rule__RegulatoryConstraint__Group__1__Impl : ( ( rule__RegulatoryConstraint__NameAssignment_1 ) ) ;
    public final void rule__RegulatoryConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( ( ( rule__RegulatoryConstraint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2568:1: ( ( rule__RegulatoryConstraint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2568:1: ( ( rule__RegulatoryConstraint__NameAssignment_1 ) )
            // InternalMyDsl.g:2569:2: ( rule__RegulatoryConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2570:2: ( rule__RegulatoryConstraint__NameAssignment_1 )
            // InternalMyDsl.g:2570:3: rule__RegulatoryConstraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegulatoryConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__1__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__2"
    // InternalMyDsl.g:2578:1: rule__RegulatoryConstraint__Group__2 : rule__RegulatoryConstraint__Group__2__Impl rule__RegulatoryConstraint__Group__3 ;
    public final void rule__RegulatoryConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( rule__RegulatoryConstraint__Group__2__Impl rule__RegulatoryConstraint__Group__3 )
            // InternalMyDsl.g:2583:2: rule__RegulatoryConstraint__Group__2__Impl rule__RegulatoryConstraint__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__RegulatoryConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__2"


    // $ANTLR start "rule__RegulatoryConstraint__Group__2__Impl"
    // InternalMyDsl.g:2590:1: rule__RegulatoryConstraint__Group__2__Impl : ( '{' ) ;
    public final void rule__RegulatoryConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( ( '{' ) )
            // InternalMyDsl.g:2595:1: ( '{' )
            {
            // InternalMyDsl.g:2595:1: ( '{' )
            // InternalMyDsl.g:2596:2: '{'
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__2__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__3"
    // InternalMyDsl.g:2605:1: rule__RegulatoryConstraint__Group__3 : rule__RegulatoryConstraint__Group__3__Impl rule__RegulatoryConstraint__Group__4 ;
    public final void rule__RegulatoryConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( rule__RegulatoryConstraint__Group__3__Impl rule__RegulatoryConstraint__Group__4 )
            // InternalMyDsl.g:2610:2: rule__RegulatoryConstraint__Group__3__Impl rule__RegulatoryConstraint__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RegulatoryConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__3"


    // $ANTLR start "rule__RegulatoryConstraint__Group__3__Impl"
    // InternalMyDsl.g:2617:1: rule__RegulatoryConstraint__Group__3__Impl : ( 'description' ) ;
    public final void rule__RegulatoryConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( 'description' ) )
            // InternalMyDsl.g:2622:1: ( 'description' )
            {
            // InternalMyDsl.g:2622:1: ( 'description' )
            // InternalMyDsl.g:2623:2: 'description'
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getDescriptionKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__3__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__4"
    // InternalMyDsl.g:2632:1: rule__RegulatoryConstraint__Group__4 : rule__RegulatoryConstraint__Group__4__Impl rule__RegulatoryConstraint__Group__5 ;
    public final void rule__RegulatoryConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( rule__RegulatoryConstraint__Group__4__Impl rule__RegulatoryConstraint__Group__5 )
            // InternalMyDsl.g:2637:2: rule__RegulatoryConstraint__Group__4__Impl rule__RegulatoryConstraint__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__RegulatoryConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__4"


    // $ANTLR start "rule__RegulatoryConstraint__Group__4__Impl"
    // InternalMyDsl.g:2644:1: rule__RegulatoryConstraint__Group__4__Impl : ( '=' ) ;
    public final void rule__RegulatoryConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2648:1: ( ( '=' ) )
            // InternalMyDsl.g:2649:1: ( '=' )
            {
            // InternalMyDsl.g:2649:1: ( '=' )
            // InternalMyDsl.g:2650:2: '='
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__4__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__5"
    // InternalMyDsl.g:2659:1: rule__RegulatoryConstraint__Group__5 : rule__RegulatoryConstraint__Group__5__Impl rule__RegulatoryConstraint__Group__6 ;
    public final void rule__RegulatoryConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2663:1: ( rule__RegulatoryConstraint__Group__5__Impl rule__RegulatoryConstraint__Group__6 )
            // InternalMyDsl.g:2664:2: rule__RegulatoryConstraint__Group__5__Impl rule__RegulatoryConstraint__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__RegulatoryConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__5"


    // $ANTLR start "rule__RegulatoryConstraint__Group__5__Impl"
    // InternalMyDsl.g:2671:1: rule__RegulatoryConstraint__Group__5__Impl : ( ( rule__RegulatoryConstraint__DescriptionAssignment_5 )? ) ;
    public final void rule__RegulatoryConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2675:1: ( ( ( rule__RegulatoryConstraint__DescriptionAssignment_5 )? ) )
            // InternalMyDsl.g:2676:1: ( ( rule__RegulatoryConstraint__DescriptionAssignment_5 )? )
            {
            // InternalMyDsl.g:2676:1: ( ( rule__RegulatoryConstraint__DescriptionAssignment_5 )? )
            // InternalMyDsl.g:2677:2: ( rule__RegulatoryConstraint__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getDescriptionAssignment_5()); 
            // InternalMyDsl.g:2678:2: ( rule__RegulatoryConstraint__DescriptionAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2678:3: rule__RegulatoryConstraint__DescriptionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegulatoryConstraint__DescriptionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegulatoryConstraintAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__5__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__6"
    // InternalMyDsl.g:2686:1: rule__RegulatoryConstraint__Group__6 : rule__RegulatoryConstraint__Group__6__Impl ;
    public final void rule__RegulatoryConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( rule__RegulatoryConstraint__Group__6__Impl )
            // InternalMyDsl.g:2691:2: rule__RegulatoryConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__6"


    // $ANTLR start "rule__RegulatoryConstraint__Group__6__Impl"
    // InternalMyDsl.g:2697:1: rule__RegulatoryConstraint__Group__6__Impl : ( '}' ) ;
    public final void rule__RegulatoryConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( ( '}' ) )
            // InternalMyDsl.g:2702:1: ( '}' )
            {
            // InternalMyDsl.g:2702:1: ( '}' )
            // InternalMyDsl.g:2703:2: '}'
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalMyDsl.g:2713:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2717:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalMyDsl.g:2718:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalMyDsl.g:2725:1: rule__Relation__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( ( 'Relation' ) )
            // InternalMyDsl.g:2730:1: ( 'Relation' )
            {
            // InternalMyDsl.g:2730:1: ( 'Relation' )
            // InternalMyDsl.g:2731:2: 'Relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalMyDsl.g:2740:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalMyDsl.g:2745:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalMyDsl.g:2752:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2756:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2757:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2757:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalMyDsl.g:2758:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2759:2: ( rule__Relation__NameAssignment_1 )
            // InternalMyDsl.g:2759:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalMyDsl.g:2767:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalMyDsl.g:2772:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalMyDsl.g:2779:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2783:1: ( ( '{' ) )
            // InternalMyDsl.g:2784:1: ( '{' )
            {
            // InternalMyDsl.g:2784:1: ( '{' )
            // InternalMyDsl.g:2785:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalMyDsl.g:2794:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalMyDsl.g:2799:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalMyDsl.g:2806:1: rule__Relation__Group__3__Impl : ( 'from' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2810:1: ( ( 'from' ) )
            // InternalMyDsl.g:2811:1: ( 'from' )
            {
            // InternalMyDsl.g:2811:1: ( 'from' )
            // InternalMyDsl.g:2812:2: 'from'
            {
             before(grammarAccess.getRelationAccess().getFromKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalMyDsl.g:2821:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalMyDsl.g:2826:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalMyDsl.g:2833:1: rule__Relation__Group__4__Impl : ( '=' ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2837:1: ( ( '=' ) )
            // InternalMyDsl.g:2838:1: ( '=' )
            {
            // InternalMyDsl.g:2838:1: ( '=' )
            // InternalMyDsl.g:2839:2: '='
            {
             before(grammarAccess.getRelationAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalMyDsl.g:2848:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalMyDsl.g:2853:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalMyDsl.g:2860:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__FromAssignment_5 ) ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2864:1: ( ( ( rule__Relation__FromAssignment_5 ) ) )
            // InternalMyDsl.g:2865:1: ( ( rule__Relation__FromAssignment_5 ) )
            {
            // InternalMyDsl.g:2865:1: ( ( rule__Relation__FromAssignment_5 ) )
            // InternalMyDsl.g:2866:2: ( rule__Relation__FromAssignment_5 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_5()); 
            // InternalMyDsl.g:2867:2: ( rule__Relation__FromAssignment_5 )
            // InternalMyDsl.g:2867:3: rule__Relation__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalMyDsl.g:2875:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2879:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalMyDsl.g:2880:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalMyDsl.g:2887:1: rule__Relation__Group__6__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2891:1: ( ( 'to' ) )
            // InternalMyDsl.g:2892:1: ( 'to' )
            {
            // InternalMyDsl.g:2892:1: ( 'to' )
            // InternalMyDsl.g:2893:2: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // InternalMyDsl.g:2902:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalMyDsl.g:2907:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // InternalMyDsl.g:2914:1: rule__Relation__Group__7__Impl : ( '=' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( ( '=' ) )
            // InternalMyDsl.g:2919:1: ( '=' )
            {
            // InternalMyDsl.g:2919:1: ( '=' )
            // InternalMyDsl.g:2920:2: '='
            {
             before(grammarAccess.getRelationAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // InternalMyDsl.g:2929:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalMyDsl.g:2934:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Relation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // InternalMyDsl.g:2941:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__ToAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( ( ( rule__Relation__ToAssignment_8 ) ) )
            // InternalMyDsl.g:2946:1: ( ( rule__Relation__ToAssignment_8 ) )
            {
            // InternalMyDsl.g:2946:1: ( ( rule__Relation__ToAssignment_8 ) )
            // InternalMyDsl.g:2947:2: ( rule__Relation__ToAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_8()); 
            // InternalMyDsl.g:2948:2: ( rule__Relation__ToAssignment_8 )
            // InternalMyDsl.g:2948:3: rule__Relation__ToAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__Relation__Group__9"
    // InternalMyDsl.g:2956:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl rule__Relation__Group__10 ;
    public final void rule__Relation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( rule__Relation__Group__9__Impl rule__Relation__Group__10 )
            // InternalMyDsl.g:2961:2: rule__Relation__Group__9__Impl rule__Relation__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9"


    // $ANTLR start "rule__Relation__Group__9__Impl"
    // InternalMyDsl.g:2968:1: rule__Relation__Group__9__Impl : ( 'type' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( ( 'type' ) )
            // InternalMyDsl.g:2973:1: ( 'type' )
            {
            // InternalMyDsl.g:2973:1: ( 'type' )
            // InternalMyDsl.g:2974:2: 'type'
            {
             before(grammarAccess.getRelationAccess().getTypeKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTypeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9__Impl"


    // $ANTLR start "rule__Relation__Group__10"
    // InternalMyDsl.g:2983:1: rule__Relation__Group__10 : rule__Relation__Group__10__Impl rule__Relation__Group__11 ;
    public final void rule__Relation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2987:1: ( rule__Relation__Group__10__Impl rule__Relation__Group__11 )
            // InternalMyDsl.g:2988:2: rule__Relation__Group__10__Impl rule__Relation__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Relation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__10"


    // $ANTLR start "rule__Relation__Group__10__Impl"
    // InternalMyDsl.g:2995:1: rule__Relation__Group__10__Impl : ( '=' ) ;
    public final void rule__Relation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( ( '=' ) )
            // InternalMyDsl.g:3000:1: ( '=' )
            {
            // InternalMyDsl.g:3000:1: ( '=' )
            // InternalMyDsl.g:3001:2: '='
            {
             before(grammarAccess.getRelationAccess().getEqualsSignKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__10__Impl"


    // $ANTLR start "rule__Relation__Group__11"
    // InternalMyDsl.g:3010:1: rule__Relation__Group__11 : rule__Relation__Group__11__Impl rule__Relation__Group__12 ;
    public final void rule__Relation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3014:1: ( rule__Relation__Group__11__Impl rule__Relation__Group__12 )
            // InternalMyDsl.g:3015:2: rule__Relation__Group__11__Impl rule__Relation__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Relation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__11"


    // $ANTLR start "rule__Relation__Group__11__Impl"
    // InternalMyDsl.g:3022:1: rule__Relation__Group__11__Impl : ( ( rule__Relation__TypeAssignment_11 ) ) ;
    public final void rule__Relation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( ( ( rule__Relation__TypeAssignment_11 ) ) )
            // InternalMyDsl.g:3027:1: ( ( rule__Relation__TypeAssignment_11 ) )
            {
            // InternalMyDsl.g:3027:1: ( ( rule__Relation__TypeAssignment_11 ) )
            // InternalMyDsl.g:3028:2: ( rule__Relation__TypeAssignment_11 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_11()); 
            // InternalMyDsl.g:3029:2: ( rule__Relation__TypeAssignment_11 )
            // InternalMyDsl.g:3029:3: rule__Relation__TypeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TypeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTypeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__11__Impl"


    // $ANTLR start "rule__Relation__Group__12"
    // InternalMyDsl.g:3037:1: rule__Relation__Group__12 : rule__Relation__Group__12__Impl ;
    public final void rule__Relation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( rule__Relation__Group__12__Impl )
            // InternalMyDsl.g:3042:2: rule__Relation__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__12"


    // $ANTLR start "rule__Relation__Group__12__Impl"
    // InternalMyDsl.g:3048:1: rule__Relation__Group__12__Impl : ( '}' ) ;
    public final void rule__Relation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3052:1: ( ( '}' ) )
            // InternalMyDsl.g:3053:1: ( '}' )
            {
            // InternalMyDsl.g:3053:1: ( '}' )
            // InternalMyDsl.g:3054:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__12__Impl"


    // $ANTLR start "rule__Model__SystemRootAssignment_0"
    // InternalMyDsl.g:3064:1: rule__Model__SystemRootAssignment_0 : ( ruleSystemRoot ) ;
    public final void rule__Model__SystemRootAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( ( ruleSystemRoot ) )
            // InternalMyDsl.g:3069:2: ( ruleSystemRoot )
            {
            // InternalMyDsl.g:3069:2: ( ruleSystemRoot )
            // InternalMyDsl.g:3070:3: ruleSystemRoot
            {
             before(grammarAccess.getModelAccess().getSystemRootSystemRootParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemRoot();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemRootSystemRootParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SystemRootAssignment_0"


    // $ANTLR start "rule__Model__EntitiesAssignment_1"
    // InternalMyDsl.g:3079:1: rule__Model__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3083:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:3084:2: ( ruleEntity )
            {
            // InternalMyDsl.g:3084:2: ( ruleEntity )
            // InternalMyDsl.g:3085:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment_1"


    // $ANTLR start "rule__Model__RelationsAssignment_2"
    // InternalMyDsl.g:3094:1: rule__Model__RelationsAssignment_2 : ( ruleRelation ) ;
    public final void rule__Model__RelationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3098:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:3099:2: ( ruleRelation )
            {
            // InternalMyDsl.g:3099:2: ( ruleRelation )
            // InternalMyDsl.g:3100:3: ruleRelation
            {
             before(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RelationsAssignment_2"


    // $ANTLR start "rule__SystemRoot__NameAssignment_1"
    // InternalMyDsl.g:3109:1: rule__SystemRoot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemRoot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3113:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3114:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3114:2: ( RULE_ID )
            // InternalMyDsl.g:3115:3: RULE_ID
            {
             before(grammarAccess.getSystemRootAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemRootAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__NameAssignment_1"


    // $ANTLR start "rule__SystemRoot__EntitiesAssignment_2"
    // InternalMyDsl.g:3124:1: rule__SystemRoot__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__SystemRoot__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:3129:2: ( ruleEntity )
            {
            // InternalMyDsl.g:3129:2: ( ruleEntity )
            // InternalMyDsl.g:3130:3: ruleEntity
            {
             before(grammarAccess.getSystemRootAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSystemRootAccess().getEntitiesEntityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__EntitiesAssignment_2"


    // $ANTLR start "rule__SystemRoot__RelationsAssignment_3"
    // InternalMyDsl.g:3139:1: rule__SystemRoot__RelationsAssignment_3 : ( ruleRelation ) ;
    public final void rule__SystemRoot__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3143:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:3144:2: ( ruleRelation )
            {
            // InternalMyDsl.g:3144:2: ( ruleRelation )
            // InternalMyDsl.g:3145:3: ruleRelation
            {
             before(grammarAccess.getSystemRootAccess().getRelationsRelationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSystemRootAccess().getRelationsRelationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__RelationsAssignment_3"


    // $ANTLR start "rule__Mission__NameAssignment_1"
    // InternalMyDsl.g:3154:1: rule__Mission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3158:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3159:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3159:2: ( RULE_ID )
            // InternalMyDsl.g:3160:3: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__NameAssignment_1"


    // $ANTLR start "rule__Mission__DroneGroupAssignment_5"
    // InternalMyDsl.g:3169:1: rule__Mission__DroneGroupAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__DroneGroupAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3173:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3174:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3174:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3175:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getDroneGroupDroneGroupCrossReference_5_0()); 
            // InternalMyDsl.g:3176:3: ( RULE_ID )
            // InternalMyDsl.g:3177:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getDroneGroupDroneGroupIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getDroneGroupDroneGroupIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getDroneGroupDroneGroupCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__DroneGroupAssignment_5"


    // $ANTLR start "rule__Mission__ActionsAssignment_9"
    // InternalMyDsl.g:3188:1: rule__Mission__ActionsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__ActionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3192:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3193:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3193:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3194:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getActionsActionElementCrossReference_9_0()); 
            // InternalMyDsl.g:3195:3: ( RULE_ID )
            // InternalMyDsl.g:3196:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getActionsActionElementIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getActionsActionElementIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getActionsActionElementCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ActionsAssignment_9"


    // $ANTLR start "rule__Mission__ActionsAssignment_10_1"
    // InternalMyDsl.g:3207:1: rule__Mission__ActionsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__ActionsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3212:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3212:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3213:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getActionsActionElementCrossReference_10_1_0()); 
            // InternalMyDsl.g:3214:3: ( RULE_ID )
            // InternalMyDsl.g:3215:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getActionsActionElementIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getActionsActionElementIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getActionsActionElementCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ActionsAssignment_10_1"


    // $ANTLR start "rule__Mission__ConstraintsAssignment_12_3_0"
    // InternalMyDsl.g:3226:1: rule__Mission__ConstraintsAssignment_12_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__ConstraintsAssignment_12_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3230:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3231:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3231:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3232:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_12_3_0_0()); 
            // InternalMyDsl.g:3233:3: ( RULE_ID )
            // InternalMyDsl.g:3234:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getConstraintsConstraintClassesIDTerminalRuleCall_12_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getConstraintsConstraintClassesIDTerminalRuleCall_12_3_0_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_12_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ConstraintsAssignment_12_3_0"


    // $ANTLR start "rule__Mission__ConstraintsAssignment_12_3_1_1"
    // InternalMyDsl.g:3245:1: rule__Mission__ConstraintsAssignment_12_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__ConstraintsAssignment_12_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3249:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3250:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3250:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3251:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_12_3_1_1_0()); 
            // InternalMyDsl.g:3252:3: ( RULE_ID )
            // InternalMyDsl.g:3253:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getConstraintsConstraintClassesIDTerminalRuleCall_12_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getConstraintsConstraintClassesIDTerminalRuleCall_12_3_1_1_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_12_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ConstraintsAssignment_12_3_1_1"


    // $ANTLR start "rule__DroneGroup__NameAssignment_1"
    // InternalMyDsl.g:3264:1: rule__DroneGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DroneGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3268:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3269:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3269:2: ( RULE_ID )
            // InternalMyDsl.g:3270:3: RULE_ID
            {
             before(grammarAccess.getDroneGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__NameAssignment_1"


    // $ANTLR start "rule__DroneGroup__DronesAssignment_6"
    // InternalMyDsl.g:3279:1: rule__DroneGroup__DronesAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__DroneGroup__DronesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3283:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3284:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3284:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3285:3: ( RULE_ID )
            {
             before(grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_6_0()); 
            // InternalMyDsl.g:3286:3: ( RULE_ID )
            // InternalMyDsl.g:3287:4: RULE_ID
            {
             before(grammarAccess.getDroneGroupAccess().getDronesDroneIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getDronesDroneIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__DronesAssignment_6"


    // $ANTLR start "rule__DroneGroup__DronesAssignment_7_1"
    // InternalMyDsl.g:3298:1: rule__DroneGroup__DronesAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__DroneGroup__DronesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3302:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3303:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3303:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3304:3: ( RULE_ID )
            {
             before(grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_7_1_0()); 
            // InternalMyDsl.g:3305:3: ( RULE_ID )
            // InternalMyDsl.g:3306:4: RULE_ID
            {
             before(grammarAccess.getDroneGroupAccess().getDronesDroneIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDroneGroupAccess().getDronesDroneIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DroneGroup__DronesAssignment_7_1"


    // $ANTLR start "rule__Drone__NameAssignment_1"
    // InternalMyDsl.g:3317:1: rule__Drone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Drone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3321:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3322:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3322:2: ( RULE_ID )
            // InternalMyDsl.g:3323:3: RULE_ID
            {
             before(grammarAccess.getDroneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__NameAssignment_1"


    // $ANTLR start "rule__Drone__IpAssignment_5"
    // InternalMyDsl.g:3332:1: rule__Drone__IpAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Drone__IpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3336:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3337:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3337:2: ( RULE_STRING )
            // InternalMyDsl.g:3338:3: RULE_STRING
            {
             before(grammarAccess.getDroneAccess().getIpSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getIpSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__IpAssignment_5"


    // $ANTLR start "rule__Drone__SerialNumberAssignment_8"
    // InternalMyDsl.g:3347:1: rule__Drone__SerialNumberAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Drone__SerialNumberAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3351:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3352:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3352:2: ( RULE_STRING )
            // InternalMyDsl.g:3353:3: RULE_STRING
            {
             before(grammarAccess.getDroneAccess().getSerialNumberSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getSerialNumberSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__SerialNumberAssignment_8"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalMyDsl.g:3362:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3366:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3367:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3367:2: ( RULE_ID )
            // InternalMyDsl.g:3368:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__DescriptionAssignment_5"
    // InternalMyDsl.g:3377:1: rule__Action__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Action__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3381:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3382:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3382:2: ( RULE_STRING )
            // InternalMyDsl.g:3383:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DescriptionAssignment_5"


    // $ANTLR start "rule__Action__TypeAssignment_8"
    // InternalMyDsl.g:3392:1: rule__Action__TypeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Action__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3396:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3397:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3397:2: ( RULE_STRING )
            // InternalMyDsl.g:3398:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getTypeSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getTypeSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TypeAssignment_8"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalMyDsl.g:3407:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3411:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3412:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3412:2: ( RULE_ID )
            // InternalMyDsl.g:3413:3: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__DescriptionAssignment_5"
    // InternalMyDsl.g:3422:1: rule__Constraint__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Constraint__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3426:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3427:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3427:2: ( RULE_STRING )
            // InternalMyDsl.g:3428:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__DescriptionAssignment_5"


    // $ANTLR start "rule__PermissionConstraint__NameAssignment_1"
    // InternalMyDsl.g:3437:1: rule__PermissionConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PermissionConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3441:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3442:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3442:2: ( RULE_ID )
            // InternalMyDsl.g:3443:3: RULE_ID
            {
             before(grammarAccess.getPermissionConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPermissionConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__NameAssignment_1"


    // $ANTLR start "rule__PermissionConstraint__DescriptionAssignment_5"
    // InternalMyDsl.g:3452:1: rule__PermissionConstraint__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__PermissionConstraint__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3456:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3457:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3457:2: ( RULE_STRING )
            // InternalMyDsl.g:3458:3: RULE_STRING
            {
             before(grammarAccess.getPermissionConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPermissionConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionConstraint__DescriptionAssignment_5"


    // $ANTLR start "rule__RegulatoryConstraint__NameAssignment_1"
    // InternalMyDsl.g:3467:1: rule__RegulatoryConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegulatoryConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3471:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3472:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3472:2: ( RULE_ID )
            // InternalMyDsl.g:3473:3: RULE_ID
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__NameAssignment_1"


    // $ANTLR start "rule__RegulatoryConstraint__DescriptionAssignment_5"
    // InternalMyDsl.g:3482:1: rule__RegulatoryConstraint__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__RegulatoryConstraint__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3486:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3487:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3487:2: ( RULE_STRING )
            // InternalMyDsl.g:3488:3: RULE_STRING
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegulatoryConstraint__DescriptionAssignment_5"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalMyDsl.g:3497:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3501:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3502:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3502:2: ( RULE_ID )
            // InternalMyDsl.g:3503:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__FromAssignment_5"
    // InternalMyDsl.g:3512:1: rule__Relation__FromAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3516:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3517:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3517:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3518:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityCrossReference_5_0()); 
            // InternalMyDsl.g:3519:3: ( RULE_ID )
            // InternalMyDsl.g:3520:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromEntityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromAssignment_5"


    // $ANTLR start "rule__Relation__ToAssignment_8"
    // InternalMyDsl.g:3531:1: rule__Relation__ToAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3536:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3536:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3537:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityCrossReference_8_0()); 
            // InternalMyDsl.g:3538:3: ( RULE_ID )
            // InternalMyDsl.g:3539:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToEntityCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToAssignment_8"


    // $ANTLR start "rule__Relation__TypeAssignment_11"
    // InternalMyDsl.g:3550:1: rule__Relation__TypeAssignment_11 : ( RULE_STRING ) ;
    public final void rule__Relation__TypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3554:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3555:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3555:2: ( RULE_STRING )
            // InternalMyDsl.g:3556:3: RULE_STRING
            {
             before(grammarAccess.getRelationAccess().getTypeSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTypeSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAssignment_11"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\113\uffff";
    static final String dfa_2s = "\1\1\112\uffff";
    static final String dfa_3s = "\1\15\1\uffff\7\4\7\16\1\17\1\30\1\32\4\35\7\20\1\4\1\22\5\5\1\21\1\4\1\33\1\36\2\24\1\uffff\1\24\1\uffff\1\20\1\23\2\20\1\uffff\1\22\1\4\1\24\2\5\1\4\1\23\1\uffff\2\24\1\23\2\uffff\1\4\1\24\1\23\1\20\1\uffff\1\22\1\4\1\23\1\24\1\4\1\23";
    static final String dfa_4s = "\1\42\1\uffff\7\4\7\16\1\17\1\30\1\32\4\35\7\20\1\4\1\22\3\5\2\24\1\21\1\4\1\33\1\36\2\24\1\uffff\1\24\1\uffff\1\20\1\25\2\20\1\uffff\1\22\1\4\1\24\2\5\1\4\1\25\1\uffff\2\24\1\25\2\uffff\1\4\1\26\1\25\1\20\1\uffff\1\22\1\23\1\25\1\24\1\4\1\25";
    static final String dfa_5s = "\1\uffff\1\2\51\uffff\1\1\1\uffff\1\1\4\uffff\1\1\7\uffff\1\1\3\uffff\2\1\4\uffff\1\1\6\uffff";
    static final String dfa_6s = "\113\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\11\uffff\1\3\1\uffff\1\4\2\uffff\1\5\2\uffff\1\6\1\7\1\10\1\1",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\16\uffff\1\53",
            "\1\54\16\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\53",
            "",
            "\1\55",
            "",
            "\1\63",
            "\1\65\1\uffff\1\64",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\65\1\uffff\1\64",
            "",
            "\1\76",
            "\1\77",
            "\1\101\1\uffff\1\100",
            "",
            "",
            "\1\102",
            "\1\104\1\uffff\1\103",
            "\1\101\1\uffff\1\100",
            "\1\105",
            "",
            "\1\106",
            "\1\107\16\uffff\1\110",
            "\1\110\1\uffff\1\111",
            "\1\104",
            "\1\112",
            "\1\110\1\uffff\1\111"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 572:2: ( rule__SystemRoot__EntitiesAssignment_2 )*";
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\1\1\16\uffff";
    static final String dfa_10s = "\1\15\1\uffff\1\4\1\16\1\43\1\20\1\4\1\44\1\20\1\4\1\36\1\20\1\5\1\24\1\uffff";
    static final String dfa_11s = "\1\42\1\uffff\1\4\1\16\1\43\1\20\1\4\1\44\1\20\1\4\1\36\1\20\1\5\1\24\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_13s = "\17\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\3\1\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 598:2: ( rule__SystemRoot__RelationsAssignment_3 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000792802000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000392802002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});

}