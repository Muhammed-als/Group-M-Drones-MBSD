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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'Mission'", "'{'", "'missionID'", "'='", "'missionType'", "'startLocation'", "'endLocation'", "'priority'", "'estimatedTime'", "'addDrone'", "','", "'addPhase'", "'addConstraint'", "'addEvent'", "'}'", "'Drone'", "'modelType'", "'batterCapacity'", "'maxFlightTime'", "'payloadCapacity'", "'role'", "'addEnergyModel'", "'EnergyModel'", "'consumptionRate'", "'batteryHealth'", "'rechargeTime'", "'Phase'", "'phaseType'", "'energyUsage'", "'addSubPhase'", "'SubPhase'", "'subPhaseType'", "'duration'", "'addAction'", "'Action'", "'actionType'", "'inputOutput'", "'SafetyConstraint'", "'minBattery'", "'maxWindSpeed'", "'RegulatoryConstraint'", "'flightPermission'", "'altitudeLimit'", "'MissionEvent'", "'eventType'", "'impactLevel'", "'responseAction'"
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
    public static final int T__60=60;
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_systemRoot_0_0 = null;

        EObject lv_entities_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* )
            // InternalMyDsl.g:79:3: ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_systemRoot_0_0= ruleSystemRoot ) )
            // InternalMyDsl.g:80:4: (lv_systemRoot_0_0= ruleSystemRoot )
            {
            // InternalMyDsl.g:80:4: (lv_systemRoot_0_0= ruleSystemRoot )
            // InternalMyDsl.g:81:5: lv_systemRoot_0_0= ruleSystemRoot
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSystemRootSystemRootParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_systemRoot_0_0=ruleSystemRoot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"systemRoot",
            						lv_systemRoot_0_0,
            						"org.xtext.example.mydsl.MyDsl.SystemRoot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_entities_1_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==29||LA1_0==36||LA1_0==40||LA1_0==44||LA1_0==48||LA1_0==51||LA1_0==54||LA1_0==57) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_entities_1_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_entities_1_0= ruleEntity )
            	    // InternalMyDsl.g:100:5: lv_entities_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSystemRoot"
    // InternalMyDsl.g:121:1: entryRuleSystemRoot returns [EObject current=null] : iv_ruleSystemRoot= ruleSystemRoot EOF ;
    public final EObject entryRuleSystemRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRoot = null;


        try {
            // InternalMyDsl.g:121:51: (iv_ruleSystemRoot= ruleSystemRoot EOF )
            // InternalMyDsl.g:122:2: iv_ruleSystemRoot= ruleSystemRoot EOF
            {
             newCompositeNode(grammarAccess.getSystemRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemRoot=ruleSystemRoot();

            state._fsp--;

             current =iv_ruleSystemRoot; 
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
    // $ANTLR end "entryRuleSystemRoot"


    // $ANTLR start "ruleSystemRoot"
    // InternalMyDsl.g:128:1: ruleSystemRoot returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ) ;
    public final EObject ruleSystemRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ) )
            // InternalMyDsl.g:135:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* )
            {
            // InternalMyDsl.g:135:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* )
            // InternalMyDsl.g:136:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemRootAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemRootAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRootRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:158:3: ( (lv_entities_2_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:159:4: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:159:4: (lv_entities_2_0= ruleEntity )
            	    // InternalMyDsl.g:160:5: lv_entities_2_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRootAccess().getEntitiesEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleSystemRoot"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:181:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:181:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:182:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:188:1: ruleEntity returns [EObject current=null] : (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_Constraint_6= ruleConstraint | this_MissionEvent_7= ruleMissionEvent ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Mission_0 = null;

        EObject this_Drone_1 = null;

        EObject this_EnergyModel_2 = null;

        EObject this_Phase_3 = null;

        EObject this_SubPhase_4 = null;

        EObject this_Action_5 = null;

        EObject this_Constraint_6 = null;

        EObject this_MissionEvent_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:194:2: ( (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_Constraint_6= ruleConstraint | this_MissionEvent_7= ruleMissionEvent ) )
            // InternalMyDsl.g:195:2: (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_Constraint_6= ruleConstraint | this_MissionEvent_7= ruleMissionEvent )
            {
            // InternalMyDsl.g:195:2: (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_Constraint_6= ruleConstraint | this_MissionEvent_7= ruleMissionEvent )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 36:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            case 44:
                {
                alt3=5;
                }
                break;
            case 48:
                {
                alt3=6;
                }
                break;
            case 51:
            case 54:
                {
                alt3=7;
                }
                break;
            case 57:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:196:3: this_Mission_0= ruleMission
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getMissionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mission_0=ruleMission();

                    state._fsp--;


                    			current = this_Mission_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:205:3: this_Drone_1= ruleDrone
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getDroneParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Drone_1=ruleDrone();

                    state._fsp--;


                    			current = this_Drone_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:214:3: this_EnergyModel_2= ruleEnergyModel
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getEnergyModelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnergyModel_2=ruleEnergyModel();

                    state._fsp--;


                    			current = this_EnergyModel_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:223:3: this_Phase_3= rulePhase
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getPhaseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Phase_3=rulePhase();

                    state._fsp--;


                    			current = this_Phase_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:232:3: this_SubPhase_4= ruleSubPhase
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getSubPhaseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubPhase_4=ruleSubPhase();

                    state._fsp--;


                    			current = this_SubPhase_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:241:3: this_Action_5= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getActionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_5=ruleAction();

                    state._fsp--;


                    			current = this_Action_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:250:3: this_Constraint_6= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getConstraintParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_6=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:259:3: this_MissionEvent_7= ruleMissionEvent
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getMissionEventParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MissionEvent_7=ruleMissionEvent();

                    state._fsp--;


                    			current = this_MissionEvent_7;
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:271:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:271:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:272:2: iv_ruleMission= ruleMission EOF
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
    // InternalMyDsl.g:278:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' ) ;
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
            // InternalMyDsl.g:284:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' ) )
            // InternalMyDsl.g:285:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' )
            {
            // InternalMyDsl.g:285:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' )
            // InternalMyDsl.g:286:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalMyDsl.g:290:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:291:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:291:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:292:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getMissionIDKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:320:3: ( (lv_id_5_0= RULE_STRING ) )
            // InternalMyDsl.g:321:4: (lv_id_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:321:4: (lv_id_5_0= RULE_STRING )
            // InternalMyDsl.g:322:5: lv_id_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getMissionTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:346:3: ( (lv_missionType_8_0= RULE_STRING ) )
            // InternalMyDsl.g:347:4: (lv_missionType_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:347:4: (lv_missionType_8_0= RULE_STRING )
            // InternalMyDsl.g:348:5: lv_missionType_8_0= RULE_STRING
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

            otherlv_9=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getStartLocationKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:372:3: ( (lv_startLocation_11_0= RULE_STRING ) )
            // InternalMyDsl.g:373:4: (lv_startLocation_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:373:4: (lv_startLocation_11_0= RULE_STRING )
            // InternalMyDsl.g:374:5: lv_startLocation_11_0= RULE_STRING
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

            otherlv_12=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getEndLocationKeyword_12());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:398:3: ( (lv_endLocation_14_0= RULE_STRING ) )
            // InternalMyDsl.g:399:4: (lv_endLocation_14_0= RULE_STRING )
            {
            // InternalMyDsl.g:399:4: (lv_endLocation_14_0= RULE_STRING )
            // InternalMyDsl.g:400:5: lv_endLocation_14_0= RULE_STRING
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

            otherlv_15=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getPriorityKeyword_15());
            		
            otherlv_16=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:424:3: ( (lv_priority_17_0= RULE_INT ) )
            // InternalMyDsl.g:425:4: (lv_priority_17_0= RULE_INT )
            {
            // InternalMyDsl.g:425:4: (lv_priority_17_0= RULE_INT )
            // InternalMyDsl.g:426:5: lv_priority_17_0= RULE_INT
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

            otherlv_18=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getEstimatedTimeKeyword_18());
            		
            otherlv_19=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getEqualsSignKeyword_19());
            		
            // InternalMyDsl.g:450:3: ( (lv_estimatedTime_20_0= RULE_FLOAT ) )
            // InternalMyDsl.g:451:4: (lv_estimatedTime_20_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:451:4: (lv_estimatedTime_20_0= RULE_FLOAT )
            // InternalMyDsl.g:452:5: lv_estimatedTime_20_0= RULE_FLOAT
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

            otherlv_21=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getMissionAccess().getAddDroneKeyword_21());
            		
            otherlv_22=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getEqualsSignKeyword_22());
            		
            // InternalMyDsl.g:476:3: ( (otherlv_23= RULE_ID ) )
            // InternalMyDsl.g:477:4: (otherlv_23= RULE_ID )
            {
            // InternalMyDsl.g:477:4: (otherlv_23= RULE_ID )
            // InternalMyDsl.g:478:5: otherlv_23= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_23, grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_23_0());
            				

            }


            }

            // InternalMyDsl.g:489:3: (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:490:4: otherlv_24= ',' ( (otherlv_25= RULE_ID ) )
            	    {
            	    otherlv_24=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getCommaKeyword_24_0());
            	    			
            	    // InternalMyDsl.g:494:4: ( (otherlv_25= RULE_ID ) )
            	    // InternalMyDsl.g:495:5: (otherlv_25= RULE_ID )
            	    {
            	    // InternalMyDsl.g:495:5: (otherlv_25= RULE_ID )
            	    // InternalMyDsl.g:496:6: otherlv_25= RULE_ID
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
            	    break loop4;
                }
            } while (true);

            otherlv_26=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_26, grammarAccess.getMissionAccess().getAddPhaseKeyword_25());
            		
            otherlv_27=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_27, grammarAccess.getMissionAccess().getEqualsSignKeyword_26());
            		
            // InternalMyDsl.g:516:3: ( (otherlv_28= RULE_ID ) )
            // InternalMyDsl.g:517:4: (otherlv_28= RULE_ID )
            {
            // InternalMyDsl.g:517:4: (otherlv_28= RULE_ID )
            // InternalMyDsl.g:518:5: otherlv_28= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_28, grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_27_0());
            				

            }


            }

            // InternalMyDsl.g:529:3: (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:530:4: otherlv_29= ',' ( (otherlv_30= RULE_ID ) )
            	    {
            	    otherlv_29=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_29, grammarAccess.getMissionAccess().getCommaKeyword_28_0());
            	    			
            	    // InternalMyDsl.g:534:4: ( (otherlv_30= RULE_ID ) )
            	    // InternalMyDsl.g:535:5: (otherlv_30= RULE_ID )
            	    {
            	    // InternalMyDsl.g:535:5: (otherlv_30= RULE_ID )
            	    // InternalMyDsl.g:536:6: otherlv_30= RULE_ID
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
            	    break loop5;
                }
            } while (true);

            otherlv_31=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_31, grammarAccess.getMissionAccess().getAddConstraintKeyword_29());
            		
            otherlv_32=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_32, grammarAccess.getMissionAccess().getEqualsSignKeyword_30());
            		
            // InternalMyDsl.g:556:3: ( (otherlv_33= RULE_ID ) )
            // InternalMyDsl.g:557:4: (otherlv_33= RULE_ID )
            {
            // InternalMyDsl.g:557:4: (otherlv_33= RULE_ID )
            // InternalMyDsl.g:558:5: otherlv_33= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_33=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_33, grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_31_0());
            				

            }


            }

            // InternalMyDsl.g:569:3: (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:570:4: otherlv_34= ',' ( (otherlv_35= RULE_ID ) )
            	    {
            	    otherlv_34=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_34, grammarAccess.getMissionAccess().getCommaKeyword_32_0());
            	    			
            	    // InternalMyDsl.g:574:4: ( (otherlv_35= RULE_ID ) )
            	    // InternalMyDsl.g:575:5: (otherlv_35= RULE_ID )
            	    {
            	    // InternalMyDsl.g:575:5: (otherlv_35= RULE_ID )
            	    // InternalMyDsl.g:576:6: otherlv_35= RULE_ID
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
            	    break loop6;
                }
            } while (true);

            otherlv_36=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_36, grammarAccess.getMissionAccess().getAddEventKeyword_33());
            		
            otherlv_37=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_37, grammarAccess.getMissionAccess().getEqualsSignKeyword_34());
            		
            // InternalMyDsl.g:596:3: ( (otherlv_38= RULE_ID ) )
            // InternalMyDsl.g:597:4: (otherlv_38= RULE_ID )
            {
            // InternalMyDsl.g:597:4: (otherlv_38= RULE_ID )
            // InternalMyDsl.g:598:5: otherlv_38= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_38=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_38, grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_35_0());
            				

            }


            }

            // InternalMyDsl.g:609:3: (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:610:4: otherlv_39= ',' ( (otherlv_40= RULE_ID ) )
            	    {
            	    otherlv_39=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_39, grammarAccess.getMissionAccess().getCommaKeyword_36_0());
            	    			
            	    // InternalMyDsl.g:614:4: ( (otherlv_40= RULE_ID ) )
            	    // InternalMyDsl.g:615:5: (otherlv_40= RULE_ID )
            	    {
            	    // InternalMyDsl.g:615:5: (otherlv_40= RULE_ID )
            	    // InternalMyDsl.g:616:6: otherlv_40= RULE_ID
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
            	    break loop7;
                }
            } while (true);

            otherlv_41=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:636:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalMyDsl.g:636:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalMyDsl.g:637:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalMyDsl.g:643:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' ) ;
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
            // InternalMyDsl.g:649:2: ( (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' ) )
            // InternalMyDsl.g:650:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' )
            {
            // InternalMyDsl.g:650:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' )
            // InternalMyDsl.g:651:3: otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            // InternalMyDsl.g:655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:656:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:657:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getModelTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:685:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalMyDsl.g:686:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:686:4: (lv_type_5_0= RULE_STRING )
            // InternalMyDsl.g:687:5: lv_type_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getBatterCapacityKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:711:3: ( (lv_batterCapacity_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:712:4: (lv_batterCapacity_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:712:4: (lv_batterCapacity_8_0= RULE_FLOAT )
            // InternalMyDsl.g:713:5: lv_batterCapacity_8_0= RULE_FLOAT
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

            otherlv_9=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneAccess().getMaxFlightTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getDroneAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:737:3: ( (lv_maxFlightTime_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:738:4: (lv_maxFlightTime_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:738:4: (lv_maxFlightTime_11_0= RULE_FLOAT )
            // InternalMyDsl.g:739:5: lv_maxFlightTime_11_0= RULE_FLOAT
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

            otherlv_12=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getDroneAccess().getPayloadCapacityKeyword_12());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_13, grammarAccess.getDroneAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:763:3: ( (lv_payloadCapacity_14_0= RULE_FLOAT ) )
            // InternalMyDsl.g:764:4: (lv_payloadCapacity_14_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:764:4: (lv_payloadCapacity_14_0= RULE_FLOAT )
            // InternalMyDsl.g:765:5: lv_payloadCapacity_14_0= RULE_FLOAT
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

            otherlv_15=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getDroneAccess().getRoleKeyword_15());
            		
            otherlv_16=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_16, grammarAccess.getDroneAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:789:3: ( (lv_role_17_0= RULE_STRING ) )
            // InternalMyDsl.g:790:4: (lv_role_17_0= RULE_STRING )
            {
            // InternalMyDsl.g:790:4: (lv_role_17_0= RULE_STRING )
            // InternalMyDsl.g:791:5: lv_role_17_0= RULE_STRING
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

            otherlv_18=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getDroneAccess().getAddEnergyModelKeyword_18());
            		
            otherlv_19=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getDroneAccess().getEqualsSignKeyword_19());
            		
            // InternalMyDsl.g:815:3: ( (otherlv_20= RULE_ID ) )
            // InternalMyDsl.g:816:4: (otherlv_20= RULE_ID )
            {
            // InternalMyDsl.g:816:4: (otherlv_20= RULE_ID )
            // InternalMyDsl.g:817:5: otherlv_20= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            				
            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_20, grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_20_0());
            				

            }


            }

            // InternalMyDsl.g:828:3: (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:829:4: otherlv_21= ',' ( (otherlv_22= RULE_ID ) )
            	    {
            	    otherlv_21=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_21, grammarAccess.getDroneAccess().getCommaKeyword_21_0());
            	    			
            	    // InternalMyDsl.g:833:4: ( (otherlv_22= RULE_ID ) )
            	    // InternalMyDsl.g:834:5: (otherlv_22= RULE_ID )
            	    {
            	    // InternalMyDsl.g:834:5: (otherlv_22= RULE_ID )
            	    // InternalMyDsl.g:835:6: otherlv_22= RULE_ID
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
            	    break loop8;
                }
            } while (true);

            otherlv_23=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:855:1: entryRuleEnergyModel returns [EObject current=null] : iv_ruleEnergyModel= ruleEnergyModel EOF ;
    public final EObject entryRuleEnergyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnergyModel = null;


        try {
            // InternalMyDsl.g:855:52: (iv_ruleEnergyModel= ruleEnergyModel EOF )
            // InternalMyDsl.g:856:2: iv_ruleEnergyModel= ruleEnergyModel EOF
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
    // InternalMyDsl.g:862:1: ruleEnergyModel returns [EObject current=null] : (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) ;
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
        Token lv_rechargeTime_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:868:2: ( (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:869:2: (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:869:2: (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            // InternalMyDsl.g:870:3: otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnergyModelAccess().getEnergyModelKeyword_0());
            		
            // InternalMyDsl.g:874:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:875:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:875:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:876:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEnergyModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEnergyModelAccess().getConsumptionRateKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:904:3: ( (lv_consumptionRate_5_0= RULE_FLOAT ) )
            // InternalMyDsl.g:905:4: (lv_consumptionRate_5_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:905:4: (lv_consumptionRate_5_0= RULE_FLOAT )
            // InternalMyDsl.g:906:5: lv_consumptionRate_5_0= RULE_FLOAT
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

            otherlv_6=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEnergyModelAccess().getBatteryHealthKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:930:3: ( (lv_batteryHealth_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:931:4: (lv_batteryHealth_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:931:4: (lv_batteryHealth_8_0= RULE_FLOAT )
            // InternalMyDsl.g:932:5: lv_batteryHealth_8_0= RULE_FLOAT
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

            otherlv_9=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getEnergyModelAccess().getRechargeTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:956:3: ( (lv_rechargeTime_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:957:4: (lv_rechargeTime_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:957:4: (lv_rechargeTime_11_0= RULE_FLOAT )
            // InternalMyDsl.g:958:5: lv_rechargeTime_11_0= RULE_FLOAT
            {
            lv_rechargeTime_11_0=(Token)match(input,RULE_FLOAT,FOLLOW_30); 

            					newLeafNode(lv_rechargeTime_11_0, grammarAccess.getEnergyModelAccess().getRechargeTimeFLOATTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnergyModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rechargeTime",
            						lv_rechargeTime_11_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            				

            }


            }

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:982:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalMyDsl.g:982:46: (iv_rulePhase= rulePhase EOF )
            // InternalMyDsl.g:983:2: iv_rulePhase= rulePhase EOF
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
    // InternalMyDsl.g:989:1: rulePhase returns [EObject current=null] : (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) ;
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
            // InternalMyDsl.g:995:2: ( (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) )
            // InternalMyDsl.g:996:2: (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            {
            // InternalMyDsl.g:996:2: (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            // InternalMyDsl.g:997:3: otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPhaseAccess().getPhaseKeyword_0());
            		
            // InternalMyDsl.g:1001:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1002:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1002:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1003:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getPhaseTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPhaseAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1031:3: ( (lv_phaseType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1032:4: (lv_phaseType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1032:4: (lv_phaseType_5_0= RULE_STRING )
            // InternalMyDsl.g:1033:5: lv_phaseType_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPhaseAccess().getEnergyUsageKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getPhaseAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1057:3: ( (lv_energyUsage_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1058:4: (lv_energyUsage_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1058:4: (lv_energyUsage_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1059:5: lv_energyUsage_8_0= RULE_FLOAT
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

            otherlv_9=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getPhaseAccess().getAddSubPhaseKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPhaseAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1083:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1084:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1084:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1085:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_11, grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:1096:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1097:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_12, grammarAccess.getPhaseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:1101:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:1102:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1102:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:1103:6: otherlv_13= RULE_ID
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
            	    break loop9;
                }
            } while (true);

            otherlv_14=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:1123:1: entryRuleSubPhase returns [EObject current=null] : iv_ruleSubPhase= ruleSubPhase EOF ;
    public final EObject entryRuleSubPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPhase = null;


        try {
            // InternalMyDsl.g:1123:49: (iv_ruleSubPhase= ruleSubPhase EOF )
            // InternalMyDsl.g:1124:2: iv_ruleSubPhase= ruleSubPhase EOF
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
    // InternalMyDsl.g:1130:1: ruleSubPhase returns [EObject current=null] : (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) ;
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
            // InternalMyDsl.g:1136:2: ( (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) )
            // InternalMyDsl.g:1137:2: (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            {
            // InternalMyDsl.g:1137:2: (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            // InternalMyDsl.g:1138:3: otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubPhaseAccess().getSubPhaseKeyword_0());
            		
            // InternalMyDsl.g:1142:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1143:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1143:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1144:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getSubPhaseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSubPhaseAccess().getSubPhaseTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1172:3: ( (lv_subPhaseType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1173:4: (lv_subPhaseType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1173:4: (lv_subPhaseType_5_0= RULE_STRING )
            // InternalMyDsl.g:1174:5: lv_subPhaseType_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSubPhaseAccess().getDurationKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1198:3: ( (lv_duration_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1199:4: (lv_duration_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1199:4: (lv_duration_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1200:5: lv_duration_8_0= RULE_FLOAT
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

            otherlv_9=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getSubPhaseAccess().getAddActionKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1224:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1225:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1225:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1226:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubPhaseRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_11, grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:1237:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1238:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSubPhaseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:1242:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:1243:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1243:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:1244:6: otherlv_13= RULE_ID
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
            	    break loop10;
                }
            } while (true);

            otherlv_14=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:1264:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:1264:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:1265:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:1271:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1277:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1278:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1278:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1279:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:1283:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1284:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1284:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1285:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getActionTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1313:3: ( (lv_actionType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1314:4: (lv_actionType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1314:4: (lv_actionType_5_0= RULE_STRING )
            // InternalMyDsl.g:1315:5: lv_actionType_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getInputOutputKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1339:3: ( (lv_inputOutput_8_0= RULE_STRING ) )
            // InternalMyDsl.g:1340:4: (lv_inputOutput_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:1340:4: (lv_inputOutput_8_0= RULE_STRING )
            // InternalMyDsl.g:1341:5: lv_inputOutput_8_0= RULE_STRING
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

            otherlv_9=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getEnergyUsageKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getActionAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1365:3: ( (lv_energyUsage_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1366:4: (lv_energyUsage_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1366:4: (lv_energyUsage_11_0= RULE_FLOAT )
            // InternalMyDsl.g:1367:5: lv_energyUsage_11_0= RULE_FLOAT
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

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:1391:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:1391:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:1392:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:1398:1: ruleConstraint returns [EObject current=null] : (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SafetyConstraint_0 = null;

        EObject this_RegulatoryConstraint_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1404:2: ( (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint ) )
            // InternalMyDsl.g:1405:2: (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint )
            {
            // InternalMyDsl.g:1405:2: (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==51) ) {
                alt11=1;
            }
            else if ( (LA11_0==54) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1406:3: this_SafetyConstraint_0= ruleSafetyConstraint
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
                    // InternalMyDsl.g:1415:3: this_RegulatoryConstraint_1= ruleRegulatoryConstraint
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
    // InternalMyDsl.g:1427:1: entryRuleSafetyConstraint returns [EObject current=null] : iv_ruleSafetyConstraint= ruleSafetyConstraint EOF ;
    public final EObject entryRuleSafetyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyConstraint = null;


        try {
            // InternalMyDsl.g:1427:57: (iv_ruleSafetyConstraint= ruleSafetyConstraint EOF )
            // InternalMyDsl.g:1428:2: iv_ruleSafetyConstraint= ruleSafetyConstraint EOF
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
    // InternalMyDsl.g:1434:1: ruleSafetyConstraint returns [EObject current=null] : (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1440:2: ( (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:1441:2: (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:1441:2: (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' )
            // InternalMyDsl.g:1442:3: otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyConstraintAccess().getSafetyConstraintKeyword_0());
            		
            // InternalMyDsl.g:1446:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1447:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1447:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1448:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSafetyConstraintAccess().getMinBatteryKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1476:3: ( (lv_minBattery_5_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1477:4: (lv_minBattery_5_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1477:4: (lv_minBattery_5_0= RULE_FLOAT )
            // InternalMyDsl.g:1478:5: lv_minBattery_5_0= RULE_FLOAT
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

            otherlv_6=(Token)match(input,53,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1502:3: ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1503:4: (lv_maxWindSpeed_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1503:4: (lv_maxWindSpeed_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1504:5: lv_maxWindSpeed_8_0= RULE_FLOAT
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

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:1528:1: entryRuleRegulatoryConstraint returns [EObject current=null] : iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF ;
    public final EObject entryRuleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegulatoryConstraint = null;


        try {
            // InternalMyDsl.g:1528:61: (iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:1529:2: iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF
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
    // InternalMyDsl.g:1535:1: ruleRegulatoryConstraint returns [EObject current=null] : (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1541:2: ( (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:1542:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:1542:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalMyDsl.g:1543:3: otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0());
            		
            // InternalMyDsl.g:1547:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1548:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1548:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1549:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1577:3: ( (lv_flightPermission_5_0= RULE_BOOLEAN ) )
            // InternalMyDsl.g:1578:4: (lv_flightPermission_5_0= RULE_BOOLEAN )
            {
            // InternalMyDsl.g:1578:4: (lv_flightPermission_5_0= RULE_BOOLEAN )
            // InternalMyDsl.g:1579:5: lv_flightPermission_5_0= RULE_BOOLEAN
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

            otherlv_6=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1603:3: ( (lv_altitudeLimit_8_0= RULE_INT ) )
            // InternalMyDsl.g:1604:4: (lv_altitudeLimit_8_0= RULE_INT )
            {
            // InternalMyDsl.g:1604:4: (lv_altitudeLimit_8_0= RULE_INT )
            // InternalMyDsl.g:1605:5: lv_altitudeLimit_8_0= RULE_INT
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

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:1629:1: entryRuleMissionEvent returns [EObject current=null] : iv_ruleMissionEvent= ruleMissionEvent EOF ;
    public final EObject entryRuleMissionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionEvent = null;


        try {
            // InternalMyDsl.g:1629:53: (iv_ruleMissionEvent= ruleMissionEvent EOF )
            // InternalMyDsl.g:1630:2: iv_ruleMissionEvent= ruleMissionEvent EOF
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
    // InternalMyDsl.g:1636:1: ruleMissionEvent returns [EObject current=null] : (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1642:2: ( (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1643:2: (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1643:2: (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1644:3: otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionEventAccess().getMissionEventKeyword_0());
            		
            // InternalMyDsl.g:1648:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1649:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1649:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1650:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionEventAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,58,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionEventAccess().getEventTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1678:3: ( (lv_eventType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1679:4: (lv_eventType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1679:4: (lv_eventType_5_0= RULE_STRING )
            // InternalMyDsl.g:1680:5: lv_eventType_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionEventAccess().getImpactLevelKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1704:3: ( (lv_impactLevel_8_0= RULE_INT ) )
            // InternalMyDsl.g:1705:4: (lv_impactLevel_8_0= RULE_INT )
            {
            // InternalMyDsl.g:1705:4: (lv_impactLevel_8_0= RULE_INT )
            // InternalMyDsl.g:1706:5: lv_impactLevel_8_0= RULE_INT
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

            otherlv_9=(Token)match(input,60,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionEventAccess().getResponseActionKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1730:3: ( (lv_responseAction_11_0= RULE_STRING ) )
            // InternalMyDsl.g:1731:4: (lv_responseAction_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:1731:4: (lv_responseAction_11_0= RULE_STRING )
            // InternalMyDsl.g:1732:5: lv_responseAction_11_0= RULE_STRING
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

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\u009d\uffff";
    static final String dfa_2s = "\1\12\u009c\uffff";
    static final String dfa_3s = "\1\16\11\4\1\uffff\11\17\1\20\1\36\1\45\1\51\1\55\1\61\1\64\1\67\1\72\11\21\2\5\1\7\3\5\1\7\1\10\1\5\1\22\1\37\1\46\1\52\1\56\1\62\1\65\1\70\1\73\11\21\1\5\4\7\1\5\1\7\2\6\1\23\1\40\1\47\1\53\1\57\1\52\2\34\1\74\6\21\2\uffff\1\21\1\5\2\7\2\4\1\7\1\5\1\24\1\41\1\34\2\30\2\34\2\21\1\uffff\1\4\1\uffff\1\4\3\uffff\1\5\1\7\2\30\1\25\1\42\2\21\1\6\1\5\1\26\1\43\2\21\1\7\1\4\1\27\1\30\1\21\1\4\1\uffff\1\4\2\30\1\4\1\21\1\30\1\4\1\30\1\4\1\21\1\30\1\4\1\30\1\4\1\21\1\30\1\4\1\30\1\4\1\uffff\1\30";
    static final String dfa_4s = "\1\71\11\4\1\uffff\11\17\1\20\1\36\1\45\1\51\1\55\1\61\1\64\1\67\1\72\11\21\2\5\1\7\3\5\1\7\1\10\1\5\1\22\1\37\1\46\1\52\1\56\1\62\1\65\1\70\1\73\11\21\1\5\4\7\1\5\1\7\2\6\1\23\1\40\1\47\1\53\1\57\1\52\2\34\1\74\6\21\2\uffff\1\21\1\5\2\7\2\4\1\7\1\5\1\24\1\41\5\34\2\21\1\uffff\1\4\1\uffff\1\4\3\uffff\1\5\1\7\2\34\1\25\1\42\2\21\1\6\1\5\1\26\1\43\2\21\1\7\1\4\1\27\1\34\1\21\1\4\1\uffff\1\4\1\34\1\31\1\4\1\21\1\31\1\4\1\32\1\4\1\21\1\32\1\4\1\33\1\4\1\21\1\33\1\4\1\34\1\4\1\uffff\1\34";
    static final String dfa_5s = "\12\uffff\1\2\116\uffff\2\1\21\uffff\1\1\1\uffff\1\1\1\uffff\3\1\24\uffff\1\1\23\uffff\1\1\1\uffff";
    static final String dfa_6s = "\u009d\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\16\uffff\1\2\6\uffff\1\3\3\uffff\1\4\3\uffff\1\5\3\uffff\1\6\2\uffff\1\7\2\uffff\1\10\2\uffff\1\11",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
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
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\3\uffff\1\156",
            "\1\157\3\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "",
            "\1\166",
            "",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\155\3\uffff\1\156",
            "\1\157\3\uffff\1\160",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u008b\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008b\1\u008c",
            "\1\u008f",
            "\1\u0090\1\uffff\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0090\1\uffff\1\u0091",
            "\1\u0094",
            "\1\u0095\2\uffff\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0095\2\uffff\1\u0096",
            "\1\u0099",
            "\1\u009a\3\uffff\1\u009b",
            "\1\u009c",
            "",
            "\1\u009a\3\uffff\1\u009b"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 158:3: ( (lv_entities_2_0= ruleEntity ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0249111020004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});

}