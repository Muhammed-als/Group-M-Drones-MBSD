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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'Mission'", "'{'", "'missionID'", "'='", "'missionType'", "'startLocation'", "'endLocation'", "'priority'", "'estimatedTime'", "'addDrone'", "','", "'addPhase'", "'addConstraint'", "'addEvent'", "'}'", "'Drone'", "'modelType'", "'batterCapacity'", "'maxFlightTime'", "'payloadCapacity'", "'role'", "'addEnergyModel'", "'EnergyModel'", "'consumptionRate'", "'batteryHealth'", "'rechargeTime'", "'Phase'", "'phaseType'", "'energyUsage'", "'addSubPhase'", "'SubPhase'", "'subPhaseType'", "'duration'", "'addAction'", "'Action'", "'actionType'", "'inputOutput'", "'Constraint'", "'constraintType'", "'description'", "'SafetyConstraint'", "'minBattery'", "'maxWindSpeed'", "'RegulatoryConstraint'", "'flightPermission'", "'altitudeLimit'", "'MissionEvent'", "'eventType'", "'impactLevel'", "'responseAction'", "'Relation'", "'from'", "'to'", "'type'", "'.'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
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
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_relations_2_0= ruleRelation ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_systemRoot_0_0 = null;

        EObject lv_entities_1_0 = null;

        EObject lv_relations_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_relations_2_0= ruleRelation ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_relations_2_0= ruleRelation ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_relations_2_0= ruleRelation ) )* )
            // InternalMyDsl.g:79:3: ( (lv_systemRoot_0_0= ruleSystemRoot ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_relations_2_0= ruleRelation ) )*
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

                if ( (LA1_0==13||LA1_0==28||LA1_0==35||LA1_0==39||LA1_0==43||LA1_0==47||LA1_0==50||LA1_0==53||LA1_0==56||LA1_0==59) ) {
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

            // InternalMyDsl.g:117:3: ( (lv_relations_2_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==63) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:118:4: (lv_relations_2_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:118:4: (lv_relations_2_0= ruleRelation )
            	    // InternalMyDsl.g:119:5: lv_relations_2_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_relations_2_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Relation");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSystemRoot"
    // InternalMyDsl.g:140:1: entryRuleSystemRoot returns [EObject current=null] : iv_ruleSystemRoot= ruleSystemRoot EOF ;
    public final EObject entryRuleSystemRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRoot = null;


        try {
            // InternalMyDsl.g:140:51: (iv_ruleSystemRoot= ruleSystemRoot EOF )
            // InternalMyDsl.g:141:2: iv_ruleSystemRoot= ruleSystemRoot EOF
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
    // InternalMyDsl.g:147:1: ruleSystemRoot returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) ;
    public final EObject ruleSystemRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;

        EObject lv_relations_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:153:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) )
            // InternalMyDsl.g:154:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* )
            {
            // InternalMyDsl.g:154:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* )
            // InternalMyDsl.g:155:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemRootAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:161:5: lv_name_1_0= RULE_ID
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

            // InternalMyDsl.g:177:3: ( (lv_entities_2_0= ruleEntity ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:178:4: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:178:4: (lv_entities_2_0= ruleEntity )
            	    // InternalMyDsl.g:179:5: lv_entities_2_0= ruleEntity
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
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:196:3: ( (lv_relations_3_0= ruleRelation ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:197:4: (lv_relations_3_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:197:4: (lv_relations_3_0= ruleRelation )
            	    // InternalMyDsl.g:198:5: lv_relations_3_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRootAccess().getRelationsRelationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_relations_3_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalMyDsl.g:219:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:219:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:220:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:226:1: ruleEntity returns [EObject current=null] : (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_ConstraintClasses_6= ruleConstraintClasses | this_MissionEvent_7= ruleMissionEvent ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Mission_0 = null;

        EObject this_Drone_1 = null;

        EObject this_EnergyModel_2 = null;

        EObject this_Phase_3 = null;

        EObject this_SubPhase_4 = null;

        EObject this_Action_5 = null;

        EObject this_ConstraintClasses_6 = null;

        EObject this_MissionEvent_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_ConstraintClasses_6= ruleConstraintClasses | this_MissionEvent_7= ruleMissionEvent ) )
            // InternalMyDsl.g:233:2: (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_ConstraintClasses_6= ruleConstraintClasses | this_MissionEvent_7= ruleMissionEvent )
            {
            // InternalMyDsl.g:233:2: (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_ConstraintClasses_6= ruleConstraintClasses | this_MissionEvent_7= ruleMissionEvent )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            case 39:
                {
                alt5=4;
                }
                break;
            case 43:
                {
                alt5=5;
                }
                break;
            case 47:
                {
                alt5=6;
                }
                break;
            case 50:
            case 53:
            case 56:
                {
                alt5=7;
                }
                break;
            case 59:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:234:3: this_Mission_0= ruleMission
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
                    // InternalMyDsl.g:243:3: this_Drone_1= ruleDrone
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
                    // InternalMyDsl.g:252:3: this_EnergyModel_2= ruleEnergyModel
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
                    // InternalMyDsl.g:261:3: this_Phase_3= rulePhase
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
                    // InternalMyDsl.g:270:3: this_SubPhase_4= ruleSubPhase
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
                    // InternalMyDsl.g:279:3: this_Action_5= ruleAction
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
                    // InternalMyDsl.g:288:3: this_ConstraintClasses_6= ruleConstraintClasses
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getConstraintClassesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintClasses_6=ruleConstraintClasses();

                    state._fsp--;


                    			current = this_ConstraintClasses_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:297:3: this_MissionEvent_7= ruleMissionEvent
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
    // InternalMyDsl.g:309:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:309:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:310:2: iv_ruleMission= ruleMission EOF
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
    // InternalMyDsl.g:316:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= ruleFLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' ) ;
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
        AntlrDatatypeRuleToken lv_estimatedTime_20_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:322:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= ruleFLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' ) )
            // InternalMyDsl.g:323:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= ruleFLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' )
            {
            // InternalMyDsl.g:323:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= ruleFLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' )
            // InternalMyDsl.g:324:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= ruleFLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalMyDsl.g:328:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:329:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:329:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:330:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getMissionIDKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:358:3: ( (lv_id_5_0= RULE_STRING ) )
            // InternalMyDsl.g:359:4: (lv_id_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:359:4: (lv_id_5_0= RULE_STRING )
            // InternalMyDsl.g:360:5: lv_id_5_0= RULE_STRING
            {
            lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_6=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getMissionTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:384:3: ( (lv_missionType_8_0= RULE_STRING ) )
            // InternalMyDsl.g:385:4: (lv_missionType_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:385:4: (lv_missionType_8_0= RULE_STRING )
            // InternalMyDsl.g:386:5: lv_missionType_8_0= RULE_STRING
            {
            lv_missionType_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_9=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getStartLocationKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:410:3: ( (lv_startLocation_11_0= RULE_STRING ) )
            // InternalMyDsl.g:411:4: (lv_startLocation_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:411:4: (lv_startLocation_11_0= RULE_STRING )
            // InternalMyDsl.g:412:5: lv_startLocation_11_0= RULE_STRING
            {
            lv_startLocation_11_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_12=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getEndLocationKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:436:3: ( (lv_endLocation_14_0= RULE_STRING ) )
            // InternalMyDsl.g:437:4: (lv_endLocation_14_0= RULE_STRING )
            {
            // InternalMyDsl.g:437:4: (lv_endLocation_14_0= RULE_STRING )
            // InternalMyDsl.g:438:5: lv_endLocation_14_0= RULE_STRING
            {
            lv_endLocation_14_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_15=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getPriorityKeyword_15());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:462:3: ( (lv_priority_17_0= RULE_INT ) )
            // InternalMyDsl.g:463:4: (lv_priority_17_0= RULE_INT )
            {
            // InternalMyDsl.g:463:4: (lv_priority_17_0= RULE_INT )
            // InternalMyDsl.g:464:5: lv_priority_17_0= RULE_INT
            {
            lv_priority_17_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            otherlv_18=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getEstimatedTimeKeyword_18());
            		
            otherlv_19=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getEqualsSignKeyword_19());
            		
            // InternalMyDsl.g:488:3: ( (lv_estimatedTime_20_0= ruleFLOAT ) )
            // InternalMyDsl.g:489:4: (lv_estimatedTime_20_0= ruleFLOAT )
            {
            // InternalMyDsl.g:489:4: (lv_estimatedTime_20_0= ruleFLOAT )
            // InternalMyDsl.g:490:5: lv_estimatedTime_20_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getEstimatedTimeFLOATParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_16);
            lv_estimatedTime_20_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"estimatedTime",
            						lv_estimatedTime_20_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_21, grammarAccess.getMissionAccess().getAddDroneKeyword_21());
            		
            otherlv_22=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getEqualsSignKeyword_22());
            		
            // InternalMyDsl.g:515:3: ( (otherlv_23= RULE_ID ) )
            // InternalMyDsl.g:516:4: (otherlv_23= RULE_ID )
            {
            // InternalMyDsl.g:516:4: (otherlv_23= RULE_ID )
            // InternalMyDsl.g:517:5: otherlv_23= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_23, grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_23_0());
            				

            }


            }

            // InternalMyDsl.g:528:3: (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:529:4: otherlv_24= ',' ( (otherlv_25= RULE_ID ) )
            	    {
            	    otherlv_24=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getCommaKeyword_24_0());
            	    			
            	    // InternalMyDsl.g:533:4: ( (otherlv_25= RULE_ID ) )
            	    // InternalMyDsl.g:534:5: (otherlv_25= RULE_ID )
            	    {
            	    // InternalMyDsl.g:534:5: (otherlv_25= RULE_ID )
            	    // InternalMyDsl.g:535:6: otherlv_25= RULE_ID
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
            	    break loop6;
                }
            } while (true);

            otherlv_26=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_26, grammarAccess.getMissionAccess().getAddPhaseKeyword_25());
            		
            otherlv_27=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_27, grammarAccess.getMissionAccess().getEqualsSignKeyword_26());
            		
            // InternalMyDsl.g:555:3: ( (otherlv_28= RULE_ID ) )
            // InternalMyDsl.g:556:4: (otherlv_28= RULE_ID )
            {
            // InternalMyDsl.g:556:4: (otherlv_28= RULE_ID )
            // InternalMyDsl.g:557:5: otherlv_28= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_28, grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_27_0());
            				

            }


            }

            // InternalMyDsl.g:568:3: (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:569:4: otherlv_29= ',' ( (otherlv_30= RULE_ID ) )
            	    {
            	    otherlv_29=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_29, grammarAccess.getMissionAccess().getCommaKeyword_28_0());
            	    			
            	    // InternalMyDsl.g:573:4: ( (otherlv_30= RULE_ID ) )
            	    // InternalMyDsl.g:574:5: (otherlv_30= RULE_ID )
            	    {
            	    // InternalMyDsl.g:574:5: (otherlv_30= RULE_ID )
            	    // InternalMyDsl.g:575:6: otherlv_30= RULE_ID
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
            	    break loop7;
                }
            } while (true);

            otherlv_31=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_31, grammarAccess.getMissionAccess().getAddConstraintKeyword_29());
            		
            otherlv_32=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_32, grammarAccess.getMissionAccess().getEqualsSignKeyword_30());
            		
            // InternalMyDsl.g:595:3: ( (otherlv_33= RULE_ID ) )
            // InternalMyDsl.g:596:4: (otherlv_33= RULE_ID )
            {
            // InternalMyDsl.g:596:4: (otherlv_33= RULE_ID )
            // InternalMyDsl.g:597:5: otherlv_33= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_33=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_33, grammarAccess.getMissionAccess().getAddConstraintsConstraintClassesCrossReference_31_0());
            				

            }


            }

            // InternalMyDsl.g:608:3: (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:609:4: otherlv_34= ',' ( (otherlv_35= RULE_ID ) )
            	    {
            	    otherlv_34=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_34, grammarAccess.getMissionAccess().getCommaKeyword_32_0());
            	    			
            	    // InternalMyDsl.g:613:4: ( (otherlv_35= RULE_ID ) )
            	    // InternalMyDsl.g:614:5: (otherlv_35= RULE_ID )
            	    {
            	    // InternalMyDsl.g:614:5: (otherlv_35= RULE_ID )
            	    // InternalMyDsl.g:615:6: otherlv_35= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_35=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_35, grammarAccess.getMissionAccess().getAddConstraintsConstraintClassesCrossReference_32_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_36=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_36, grammarAccess.getMissionAccess().getAddEventKeyword_33());
            		
            otherlv_37=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_37, grammarAccess.getMissionAccess().getEqualsSignKeyword_34());
            		
            // InternalMyDsl.g:635:3: ( (otherlv_38= RULE_ID ) )
            // InternalMyDsl.g:636:4: (otherlv_38= RULE_ID )
            {
            // InternalMyDsl.g:636:4: (otherlv_38= RULE_ID )
            // InternalMyDsl.g:637:5: otherlv_38= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_38=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_38, grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_35_0());
            				

            }


            }

            // InternalMyDsl.g:648:3: (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:649:4: otherlv_39= ',' ( (otherlv_40= RULE_ID ) )
            	    {
            	    otherlv_39=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_39, grammarAccess.getMissionAccess().getCommaKeyword_36_0());
            	    			
            	    // InternalMyDsl.g:653:4: ( (otherlv_40= RULE_ID ) )
            	    // InternalMyDsl.g:654:5: (otherlv_40= RULE_ID )
            	    {
            	    // InternalMyDsl.g:654:5: (otherlv_40= RULE_ID )
            	    // InternalMyDsl.g:655:6: otherlv_40= RULE_ID
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
            	    break loop9;
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
    // InternalMyDsl.g:675:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalMyDsl.g:675:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalMyDsl.g:676:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalMyDsl.g:682:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= ruleFLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= ruleFLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= ruleFLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_role_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_batterCapacity_8_0 = null;

        AntlrDatatypeRuleToken lv_maxFlightTime_11_0 = null;

        AntlrDatatypeRuleToken lv_payloadCapacity_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:688:2: ( (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= ruleFLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= ruleFLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= ruleFLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' ) )
            // InternalMyDsl.g:689:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= ruleFLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= ruleFLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= ruleFLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' )
            {
            // InternalMyDsl.g:689:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= ruleFLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= ruleFLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= ruleFLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' )
            // InternalMyDsl.g:690:3: otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= ruleFLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= ruleFLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= ruleFLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            // InternalMyDsl.g:694:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:695:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:695:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:696:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getModelTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:724:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalMyDsl.g:725:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:725:4: (lv_type_5_0= RULE_STRING )
            // InternalMyDsl.g:726:5: lv_type_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getBatterCapacityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:750:3: ( (lv_batterCapacity_8_0= ruleFLOAT ) )
            // InternalMyDsl.g:751:4: (lv_batterCapacity_8_0= ruleFLOAT )
            {
            // InternalMyDsl.g:751:4: (lv_batterCapacity_8_0= ruleFLOAT )
            // InternalMyDsl.g:752:5: lv_batterCapacity_8_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getBatterCapacityFLOATParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_23);
            lv_batterCapacity_8_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"batterCapacity",
            						lv_batterCapacity_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneAccess().getMaxFlightTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getDroneAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:777:3: ( (lv_maxFlightTime_11_0= ruleFLOAT ) )
            // InternalMyDsl.g:778:4: (lv_maxFlightTime_11_0= ruleFLOAT )
            {
            // InternalMyDsl.g:778:4: (lv_maxFlightTime_11_0= ruleFLOAT )
            // InternalMyDsl.g:779:5: lv_maxFlightTime_11_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getMaxFlightTimeFLOATParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_24);
            lv_maxFlightTime_11_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"maxFlightTime",
            						lv_maxFlightTime_11_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getDroneAccess().getPayloadCapacityKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getDroneAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:804:3: ( (lv_payloadCapacity_14_0= ruleFLOAT ) )
            // InternalMyDsl.g:805:4: (lv_payloadCapacity_14_0= ruleFLOAT )
            {
            // InternalMyDsl.g:805:4: (lv_payloadCapacity_14_0= ruleFLOAT )
            // InternalMyDsl.g:806:5: lv_payloadCapacity_14_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getPayloadCapacityFLOATParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_25);
            lv_payloadCapacity_14_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"payloadCapacity",
            						lv_payloadCapacity_14_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getDroneAccess().getRoleKeyword_15());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getDroneAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:831:3: ( (lv_role_17_0= RULE_STRING ) )
            // InternalMyDsl.g:832:4: (lv_role_17_0= RULE_STRING )
            {
            // InternalMyDsl.g:832:4: (lv_role_17_0= RULE_STRING )
            // InternalMyDsl.g:833:5: lv_role_17_0= RULE_STRING
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

            otherlv_18=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_18, grammarAccess.getDroneAccess().getAddEnergyModelKeyword_18());
            		
            otherlv_19=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_19, grammarAccess.getDroneAccess().getEqualsSignKeyword_19());
            		
            // InternalMyDsl.g:857:3: ( (otherlv_20= RULE_ID ) )
            // InternalMyDsl.g:858:4: (otherlv_20= RULE_ID )
            {
            // InternalMyDsl.g:858:4: (otherlv_20= RULE_ID )
            // InternalMyDsl.g:859:5: otherlv_20= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            				
            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_20, grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_20_0());
            				

            }


            }

            // InternalMyDsl.g:870:3: (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:871:4: otherlv_21= ',' ( (otherlv_22= RULE_ID ) )
            	    {
            	    otherlv_21=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_21, grammarAccess.getDroneAccess().getCommaKeyword_21_0());
            	    			
            	    // InternalMyDsl.g:875:4: ( (otherlv_22= RULE_ID ) )
            	    // InternalMyDsl.g:876:5: (otherlv_22= RULE_ID )
            	    {
            	    // InternalMyDsl.g:876:5: (otherlv_22= RULE_ID )
            	    // InternalMyDsl.g:877:6: otherlv_22= RULE_ID
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
            	    break loop10;
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
    // InternalMyDsl.g:897:1: entryRuleEnergyModel returns [EObject current=null] : iv_ruleEnergyModel= ruleEnergyModel EOF ;
    public final EObject entryRuleEnergyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnergyModel = null;


        try {
            // InternalMyDsl.g:897:52: (iv_ruleEnergyModel= ruleEnergyModel EOF )
            // InternalMyDsl.g:898:2: iv_ruleEnergyModel= ruleEnergyModel EOF
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
    // InternalMyDsl.g:904:1: ruleEnergyModel returns [EObject current=null] : (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= ruleFLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= ruleFLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= ruleFLOAT ) ) otherlv_12= '}' ) ;
    public final EObject ruleEnergyModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_consumptionRate_5_0 = null;

        AntlrDatatypeRuleToken lv_batteryHealth_8_0 = null;

        AntlrDatatypeRuleToken lv_rechargeTime_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:910:2: ( (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= ruleFLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= ruleFLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= ruleFLOAT ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:911:2: (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= ruleFLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= ruleFLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= ruleFLOAT ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:911:2: (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= ruleFLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= ruleFLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= ruleFLOAT ) ) otherlv_12= '}' )
            // InternalMyDsl.g:912:3: otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= ruleFLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= ruleFLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= ruleFLOAT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnergyModelAccess().getEnergyModelKeyword_0());
            		
            // InternalMyDsl.g:916:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:917:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:917:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:918:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEnergyModelAccess().getConsumptionRateKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:946:3: ( (lv_consumptionRate_5_0= ruleFLOAT ) )
            // InternalMyDsl.g:947:4: (lv_consumptionRate_5_0= ruleFLOAT )
            {
            // InternalMyDsl.g:947:4: (lv_consumptionRate_5_0= ruleFLOAT )
            // InternalMyDsl.g:948:5: lv_consumptionRate_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getEnergyModelAccess().getConsumptionRateFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_consumptionRate_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnergyModelRule());
            					}
            					set(
            						current,
            						"consumptionRate",
            						lv_consumptionRate_5_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getEnergyModelAccess().getBatteryHealthKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:973:3: ( (lv_batteryHealth_8_0= ruleFLOAT ) )
            // InternalMyDsl.g:974:4: (lv_batteryHealth_8_0= ruleFLOAT )
            {
            // InternalMyDsl.g:974:4: (lv_batteryHealth_8_0= ruleFLOAT )
            // InternalMyDsl.g:975:5: lv_batteryHealth_8_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getEnergyModelAccess().getBatteryHealthFLOATParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_29);
            lv_batteryHealth_8_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnergyModelRule());
            					}
            					set(
            						current,
            						"batteryHealth",
            						lv_batteryHealth_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getEnergyModelAccess().getRechargeTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1000:3: ( (lv_rechargeTime_11_0= ruleFLOAT ) )
            // InternalMyDsl.g:1001:4: (lv_rechargeTime_11_0= ruleFLOAT )
            {
            // InternalMyDsl.g:1001:4: (lv_rechargeTime_11_0= ruleFLOAT )
            // InternalMyDsl.g:1002:5: lv_rechargeTime_11_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getEnergyModelAccess().getRechargeTimeFLOATParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_30);
            lv_rechargeTime_11_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnergyModelRule());
            					}
            					set(
            						current,
            						"rechargeTime",
            						lv_rechargeTime_11_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalMyDsl.g:1027:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalMyDsl.g:1027:46: (iv_rulePhase= rulePhase EOF )
            // InternalMyDsl.g:1028:2: iv_rulePhase= rulePhase EOF
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
    // InternalMyDsl.g:1034:1: rulePhase returns [EObject current=null] : (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= ruleFLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_energyUsage_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1040:2: ( (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= ruleFLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) )
            // InternalMyDsl.g:1041:2: (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= ruleFLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            {
            // InternalMyDsl.g:1041:2: (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= ruleFLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            // InternalMyDsl.g:1042:3: otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= ruleFLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPhaseAccess().getPhaseKeyword_0());
            		
            // InternalMyDsl.g:1046:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1047:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1047:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1048:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getPhaseTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPhaseAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1076:3: ( (lv_phaseType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1077:4: (lv_phaseType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1077:4: (lv_phaseType_5_0= RULE_STRING )
            // InternalMyDsl.g:1078:5: lv_phaseType_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPhaseAccess().getEnergyUsageKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getPhaseAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1102:3: ( (lv_energyUsage_8_0= ruleFLOAT ) )
            // InternalMyDsl.g:1103:4: (lv_energyUsage_8_0= ruleFLOAT )
            {
            // InternalMyDsl.g:1103:4: (lv_energyUsage_8_0= ruleFLOAT )
            // InternalMyDsl.g:1104:5: lv_energyUsage_8_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getPhaseAccess().getEnergyUsageFLOATParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_33);
            lv_energyUsage_8_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhaseRule());
            					}
            					set(
            						current,
            						"energyUsage",
            						lv_energyUsage_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getPhaseAccess().getAddSubPhaseKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getPhaseAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1129:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1130:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1130:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1131:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_11, grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:1142:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1143:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_12, grammarAccess.getPhaseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:1147:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:1148:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1148:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:1149:6: otherlv_13= RULE_ID
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
            	    break loop11;
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
    // InternalMyDsl.g:1169:1: entryRuleSubPhase returns [EObject current=null] : iv_ruleSubPhase= ruleSubPhase EOF ;
    public final EObject entryRuleSubPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPhase = null;


        try {
            // InternalMyDsl.g:1169:49: (iv_ruleSubPhase= ruleSubPhase EOF )
            // InternalMyDsl.g:1170:2: iv_ruleSubPhase= ruleSubPhase EOF
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
    // InternalMyDsl.g:1176:1: ruleSubPhase returns [EObject current=null] : (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= ruleFLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_duration_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1182:2: ( (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= ruleFLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) )
            // InternalMyDsl.g:1183:2: (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= ruleFLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            {
            // InternalMyDsl.g:1183:2: (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= ruleFLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            // InternalMyDsl.g:1184:3: otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= ruleFLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSubPhaseAccess().getSubPhaseKeyword_0());
            		
            // InternalMyDsl.g:1188:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1189:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1189:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1190:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSubPhaseAccess().getSubPhaseTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1218:3: ( (lv_subPhaseType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1219:4: (lv_subPhaseType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1219:4: (lv_subPhaseType_5_0= RULE_STRING )
            // InternalMyDsl.g:1220:5: lv_subPhaseType_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getSubPhaseAccess().getDurationKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1244:3: ( (lv_duration_8_0= ruleFLOAT ) )
            // InternalMyDsl.g:1245:4: (lv_duration_8_0= ruleFLOAT )
            {
            // InternalMyDsl.g:1245:4: (lv_duration_8_0= ruleFLOAT )
            // InternalMyDsl.g:1246:5: lv_duration_8_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getSubPhaseAccess().getDurationFLOATParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_36);
            lv_duration_8_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubPhaseRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_8_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getSubPhaseAccess().getAddActionKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1271:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1272:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1272:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1273:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubPhaseRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_11, grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:1284:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1285:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSubPhaseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:1289:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:1290:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1290:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:1291:6: otherlv_13= RULE_ID
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
            	    break loop12;
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
    // InternalMyDsl.g:1311:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:1311:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:1312:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:1318:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= ruleFLOAT ) ) otherlv_12= '}' ) ;
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
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_energyUsage_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1324:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= ruleFLOAT ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1325:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= ruleFLOAT ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1325:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= ruleFLOAT ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1326:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= ruleFLOAT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:1330:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1331:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1331:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1332:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getActionTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1360:3: ( (lv_actionType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1361:4: (lv_actionType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1361:4: (lv_actionType_5_0= RULE_STRING )
            // InternalMyDsl.g:1362:5: lv_actionType_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getInputOutputKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1386:3: ( (lv_inputOutput_8_0= RULE_STRING ) )
            // InternalMyDsl.g:1387:4: (lv_inputOutput_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:1387:4: (lv_inputOutput_8_0= RULE_STRING )
            // InternalMyDsl.g:1388:5: lv_inputOutput_8_0= RULE_STRING
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

            otherlv_9=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getEnergyUsageKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getActionAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1412:3: ( (lv_energyUsage_11_0= ruleFLOAT ) )
            // InternalMyDsl.g:1413:4: (lv_energyUsage_11_0= ruleFLOAT )
            {
            // InternalMyDsl.g:1413:4: (lv_energyUsage_11_0= ruleFLOAT )
            // InternalMyDsl.g:1414:5: lv_energyUsage_11_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getActionAccess().getEnergyUsageFLOATParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_30);
            lv_energyUsage_11_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"energyUsage",
            						lv_energyUsage_11_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "entryRuleConstraintClasses"
    // InternalMyDsl.g:1439:1: entryRuleConstraintClasses returns [EObject current=null] : iv_ruleConstraintClasses= ruleConstraintClasses EOF ;
    public final EObject entryRuleConstraintClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintClasses = null;


        try {
            // InternalMyDsl.g:1439:58: (iv_ruleConstraintClasses= ruleConstraintClasses EOF )
            // InternalMyDsl.g:1440:2: iv_ruleConstraintClasses= ruleConstraintClasses EOF
            {
             newCompositeNode(grammarAccess.getConstraintClassesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintClasses=ruleConstraintClasses();

            state._fsp--;

             current =iv_ruleConstraintClasses; 
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
    // $ANTLR end "entryRuleConstraintClasses"


    // $ANTLR start "ruleConstraintClasses"
    // InternalMyDsl.g:1446:1: ruleConstraintClasses returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_SafetyConstraint_1= ruleSafetyConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint ) ;
    public final EObject ruleConstraintClasses() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_SafetyConstraint_1 = null;

        EObject this_RegulatoryConstraint_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1452:2: ( (this_Constraint_0= ruleConstraint | this_SafetyConstraint_1= ruleSafetyConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint ) )
            // InternalMyDsl.g:1453:2: (this_Constraint_0= ruleConstraint | this_SafetyConstraint_1= ruleSafetyConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint )
            {
            // InternalMyDsl.g:1453:2: (this_Constraint_0= ruleConstraint | this_SafetyConstraint_1= ruleSafetyConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt13=1;
                }
                break;
            case 53:
                {
                alt13=2;
                }
                break;
            case 56:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1454:3: this_Constraint_0= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getConstraintClassesAccess().getConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_0=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1463:3: this_SafetyConstraint_1= ruleSafetyConstraint
                    {

                    			newCompositeNode(grammarAccess.getConstraintClassesAccess().getSafetyConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SafetyConstraint_1=ruleSafetyConstraint();

                    state._fsp--;


                    			current = this_SafetyConstraint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1472:3: this_RegulatoryConstraint_2= ruleRegulatoryConstraint
                    {

                    			newCompositeNode(grammarAccess.getConstraintClassesAccess().getRegulatoryConstraintParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegulatoryConstraint_2=ruleRegulatoryConstraint();

                    state._fsp--;


                    			current = this_RegulatoryConstraint_2;
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
    // $ANTLR end "ruleConstraintClasses"


    // $ANTLR start "entryRuleConstraint"
    // InternalMyDsl.g:1484:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:1484:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:1485:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:1491:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_constraintType_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1497:2: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:1498:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:1498:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalMyDsl.g:1499:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) ) otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalMyDsl.g:1503:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1504:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1504:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1505:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getConstraintTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1533:3: ( (lv_constraintType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1534:4: (lv_constraintType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1534:4: (lv_constraintType_5_0= RULE_STRING )
            // InternalMyDsl.g:1535:5: lv_constraintType_5_0= RULE_STRING
            {
            lv_constraintType_5_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_constraintType_5_0, grammarAccess.getConstraintAccess().getConstraintTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"constraintType",
            						lv_constraintType_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getDescriptionKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1559:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalMyDsl.g:1560:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:1560:4: (lv_description_8_0= RULE_STRING )
            // InternalMyDsl.g:1561:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_description_8_0, grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:1585:1: entryRuleSafetyConstraint returns [EObject current=null] : iv_ruleSafetyConstraint= ruleSafetyConstraint EOF ;
    public final EObject entryRuleSafetyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyConstraint = null;


        try {
            // InternalMyDsl.g:1585:57: (iv_ruleSafetyConstraint= ruleSafetyConstraint EOF )
            // InternalMyDsl.g:1586:2: iv_ruleSafetyConstraint= ruleSafetyConstraint EOF
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
    // InternalMyDsl.g:1592:1: ruleSafetyConstraint returns [EObject current=null] : (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'minBattery' otherlv_10= '=' ( (lv_minBattery_11_0= ruleFLOAT ) ) otherlv_12= 'maxWindSpeed' otherlv_13= '=' ( (lv_maxWindSpeed_14_0= ruleFLOAT ) ) otherlv_15= '}' ) ;
    public final EObject ruleSafetyConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_constraintType_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_minBattery_11_0 = null;

        AntlrDatatypeRuleToken lv_maxWindSpeed_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1598:2: ( (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'minBattery' otherlv_10= '=' ( (lv_minBattery_11_0= ruleFLOAT ) ) otherlv_12= 'maxWindSpeed' otherlv_13= '=' ( (lv_maxWindSpeed_14_0= ruleFLOAT ) ) otherlv_15= '}' ) )
            // InternalMyDsl.g:1599:2: (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'minBattery' otherlv_10= '=' ( (lv_minBattery_11_0= ruleFLOAT ) ) otherlv_12= 'maxWindSpeed' otherlv_13= '=' ( (lv_maxWindSpeed_14_0= ruleFLOAT ) ) otherlv_15= '}' )
            {
            // InternalMyDsl.g:1599:2: (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'minBattery' otherlv_10= '=' ( (lv_minBattery_11_0= ruleFLOAT ) ) otherlv_12= 'maxWindSpeed' otherlv_13= '=' ( (lv_maxWindSpeed_14_0= ruleFLOAT ) ) otherlv_15= '}' )
            // InternalMyDsl.g:1600:3: otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'minBattery' otherlv_10= '=' ( (lv_minBattery_11_0= ruleFLOAT ) ) otherlv_12= 'maxWindSpeed' otherlv_13= '=' ( (lv_maxWindSpeed_14_0= ruleFLOAT ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyConstraintAccess().getSafetyConstraintKeyword_0());
            		
            // InternalMyDsl.g:1604:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1605:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1605:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1606:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSafetyConstraintAccess().getConstraintTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1634:3: ( (lv_constraintType_5_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1635:4: (lv_constraintType_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1635:4: (lv_constraintType_5_0= RULE_STRING )
                    // InternalMyDsl.g:1636:5: lv_constraintType_5_0= RULE_STRING
                    {
                    lv_constraintType_5_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    					newLeafNode(lv_constraintType_5_0, grammarAccess.getSafetyConstraintAccess().getConstraintTypeSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSafetyConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"constraintType",
                    						lv_constraintType_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getSafetyConstraintAccess().getDescriptionKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_7, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1660:3: ( (lv_description_8_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1661:4: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1661:4: (lv_description_8_0= RULE_STRING )
                    // InternalMyDsl.g:1662:5: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    					newLeafNode(lv_description_8_0, grammarAccess.getSafetyConstraintAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSafetyConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_8_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getSafetyConstraintAccess().getMinBatteryKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1686:3: ( (lv_minBattery_11_0= ruleFLOAT ) )
            // InternalMyDsl.g:1687:4: (lv_minBattery_11_0= ruleFLOAT )
            {
            // InternalMyDsl.g:1687:4: (lv_minBattery_11_0= ruleFLOAT )
            // InternalMyDsl.g:1688:5: lv_minBattery_11_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getSafetyConstraintAccess().getMinBatteryFLOATParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_44);
            lv_minBattery_11_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyConstraintRule());
            					}
            					set(
            						current,
            						"minBattery",
            						lv_minBattery_11_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,55,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:1713:3: ( (lv_maxWindSpeed_14_0= ruleFLOAT ) )
            // InternalMyDsl.g:1714:4: (lv_maxWindSpeed_14_0= ruleFLOAT )
            {
            // InternalMyDsl.g:1714:4: (lv_maxWindSpeed_14_0= ruleFLOAT )
            // InternalMyDsl.g:1715:5: lv_maxWindSpeed_14_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedFLOATParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_30);
            lv_maxWindSpeed_14_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyConstraintRule());
            					}
            					set(
            						current,
            						"maxWindSpeed",
            						lv_maxWindSpeed_14_0,
            						"org.xtext.example.mydsl.MyDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSafetyConstraintAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalMyDsl.g:1740:1: entryRuleRegulatoryConstraint returns [EObject current=null] : iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF ;
    public final EObject entryRuleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegulatoryConstraint = null;


        try {
            // InternalMyDsl.g:1740:61: (iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:1741:2: iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF
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
    // InternalMyDsl.g:1747:1: ruleRegulatoryConstraint returns [EObject current=null] : (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'flightPermission' otherlv_10= '=' ( (lv_flightPermission_11_0= RULE_BOOLEAN ) ) otherlv_12= 'altitudeLimit' otherlv_13= '=' ( (lv_altitudeLimit_14_0= RULE_INT ) ) otherlv_15= '}' ) ;
    public final EObject ruleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_constraintType_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_flightPermission_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_altitudeLimit_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1753:2: ( (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'flightPermission' otherlv_10= '=' ( (lv_flightPermission_11_0= RULE_BOOLEAN ) ) otherlv_12= 'altitudeLimit' otherlv_13= '=' ( (lv_altitudeLimit_14_0= RULE_INT ) ) otherlv_15= '}' ) )
            // InternalMyDsl.g:1754:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'flightPermission' otherlv_10= '=' ( (lv_flightPermission_11_0= RULE_BOOLEAN ) ) otherlv_12= 'altitudeLimit' otherlv_13= '=' ( (lv_altitudeLimit_14_0= RULE_INT ) ) otherlv_15= '}' )
            {
            // InternalMyDsl.g:1754:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'flightPermission' otherlv_10= '=' ( (lv_flightPermission_11_0= RULE_BOOLEAN ) ) otherlv_12= 'altitudeLimit' otherlv_13= '=' ( (lv_altitudeLimit_14_0= RULE_INT ) ) otherlv_15= '}' )
            // InternalMyDsl.g:1755:3: otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'constraintType' otherlv_4= '=' ( (lv_constraintType_5_0= RULE_STRING ) )? otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )? otherlv_9= 'flightPermission' otherlv_10= '=' ( (lv_flightPermission_11_0= RULE_BOOLEAN ) ) otherlv_12= 'altitudeLimit' otherlv_13= '=' ( (lv_altitudeLimit_14_0= RULE_INT ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0());
            		
            // InternalMyDsl.g:1759:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1760:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1760:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1761:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRegulatoryConstraintAccess().getConstraintTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1789:3: ( (lv_constraintType_5_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1790:4: (lv_constraintType_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1790:4: (lv_constraintType_5_0= RULE_STRING )
                    // InternalMyDsl.g:1791:5: lv_constraintType_5_0= RULE_STRING
                    {
                    lv_constraintType_5_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    					newLeafNode(lv_constraintType_5_0, grammarAccess.getRegulatoryConstraintAccess().getConstraintTypeSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"constraintType",
                    						lv_constraintType_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRegulatoryConstraintAccess().getDescriptionKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_45); 

            			newLeafNode(otherlv_7, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1815:3: ( (lv_description_8_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1816:4: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1816:4: (lv_description_8_0= RULE_STRING )
                    // InternalMyDsl.g:1817:5: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

                    					newLeafNode(lv_description_8_0, grammarAccess.getRegulatoryConstraintAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_8_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,57,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_47); 

            			newLeafNode(otherlv_10, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1841:3: ( (lv_flightPermission_11_0= RULE_BOOLEAN ) )
            // InternalMyDsl.g:1842:4: (lv_flightPermission_11_0= RULE_BOOLEAN )
            {
            // InternalMyDsl.g:1842:4: (lv_flightPermission_11_0= RULE_BOOLEAN )
            // InternalMyDsl.g:1843:5: lv_flightPermission_11_0= RULE_BOOLEAN
            {
            lv_flightPermission_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_48); 

            					newLeafNode(lv_flightPermission_11_0, grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionBOOLEANTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"flightPermission",
            						lv_flightPermission_11_0,
            						"org.xtext.example.mydsl.MyDsl.BOOLEAN");
            				

            }


            }

            otherlv_12=(Token)match(input,58,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:1867:3: ( (lv_altitudeLimit_14_0= RULE_INT ) )
            // InternalMyDsl.g:1868:4: (lv_altitudeLimit_14_0= RULE_INT )
            {
            // InternalMyDsl.g:1868:4: (lv_altitudeLimit_14_0= RULE_INT )
            // InternalMyDsl.g:1869:5: lv_altitudeLimit_14_0= RULE_INT
            {
            lv_altitudeLimit_14_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_altitudeLimit_14_0, grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitINTTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"altitudeLimit",
            						lv_altitudeLimit_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRegulatoryConstraintAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalMyDsl.g:1893:1: entryRuleMissionEvent returns [EObject current=null] : iv_ruleMissionEvent= ruleMissionEvent EOF ;
    public final EObject entryRuleMissionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionEvent = null;


        try {
            // InternalMyDsl.g:1893:53: (iv_ruleMissionEvent= ruleMissionEvent EOF )
            // InternalMyDsl.g:1894:2: iv_ruleMissionEvent= ruleMissionEvent EOF
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
    // InternalMyDsl.g:1900:1: ruleMissionEvent returns [EObject current=null] : (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1906:2: ( (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1907:2: (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1907:2: (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1908:3: otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionEventAccess().getMissionEventKeyword_0());
            		
            // InternalMyDsl.g:1912:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1913:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1913:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1914:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionEventAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,60,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionEventAccess().getEventTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1942:3: ( (lv_eventType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1943:4: (lv_eventType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1943:4: (lv_eventType_5_0= RULE_STRING )
            // InternalMyDsl.g:1944:5: lv_eventType_5_0= RULE_STRING
            {
            lv_eventType_5_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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

            otherlv_6=(Token)match(input,61,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionEventAccess().getImpactLevelKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1968:3: ( (lv_impactLevel_8_0= RULE_INT ) )
            // InternalMyDsl.g:1969:4: (lv_impactLevel_8_0= RULE_INT )
            {
            // InternalMyDsl.g:1969:4: (lv_impactLevel_8_0= RULE_INT )
            // InternalMyDsl.g:1970:5: lv_impactLevel_8_0= RULE_INT
            {
            lv_impactLevel_8_0=(Token)match(input,RULE_INT,FOLLOW_51); 

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

            otherlv_9=(Token)match(input,62,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionEventAccess().getResponseActionKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1994:3: ( (lv_responseAction_11_0= RULE_STRING ) )
            // InternalMyDsl.g:1995:4: (lv_responseAction_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:1995:4: (lv_responseAction_11_0= RULE_STRING )
            // InternalMyDsl.g:1996:5: lv_responseAction_11_0= RULE_STRING
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


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:2020:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:2020:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:2021:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:2027:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_type_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2033:2: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:2034:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:2034:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalMyDsl.g:2035:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:2039:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2040:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2040:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2041:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:2069:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:2070:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:2070:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:2071:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getFromEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getToKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:2090:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:2091:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:2091:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:2092:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToEntityCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getTypeKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:2111:3: ( (lv_type_11_0= RULE_STRING ) )
            // InternalMyDsl.g:2112:4: (lv_type_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:2112:4: (lv_type_11_0= RULE_STRING )
            // InternalMyDsl.g:2113:5: lv_type_11_0= RULE_STRING
            {
            lv_type_11_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_type_11_0, grammarAccess.getRelationAccess().getTypeSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMyDsl.g:2137:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalMyDsl.g:2137:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMyDsl.g:2138:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMyDsl.g:2144:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2150:2: ( (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? ) )
            // InternalMyDsl.g:2151:2: (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? )
            {
            // InternalMyDsl.g:2151:2: (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )? )
            // InternalMyDsl.g:2152:3: this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_55); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,67,FOLLOW_56); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            // InternalMyDsl.g:2164:3: (this_INT_2= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2165:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleFLOAT"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\u00cb\uffff";
    static final String dfa_2s = "\1\1\u00ca\uffff";
    static final String dfa_3s = "\1\15\1\uffff\12\4\12\16\1\17\1\35\1\44\1\50\1\54\1\60\3\63\1\74\12\20\2\5\1\6\7\5\1\21\1\36\1\103\1\51\1\55\1\61\2\64\1\20\1\64\1\20\1\75\2\20\1\6\4\20\2\5\1\20\1\5\1\6\1\45\1\20\2\6\2\5\1\66\1\20\1\71\1\20\1\6\1\22\1\103\1\6\2\103\1\51\1\33\1\6\1\7\1\76\1\20\1\6\1\103\2\6\1\20\1\uffff\1\103\1\72\1\20\1\5\1\37\1\20\1\6\1\52\1\20\1\56\1\20\2\6\1\20\1\5\1\23\1\6\1\46\1\20\2\4\1\103\1\67\1\20\1\6\1\33\1\20\1\103\1\6\2\27\2\6\1\33\1\uffff\1\5\1\6\1\103\1\4\1\uffff\1\4\1\uffff\1\33\1\uffff\1\103\1\uffff\1\24\1\40\1\20\1\6\2\27\1\6\1\20\1\6\1\33\1\uffff\1\33\1\uffff\1\6\1\103\1\25\1\6\1\20\1\41\1\20\1\6\1\5\1\103\1\42\1\6\1\20\1\26\1\20\2\4\2\27\1\4\1\uffff\1\4\1\20\2\27\1\4\1\27\1\4\1\20\1\27\1\4\1\27\1\4\1\20\1\27\1\4\1\27\1\4\1\uffff\1\27";
    static final String dfa_4s = "\1\77\1\uffff\12\4\12\16\1\17\1\35\1\44\1\50\1\54\1\60\3\63\1\74\12\20\2\5\1\6\4\5\2\64\1\5\1\21\1\36\1\103\1\51\1\55\1\61\2\64\1\20\1\64\1\20\1\75\2\20\1\45\4\20\1\66\1\71\1\20\1\5\1\6\1\45\1\20\2\6\2\5\1\66\1\20\1\71\1\20\1\6\1\22\1\103\1\6\2\103\1\51\1\33\1\6\1\7\1\76\1\20\1\37\1\103\1\52\1\56\1\20\1\uffff\1\103\1\72\1\20\1\5\1\37\1\20\1\46\1\52\1\20\1\56\1\20\1\6\1\67\1\20\1\5\1\23\1\6\1\46\1\20\2\4\1\103\1\67\1\20\1\6\1\33\1\20\1\103\1\6\3\33\1\6\1\33\1\uffff\1\5\1\40\1\103\1\4\1\uffff\1\4\1\uffff\1\33\1\uffff\1\103\1\uffff\1\24\1\40\1\20\4\33\1\20\1\6\1\33\1\uffff\1\33\1\uffff\1\6\1\103\1\25\1\41\1\20\1\41\1\20\1\6\1\5\1\103\1\42\1\26\1\20\1\26\1\20\2\4\1\33\1\30\1\4\1\uffff\1\4\1\20\1\33\1\30\1\4\1\31\1\4\1\20\1\31\1\4\1\32\1\4\1\20\1\32\1\4\1\33\1\4\1\uffff\1\33";
    static final String dfa_5s = "\1\uffff\1\2\145\uffff\1\1\42\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\12\uffff\1\1\1\uffff\1\1\24\uffff\1\1\21\uffff\1\1\1\uffff";
    static final String dfa_6s = "\u00cb\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\16\uffff\1\3\6\uffff\1\4\3\uffff\1\5\3\uffff\1\6\3\uffff\1\7\2\uffff\1\10\2\uffff\1\11\2\uffff\1\12\2\uffff\1\13\3\uffff\1\1",
            "",
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
            "\1\73\56\uffff\1\74",
            "\1\75\56\uffff\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\74",
            "\1\107",
            "\1\76",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114\36\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122\60\uffff\1\123",
            "\1\124\63\uffff\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\115",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\123",
            "\1\136",
            "\1\125",
            "\1\137",
            "\1\140",
            "\1\141",
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
            "\1\154\30\uffff\1\155",
            "\1\156",
            "\1\157\43\uffff\1\160",
            "\1\161\47\uffff\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\155",
            "\1\170",
            "\1\171\37\uffff\1\172",
            "\1\160",
            "\1\173",
            "\1\162",
            "\1\174",
            "\1\175",
            "\1\176\60\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\172",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\177",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\3\uffff\1\u008f",
            "\1\u0090\3\uffff\1\u0091",
            "\1\u0092\24\uffff\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097\31\uffff\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "",
            "\1\u0093",
            "",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u0098",
            "\1\u009e",
            "\1\u009f\24\uffff\1\u00a0",
            "\1\u008e\3\uffff\1\u008f",
            "\1\u0090\3\uffff\1\u0091",
            "\1\u00a1\24\uffff\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a0",
            "",
            "\1\u00a2",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\32\uffff\1\u00a9",
            "\1\u00aa",
            "\1\u00a9",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0\17\uffff\1\u00b1",
            "\1\u00b2",
            "\1\u00b1",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\3\uffff\1\u00b7",
            "\1\u00b8\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00b6\3\uffff\1\u00b7",
            "\1\u00b8\1\u00b9",
            "\1\u00bd",
            "\1\u00be\1\uffff\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00be\1\uffff\1\u00bf",
            "\1\u00c2",
            "\1\u00c3\2\uffff\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c3\2\uffff\1\u00c4",
            "\1\u00c7",
            "\1\u00c8\3\uffff\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00c8\3\uffff\1\u00c9"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 177:3: ( (lv_entities_2_0= ruleEntity ) )*";
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\1\1\16\uffff";
    static final String dfa_10s = "\1\15\1\uffff\1\4\1\16\1\100\1\20\1\4\1\101\1\20\1\4\1\102\1\20\1\5\1\33\1\uffff";
    static final String dfa_11s = "\1\77\1\uffff\1\4\1\16\1\100\1\20\1\4\1\101\1\20\1\4\1\102\1\20\1\5\1\33\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_13s = "\17\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\16\uffff\1\1\6\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\uffff\1\1\3\uffff\1\2",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 196:3: ( (lv_relations_3_0= ruleRelation ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8924888810002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
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
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000042L});

}