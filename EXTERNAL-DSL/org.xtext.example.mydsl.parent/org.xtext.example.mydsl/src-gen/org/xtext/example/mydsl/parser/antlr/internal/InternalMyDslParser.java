package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission'", "'{'", "'missionID'", "'='", "'missionType'", "'startLocation'", "'endLocation'", "'priority'", "'estimatedTime'", "'addDrone'", "','", "'addPhase'", "'addConstraint'", "'addEvent'", "'}'", "'Drone'", "'modelType'", "'batterCapacity'", "'maxFlightTime'", "'payloadCapacity'", "'role'", "'addEnergyModel'", "'EnergyModel'", "'consumptionRate'", "'batteryHealth'", "'rechargeTime'", "'Phase'", "'phaseType'", "'energyUsage'", "'addSubPhase'", "'SubPhase'", "'subPhaseType'", "'duration'", "'addAction'", "'Action'", "'actionType'", "'inputOutput'", "'SafetyConstraint'", "'minBattery'", "'maxWindSpeed'", "'RegulatoryConstraint'", "'flightPermission'", "'altitudeLimit'", "'MissionEvent'", "'eventType'", "'impactLevel'", "'responseAction'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_missions_0_0= ruleMission ) ) | ( (lv_drones_1_0= ruleDrone ) ) | ( (lv_energyModels_2_0= ruleEnergyModel ) ) | ( (lv_phases_3_0= rulePhase ) ) | ( (lv_subPhases_4_0= ruleSubPhase ) ) | ( (lv_actions_5_0= ruleAction ) ) | ( (lv_constraints_6_0= ruleConstraint ) ) | ( (lv_missionEVents_7_0= ruleMissionEvent ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_missions_0_0 = null;

        EObject lv_drones_1_0 = null;

        EObject lv_energyModels_2_0 = null;

        EObject lv_phases_3_0 = null;

        EObject lv_subPhases_4_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_constraints_6_0 = null;

        EObject lv_missionEVents_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_missions_0_0= ruleMission ) ) | ( (lv_drones_1_0= ruleDrone ) ) | ( (lv_energyModels_2_0= ruleEnergyModel ) ) | ( (lv_phases_3_0= rulePhase ) ) | ( (lv_subPhases_4_0= ruleSubPhase ) ) | ( (lv_actions_5_0= ruleAction ) ) | ( (lv_constraints_6_0= ruleConstraint ) ) | ( (lv_missionEVents_7_0= ruleMissionEvent ) ) )* )
            // InternalMyDsl.g:78:2: ( ( (lv_missions_0_0= ruleMission ) ) | ( (lv_drones_1_0= ruleDrone ) ) | ( (lv_energyModels_2_0= ruleEnergyModel ) ) | ( (lv_phases_3_0= rulePhase ) ) | ( (lv_subPhases_4_0= ruleSubPhase ) ) | ( (lv_actions_5_0= ruleAction ) ) | ( (lv_constraints_6_0= ruleConstraint ) ) | ( (lv_missionEVents_7_0= ruleMissionEvent ) ) )*
            {
            // InternalMyDsl.g:78:2: ( ( (lv_missions_0_0= ruleMission ) ) | ( (lv_drones_1_0= ruleDrone ) ) | ( (lv_energyModels_2_0= ruleEnergyModel ) ) | ( (lv_phases_3_0= rulePhase ) ) | ( (lv_subPhases_4_0= ruleSubPhase ) ) | ( (lv_actions_5_0= ruleAction ) ) | ( (lv_constraints_6_0= ruleConstraint ) ) | ( (lv_missionEVents_7_0= ruleMissionEvent ) ) )*
            loop1:
            do {
                int alt1=9;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt1=1;
                    }
                    break;
                case 28:
                    {
                    alt1=2;
                    }
                    break;
                case 35:
                    {
                    alt1=3;
                    }
                    break;
                case 39:
                    {
                    alt1=4;
                    }
                    break;
                case 43:
                    {
                    alt1=5;
                    }
                    break;
                case 47:
                    {
                    alt1=6;
                    }
                    break;
                case 50:
                case 53:
                    {
                    alt1=7;
                    }
                    break;
                case 56:
                    {
                    alt1=8;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: ( (lv_missions_0_0= ruleMission ) )
            	    {
            	    // InternalMyDsl.g:79:3: ( (lv_missions_0_0= ruleMission ) )
            	    // InternalMyDsl.g:80:4: (lv_missions_0_0= ruleMission )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_missions_0_0= ruleMission )
            	    // InternalMyDsl.g:81:5: lv_missions_0_0= ruleMission
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMissionsMissionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_missions_0_0=ruleMission();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"missions",
            	    						lv_missions_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Mission");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:99:3: ( (lv_drones_1_0= ruleDrone ) )
            	    {
            	    // InternalMyDsl.g:99:3: ( (lv_drones_1_0= ruleDrone ) )
            	    // InternalMyDsl.g:100:4: (lv_drones_1_0= ruleDrone )
            	    {
            	    // InternalMyDsl.g:100:4: (lv_drones_1_0= ruleDrone )
            	    // InternalMyDsl.g:101:5: lv_drones_1_0= ruleDrone
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDronesDroneParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_drones_1_0=ruleDrone();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"drones",
            	    						lv_drones_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Drone");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:119:3: ( (lv_energyModels_2_0= ruleEnergyModel ) )
            	    {
            	    // InternalMyDsl.g:119:3: ( (lv_energyModels_2_0= ruleEnergyModel ) )
            	    // InternalMyDsl.g:120:4: (lv_energyModels_2_0= ruleEnergyModel )
            	    {
            	    // InternalMyDsl.g:120:4: (lv_energyModels_2_0= ruleEnergyModel )
            	    // InternalMyDsl.g:121:5: lv_energyModels_2_0= ruleEnergyModel
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEnergyModelsEnergyModelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_energyModels_2_0=ruleEnergyModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"energyModels",
            	    						lv_energyModels_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.EnergyModel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:139:3: ( (lv_phases_3_0= rulePhase ) )
            	    {
            	    // InternalMyDsl.g:139:3: ( (lv_phases_3_0= rulePhase ) )
            	    // InternalMyDsl.g:140:4: (lv_phases_3_0= rulePhase )
            	    {
            	    // InternalMyDsl.g:140:4: (lv_phases_3_0= rulePhase )
            	    // InternalMyDsl.g:141:5: lv_phases_3_0= rulePhase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPhasesPhaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_phases_3_0=rulePhase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"phases",
            	    						lv_phases_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Phase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:159:3: ( (lv_subPhases_4_0= ruleSubPhase ) )
            	    {
            	    // InternalMyDsl.g:159:3: ( (lv_subPhases_4_0= ruleSubPhase ) )
            	    // InternalMyDsl.g:160:4: (lv_subPhases_4_0= ruleSubPhase )
            	    {
            	    // InternalMyDsl.g:160:4: (lv_subPhases_4_0= ruleSubPhase )
            	    // InternalMyDsl.g:161:5: lv_subPhases_4_0= ruleSubPhase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSubPhasesSubPhaseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_subPhases_4_0=ruleSubPhase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subPhases",
            	    						lv_subPhases_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.SubPhase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:179:3: ( (lv_actions_5_0= ruleAction ) )
            	    {
            	    // InternalMyDsl.g:179:3: ( (lv_actions_5_0= ruleAction ) )
            	    // InternalMyDsl.g:180:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:180:4: (lv_actions_5_0= ruleAction )
            	    // InternalMyDsl.g:181:5: lv_actions_5_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getActionsActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:199:3: ( (lv_constraints_6_0= ruleConstraint ) )
            	    {
            	    // InternalMyDsl.g:199:3: ( (lv_constraints_6_0= ruleConstraint ) )
            	    // InternalMyDsl.g:200:4: (lv_constraints_6_0= ruleConstraint )
            	    {
            	    // InternalMyDsl.g:200:4: (lv_constraints_6_0= ruleConstraint )
            	    // InternalMyDsl.g:201:5: lv_constraints_6_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_constraints_6_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:219:3: ( (lv_missionEVents_7_0= ruleMissionEvent ) )
            	    {
            	    // InternalMyDsl.g:219:3: ( (lv_missionEVents_7_0= ruleMissionEvent ) )
            	    // InternalMyDsl.g:220:4: (lv_missionEVents_7_0= ruleMissionEvent )
            	    {
            	    // InternalMyDsl.g:220:4: (lv_missionEVents_7_0= ruleMissionEvent )
            	    // InternalMyDsl.g:221:5: lv_missionEVents_7_0= ruleMissionEvent
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMissionEVentsMissionEventParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_missionEVents_7_0=ruleMissionEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"missionEVents",
            	    						lv_missionEVents_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.MissionEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:242:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:242:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:243:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalMyDsl.g:249:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_missionType_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_startLocation_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_endLocation_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_priority_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_estimatedTime_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;


        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' ) )
            // InternalMyDsl.g:256:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' )
            {
            // InternalMyDsl.g:256:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' )
            // InternalMyDsl.g:257:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalMyDsl.g:261:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:262:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:262:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:263:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getMissionIDKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:291:3: ( (lv_id_5_0= RULE_STRING ) )
            // InternalMyDsl.g:292:4: (lv_id_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:292:4: (lv_id_5_0= RULE_STRING )
            // InternalMyDsl.g:293:5: lv_id_5_0= RULE_STRING
            {
            lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_id_5_0, grammarAccess.getMissionAccess().getIdSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getMissionTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:317:3: ( (lv_missionType_8_0= RULE_STRING ) )
            // InternalMyDsl.g:318:4: (lv_missionType_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:318:4: (lv_missionType_8_0= RULE_STRING )
            // InternalMyDsl.g:319:5: lv_missionType_8_0= RULE_STRING
            {
            lv_missionType_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_missionType_8_0, grammarAccess.getMissionAccess().getMissionTypeSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"missionType",
            						lv_missionType_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getStartLocationKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:343:3: ( (lv_startLocation_11_0= RULE_STRING ) )
            // InternalMyDsl.g:344:4: (lv_startLocation_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:344:4: (lv_startLocation_11_0= RULE_STRING )
            // InternalMyDsl.g:345:5: lv_startLocation_11_0= RULE_STRING
            {
            lv_startLocation_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_startLocation_11_0, grammarAccess.getMissionAccess().getStartLocationSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startLocation",
            						lv_startLocation_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getEndLocationKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:369:3: ( (lv_endLocation_14_0= RULE_STRING ) )
            // InternalMyDsl.g:370:4: (lv_endLocation_14_0= RULE_STRING )
            {
            // InternalMyDsl.g:370:4: (lv_endLocation_14_0= RULE_STRING )
            // InternalMyDsl.g:371:5: lv_endLocation_14_0= RULE_STRING
            {
            lv_endLocation_14_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_endLocation_14_0, grammarAccess.getMissionAccess().getEndLocationSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endLocation",
            						lv_endLocation_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getPriorityKeyword_15());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:395:3: ( (lv_priority_17_0= RULE_INT ) )
            // InternalMyDsl.g:396:4: (lv_priority_17_0= RULE_INT )
            {
            // InternalMyDsl.g:396:4: (lv_priority_17_0= RULE_INT )
            // InternalMyDsl.g:397:5: lv_priority_17_0= RULE_INT
            {
            lv_priority_17_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_priority_17_0, grammarAccess.getMissionAccess().getPriorityINTTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_17_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_18=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getEstimatedTimeKeyword_18());
            		
            otherlv_19=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getEqualsSignKeyword_19());
            		
            // InternalMyDsl.g:421:3: ( (lv_estimatedTime_20_0= RULE_FLOAT ) )
            // InternalMyDsl.g:422:4: (lv_estimatedTime_20_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:422:4: (lv_estimatedTime_20_0= RULE_FLOAT )
            // InternalMyDsl.g:423:5: lv_estimatedTime_20_0= RULE_FLOAT
            {
            lv_estimatedTime_20_0=(Token)match(input,RULE_FLOAT,FOLLOW_16); 

            					newLeafNode(lv_estimatedTime_20_0, grammarAccess.getMissionAccess().getEstimatedTimeFLOATTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"estimatedTime",
            						lv_estimatedTime_20_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_21=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getMissionAccess().getAddDroneKeyword_21());
            		
            otherlv_22=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getEqualsSignKeyword_22());
            		
            // InternalMyDsl.g:447:3: ( (otherlv_23= RULE_ID ) )
            // InternalMyDsl.g:448:4: (otherlv_23= RULE_ID )
            {
            // InternalMyDsl.g:448:4: (otherlv_23= RULE_ID )
            // InternalMyDsl.g:449:5: otherlv_23= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_23, grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_23_0());
            				

            }


            }

            // InternalMyDsl.g:460:3: (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:461:4: otherlv_24= ',' ( (otherlv_25= RULE_ID ) )
            	    {
            	    otherlv_24=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getCommaKeyword_24_0());
            	    			
            	    // InternalMyDsl.g:465:4: ( (otherlv_25= RULE_ID ) )
            	    // InternalMyDsl.g:466:5: (otherlv_25= RULE_ID )
            	    {
            	    // InternalMyDsl.g:466:5: (otherlv_25= RULE_ID )
            	    // InternalMyDsl.g:467:6: otherlv_25= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    						newLeafNode(otherlv_25, grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_24_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_26=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_26, grammarAccess.getMissionAccess().getAddPhaseKeyword_25());
            		
            otherlv_27=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_27, grammarAccess.getMissionAccess().getEqualsSignKeyword_26());
            		
            // InternalMyDsl.g:487:3: ( (otherlv_28= RULE_ID ) )
            // InternalMyDsl.g:488:4: (otherlv_28= RULE_ID )
            {
            // InternalMyDsl.g:488:4: (otherlv_28= RULE_ID )
            // InternalMyDsl.g:489:5: otherlv_28= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_28, grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_27_0());
            				

            }


            }

            // InternalMyDsl.g:500:3: (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:501:4: otherlv_29= ',' ( (otherlv_30= RULE_ID ) )
            	    {
            	    otherlv_29=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_29, grammarAccess.getMissionAccess().getCommaKeyword_28_0());
            	    			
            	    // InternalMyDsl.g:505:4: ( (otherlv_30= RULE_ID ) )
            	    // InternalMyDsl.g:506:5: (otherlv_30= RULE_ID )
            	    {
            	    // InternalMyDsl.g:506:5: (otherlv_30= RULE_ID )
            	    // InternalMyDsl.g:507:6: otherlv_30= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(otherlv_30, grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_28_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_31=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_31, grammarAccess.getMissionAccess().getAddConstraintKeyword_29());
            		
            otherlv_32=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_32, grammarAccess.getMissionAccess().getEqualsSignKeyword_30());
            		
            // InternalMyDsl.g:527:3: ( (otherlv_33= RULE_ID ) )
            // InternalMyDsl.g:528:4: (otherlv_33= RULE_ID )
            {
            // InternalMyDsl.g:528:4: (otherlv_33= RULE_ID )
            // InternalMyDsl.g:529:5: otherlv_33= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_33=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_33, grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_31_0());
            				

            }


            }

            // InternalMyDsl.g:540:3: (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:541:4: otherlv_34= ',' ( (otherlv_35= RULE_ID ) )
            	    {
            	    otherlv_34=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_34, grammarAccess.getMissionAccess().getCommaKeyword_32_0());
            	    			
            	    // InternalMyDsl.g:545:4: ( (otherlv_35= RULE_ID ) )
            	    // InternalMyDsl.g:546:5: (otherlv_35= RULE_ID )
            	    {
            	    // InternalMyDsl.g:546:5: (otherlv_35= RULE_ID )
            	    // InternalMyDsl.g:547:6: otherlv_35= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_35=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_35, grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_32_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_36=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_36, grammarAccess.getMissionAccess().getAddEventKeyword_33());
            		
            otherlv_37=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_37, grammarAccess.getMissionAccess().getEqualsSignKeyword_34());
            		
            // InternalMyDsl.g:567:3: ( (otherlv_38= RULE_ID ) )
            // InternalMyDsl.g:568:4: (otherlv_38= RULE_ID )
            {
            // InternalMyDsl.g:568:4: (otherlv_38= RULE_ID )
            // InternalMyDsl.g:569:5: otherlv_38= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_38=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_38, grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_35_0());
            				

            }


            }

            // InternalMyDsl.g:580:3: (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:581:4: otherlv_39= ',' ( (otherlv_40= RULE_ID ) )
            	    {
            	    otherlv_39=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_39, grammarAccess.getMissionAccess().getCommaKeyword_36_0());
            	    			
            	    // InternalMyDsl.g:585:4: ( (otherlv_40= RULE_ID ) )
            	    // InternalMyDsl.g:586:5: (otherlv_40= RULE_ID )
            	    {
            	    // InternalMyDsl.g:586:5: (otherlv_40= RULE_ID )
            	    // InternalMyDsl.g:587:6: otherlv_40= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_40=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(otherlv_40, grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_36_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_41=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_37());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleDrone"
    // InternalMyDsl.g:607:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalMyDsl.g:607:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalMyDsl.g:608:2: iv_ruleDrone= ruleDrone EOF
            {
             newCompositeNode(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrone=ruleDrone();

            state._fsp--;

             current =iv_ruleDrone; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalMyDsl.g:614:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_batterCapacity_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_maxFlightTime_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_payloadCapacity_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_role_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;


        	enterRule();

        try {
            // InternalMyDsl.g:620:2: ( (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' ) )
            // InternalMyDsl.g:621:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' )
            {
            // InternalMyDsl.g:621:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' )
            // InternalMyDsl.g:622:3: otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            // InternalMyDsl.g:626:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:627:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:627:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:628:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDroneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getModelTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:656:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalMyDsl.g:657:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:657:4: (lv_type_5_0= RULE_STRING )
            // InternalMyDsl.g:658:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_type_5_0, grammarAccess.getDroneAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getBatterCapacityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:682:3: ( (lv_batterCapacity_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:683:4: (lv_batterCapacity_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:683:4: (lv_batterCapacity_8_0= RULE_FLOAT )
            // InternalMyDsl.g:684:5: lv_batterCapacity_8_0= RULE_FLOAT
            {
            lv_batterCapacity_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_23); 

            					newLeafNode(lv_batterCapacity_8_0, grammarAccess.getDroneAccess().getBatterCapacityFLOATTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"batterCapacity",
            						lv_batterCapacity_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneAccess().getMaxFlightTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getDroneAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:708:3: ( (lv_maxFlightTime_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:709:4: (lv_maxFlightTime_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:709:4: (lv_maxFlightTime_11_0= RULE_FLOAT )
            // InternalMyDsl.g:710:5: lv_maxFlightTime_11_0= RULE_FLOAT
            {
            lv_maxFlightTime_11_0=(Token)match(input,RULE_FLOAT,FOLLOW_24); 

            					newLeafNode(lv_maxFlightTime_11_0, grammarAccess.getDroneAccess().getMaxFlightTimeFLOATTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxFlightTime",
            						lv_maxFlightTime_11_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_12=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getDroneAccess().getPayloadCapacityKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_13, grammarAccess.getDroneAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:734:3: ( (lv_payloadCapacity_14_0= RULE_FLOAT ) )
            // InternalMyDsl.g:735:4: (lv_payloadCapacity_14_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:735:4: (lv_payloadCapacity_14_0= RULE_FLOAT )
            // InternalMyDsl.g:736:5: lv_payloadCapacity_14_0= RULE_FLOAT
            {
            lv_payloadCapacity_14_0=(Token)match(input,RULE_FLOAT,FOLLOW_25); 

            					newLeafNode(lv_payloadCapacity_14_0, grammarAccess.getDroneAccess().getPayloadCapacityFLOATTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"payloadCapacity",
            						lv_payloadCapacity_14_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_15=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getDroneAccess().getRoleKeyword_15());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_16, grammarAccess.getDroneAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:760:3: ( (lv_role_17_0= RULE_STRING ) )
            // InternalMyDsl.g:761:4: (lv_role_17_0= RULE_STRING )
            {
            // InternalMyDsl.g:761:4: (lv_role_17_0= RULE_STRING )
            // InternalMyDsl.g:762:5: lv_role_17_0= RULE_STRING
            {
            lv_role_17_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_role_17_0, grammarAccess.getDroneAccess().getRoleSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"role",
            						lv_role_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getDroneAccess().getAddEnergyModelKeyword_18());
            		
            otherlv_19=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getDroneAccess().getEqualsSignKeyword_19());
            		
            // InternalMyDsl.g:786:3: ( (otherlv_20= RULE_ID ) )
            // InternalMyDsl.g:787:4: (otherlv_20= RULE_ID )
            {
            // InternalMyDsl.g:787:4: (otherlv_20= RULE_ID )
            // InternalMyDsl.g:788:5: otherlv_20= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            				
            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_20, grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_20_0());
            				

            }


            }

            // InternalMyDsl.g:799:3: (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:800:4: otherlv_21= ',' ( (otherlv_22= RULE_ID ) )
            	    {
            	    otherlv_21=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_21, grammarAccess.getDroneAccess().getCommaKeyword_21_0());
            	    			
            	    // InternalMyDsl.g:804:4: ( (otherlv_22= RULE_ID ) )
            	    // InternalMyDsl.g:805:5: (otherlv_22= RULE_ID )
            	    {
            	    // InternalMyDsl.g:805:5: (otherlv_22= RULE_ID )
            	    // InternalMyDsl.g:806:6: otherlv_22= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDroneRule());
            	    						}
            	    					
            	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(otherlv_22, grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_21_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_23=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRuleEnergyModel"
    // InternalMyDsl.g:826:1: entryRuleEnergyModel returns [EObject current=null] : iv_ruleEnergyModel= ruleEnergyModel EOF ;
    public final EObject entryRuleEnergyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnergyModel = null;


        try {
            // InternalMyDsl.g:826:52: (iv_ruleEnergyModel= ruleEnergyModel EOF )
            // InternalMyDsl.g:827:2: iv_ruleEnergyModel= ruleEnergyModel EOF
            {
             newCompositeNode(grammarAccess.getEnergyModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnergyModel=ruleEnergyModel();

            state._fsp--;

             current =iv_ruleEnergyModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnergyModel"


    // $ANTLR start "ruleEnergyModel"
    // InternalMyDsl.g:833:1: ruleEnergyModel returns [EObject current=null] : (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_capacity_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) ;
    public final EObject ruleEnergyModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_consumptionRate_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_batteryHealth_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_capacity_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:839:2: ( (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_capacity_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:840:2: (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_capacity_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:840:2: (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_capacity_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            // InternalMyDsl.g:841:3: otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_capacity_11_0= RULE_FLOAT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnergyModelAccess().getEnergyModelKeyword_0());
            		
            // InternalMyDsl.g:845:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:846:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:846:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:847:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnergyModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnergyModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEnergyModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEnergyModelAccess().getConsumptionRateKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:875:3: ( (lv_consumptionRate_5_0= RULE_FLOAT ) )
            // InternalMyDsl.g:876:4: (lv_consumptionRate_5_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:876:4: (lv_consumptionRate_5_0= RULE_FLOAT )
            // InternalMyDsl.g:877:5: lv_consumptionRate_5_0= RULE_FLOAT
            {
            lv_consumptionRate_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_28); 

            					newLeafNode(lv_consumptionRate_5_0, grammarAccess.getEnergyModelAccess().getConsumptionRateFLOATTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnergyModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"consumptionRate",
            						lv_consumptionRate_5_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEnergyModelAccess().getBatteryHealthKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:901:3: ( (lv_batteryHealth_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:902:4: (lv_batteryHealth_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:902:4: (lv_batteryHealth_8_0= RULE_FLOAT )
            // InternalMyDsl.g:903:5: lv_batteryHealth_8_0= RULE_FLOAT
            {
            lv_batteryHealth_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_29); 

            					newLeafNode(lv_batteryHealth_8_0, grammarAccess.getEnergyModelAccess().getBatteryHealthFLOATTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnergyModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"batteryHealth",
            						lv_batteryHealth_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getEnergyModelAccess().getRechargeTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:927:3: ( (lv_capacity_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:928:4: (lv_capacity_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:928:4: (lv_capacity_11_0= RULE_FLOAT )
            // InternalMyDsl.g:929:5: lv_capacity_11_0= RULE_FLOAT
            {
            lv_capacity_11_0=(Token)match(input,RULE_FLOAT,FOLLOW_30); 

            					newLeafNode(lv_capacity_11_0, grammarAccess.getEnergyModelAccess().getCapacityFLOATTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnergyModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capacity",
            						lv_capacity_11_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEnergyModelAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnergyModel"


    // $ANTLR start "entryRulePhase"
    // InternalMyDsl.g:953:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalMyDsl.g:953:46: (iv_rulePhase= rulePhase EOF )
            // InternalMyDsl.g:954:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalMyDsl.g:960:1: rulePhase returns [EObject current=null] : (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_phaseType_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_energyUsage_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:966:2: ( (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) )
            // InternalMyDsl.g:967:2: (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            {
            // InternalMyDsl.g:967:2: (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            // InternalMyDsl.g:968:3: otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPhaseAccess().getPhaseKeyword_0());
            		
            // InternalMyDsl.g:972:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:973:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:973:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:974:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getPhaseTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPhaseAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1002:3: ( (lv_phaseType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1003:4: (lv_phaseType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1003:4: (lv_phaseType_5_0= RULE_STRING )
            // InternalMyDsl.g:1004:5: lv_phaseType_5_0= RULE_STRING
            {
            lv_phaseType_5_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_phaseType_5_0, grammarAccess.getPhaseAccess().getPhaseTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phaseType",
            						lv_phaseType_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPhaseAccess().getEnergyUsageKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getPhaseAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1028:3: ( (lv_energyUsage_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1029:4: (lv_energyUsage_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1029:4: (lv_energyUsage_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1030:5: lv_energyUsage_8_0= RULE_FLOAT
            {
            lv_energyUsage_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_33); 

            					newLeafNode(lv_energyUsage_8_0, grammarAccess.getPhaseAccess().getEnergyUsageFLOATTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"energyUsage",
            						lv_energyUsage_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_9=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getPhaseAccess().getAddSubPhaseKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPhaseAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1054:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1055:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1055:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1056:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_11, grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:1067:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1068:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_12, grammarAccess.getPhaseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:1072:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:1073:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1073:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:1074:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPhaseRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(otherlv_13, grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_12_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleSubPhase"
    // InternalMyDsl.g:1094:1: entryRuleSubPhase returns [EObject current=null] : iv_ruleSubPhase= ruleSubPhase EOF ;
    public final EObject entryRuleSubPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPhase = null;


        try {
            // InternalMyDsl.g:1094:49: (iv_ruleSubPhase= ruleSubPhase EOF )
            // InternalMyDsl.g:1095:2: iv_ruleSubPhase= ruleSubPhase EOF
            {
             newCompositeNode(grammarAccess.getSubPhaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubPhase=ruleSubPhase();

            state._fsp--;

             current =iv_ruleSubPhase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubPhase"


    // $ANTLR start "ruleSubPhase"
    // InternalMyDsl.g:1101:1: ruleSubPhase returns [EObject current=null] : (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleSubPhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_subPhaseType_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_duration_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1107:2: ( (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) )
            // InternalMyDsl.g:1108:2: (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            {
            // InternalMyDsl.g:1108:2: (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            // InternalMyDsl.g:1109:3: otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubPhaseAccess().getSubPhaseKeyword_0());
            		
            // InternalMyDsl.g:1113:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1114:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1114:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1115:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubPhaseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getSubPhaseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubPhaseAccess().getSubPhaseTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1143:3: ( (lv_subPhaseType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1144:4: (lv_subPhaseType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1144:4: (lv_subPhaseType_5_0= RULE_STRING )
            // InternalMyDsl.g:1145:5: lv_subPhaseType_5_0= RULE_STRING
            {
            lv_subPhaseType_5_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_subPhaseType_5_0, grammarAccess.getSubPhaseAccess().getSubPhaseTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subPhaseType",
            						lv_subPhaseType_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSubPhaseAccess().getDurationKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1169:3: ( (lv_duration_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1170:4: (lv_duration_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1170:4: (lv_duration_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1171:5: lv_duration_8_0= RULE_FLOAT
            {
            lv_duration_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_36); 

            					newLeafNode(lv_duration_8_0, grammarAccess.getSubPhaseAccess().getDurationFLOATTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_9=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getSubPhaseAccess().getAddActionKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1195:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1196:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1196:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1197:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubPhaseRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_11, grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:1208:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1209:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_4); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSubPhaseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:1213:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:1214:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1214:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:1215:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSubPhaseRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(otherlv_13, grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_12_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSubPhaseAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubPhase"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:1235:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:1235:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:1236:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:1242:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_actionType_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_inputOutput_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_energyUsage_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1248:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1249:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1249:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1250:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:1254:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1255:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1255:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1256:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getActionTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1284:3: ( (lv_actionType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1285:4: (lv_actionType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1285:4: (lv_actionType_5_0= RULE_STRING )
            // InternalMyDsl.g:1286:5: lv_actionType_5_0= RULE_STRING
            {
            lv_actionType_5_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_actionType_5_0, grammarAccess.getActionAccess().getActionTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actionType",
            						lv_actionType_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getInputOutputKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1310:3: ( (lv_inputOutput_8_0= RULE_STRING ) )
            // InternalMyDsl.g:1311:4: (lv_inputOutput_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:1311:4: (lv_inputOutput_8_0= RULE_STRING )
            // InternalMyDsl.g:1312:5: lv_inputOutput_8_0= RULE_STRING
            {
            lv_inputOutput_8_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_inputOutput_8_0, grammarAccess.getActionAccess().getInputOutputSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputOutput",
            						lv_inputOutput_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getEnergyUsageKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getActionAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1336:3: ( (lv_energyUsage_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1337:4: (lv_energyUsage_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1337:4: (lv_energyUsage_11_0= RULE_FLOAT )
            // InternalMyDsl.g:1338:5: lv_energyUsage_11_0= RULE_FLOAT
            {
            lv_energyUsage_11_0=(Token)match(input,RULE_FLOAT,FOLLOW_30); 

            					newLeafNode(lv_energyUsage_11_0, grammarAccess.getActionAccess().getEnergyUsageFLOATTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"energyUsage",
            						lv_energyUsage_11_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleConstraint"
    // InternalMyDsl.g:1362:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:1362:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:1363:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMyDsl.g:1369:1: ruleConstraint returns [EObject current=null] : (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SafetyConstraint_0 = null;

        EObject this_RegulatoryConstraint_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1375:2: ( (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint ) )
            // InternalMyDsl.g:1376:2: (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint )
            {
            // InternalMyDsl.g:1376:2: (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==50) ) {
                alt9=1;
            }
            else if ( (LA9_0==53) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1377:3: this_SafetyConstraint_0= ruleSafetyConstraint
                    {

                    			newCompositeNode(grammarAccess.getConstraintAccess().getSafetyConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SafetyConstraint_0=ruleSafetyConstraint();

                    state._fsp--;


                    			current = this_SafetyConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1386:3: this_RegulatoryConstraint_1= ruleRegulatoryConstraint
                    {

                    			newCompositeNode(grammarAccess.getConstraintAccess().getRegulatoryConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegulatoryConstraint_1=ruleRegulatoryConstraint();

                    state._fsp--;


                    			current = this_RegulatoryConstraint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleSafetyConstraint"
    // InternalMyDsl.g:1398:1: entryRuleSafetyConstraint returns [EObject current=null] : iv_ruleSafetyConstraint= ruleSafetyConstraint EOF ;
    public final EObject entryRuleSafetyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyConstraint = null;


        try {
            // InternalMyDsl.g:1398:57: (iv_ruleSafetyConstraint= ruleSafetyConstraint EOF )
            // InternalMyDsl.g:1399:2: iv_ruleSafetyConstraint= ruleSafetyConstraint EOF
            {
             newCompositeNode(grammarAccess.getSafetyConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyConstraint=ruleSafetyConstraint();

            state._fsp--;

             current =iv_ruleSafetyConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyConstraint"


    // $ANTLR start "ruleSafetyConstraint"
    // InternalMyDsl.g:1405:1: ruleSafetyConstraint returns [EObject current=null] : (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' ) ;
    public final EObject ruleSafetyConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_minBattery_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_maxWindSpeed_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1411:2: ( (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:1412:2: (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:1412:2: (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' )
            // InternalMyDsl.g:1413:3: otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyConstraintAccess().getSafetyConstraintKeyword_0());
            		
            // InternalMyDsl.g:1417:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1418:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1418:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1419:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSafetyConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSafetyConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSafetyConstraintAccess().getMinBatteryKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1447:3: ( (lv_minBattery_5_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1448:4: (lv_minBattery_5_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1448:4: (lv_minBattery_5_0= RULE_FLOAT )
            // InternalMyDsl.g:1449:5: lv_minBattery_5_0= RULE_FLOAT
            {
            lv_minBattery_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_40); 

            					newLeafNode(lv_minBattery_5_0, grammarAccess.getSafetyConstraintAccess().getMinBatteryFLOATTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSafetyConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minBattery",
            						lv_minBattery_5_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1473:3: ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1474:4: (lv_maxWindSpeed_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1474:4: (lv_maxWindSpeed_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1475:5: lv_maxWindSpeed_8_0= RULE_FLOAT
            {
            lv_maxWindSpeed_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_30); 

            					newLeafNode(lv_maxWindSpeed_8_0, grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedFLOATTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSafetyConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxWindSpeed",
            						lv_maxWindSpeed_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSafetyConstraintAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSafetyConstraint"


    // $ANTLR start "entryRuleRegulatoryConstraint"
    // InternalMyDsl.g:1499:1: entryRuleRegulatoryConstraint returns [EObject current=null] : iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF ;
    public final EObject entryRuleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegulatoryConstraint = null;


        try {
            // InternalMyDsl.g:1499:61: (iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:1500:2: iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF
            {
             newCompositeNode(grammarAccess.getRegulatoryConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegulatoryConstraint=ruleRegulatoryConstraint();

            state._fsp--;

             current =iv_ruleRegulatoryConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRegulatoryConstraint"


    // $ANTLR start "ruleRegulatoryConstraint"
    // InternalMyDsl.g:1506:1: ruleRegulatoryConstraint returns [EObject current=null] : (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
    public final EObject ruleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_flightPermission_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_altitudeLimit_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1512:2: ( (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:1513:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:1513:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalMyDsl.g:1514:3: otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0());
            		
            // InternalMyDsl.g:1518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1519:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRegulatoryConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,54,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1548:3: ( (lv_flightPermission_5_0= RULE_BOOLEAN ) )
            // InternalMyDsl.g:1549:4: (lv_flightPermission_5_0= RULE_BOOLEAN )
            {
            // InternalMyDsl.g:1549:4: (lv_flightPermission_5_0= RULE_BOOLEAN )
            // InternalMyDsl.g:1550:5: lv_flightPermission_5_0= RULE_BOOLEAN
            {
            lv_flightPermission_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_43); 

            					newLeafNode(lv_flightPermission_5_0, grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionBOOLEANTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"flightPermission",
            						lv_flightPermission_5_0,
            						"org.xtext.example.mydsl.MyDsl.BOOLEAN");
            				

            }


            }

            otherlv_6=(Token)match(input,55,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1574:3: ( (lv_altitudeLimit_8_0= RULE_INT ) )
            // InternalMyDsl.g:1575:4: (lv_altitudeLimit_8_0= RULE_INT )
            {
            // InternalMyDsl.g:1575:4: (lv_altitudeLimit_8_0= RULE_INT )
            // InternalMyDsl.g:1576:5: lv_altitudeLimit_8_0= RULE_INT
            {
            lv_altitudeLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_altitudeLimit_8_0, grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"altitudeLimit",
            						lv_altitudeLimit_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRegulatoryConstraintAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegulatoryConstraint"


    // $ANTLR start "entryRuleMissionEvent"
    // InternalMyDsl.g:1600:1: entryRuleMissionEvent returns [EObject current=null] : iv_ruleMissionEvent= ruleMissionEvent EOF ;
    public final EObject entryRuleMissionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionEvent = null;


        try {
            // InternalMyDsl.g:1600:53: (iv_ruleMissionEvent= ruleMissionEvent EOF )
            // InternalMyDsl.g:1601:2: iv_ruleMissionEvent= ruleMissionEvent EOF
            {
             newCompositeNode(grammarAccess.getMissionEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionEvent=ruleMissionEvent();

            state._fsp--;

             current =iv_ruleMissionEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMissionEvent"


    // $ANTLR start "ruleMissionEvent"
    // InternalMyDsl.g:1607:1: ruleMissionEvent returns [EObject current=null] : (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
    public final EObject ruleMissionEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_eventType_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_impactLevel_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_responseAction_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1613:2: ( (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1614:2: (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1614:2: (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1615:3: otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionEventAccess().getMissionEventKeyword_0());
            		
            // InternalMyDsl.g:1619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1620:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1621:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMissionEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionEventAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,57,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionEventAccess().getEventTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1649:3: ( (lv_eventType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1650:4: (lv_eventType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1650:4: (lv_eventType_5_0= RULE_STRING )
            // InternalMyDsl.g:1651:5: lv_eventType_5_0= RULE_STRING
            {
            lv_eventType_5_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(lv_eventType_5_0, grammarAccess.getMissionEventAccess().getEventTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eventType",
            						lv_eventType_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,58,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionEventAccess().getImpactLevelKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1675:3: ( (lv_impactLevel_8_0= RULE_INT ) )
            // InternalMyDsl.g:1676:4: (lv_impactLevel_8_0= RULE_INT )
            {
            // InternalMyDsl.g:1676:4: (lv_impactLevel_8_0= RULE_INT )
            // InternalMyDsl.g:1677:5: lv_impactLevel_8_0= RULE_INT
            {
            lv_impactLevel_8_0=(Token)match(input,RULE_INT,FOLLOW_46); 

            					newLeafNode(lv_impactLevel_8_0, grammarAccess.getMissionEventAccess().getImpactLevelINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"impactLevel",
            						lv_impactLevel_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionEventAccess().getResponseActionKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1701:3: ( (lv_responseAction_11_0= RULE_STRING ) )
            // InternalMyDsl.g:1702:4: (lv_responseAction_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:1702:4: (lv_responseAction_11_0= RULE_STRING )
            // InternalMyDsl.g:1703:5: lv_responseAction_11_0= RULE_STRING
            {
            lv_responseAction_11_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_responseAction_11_0, grammarAccess.getMissionEventAccess().getResponseActionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"responseAction",
            						lv_responseAction_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionEventAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMissionEvent"

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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});

}