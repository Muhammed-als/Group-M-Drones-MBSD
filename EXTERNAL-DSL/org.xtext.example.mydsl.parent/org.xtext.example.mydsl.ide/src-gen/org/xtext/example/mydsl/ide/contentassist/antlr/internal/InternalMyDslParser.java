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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission'", "'{'", "'missionID'", "'='", "'missionType'", "'startLocation'", "'endLocation'", "'priority'", "'estimatedTime'", "'addDrone'", "'addPhase'", "'addConstraint'", "'addEvent'", "'}'", "','", "'Drone'", "'modelType'", "'batterCapacity'", "'maxFlightTime'", "'payloadCapacity'", "'role'", "'addEnergyModel'", "'EnergyModel'", "'consumptionRate'", "'batteryHealth'", "'rechargeTime'", "'Phase'", "'phaseType'", "'energyUsage'", "'addSubPhase'", "'SubPhase'", "'subPhaseType'", "'duration'", "'addAction'", "'Action'", "'actionType'", "'inputOutput'", "'SafetyConstraint'", "'minBattery'", "'maxWindSpeed'", "'RegulatoryConstraint'", "'flightPermission'", "'altitudeLimit'", "'MissionEvent'", "'eventType'", "'impactLevel'", "'responseAction'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalMyDsl.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==28||LA1_0==35||LA1_0==39||LA1_0==43||LA1_0==47||LA1_0==50||LA1_0==53||LA1_0==56) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:78:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleMission EOF )
            // InternalMyDsl.g:80:1: ruleMission EOF
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
    // InternalMyDsl.g:87:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Mission__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Mission__Group__0 )
            // InternalMyDsl.g:94:4: rule__Mission__Group__0
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


    // $ANTLR start "entryRuleDrone"
    // InternalMyDsl.g:103:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleDrone EOF )
            // InternalMyDsl.g:105:1: ruleDrone EOF
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
    // InternalMyDsl.g:112:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Drone__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Drone__Group__0 )
            // InternalMyDsl.g:119:4: rule__Drone__Group__0
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


    // $ANTLR start "entryRuleEnergyModel"
    // InternalMyDsl.g:128:1: entryRuleEnergyModel : ruleEnergyModel EOF ;
    public final void entryRuleEnergyModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEnergyModel EOF )
            // InternalMyDsl.g:130:1: ruleEnergyModel EOF
            {
             before(grammarAccess.getEnergyModelRule()); 
            pushFollow(FOLLOW_1);
            ruleEnergyModel();

            state._fsp--;

             after(grammarAccess.getEnergyModelRule()); 
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
    // $ANTLR end "entryRuleEnergyModel"


    // $ANTLR start "ruleEnergyModel"
    // InternalMyDsl.g:137:1: ruleEnergyModel : ( ( rule__EnergyModel__Group__0 ) ) ;
    public final void ruleEnergyModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__EnergyModel__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__EnergyModel__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__EnergyModel__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__EnergyModel__Group__0 )
            {
             before(grammarAccess.getEnergyModelAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__EnergyModel__Group__0 )
            // InternalMyDsl.g:144:4: rule__EnergyModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnergyModelAccess().getGroup()); 

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
    // $ANTLR end "ruleEnergyModel"


    // $ANTLR start "entryRulePhase"
    // InternalMyDsl.g:153:1: entryRulePhase : rulePhase EOF ;
    public final void entryRulePhase() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePhase EOF )
            // InternalMyDsl.g:155:1: rulePhase EOF
            {
             before(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getPhaseRule()); 
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
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalMyDsl.g:162:1: rulePhase : ( ( rule__Phase__Group__0 ) ) ;
    public final void rulePhase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Phase__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Phase__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Phase__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Phase__Group__0 )
            {
             before(grammarAccess.getPhaseAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Phase__Group__0 )
            // InternalMyDsl.g:169:4: rule__Phase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getGroup()); 

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
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleSubPhase"
    // InternalMyDsl.g:178:1: entryRuleSubPhase : ruleSubPhase EOF ;
    public final void entryRuleSubPhase() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleSubPhase EOF )
            // InternalMyDsl.g:180:1: ruleSubPhase EOF
            {
             before(grammarAccess.getSubPhaseRule()); 
            pushFollow(FOLLOW_1);
            ruleSubPhase();

            state._fsp--;

             after(grammarAccess.getSubPhaseRule()); 
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
    // $ANTLR end "entryRuleSubPhase"


    // $ANTLR start "ruleSubPhase"
    // InternalMyDsl.g:187:1: ruleSubPhase : ( ( rule__SubPhase__Group__0 ) ) ;
    public final void ruleSubPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__SubPhase__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__SubPhase__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__SubPhase__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__SubPhase__Group__0 )
            {
             before(grammarAccess.getSubPhaseAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__SubPhase__Group__0 )
            // InternalMyDsl.g:194:4: rule__SubPhase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubPhaseAccess().getGroup()); 

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
    // $ANTLR end "ruleSubPhase"


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


    // $ANTLR start "entryRuleConstraint"
    // InternalMyDsl.g:228:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleConstraint EOF )
            // InternalMyDsl.g:230:1: ruleConstraint EOF
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
    // InternalMyDsl.g:237:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Constraint__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Constraint__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Constraint__Alternatives )
            // InternalMyDsl.g:244:4: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleSafetyConstraint"
    // InternalMyDsl.g:253:1: entryRuleSafetyConstraint : ruleSafetyConstraint EOF ;
    public final void entryRuleSafetyConstraint() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSafetyConstraint EOF )
            // InternalMyDsl.g:255:1: ruleSafetyConstraint EOF
            {
             before(grammarAccess.getSafetyConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyConstraint();

            state._fsp--;

             after(grammarAccess.getSafetyConstraintRule()); 
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
    // $ANTLR end "entryRuleSafetyConstraint"


    // $ANTLR start "ruleSafetyConstraint"
    // InternalMyDsl.g:262:1: ruleSafetyConstraint : ( ( rule__SafetyConstraint__Group__0 ) ) ;
    public final void ruleSafetyConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__SafetyConstraint__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__SafetyConstraint__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__SafetyConstraint__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__SafetyConstraint__Group__0 )
            {
             before(grammarAccess.getSafetyConstraintAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__SafetyConstraint__Group__0 )
            // InternalMyDsl.g:269:4: rule__SafetyConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleSafetyConstraint"


    // $ANTLR start "entryRuleRegulatoryConstraint"
    // InternalMyDsl.g:278:1: entryRuleRegulatoryConstraint : ruleRegulatoryConstraint EOF ;
    public final void entryRuleRegulatoryConstraint() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:280:1: ruleRegulatoryConstraint EOF
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
    // InternalMyDsl.g:287:1: ruleRegulatoryConstraint : ( ( rule__RegulatoryConstraint__Group__0 ) ) ;
    public final void ruleRegulatoryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__RegulatoryConstraint__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__RegulatoryConstraint__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__RegulatoryConstraint__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__RegulatoryConstraint__Group__0 )
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__RegulatoryConstraint__Group__0 )
            // InternalMyDsl.g:294:4: rule__RegulatoryConstraint__Group__0
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


    // $ANTLR start "entryRuleMissionEvent"
    // InternalMyDsl.g:303:1: entryRuleMissionEvent : ruleMissionEvent EOF ;
    public final void entryRuleMissionEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMissionEvent EOF )
            // InternalMyDsl.g:305:1: ruleMissionEvent EOF
            {
             before(grammarAccess.getMissionEventRule()); 
            pushFollow(FOLLOW_1);
            ruleMissionEvent();

            state._fsp--;

             after(grammarAccess.getMissionEventRule()); 
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
    // $ANTLR end "entryRuleMissionEvent"


    // $ANTLR start "ruleMissionEvent"
    // InternalMyDsl.g:312:1: ruleMissionEvent : ( ( rule__MissionEvent__Group__0 ) ) ;
    public final void ruleMissionEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__MissionEvent__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__MissionEvent__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__MissionEvent__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__MissionEvent__Group__0 )
            {
             before(grammarAccess.getMissionEventAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__MissionEvent__Group__0 )
            // InternalMyDsl.g:319:4: rule__MissionEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionEventAccess().getGroup()); 

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
    // $ANTLR end "ruleMissionEvent"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalMyDsl.g:327:1: rule__Model__Alternatives : ( ( ( rule__Model__MissionsAssignment_0 ) ) | ( ( rule__Model__DronesAssignment_1 ) ) | ( ( rule__Model__EnergyModelsAssignment_2 ) ) | ( ( rule__Model__PhasesAssignment_3 ) ) | ( ( rule__Model__SubPhasesAssignment_4 ) ) | ( ( rule__Model__ActionsAssignment_5 ) ) | ( ( rule__Model__ConstraintsAssignment_6 ) ) | ( ( rule__Model__MissionEVentsAssignment_7 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ( rule__Model__MissionsAssignment_0 ) ) | ( ( rule__Model__DronesAssignment_1 ) ) | ( ( rule__Model__EnergyModelsAssignment_2 ) ) | ( ( rule__Model__PhasesAssignment_3 ) ) | ( ( rule__Model__SubPhasesAssignment_4 ) ) | ( ( rule__Model__ActionsAssignment_5 ) ) | ( ( rule__Model__ConstraintsAssignment_6 ) ) | ( ( rule__Model__MissionEVentsAssignment_7 ) ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            case 43:
                {
                alt2=5;
                }
                break;
            case 47:
                {
                alt2=6;
                }
                break;
            case 50:
            case 53:
                {
                alt2=7;
                }
                break;
            case 56:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:332:2: ( ( rule__Model__MissionsAssignment_0 ) )
                    {
                    // InternalMyDsl.g:332:2: ( ( rule__Model__MissionsAssignment_0 ) )
                    // InternalMyDsl.g:333:3: ( rule__Model__MissionsAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getMissionsAssignment_0()); 
                    // InternalMyDsl.g:334:3: ( rule__Model__MissionsAssignment_0 )
                    // InternalMyDsl.g:334:4: rule__Model__MissionsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__MissionsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getMissionsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( ( rule__Model__DronesAssignment_1 ) )
                    {
                    // InternalMyDsl.g:338:2: ( ( rule__Model__DronesAssignment_1 ) )
                    // InternalMyDsl.g:339:3: ( rule__Model__DronesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getDronesAssignment_1()); 
                    // InternalMyDsl.g:340:3: ( rule__Model__DronesAssignment_1 )
                    // InternalMyDsl.g:340:4: rule__Model__DronesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DronesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDronesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:344:2: ( ( rule__Model__EnergyModelsAssignment_2 ) )
                    {
                    // InternalMyDsl.g:344:2: ( ( rule__Model__EnergyModelsAssignment_2 ) )
                    // InternalMyDsl.g:345:3: ( rule__Model__EnergyModelsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getEnergyModelsAssignment_2()); 
                    // InternalMyDsl.g:346:3: ( rule__Model__EnergyModelsAssignment_2 )
                    // InternalMyDsl.g:346:4: rule__Model__EnergyModelsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__EnergyModelsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getEnergyModelsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:350:2: ( ( rule__Model__PhasesAssignment_3 ) )
                    {
                    // InternalMyDsl.g:350:2: ( ( rule__Model__PhasesAssignment_3 ) )
                    // InternalMyDsl.g:351:3: ( rule__Model__PhasesAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getPhasesAssignment_3()); 
                    // InternalMyDsl.g:352:3: ( rule__Model__PhasesAssignment_3 )
                    // InternalMyDsl.g:352:4: rule__Model__PhasesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PhasesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPhasesAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:356:2: ( ( rule__Model__SubPhasesAssignment_4 ) )
                    {
                    // InternalMyDsl.g:356:2: ( ( rule__Model__SubPhasesAssignment_4 ) )
                    // InternalMyDsl.g:357:3: ( rule__Model__SubPhasesAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getSubPhasesAssignment_4()); 
                    // InternalMyDsl.g:358:3: ( rule__Model__SubPhasesAssignment_4 )
                    // InternalMyDsl.g:358:4: rule__Model__SubPhasesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SubPhasesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSubPhasesAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:362:2: ( ( rule__Model__ActionsAssignment_5 ) )
                    {
                    // InternalMyDsl.g:362:2: ( ( rule__Model__ActionsAssignment_5 ) )
                    // InternalMyDsl.g:363:3: ( rule__Model__ActionsAssignment_5 )
                    {
                     before(grammarAccess.getModelAccess().getActionsAssignment_5()); 
                    // InternalMyDsl.g:364:3: ( rule__Model__ActionsAssignment_5 )
                    // InternalMyDsl.g:364:4: rule__Model__ActionsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ActionsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getActionsAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:368:2: ( ( rule__Model__ConstraintsAssignment_6 ) )
                    {
                    // InternalMyDsl.g:368:2: ( ( rule__Model__ConstraintsAssignment_6 ) )
                    // InternalMyDsl.g:369:3: ( rule__Model__ConstraintsAssignment_6 )
                    {
                     before(grammarAccess.getModelAccess().getConstraintsAssignment_6()); 
                    // InternalMyDsl.g:370:3: ( rule__Model__ConstraintsAssignment_6 )
                    // InternalMyDsl.g:370:4: rule__Model__ConstraintsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ConstraintsAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getConstraintsAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:374:2: ( ( rule__Model__MissionEVentsAssignment_7 ) )
                    {
                    // InternalMyDsl.g:374:2: ( ( rule__Model__MissionEVentsAssignment_7 ) )
                    // InternalMyDsl.g:375:3: ( rule__Model__MissionEVentsAssignment_7 )
                    {
                     before(grammarAccess.getModelAccess().getMissionEVentsAssignment_7()); 
                    // InternalMyDsl.g:376:3: ( rule__Model__MissionEVentsAssignment_7 )
                    // InternalMyDsl.g:376:4: rule__Model__MissionEVentsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__MissionEVentsAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getMissionEVentsAssignment_7()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Constraint__Alternatives"
    // InternalMyDsl.g:384:1: rule__Constraint__Alternatives : ( ( ruleSafetyConstraint ) | ( ruleRegulatoryConstraint ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:388:1: ( ( ruleSafetyConstraint ) | ( ruleRegulatoryConstraint ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==50) ) {
                alt3=1;
            }
            else if ( (LA3_0==53) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:389:2: ( ruleSafetyConstraint )
                    {
                    // InternalMyDsl.g:389:2: ( ruleSafetyConstraint )
                    // InternalMyDsl.g:390:3: ruleSafetyConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getSafetyConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSafetyConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getSafetyConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:395:2: ( ruleRegulatoryConstraint )
                    {
                    // InternalMyDsl.g:395:2: ( ruleRegulatoryConstraint )
                    // InternalMyDsl.g:396:3: ruleRegulatoryConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getRegulatoryConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegulatoryConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getRegulatoryConstraintParserRuleCall_1()); 

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
    // $ANTLR end "rule__Constraint__Alternatives"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalMyDsl.g:405:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:409:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalMyDsl.g:410:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:417:1: rule__Mission__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:421:1: ( ( 'Mission' ) )
            // InternalMyDsl.g:422:1: ( 'Mission' )
            {
            // InternalMyDsl.g:422:1: ( 'Mission' )
            // InternalMyDsl.g:423:2: 'Mission'
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
    // InternalMyDsl.g:432:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:436:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalMyDsl.g:437:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:444:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__NameAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( ( rule__Mission__NameAssignment_1 ) ) )
            // InternalMyDsl.g:449:1: ( ( rule__Mission__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:449:1: ( ( rule__Mission__NameAssignment_1 ) )
            // InternalMyDsl.g:450:2: ( rule__Mission__NameAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:451:2: ( rule__Mission__NameAssignment_1 )
            // InternalMyDsl.g:451:3: rule__Mission__NameAssignment_1
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
    // InternalMyDsl.g:459:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:463:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalMyDsl.g:464:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:471:1: rule__Mission__Group__2__Impl : ( '{' ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:475:1: ( ( '{' ) )
            // InternalMyDsl.g:476:1: ( '{' )
            {
            // InternalMyDsl.g:476:1: ( '{' )
            // InternalMyDsl.g:477:2: '{'
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
    // InternalMyDsl.g:486:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:490:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalMyDsl.g:491:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:498:1: rule__Mission__Group__3__Impl : ( 'missionID' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( ( 'missionID' ) )
            // InternalMyDsl.g:503:1: ( 'missionID' )
            {
            // InternalMyDsl.g:503:1: ( 'missionID' )
            // InternalMyDsl.g:504:2: 'missionID'
            {
             before(grammarAccess.getMissionAccess().getMissionIDKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionIDKeyword_3()); 

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
    // InternalMyDsl.g:513:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalMyDsl.g:518:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:525:1: rule__Mission__Group__4__Impl : ( '=' ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( ( '=' ) )
            // InternalMyDsl.g:530:1: ( '=' )
            {
            // InternalMyDsl.g:530:1: ( '=' )
            // InternalMyDsl.g:531:2: '='
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
    // InternalMyDsl.g:540:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalMyDsl.g:545:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:552:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__IdAssignment_5 ) ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( ( ( rule__Mission__IdAssignment_5 ) ) )
            // InternalMyDsl.g:557:1: ( ( rule__Mission__IdAssignment_5 ) )
            {
            // InternalMyDsl.g:557:1: ( ( rule__Mission__IdAssignment_5 ) )
            // InternalMyDsl.g:558:2: ( rule__Mission__IdAssignment_5 )
            {
             before(grammarAccess.getMissionAccess().getIdAssignment_5()); 
            // InternalMyDsl.g:559:2: ( rule__Mission__IdAssignment_5 )
            // InternalMyDsl.g:559:3: rule__Mission__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mission__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getIdAssignment_5()); 

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
    // InternalMyDsl.g:567:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalMyDsl.g:572:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:579:1: rule__Mission__Group__6__Impl : ( 'missionType' ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( 'missionType' ) )
            // InternalMyDsl.g:584:1: ( 'missionType' )
            {
            // InternalMyDsl.g:584:1: ( 'missionType' )
            // InternalMyDsl.g:585:2: 'missionType'
            {
             before(grammarAccess.getMissionAccess().getMissionTypeKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionTypeKeyword_6()); 

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
    // InternalMyDsl.g:594:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalMyDsl.g:599:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:606:1: rule__Mission__Group__7__Impl : ( '=' ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( '=' ) )
            // InternalMyDsl.g:611:1: ( '=' )
            {
            // InternalMyDsl.g:611:1: ( '=' )
            // InternalMyDsl.g:612:2: '='
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
    // InternalMyDsl.g:621:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl rule__Mission__Group__9 ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( rule__Mission__Group__8__Impl rule__Mission__Group__9 )
            // InternalMyDsl.g:626:2: rule__Mission__Group__8__Impl rule__Mission__Group__9
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:633:1: rule__Mission__Group__8__Impl : ( ( rule__Mission__MissionTypeAssignment_8 ) ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( ( rule__Mission__MissionTypeAssignment_8 ) ) )
            // InternalMyDsl.g:638:1: ( ( rule__Mission__MissionTypeAssignment_8 ) )
            {
            // InternalMyDsl.g:638:1: ( ( rule__Mission__MissionTypeAssignment_8 ) )
            // InternalMyDsl.g:639:2: ( rule__Mission__MissionTypeAssignment_8 )
            {
             before(grammarAccess.getMissionAccess().getMissionTypeAssignment_8()); 
            // InternalMyDsl.g:640:2: ( rule__Mission__MissionTypeAssignment_8 )
            // InternalMyDsl.g:640:3: rule__Mission__MissionTypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Mission__MissionTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getMissionTypeAssignment_8()); 

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
    // InternalMyDsl.g:648:1: rule__Mission__Group__9 : rule__Mission__Group__9__Impl rule__Mission__Group__10 ;
    public final void rule__Mission__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( rule__Mission__Group__9__Impl rule__Mission__Group__10 )
            // InternalMyDsl.g:653:2: rule__Mission__Group__9__Impl rule__Mission__Group__10
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:660:1: rule__Mission__Group__9__Impl : ( 'startLocation' ) ;
    public final void rule__Mission__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( ( 'startLocation' ) )
            // InternalMyDsl.g:665:1: ( 'startLocation' )
            {
            // InternalMyDsl.g:665:1: ( 'startLocation' )
            // InternalMyDsl.g:666:2: 'startLocation'
            {
             before(grammarAccess.getMissionAccess().getStartLocationKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getStartLocationKeyword_9()); 

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
    // InternalMyDsl.g:675:1: rule__Mission__Group__10 : rule__Mission__Group__10__Impl rule__Mission__Group__11 ;
    public final void rule__Mission__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( rule__Mission__Group__10__Impl rule__Mission__Group__11 )
            // InternalMyDsl.g:680:2: rule__Mission__Group__10__Impl rule__Mission__Group__11
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:687:1: rule__Mission__Group__10__Impl : ( '=' ) ;
    public final void rule__Mission__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( ( '=' ) )
            // InternalMyDsl.g:692:1: ( '=' )
            {
            // InternalMyDsl.g:692:1: ( '=' )
            // InternalMyDsl.g:693:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_10()); 

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
    // InternalMyDsl.g:702:1: rule__Mission__Group__11 : rule__Mission__Group__11__Impl rule__Mission__Group__12 ;
    public final void rule__Mission__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( rule__Mission__Group__11__Impl rule__Mission__Group__12 )
            // InternalMyDsl.g:707:2: rule__Mission__Group__11__Impl rule__Mission__Group__12
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:714:1: rule__Mission__Group__11__Impl : ( ( rule__Mission__StartLocationAssignment_11 ) ) ;
    public final void rule__Mission__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( ( ( rule__Mission__StartLocationAssignment_11 ) ) )
            // InternalMyDsl.g:719:1: ( ( rule__Mission__StartLocationAssignment_11 ) )
            {
            // InternalMyDsl.g:719:1: ( ( rule__Mission__StartLocationAssignment_11 ) )
            // InternalMyDsl.g:720:2: ( rule__Mission__StartLocationAssignment_11 )
            {
             before(grammarAccess.getMissionAccess().getStartLocationAssignment_11()); 
            // InternalMyDsl.g:721:2: ( rule__Mission__StartLocationAssignment_11 )
            // InternalMyDsl.g:721:3: rule__Mission__StartLocationAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Mission__StartLocationAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getStartLocationAssignment_11()); 

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
    // InternalMyDsl.g:729:1: rule__Mission__Group__12 : rule__Mission__Group__12__Impl rule__Mission__Group__13 ;
    public final void rule__Mission__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( rule__Mission__Group__12__Impl rule__Mission__Group__13 )
            // InternalMyDsl.g:734:2: rule__Mission__Group__12__Impl rule__Mission__Group__13
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:741:1: rule__Mission__Group__12__Impl : ( 'endLocation' ) ;
    public final void rule__Mission__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( ( 'endLocation' ) )
            // InternalMyDsl.g:746:1: ( 'endLocation' )
            {
            // InternalMyDsl.g:746:1: ( 'endLocation' )
            // InternalMyDsl.g:747:2: 'endLocation'
            {
             before(grammarAccess.getMissionAccess().getEndLocationKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEndLocationKeyword_12()); 

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
    // InternalMyDsl.g:756:1: rule__Mission__Group__13 : rule__Mission__Group__13__Impl rule__Mission__Group__14 ;
    public final void rule__Mission__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( rule__Mission__Group__13__Impl rule__Mission__Group__14 )
            // InternalMyDsl.g:761:2: rule__Mission__Group__13__Impl rule__Mission__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Mission__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__14();

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
    // InternalMyDsl.g:768:1: rule__Mission__Group__13__Impl : ( '=' ) ;
    public final void rule__Mission__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( ( '=' ) )
            // InternalMyDsl.g:773:1: ( '=' )
            {
            // InternalMyDsl.g:773:1: ( '=' )
            // InternalMyDsl.g:774:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_13()); 

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


    // $ANTLR start "rule__Mission__Group__14"
    // InternalMyDsl.g:783:1: rule__Mission__Group__14 : rule__Mission__Group__14__Impl rule__Mission__Group__15 ;
    public final void rule__Mission__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( rule__Mission__Group__14__Impl rule__Mission__Group__15 )
            // InternalMyDsl.g:788:2: rule__Mission__Group__14__Impl rule__Mission__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Mission__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__15();

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
    // $ANTLR end "rule__Mission__Group__14"


    // $ANTLR start "rule__Mission__Group__14__Impl"
    // InternalMyDsl.g:795:1: rule__Mission__Group__14__Impl : ( ( rule__Mission__EndLocationAssignment_14 ) ) ;
    public final void rule__Mission__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( ( ( rule__Mission__EndLocationAssignment_14 ) ) )
            // InternalMyDsl.g:800:1: ( ( rule__Mission__EndLocationAssignment_14 ) )
            {
            // InternalMyDsl.g:800:1: ( ( rule__Mission__EndLocationAssignment_14 ) )
            // InternalMyDsl.g:801:2: ( rule__Mission__EndLocationAssignment_14 )
            {
             before(grammarAccess.getMissionAccess().getEndLocationAssignment_14()); 
            // InternalMyDsl.g:802:2: ( rule__Mission__EndLocationAssignment_14 )
            // InternalMyDsl.g:802:3: rule__Mission__EndLocationAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Mission__EndLocationAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getEndLocationAssignment_14()); 

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
    // $ANTLR end "rule__Mission__Group__14__Impl"


    // $ANTLR start "rule__Mission__Group__15"
    // InternalMyDsl.g:810:1: rule__Mission__Group__15 : rule__Mission__Group__15__Impl rule__Mission__Group__16 ;
    public final void rule__Mission__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( rule__Mission__Group__15__Impl rule__Mission__Group__16 )
            // InternalMyDsl.g:815:2: rule__Mission__Group__15__Impl rule__Mission__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__16();

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
    // $ANTLR end "rule__Mission__Group__15"


    // $ANTLR start "rule__Mission__Group__15__Impl"
    // InternalMyDsl.g:822:1: rule__Mission__Group__15__Impl : ( 'priority' ) ;
    public final void rule__Mission__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( ( 'priority' ) )
            // InternalMyDsl.g:827:1: ( 'priority' )
            {
            // InternalMyDsl.g:827:1: ( 'priority' )
            // InternalMyDsl.g:828:2: 'priority'
            {
             before(grammarAccess.getMissionAccess().getPriorityKeyword_15()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getPriorityKeyword_15()); 

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
    // $ANTLR end "rule__Mission__Group__15__Impl"


    // $ANTLR start "rule__Mission__Group__16"
    // InternalMyDsl.g:837:1: rule__Mission__Group__16 : rule__Mission__Group__16__Impl rule__Mission__Group__17 ;
    public final void rule__Mission__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( rule__Mission__Group__16__Impl rule__Mission__Group__17 )
            // InternalMyDsl.g:842:2: rule__Mission__Group__16__Impl rule__Mission__Group__17
            {
            pushFollow(FOLLOW_13);
            rule__Mission__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__17();

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
    // $ANTLR end "rule__Mission__Group__16"


    // $ANTLR start "rule__Mission__Group__16__Impl"
    // InternalMyDsl.g:849:1: rule__Mission__Group__16__Impl : ( '=' ) ;
    public final void rule__Mission__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( '=' ) )
            // InternalMyDsl.g:854:1: ( '=' )
            {
            // InternalMyDsl.g:854:1: ( '=' )
            // InternalMyDsl.g:855:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_16()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_16()); 

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
    // $ANTLR end "rule__Mission__Group__16__Impl"


    // $ANTLR start "rule__Mission__Group__17"
    // InternalMyDsl.g:864:1: rule__Mission__Group__17 : rule__Mission__Group__17__Impl rule__Mission__Group__18 ;
    public final void rule__Mission__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( rule__Mission__Group__17__Impl rule__Mission__Group__18 )
            // InternalMyDsl.g:869:2: rule__Mission__Group__17__Impl rule__Mission__Group__18
            {
            pushFollow(FOLLOW_14);
            rule__Mission__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__18();

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
    // $ANTLR end "rule__Mission__Group__17"


    // $ANTLR start "rule__Mission__Group__17__Impl"
    // InternalMyDsl.g:876:1: rule__Mission__Group__17__Impl : ( ( rule__Mission__PriorityAssignment_17 ) ) ;
    public final void rule__Mission__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( ( ( rule__Mission__PriorityAssignment_17 ) ) )
            // InternalMyDsl.g:881:1: ( ( rule__Mission__PriorityAssignment_17 ) )
            {
            // InternalMyDsl.g:881:1: ( ( rule__Mission__PriorityAssignment_17 ) )
            // InternalMyDsl.g:882:2: ( rule__Mission__PriorityAssignment_17 )
            {
             before(grammarAccess.getMissionAccess().getPriorityAssignment_17()); 
            // InternalMyDsl.g:883:2: ( rule__Mission__PriorityAssignment_17 )
            // InternalMyDsl.g:883:3: rule__Mission__PriorityAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Mission__PriorityAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getPriorityAssignment_17()); 

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
    // $ANTLR end "rule__Mission__Group__17__Impl"


    // $ANTLR start "rule__Mission__Group__18"
    // InternalMyDsl.g:891:1: rule__Mission__Group__18 : rule__Mission__Group__18__Impl rule__Mission__Group__19 ;
    public final void rule__Mission__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( rule__Mission__Group__18__Impl rule__Mission__Group__19 )
            // InternalMyDsl.g:896:2: rule__Mission__Group__18__Impl rule__Mission__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__19();

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
    // $ANTLR end "rule__Mission__Group__18"


    // $ANTLR start "rule__Mission__Group__18__Impl"
    // InternalMyDsl.g:903:1: rule__Mission__Group__18__Impl : ( 'estimatedTime' ) ;
    public final void rule__Mission__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( 'estimatedTime' ) )
            // InternalMyDsl.g:908:1: ( 'estimatedTime' )
            {
            // InternalMyDsl.g:908:1: ( 'estimatedTime' )
            // InternalMyDsl.g:909:2: 'estimatedTime'
            {
             before(grammarAccess.getMissionAccess().getEstimatedTimeKeyword_18()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEstimatedTimeKeyword_18()); 

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
    // $ANTLR end "rule__Mission__Group__18__Impl"


    // $ANTLR start "rule__Mission__Group__19"
    // InternalMyDsl.g:918:1: rule__Mission__Group__19 : rule__Mission__Group__19__Impl rule__Mission__Group__20 ;
    public final void rule__Mission__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( rule__Mission__Group__19__Impl rule__Mission__Group__20 )
            // InternalMyDsl.g:923:2: rule__Mission__Group__19__Impl rule__Mission__Group__20
            {
            pushFollow(FOLLOW_15);
            rule__Mission__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__20();

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
    // $ANTLR end "rule__Mission__Group__19"


    // $ANTLR start "rule__Mission__Group__19__Impl"
    // InternalMyDsl.g:930:1: rule__Mission__Group__19__Impl : ( '=' ) ;
    public final void rule__Mission__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( ( '=' ) )
            // InternalMyDsl.g:935:1: ( '=' )
            {
            // InternalMyDsl.g:935:1: ( '=' )
            // InternalMyDsl.g:936:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_19()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_19()); 

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
    // $ANTLR end "rule__Mission__Group__19__Impl"


    // $ANTLR start "rule__Mission__Group__20"
    // InternalMyDsl.g:945:1: rule__Mission__Group__20 : rule__Mission__Group__20__Impl rule__Mission__Group__21 ;
    public final void rule__Mission__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( rule__Mission__Group__20__Impl rule__Mission__Group__21 )
            // InternalMyDsl.g:950:2: rule__Mission__Group__20__Impl rule__Mission__Group__21
            {
            pushFollow(FOLLOW_16);
            rule__Mission__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__21();

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
    // $ANTLR end "rule__Mission__Group__20"


    // $ANTLR start "rule__Mission__Group__20__Impl"
    // InternalMyDsl.g:957:1: rule__Mission__Group__20__Impl : ( ( rule__Mission__EstimatedTimeAssignment_20 ) ) ;
    public final void rule__Mission__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( ( ( rule__Mission__EstimatedTimeAssignment_20 ) ) )
            // InternalMyDsl.g:962:1: ( ( rule__Mission__EstimatedTimeAssignment_20 ) )
            {
            // InternalMyDsl.g:962:1: ( ( rule__Mission__EstimatedTimeAssignment_20 ) )
            // InternalMyDsl.g:963:2: ( rule__Mission__EstimatedTimeAssignment_20 )
            {
             before(grammarAccess.getMissionAccess().getEstimatedTimeAssignment_20()); 
            // InternalMyDsl.g:964:2: ( rule__Mission__EstimatedTimeAssignment_20 )
            // InternalMyDsl.g:964:3: rule__Mission__EstimatedTimeAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Mission__EstimatedTimeAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getEstimatedTimeAssignment_20()); 

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
    // $ANTLR end "rule__Mission__Group__20__Impl"


    // $ANTLR start "rule__Mission__Group__21"
    // InternalMyDsl.g:972:1: rule__Mission__Group__21 : rule__Mission__Group__21__Impl rule__Mission__Group__22 ;
    public final void rule__Mission__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( rule__Mission__Group__21__Impl rule__Mission__Group__22 )
            // InternalMyDsl.g:977:2: rule__Mission__Group__21__Impl rule__Mission__Group__22
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__22();

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
    // $ANTLR end "rule__Mission__Group__21"


    // $ANTLR start "rule__Mission__Group__21__Impl"
    // InternalMyDsl.g:984:1: rule__Mission__Group__21__Impl : ( 'addDrone' ) ;
    public final void rule__Mission__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( 'addDrone' ) )
            // InternalMyDsl.g:989:1: ( 'addDrone' )
            {
            // InternalMyDsl.g:989:1: ( 'addDrone' )
            // InternalMyDsl.g:990:2: 'addDrone'
            {
             before(grammarAccess.getMissionAccess().getAddDroneKeyword_21()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddDroneKeyword_21()); 

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
    // $ANTLR end "rule__Mission__Group__21__Impl"


    // $ANTLR start "rule__Mission__Group__22"
    // InternalMyDsl.g:999:1: rule__Mission__Group__22 : rule__Mission__Group__22__Impl rule__Mission__Group__23 ;
    public final void rule__Mission__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( rule__Mission__Group__22__Impl rule__Mission__Group__23 )
            // InternalMyDsl.g:1004:2: rule__Mission__Group__22__Impl rule__Mission__Group__23
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__23();

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
    // $ANTLR end "rule__Mission__Group__22"


    // $ANTLR start "rule__Mission__Group__22__Impl"
    // InternalMyDsl.g:1011:1: rule__Mission__Group__22__Impl : ( '=' ) ;
    public final void rule__Mission__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( ( '=' ) )
            // InternalMyDsl.g:1016:1: ( '=' )
            {
            // InternalMyDsl.g:1016:1: ( '=' )
            // InternalMyDsl.g:1017:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_22()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_22()); 

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
    // $ANTLR end "rule__Mission__Group__22__Impl"


    // $ANTLR start "rule__Mission__Group__23"
    // InternalMyDsl.g:1026:1: rule__Mission__Group__23 : rule__Mission__Group__23__Impl rule__Mission__Group__24 ;
    public final void rule__Mission__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( rule__Mission__Group__23__Impl rule__Mission__Group__24 )
            // InternalMyDsl.g:1031:2: rule__Mission__Group__23__Impl rule__Mission__Group__24
            {
            pushFollow(FOLLOW_17);
            rule__Mission__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__24();

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
    // $ANTLR end "rule__Mission__Group__23"


    // $ANTLR start "rule__Mission__Group__23__Impl"
    // InternalMyDsl.g:1038:1: rule__Mission__Group__23__Impl : ( ( rule__Mission__AddDronesAssignment_23 ) ) ;
    public final void rule__Mission__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ( rule__Mission__AddDronesAssignment_23 ) ) )
            // InternalMyDsl.g:1043:1: ( ( rule__Mission__AddDronesAssignment_23 ) )
            {
            // InternalMyDsl.g:1043:1: ( ( rule__Mission__AddDronesAssignment_23 ) )
            // InternalMyDsl.g:1044:2: ( rule__Mission__AddDronesAssignment_23 )
            {
             before(grammarAccess.getMissionAccess().getAddDronesAssignment_23()); 
            // InternalMyDsl.g:1045:2: ( rule__Mission__AddDronesAssignment_23 )
            // InternalMyDsl.g:1045:3: rule__Mission__AddDronesAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__Mission__AddDronesAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAddDronesAssignment_23()); 

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
    // $ANTLR end "rule__Mission__Group__23__Impl"


    // $ANTLR start "rule__Mission__Group__24"
    // InternalMyDsl.g:1053:1: rule__Mission__Group__24 : rule__Mission__Group__24__Impl rule__Mission__Group__25 ;
    public final void rule__Mission__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( rule__Mission__Group__24__Impl rule__Mission__Group__25 )
            // InternalMyDsl.g:1058:2: rule__Mission__Group__24__Impl rule__Mission__Group__25
            {
            pushFollow(FOLLOW_17);
            rule__Mission__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__25();

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
    // $ANTLR end "rule__Mission__Group__24"


    // $ANTLR start "rule__Mission__Group__24__Impl"
    // InternalMyDsl.g:1065:1: rule__Mission__Group__24__Impl : ( ( rule__Mission__Group_24__0 )* ) ;
    public final void rule__Mission__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( ( ( rule__Mission__Group_24__0 )* ) )
            // InternalMyDsl.g:1070:1: ( ( rule__Mission__Group_24__0 )* )
            {
            // InternalMyDsl.g:1070:1: ( ( rule__Mission__Group_24__0 )* )
            // InternalMyDsl.g:1071:2: ( rule__Mission__Group_24__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_24()); 
            // InternalMyDsl.g:1072:2: ( rule__Mission__Group_24__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:1072:3: rule__Mission__Group_24__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Mission__Group_24__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_24()); 

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
    // $ANTLR end "rule__Mission__Group__24__Impl"


    // $ANTLR start "rule__Mission__Group__25"
    // InternalMyDsl.g:1080:1: rule__Mission__Group__25 : rule__Mission__Group__25__Impl rule__Mission__Group__26 ;
    public final void rule__Mission__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( rule__Mission__Group__25__Impl rule__Mission__Group__26 )
            // InternalMyDsl.g:1085:2: rule__Mission__Group__25__Impl rule__Mission__Group__26
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__26();

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
    // $ANTLR end "rule__Mission__Group__25"


    // $ANTLR start "rule__Mission__Group__25__Impl"
    // InternalMyDsl.g:1092:1: rule__Mission__Group__25__Impl : ( 'addPhase' ) ;
    public final void rule__Mission__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( 'addPhase' ) )
            // InternalMyDsl.g:1097:1: ( 'addPhase' )
            {
            // InternalMyDsl.g:1097:1: ( 'addPhase' )
            // InternalMyDsl.g:1098:2: 'addPhase'
            {
             before(grammarAccess.getMissionAccess().getAddPhaseKeyword_25()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddPhaseKeyword_25()); 

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
    // $ANTLR end "rule__Mission__Group__25__Impl"


    // $ANTLR start "rule__Mission__Group__26"
    // InternalMyDsl.g:1107:1: rule__Mission__Group__26 : rule__Mission__Group__26__Impl rule__Mission__Group__27 ;
    public final void rule__Mission__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( rule__Mission__Group__26__Impl rule__Mission__Group__27 )
            // InternalMyDsl.g:1112:2: rule__Mission__Group__26__Impl rule__Mission__Group__27
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__27();

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
    // $ANTLR end "rule__Mission__Group__26"


    // $ANTLR start "rule__Mission__Group__26__Impl"
    // InternalMyDsl.g:1119:1: rule__Mission__Group__26__Impl : ( '=' ) ;
    public final void rule__Mission__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( ( '=' ) )
            // InternalMyDsl.g:1124:1: ( '=' )
            {
            // InternalMyDsl.g:1124:1: ( '=' )
            // InternalMyDsl.g:1125:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_26()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_26()); 

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
    // $ANTLR end "rule__Mission__Group__26__Impl"


    // $ANTLR start "rule__Mission__Group__27"
    // InternalMyDsl.g:1134:1: rule__Mission__Group__27 : rule__Mission__Group__27__Impl rule__Mission__Group__28 ;
    public final void rule__Mission__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( rule__Mission__Group__27__Impl rule__Mission__Group__28 )
            // InternalMyDsl.g:1139:2: rule__Mission__Group__27__Impl rule__Mission__Group__28
            {
            pushFollow(FOLLOW_19);
            rule__Mission__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__28();

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
    // $ANTLR end "rule__Mission__Group__27"


    // $ANTLR start "rule__Mission__Group__27__Impl"
    // InternalMyDsl.g:1146:1: rule__Mission__Group__27__Impl : ( ( rule__Mission__AddPhasesAssignment_27 ) ) ;
    public final void rule__Mission__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( ( rule__Mission__AddPhasesAssignment_27 ) ) )
            // InternalMyDsl.g:1151:1: ( ( rule__Mission__AddPhasesAssignment_27 ) )
            {
            // InternalMyDsl.g:1151:1: ( ( rule__Mission__AddPhasesAssignment_27 ) )
            // InternalMyDsl.g:1152:2: ( rule__Mission__AddPhasesAssignment_27 )
            {
             before(grammarAccess.getMissionAccess().getAddPhasesAssignment_27()); 
            // InternalMyDsl.g:1153:2: ( rule__Mission__AddPhasesAssignment_27 )
            // InternalMyDsl.g:1153:3: rule__Mission__AddPhasesAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Mission__AddPhasesAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAddPhasesAssignment_27()); 

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
    // $ANTLR end "rule__Mission__Group__27__Impl"


    // $ANTLR start "rule__Mission__Group__28"
    // InternalMyDsl.g:1161:1: rule__Mission__Group__28 : rule__Mission__Group__28__Impl rule__Mission__Group__29 ;
    public final void rule__Mission__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( rule__Mission__Group__28__Impl rule__Mission__Group__29 )
            // InternalMyDsl.g:1166:2: rule__Mission__Group__28__Impl rule__Mission__Group__29
            {
            pushFollow(FOLLOW_19);
            rule__Mission__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__29();

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
    // $ANTLR end "rule__Mission__Group__28"


    // $ANTLR start "rule__Mission__Group__28__Impl"
    // InternalMyDsl.g:1173:1: rule__Mission__Group__28__Impl : ( ( rule__Mission__Group_28__0 )* ) ;
    public final void rule__Mission__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( ( rule__Mission__Group_28__0 )* ) )
            // InternalMyDsl.g:1178:1: ( ( rule__Mission__Group_28__0 )* )
            {
            // InternalMyDsl.g:1178:1: ( ( rule__Mission__Group_28__0 )* )
            // InternalMyDsl.g:1179:2: ( rule__Mission__Group_28__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_28()); 
            // InternalMyDsl.g:1180:2: ( rule__Mission__Group_28__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1180:3: rule__Mission__Group_28__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Mission__Group_28__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_28()); 

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
    // $ANTLR end "rule__Mission__Group__28__Impl"


    // $ANTLR start "rule__Mission__Group__29"
    // InternalMyDsl.g:1188:1: rule__Mission__Group__29 : rule__Mission__Group__29__Impl rule__Mission__Group__30 ;
    public final void rule__Mission__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( rule__Mission__Group__29__Impl rule__Mission__Group__30 )
            // InternalMyDsl.g:1193:2: rule__Mission__Group__29__Impl rule__Mission__Group__30
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__30();

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
    // $ANTLR end "rule__Mission__Group__29"


    // $ANTLR start "rule__Mission__Group__29__Impl"
    // InternalMyDsl.g:1200:1: rule__Mission__Group__29__Impl : ( 'addConstraint' ) ;
    public final void rule__Mission__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( 'addConstraint' ) )
            // InternalMyDsl.g:1205:1: ( 'addConstraint' )
            {
            // InternalMyDsl.g:1205:1: ( 'addConstraint' )
            // InternalMyDsl.g:1206:2: 'addConstraint'
            {
             before(grammarAccess.getMissionAccess().getAddConstraintKeyword_29()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddConstraintKeyword_29()); 

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
    // $ANTLR end "rule__Mission__Group__29__Impl"


    // $ANTLR start "rule__Mission__Group__30"
    // InternalMyDsl.g:1215:1: rule__Mission__Group__30 : rule__Mission__Group__30__Impl rule__Mission__Group__31 ;
    public final void rule__Mission__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( rule__Mission__Group__30__Impl rule__Mission__Group__31 )
            // InternalMyDsl.g:1220:2: rule__Mission__Group__30__Impl rule__Mission__Group__31
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__31();

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
    // $ANTLR end "rule__Mission__Group__30"


    // $ANTLR start "rule__Mission__Group__30__Impl"
    // InternalMyDsl.g:1227:1: rule__Mission__Group__30__Impl : ( '=' ) ;
    public final void rule__Mission__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( '=' ) )
            // InternalMyDsl.g:1232:1: ( '=' )
            {
            // InternalMyDsl.g:1232:1: ( '=' )
            // InternalMyDsl.g:1233:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_30()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_30()); 

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
    // $ANTLR end "rule__Mission__Group__30__Impl"


    // $ANTLR start "rule__Mission__Group__31"
    // InternalMyDsl.g:1242:1: rule__Mission__Group__31 : rule__Mission__Group__31__Impl rule__Mission__Group__32 ;
    public final void rule__Mission__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( rule__Mission__Group__31__Impl rule__Mission__Group__32 )
            // InternalMyDsl.g:1247:2: rule__Mission__Group__31__Impl rule__Mission__Group__32
            {
            pushFollow(FOLLOW_20);
            rule__Mission__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__32();

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
    // $ANTLR end "rule__Mission__Group__31"


    // $ANTLR start "rule__Mission__Group__31__Impl"
    // InternalMyDsl.g:1254:1: rule__Mission__Group__31__Impl : ( ( rule__Mission__AddConstraintsAssignment_31 ) ) ;
    public final void rule__Mission__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ( rule__Mission__AddConstraintsAssignment_31 ) ) )
            // InternalMyDsl.g:1259:1: ( ( rule__Mission__AddConstraintsAssignment_31 ) )
            {
            // InternalMyDsl.g:1259:1: ( ( rule__Mission__AddConstraintsAssignment_31 ) )
            // InternalMyDsl.g:1260:2: ( rule__Mission__AddConstraintsAssignment_31 )
            {
             before(grammarAccess.getMissionAccess().getAddConstraintsAssignment_31()); 
            // InternalMyDsl.g:1261:2: ( rule__Mission__AddConstraintsAssignment_31 )
            // InternalMyDsl.g:1261:3: rule__Mission__AddConstraintsAssignment_31
            {
            pushFollow(FOLLOW_2);
            rule__Mission__AddConstraintsAssignment_31();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAddConstraintsAssignment_31()); 

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
    // $ANTLR end "rule__Mission__Group__31__Impl"


    // $ANTLR start "rule__Mission__Group__32"
    // InternalMyDsl.g:1269:1: rule__Mission__Group__32 : rule__Mission__Group__32__Impl rule__Mission__Group__33 ;
    public final void rule__Mission__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( rule__Mission__Group__32__Impl rule__Mission__Group__33 )
            // InternalMyDsl.g:1274:2: rule__Mission__Group__32__Impl rule__Mission__Group__33
            {
            pushFollow(FOLLOW_20);
            rule__Mission__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__33();

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
    // $ANTLR end "rule__Mission__Group__32"


    // $ANTLR start "rule__Mission__Group__32__Impl"
    // InternalMyDsl.g:1281:1: rule__Mission__Group__32__Impl : ( ( rule__Mission__Group_32__0 )* ) ;
    public final void rule__Mission__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( ( ( rule__Mission__Group_32__0 )* ) )
            // InternalMyDsl.g:1286:1: ( ( rule__Mission__Group_32__0 )* )
            {
            // InternalMyDsl.g:1286:1: ( ( rule__Mission__Group_32__0 )* )
            // InternalMyDsl.g:1287:2: ( rule__Mission__Group_32__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_32()); 
            // InternalMyDsl.g:1288:2: ( rule__Mission__Group_32__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1288:3: rule__Mission__Group_32__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Mission__Group_32__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_32()); 

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
    // $ANTLR end "rule__Mission__Group__32__Impl"


    // $ANTLR start "rule__Mission__Group__33"
    // InternalMyDsl.g:1296:1: rule__Mission__Group__33 : rule__Mission__Group__33__Impl rule__Mission__Group__34 ;
    public final void rule__Mission__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( rule__Mission__Group__33__Impl rule__Mission__Group__34 )
            // InternalMyDsl.g:1301:2: rule__Mission__Group__33__Impl rule__Mission__Group__34
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__34();

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
    // $ANTLR end "rule__Mission__Group__33"


    // $ANTLR start "rule__Mission__Group__33__Impl"
    // InternalMyDsl.g:1308:1: rule__Mission__Group__33__Impl : ( 'addEvent' ) ;
    public final void rule__Mission__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( ( 'addEvent' ) )
            // InternalMyDsl.g:1313:1: ( 'addEvent' )
            {
            // InternalMyDsl.g:1313:1: ( 'addEvent' )
            // InternalMyDsl.g:1314:2: 'addEvent'
            {
             before(grammarAccess.getMissionAccess().getAddEventKeyword_33()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddEventKeyword_33()); 

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
    // $ANTLR end "rule__Mission__Group__33__Impl"


    // $ANTLR start "rule__Mission__Group__34"
    // InternalMyDsl.g:1323:1: rule__Mission__Group__34 : rule__Mission__Group__34__Impl rule__Mission__Group__35 ;
    public final void rule__Mission__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( rule__Mission__Group__34__Impl rule__Mission__Group__35 )
            // InternalMyDsl.g:1328:2: rule__Mission__Group__34__Impl rule__Mission__Group__35
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__35();

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
    // $ANTLR end "rule__Mission__Group__34"


    // $ANTLR start "rule__Mission__Group__34__Impl"
    // InternalMyDsl.g:1335:1: rule__Mission__Group__34__Impl : ( '=' ) ;
    public final void rule__Mission__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( ( '=' ) )
            // InternalMyDsl.g:1340:1: ( '=' )
            {
            // InternalMyDsl.g:1340:1: ( '=' )
            // InternalMyDsl.g:1341:2: '='
            {
             before(grammarAccess.getMissionAccess().getEqualsSignKeyword_34()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEqualsSignKeyword_34()); 

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
    // $ANTLR end "rule__Mission__Group__34__Impl"


    // $ANTLR start "rule__Mission__Group__35"
    // InternalMyDsl.g:1350:1: rule__Mission__Group__35 : rule__Mission__Group__35__Impl rule__Mission__Group__36 ;
    public final void rule__Mission__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( rule__Mission__Group__35__Impl rule__Mission__Group__36 )
            // InternalMyDsl.g:1355:2: rule__Mission__Group__35__Impl rule__Mission__Group__36
            {
            pushFollow(FOLLOW_21);
            rule__Mission__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__36();

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
    // $ANTLR end "rule__Mission__Group__35"


    // $ANTLR start "rule__Mission__Group__35__Impl"
    // InternalMyDsl.g:1362:1: rule__Mission__Group__35__Impl : ( ( rule__Mission__AddEventsAssignment_35 ) ) ;
    public final void rule__Mission__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( ( ( rule__Mission__AddEventsAssignment_35 ) ) )
            // InternalMyDsl.g:1367:1: ( ( rule__Mission__AddEventsAssignment_35 ) )
            {
            // InternalMyDsl.g:1367:1: ( ( rule__Mission__AddEventsAssignment_35 ) )
            // InternalMyDsl.g:1368:2: ( rule__Mission__AddEventsAssignment_35 )
            {
             before(grammarAccess.getMissionAccess().getAddEventsAssignment_35()); 
            // InternalMyDsl.g:1369:2: ( rule__Mission__AddEventsAssignment_35 )
            // InternalMyDsl.g:1369:3: rule__Mission__AddEventsAssignment_35
            {
            pushFollow(FOLLOW_2);
            rule__Mission__AddEventsAssignment_35();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAddEventsAssignment_35()); 

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
    // $ANTLR end "rule__Mission__Group__35__Impl"


    // $ANTLR start "rule__Mission__Group__36"
    // InternalMyDsl.g:1377:1: rule__Mission__Group__36 : rule__Mission__Group__36__Impl rule__Mission__Group__37 ;
    public final void rule__Mission__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( rule__Mission__Group__36__Impl rule__Mission__Group__37 )
            // InternalMyDsl.g:1382:2: rule__Mission__Group__36__Impl rule__Mission__Group__37
            {
            pushFollow(FOLLOW_21);
            rule__Mission__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__37();

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
    // $ANTLR end "rule__Mission__Group__36"


    // $ANTLR start "rule__Mission__Group__36__Impl"
    // InternalMyDsl.g:1389:1: rule__Mission__Group__36__Impl : ( ( rule__Mission__Group_36__0 )* ) ;
    public final void rule__Mission__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( ( rule__Mission__Group_36__0 )* ) )
            // InternalMyDsl.g:1394:1: ( ( rule__Mission__Group_36__0 )* )
            {
            // InternalMyDsl.g:1394:1: ( ( rule__Mission__Group_36__0 )* )
            // InternalMyDsl.g:1395:2: ( rule__Mission__Group_36__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_36()); 
            // InternalMyDsl.g:1396:2: ( rule__Mission__Group_36__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1396:3: rule__Mission__Group_36__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Mission__Group_36__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_36()); 

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
    // $ANTLR end "rule__Mission__Group__36__Impl"


    // $ANTLR start "rule__Mission__Group__37"
    // InternalMyDsl.g:1404:1: rule__Mission__Group__37 : rule__Mission__Group__37__Impl ;
    public final void rule__Mission__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( rule__Mission__Group__37__Impl )
            // InternalMyDsl.g:1409:2: rule__Mission__Group__37__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__37__Impl();

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
    // $ANTLR end "rule__Mission__Group__37"


    // $ANTLR start "rule__Mission__Group__37__Impl"
    // InternalMyDsl.g:1415:1: rule__Mission__Group__37__Impl : ( '}' ) ;
    public final void rule__Mission__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( ( '}' ) )
            // InternalMyDsl.g:1420:1: ( '}' )
            {
            // InternalMyDsl.g:1420:1: ( '}' )
            // InternalMyDsl.g:1421:2: '}'
            {
             before(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_37()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_37()); 

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
    // $ANTLR end "rule__Mission__Group__37__Impl"


    // $ANTLR start "rule__Mission__Group_24__0"
    // InternalMyDsl.g:1431:1: rule__Mission__Group_24__0 : rule__Mission__Group_24__0__Impl rule__Mission__Group_24__1 ;
    public final void rule__Mission__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( rule__Mission__Group_24__0__Impl rule__Mission__Group_24__1 )
            // InternalMyDsl.g:1436:2: rule__Mission__Group_24__0__Impl rule__Mission__Group_24__1
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_24__1();

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
    // $ANTLR end "rule__Mission__Group_24__0"


    // $ANTLR start "rule__Mission__Group_24__0__Impl"
    // InternalMyDsl.g:1443:1: rule__Mission__Group_24__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( ',' ) )
            // InternalMyDsl.g:1448:1: ( ',' )
            {
            // InternalMyDsl.g:1448:1: ( ',' )
            // InternalMyDsl.g:1449:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_24_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_24_0()); 

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
    // $ANTLR end "rule__Mission__Group_24__0__Impl"


    // $ANTLR start "rule__Mission__Group_24__1"
    // InternalMyDsl.g:1458:1: rule__Mission__Group_24__1 : rule__Mission__Group_24__1__Impl ;
    public final void rule__Mission__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( rule__Mission__Group_24__1__Impl )
            // InternalMyDsl.g:1463:2: rule__Mission__Group_24__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_24__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_24__1"


    // $ANTLR start "rule__Mission__Group_24__1__Impl"
    // InternalMyDsl.g:1469:1: rule__Mission__Group_24__1__Impl : ( ( rule__Mission__AddDronesAssignment_24_1 ) ) ;
    public final void rule__Mission__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( ( rule__Mission__AddDronesAssignment_24_1 ) ) )
            // InternalMyDsl.g:1474:1: ( ( rule__Mission__AddDronesAssignment_24_1 ) )
            {
            // InternalMyDsl.g:1474:1: ( ( rule__Mission__AddDronesAssignment_24_1 ) )
            // InternalMyDsl.g:1475:2: ( rule__Mission__AddDronesAssignment_24_1 )
            {
             before(grammarAccess.getMissionAccess().getAddDronesAssignment_24_1()); 
            // InternalMyDsl.g:1476:2: ( rule__Mission__AddDronesAssignment_24_1 )
            // InternalMyDsl.g:1476:3: rule__Mission__AddDronesAssignment_24_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__AddDronesAssignment_24_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAddDronesAssignment_24_1()); 

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
    // $ANTLR end "rule__Mission__Group_24__1__Impl"


    // $ANTLR start "rule__Mission__Group_28__0"
    // InternalMyDsl.g:1485:1: rule__Mission__Group_28__0 : rule__Mission__Group_28__0__Impl rule__Mission__Group_28__1 ;
    public final void rule__Mission__Group_28__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( rule__Mission__Group_28__0__Impl rule__Mission__Group_28__1 )
            // InternalMyDsl.g:1490:2: rule__Mission__Group_28__0__Impl rule__Mission__Group_28__1
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group_28__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_28__1();

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
    // $ANTLR end "rule__Mission__Group_28__0"


    // $ANTLR start "rule__Mission__Group_28__0__Impl"
    // InternalMyDsl.g:1497:1: rule__Mission__Group_28__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_28__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( ( ',' ) )
            // InternalMyDsl.g:1502:1: ( ',' )
            {
            // InternalMyDsl.g:1502:1: ( ',' )
            // InternalMyDsl.g:1503:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_28_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_28_0()); 

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
    // $ANTLR end "rule__Mission__Group_28__0__Impl"


    // $ANTLR start "rule__Mission__Group_28__1"
    // InternalMyDsl.g:1512:1: rule__Mission__Group_28__1 : rule__Mission__Group_28__1__Impl ;
    public final void rule__Mission__Group_28__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( rule__Mission__Group_28__1__Impl )
            // InternalMyDsl.g:1517:2: rule__Mission__Group_28__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_28__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_28__1"


    // $ANTLR start "rule__Mission__Group_28__1__Impl"
    // InternalMyDsl.g:1523:1: rule__Mission__Group_28__1__Impl : ( ( rule__Mission__AddPhasesAssignment_28_1 ) ) ;
    public final void rule__Mission__Group_28__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( ( ( rule__Mission__AddPhasesAssignment_28_1 ) ) )
            // InternalMyDsl.g:1528:1: ( ( rule__Mission__AddPhasesAssignment_28_1 ) )
            {
            // InternalMyDsl.g:1528:1: ( ( rule__Mission__AddPhasesAssignment_28_1 ) )
            // InternalMyDsl.g:1529:2: ( rule__Mission__AddPhasesAssignment_28_1 )
            {
             before(grammarAccess.getMissionAccess().getAddPhasesAssignment_28_1()); 
            // InternalMyDsl.g:1530:2: ( rule__Mission__AddPhasesAssignment_28_1 )
            // InternalMyDsl.g:1530:3: rule__Mission__AddPhasesAssignment_28_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__AddPhasesAssignment_28_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAddPhasesAssignment_28_1()); 

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
    // $ANTLR end "rule__Mission__Group_28__1__Impl"


    // $ANTLR start "rule__Mission__Group_32__0"
    // InternalMyDsl.g:1539:1: rule__Mission__Group_32__0 : rule__Mission__Group_32__0__Impl rule__Mission__Group_32__1 ;
    public final void rule__Mission__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( rule__Mission__Group_32__0__Impl rule__Mission__Group_32__1 )
            // InternalMyDsl.g:1544:2: rule__Mission__Group_32__0__Impl rule__Mission__Group_32__1
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group_32__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_32__1();

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
    // $ANTLR end "rule__Mission__Group_32__0"


    // $ANTLR start "rule__Mission__Group_32__0__Impl"
    // InternalMyDsl.g:1551:1: rule__Mission__Group_32__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( ( ',' ) )
            // InternalMyDsl.g:1556:1: ( ',' )
            {
            // InternalMyDsl.g:1556:1: ( ',' )
            // InternalMyDsl.g:1557:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_32_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_32_0()); 

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
    // $ANTLR end "rule__Mission__Group_32__0__Impl"


    // $ANTLR start "rule__Mission__Group_32__1"
    // InternalMyDsl.g:1566:1: rule__Mission__Group_32__1 : rule__Mission__Group_32__1__Impl ;
    public final void rule__Mission__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( rule__Mission__Group_32__1__Impl )
            // InternalMyDsl.g:1571:2: rule__Mission__Group_32__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_32__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_32__1"


    // $ANTLR start "rule__Mission__Group_32__1__Impl"
    // InternalMyDsl.g:1577:1: rule__Mission__Group_32__1__Impl : ( ( rule__Mission__AddConstraintsAssignment_32_1 ) ) ;
    public final void rule__Mission__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( ( ( rule__Mission__AddConstraintsAssignment_32_1 ) ) )
            // InternalMyDsl.g:1582:1: ( ( rule__Mission__AddConstraintsAssignment_32_1 ) )
            {
            // InternalMyDsl.g:1582:1: ( ( rule__Mission__AddConstraintsAssignment_32_1 ) )
            // InternalMyDsl.g:1583:2: ( rule__Mission__AddConstraintsAssignment_32_1 )
            {
             before(grammarAccess.getMissionAccess().getAddConstraintsAssignment_32_1()); 
            // InternalMyDsl.g:1584:2: ( rule__Mission__AddConstraintsAssignment_32_1 )
            // InternalMyDsl.g:1584:3: rule__Mission__AddConstraintsAssignment_32_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__AddConstraintsAssignment_32_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAddConstraintsAssignment_32_1()); 

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
    // $ANTLR end "rule__Mission__Group_32__1__Impl"


    // $ANTLR start "rule__Mission__Group_36__0"
    // InternalMyDsl.g:1593:1: rule__Mission__Group_36__0 : rule__Mission__Group_36__0__Impl rule__Mission__Group_36__1 ;
    public final void rule__Mission__Group_36__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( rule__Mission__Group_36__0__Impl rule__Mission__Group_36__1 )
            // InternalMyDsl.g:1598:2: rule__Mission__Group_36__0__Impl rule__Mission__Group_36__1
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group_36__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_36__1();

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
    // $ANTLR end "rule__Mission__Group_36__0"


    // $ANTLR start "rule__Mission__Group_36__0__Impl"
    // InternalMyDsl.g:1605:1: rule__Mission__Group_36__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_36__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( ( ',' ) )
            // InternalMyDsl.g:1610:1: ( ',' )
            {
            // InternalMyDsl.g:1610:1: ( ',' )
            // InternalMyDsl.g:1611:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_36_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_36_0()); 

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
    // $ANTLR end "rule__Mission__Group_36__0__Impl"


    // $ANTLR start "rule__Mission__Group_36__1"
    // InternalMyDsl.g:1620:1: rule__Mission__Group_36__1 : rule__Mission__Group_36__1__Impl ;
    public final void rule__Mission__Group_36__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( rule__Mission__Group_36__1__Impl )
            // InternalMyDsl.g:1625:2: rule__Mission__Group_36__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_36__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_36__1"


    // $ANTLR start "rule__Mission__Group_36__1__Impl"
    // InternalMyDsl.g:1631:1: rule__Mission__Group_36__1__Impl : ( ( rule__Mission__AddEventsAssignment_36_1 ) ) ;
    public final void rule__Mission__Group_36__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( ( ( rule__Mission__AddEventsAssignment_36_1 ) ) )
            // InternalMyDsl.g:1636:1: ( ( rule__Mission__AddEventsAssignment_36_1 ) )
            {
            // InternalMyDsl.g:1636:1: ( ( rule__Mission__AddEventsAssignment_36_1 ) )
            // InternalMyDsl.g:1637:2: ( rule__Mission__AddEventsAssignment_36_1 )
            {
             before(grammarAccess.getMissionAccess().getAddEventsAssignment_36_1()); 
            // InternalMyDsl.g:1638:2: ( rule__Mission__AddEventsAssignment_36_1 )
            // InternalMyDsl.g:1638:3: rule__Mission__AddEventsAssignment_36_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__AddEventsAssignment_36_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getAddEventsAssignment_36_1()); 

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
    // $ANTLR end "rule__Mission__Group_36__1__Impl"


    // $ANTLR start "rule__Drone__Group__0"
    // InternalMyDsl.g:1647:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalMyDsl.g:1652:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1659:1: rule__Drone__Group__0__Impl : ( 'Drone' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( 'Drone' ) )
            // InternalMyDsl.g:1664:1: ( 'Drone' )
            {
            // InternalMyDsl.g:1664:1: ( 'Drone' )
            // InternalMyDsl.g:1665:2: 'Drone'
            {
             before(grammarAccess.getDroneAccess().getDroneKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1674:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl rule__Drone__Group__2 ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( rule__Drone__Group__1__Impl rule__Drone__Group__2 )
            // InternalMyDsl.g:1679:2: rule__Drone__Group__1__Impl rule__Drone__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1686:1: rule__Drone__Group__1__Impl : ( ( rule__Drone__NameAssignment_1 ) ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( ( rule__Drone__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1691:1: ( ( rule__Drone__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1691:1: ( ( rule__Drone__NameAssignment_1 ) )
            // InternalMyDsl.g:1692:2: ( rule__Drone__NameAssignment_1 )
            {
             before(grammarAccess.getDroneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1693:2: ( rule__Drone__NameAssignment_1 )
            // InternalMyDsl.g:1693:3: rule__Drone__NameAssignment_1
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
    // InternalMyDsl.g:1701:1: rule__Drone__Group__2 : rule__Drone__Group__2__Impl rule__Drone__Group__3 ;
    public final void rule__Drone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( rule__Drone__Group__2__Impl rule__Drone__Group__3 )
            // InternalMyDsl.g:1706:2: rule__Drone__Group__2__Impl rule__Drone__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1713:1: rule__Drone__Group__2__Impl : ( '{' ) ;
    public final void rule__Drone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( ( '{' ) )
            // InternalMyDsl.g:1718:1: ( '{' )
            {
            // InternalMyDsl.g:1718:1: ( '{' )
            // InternalMyDsl.g:1719:2: '{'
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
    // InternalMyDsl.g:1728:1: rule__Drone__Group__3 : rule__Drone__Group__3__Impl rule__Drone__Group__4 ;
    public final void rule__Drone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( rule__Drone__Group__3__Impl rule__Drone__Group__4 )
            // InternalMyDsl.g:1733:2: rule__Drone__Group__3__Impl rule__Drone__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1740:1: rule__Drone__Group__3__Impl : ( 'modelType' ) ;
    public final void rule__Drone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( 'modelType' ) )
            // InternalMyDsl.g:1745:1: ( 'modelType' )
            {
            // InternalMyDsl.g:1745:1: ( 'modelType' )
            // InternalMyDsl.g:1746:2: 'modelType'
            {
             before(grammarAccess.getDroneAccess().getModelTypeKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getModelTypeKeyword_3()); 

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
    // InternalMyDsl.g:1755:1: rule__Drone__Group__4 : rule__Drone__Group__4__Impl rule__Drone__Group__5 ;
    public final void rule__Drone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( rule__Drone__Group__4__Impl rule__Drone__Group__5 )
            // InternalMyDsl.g:1760:2: rule__Drone__Group__4__Impl rule__Drone__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1767:1: rule__Drone__Group__4__Impl : ( '=' ) ;
    public final void rule__Drone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( ( '=' ) )
            // InternalMyDsl.g:1772:1: ( '=' )
            {
            // InternalMyDsl.g:1772:1: ( '=' )
            // InternalMyDsl.g:1773:2: '='
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
    // InternalMyDsl.g:1782:1: rule__Drone__Group__5 : rule__Drone__Group__5__Impl rule__Drone__Group__6 ;
    public final void rule__Drone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( rule__Drone__Group__5__Impl rule__Drone__Group__6 )
            // InternalMyDsl.g:1787:2: rule__Drone__Group__5__Impl rule__Drone__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1794:1: rule__Drone__Group__5__Impl : ( ( rule__Drone__TypeAssignment_5 ) ) ;
    public final void rule__Drone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( ( rule__Drone__TypeAssignment_5 ) ) )
            // InternalMyDsl.g:1799:1: ( ( rule__Drone__TypeAssignment_5 ) )
            {
            // InternalMyDsl.g:1799:1: ( ( rule__Drone__TypeAssignment_5 ) )
            // InternalMyDsl.g:1800:2: ( rule__Drone__TypeAssignment_5 )
            {
             before(grammarAccess.getDroneAccess().getTypeAssignment_5()); 
            // InternalMyDsl.g:1801:2: ( rule__Drone__TypeAssignment_5 )
            // InternalMyDsl.g:1801:3: rule__Drone__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Drone__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getTypeAssignment_5()); 

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
    // InternalMyDsl.g:1809:1: rule__Drone__Group__6 : rule__Drone__Group__6__Impl rule__Drone__Group__7 ;
    public final void rule__Drone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( rule__Drone__Group__6__Impl rule__Drone__Group__7 )
            // InternalMyDsl.g:1814:2: rule__Drone__Group__6__Impl rule__Drone__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1821:1: rule__Drone__Group__6__Impl : ( 'batterCapacity' ) ;
    public final void rule__Drone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( ( 'batterCapacity' ) )
            // InternalMyDsl.g:1826:1: ( 'batterCapacity' )
            {
            // InternalMyDsl.g:1826:1: ( 'batterCapacity' )
            // InternalMyDsl.g:1827:2: 'batterCapacity'
            {
             before(grammarAccess.getDroneAccess().getBatterCapacityKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getBatterCapacityKeyword_6()); 

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
    // InternalMyDsl.g:1836:1: rule__Drone__Group__7 : rule__Drone__Group__7__Impl rule__Drone__Group__8 ;
    public final void rule__Drone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( rule__Drone__Group__7__Impl rule__Drone__Group__8 )
            // InternalMyDsl.g:1841:2: rule__Drone__Group__7__Impl rule__Drone__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1848:1: rule__Drone__Group__7__Impl : ( '=' ) ;
    public final void rule__Drone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( '=' ) )
            // InternalMyDsl.g:1853:1: ( '=' )
            {
            // InternalMyDsl.g:1853:1: ( '=' )
            // InternalMyDsl.g:1854:2: '='
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
    // InternalMyDsl.g:1863:1: rule__Drone__Group__8 : rule__Drone__Group__8__Impl rule__Drone__Group__9 ;
    public final void rule__Drone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( rule__Drone__Group__8__Impl rule__Drone__Group__9 )
            // InternalMyDsl.g:1868:2: rule__Drone__Group__8__Impl rule__Drone__Group__9
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:1875:1: rule__Drone__Group__8__Impl : ( ( rule__Drone__BatterCapacityAssignment_8 ) ) ;
    public final void rule__Drone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( ( rule__Drone__BatterCapacityAssignment_8 ) ) )
            // InternalMyDsl.g:1880:1: ( ( rule__Drone__BatterCapacityAssignment_8 ) )
            {
            // InternalMyDsl.g:1880:1: ( ( rule__Drone__BatterCapacityAssignment_8 ) )
            // InternalMyDsl.g:1881:2: ( rule__Drone__BatterCapacityAssignment_8 )
            {
             before(grammarAccess.getDroneAccess().getBatterCapacityAssignment_8()); 
            // InternalMyDsl.g:1882:2: ( rule__Drone__BatterCapacityAssignment_8 )
            // InternalMyDsl.g:1882:3: rule__Drone__BatterCapacityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Drone__BatterCapacityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getBatterCapacityAssignment_8()); 

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
    // InternalMyDsl.g:1890:1: rule__Drone__Group__9 : rule__Drone__Group__9__Impl rule__Drone__Group__10 ;
    public final void rule__Drone__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( rule__Drone__Group__9__Impl rule__Drone__Group__10 )
            // InternalMyDsl.g:1895:2: rule__Drone__Group__9__Impl rule__Drone__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Drone__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__10();

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
    // InternalMyDsl.g:1902:1: rule__Drone__Group__9__Impl : ( 'maxFlightTime' ) ;
    public final void rule__Drone__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( ( 'maxFlightTime' ) )
            // InternalMyDsl.g:1907:1: ( 'maxFlightTime' )
            {
            // InternalMyDsl.g:1907:1: ( 'maxFlightTime' )
            // InternalMyDsl.g:1908:2: 'maxFlightTime'
            {
             before(grammarAccess.getDroneAccess().getMaxFlightTimeKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getMaxFlightTimeKeyword_9()); 

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


    // $ANTLR start "rule__Drone__Group__10"
    // InternalMyDsl.g:1917:1: rule__Drone__Group__10 : rule__Drone__Group__10__Impl rule__Drone__Group__11 ;
    public final void rule__Drone__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( rule__Drone__Group__10__Impl rule__Drone__Group__11 )
            // InternalMyDsl.g:1922:2: rule__Drone__Group__10__Impl rule__Drone__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Drone__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__11();

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
    // $ANTLR end "rule__Drone__Group__10"


    // $ANTLR start "rule__Drone__Group__10__Impl"
    // InternalMyDsl.g:1929:1: rule__Drone__Group__10__Impl : ( '=' ) ;
    public final void rule__Drone__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( '=' ) )
            // InternalMyDsl.g:1934:1: ( '=' )
            {
            // InternalMyDsl.g:1934:1: ( '=' )
            // InternalMyDsl.g:1935:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_10()); 

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
    // $ANTLR end "rule__Drone__Group__10__Impl"


    // $ANTLR start "rule__Drone__Group__11"
    // InternalMyDsl.g:1944:1: rule__Drone__Group__11 : rule__Drone__Group__11__Impl rule__Drone__Group__12 ;
    public final void rule__Drone__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( rule__Drone__Group__11__Impl rule__Drone__Group__12 )
            // InternalMyDsl.g:1949:2: rule__Drone__Group__11__Impl rule__Drone__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__Drone__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__12();

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
    // $ANTLR end "rule__Drone__Group__11"


    // $ANTLR start "rule__Drone__Group__11__Impl"
    // InternalMyDsl.g:1956:1: rule__Drone__Group__11__Impl : ( ( rule__Drone__MaxFlightTimeAssignment_11 ) ) ;
    public final void rule__Drone__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( ( ( rule__Drone__MaxFlightTimeAssignment_11 ) ) )
            // InternalMyDsl.g:1961:1: ( ( rule__Drone__MaxFlightTimeAssignment_11 ) )
            {
            // InternalMyDsl.g:1961:1: ( ( rule__Drone__MaxFlightTimeAssignment_11 ) )
            // InternalMyDsl.g:1962:2: ( rule__Drone__MaxFlightTimeAssignment_11 )
            {
             before(grammarAccess.getDroneAccess().getMaxFlightTimeAssignment_11()); 
            // InternalMyDsl.g:1963:2: ( rule__Drone__MaxFlightTimeAssignment_11 )
            // InternalMyDsl.g:1963:3: rule__Drone__MaxFlightTimeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Drone__MaxFlightTimeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getMaxFlightTimeAssignment_11()); 

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
    // $ANTLR end "rule__Drone__Group__11__Impl"


    // $ANTLR start "rule__Drone__Group__12"
    // InternalMyDsl.g:1971:1: rule__Drone__Group__12 : rule__Drone__Group__12__Impl rule__Drone__Group__13 ;
    public final void rule__Drone__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( rule__Drone__Group__12__Impl rule__Drone__Group__13 )
            // InternalMyDsl.g:1976:2: rule__Drone__Group__12__Impl rule__Drone__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Drone__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__13();

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
    // $ANTLR end "rule__Drone__Group__12"


    // $ANTLR start "rule__Drone__Group__12__Impl"
    // InternalMyDsl.g:1983:1: rule__Drone__Group__12__Impl : ( 'payloadCapacity' ) ;
    public final void rule__Drone__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( 'payloadCapacity' ) )
            // InternalMyDsl.g:1988:1: ( 'payloadCapacity' )
            {
            // InternalMyDsl.g:1988:1: ( 'payloadCapacity' )
            // InternalMyDsl.g:1989:2: 'payloadCapacity'
            {
             before(grammarAccess.getDroneAccess().getPayloadCapacityKeyword_12()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getPayloadCapacityKeyword_12()); 

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
    // $ANTLR end "rule__Drone__Group__12__Impl"


    // $ANTLR start "rule__Drone__Group__13"
    // InternalMyDsl.g:1998:1: rule__Drone__Group__13 : rule__Drone__Group__13__Impl rule__Drone__Group__14 ;
    public final void rule__Drone__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( rule__Drone__Group__13__Impl rule__Drone__Group__14 )
            // InternalMyDsl.g:2003:2: rule__Drone__Group__13__Impl rule__Drone__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Drone__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__14();

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
    // $ANTLR end "rule__Drone__Group__13"


    // $ANTLR start "rule__Drone__Group__13__Impl"
    // InternalMyDsl.g:2010:1: rule__Drone__Group__13__Impl : ( '=' ) ;
    public final void rule__Drone__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( '=' ) )
            // InternalMyDsl.g:2015:1: ( '=' )
            {
            // InternalMyDsl.g:2015:1: ( '=' )
            // InternalMyDsl.g:2016:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_13()); 

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
    // $ANTLR end "rule__Drone__Group__13__Impl"


    // $ANTLR start "rule__Drone__Group__14"
    // InternalMyDsl.g:2025:1: rule__Drone__Group__14 : rule__Drone__Group__14__Impl rule__Drone__Group__15 ;
    public final void rule__Drone__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( rule__Drone__Group__14__Impl rule__Drone__Group__15 )
            // InternalMyDsl.g:2030:2: rule__Drone__Group__14__Impl rule__Drone__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__Drone__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__15();

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
    // $ANTLR end "rule__Drone__Group__14"


    // $ANTLR start "rule__Drone__Group__14__Impl"
    // InternalMyDsl.g:2037:1: rule__Drone__Group__14__Impl : ( ( rule__Drone__PayloadCapacityAssignment_14 ) ) ;
    public final void rule__Drone__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( ( ( rule__Drone__PayloadCapacityAssignment_14 ) ) )
            // InternalMyDsl.g:2042:1: ( ( rule__Drone__PayloadCapacityAssignment_14 ) )
            {
            // InternalMyDsl.g:2042:1: ( ( rule__Drone__PayloadCapacityAssignment_14 ) )
            // InternalMyDsl.g:2043:2: ( rule__Drone__PayloadCapacityAssignment_14 )
            {
             before(grammarAccess.getDroneAccess().getPayloadCapacityAssignment_14()); 
            // InternalMyDsl.g:2044:2: ( rule__Drone__PayloadCapacityAssignment_14 )
            // InternalMyDsl.g:2044:3: rule__Drone__PayloadCapacityAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Drone__PayloadCapacityAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getPayloadCapacityAssignment_14()); 

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
    // $ANTLR end "rule__Drone__Group__14__Impl"


    // $ANTLR start "rule__Drone__Group__15"
    // InternalMyDsl.g:2052:1: rule__Drone__Group__15 : rule__Drone__Group__15__Impl rule__Drone__Group__16 ;
    public final void rule__Drone__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( rule__Drone__Group__15__Impl rule__Drone__Group__16 )
            // InternalMyDsl.g:2057:2: rule__Drone__Group__15__Impl rule__Drone__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Drone__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__16();

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
    // $ANTLR end "rule__Drone__Group__15"


    // $ANTLR start "rule__Drone__Group__15__Impl"
    // InternalMyDsl.g:2064:1: rule__Drone__Group__15__Impl : ( 'role' ) ;
    public final void rule__Drone__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( 'role' ) )
            // InternalMyDsl.g:2069:1: ( 'role' )
            {
            // InternalMyDsl.g:2069:1: ( 'role' )
            // InternalMyDsl.g:2070:2: 'role'
            {
             before(grammarAccess.getDroneAccess().getRoleKeyword_15()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRoleKeyword_15()); 

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
    // $ANTLR end "rule__Drone__Group__15__Impl"


    // $ANTLR start "rule__Drone__Group__16"
    // InternalMyDsl.g:2079:1: rule__Drone__Group__16 : rule__Drone__Group__16__Impl rule__Drone__Group__17 ;
    public final void rule__Drone__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( rule__Drone__Group__16__Impl rule__Drone__Group__17 )
            // InternalMyDsl.g:2084:2: rule__Drone__Group__16__Impl rule__Drone__Group__17
            {
            pushFollow(FOLLOW_8);
            rule__Drone__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__17();

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
    // $ANTLR end "rule__Drone__Group__16"


    // $ANTLR start "rule__Drone__Group__16__Impl"
    // InternalMyDsl.g:2091:1: rule__Drone__Group__16__Impl : ( '=' ) ;
    public final void rule__Drone__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( ( '=' ) )
            // InternalMyDsl.g:2096:1: ( '=' )
            {
            // InternalMyDsl.g:2096:1: ( '=' )
            // InternalMyDsl.g:2097:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_16()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_16()); 

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
    // $ANTLR end "rule__Drone__Group__16__Impl"


    // $ANTLR start "rule__Drone__Group__17"
    // InternalMyDsl.g:2106:1: rule__Drone__Group__17 : rule__Drone__Group__17__Impl rule__Drone__Group__18 ;
    public final void rule__Drone__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( rule__Drone__Group__17__Impl rule__Drone__Group__18 )
            // InternalMyDsl.g:2111:2: rule__Drone__Group__17__Impl rule__Drone__Group__18
            {
            pushFollow(FOLLOW_27);
            rule__Drone__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__18();

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
    // $ANTLR end "rule__Drone__Group__17"


    // $ANTLR start "rule__Drone__Group__17__Impl"
    // InternalMyDsl.g:2118:1: rule__Drone__Group__17__Impl : ( ( rule__Drone__RoleAssignment_17 ) ) ;
    public final void rule__Drone__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ( rule__Drone__RoleAssignment_17 ) ) )
            // InternalMyDsl.g:2123:1: ( ( rule__Drone__RoleAssignment_17 ) )
            {
            // InternalMyDsl.g:2123:1: ( ( rule__Drone__RoleAssignment_17 ) )
            // InternalMyDsl.g:2124:2: ( rule__Drone__RoleAssignment_17 )
            {
             before(grammarAccess.getDroneAccess().getRoleAssignment_17()); 
            // InternalMyDsl.g:2125:2: ( rule__Drone__RoleAssignment_17 )
            // InternalMyDsl.g:2125:3: rule__Drone__RoleAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Drone__RoleAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getRoleAssignment_17()); 

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
    // $ANTLR end "rule__Drone__Group__17__Impl"


    // $ANTLR start "rule__Drone__Group__18"
    // InternalMyDsl.g:2133:1: rule__Drone__Group__18 : rule__Drone__Group__18__Impl rule__Drone__Group__19 ;
    public final void rule__Drone__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( rule__Drone__Group__18__Impl rule__Drone__Group__19 )
            // InternalMyDsl.g:2138:2: rule__Drone__Group__18__Impl rule__Drone__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__Drone__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__19();

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
    // $ANTLR end "rule__Drone__Group__18"


    // $ANTLR start "rule__Drone__Group__18__Impl"
    // InternalMyDsl.g:2145:1: rule__Drone__Group__18__Impl : ( 'addEnergyModel' ) ;
    public final void rule__Drone__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( ( 'addEnergyModel' ) )
            // InternalMyDsl.g:2150:1: ( 'addEnergyModel' )
            {
            // InternalMyDsl.g:2150:1: ( 'addEnergyModel' )
            // InternalMyDsl.g:2151:2: 'addEnergyModel'
            {
             before(grammarAccess.getDroneAccess().getAddEnergyModelKeyword_18()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getAddEnergyModelKeyword_18()); 

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
    // $ANTLR end "rule__Drone__Group__18__Impl"


    // $ANTLR start "rule__Drone__Group__19"
    // InternalMyDsl.g:2160:1: rule__Drone__Group__19 : rule__Drone__Group__19__Impl rule__Drone__Group__20 ;
    public final void rule__Drone__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( rule__Drone__Group__19__Impl rule__Drone__Group__20 )
            // InternalMyDsl.g:2165:2: rule__Drone__Group__19__Impl rule__Drone__Group__20
            {
            pushFollow(FOLLOW_4);
            rule__Drone__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__20();

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
    // $ANTLR end "rule__Drone__Group__19"


    // $ANTLR start "rule__Drone__Group__19__Impl"
    // InternalMyDsl.g:2172:1: rule__Drone__Group__19__Impl : ( '=' ) ;
    public final void rule__Drone__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( '=' ) )
            // InternalMyDsl.g:2177:1: ( '=' )
            {
            // InternalMyDsl.g:2177:1: ( '=' )
            // InternalMyDsl.g:2178:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_19()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_19()); 

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
    // $ANTLR end "rule__Drone__Group__19__Impl"


    // $ANTLR start "rule__Drone__Group__20"
    // InternalMyDsl.g:2187:1: rule__Drone__Group__20 : rule__Drone__Group__20__Impl rule__Drone__Group__21 ;
    public final void rule__Drone__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( rule__Drone__Group__20__Impl rule__Drone__Group__21 )
            // InternalMyDsl.g:2192:2: rule__Drone__Group__20__Impl rule__Drone__Group__21
            {
            pushFollow(FOLLOW_21);
            rule__Drone__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__21();

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
    // $ANTLR end "rule__Drone__Group__20"


    // $ANTLR start "rule__Drone__Group__20__Impl"
    // InternalMyDsl.g:2199:1: rule__Drone__Group__20__Impl : ( ( rule__Drone__AddEnergyModelAssignment_20 ) ) ;
    public final void rule__Drone__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( ( rule__Drone__AddEnergyModelAssignment_20 ) ) )
            // InternalMyDsl.g:2204:1: ( ( rule__Drone__AddEnergyModelAssignment_20 ) )
            {
            // InternalMyDsl.g:2204:1: ( ( rule__Drone__AddEnergyModelAssignment_20 ) )
            // InternalMyDsl.g:2205:2: ( rule__Drone__AddEnergyModelAssignment_20 )
            {
             before(grammarAccess.getDroneAccess().getAddEnergyModelAssignment_20()); 
            // InternalMyDsl.g:2206:2: ( rule__Drone__AddEnergyModelAssignment_20 )
            // InternalMyDsl.g:2206:3: rule__Drone__AddEnergyModelAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Drone__AddEnergyModelAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getAddEnergyModelAssignment_20()); 

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
    // $ANTLR end "rule__Drone__Group__20__Impl"


    // $ANTLR start "rule__Drone__Group__21"
    // InternalMyDsl.g:2214:1: rule__Drone__Group__21 : rule__Drone__Group__21__Impl rule__Drone__Group__22 ;
    public final void rule__Drone__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( rule__Drone__Group__21__Impl rule__Drone__Group__22 )
            // InternalMyDsl.g:2219:2: rule__Drone__Group__21__Impl rule__Drone__Group__22
            {
            pushFollow(FOLLOW_21);
            rule__Drone__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__22();

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
    // $ANTLR end "rule__Drone__Group__21"


    // $ANTLR start "rule__Drone__Group__21__Impl"
    // InternalMyDsl.g:2226:1: rule__Drone__Group__21__Impl : ( ( rule__Drone__Group_21__0 )* ) ;
    public final void rule__Drone__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( ( rule__Drone__Group_21__0 )* ) )
            // InternalMyDsl.g:2231:1: ( ( rule__Drone__Group_21__0 )* )
            {
            // InternalMyDsl.g:2231:1: ( ( rule__Drone__Group_21__0 )* )
            // InternalMyDsl.g:2232:2: ( rule__Drone__Group_21__0 )*
            {
             before(grammarAccess.getDroneAccess().getGroup_21()); 
            // InternalMyDsl.g:2233:2: ( rule__Drone__Group_21__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:2233:3: rule__Drone__Group_21__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Drone__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDroneAccess().getGroup_21()); 

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
    // $ANTLR end "rule__Drone__Group__21__Impl"


    // $ANTLR start "rule__Drone__Group__22"
    // InternalMyDsl.g:2241:1: rule__Drone__Group__22 : rule__Drone__Group__22__Impl ;
    public final void rule__Drone__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( rule__Drone__Group__22__Impl )
            // InternalMyDsl.g:2246:2: rule__Drone__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__22__Impl();

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
    // $ANTLR end "rule__Drone__Group__22"


    // $ANTLR start "rule__Drone__Group__22__Impl"
    // InternalMyDsl.g:2252:1: rule__Drone__Group__22__Impl : ( '}' ) ;
    public final void rule__Drone__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2256:1: ( ( '}' ) )
            // InternalMyDsl.g:2257:1: ( '}' )
            {
            // InternalMyDsl.g:2257:1: ( '}' )
            // InternalMyDsl.g:2258:2: '}'
            {
             before(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_22()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_22()); 

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
    // $ANTLR end "rule__Drone__Group__22__Impl"


    // $ANTLR start "rule__Drone__Group_21__0"
    // InternalMyDsl.g:2268:1: rule__Drone__Group_21__0 : rule__Drone__Group_21__0__Impl rule__Drone__Group_21__1 ;
    public final void rule__Drone__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( rule__Drone__Group_21__0__Impl rule__Drone__Group_21__1 )
            // InternalMyDsl.g:2273:2: rule__Drone__Group_21__0__Impl rule__Drone__Group_21__1
            {
            pushFollow(FOLLOW_4);
            rule__Drone__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group_21__1();

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
    // $ANTLR end "rule__Drone__Group_21__0"


    // $ANTLR start "rule__Drone__Group_21__0__Impl"
    // InternalMyDsl.g:2280:1: rule__Drone__Group_21__0__Impl : ( ',' ) ;
    public final void rule__Drone__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( ( ',' ) )
            // InternalMyDsl.g:2285:1: ( ',' )
            {
            // InternalMyDsl.g:2285:1: ( ',' )
            // InternalMyDsl.g:2286:2: ','
            {
             before(grammarAccess.getDroneAccess().getCommaKeyword_21_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getCommaKeyword_21_0()); 

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
    // $ANTLR end "rule__Drone__Group_21__0__Impl"


    // $ANTLR start "rule__Drone__Group_21__1"
    // InternalMyDsl.g:2295:1: rule__Drone__Group_21__1 : rule__Drone__Group_21__1__Impl ;
    public final void rule__Drone__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( rule__Drone__Group_21__1__Impl )
            // InternalMyDsl.g:2300:2: rule__Drone__Group_21__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group_21__1__Impl();

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
    // $ANTLR end "rule__Drone__Group_21__1"


    // $ANTLR start "rule__Drone__Group_21__1__Impl"
    // InternalMyDsl.g:2306:1: rule__Drone__Group_21__1__Impl : ( ( rule__Drone__AddEnergyModelAssignment_21_1 ) ) ;
    public final void rule__Drone__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( ( ( rule__Drone__AddEnergyModelAssignment_21_1 ) ) )
            // InternalMyDsl.g:2311:1: ( ( rule__Drone__AddEnergyModelAssignment_21_1 ) )
            {
            // InternalMyDsl.g:2311:1: ( ( rule__Drone__AddEnergyModelAssignment_21_1 ) )
            // InternalMyDsl.g:2312:2: ( rule__Drone__AddEnergyModelAssignment_21_1 )
            {
             before(grammarAccess.getDroneAccess().getAddEnergyModelAssignment_21_1()); 
            // InternalMyDsl.g:2313:2: ( rule__Drone__AddEnergyModelAssignment_21_1 )
            // InternalMyDsl.g:2313:3: rule__Drone__AddEnergyModelAssignment_21_1
            {
            pushFollow(FOLLOW_2);
            rule__Drone__AddEnergyModelAssignment_21_1();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getAddEnergyModelAssignment_21_1()); 

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
    // $ANTLR end "rule__Drone__Group_21__1__Impl"


    // $ANTLR start "rule__EnergyModel__Group__0"
    // InternalMyDsl.g:2322:1: rule__EnergyModel__Group__0 : rule__EnergyModel__Group__0__Impl rule__EnergyModel__Group__1 ;
    public final void rule__EnergyModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( rule__EnergyModel__Group__0__Impl rule__EnergyModel__Group__1 )
            // InternalMyDsl.g:2327:2: rule__EnergyModel__Group__0__Impl rule__EnergyModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EnergyModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__1();

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
    // $ANTLR end "rule__EnergyModel__Group__0"


    // $ANTLR start "rule__EnergyModel__Group__0__Impl"
    // InternalMyDsl.g:2334:1: rule__EnergyModel__Group__0__Impl : ( 'EnergyModel' ) ;
    public final void rule__EnergyModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( 'EnergyModel' ) )
            // InternalMyDsl.g:2339:1: ( 'EnergyModel' )
            {
            // InternalMyDsl.g:2339:1: ( 'EnergyModel' )
            // InternalMyDsl.g:2340:2: 'EnergyModel'
            {
             before(grammarAccess.getEnergyModelAccess().getEnergyModelKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getEnergyModelKeyword_0()); 

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
    // $ANTLR end "rule__EnergyModel__Group__0__Impl"


    // $ANTLR start "rule__EnergyModel__Group__1"
    // InternalMyDsl.g:2349:1: rule__EnergyModel__Group__1 : rule__EnergyModel__Group__1__Impl rule__EnergyModel__Group__2 ;
    public final void rule__EnergyModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( rule__EnergyModel__Group__1__Impl rule__EnergyModel__Group__2 )
            // InternalMyDsl.g:2354:2: rule__EnergyModel__Group__1__Impl rule__EnergyModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EnergyModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__2();

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
    // $ANTLR end "rule__EnergyModel__Group__1"


    // $ANTLR start "rule__EnergyModel__Group__1__Impl"
    // InternalMyDsl.g:2361:1: rule__EnergyModel__Group__1__Impl : ( ( rule__EnergyModel__NameAssignment_1 ) ) ;
    public final void rule__EnergyModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ( rule__EnergyModel__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2366:1: ( ( rule__EnergyModel__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2366:1: ( ( rule__EnergyModel__NameAssignment_1 ) )
            // InternalMyDsl.g:2367:2: ( rule__EnergyModel__NameAssignment_1 )
            {
             before(grammarAccess.getEnergyModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2368:2: ( rule__EnergyModel__NameAssignment_1 )
            // InternalMyDsl.g:2368:3: rule__EnergyModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnergyModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnergyModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EnergyModel__Group__1__Impl"


    // $ANTLR start "rule__EnergyModel__Group__2"
    // InternalMyDsl.g:2376:1: rule__EnergyModel__Group__2 : rule__EnergyModel__Group__2__Impl rule__EnergyModel__Group__3 ;
    public final void rule__EnergyModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( rule__EnergyModel__Group__2__Impl rule__EnergyModel__Group__3 )
            // InternalMyDsl.g:2381:2: rule__EnergyModel__Group__2__Impl rule__EnergyModel__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__EnergyModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__3();

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
    // $ANTLR end "rule__EnergyModel__Group__2"


    // $ANTLR start "rule__EnergyModel__Group__2__Impl"
    // InternalMyDsl.g:2388:1: rule__EnergyModel__Group__2__Impl : ( '{' ) ;
    public final void rule__EnergyModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( ( '{' ) )
            // InternalMyDsl.g:2393:1: ( '{' )
            {
            // InternalMyDsl.g:2393:1: ( '{' )
            // InternalMyDsl.g:2394:2: '{'
            {
             before(grammarAccess.getEnergyModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EnergyModel__Group__2__Impl"


    // $ANTLR start "rule__EnergyModel__Group__3"
    // InternalMyDsl.g:2403:1: rule__EnergyModel__Group__3 : rule__EnergyModel__Group__3__Impl rule__EnergyModel__Group__4 ;
    public final void rule__EnergyModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( rule__EnergyModel__Group__3__Impl rule__EnergyModel__Group__4 )
            // InternalMyDsl.g:2408:2: rule__EnergyModel__Group__3__Impl rule__EnergyModel__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__EnergyModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__4();

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
    // $ANTLR end "rule__EnergyModel__Group__3"


    // $ANTLR start "rule__EnergyModel__Group__3__Impl"
    // InternalMyDsl.g:2415:1: rule__EnergyModel__Group__3__Impl : ( 'consumptionRate' ) ;
    public final void rule__EnergyModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( ( 'consumptionRate' ) )
            // InternalMyDsl.g:2420:1: ( 'consumptionRate' )
            {
            // InternalMyDsl.g:2420:1: ( 'consumptionRate' )
            // InternalMyDsl.g:2421:2: 'consumptionRate'
            {
             before(grammarAccess.getEnergyModelAccess().getConsumptionRateKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getConsumptionRateKeyword_3()); 

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
    // $ANTLR end "rule__EnergyModel__Group__3__Impl"


    // $ANTLR start "rule__EnergyModel__Group__4"
    // InternalMyDsl.g:2430:1: rule__EnergyModel__Group__4 : rule__EnergyModel__Group__4__Impl rule__EnergyModel__Group__5 ;
    public final void rule__EnergyModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( rule__EnergyModel__Group__4__Impl rule__EnergyModel__Group__5 )
            // InternalMyDsl.g:2435:2: rule__EnergyModel__Group__4__Impl rule__EnergyModel__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__EnergyModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__5();

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
    // $ANTLR end "rule__EnergyModel__Group__4"


    // $ANTLR start "rule__EnergyModel__Group__4__Impl"
    // InternalMyDsl.g:2442:1: rule__EnergyModel__Group__4__Impl : ( '=' ) ;
    public final void rule__EnergyModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( '=' ) )
            // InternalMyDsl.g:2447:1: ( '=' )
            {
            // InternalMyDsl.g:2447:1: ( '=' )
            // InternalMyDsl.g:2448:2: '='
            {
             before(grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__EnergyModel__Group__4__Impl"


    // $ANTLR start "rule__EnergyModel__Group__5"
    // InternalMyDsl.g:2457:1: rule__EnergyModel__Group__5 : rule__EnergyModel__Group__5__Impl rule__EnergyModel__Group__6 ;
    public final void rule__EnergyModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( rule__EnergyModel__Group__5__Impl rule__EnergyModel__Group__6 )
            // InternalMyDsl.g:2462:2: rule__EnergyModel__Group__5__Impl rule__EnergyModel__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__EnergyModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__6();

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
    // $ANTLR end "rule__EnergyModel__Group__5"


    // $ANTLR start "rule__EnergyModel__Group__5__Impl"
    // InternalMyDsl.g:2469:1: rule__EnergyModel__Group__5__Impl : ( ( rule__EnergyModel__ConsumptionRateAssignment_5 ) ) ;
    public final void rule__EnergyModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( ( ( rule__EnergyModel__ConsumptionRateAssignment_5 ) ) )
            // InternalMyDsl.g:2474:1: ( ( rule__EnergyModel__ConsumptionRateAssignment_5 ) )
            {
            // InternalMyDsl.g:2474:1: ( ( rule__EnergyModel__ConsumptionRateAssignment_5 ) )
            // InternalMyDsl.g:2475:2: ( rule__EnergyModel__ConsumptionRateAssignment_5 )
            {
             before(grammarAccess.getEnergyModelAccess().getConsumptionRateAssignment_5()); 
            // InternalMyDsl.g:2476:2: ( rule__EnergyModel__ConsumptionRateAssignment_5 )
            // InternalMyDsl.g:2476:3: rule__EnergyModel__ConsumptionRateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EnergyModel__ConsumptionRateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnergyModelAccess().getConsumptionRateAssignment_5()); 

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
    // $ANTLR end "rule__EnergyModel__Group__5__Impl"


    // $ANTLR start "rule__EnergyModel__Group__6"
    // InternalMyDsl.g:2484:1: rule__EnergyModel__Group__6 : rule__EnergyModel__Group__6__Impl rule__EnergyModel__Group__7 ;
    public final void rule__EnergyModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( rule__EnergyModel__Group__6__Impl rule__EnergyModel__Group__7 )
            // InternalMyDsl.g:2489:2: rule__EnergyModel__Group__6__Impl rule__EnergyModel__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__EnergyModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__7();

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
    // $ANTLR end "rule__EnergyModel__Group__6"


    // $ANTLR start "rule__EnergyModel__Group__6__Impl"
    // InternalMyDsl.g:2496:1: rule__EnergyModel__Group__6__Impl : ( 'batteryHealth' ) ;
    public final void rule__EnergyModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( ( 'batteryHealth' ) )
            // InternalMyDsl.g:2501:1: ( 'batteryHealth' )
            {
            // InternalMyDsl.g:2501:1: ( 'batteryHealth' )
            // InternalMyDsl.g:2502:2: 'batteryHealth'
            {
             before(grammarAccess.getEnergyModelAccess().getBatteryHealthKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getBatteryHealthKeyword_6()); 

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
    // $ANTLR end "rule__EnergyModel__Group__6__Impl"


    // $ANTLR start "rule__EnergyModel__Group__7"
    // InternalMyDsl.g:2511:1: rule__EnergyModel__Group__7 : rule__EnergyModel__Group__7__Impl rule__EnergyModel__Group__8 ;
    public final void rule__EnergyModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( rule__EnergyModel__Group__7__Impl rule__EnergyModel__Group__8 )
            // InternalMyDsl.g:2516:2: rule__EnergyModel__Group__7__Impl rule__EnergyModel__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__EnergyModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__8();

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
    // $ANTLR end "rule__EnergyModel__Group__7"


    // $ANTLR start "rule__EnergyModel__Group__7__Impl"
    // InternalMyDsl.g:2523:1: rule__EnergyModel__Group__7__Impl : ( '=' ) ;
    public final void rule__EnergyModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( '=' ) )
            // InternalMyDsl.g:2528:1: ( '=' )
            {
            // InternalMyDsl.g:2528:1: ( '=' )
            // InternalMyDsl.g:2529:2: '='
            {
             before(grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_7()); 

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
    // $ANTLR end "rule__EnergyModel__Group__7__Impl"


    // $ANTLR start "rule__EnergyModel__Group__8"
    // InternalMyDsl.g:2538:1: rule__EnergyModel__Group__8 : rule__EnergyModel__Group__8__Impl rule__EnergyModel__Group__9 ;
    public final void rule__EnergyModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( rule__EnergyModel__Group__8__Impl rule__EnergyModel__Group__9 )
            // InternalMyDsl.g:2543:2: rule__EnergyModel__Group__8__Impl rule__EnergyModel__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__EnergyModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__9();

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
    // $ANTLR end "rule__EnergyModel__Group__8"


    // $ANTLR start "rule__EnergyModel__Group__8__Impl"
    // InternalMyDsl.g:2550:1: rule__EnergyModel__Group__8__Impl : ( ( rule__EnergyModel__BatteryHealthAssignment_8 ) ) ;
    public final void rule__EnergyModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2554:1: ( ( ( rule__EnergyModel__BatteryHealthAssignment_8 ) ) )
            // InternalMyDsl.g:2555:1: ( ( rule__EnergyModel__BatteryHealthAssignment_8 ) )
            {
            // InternalMyDsl.g:2555:1: ( ( rule__EnergyModel__BatteryHealthAssignment_8 ) )
            // InternalMyDsl.g:2556:2: ( rule__EnergyModel__BatteryHealthAssignment_8 )
            {
             before(grammarAccess.getEnergyModelAccess().getBatteryHealthAssignment_8()); 
            // InternalMyDsl.g:2557:2: ( rule__EnergyModel__BatteryHealthAssignment_8 )
            // InternalMyDsl.g:2557:3: rule__EnergyModel__BatteryHealthAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__EnergyModel__BatteryHealthAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEnergyModelAccess().getBatteryHealthAssignment_8()); 

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
    // $ANTLR end "rule__EnergyModel__Group__8__Impl"


    // $ANTLR start "rule__EnergyModel__Group__9"
    // InternalMyDsl.g:2565:1: rule__EnergyModel__Group__9 : rule__EnergyModel__Group__9__Impl rule__EnergyModel__Group__10 ;
    public final void rule__EnergyModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( rule__EnergyModel__Group__9__Impl rule__EnergyModel__Group__10 )
            // InternalMyDsl.g:2570:2: rule__EnergyModel__Group__9__Impl rule__EnergyModel__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__EnergyModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__10();

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
    // $ANTLR end "rule__EnergyModel__Group__9"


    // $ANTLR start "rule__EnergyModel__Group__9__Impl"
    // InternalMyDsl.g:2577:1: rule__EnergyModel__Group__9__Impl : ( 'rechargeTime' ) ;
    public final void rule__EnergyModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( 'rechargeTime' ) )
            // InternalMyDsl.g:2582:1: ( 'rechargeTime' )
            {
            // InternalMyDsl.g:2582:1: ( 'rechargeTime' )
            // InternalMyDsl.g:2583:2: 'rechargeTime'
            {
             before(grammarAccess.getEnergyModelAccess().getRechargeTimeKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getRechargeTimeKeyword_9()); 

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
    // $ANTLR end "rule__EnergyModel__Group__9__Impl"


    // $ANTLR start "rule__EnergyModel__Group__10"
    // InternalMyDsl.g:2592:1: rule__EnergyModel__Group__10 : rule__EnergyModel__Group__10__Impl rule__EnergyModel__Group__11 ;
    public final void rule__EnergyModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( rule__EnergyModel__Group__10__Impl rule__EnergyModel__Group__11 )
            // InternalMyDsl.g:2597:2: rule__EnergyModel__Group__10__Impl rule__EnergyModel__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__EnergyModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__11();

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
    // $ANTLR end "rule__EnergyModel__Group__10"


    // $ANTLR start "rule__EnergyModel__Group__10__Impl"
    // InternalMyDsl.g:2604:1: rule__EnergyModel__Group__10__Impl : ( '=' ) ;
    public final void rule__EnergyModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( ( '=' ) )
            // InternalMyDsl.g:2609:1: ( '=' )
            {
            // InternalMyDsl.g:2609:1: ( '=' )
            // InternalMyDsl.g:2610:2: '='
            {
             before(grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_10()); 

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
    // $ANTLR end "rule__EnergyModel__Group__10__Impl"


    // $ANTLR start "rule__EnergyModel__Group__11"
    // InternalMyDsl.g:2619:1: rule__EnergyModel__Group__11 : rule__EnergyModel__Group__11__Impl rule__EnergyModel__Group__12 ;
    public final void rule__EnergyModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( rule__EnergyModel__Group__11__Impl rule__EnergyModel__Group__12 )
            // InternalMyDsl.g:2624:2: rule__EnergyModel__Group__11__Impl rule__EnergyModel__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__EnergyModel__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__12();

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
    // $ANTLR end "rule__EnergyModel__Group__11"


    // $ANTLR start "rule__EnergyModel__Group__11__Impl"
    // InternalMyDsl.g:2631:1: rule__EnergyModel__Group__11__Impl : ( ( rule__EnergyModel__CapacityAssignment_11 ) ) ;
    public final void rule__EnergyModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( ( ( rule__EnergyModel__CapacityAssignment_11 ) ) )
            // InternalMyDsl.g:2636:1: ( ( rule__EnergyModel__CapacityAssignment_11 ) )
            {
            // InternalMyDsl.g:2636:1: ( ( rule__EnergyModel__CapacityAssignment_11 ) )
            // InternalMyDsl.g:2637:2: ( rule__EnergyModel__CapacityAssignment_11 )
            {
             before(grammarAccess.getEnergyModelAccess().getCapacityAssignment_11()); 
            // InternalMyDsl.g:2638:2: ( rule__EnergyModel__CapacityAssignment_11 )
            // InternalMyDsl.g:2638:3: rule__EnergyModel__CapacityAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__EnergyModel__CapacityAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEnergyModelAccess().getCapacityAssignment_11()); 

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
    // $ANTLR end "rule__EnergyModel__Group__11__Impl"


    // $ANTLR start "rule__EnergyModel__Group__12"
    // InternalMyDsl.g:2646:1: rule__EnergyModel__Group__12 : rule__EnergyModel__Group__12__Impl ;
    public final void rule__EnergyModel__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2650:1: ( rule__EnergyModel__Group__12__Impl )
            // InternalMyDsl.g:2651:2: rule__EnergyModel__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnergyModel__Group__12__Impl();

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
    // $ANTLR end "rule__EnergyModel__Group__12"


    // $ANTLR start "rule__EnergyModel__Group__12__Impl"
    // InternalMyDsl.g:2657:1: rule__EnergyModel__Group__12__Impl : ( '}' ) ;
    public final void rule__EnergyModel__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2661:1: ( ( '}' ) )
            // InternalMyDsl.g:2662:1: ( '}' )
            {
            // InternalMyDsl.g:2662:1: ( '}' )
            // InternalMyDsl.g:2663:2: '}'
            {
             before(grammarAccess.getEnergyModelAccess().getRightCurlyBracketKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__EnergyModel__Group__12__Impl"


    // $ANTLR start "rule__Phase__Group__0"
    // InternalMyDsl.g:2673:1: rule__Phase__Group__0 : rule__Phase__Group__0__Impl rule__Phase__Group__1 ;
    public final void rule__Phase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2677:1: ( rule__Phase__Group__0__Impl rule__Phase__Group__1 )
            // InternalMyDsl.g:2678:2: rule__Phase__Group__0__Impl rule__Phase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Phase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__1();

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
    // $ANTLR end "rule__Phase__Group__0"


    // $ANTLR start "rule__Phase__Group__0__Impl"
    // InternalMyDsl.g:2685:1: rule__Phase__Group__0__Impl : ( 'Phase' ) ;
    public final void rule__Phase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2689:1: ( ( 'Phase' ) )
            // InternalMyDsl.g:2690:1: ( 'Phase' )
            {
            // InternalMyDsl.g:2690:1: ( 'Phase' )
            // InternalMyDsl.g:2691:2: 'Phase'
            {
             before(grammarAccess.getPhaseAccess().getPhaseKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getPhaseKeyword_0()); 

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
    // $ANTLR end "rule__Phase__Group__0__Impl"


    // $ANTLR start "rule__Phase__Group__1"
    // InternalMyDsl.g:2700:1: rule__Phase__Group__1 : rule__Phase__Group__1__Impl rule__Phase__Group__2 ;
    public final void rule__Phase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( rule__Phase__Group__1__Impl rule__Phase__Group__2 )
            // InternalMyDsl.g:2705:2: rule__Phase__Group__1__Impl rule__Phase__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Phase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__2();

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
    // $ANTLR end "rule__Phase__Group__1"


    // $ANTLR start "rule__Phase__Group__1__Impl"
    // InternalMyDsl.g:2712:1: rule__Phase__Group__1__Impl : ( ( rule__Phase__NameAssignment_1 ) ) ;
    public final void rule__Phase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( ( rule__Phase__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2717:1: ( ( rule__Phase__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2717:1: ( ( rule__Phase__NameAssignment_1 ) )
            // InternalMyDsl.g:2718:2: ( rule__Phase__NameAssignment_1 )
            {
             before(grammarAccess.getPhaseAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2719:2: ( rule__Phase__NameAssignment_1 )
            // InternalMyDsl.g:2719:3: rule__Phase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Phase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Phase__Group__1__Impl"


    // $ANTLR start "rule__Phase__Group__2"
    // InternalMyDsl.g:2727:1: rule__Phase__Group__2 : rule__Phase__Group__2__Impl rule__Phase__Group__3 ;
    public final void rule__Phase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( rule__Phase__Group__2__Impl rule__Phase__Group__3 )
            // InternalMyDsl.g:2732:2: rule__Phase__Group__2__Impl rule__Phase__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Phase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__3();

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
    // $ANTLR end "rule__Phase__Group__2"


    // $ANTLR start "rule__Phase__Group__2__Impl"
    // InternalMyDsl.g:2739:1: rule__Phase__Group__2__Impl : ( '{' ) ;
    public final void rule__Phase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( ( '{' ) )
            // InternalMyDsl.g:2744:1: ( '{' )
            {
            // InternalMyDsl.g:2744:1: ( '{' )
            // InternalMyDsl.g:2745:2: '{'
            {
             before(grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Phase__Group__2__Impl"


    // $ANTLR start "rule__Phase__Group__3"
    // InternalMyDsl.g:2754:1: rule__Phase__Group__3 : rule__Phase__Group__3__Impl rule__Phase__Group__4 ;
    public final void rule__Phase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( rule__Phase__Group__3__Impl rule__Phase__Group__4 )
            // InternalMyDsl.g:2759:2: rule__Phase__Group__3__Impl rule__Phase__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Phase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__4();

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
    // $ANTLR end "rule__Phase__Group__3"


    // $ANTLR start "rule__Phase__Group__3__Impl"
    // InternalMyDsl.g:2766:1: rule__Phase__Group__3__Impl : ( 'phaseType' ) ;
    public final void rule__Phase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2770:1: ( ( 'phaseType' ) )
            // InternalMyDsl.g:2771:1: ( 'phaseType' )
            {
            // InternalMyDsl.g:2771:1: ( 'phaseType' )
            // InternalMyDsl.g:2772:2: 'phaseType'
            {
             before(grammarAccess.getPhaseAccess().getPhaseTypeKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getPhaseTypeKeyword_3()); 

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
    // $ANTLR end "rule__Phase__Group__3__Impl"


    // $ANTLR start "rule__Phase__Group__4"
    // InternalMyDsl.g:2781:1: rule__Phase__Group__4 : rule__Phase__Group__4__Impl rule__Phase__Group__5 ;
    public final void rule__Phase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2785:1: ( rule__Phase__Group__4__Impl rule__Phase__Group__5 )
            // InternalMyDsl.g:2786:2: rule__Phase__Group__4__Impl rule__Phase__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Phase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__5();

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
    // $ANTLR end "rule__Phase__Group__4"


    // $ANTLR start "rule__Phase__Group__4__Impl"
    // InternalMyDsl.g:2793:1: rule__Phase__Group__4__Impl : ( '=' ) ;
    public final void rule__Phase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( ( '=' ) )
            // InternalMyDsl.g:2798:1: ( '=' )
            {
            // InternalMyDsl.g:2798:1: ( '=' )
            // InternalMyDsl.g:2799:2: '='
            {
             before(grammarAccess.getPhaseAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Phase__Group__4__Impl"


    // $ANTLR start "rule__Phase__Group__5"
    // InternalMyDsl.g:2808:1: rule__Phase__Group__5 : rule__Phase__Group__5__Impl rule__Phase__Group__6 ;
    public final void rule__Phase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2812:1: ( rule__Phase__Group__5__Impl rule__Phase__Group__6 )
            // InternalMyDsl.g:2813:2: rule__Phase__Group__5__Impl rule__Phase__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Phase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__6();

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
    // $ANTLR end "rule__Phase__Group__5"


    // $ANTLR start "rule__Phase__Group__5__Impl"
    // InternalMyDsl.g:2820:1: rule__Phase__Group__5__Impl : ( ( rule__Phase__PhaseTypeAssignment_5 ) ) ;
    public final void rule__Phase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( ( ( rule__Phase__PhaseTypeAssignment_5 ) ) )
            // InternalMyDsl.g:2825:1: ( ( rule__Phase__PhaseTypeAssignment_5 ) )
            {
            // InternalMyDsl.g:2825:1: ( ( rule__Phase__PhaseTypeAssignment_5 ) )
            // InternalMyDsl.g:2826:2: ( rule__Phase__PhaseTypeAssignment_5 )
            {
             before(grammarAccess.getPhaseAccess().getPhaseTypeAssignment_5()); 
            // InternalMyDsl.g:2827:2: ( rule__Phase__PhaseTypeAssignment_5 )
            // InternalMyDsl.g:2827:3: rule__Phase__PhaseTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Phase__PhaseTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getPhaseTypeAssignment_5()); 

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
    // $ANTLR end "rule__Phase__Group__5__Impl"


    // $ANTLR start "rule__Phase__Group__6"
    // InternalMyDsl.g:2835:1: rule__Phase__Group__6 : rule__Phase__Group__6__Impl rule__Phase__Group__7 ;
    public final void rule__Phase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2839:1: ( rule__Phase__Group__6__Impl rule__Phase__Group__7 )
            // InternalMyDsl.g:2840:2: rule__Phase__Group__6__Impl rule__Phase__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Phase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__7();

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
    // $ANTLR end "rule__Phase__Group__6"


    // $ANTLR start "rule__Phase__Group__6__Impl"
    // InternalMyDsl.g:2847:1: rule__Phase__Group__6__Impl : ( 'energyUsage' ) ;
    public final void rule__Phase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2851:1: ( ( 'energyUsage' ) )
            // InternalMyDsl.g:2852:1: ( 'energyUsage' )
            {
            // InternalMyDsl.g:2852:1: ( 'energyUsage' )
            // InternalMyDsl.g:2853:2: 'energyUsage'
            {
             before(grammarAccess.getPhaseAccess().getEnergyUsageKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getEnergyUsageKeyword_6()); 

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
    // $ANTLR end "rule__Phase__Group__6__Impl"


    // $ANTLR start "rule__Phase__Group__7"
    // InternalMyDsl.g:2862:1: rule__Phase__Group__7 : rule__Phase__Group__7__Impl rule__Phase__Group__8 ;
    public final void rule__Phase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2866:1: ( rule__Phase__Group__7__Impl rule__Phase__Group__8 )
            // InternalMyDsl.g:2867:2: rule__Phase__Group__7__Impl rule__Phase__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Phase__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__8();

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
    // $ANTLR end "rule__Phase__Group__7"


    // $ANTLR start "rule__Phase__Group__7__Impl"
    // InternalMyDsl.g:2874:1: rule__Phase__Group__7__Impl : ( '=' ) ;
    public final void rule__Phase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( ( '=' ) )
            // InternalMyDsl.g:2879:1: ( '=' )
            {
            // InternalMyDsl.g:2879:1: ( '=' )
            // InternalMyDsl.g:2880:2: '='
            {
             before(grammarAccess.getPhaseAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getEqualsSignKeyword_7()); 

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
    // $ANTLR end "rule__Phase__Group__7__Impl"


    // $ANTLR start "rule__Phase__Group__8"
    // InternalMyDsl.g:2889:1: rule__Phase__Group__8 : rule__Phase__Group__8__Impl rule__Phase__Group__9 ;
    public final void rule__Phase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2893:1: ( rule__Phase__Group__8__Impl rule__Phase__Group__9 )
            // InternalMyDsl.g:2894:2: rule__Phase__Group__8__Impl rule__Phase__Group__9
            {
            pushFollow(FOLLOW_34);
            rule__Phase__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__9();

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
    // $ANTLR end "rule__Phase__Group__8"


    // $ANTLR start "rule__Phase__Group__8__Impl"
    // InternalMyDsl.g:2901:1: rule__Phase__Group__8__Impl : ( ( rule__Phase__EnergyUsageAssignment_8 ) ) ;
    public final void rule__Phase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( ( ( rule__Phase__EnergyUsageAssignment_8 ) ) )
            // InternalMyDsl.g:2906:1: ( ( rule__Phase__EnergyUsageAssignment_8 ) )
            {
            // InternalMyDsl.g:2906:1: ( ( rule__Phase__EnergyUsageAssignment_8 ) )
            // InternalMyDsl.g:2907:2: ( rule__Phase__EnergyUsageAssignment_8 )
            {
             before(grammarAccess.getPhaseAccess().getEnergyUsageAssignment_8()); 
            // InternalMyDsl.g:2908:2: ( rule__Phase__EnergyUsageAssignment_8 )
            // InternalMyDsl.g:2908:3: rule__Phase__EnergyUsageAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Phase__EnergyUsageAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getEnergyUsageAssignment_8()); 

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
    // $ANTLR end "rule__Phase__Group__8__Impl"


    // $ANTLR start "rule__Phase__Group__9"
    // InternalMyDsl.g:2916:1: rule__Phase__Group__9 : rule__Phase__Group__9__Impl rule__Phase__Group__10 ;
    public final void rule__Phase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( rule__Phase__Group__9__Impl rule__Phase__Group__10 )
            // InternalMyDsl.g:2921:2: rule__Phase__Group__9__Impl rule__Phase__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Phase__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__10();

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
    // $ANTLR end "rule__Phase__Group__9"


    // $ANTLR start "rule__Phase__Group__9__Impl"
    // InternalMyDsl.g:2928:1: rule__Phase__Group__9__Impl : ( 'addSubPhase' ) ;
    public final void rule__Phase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( ( 'addSubPhase' ) )
            // InternalMyDsl.g:2933:1: ( 'addSubPhase' )
            {
            // InternalMyDsl.g:2933:1: ( 'addSubPhase' )
            // InternalMyDsl.g:2934:2: 'addSubPhase'
            {
             before(grammarAccess.getPhaseAccess().getAddSubPhaseKeyword_9()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getAddSubPhaseKeyword_9()); 

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
    // $ANTLR end "rule__Phase__Group__9__Impl"


    // $ANTLR start "rule__Phase__Group__10"
    // InternalMyDsl.g:2943:1: rule__Phase__Group__10 : rule__Phase__Group__10__Impl rule__Phase__Group__11 ;
    public final void rule__Phase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2947:1: ( rule__Phase__Group__10__Impl rule__Phase__Group__11 )
            // InternalMyDsl.g:2948:2: rule__Phase__Group__10__Impl rule__Phase__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Phase__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__11();

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
    // $ANTLR end "rule__Phase__Group__10"


    // $ANTLR start "rule__Phase__Group__10__Impl"
    // InternalMyDsl.g:2955:1: rule__Phase__Group__10__Impl : ( '=' ) ;
    public final void rule__Phase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2959:1: ( ( '=' ) )
            // InternalMyDsl.g:2960:1: ( '=' )
            {
            // InternalMyDsl.g:2960:1: ( '=' )
            // InternalMyDsl.g:2961:2: '='
            {
             before(grammarAccess.getPhaseAccess().getEqualsSignKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getEqualsSignKeyword_10()); 

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
    // $ANTLR end "rule__Phase__Group__10__Impl"


    // $ANTLR start "rule__Phase__Group__11"
    // InternalMyDsl.g:2970:1: rule__Phase__Group__11 : rule__Phase__Group__11__Impl rule__Phase__Group__12 ;
    public final void rule__Phase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2974:1: ( rule__Phase__Group__11__Impl rule__Phase__Group__12 )
            // InternalMyDsl.g:2975:2: rule__Phase__Group__11__Impl rule__Phase__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__Phase__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__12();

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
    // $ANTLR end "rule__Phase__Group__11"


    // $ANTLR start "rule__Phase__Group__11__Impl"
    // InternalMyDsl.g:2982:1: rule__Phase__Group__11__Impl : ( ( rule__Phase__AddSubPhaseAssignment_11 ) ) ;
    public final void rule__Phase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( ( ( rule__Phase__AddSubPhaseAssignment_11 ) ) )
            // InternalMyDsl.g:2987:1: ( ( rule__Phase__AddSubPhaseAssignment_11 ) )
            {
            // InternalMyDsl.g:2987:1: ( ( rule__Phase__AddSubPhaseAssignment_11 ) )
            // InternalMyDsl.g:2988:2: ( rule__Phase__AddSubPhaseAssignment_11 )
            {
             before(grammarAccess.getPhaseAccess().getAddSubPhaseAssignment_11()); 
            // InternalMyDsl.g:2989:2: ( rule__Phase__AddSubPhaseAssignment_11 )
            // InternalMyDsl.g:2989:3: rule__Phase__AddSubPhaseAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Phase__AddSubPhaseAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getAddSubPhaseAssignment_11()); 

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
    // $ANTLR end "rule__Phase__Group__11__Impl"


    // $ANTLR start "rule__Phase__Group__12"
    // InternalMyDsl.g:2997:1: rule__Phase__Group__12 : rule__Phase__Group__12__Impl rule__Phase__Group__13 ;
    public final void rule__Phase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( rule__Phase__Group__12__Impl rule__Phase__Group__13 )
            // InternalMyDsl.g:3002:2: rule__Phase__Group__12__Impl rule__Phase__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__Phase__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__13();

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
    // $ANTLR end "rule__Phase__Group__12"


    // $ANTLR start "rule__Phase__Group__12__Impl"
    // InternalMyDsl.g:3009:1: rule__Phase__Group__12__Impl : ( ( rule__Phase__Group_12__0 )* ) ;
    public final void rule__Phase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( ( ( rule__Phase__Group_12__0 )* ) )
            // InternalMyDsl.g:3014:1: ( ( rule__Phase__Group_12__0 )* )
            {
            // InternalMyDsl.g:3014:1: ( ( rule__Phase__Group_12__0 )* )
            // InternalMyDsl.g:3015:2: ( rule__Phase__Group_12__0 )*
            {
             before(grammarAccess.getPhaseAccess().getGroup_12()); 
            // InternalMyDsl.g:3016:2: ( rule__Phase__Group_12__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:3016:3: rule__Phase__Group_12__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Phase__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPhaseAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Phase__Group__12__Impl"


    // $ANTLR start "rule__Phase__Group__13"
    // InternalMyDsl.g:3024:1: rule__Phase__Group__13 : rule__Phase__Group__13__Impl ;
    public final void rule__Phase__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3028:1: ( rule__Phase__Group__13__Impl )
            // InternalMyDsl.g:3029:2: rule__Phase__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group__13__Impl();

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
    // $ANTLR end "rule__Phase__Group__13"


    // $ANTLR start "rule__Phase__Group__13__Impl"
    // InternalMyDsl.g:3035:1: rule__Phase__Group__13__Impl : ( '}' ) ;
    public final void rule__Phase__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3039:1: ( ( '}' ) )
            // InternalMyDsl.g:3040:1: ( '}' )
            {
            // InternalMyDsl.g:3040:1: ( '}' )
            // InternalMyDsl.g:3041:2: '}'
            {
             before(grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Phase__Group__13__Impl"


    // $ANTLR start "rule__Phase__Group_12__0"
    // InternalMyDsl.g:3051:1: rule__Phase__Group_12__0 : rule__Phase__Group_12__0__Impl rule__Phase__Group_12__1 ;
    public final void rule__Phase__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3055:1: ( rule__Phase__Group_12__0__Impl rule__Phase__Group_12__1 )
            // InternalMyDsl.g:3056:2: rule__Phase__Group_12__0__Impl rule__Phase__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Phase__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group_12__1();

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
    // $ANTLR end "rule__Phase__Group_12__0"


    // $ANTLR start "rule__Phase__Group_12__0__Impl"
    // InternalMyDsl.g:3063:1: rule__Phase__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Phase__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( ( ',' ) )
            // InternalMyDsl.g:3068:1: ( ',' )
            {
            // InternalMyDsl.g:3068:1: ( ',' )
            // InternalMyDsl.g:3069:2: ','
            {
             before(grammarAccess.getPhaseAccess().getCommaKeyword_12_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getCommaKeyword_12_0()); 

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
    // $ANTLR end "rule__Phase__Group_12__0__Impl"


    // $ANTLR start "rule__Phase__Group_12__1"
    // InternalMyDsl.g:3078:1: rule__Phase__Group_12__1 : rule__Phase__Group_12__1__Impl ;
    public final void rule__Phase__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3082:1: ( rule__Phase__Group_12__1__Impl )
            // InternalMyDsl.g:3083:2: rule__Phase__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group_12__1__Impl();

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
    // $ANTLR end "rule__Phase__Group_12__1"


    // $ANTLR start "rule__Phase__Group_12__1__Impl"
    // InternalMyDsl.g:3089:1: rule__Phase__Group_12__1__Impl : ( ( rule__Phase__AddSubPhaseAssignment_12_1 ) ) ;
    public final void rule__Phase__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3093:1: ( ( ( rule__Phase__AddSubPhaseAssignment_12_1 ) ) )
            // InternalMyDsl.g:3094:1: ( ( rule__Phase__AddSubPhaseAssignment_12_1 ) )
            {
            // InternalMyDsl.g:3094:1: ( ( rule__Phase__AddSubPhaseAssignment_12_1 ) )
            // InternalMyDsl.g:3095:2: ( rule__Phase__AddSubPhaseAssignment_12_1 )
            {
             before(grammarAccess.getPhaseAccess().getAddSubPhaseAssignment_12_1()); 
            // InternalMyDsl.g:3096:2: ( rule__Phase__AddSubPhaseAssignment_12_1 )
            // InternalMyDsl.g:3096:3: rule__Phase__AddSubPhaseAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Phase__AddSubPhaseAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getAddSubPhaseAssignment_12_1()); 

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
    // $ANTLR end "rule__Phase__Group_12__1__Impl"


    // $ANTLR start "rule__SubPhase__Group__0"
    // InternalMyDsl.g:3105:1: rule__SubPhase__Group__0 : rule__SubPhase__Group__0__Impl rule__SubPhase__Group__1 ;
    public final void rule__SubPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3109:1: ( rule__SubPhase__Group__0__Impl rule__SubPhase__Group__1 )
            // InternalMyDsl.g:3110:2: rule__SubPhase__Group__0__Impl rule__SubPhase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SubPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__1();

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
    // $ANTLR end "rule__SubPhase__Group__0"


    // $ANTLR start "rule__SubPhase__Group__0__Impl"
    // InternalMyDsl.g:3117:1: rule__SubPhase__Group__0__Impl : ( 'SubPhase' ) ;
    public final void rule__SubPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( ( 'SubPhase' ) )
            // InternalMyDsl.g:3122:1: ( 'SubPhase' )
            {
            // InternalMyDsl.g:3122:1: ( 'SubPhase' )
            // InternalMyDsl.g:3123:2: 'SubPhase'
            {
             before(grammarAccess.getSubPhaseAccess().getSubPhaseKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getSubPhaseKeyword_0()); 

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
    // $ANTLR end "rule__SubPhase__Group__0__Impl"


    // $ANTLR start "rule__SubPhase__Group__1"
    // InternalMyDsl.g:3132:1: rule__SubPhase__Group__1 : rule__SubPhase__Group__1__Impl rule__SubPhase__Group__2 ;
    public final void rule__SubPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3136:1: ( rule__SubPhase__Group__1__Impl rule__SubPhase__Group__2 )
            // InternalMyDsl.g:3137:2: rule__SubPhase__Group__1__Impl rule__SubPhase__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__2();

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
    // $ANTLR end "rule__SubPhase__Group__1"


    // $ANTLR start "rule__SubPhase__Group__1__Impl"
    // InternalMyDsl.g:3144:1: rule__SubPhase__Group__1__Impl : ( ( rule__SubPhase__NameAssignment_1 ) ) ;
    public final void rule__SubPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3148:1: ( ( ( rule__SubPhase__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3149:1: ( ( rule__SubPhase__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3149:1: ( ( rule__SubPhase__NameAssignment_1 ) )
            // InternalMyDsl.g:3150:2: ( rule__SubPhase__NameAssignment_1 )
            {
             before(grammarAccess.getSubPhaseAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3151:2: ( rule__SubPhase__NameAssignment_1 )
            // InternalMyDsl.g:3151:3: rule__SubPhase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubPhase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubPhaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SubPhase__Group__1__Impl"


    // $ANTLR start "rule__SubPhase__Group__2"
    // InternalMyDsl.g:3159:1: rule__SubPhase__Group__2 : rule__SubPhase__Group__2__Impl rule__SubPhase__Group__3 ;
    public final void rule__SubPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3163:1: ( rule__SubPhase__Group__2__Impl rule__SubPhase__Group__3 )
            // InternalMyDsl.g:3164:2: rule__SubPhase__Group__2__Impl rule__SubPhase__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__SubPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__3();

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
    // $ANTLR end "rule__SubPhase__Group__2"


    // $ANTLR start "rule__SubPhase__Group__2__Impl"
    // InternalMyDsl.g:3171:1: rule__SubPhase__Group__2__Impl : ( '{' ) ;
    public final void rule__SubPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3175:1: ( ( '{' ) )
            // InternalMyDsl.g:3176:1: ( '{' )
            {
            // InternalMyDsl.g:3176:1: ( '{' )
            // InternalMyDsl.g:3177:2: '{'
            {
             before(grammarAccess.getSubPhaseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SubPhase__Group__2__Impl"


    // $ANTLR start "rule__SubPhase__Group__3"
    // InternalMyDsl.g:3186:1: rule__SubPhase__Group__3 : rule__SubPhase__Group__3__Impl rule__SubPhase__Group__4 ;
    public final void rule__SubPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3190:1: ( rule__SubPhase__Group__3__Impl rule__SubPhase__Group__4 )
            // InternalMyDsl.g:3191:2: rule__SubPhase__Group__3__Impl rule__SubPhase__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__4();

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
    // $ANTLR end "rule__SubPhase__Group__3"


    // $ANTLR start "rule__SubPhase__Group__3__Impl"
    // InternalMyDsl.g:3198:1: rule__SubPhase__Group__3__Impl : ( 'subPhaseType' ) ;
    public final void rule__SubPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3202:1: ( ( 'subPhaseType' ) )
            // InternalMyDsl.g:3203:1: ( 'subPhaseType' )
            {
            // InternalMyDsl.g:3203:1: ( 'subPhaseType' )
            // InternalMyDsl.g:3204:2: 'subPhaseType'
            {
             before(grammarAccess.getSubPhaseAccess().getSubPhaseTypeKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getSubPhaseTypeKeyword_3()); 

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
    // $ANTLR end "rule__SubPhase__Group__3__Impl"


    // $ANTLR start "rule__SubPhase__Group__4"
    // InternalMyDsl.g:3213:1: rule__SubPhase__Group__4 : rule__SubPhase__Group__4__Impl rule__SubPhase__Group__5 ;
    public final void rule__SubPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( rule__SubPhase__Group__4__Impl rule__SubPhase__Group__5 )
            // InternalMyDsl.g:3218:2: rule__SubPhase__Group__4__Impl rule__SubPhase__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SubPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__5();

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
    // $ANTLR end "rule__SubPhase__Group__4"


    // $ANTLR start "rule__SubPhase__Group__4__Impl"
    // InternalMyDsl.g:3225:1: rule__SubPhase__Group__4__Impl : ( '=' ) ;
    public final void rule__SubPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3229:1: ( ( '=' ) )
            // InternalMyDsl.g:3230:1: ( '=' )
            {
            // InternalMyDsl.g:3230:1: ( '=' )
            // InternalMyDsl.g:3231:2: '='
            {
             before(grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__SubPhase__Group__4__Impl"


    // $ANTLR start "rule__SubPhase__Group__5"
    // InternalMyDsl.g:3240:1: rule__SubPhase__Group__5 : rule__SubPhase__Group__5__Impl rule__SubPhase__Group__6 ;
    public final void rule__SubPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3244:1: ( rule__SubPhase__Group__5__Impl rule__SubPhase__Group__6 )
            // InternalMyDsl.g:3245:2: rule__SubPhase__Group__5__Impl rule__SubPhase__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__SubPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__6();

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
    // $ANTLR end "rule__SubPhase__Group__5"


    // $ANTLR start "rule__SubPhase__Group__5__Impl"
    // InternalMyDsl.g:3252:1: rule__SubPhase__Group__5__Impl : ( ( rule__SubPhase__SubPhaseTypeAssignment_5 ) ) ;
    public final void rule__SubPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3256:1: ( ( ( rule__SubPhase__SubPhaseTypeAssignment_5 ) ) )
            // InternalMyDsl.g:3257:1: ( ( rule__SubPhase__SubPhaseTypeAssignment_5 ) )
            {
            // InternalMyDsl.g:3257:1: ( ( rule__SubPhase__SubPhaseTypeAssignment_5 ) )
            // InternalMyDsl.g:3258:2: ( rule__SubPhase__SubPhaseTypeAssignment_5 )
            {
             before(grammarAccess.getSubPhaseAccess().getSubPhaseTypeAssignment_5()); 
            // InternalMyDsl.g:3259:2: ( rule__SubPhase__SubPhaseTypeAssignment_5 )
            // InternalMyDsl.g:3259:3: rule__SubPhase__SubPhaseTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SubPhase__SubPhaseTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSubPhaseAccess().getSubPhaseTypeAssignment_5()); 

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
    // $ANTLR end "rule__SubPhase__Group__5__Impl"


    // $ANTLR start "rule__SubPhase__Group__6"
    // InternalMyDsl.g:3267:1: rule__SubPhase__Group__6 : rule__SubPhase__Group__6__Impl rule__SubPhase__Group__7 ;
    public final void rule__SubPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3271:1: ( rule__SubPhase__Group__6__Impl rule__SubPhase__Group__7 )
            // InternalMyDsl.g:3272:2: rule__SubPhase__Group__6__Impl rule__SubPhase__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__SubPhase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__7();

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
    // $ANTLR end "rule__SubPhase__Group__6"


    // $ANTLR start "rule__SubPhase__Group__6__Impl"
    // InternalMyDsl.g:3279:1: rule__SubPhase__Group__6__Impl : ( 'duration' ) ;
    public final void rule__SubPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3283:1: ( ( 'duration' ) )
            // InternalMyDsl.g:3284:1: ( 'duration' )
            {
            // InternalMyDsl.g:3284:1: ( 'duration' )
            // InternalMyDsl.g:3285:2: 'duration'
            {
             before(grammarAccess.getSubPhaseAccess().getDurationKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getDurationKeyword_6()); 

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
    // $ANTLR end "rule__SubPhase__Group__6__Impl"


    // $ANTLR start "rule__SubPhase__Group__7"
    // InternalMyDsl.g:3294:1: rule__SubPhase__Group__7 : rule__SubPhase__Group__7__Impl rule__SubPhase__Group__8 ;
    public final void rule__SubPhase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3298:1: ( rule__SubPhase__Group__7__Impl rule__SubPhase__Group__8 )
            // InternalMyDsl.g:3299:2: rule__SubPhase__Group__7__Impl rule__SubPhase__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__SubPhase__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__8();

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
    // $ANTLR end "rule__SubPhase__Group__7"


    // $ANTLR start "rule__SubPhase__Group__7__Impl"
    // InternalMyDsl.g:3306:1: rule__SubPhase__Group__7__Impl : ( '=' ) ;
    public final void rule__SubPhase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3310:1: ( ( '=' ) )
            // InternalMyDsl.g:3311:1: ( '=' )
            {
            // InternalMyDsl.g:3311:1: ( '=' )
            // InternalMyDsl.g:3312:2: '='
            {
             before(grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_7()); 

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
    // $ANTLR end "rule__SubPhase__Group__7__Impl"


    // $ANTLR start "rule__SubPhase__Group__8"
    // InternalMyDsl.g:3321:1: rule__SubPhase__Group__8 : rule__SubPhase__Group__8__Impl rule__SubPhase__Group__9 ;
    public final void rule__SubPhase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3325:1: ( rule__SubPhase__Group__8__Impl rule__SubPhase__Group__9 )
            // InternalMyDsl.g:3326:2: rule__SubPhase__Group__8__Impl rule__SubPhase__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__SubPhase__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__9();

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
    // $ANTLR end "rule__SubPhase__Group__8"


    // $ANTLR start "rule__SubPhase__Group__8__Impl"
    // InternalMyDsl.g:3333:1: rule__SubPhase__Group__8__Impl : ( ( rule__SubPhase__DurationAssignment_8 ) ) ;
    public final void rule__SubPhase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3337:1: ( ( ( rule__SubPhase__DurationAssignment_8 ) ) )
            // InternalMyDsl.g:3338:1: ( ( rule__SubPhase__DurationAssignment_8 ) )
            {
            // InternalMyDsl.g:3338:1: ( ( rule__SubPhase__DurationAssignment_8 ) )
            // InternalMyDsl.g:3339:2: ( rule__SubPhase__DurationAssignment_8 )
            {
             before(grammarAccess.getSubPhaseAccess().getDurationAssignment_8()); 
            // InternalMyDsl.g:3340:2: ( rule__SubPhase__DurationAssignment_8 )
            // InternalMyDsl.g:3340:3: rule__SubPhase__DurationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SubPhase__DurationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSubPhaseAccess().getDurationAssignment_8()); 

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
    // $ANTLR end "rule__SubPhase__Group__8__Impl"


    // $ANTLR start "rule__SubPhase__Group__9"
    // InternalMyDsl.g:3348:1: rule__SubPhase__Group__9 : rule__SubPhase__Group__9__Impl rule__SubPhase__Group__10 ;
    public final void rule__SubPhase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3352:1: ( rule__SubPhase__Group__9__Impl rule__SubPhase__Group__10 )
            // InternalMyDsl.g:3353:2: rule__SubPhase__Group__9__Impl rule__SubPhase__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__SubPhase__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__10();

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
    // $ANTLR end "rule__SubPhase__Group__9"


    // $ANTLR start "rule__SubPhase__Group__9__Impl"
    // InternalMyDsl.g:3360:1: rule__SubPhase__Group__9__Impl : ( 'addAction' ) ;
    public final void rule__SubPhase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3364:1: ( ( 'addAction' ) )
            // InternalMyDsl.g:3365:1: ( 'addAction' )
            {
            // InternalMyDsl.g:3365:1: ( 'addAction' )
            // InternalMyDsl.g:3366:2: 'addAction'
            {
             before(grammarAccess.getSubPhaseAccess().getAddActionKeyword_9()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getAddActionKeyword_9()); 

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
    // $ANTLR end "rule__SubPhase__Group__9__Impl"


    // $ANTLR start "rule__SubPhase__Group__10"
    // InternalMyDsl.g:3375:1: rule__SubPhase__Group__10 : rule__SubPhase__Group__10__Impl rule__SubPhase__Group__11 ;
    public final void rule__SubPhase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3379:1: ( rule__SubPhase__Group__10__Impl rule__SubPhase__Group__11 )
            // InternalMyDsl.g:3380:2: rule__SubPhase__Group__10__Impl rule__SubPhase__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__SubPhase__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__11();

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
    // $ANTLR end "rule__SubPhase__Group__10"


    // $ANTLR start "rule__SubPhase__Group__10__Impl"
    // InternalMyDsl.g:3387:1: rule__SubPhase__Group__10__Impl : ( '=' ) ;
    public final void rule__SubPhase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3391:1: ( ( '=' ) )
            // InternalMyDsl.g:3392:1: ( '=' )
            {
            // InternalMyDsl.g:3392:1: ( '=' )
            // InternalMyDsl.g:3393:2: '='
            {
             before(grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_10()); 

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
    // $ANTLR end "rule__SubPhase__Group__10__Impl"


    // $ANTLR start "rule__SubPhase__Group__11"
    // InternalMyDsl.g:3402:1: rule__SubPhase__Group__11 : rule__SubPhase__Group__11__Impl rule__SubPhase__Group__12 ;
    public final void rule__SubPhase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3406:1: ( rule__SubPhase__Group__11__Impl rule__SubPhase__Group__12 )
            // InternalMyDsl.g:3407:2: rule__SubPhase__Group__11__Impl rule__SubPhase__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__SubPhase__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__12();

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
    // $ANTLR end "rule__SubPhase__Group__11"


    // $ANTLR start "rule__SubPhase__Group__11__Impl"
    // InternalMyDsl.g:3414:1: rule__SubPhase__Group__11__Impl : ( ( rule__SubPhase__AddActionAssignment_11 ) ) ;
    public final void rule__SubPhase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3418:1: ( ( ( rule__SubPhase__AddActionAssignment_11 ) ) )
            // InternalMyDsl.g:3419:1: ( ( rule__SubPhase__AddActionAssignment_11 ) )
            {
            // InternalMyDsl.g:3419:1: ( ( rule__SubPhase__AddActionAssignment_11 ) )
            // InternalMyDsl.g:3420:2: ( rule__SubPhase__AddActionAssignment_11 )
            {
             before(grammarAccess.getSubPhaseAccess().getAddActionAssignment_11()); 
            // InternalMyDsl.g:3421:2: ( rule__SubPhase__AddActionAssignment_11 )
            // InternalMyDsl.g:3421:3: rule__SubPhase__AddActionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__SubPhase__AddActionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSubPhaseAccess().getAddActionAssignment_11()); 

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
    // $ANTLR end "rule__SubPhase__Group__11__Impl"


    // $ANTLR start "rule__SubPhase__Group__12"
    // InternalMyDsl.g:3429:1: rule__SubPhase__Group__12 : rule__SubPhase__Group__12__Impl rule__SubPhase__Group__13 ;
    public final void rule__SubPhase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3433:1: ( rule__SubPhase__Group__12__Impl rule__SubPhase__Group__13 )
            // InternalMyDsl.g:3434:2: rule__SubPhase__Group__12__Impl rule__SubPhase__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__SubPhase__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__13();

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
    // $ANTLR end "rule__SubPhase__Group__12"


    // $ANTLR start "rule__SubPhase__Group__12__Impl"
    // InternalMyDsl.g:3441:1: rule__SubPhase__Group__12__Impl : ( ( rule__SubPhase__Group_12__0 )* ) ;
    public final void rule__SubPhase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3445:1: ( ( ( rule__SubPhase__Group_12__0 )* ) )
            // InternalMyDsl.g:3446:1: ( ( rule__SubPhase__Group_12__0 )* )
            {
            // InternalMyDsl.g:3446:1: ( ( rule__SubPhase__Group_12__0 )* )
            // InternalMyDsl.g:3447:2: ( rule__SubPhase__Group_12__0 )*
            {
             before(grammarAccess.getSubPhaseAccess().getGroup_12()); 
            // InternalMyDsl.g:3448:2: ( rule__SubPhase__Group_12__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:3448:3: rule__SubPhase__Group_12__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SubPhase__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSubPhaseAccess().getGroup_12()); 

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
    // $ANTLR end "rule__SubPhase__Group__12__Impl"


    // $ANTLR start "rule__SubPhase__Group__13"
    // InternalMyDsl.g:3456:1: rule__SubPhase__Group__13 : rule__SubPhase__Group__13__Impl ;
    public final void rule__SubPhase__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3460:1: ( rule__SubPhase__Group__13__Impl )
            // InternalMyDsl.g:3461:2: rule__SubPhase__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubPhase__Group__13__Impl();

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
    // $ANTLR end "rule__SubPhase__Group__13"


    // $ANTLR start "rule__SubPhase__Group__13__Impl"
    // InternalMyDsl.g:3467:1: rule__SubPhase__Group__13__Impl : ( '}' ) ;
    public final void rule__SubPhase__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3471:1: ( ( '}' ) )
            // InternalMyDsl.g:3472:1: ( '}' )
            {
            // InternalMyDsl.g:3472:1: ( '}' )
            // InternalMyDsl.g:3473:2: '}'
            {
             before(grammarAccess.getSubPhaseAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__SubPhase__Group__13__Impl"


    // $ANTLR start "rule__SubPhase__Group_12__0"
    // InternalMyDsl.g:3483:1: rule__SubPhase__Group_12__0 : rule__SubPhase__Group_12__0__Impl rule__SubPhase__Group_12__1 ;
    public final void rule__SubPhase__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3487:1: ( rule__SubPhase__Group_12__0__Impl rule__SubPhase__Group_12__1 )
            // InternalMyDsl.g:3488:2: rule__SubPhase__Group_12__0__Impl rule__SubPhase__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__SubPhase__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubPhase__Group_12__1();

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
    // $ANTLR end "rule__SubPhase__Group_12__0"


    // $ANTLR start "rule__SubPhase__Group_12__0__Impl"
    // InternalMyDsl.g:3495:1: rule__SubPhase__Group_12__0__Impl : ( ',' ) ;
    public final void rule__SubPhase__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3499:1: ( ( ',' ) )
            // InternalMyDsl.g:3500:1: ( ',' )
            {
            // InternalMyDsl.g:3500:1: ( ',' )
            // InternalMyDsl.g:3501:2: ','
            {
             before(grammarAccess.getSubPhaseAccess().getCommaKeyword_12_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getCommaKeyword_12_0()); 

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
    // $ANTLR end "rule__SubPhase__Group_12__0__Impl"


    // $ANTLR start "rule__SubPhase__Group_12__1"
    // InternalMyDsl.g:3510:1: rule__SubPhase__Group_12__1 : rule__SubPhase__Group_12__1__Impl ;
    public final void rule__SubPhase__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3514:1: ( rule__SubPhase__Group_12__1__Impl )
            // InternalMyDsl.g:3515:2: rule__SubPhase__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubPhase__Group_12__1__Impl();

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
    // $ANTLR end "rule__SubPhase__Group_12__1"


    // $ANTLR start "rule__SubPhase__Group_12__1__Impl"
    // InternalMyDsl.g:3521:1: rule__SubPhase__Group_12__1__Impl : ( ( rule__SubPhase__AddActionAssignment_12_1 ) ) ;
    public final void rule__SubPhase__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3525:1: ( ( ( rule__SubPhase__AddActionAssignment_12_1 ) ) )
            // InternalMyDsl.g:3526:1: ( ( rule__SubPhase__AddActionAssignment_12_1 ) )
            {
            // InternalMyDsl.g:3526:1: ( ( rule__SubPhase__AddActionAssignment_12_1 ) )
            // InternalMyDsl.g:3527:2: ( rule__SubPhase__AddActionAssignment_12_1 )
            {
             before(grammarAccess.getSubPhaseAccess().getAddActionAssignment_12_1()); 
            // InternalMyDsl.g:3528:2: ( rule__SubPhase__AddActionAssignment_12_1 )
            // InternalMyDsl.g:3528:3: rule__SubPhase__AddActionAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__SubPhase__AddActionAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSubPhaseAccess().getAddActionAssignment_12_1()); 

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
    // $ANTLR end "rule__SubPhase__Group_12__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalMyDsl.g:3537:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3541:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMyDsl.g:3542:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3549:1: rule__Action__Group__0__Impl : ( 'Action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3553:1: ( ( 'Action' ) )
            // InternalMyDsl.g:3554:1: ( 'Action' )
            {
            // InternalMyDsl.g:3554:1: ( 'Action' )
            // InternalMyDsl.g:3555:2: 'Action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3564:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3568:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMyDsl.g:3569:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:3576:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3581:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3581:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalMyDsl.g:3582:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3583:2: ( rule__Action__NameAssignment_1 )
            // InternalMyDsl.g:3583:3: rule__Action__NameAssignment_1
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
    // InternalMyDsl.g:3591:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3595:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalMyDsl.g:3596:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3603:1: rule__Action__Group__2__Impl : ( '{' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3607:1: ( ( '{' ) )
            // InternalMyDsl.g:3608:1: ( '{' )
            {
            // InternalMyDsl.g:3608:1: ( '{' )
            // InternalMyDsl.g:3609:2: '{'
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
    // InternalMyDsl.g:3618:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3622:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalMyDsl.g:3623:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:3630:1: rule__Action__Group__3__Impl : ( 'actionType' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3634:1: ( ( 'actionType' ) )
            // InternalMyDsl.g:3635:1: ( 'actionType' )
            {
            // InternalMyDsl.g:3635:1: ( 'actionType' )
            // InternalMyDsl.g:3636:2: 'actionType'
            {
             before(grammarAccess.getActionAccess().getActionTypeKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionTypeKeyword_3()); 

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
    // InternalMyDsl.g:3645:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3649:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalMyDsl.g:3650:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:3657:1: rule__Action__Group__4__Impl : ( '=' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3661:1: ( ( '=' ) )
            // InternalMyDsl.g:3662:1: ( '=' )
            {
            // InternalMyDsl.g:3662:1: ( '=' )
            // InternalMyDsl.g:3663:2: '='
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
    // InternalMyDsl.g:3672:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3676:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalMyDsl.g:3677:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3684:1: rule__Action__Group__5__Impl : ( ( rule__Action__ActionTypeAssignment_5 ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3688:1: ( ( ( rule__Action__ActionTypeAssignment_5 ) ) )
            // InternalMyDsl.g:3689:1: ( ( rule__Action__ActionTypeAssignment_5 ) )
            {
            // InternalMyDsl.g:3689:1: ( ( rule__Action__ActionTypeAssignment_5 ) )
            // InternalMyDsl.g:3690:2: ( rule__Action__ActionTypeAssignment_5 )
            {
             before(grammarAccess.getActionAccess().getActionTypeAssignment_5()); 
            // InternalMyDsl.g:3691:2: ( rule__Action__ActionTypeAssignment_5 )
            // InternalMyDsl.g:3691:3: rule__Action__ActionTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionTypeAssignment_5()); 

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
    // InternalMyDsl.g:3699:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3703:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalMyDsl.g:3704:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:3711:1: rule__Action__Group__6__Impl : ( 'inputOutput' ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( ( 'inputOutput' ) )
            // InternalMyDsl.g:3716:1: ( 'inputOutput' )
            {
            // InternalMyDsl.g:3716:1: ( 'inputOutput' )
            // InternalMyDsl.g:3717:2: 'inputOutput'
            {
             before(grammarAccess.getActionAccess().getInputOutputKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getInputOutputKeyword_6()); 

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
    // InternalMyDsl.g:3726:1: rule__Action__Group__7 : rule__Action__Group__7__Impl rule__Action__Group__8 ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3730:1: ( rule__Action__Group__7__Impl rule__Action__Group__8 )
            // InternalMyDsl.g:3731:2: rule__Action__Group__7__Impl rule__Action__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:3738:1: rule__Action__Group__7__Impl : ( '=' ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3742:1: ( ( '=' ) )
            // InternalMyDsl.g:3743:1: ( '=' )
            {
            // InternalMyDsl.g:3743:1: ( '=' )
            // InternalMyDsl.g:3744:2: '='
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
    // InternalMyDsl.g:3753:1: rule__Action__Group__8 : rule__Action__Group__8__Impl rule__Action__Group__9 ;
    public final void rule__Action__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3757:1: ( rule__Action__Group__8__Impl rule__Action__Group__9 )
            // InternalMyDsl.g:3758:2: rule__Action__Group__8__Impl rule__Action__Group__9
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3765:1: rule__Action__Group__8__Impl : ( ( rule__Action__InputOutputAssignment_8 ) ) ;
    public final void rule__Action__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3769:1: ( ( ( rule__Action__InputOutputAssignment_8 ) ) )
            // InternalMyDsl.g:3770:1: ( ( rule__Action__InputOutputAssignment_8 ) )
            {
            // InternalMyDsl.g:3770:1: ( ( rule__Action__InputOutputAssignment_8 ) )
            // InternalMyDsl.g:3771:2: ( rule__Action__InputOutputAssignment_8 )
            {
             before(grammarAccess.getActionAccess().getInputOutputAssignment_8()); 
            // InternalMyDsl.g:3772:2: ( rule__Action__InputOutputAssignment_8 )
            // InternalMyDsl.g:3772:3: rule__Action__InputOutputAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Action__InputOutputAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getInputOutputAssignment_8()); 

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
    // InternalMyDsl.g:3780:1: rule__Action__Group__9 : rule__Action__Group__9__Impl rule__Action__Group__10 ;
    public final void rule__Action__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3784:1: ( rule__Action__Group__9__Impl rule__Action__Group__10 )
            // InternalMyDsl.g:3785:2: rule__Action__Group__9__Impl rule__Action__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Action__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__10();

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
    // InternalMyDsl.g:3792:1: rule__Action__Group__9__Impl : ( 'energyUsage' ) ;
    public final void rule__Action__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3796:1: ( ( 'energyUsage' ) )
            // InternalMyDsl.g:3797:1: ( 'energyUsage' )
            {
            // InternalMyDsl.g:3797:1: ( 'energyUsage' )
            // InternalMyDsl.g:3798:2: 'energyUsage'
            {
             before(grammarAccess.getActionAccess().getEnergyUsageKeyword_9()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEnergyUsageKeyword_9()); 

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


    // $ANTLR start "rule__Action__Group__10"
    // InternalMyDsl.g:3807:1: rule__Action__Group__10 : rule__Action__Group__10__Impl rule__Action__Group__11 ;
    public final void rule__Action__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3811:1: ( rule__Action__Group__10__Impl rule__Action__Group__11 )
            // InternalMyDsl.g:3812:2: rule__Action__Group__10__Impl rule__Action__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Action__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__11();

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
    // $ANTLR end "rule__Action__Group__10"


    // $ANTLR start "rule__Action__Group__10__Impl"
    // InternalMyDsl.g:3819:1: rule__Action__Group__10__Impl : ( '=' ) ;
    public final void rule__Action__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3823:1: ( ( '=' ) )
            // InternalMyDsl.g:3824:1: ( '=' )
            {
            // InternalMyDsl.g:3824:1: ( '=' )
            // InternalMyDsl.g:3825:2: '='
            {
             before(grammarAccess.getActionAccess().getEqualsSignKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEqualsSignKeyword_10()); 

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
    // $ANTLR end "rule__Action__Group__10__Impl"


    // $ANTLR start "rule__Action__Group__11"
    // InternalMyDsl.g:3834:1: rule__Action__Group__11 : rule__Action__Group__11__Impl rule__Action__Group__12 ;
    public final void rule__Action__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3838:1: ( rule__Action__Group__11__Impl rule__Action__Group__12 )
            // InternalMyDsl.g:3839:2: rule__Action__Group__11__Impl rule__Action__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__12();

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
    // $ANTLR end "rule__Action__Group__11"


    // $ANTLR start "rule__Action__Group__11__Impl"
    // InternalMyDsl.g:3846:1: rule__Action__Group__11__Impl : ( ( rule__Action__EnergyUsageAssignment_11 ) ) ;
    public final void rule__Action__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3850:1: ( ( ( rule__Action__EnergyUsageAssignment_11 ) ) )
            // InternalMyDsl.g:3851:1: ( ( rule__Action__EnergyUsageAssignment_11 ) )
            {
            // InternalMyDsl.g:3851:1: ( ( rule__Action__EnergyUsageAssignment_11 ) )
            // InternalMyDsl.g:3852:2: ( rule__Action__EnergyUsageAssignment_11 )
            {
             before(grammarAccess.getActionAccess().getEnergyUsageAssignment_11()); 
            // InternalMyDsl.g:3853:2: ( rule__Action__EnergyUsageAssignment_11 )
            // InternalMyDsl.g:3853:3: rule__Action__EnergyUsageAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Action__EnergyUsageAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getEnergyUsageAssignment_11()); 

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
    // $ANTLR end "rule__Action__Group__11__Impl"


    // $ANTLR start "rule__Action__Group__12"
    // InternalMyDsl.g:3861:1: rule__Action__Group__12 : rule__Action__Group__12__Impl ;
    public final void rule__Action__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3865:1: ( rule__Action__Group__12__Impl )
            // InternalMyDsl.g:3866:2: rule__Action__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__12__Impl();

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
    // $ANTLR end "rule__Action__Group__12"


    // $ANTLR start "rule__Action__Group__12__Impl"
    // InternalMyDsl.g:3872:1: rule__Action__Group__12__Impl : ( '}' ) ;
    public final void rule__Action__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3876:1: ( ( '}' ) )
            // InternalMyDsl.g:3877:1: ( '}' )
            {
            // InternalMyDsl.g:3877:1: ( '}' )
            // InternalMyDsl.g:3878:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Action__Group__12__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__0"
    // InternalMyDsl.g:3888:1: rule__SafetyConstraint__Group__0 : rule__SafetyConstraint__Group__0__Impl rule__SafetyConstraint__Group__1 ;
    public final void rule__SafetyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3892:1: ( rule__SafetyConstraint__Group__0__Impl rule__SafetyConstraint__Group__1 )
            // InternalMyDsl.g:3893:2: rule__SafetyConstraint__Group__0__Impl rule__SafetyConstraint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SafetyConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__1();

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
    // $ANTLR end "rule__SafetyConstraint__Group__0"


    // $ANTLR start "rule__SafetyConstraint__Group__0__Impl"
    // InternalMyDsl.g:3900:1: rule__SafetyConstraint__Group__0__Impl : ( 'SafetyConstraint' ) ;
    public final void rule__SafetyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3904:1: ( ( 'SafetyConstraint' ) )
            // InternalMyDsl.g:3905:1: ( 'SafetyConstraint' )
            {
            // InternalMyDsl.g:3905:1: ( 'SafetyConstraint' )
            // InternalMyDsl.g:3906:2: 'SafetyConstraint'
            {
             before(grammarAccess.getSafetyConstraintAccess().getSafetyConstraintKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getSafetyConstraintKeyword_0()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__0__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__1"
    // InternalMyDsl.g:3915:1: rule__SafetyConstraint__Group__1 : rule__SafetyConstraint__Group__1__Impl rule__SafetyConstraint__Group__2 ;
    public final void rule__SafetyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3919:1: ( rule__SafetyConstraint__Group__1__Impl rule__SafetyConstraint__Group__2 )
            // InternalMyDsl.g:3920:2: rule__SafetyConstraint__Group__1__Impl rule__SafetyConstraint__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SafetyConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__2();

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
    // $ANTLR end "rule__SafetyConstraint__Group__1"


    // $ANTLR start "rule__SafetyConstraint__Group__1__Impl"
    // InternalMyDsl.g:3927:1: rule__SafetyConstraint__Group__1__Impl : ( ( rule__SafetyConstraint__NameAssignment_1 ) ) ;
    public final void rule__SafetyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3931:1: ( ( ( rule__SafetyConstraint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3932:1: ( ( rule__SafetyConstraint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3932:1: ( ( rule__SafetyConstraint__NameAssignment_1 ) )
            // InternalMyDsl.g:3933:2: ( rule__SafetyConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getSafetyConstraintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3934:2: ( rule__SafetyConstraint__NameAssignment_1 )
            // InternalMyDsl.g:3934:3: rule__SafetyConstraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyConstraintAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__1__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__2"
    // InternalMyDsl.g:3942:1: rule__SafetyConstraint__Group__2 : rule__SafetyConstraint__Group__2__Impl rule__SafetyConstraint__Group__3 ;
    public final void rule__SafetyConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3946:1: ( rule__SafetyConstraint__Group__2__Impl rule__SafetyConstraint__Group__3 )
            // InternalMyDsl.g:3947:2: rule__SafetyConstraint__Group__2__Impl rule__SafetyConstraint__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__SafetyConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__3();

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
    // $ANTLR end "rule__SafetyConstraint__Group__2"


    // $ANTLR start "rule__SafetyConstraint__Group__2__Impl"
    // InternalMyDsl.g:3954:1: rule__SafetyConstraint__Group__2__Impl : ( '{' ) ;
    public final void rule__SafetyConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3958:1: ( ( '{' ) )
            // InternalMyDsl.g:3959:1: ( '{' )
            {
            // InternalMyDsl.g:3959:1: ( '{' )
            // InternalMyDsl.g:3960:2: '{'
            {
             before(grammarAccess.getSafetyConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__2__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__3"
    // InternalMyDsl.g:3969:1: rule__SafetyConstraint__Group__3 : rule__SafetyConstraint__Group__3__Impl rule__SafetyConstraint__Group__4 ;
    public final void rule__SafetyConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3973:1: ( rule__SafetyConstraint__Group__3__Impl rule__SafetyConstraint__Group__4 )
            // InternalMyDsl.g:3974:2: rule__SafetyConstraint__Group__3__Impl rule__SafetyConstraint__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SafetyConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__4();

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
    // $ANTLR end "rule__SafetyConstraint__Group__3"


    // $ANTLR start "rule__SafetyConstraint__Group__3__Impl"
    // InternalMyDsl.g:3981:1: rule__SafetyConstraint__Group__3__Impl : ( 'minBattery' ) ;
    public final void rule__SafetyConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3985:1: ( ( 'minBattery' ) )
            // InternalMyDsl.g:3986:1: ( 'minBattery' )
            {
            // InternalMyDsl.g:3986:1: ( 'minBattery' )
            // InternalMyDsl.g:3987:2: 'minBattery'
            {
             before(grammarAccess.getSafetyConstraintAccess().getMinBatteryKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getMinBatteryKeyword_3()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__3__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__4"
    // InternalMyDsl.g:3996:1: rule__SafetyConstraint__Group__4 : rule__SafetyConstraint__Group__4__Impl rule__SafetyConstraint__Group__5 ;
    public final void rule__SafetyConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4000:1: ( rule__SafetyConstraint__Group__4__Impl rule__SafetyConstraint__Group__5 )
            // InternalMyDsl.g:4001:2: rule__SafetyConstraint__Group__4__Impl rule__SafetyConstraint__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__SafetyConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__5();

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
    // $ANTLR end "rule__SafetyConstraint__Group__4"


    // $ANTLR start "rule__SafetyConstraint__Group__4__Impl"
    // InternalMyDsl.g:4008:1: rule__SafetyConstraint__Group__4__Impl : ( '=' ) ;
    public final void rule__SafetyConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4012:1: ( ( '=' ) )
            // InternalMyDsl.g:4013:1: ( '=' )
            {
            // InternalMyDsl.g:4013:1: ( '=' )
            // InternalMyDsl.g:4014:2: '='
            {
             before(grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__4__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__5"
    // InternalMyDsl.g:4023:1: rule__SafetyConstraint__Group__5 : rule__SafetyConstraint__Group__5__Impl rule__SafetyConstraint__Group__6 ;
    public final void rule__SafetyConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4027:1: ( rule__SafetyConstraint__Group__5__Impl rule__SafetyConstraint__Group__6 )
            // InternalMyDsl.g:4028:2: rule__SafetyConstraint__Group__5__Impl rule__SafetyConstraint__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__SafetyConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__6();

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
    // $ANTLR end "rule__SafetyConstraint__Group__5"


    // $ANTLR start "rule__SafetyConstraint__Group__5__Impl"
    // InternalMyDsl.g:4035:1: rule__SafetyConstraint__Group__5__Impl : ( ( rule__SafetyConstraint__MinBatteryAssignment_5 ) ) ;
    public final void rule__SafetyConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4039:1: ( ( ( rule__SafetyConstraint__MinBatteryAssignment_5 ) ) )
            // InternalMyDsl.g:4040:1: ( ( rule__SafetyConstraint__MinBatteryAssignment_5 ) )
            {
            // InternalMyDsl.g:4040:1: ( ( rule__SafetyConstraint__MinBatteryAssignment_5 ) )
            // InternalMyDsl.g:4041:2: ( rule__SafetyConstraint__MinBatteryAssignment_5 )
            {
             before(grammarAccess.getSafetyConstraintAccess().getMinBatteryAssignment_5()); 
            // InternalMyDsl.g:4042:2: ( rule__SafetyConstraint__MinBatteryAssignment_5 )
            // InternalMyDsl.g:4042:3: rule__SafetyConstraint__MinBatteryAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__MinBatteryAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSafetyConstraintAccess().getMinBatteryAssignment_5()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__5__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__6"
    // InternalMyDsl.g:4050:1: rule__SafetyConstraint__Group__6 : rule__SafetyConstraint__Group__6__Impl rule__SafetyConstraint__Group__7 ;
    public final void rule__SafetyConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4054:1: ( rule__SafetyConstraint__Group__6__Impl rule__SafetyConstraint__Group__7 )
            // InternalMyDsl.g:4055:2: rule__SafetyConstraint__Group__6__Impl rule__SafetyConstraint__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__SafetyConstraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__7();

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
    // $ANTLR end "rule__SafetyConstraint__Group__6"


    // $ANTLR start "rule__SafetyConstraint__Group__6__Impl"
    // InternalMyDsl.g:4062:1: rule__SafetyConstraint__Group__6__Impl : ( 'maxWindSpeed' ) ;
    public final void rule__SafetyConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4066:1: ( ( 'maxWindSpeed' ) )
            // InternalMyDsl.g:4067:1: ( 'maxWindSpeed' )
            {
            // InternalMyDsl.g:4067:1: ( 'maxWindSpeed' )
            // InternalMyDsl.g:4068:2: 'maxWindSpeed'
            {
             before(grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedKeyword_6()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedKeyword_6()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__6__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__7"
    // InternalMyDsl.g:4077:1: rule__SafetyConstraint__Group__7 : rule__SafetyConstraint__Group__7__Impl rule__SafetyConstraint__Group__8 ;
    public final void rule__SafetyConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4081:1: ( rule__SafetyConstraint__Group__7__Impl rule__SafetyConstraint__Group__8 )
            // InternalMyDsl.g:4082:2: rule__SafetyConstraint__Group__7__Impl rule__SafetyConstraint__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__SafetyConstraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__8();

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
    // $ANTLR end "rule__SafetyConstraint__Group__7"


    // $ANTLR start "rule__SafetyConstraint__Group__7__Impl"
    // InternalMyDsl.g:4089:1: rule__SafetyConstraint__Group__7__Impl : ( '=' ) ;
    public final void rule__SafetyConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4093:1: ( ( '=' ) )
            // InternalMyDsl.g:4094:1: ( '=' )
            {
            // InternalMyDsl.g:4094:1: ( '=' )
            // InternalMyDsl.g:4095:2: '='
            {
             before(grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_7()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__7__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__8"
    // InternalMyDsl.g:4104:1: rule__SafetyConstraint__Group__8 : rule__SafetyConstraint__Group__8__Impl rule__SafetyConstraint__Group__9 ;
    public final void rule__SafetyConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4108:1: ( rule__SafetyConstraint__Group__8__Impl rule__SafetyConstraint__Group__9 )
            // InternalMyDsl.g:4109:2: rule__SafetyConstraint__Group__8__Impl rule__SafetyConstraint__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__SafetyConstraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__9();

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
    // $ANTLR end "rule__SafetyConstraint__Group__8"


    // $ANTLR start "rule__SafetyConstraint__Group__8__Impl"
    // InternalMyDsl.g:4116:1: rule__SafetyConstraint__Group__8__Impl : ( ( rule__SafetyConstraint__MaxWindSpeedAssignment_8 ) ) ;
    public final void rule__SafetyConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4120:1: ( ( ( rule__SafetyConstraint__MaxWindSpeedAssignment_8 ) ) )
            // InternalMyDsl.g:4121:1: ( ( rule__SafetyConstraint__MaxWindSpeedAssignment_8 ) )
            {
            // InternalMyDsl.g:4121:1: ( ( rule__SafetyConstraint__MaxWindSpeedAssignment_8 ) )
            // InternalMyDsl.g:4122:2: ( rule__SafetyConstraint__MaxWindSpeedAssignment_8 )
            {
             before(grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedAssignment_8()); 
            // InternalMyDsl.g:4123:2: ( rule__SafetyConstraint__MaxWindSpeedAssignment_8 )
            // InternalMyDsl.g:4123:3: rule__SafetyConstraint__MaxWindSpeedAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__MaxWindSpeedAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedAssignment_8()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__8__Impl"


    // $ANTLR start "rule__SafetyConstraint__Group__9"
    // InternalMyDsl.g:4131:1: rule__SafetyConstraint__Group__9 : rule__SafetyConstraint__Group__9__Impl ;
    public final void rule__SafetyConstraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4135:1: ( rule__SafetyConstraint__Group__9__Impl )
            // InternalMyDsl.g:4136:2: rule__SafetyConstraint__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyConstraint__Group__9__Impl();

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
    // $ANTLR end "rule__SafetyConstraint__Group__9"


    // $ANTLR start "rule__SafetyConstraint__Group__9__Impl"
    // InternalMyDsl.g:4142:1: rule__SafetyConstraint__Group__9__Impl : ( '}' ) ;
    public final void rule__SafetyConstraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4146:1: ( ( '}' ) )
            // InternalMyDsl.g:4147:1: ( '}' )
            {
            // InternalMyDsl.g:4147:1: ( '}' )
            // InternalMyDsl.g:4148:2: '}'
            {
             before(grammarAccess.getSafetyConstraintAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__SafetyConstraint__Group__9__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__0"
    // InternalMyDsl.g:4158:1: rule__RegulatoryConstraint__Group__0 : rule__RegulatoryConstraint__Group__0__Impl rule__RegulatoryConstraint__Group__1 ;
    public final void rule__RegulatoryConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4162:1: ( rule__RegulatoryConstraint__Group__0__Impl rule__RegulatoryConstraint__Group__1 )
            // InternalMyDsl.g:4163:2: rule__RegulatoryConstraint__Group__0__Impl rule__RegulatoryConstraint__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4170:1: rule__RegulatoryConstraint__Group__0__Impl : ( 'RegulatoryConstraint' ) ;
    public final void rule__RegulatoryConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4174:1: ( ( 'RegulatoryConstraint' ) )
            // InternalMyDsl.g:4175:1: ( 'RegulatoryConstraint' )
            {
            // InternalMyDsl.g:4175:1: ( 'RegulatoryConstraint' )
            // InternalMyDsl.g:4176:2: 'RegulatoryConstraint'
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4185:1: rule__RegulatoryConstraint__Group__1 : rule__RegulatoryConstraint__Group__1__Impl rule__RegulatoryConstraint__Group__2 ;
    public final void rule__RegulatoryConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4189:1: ( rule__RegulatoryConstraint__Group__1__Impl rule__RegulatoryConstraint__Group__2 )
            // InternalMyDsl.g:4190:2: rule__RegulatoryConstraint__Group__1__Impl rule__RegulatoryConstraint__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4197:1: rule__RegulatoryConstraint__Group__1__Impl : ( ( rule__RegulatoryConstraint__NameAssignment_1 ) ) ;
    public final void rule__RegulatoryConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4201:1: ( ( ( rule__RegulatoryConstraint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4202:1: ( ( rule__RegulatoryConstraint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4202:1: ( ( rule__RegulatoryConstraint__NameAssignment_1 ) )
            // InternalMyDsl.g:4203:2: ( rule__RegulatoryConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4204:2: ( rule__RegulatoryConstraint__NameAssignment_1 )
            // InternalMyDsl.g:4204:3: rule__RegulatoryConstraint__NameAssignment_1
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
    // InternalMyDsl.g:4212:1: rule__RegulatoryConstraint__Group__2 : rule__RegulatoryConstraint__Group__2__Impl rule__RegulatoryConstraint__Group__3 ;
    public final void rule__RegulatoryConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4216:1: ( rule__RegulatoryConstraint__Group__2__Impl rule__RegulatoryConstraint__Group__3 )
            // InternalMyDsl.g:4217:2: rule__RegulatoryConstraint__Group__2__Impl rule__RegulatoryConstraint__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4224:1: rule__RegulatoryConstraint__Group__2__Impl : ( '{' ) ;
    public final void rule__RegulatoryConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4228:1: ( ( '{' ) )
            // InternalMyDsl.g:4229:1: ( '{' )
            {
            // InternalMyDsl.g:4229:1: ( '{' )
            // InternalMyDsl.g:4230:2: '{'
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
    // InternalMyDsl.g:4239:1: rule__RegulatoryConstraint__Group__3 : rule__RegulatoryConstraint__Group__3__Impl rule__RegulatoryConstraint__Group__4 ;
    public final void rule__RegulatoryConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4243:1: ( rule__RegulatoryConstraint__Group__3__Impl rule__RegulatoryConstraint__Group__4 )
            // InternalMyDsl.g:4244:2: rule__RegulatoryConstraint__Group__3__Impl rule__RegulatoryConstraint__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:4251:1: rule__RegulatoryConstraint__Group__3__Impl : ( 'flightPermission' ) ;
    public final void rule__RegulatoryConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4255:1: ( ( 'flightPermission' ) )
            // InternalMyDsl.g:4256:1: ( 'flightPermission' )
            {
            // InternalMyDsl.g:4256:1: ( 'flightPermission' )
            // InternalMyDsl.g:4257:2: 'flightPermission'
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionKeyword_3()); 

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
    // InternalMyDsl.g:4266:1: rule__RegulatoryConstraint__Group__4 : rule__RegulatoryConstraint__Group__4__Impl rule__RegulatoryConstraint__Group__5 ;
    public final void rule__RegulatoryConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4270:1: ( rule__RegulatoryConstraint__Group__4__Impl rule__RegulatoryConstraint__Group__5 )
            // InternalMyDsl.g:4271:2: rule__RegulatoryConstraint__Group__4__Impl rule__RegulatoryConstraint__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4278:1: rule__RegulatoryConstraint__Group__4__Impl : ( '=' ) ;
    public final void rule__RegulatoryConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4282:1: ( ( '=' ) )
            // InternalMyDsl.g:4283:1: ( '=' )
            {
            // InternalMyDsl.g:4283:1: ( '=' )
            // InternalMyDsl.g:4284:2: '='
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
    // InternalMyDsl.g:4293:1: rule__RegulatoryConstraint__Group__5 : rule__RegulatoryConstraint__Group__5__Impl rule__RegulatoryConstraint__Group__6 ;
    public final void rule__RegulatoryConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4297:1: ( rule__RegulatoryConstraint__Group__5__Impl rule__RegulatoryConstraint__Group__6 )
            // InternalMyDsl.g:4298:2: rule__RegulatoryConstraint__Group__5__Impl rule__RegulatoryConstraint__Group__6
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4305:1: rule__RegulatoryConstraint__Group__5__Impl : ( ( rule__RegulatoryConstraint__FlightPermissionAssignment_5 ) ) ;
    public final void rule__RegulatoryConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4309:1: ( ( ( rule__RegulatoryConstraint__FlightPermissionAssignment_5 ) ) )
            // InternalMyDsl.g:4310:1: ( ( rule__RegulatoryConstraint__FlightPermissionAssignment_5 ) )
            {
            // InternalMyDsl.g:4310:1: ( ( rule__RegulatoryConstraint__FlightPermissionAssignment_5 ) )
            // InternalMyDsl.g:4311:2: ( rule__RegulatoryConstraint__FlightPermissionAssignment_5 )
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionAssignment_5()); 
            // InternalMyDsl.g:4312:2: ( rule__RegulatoryConstraint__FlightPermissionAssignment_5 )
            // InternalMyDsl.g:4312:3: rule__RegulatoryConstraint__FlightPermissionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__FlightPermissionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionAssignment_5()); 

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
    // InternalMyDsl.g:4320:1: rule__RegulatoryConstraint__Group__6 : rule__RegulatoryConstraint__Group__6__Impl rule__RegulatoryConstraint__Group__7 ;
    public final void rule__RegulatoryConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4324:1: ( rule__RegulatoryConstraint__Group__6__Impl rule__RegulatoryConstraint__Group__7 )
            // InternalMyDsl.g:4325:2: rule__RegulatoryConstraint__Group__6__Impl rule__RegulatoryConstraint__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__RegulatoryConstraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__7();

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
    // InternalMyDsl.g:4332:1: rule__RegulatoryConstraint__Group__6__Impl : ( 'altitudeLimit' ) ;
    public final void rule__RegulatoryConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4336:1: ( ( 'altitudeLimit' ) )
            // InternalMyDsl.g:4337:1: ( 'altitudeLimit' )
            {
            // InternalMyDsl.g:4337:1: ( 'altitudeLimit' )
            // InternalMyDsl.g:4338:2: 'altitudeLimit'
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitKeyword_6()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitKeyword_6()); 

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


    // $ANTLR start "rule__RegulatoryConstraint__Group__7"
    // InternalMyDsl.g:4347:1: rule__RegulatoryConstraint__Group__7 : rule__RegulatoryConstraint__Group__7__Impl rule__RegulatoryConstraint__Group__8 ;
    public final void rule__RegulatoryConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4351:1: ( rule__RegulatoryConstraint__Group__7__Impl rule__RegulatoryConstraint__Group__8 )
            // InternalMyDsl.g:4352:2: rule__RegulatoryConstraint__Group__7__Impl rule__RegulatoryConstraint__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__RegulatoryConstraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__8();

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
    // $ANTLR end "rule__RegulatoryConstraint__Group__7"


    // $ANTLR start "rule__RegulatoryConstraint__Group__7__Impl"
    // InternalMyDsl.g:4359:1: rule__RegulatoryConstraint__Group__7__Impl : ( '=' ) ;
    public final void rule__RegulatoryConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4363:1: ( ( '=' ) )
            // InternalMyDsl.g:4364:1: ( '=' )
            {
            // InternalMyDsl.g:4364:1: ( '=' )
            // InternalMyDsl.g:4365:2: '='
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_7()); 

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
    // $ANTLR end "rule__RegulatoryConstraint__Group__7__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__8"
    // InternalMyDsl.g:4374:1: rule__RegulatoryConstraint__Group__8 : rule__RegulatoryConstraint__Group__8__Impl rule__RegulatoryConstraint__Group__9 ;
    public final void rule__RegulatoryConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4378:1: ( rule__RegulatoryConstraint__Group__8__Impl rule__RegulatoryConstraint__Group__9 )
            // InternalMyDsl.g:4379:2: rule__RegulatoryConstraint__Group__8__Impl rule__RegulatoryConstraint__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__RegulatoryConstraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__9();

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
    // $ANTLR end "rule__RegulatoryConstraint__Group__8"


    // $ANTLR start "rule__RegulatoryConstraint__Group__8__Impl"
    // InternalMyDsl.g:4386:1: rule__RegulatoryConstraint__Group__8__Impl : ( ( rule__RegulatoryConstraint__AltitudeLimitAssignment_8 ) ) ;
    public final void rule__RegulatoryConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4390:1: ( ( ( rule__RegulatoryConstraint__AltitudeLimitAssignment_8 ) ) )
            // InternalMyDsl.g:4391:1: ( ( rule__RegulatoryConstraint__AltitudeLimitAssignment_8 ) )
            {
            // InternalMyDsl.g:4391:1: ( ( rule__RegulatoryConstraint__AltitudeLimitAssignment_8 ) )
            // InternalMyDsl.g:4392:2: ( rule__RegulatoryConstraint__AltitudeLimitAssignment_8 )
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitAssignment_8()); 
            // InternalMyDsl.g:4393:2: ( rule__RegulatoryConstraint__AltitudeLimitAssignment_8 )
            // InternalMyDsl.g:4393:3: rule__RegulatoryConstraint__AltitudeLimitAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__AltitudeLimitAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitAssignment_8()); 

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
    // $ANTLR end "rule__RegulatoryConstraint__Group__8__Impl"


    // $ANTLR start "rule__RegulatoryConstraint__Group__9"
    // InternalMyDsl.g:4401:1: rule__RegulatoryConstraint__Group__9 : rule__RegulatoryConstraint__Group__9__Impl ;
    public final void rule__RegulatoryConstraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4405:1: ( rule__RegulatoryConstraint__Group__9__Impl )
            // InternalMyDsl.g:4406:2: rule__RegulatoryConstraint__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegulatoryConstraint__Group__9__Impl();

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
    // $ANTLR end "rule__RegulatoryConstraint__Group__9"


    // $ANTLR start "rule__RegulatoryConstraint__Group__9__Impl"
    // InternalMyDsl.g:4412:1: rule__RegulatoryConstraint__Group__9__Impl : ( '}' ) ;
    public final void rule__RegulatoryConstraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4416:1: ( ( '}' ) )
            // InternalMyDsl.g:4417:1: ( '}' )
            {
            // InternalMyDsl.g:4417:1: ( '}' )
            // InternalMyDsl.g:4418:2: '}'
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__RegulatoryConstraint__Group__9__Impl"


    // $ANTLR start "rule__MissionEvent__Group__0"
    // InternalMyDsl.g:4428:1: rule__MissionEvent__Group__0 : rule__MissionEvent__Group__0__Impl rule__MissionEvent__Group__1 ;
    public final void rule__MissionEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4432:1: ( rule__MissionEvent__Group__0__Impl rule__MissionEvent__Group__1 )
            // InternalMyDsl.g:4433:2: rule__MissionEvent__Group__0__Impl rule__MissionEvent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MissionEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__1();

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
    // $ANTLR end "rule__MissionEvent__Group__0"


    // $ANTLR start "rule__MissionEvent__Group__0__Impl"
    // InternalMyDsl.g:4440:1: rule__MissionEvent__Group__0__Impl : ( 'MissionEvent' ) ;
    public final void rule__MissionEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4444:1: ( ( 'MissionEvent' ) )
            // InternalMyDsl.g:4445:1: ( 'MissionEvent' )
            {
            // InternalMyDsl.g:4445:1: ( 'MissionEvent' )
            // InternalMyDsl.g:4446:2: 'MissionEvent'
            {
             before(grammarAccess.getMissionEventAccess().getMissionEventKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getMissionEventKeyword_0()); 

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
    // $ANTLR end "rule__MissionEvent__Group__0__Impl"


    // $ANTLR start "rule__MissionEvent__Group__1"
    // InternalMyDsl.g:4455:1: rule__MissionEvent__Group__1 : rule__MissionEvent__Group__1__Impl rule__MissionEvent__Group__2 ;
    public final void rule__MissionEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4459:1: ( rule__MissionEvent__Group__1__Impl rule__MissionEvent__Group__2 )
            // InternalMyDsl.g:4460:2: rule__MissionEvent__Group__1__Impl rule__MissionEvent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MissionEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__2();

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
    // $ANTLR end "rule__MissionEvent__Group__1"


    // $ANTLR start "rule__MissionEvent__Group__1__Impl"
    // InternalMyDsl.g:4467:1: rule__MissionEvent__Group__1__Impl : ( ( rule__MissionEvent__NameAssignment_1 ) ) ;
    public final void rule__MissionEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4471:1: ( ( ( rule__MissionEvent__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4472:1: ( ( rule__MissionEvent__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4472:1: ( ( rule__MissionEvent__NameAssignment_1 ) )
            // InternalMyDsl.g:4473:2: ( rule__MissionEvent__NameAssignment_1 )
            {
             before(grammarAccess.getMissionEventAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4474:2: ( rule__MissionEvent__NameAssignment_1 )
            // InternalMyDsl.g:4474:3: rule__MissionEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MissionEvent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionEventAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MissionEvent__Group__1__Impl"


    // $ANTLR start "rule__MissionEvent__Group__2"
    // InternalMyDsl.g:4482:1: rule__MissionEvent__Group__2 : rule__MissionEvent__Group__2__Impl rule__MissionEvent__Group__3 ;
    public final void rule__MissionEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4486:1: ( rule__MissionEvent__Group__2__Impl rule__MissionEvent__Group__3 )
            // InternalMyDsl.g:4487:2: rule__MissionEvent__Group__2__Impl rule__MissionEvent__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__MissionEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__3();

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
    // $ANTLR end "rule__MissionEvent__Group__2"


    // $ANTLR start "rule__MissionEvent__Group__2__Impl"
    // InternalMyDsl.g:4494:1: rule__MissionEvent__Group__2__Impl : ( '{' ) ;
    public final void rule__MissionEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4498:1: ( ( '{' ) )
            // InternalMyDsl.g:4499:1: ( '{' )
            {
            // InternalMyDsl.g:4499:1: ( '{' )
            // InternalMyDsl.g:4500:2: '{'
            {
             before(grammarAccess.getMissionEventAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__MissionEvent__Group__2__Impl"


    // $ANTLR start "rule__MissionEvent__Group__3"
    // InternalMyDsl.g:4509:1: rule__MissionEvent__Group__3 : rule__MissionEvent__Group__3__Impl rule__MissionEvent__Group__4 ;
    public final void rule__MissionEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4513:1: ( rule__MissionEvent__Group__3__Impl rule__MissionEvent__Group__4 )
            // InternalMyDsl.g:4514:2: rule__MissionEvent__Group__3__Impl rule__MissionEvent__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MissionEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__4();

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
    // $ANTLR end "rule__MissionEvent__Group__3"


    // $ANTLR start "rule__MissionEvent__Group__3__Impl"
    // InternalMyDsl.g:4521:1: rule__MissionEvent__Group__3__Impl : ( 'eventType' ) ;
    public final void rule__MissionEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4525:1: ( ( 'eventType' ) )
            // InternalMyDsl.g:4526:1: ( 'eventType' )
            {
            // InternalMyDsl.g:4526:1: ( 'eventType' )
            // InternalMyDsl.g:4527:2: 'eventType'
            {
             before(grammarAccess.getMissionEventAccess().getEventTypeKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getEventTypeKeyword_3()); 

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
    // $ANTLR end "rule__MissionEvent__Group__3__Impl"


    // $ANTLR start "rule__MissionEvent__Group__4"
    // InternalMyDsl.g:4536:1: rule__MissionEvent__Group__4 : rule__MissionEvent__Group__4__Impl rule__MissionEvent__Group__5 ;
    public final void rule__MissionEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4540:1: ( rule__MissionEvent__Group__4__Impl rule__MissionEvent__Group__5 )
            // InternalMyDsl.g:4541:2: rule__MissionEvent__Group__4__Impl rule__MissionEvent__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__MissionEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__5();

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
    // $ANTLR end "rule__MissionEvent__Group__4"


    // $ANTLR start "rule__MissionEvent__Group__4__Impl"
    // InternalMyDsl.g:4548:1: rule__MissionEvent__Group__4__Impl : ( '=' ) ;
    public final void rule__MissionEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4552:1: ( ( '=' ) )
            // InternalMyDsl.g:4553:1: ( '=' )
            {
            // InternalMyDsl.g:4553:1: ( '=' )
            // InternalMyDsl.g:4554:2: '='
            {
             before(grammarAccess.getMissionEventAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__MissionEvent__Group__4__Impl"


    // $ANTLR start "rule__MissionEvent__Group__5"
    // InternalMyDsl.g:4563:1: rule__MissionEvent__Group__5 : rule__MissionEvent__Group__5__Impl rule__MissionEvent__Group__6 ;
    public final void rule__MissionEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4567:1: ( rule__MissionEvent__Group__5__Impl rule__MissionEvent__Group__6 )
            // InternalMyDsl.g:4568:2: rule__MissionEvent__Group__5__Impl rule__MissionEvent__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__MissionEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__6();

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
    // $ANTLR end "rule__MissionEvent__Group__5"


    // $ANTLR start "rule__MissionEvent__Group__5__Impl"
    // InternalMyDsl.g:4575:1: rule__MissionEvent__Group__5__Impl : ( ( rule__MissionEvent__EventTypeAssignment_5 ) ) ;
    public final void rule__MissionEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4579:1: ( ( ( rule__MissionEvent__EventTypeAssignment_5 ) ) )
            // InternalMyDsl.g:4580:1: ( ( rule__MissionEvent__EventTypeAssignment_5 ) )
            {
            // InternalMyDsl.g:4580:1: ( ( rule__MissionEvent__EventTypeAssignment_5 ) )
            // InternalMyDsl.g:4581:2: ( rule__MissionEvent__EventTypeAssignment_5 )
            {
             before(grammarAccess.getMissionEventAccess().getEventTypeAssignment_5()); 
            // InternalMyDsl.g:4582:2: ( rule__MissionEvent__EventTypeAssignment_5 )
            // InternalMyDsl.g:4582:3: rule__MissionEvent__EventTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MissionEvent__EventTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMissionEventAccess().getEventTypeAssignment_5()); 

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
    // $ANTLR end "rule__MissionEvent__Group__5__Impl"


    // $ANTLR start "rule__MissionEvent__Group__6"
    // InternalMyDsl.g:4590:1: rule__MissionEvent__Group__6 : rule__MissionEvent__Group__6__Impl rule__MissionEvent__Group__7 ;
    public final void rule__MissionEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4594:1: ( rule__MissionEvent__Group__6__Impl rule__MissionEvent__Group__7 )
            // InternalMyDsl.g:4595:2: rule__MissionEvent__Group__6__Impl rule__MissionEvent__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__MissionEvent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__7();

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
    // $ANTLR end "rule__MissionEvent__Group__6"


    // $ANTLR start "rule__MissionEvent__Group__6__Impl"
    // InternalMyDsl.g:4602:1: rule__MissionEvent__Group__6__Impl : ( 'impactLevel' ) ;
    public final void rule__MissionEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4606:1: ( ( 'impactLevel' ) )
            // InternalMyDsl.g:4607:1: ( 'impactLevel' )
            {
            // InternalMyDsl.g:4607:1: ( 'impactLevel' )
            // InternalMyDsl.g:4608:2: 'impactLevel'
            {
             before(grammarAccess.getMissionEventAccess().getImpactLevelKeyword_6()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getImpactLevelKeyword_6()); 

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
    // $ANTLR end "rule__MissionEvent__Group__6__Impl"


    // $ANTLR start "rule__MissionEvent__Group__7"
    // InternalMyDsl.g:4617:1: rule__MissionEvent__Group__7 : rule__MissionEvent__Group__7__Impl rule__MissionEvent__Group__8 ;
    public final void rule__MissionEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4621:1: ( rule__MissionEvent__Group__7__Impl rule__MissionEvent__Group__8 )
            // InternalMyDsl.g:4622:2: rule__MissionEvent__Group__7__Impl rule__MissionEvent__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__MissionEvent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__8();

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
    // $ANTLR end "rule__MissionEvent__Group__7"


    // $ANTLR start "rule__MissionEvent__Group__7__Impl"
    // InternalMyDsl.g:4629:1: rule__MissionEvent__Group__7__Impl : ( '=' ) ;
    public final void rule__MissionEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4633:1: ( ( '=' ) )
            // InternalMyDsl.g:4634:1: ( '=' )
            {
            // InternalMyDsl.g:4634:1: ( '=' )
            // InternalMyDsl.g:4635:2: '='
            {
             before(grammarAccess.getMissionEventAccess().getEqualsSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getEqualsSignKeyword_7()); 

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
    // $ANTLR end "rule__MissionEvent__Group__7__Impl"


    // $ANTLR start "rule__MissionEvent__Group__8"
    // InternalMyDsl.g:4644:1: rule__MissionEvent__Group__8 : rule__MissionEvent__Group__8__Impl rule__MissionEvent__Group__9 ;
    public final void rule__MissionEvent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4648:1: ( rule__MissionEvent__Group__8__Impl rule__MissionEvent__Group__9 )
            // InternalMyDsl.g:4649:2: rule__MissionEvent__Group__8__Impl rule__MissionEvent__Group__9
            {
            pushFollow(FOLLOW_47);
            rule__MissionEvent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__9();

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
    // $ANTLR end "rule__MissionEvent__Group__8"


    // $ANTLR start "rule__MissionEvent__Group__8__Impl"
    // InternalMyDsl.g:4656:1: rule__MissionEvent__Group__8__Impl : ( ( rule__MissionEvent__ImpactLevelAssignment_8 ) ) ;
    public final void rule__MissionEvent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4660:1: ( ( ( rule__MissionEvent__ImpactLevelAssignment_8 ) ) )
            // InternalMyDsl.g:4661:1: ( ( rule__MissionEvent__ImpactLevelAssignment_8 ) )
            {
            // InternalMyDsl.g:4661:1: ( ( rule__MissionEvent__ImpactLevelAssignment_8 ) )
            // InternalMyDsl.g:4662:2: ( rule__MissionEvent__ImpactLevelAssignment_8 )
            {
             before(grammarAccess.getMissionEventAccess().getImpactLevelAssignment_8()); 
            // InternalMyDsl.g:4663:2: ( rule__MissionEvent__ImpactLevelAssignment_8 )
            // InternalMyDsl.g:4663:3: rule__MissionEvent__ImpactLevelAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__MissionEvent__ImpactLevelAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMissionEventAccess().getImpactLevelAssignment_8()); 

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
    // $ANTLR end "rule__MissionEvent__Group__8__Impl"


    // $ANTLR start "rule__MissionEvent__Group__9"
    // InternalMyDsl.g:4671:1: rule__MissionEvent__Group__9 : rule__MissionEvent__Group__9__Impl rule__MissionEvent__Group__10 ;
    public final void rule__MissionEvent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4675:1: ( rule__MissionEvent__Group__9__Impl rule__MissionEvent__Group__10 )
            // InternalMyDsl.g:4676:2: rule__MissionEvent__Group__9__Impl rule__MissionEvent__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__MissionEvent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__10();

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
    // $ANTLR end "rule__MissionEvent__Group__9"


    // $ANTLR start "rule__MissionEvent__Group__9__Impl"
    // InternalMyDsl.g:4683:1: rule__MissionEvent__Group__9__Impl : ( 'responseAction' ) ;
    public final void rule__MissionEvent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4687:1: ( ( 'responseAction' ) )
            // InternalMyDsl.g:4688:1: ( 'responseAction' )
            {
            // InternalMyDsl.g:4688:1: ( 'responseAction' )
            // InternalMyDsl.g:4689:2: 'responseAction'
            {
             before(grammarAccess.getMissionEventAccess().getResponseActionKeyword_9()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getResponseActionKeyword_9()); 

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
    // $ANTLR end "rule__MissionEvent__Group__9__Impl"


    // $ANTLR start "rule__MissionEvent__Group__10"
    // InternalMyDsl.g:4698:1: rule__MissionEvent__Group__10 : rule__MissionEvent__Group__10__Impl rule__MissionEvent__Group__11 ;
    public final void rule__MissionEvent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4702:1: ( rule__MissionEvent__Group__10__Impl rule__MissionEvent__Group__11 )
            // InternalMyDsl.g:4703:2: rule__MissionEvent__Group__10__Impl rule__MissionEvent__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__MissionEvent__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__11();

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
    // $ANTLR end "rule__MissionEvent__Group__10"


    // $ANTLR start "rule__MissionEvent__Group__10__Impl"
    // InternalMyDsl.g:4710:1: rule__MissionEvent__Group__10__Impl : ( '=' ) ;
    public final void rule__MissionEvent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4714:1: ( ( '=' ) )
            // InternalMyDsl.g:4715:1: ( '=' )
            {
            // InternalMyDsl.g:4715:1: ( '=' )
            // InternalMyDsl.g:4716:2: '='
            {
             before(grammarAccess.getMissionEventAccess().getEqualsSignKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getEqualsSignKeyword_10()); 

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
    // $ANTLR end "rule__MissionEvent__Group__10__Impl"


    // $ANTLR start "rule__MissionEvent__Group__11"
    // InternalMyDsl.g:4725:1: rule__MissionEvent__Group__11 : rule__MissionEvent__Group__11__Impl rule__MissionEvent__Group__12 ;
    public final void rule__MissionEvent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4729:1: ( rule__MissionEvent__Group__11__Impl rule__MissionEvent__Group__12 )
            // InternalMyDsl.g:4730:2: rule__MissionEvent__Group__11__Impl rule__MissionEvent__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__MissionEvent__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__12();

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
    // $ANTLR end "rule__MissionEvent__Group__11"


    // $ANTLR start "rule__MissionEvent__Group__11__Impl"
    // InternalMyDsl.g:4737:1: rule__MissionEvent__Group__11__Impl : ( ( rule__MissionEvent__ResponseActionAssignment_11 ) ) ;
    public final void rule__MissionEvent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4741:1: ( ( ( rule__MissionEvent__ResponseActionAssignment_11 ) ) )
            // InternalMyDsl.g:4742:1: ( ( rule__MissionEvent__ResponseActionAssignment_11 ) )
            {
            // InternalMyDsl.g:4742:1: ( ( rule__MissionEvent__ResponseActionAssignment_11 ) )
            // InternalMyDsl.g:4743:2: ( rule__MissionEvent__ResponseActionAssignment_11 )
            {
             before(grammarAccess.getMissionEventAccess().getResponseActionAssignment_11()); 
            // InternalMyDsl.g:4744:2: ( rule__MissionEvent__ResponseActionAssignment_11 )
            // InternalMyDsl.g:4744:3: rule__MissionEvent__ResponseActionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__MissionEvent__ResponseActionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMissionEventAccess().getResponseActionAssignment_11()); 

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
    // $ANTLR end "rule__MissionEvent__Group__11__Impl"


    // $ANTLR start "rule__MissionEvent__Group__12"
    // InternalMyDsl.g:4752:1: rule__MissionEvent__Group__12 : rule__MissionEvent__Group__12__Impl ;
    public final void rule__MissionEvent__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4756:1: ( rule__MissionEvent__Group__12__Impl )
            // InternalMyDsl.g:4757:2: rule__MissionEvent__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionEvent__Group__12__Impl();

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
    // $ANTLR end "rule__MissionEvent__Group__12"


    // $ANTLR start "rule__MissionEvent__Group__12__Impl"
    // InternalMyDsl.g:4763:1: rule__MissionEvent__Group__12__Impl : ( '}' ) ;
    public final void rule__MissionEvent__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4767:1: ( ( '}' ) )
            // InternalMyDsl.g:4768:1: ( '}' )
            {
            // InternalMyDsl.g:4768:1: ( '}' )
            // InternalMyDsl.g:4769:2: '}'
            {
             before(grammarAccess.getMissionEventAccess().getRightCurlyBracketKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__MissionEvent__Group__12__Impl"


    // $ANTLR start "rule__Model__MissionsAssignment_0"
    // InternalMyDsl.g:4779:1: rule__Model__MissionsAssignment_0 : ( ruleMission ) ;
    public final void rule__Model__MissionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4783:1: ( ( ruleMission ) )
            // InternalMyDsl.g:4784:2: ( ruleMission )
            {
            // InternalMyDsl.g:4784:2: ( ruleMission )
            // InternalMyDsl.g:4785:3: ruleMission
            {
             before(grammarAccess.getModelAccess().getMissionsMissionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMissionsMissionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__MissionsAssignment_0"


    // $ANTLR start "rule__Model__DronesAssignment_1"
    // InternalMyDsl.g:4794:1: rule__Model__DronesAssignment_1 : ( ruleDrone ) ;
    public final void rule__Model__DronesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4798:1: ( ( ruleDrone ) )
            // InternalMyDsl.g:4799:2: ( ruleDrone )
            {
            // InternalMyDsl.g:4799:2: ( ruleDrone )
            // InternalMyDsl.g:4800:3: ruleDrone
            {
             before(grammarAccess.getModelAccess().getDronesDroneParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDronesDroneParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__DronesAssignment_1"


    // $ANTLR start "rule__Model__EnergyModelsAssignment_2"
    // InternalMyDsl.g:4809:1: rule__Model__EnergyModelsAssignment_2 : ( ruleEnergyModel ) ;
    public final void rule__Model__EnergyModelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4813:1: ( ( ruleEnergyModel ) )
            // InternalMyDsl.g:4814:2: ( ruleEnergyModel )
            {
            // InternalMyDsl.g:4814:2: ( ruleEnergyModel )
            // InternalMyDsl.g:4815:3: ruleEnergyModel
            {
             before(grammarAccess.getModelAccess().getEnergyModelsEnergyModelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnergyModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEnergyModelsEnergyModelParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__EnergyModelsAssignment_2"


    // $ANTLR start "rule__Model__PhasesAssignment_3"
    // InternalMyDsl.g:4824:1: rule__Model__PhasesAssignment_3 : ( rulePhase ) ;
    public final void rule__Model__PhasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4828:1: ( ( rulePhase ) )
            // InternalMyDsl.g:4829:2: ( rulePhase )
            {
            // InternalMyDsl.g:4829:2: ( rulePhase )
            // InternalMyDsl.g:4830:3: rulePhase
            {
             before(grammarAccess.getModelAccess().getPhasesPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPhasesPhaseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__PhasesAssignment_3"


    // $ANTLR start "rule__Model__SubPhasesAssignment_4"
    // InternalMyDsl.g:4839:1: rule__Model__SubPhasesAssignment_4 : ( ruleSubPhase ) ;
    public final void rule__Model__SubPhasesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( ( ruleSubPhase ) )
            // InternalMyDsl.g:4844:2: ( ruleSubPhase )
            {
            // InternalMyDsl.g:4844:2: ( ruleSubPhase )
            // InternalMyDsl.g:4845:3: ruleSubPhase
            {
             before(grammarAccess.getModelAccess().getSubPhasesSubPhaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSubPhase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSubPhasesSubPhaseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__SubPhasesAssignment_4"


    // $ANTLR start "rule__Model__ActionsAssignment_5"
    // InternalMyDsl.g:4854:1: rule__Model__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Model__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4858:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4859:2: ( ruleAction )
            {
            // InternalMyDsl.g:4859:2: ( ruleAction )
            // InternalMyDsl.g:4860:3: ruleAction
            {
             before(grammarAccess.getModelAccess().getActionsActionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActionsActionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__ActionsAssignment_5"


    // $ANTLR start "rule__Model__ConstraintsAssignment_6"
    // InternalMyDsl.g:4869:1: rule__Model__ConstraintsAssignment_6 : ( ruleConstraint ) ;
    public final void rule__Model__ConstraintsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( ( ruleConstraint ) )
            // InternalMyDsl.g:4874:2: ( ruleConstraint )
            {
            // InternalMyDsl.g:4874:2: ( ruleConstraint )
            // InternalMyDsl.g:4875:3: ruleConstraint
            {
             before(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Model__ConstraintsAssignment_6"


    // $ANTLR start "rule__Model__MissionEVentsAssignment_7"
    // InternalMyDsl.g:4884:1: rule__Model__MissionEVentsAssignment_7 : ( ruleMissionEvent ) ;
    public final void rule__Model__MissionEVentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4888:1: ( ( ruleMissionEvent ) )
            // InternalMyDsl.g:4889:2: ( ruleMissionEvent )
            {
            // InternalMyDsl.g:4889:2: ( ruleMissionEvent )
            // InternalMyDsl.g:4890:3: ruleMissionEvent
            {
             before(grammarAccess.getModelAccess().getMissionEVentsMissionEventParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleMissionEvent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMissionEVentsMissionEventParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Model__MissionEVentsAssignment_7"


    // $ANTLR start "rule__Mission__NameAssignment_1"
    // InternalMyDsl.g:4899:1: rule__Mission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4903:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4904:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4904:2: ( RULE_ID )
            // InternalMyDsl.g:4905:3: RULE_ID
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


    // $ANTLR start "rule__Mission__IdAssignment_5"
    // InternalMyDsl.g:4914:1: rule__Mission__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Mission__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4918:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4919:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4919:2: ( RULE_STRING )
            // InternalMyDsl.g:4920:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getIdSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getIdSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Mission__IdAssignment_5"


    // $ANTLR start "rule__Mission__MissionTypeAssignment_8"
    // InternalMyDsl.g:4929:1: rule__Mission__MissionTypeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Mission__MissionTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4933:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4934:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4934:2: ( RULE_STRING )
            // InternalMyDsl.g:4935:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getMissionTypeSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionTypeSTRINGTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Mission__MissionTypeAssignment_8"


    // $ANTLR start "rule__Mission__StartLocationAssignment_11"
    // InternalMyDsl.g:4944:1: rule__Mission__StartLocationAssignment_11 : ( RULE_STRING ) ;
    public final void rule__Mission__StartLocationAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4948:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4949:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4949:2: ( RULE_STRING )
            // InternalMyDsl.g:4950:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getStartLocationSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getStartLocationSTRINGTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Mission__StartLocationAssignment_11"


    // $ANTLR start "rule__Mission__EndLocationAssignment_14"
    // InternalMyDsl.g:4959:1: rule__Mission__EndLocationAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Mission__EndLocationAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4963:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4964:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4964:2: ( RULE_STRING )
            // InternalMyDsl.g:4965:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getEndLocationSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEndLocationSTRINGTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__Mission__EndLocationAssignment_14"


    // $ANTLR start "rule__Mission__PriorityAssignment_17"
    // InternalMyDsl.g:4974:1: rule__Mission__PriorityAssignment_17 : ( RULE_INT ) ;
    public final void rule__Mission__PriorityAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4978:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4979:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4979:2: ( RULE_INT )
            // InternalMyDsl.g:4980:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getPriorityINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getPriorityINTTerminalRuleCall_17_0()); 

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
    // $ANTLR end "rule__Mission__PriorityAssignment_17"


    // $ANTLR start "rule__Mission__EstimatedTimeAssignment_20"
    // InternalMyDsl.g:4989:1: rule__Mission__EstimatedTimeAssignment_20 : ( RULE_FLOAT ) ;
    public final void rule__Mission__EstimatedTimeAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4993:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:4994:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:4994:2: ( RULE_FLOAT )
            // InternalMyDsl.g:4995:3: RULE_FLOAT
            {
             before(grammarAccess.getMissionAccess().getEstimatedTimeFLOATTerminalRuleCall_20_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEstimatedTimeFLOATTerminalRuleCall_20_0()); 

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
    // $ANTLR end "rule__Mission__EstimatedTimeAssignment_20"


    // $ANTLR start "rule__Mission__AddDronesAssignment_23"
    // InternalMyDsl.g:5004:1: rule__Mission__AddDronesAssignment_23 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__AddDronesAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5008:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5009:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5009:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5010:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_23_0()); 
            // InternalMyDsl.g:5011:3: ( RULE_ID )
            // InternalMyDsl.g:5012:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getAddDronesDroneIDTerminalRuleCall_23_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddDronesDroneIDTerminalRuleCall_23_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_23_0()); 

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
    // $ANTLR end "rule__Mission__AddDronesAssignment_23"


    // $ANTLR start "rule__Mission__AddDronesAssignment_24_1"
    // InternalMyDsl.g:5023:1: rule__Mission__AddDronesAssignment_24_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__AddDronesAssignment_24_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5027:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5028:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5028:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5029:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_24_1_0()); 
            // InternalMyDsl.g:5030:3: ( RULE_ID )
            // InternalMyDsl.g:5031:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getAddDronesDroneIDTerminalRuleCall_24_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddDronesDroneIDTerminalRuleCall_24_1_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_24_1_0()); 

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
    // $ANTLR end "rule__Mission__AddDronesAssignment_24_1"


    // $ANTLR start "rule__Mission__AddPhasesAssignment_27"
    // InternalMyDsl.g:5042:1: rule__Mission__AddPhasesAssignment_27 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__AddPhasesAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5046:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5047:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5047:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5048:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_27_0()); 
            // InternalMyDsl.g:5049:3: ( RULE_ID )
            // InternalMyDsl.g:5050:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getAddPhasesPhaseIDTerminalRuleCall_27_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddPhasesPhaseIDTerminalRuleCall_27_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_27_0()); 

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
    // $ANTLR end "rule__Mission__AddPhasesAssignment_27"


    // $ANTLR start "rule__Mission__AddPhasesAssignment_28_1"
    // InternalMyDsl.g:5061:1: rule__Mission__AddPhasesAssignment_28_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__AddPhasesAssignment_28_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5065:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5066:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5066:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5067:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_28_1_0()); 
            // InternalMyDsl.g:5068:3: ( RULE_ID )
            // InternalMyDsl.g:5069:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getAddPhasesPhaseIDTerminalRuleCall_28_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddPhasesPhaseIDTerminalRuleCall_28_1_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_28_1_0()); 

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
    // $ANTLR end "rule__Mission__AddPhasesAssignment_28_1"


    // $ANTLR start "rule__Mission__AddConstraintsAssignment_31"
    // InternalMyDsl.g:5080:1: rule__Mission__AddConstraintsAssignment_31 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__AddConstraintsAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5084:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5085:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5085:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5086:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_31_0()); 
            // InternalMyDsl.g:5087:3: ( RULE_ID )
            // InternalMyDsl.g:5088:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getAddConstraintsConstraintIDTerminalRuleCall_31_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddConstraintsConstraintIDTerminalRuleCall_31_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_31_0()); 

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
    // $ANTLR end "rule__Mission__AddConstraintsAssignment_31"


    // $ANTLR start "rule__Mission__AddConstraintsAssignment_32_1"
    // InternalMyDsl.g:5099:1: rule__Mission__AddConstraintsAssignment_32_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__AddConstraintsAssignment_32_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5103:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5104:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5104:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5105:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_32_1_0()); 
            // InternalMyDsl.g:5106:3: ( RULE_ID )
            // InternalMyDsl.g:5107:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getAddConstraintsConstraintIDTerminalRuleCall_32_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddConstraintsConstraintIDTerminalRuleCall_32_1_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_32_1_0()); 

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
    // $ANTLR end "rule__Mission__AddConstraintsAssignment_32_1"


    // $ANTLR start "rule__Mission__AddEventsAssignment_35"
    // InternalMyDsl.g:5118:1: rule__Mission__AddEventsAssignment_35 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__AddEventsAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5122:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5123:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5123:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5124:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_35_0()); 
            // InternalMyDsl.g:5125:3: ( RULE_ID )
            // InternalMyDsl.g:5126:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getAddEventsMissionEventIDTerminalRuleCall_35_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddEventsMissionEventIDTerminalRuleCall_35_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_35_0()); 

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
    // $ANTLR end "rule__Mission__AddEventsAssignment_35"


    // $ANTLR start "rule__Mission__AddEventsAssignment_36_1"
    // InternalMyDsl.g:5137:1: rule__Mission__AddEventsAssignment_36_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mission__AddEventsAssignment_36_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5141:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5142:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5142:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5143:3: ( RULE_ID )
            {
             before(grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_36_1_0()); 
            // InternalMyDsl.g:5144:3: ( RULE_ID )
            // InternalMyDsl.g:5145:4: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getAddEventsMissionEventIDTerminalRuleCall_36_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAddEventsMissionEventIDTerminalRuleCall_36_1_0_1()); 

            }

             after(grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_36_1_0()); 

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
    // $ANTLR end "rule__Mission__AddEventsAssignment_36_1"


    // $ANTLR start "rule__Drone__NameAssignment_1"
    // InternalMyDsl.g:5156:1: rule__Drone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Drone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5160:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5161:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5161:2: ( RULE_ID )
            // InternalMyDsl.g:5162:3: RULE_ID
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


    // $ANTLR start "rule__Drone__TypeAssignment_5"
    // InternalMyDsl.g:5171:1: rule__Drone__TypeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Drone__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5175:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5176:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5176:2: ( RULE_STRING )
            // InternalMyDsl.g:5177:3: RULE_STRING
            {
             before(grammarAccess.getDroneAccess().getTypeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getTypeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Drone__TypeAssignment_5"


    // $ANTLR start "rule__Drone__BatterCapacityAssignment_8"
    // InternalMyDsl.g:5186:1: rule__Drone__BatterCapacityAssignment_8 : ( RULE_FLOAT ) ;
    public final void rule__Drone__BatterCapacityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5190:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5191:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5191:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5192:3: RULE_FLOAT
            {
             before(grammarAccess.getDroneAccess().getBatterCapacityFLOATTerminalRuleCall_8_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getBatterCapacityFLOATTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Drone__BatterCapacityAssignment_8"


    // $ANTLR start "rule__Drone__MaxFlightTimeAssignment_11"
    // InternalMyDsl.g:5201:1: rule__Drone__MaxFlightTimeAssignment_11 : ( RULE_FLOAT ) ;
    public final void rule__Drone__MaxFlightTimeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5205:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5206:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5206:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5207:3: RULE_FLOAT
            {
             before(grammarAccess.getDroneAccess().getMaxFlightTimeFLOATTerminalRuleCall_11_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getMaxFlightTimeFLOATTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Drone__MaxFlightTimeAssignment_11"


    // $ANTLR start "rule__Drone__PayloadCapacityAssignment_14"
    // InternalMyDsl.g:5216:1: rule__Drone__PayloadCapacityAssignment_14 : ( RULE_FLOAT ) ;
    public final void rule__Drone__PayloadCapacityAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5220:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5221:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5221:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5222:3: RULE_FLOAT
            {
             before(grammarAccess.getDroneAccess().getPayloadCapacityFLOATTerminalRuleCall_14_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getPayloadCapacityFLOATTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__Drone__PayloadCapacityAssignment_14"


    // $ANTLR start "rule__Drone__RoleAssignment_17"
    // InternalMyDsl.g:5231:1: rule__Drone__RoleAssignment_17 : ( RULE_STRING ) ;
    public final void rule__Drone__RoleAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5235:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5236:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5236:2: ( RULE_STRING )
            // InternalMyDsl.g:5237:3: RULE_STRING
            {
             before(grammarAccess.getDroneAccess().getRoleSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRoleSTRINGTerminalRuleCall_17_0()); 

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
    // $ANTLR end "rule__Drone__RoleAssignment_17"


    // $ANTLR start "rule__Drone__AddEnergyModelAssignment_20"
    // InternalMyDsl.g:5246:1: rule__Drone__AddEnergyModelAssignment_20 : ( ( RULE_ID ) ) ;
    public final void rule__Drone__AddEnergyModelAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5250:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5251:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5251:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5252:3: ( RULE_ID )
            {
             before(grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_20_0()); 
            // InternalMyDsl.g:5253:3: ( RULE_ID )
            // InternalMyDsl.g:5254:4: RULE_ID
            {
             before(grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelIDTerminalRuleCall_20_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelIDTerminalRuleCall_20_0_1()); 

            }

             after(grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_20_0()); 

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
    // $ANTLR end "rule__Drone__AddEnergyModelAssignment_20"


    // $ANTLR start "rule__Drone__AddEnergyModelAssignment_21_1"
    // InternalMyDsl.g:5265:1: rule__Drone__AddEnergyModelAssignment_21_1 : ( ( RULE_ID ) ) ;
    public final void rule__Drone__AddEnergyModelAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5269:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5270:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5270:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5271:3: ( RULE_ID )
            {
             before(grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_21_1_0()); 
            // InternalMyDsl.g:5272:3: ( RULE_ID )
            // InternalMyDsl.g:5273:4: RULE_ID
            {
             before(grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelIDTerminalRuleCall_21_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelIDTerminalRuleCall_21_1_0_1()); 

            }

             after(grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_21_1_0()); 

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
    // $ANTLR end "rule__Drone__AddEnergyModelAssignment_21_1"


    // $ANTLR start "rule__EnergyModel__NameAssignment_1"
    // InternalMyDsl.g:5284:1: rule__EnergyModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnergyModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5288:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5289:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5289:2: ( RULE_ID )
            // InternalMyDsl.g:5290:3: RULE_ID
            {
             before(grammarAccess.getEnergyModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnergyModel__NameAssignment_1"


    // $ANTLR start "rule__EnergyModel__ConsumptionRateAssignment_5"
    // InternalMyDsl.g:5299:1: rule__EnergyModel__ConsumptionRateAssignment_5 : ( RULE_FLOAT ) ;
    public final void rule__EnergyModel__ConsumptionRateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5303:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5304:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5304:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5305:3: RULE_FLOAT
            {
             before(grammarAccess.getEnergyModelAccess().getConsumptionRateFLOATTerminalRuleCall_5_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getConsumptionRateFLOATTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__EnergyModel__ConsumptionRateAssignment_5"


    // $ANTLR start "rule__EnergyModel__BatteryHealthAssignment_8"
    // InternalMyDsl.g:5314:1: rule__EnergyModel__BatteryHealthAssignment_8 : ( RULE_FLOAT ) ;
    public final void rule__EnergyModel__BatteryHealthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5318:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5319:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5319:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5320:3: RULE_FLOAT
            {
             before(grammarAccess.getEnergyModelAccess().getBatteryHealthFLOATTerminalRuleCall_8_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getBatteryHealthFLOATTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__EnergyModel__BatteryHealthAssignment_8"


    // $ANTLR start "rule__EnergyModel__CapacityAssignment_11"
    // InternalMyDsl.g:5329:1: rule__EnergyModel__CapacityAssignment_11 : ( RULE_FLOAT ) ;
    public final void rule__EnergyModel__CapacityAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5333:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5334:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5334:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5335:3: RULE_FLOAT
            {
             before(grammarAccess.getEnergyModelAccess().getCapacityFLOATTerminalRuleCall_11_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getEnergyModelAccess().getCapacityFLOATTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__EnergyModel__CapacityAssignment_11"


    // $ANTLR start "rule__Phase__NameAssignment_1"
    // InternalMyDsl.g:5344:1: rule__Phase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Phase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5348:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5349:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5349:2: ( RULE_ID )
            // InternalMyDsl.g:5350:3: RULE_ID
            {
             before(grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Phase__NameAssignment_1"


    // $ANTLR start "rule__Phase__PhaseTypeAssignment_5"
    // InternalMyDsl.g:5359:1: rule__Phase__PhaseTypeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Phase__PhaseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5363:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5364:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5364:2: ( RULE_STRING )
            // InternalMyDsl.g:5365:3: RULE_STRING
            {
             before(grammarAccess.getPhaseAccess().getPhaseTypeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getPhaseTypeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Phase__PhaseTypeAssignment_5"


    // $ANTLR start "rule__Phase__EnergyUsageAssignment_8"
    // InternalMyDsl.g:5374:1: rule__Phase__EnergyUsageAssignment_8 : ( RULE_FLOAT ) ;
    public final void rule__Phase__EnergyUsageAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5378:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5379:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5379:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5380:3: RULE_FLOAT
            {
             before(grammarAccess.getPhaseAccess().getEnergyUsageFLOATTerminalRuleCall_8_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getEnergyUsageFLOATTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Phase__EnergyUsageAssignment_8"


    // $ANTLR start "rule__Phase__AddSubPhaseAssignment_11"
    // InternalMyDsl.g:5389:1: rule__Phase__AddSubPhaseAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Phase__AddSubPhaseAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5393:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5394:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5394:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5395:3: ( RULE_ID )
            {
             before(grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_11_0()); 
            // InternalMyDsl.g:5396:3: ( RULE_ID )
            // InternalMyDsl.g:5397:4: RULE_ID
            {
             before(grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_11_0()); 

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
    // $ANTLR end "rule__Phase__AddSubPhaseAssignment_11"


    // $ANTLR start "rule__Phase__AddSubPhaseAssignment_12_1"
    // InternalMyDsl.g:5408:1: rule__Phase__AddSubPhaseAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__Phase__AddSubPhaseAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5412:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5413:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5413:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5414:3: ( RULE_ID )
            {
             before(grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_12_1_0()); 
            // InternalMyDsl.g:5415:3: ( RULE_ID )
            // InternalMyDsl.g:5416:4: RULE_ID
            {
             before(grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_12_1_0()); 

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
    // $ANTLR end "rule__Phase__AddSubPhaseAssignment_12_1"


    // $ANTLR start "rule__SubPhase__NameAssignment_1"
    // InternalMyDsl.g:5427:1: rule__SubPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5431:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5432:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5432:2: ( RULE_ID )
            // InternalMyDsl.g:5433:3: RULE_ID
            {
             before(grammarAccess.getSubPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SubPhase__NameAssignment_1"


    // $ANTLR start "rule__SubPhase__SubPhaseTypeAssignment_5"
    // InternalMyDsl.g:5442:1: rule__SubPhase__SubPhaseTypeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__SubPhase__SubPhaseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5446:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5447:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5447:2: ( RULE_STRING )
            // InternalMyDsl.g:5448:3: RULE_STRING
            {
             before(grammarAccess.getSubPhaseAccess().getSubPhaseTypeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getSubPhaseTypeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__SubPhase__SubPhaseTypeAssignment_5"


    // $ANTLR start "rule__SubPhase__DurationAssignment_8"
    // InternalMyDsl.g:5457:1: rule__SubPhase__DurationAssignment_8 : ( RULE_FLOAT ) ;
    public final void rule__SubPhase__DurationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5461:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5462:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5462:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5463:3: RULE_FLOAT
            {
             before(grammarAccess.getSubPhaseAccess().getDurationFLOATTerminalRuleCall_8_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getDurationFLOATTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__SubPhase__DurationAssignment_8"


    // $ANTLR start "rule__SubPhase__AddActionAssignment_11"
    // InternalMyDsl.g:5472:1: rule__SubPhase__AddActionAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__SubPhase__AddActionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5476:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5477:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5477:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5478:3: ( RULE_ID )
            {
             before(grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_11_0()); 
            // InternalMyDsl.g:5479:3: ( RULE_ID )
            // InternalMyDsl.g:5480:4: RULE_ID
            {
             before(grammarAccess.getSubPhaseAccess().getAddActionActionIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getAddActionActionIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_11_0()); 

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
    // $ANTLR end "rule__SubPhase__AddActionAssignment_11"


    // $ANTLR start "rule__SubPhase__AddActionAssignment_12_1"
    // InternalMyDsl.g:5491:1: rule__SubPhase__AddActionAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubPhase__AddActionAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5495:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5496:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5496:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5497:3: ( RULE_ID )
            {
             before(grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_12_1_0()); 
            // InternalMyDsl.g:5498:3: ( RULE_ID )
            // InternalMyDsl.g:5499:4: RULE_ID
            {
             before(grammarAccess.getSubPhaseAccess().getAddActionActionIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubPhaseAccess().getAddActionActionIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_12_1_0()); 

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
    // $ANTLR end "rule__SubPhase__AddActionAssignment_12_1"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalMyDsl.g:5510:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5514:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5515:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5515:2: ( RULE_ID )
            // InternalMyDsl.g:5516:3: RULE_ID
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


    // $ANTLR start "rule__Action__ActionTypeAssignment_5"
    // InternalMyDsl.g:5525:1: rule__Action__ActionTypeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Action__ActionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5529:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5530:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5530:2: ( RULE_STRING )
            // InternalMyDsl.g:5531:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getActionTypeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionTypeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Action__ActionTypeAssignment_5"


    // $ANTLR start "rule__Action__InputOutputAssignment_8"
    // InternalMyDsl.g:5540:1: rule__Action__InputOutputAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Action__InputOutputAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5544:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5545:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5545:2: ( RULE_STRING )
            // InternalMyDsl.g:5546:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getInputOutputSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getInputOutputSTRINGTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Action__InputOutputAssignment_8"


    // $ANTLR start "rule__Action__EnergyUsageAssignment_11"
    // InternalMyDsl.g:5555:1: rule__Action__EnergyUsageAssignment_11 : ( RULE_FLOAT ) ;
    public final void rule__Action__EnergyUsageAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5559:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5560:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5560:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5561:3: RULE_FLOAT
            {
             before(grammarAccess.getActionAccess().getEnergyUsageFLOATTerminalRuleCall_11_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEnergyUsageFLOATTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Action__EnergyUsageAssignment_11"


    // $ANTLR start "rule__SafetyConstraint__NameAssignment_1"
    // InternalMyDsl.g:5570:1: rule__SafetyConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5574:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5575:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5575:2: ( RULE_ID )
            // InternalMyDsl.g:5576:3: RULE_ID
            {
             before(grammarAccess.getSafetyConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SafetyConstraint__NameAssignment_1"


    // $ANTLR start "rule__SafetyConstraint__MinBatteryAssignment_5"
    // InternalMyDsl.g:5585:1: rule__SafetyConstraint__MinBatteryAssignment_5 : ( RULE_FLOAT ) ;
    public final void rule__SafetyConstraint__MinBatteryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5589:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5590:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5590:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5591:3: RULE_FLOAT
            {
             before(grammarAccess.getSafetyConstraintAccess().getMinBatteryFLOATTerminalRuleCall_5_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getMinBatteryFLOATTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__SafetyConstraint__MinBatteryAssignment_5"


    // $ANTLR start "rule__SafetyConstraint__MaxWindSpeedAssignment_8"
    // InternalMyDsl.g:5600:1: rule__SafetyConstraint__MaxWindSpeedAssignment_8 : ( RULE_FLOAT ) ;
    public final void rule__SafetyConstraint__MaxWindSpeedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5604:1: ( ( RULE_FLOAT ) )
            // InternalMyDsl.g:5605:2: ( RULE_FLOAT )
            {
            // InternalMyDsl.g:5605:2: ( RULE_FLOAT )
            // InternalMyDsl.g:5606:3: RULE_FLOAT
            {
             before(grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedFLOATTerminalRuleCall_8_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedFLOATTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__SafetyConstraint__MaxWindSpeedAssignment_8"


    // $ANTLR start "rule__RegulatoryConstraint__NameAssignment_1"
    // InternalMyDsl.g:5615:1: rule__RegulatoryConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegulatoryConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5619:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5620:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5620:2: ( RULE_ID )
            // InternalMyDsl.g:5621:3: RULE_ID
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


    // $ANTLR start "rule__RegulatoryConstraint__FlightPermissionAssignment_5"
    // InternalMyDsl.g:5630:1: rule__RegulatoryConstraint__FlightPermissionAssignment_5 : ( RULE_BOOLEAN ) ;
    public final void rule__RegulatoryConstraint__FlightPermissionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5634:1: ( ( RULE_BOOLEAN ) )
            // InternalMyDsl.g:5635:2: ( RULE_BOOLEAN )
            {
            // InternalMyDsl.g:5635:2: ( RULE_BOOLEAN )
            // InternalMyDsl.g:5636:3: RULE_BOOLEAN
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionBOOLEANTerminalRuleCall_5_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionBOOLEANTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__RegulatoryConstraint__FlightPermissionAssignment_5"


    // $ANTLR start "rule__RegulatoryConstraint__AltitudeLimitAssignment_8"
    // InternalMyDsl.g:5645:1: rule__RegulatoryConstraint__AltitudeLimitAssignment_8 : ( RULE_INT ) ;
    public final void rule__RegulatoryConstraint__AltitudeLimitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5649:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5650:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5650:2: ( RULE_INT )
            // InternalMyDsl.g:5651:3: RULE_INT
            {
             before(grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__RegulatoryConstraint__AltitudeLimitAssignment_8"


    // $ANTLR start "rule__MissionEvent__NameAssignment_1"
    // InternalMyDsl.g:5660:1: rule__MissionEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MissionEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5664:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5665:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5665:2: ( RULE_ID )
            // InternalMyDsl.g:5666:3: RULE_ID
            {
             before(grammarAccess.getMissionEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MissionEvent__NameAssignment_1"


    // $ANTLR start "rule__MissionEvent__EventTypeAssignment_5"
    // InternalMyDsl.g:5675:1: rule__MissionEvent__EventTypeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__MissionEvent__EventTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5679:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5680:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5680:2: ( RULE_STRING )
            // InternalMyDsl.g:5681:3: RULE_STRING
            {
             before(grammarAccess.getMissionEventAccess().getEventTypeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getEventTypeSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__MissionEvent__EventTypeAssignment_5"


    // $ANTLR start "rule__MissionEvent__ImpactLevelAssignment_8"
    // InternalMyDsl.g:5690:1: rule__MissionEvent__ImpactLevelAssignment_8 : ( RULE_INT ) ;
    public final void rule__MissionEvent__ImpactLevelAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5694:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5695:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5695:2: ( RULE_INT )
            // InternalMyDsl.g:5696:3: RULE_INT
            {
             before(grammarAccess.getMissionEventAccess().getImpactLevelINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getImpactLevelINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__MissionEvent__ImpactLevelAssignment_8"


    // $ANTLR start "rule__MissionEvent__ResponseActionAssignment_11"
    // InternalMyDsl.g:5705:1: rule__MissionEvent__ResponseActionAssignment_11 : ( RULE_STRING ) ;
    public final void rule__MissionEvent__ResponseActionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5709:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5710:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5710:2: ( RULE_STRING )
            // InternalMyDsl.g:5711:3: RULE_STRING
            {
             before(grammarAccess.getMissionEventAccess().getResponseActionSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionEventAccess().getResponseActionSTRINGTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__MissionEvent__ResponseActionAssignment_11"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0124888810002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});

}