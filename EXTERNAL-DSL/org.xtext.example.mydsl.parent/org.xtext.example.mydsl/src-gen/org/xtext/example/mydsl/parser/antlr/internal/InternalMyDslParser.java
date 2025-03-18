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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'Relation'", "'from'", "'='", "'to'", "'type'", "'Mission'", "'missionID'", "'missionType'", "'startLocation'", "'endLocation'", "'priority'", "'estimatedTime'", "'addDrone'", "','", "'addPhase'", "'addConstraint'", "'addEvent'", "'Drone'", "'modelType'", "'batterCapacity'", "'maxFlightTime'", "'payloadCapacity'", "'role'", "'addEnergyModel'", "'EnergyModel'", "'consumptionRate'", "'batteryHealth'", "'rechargeTime'", "'Phase'", "'phaseType'", "'energyUsage'", "'addSubPhase'", "'SubPhase'", "'subPhaseType'", "'duration'", "'addAction'", "'Action'", "'actionType'", "'inputOutput'", "'SafetyConstraint'", "'minBattery'", "'maxWindSpeed'", "'RegulatoryConstraint'", "'flightPermission'", "'altitudeLimit'", "'MissionEvent'", "'eventType'", "'impactLevel'", "'responseAction'"
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
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
        	return "SystemRoot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemRoot"
    // InternalMyDsl.g:64:1: entryRuleSystemRoot returns [EObject current=null] : iv_ruleSystemRoot= ruleSystemRoot EOF ;
    public final EObject entryRuleSystemRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRoot = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleSystemRoot= ruleSystemRoot EOF )
            // InternalMyDsl.g:65:2: iv_ruleSystemRoot= ruleSystemRoot EOF
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
    // InternalMyDsl.g:71:1: ruleSystemRoot returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relation_4_0= ruleRelation ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystemRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_entities_3_0 = null;

        EObject lv_relation_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relation_4_0= ruleRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relation_4_0= ruleRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relation_4_0= ruleRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relation_4_0= ruleRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemRootAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemRootAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:105:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21||LA1_0==33||LA1_0==40||LA1_0==44||LA1_0==48||LA1_0==52||LA1_0==55||LA1_0==58||LA1_0==61) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:106:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:106:4: (lv_entities_3_0= ruleEntity )
            	    // InternalMyDsl.g:107:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRootAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:124:3: ( (lv_relation_4_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:125:4: (lv_relation_4_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:125:4: (lv_relation_4_0= ruleRelation )
            	    // InternalMyDsl.g:126:5: lv_relation_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRootAccess().getRelationRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_relation_4_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relation",
            	    						lv_relation_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemRootAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:151:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:151:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:152:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:158:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:164:2: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:165:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:165:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalMyDsl.g:166:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:200:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:201:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:201:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:202:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getFromEntityEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getToKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:221:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:222:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:222:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:223:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToEntityEntityCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getTypeKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:242:3: ( (lv_type_11_0= RULE_STRING ) )
            // InternalMyDsl.g:243:4: (lv_type_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:243:4: (lv_type_11_0= RULE_STRING )
            // InternalMyDsl.g:244:5: lv_type_11_0= RULE_STRING
            {
            lv_type_11_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:268:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:268:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:269:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:275:1: ruleEntity returns [EObject current=null] : (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_Constraint_6= ruleConstraint | this_MissionEvent_7= ruleMissionEvent ) ;
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
            // InternalMyDsl.g:281:2: ( (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_Constraint_6= ruleConstraint | this_MissionEvent_7= ruleMissionEvent ) )
            // InternalMyDsl.g:282:2: (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_Constraint_6= ruleConstraint | this_MissionEvent_7= ruleMissionEvent )
            {
            // InternalMyDsl.g:282:2: (this_Mission_0= ruleMission | this_Drone_1= ruleDrone | this_EnergyModel_2= ruleEnergyModel | this_Phase_3= rulePhase | this_SubPhase_4= ruleSubPhase | this_Action_5= ruleAction | this_Constraint_6= ruleConstraint | this_MissionEvent_7= ruleMissionEvent )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 44:
                {
                alt3=4;
                }
                break;
            case 48:
                {
                alt3=5;
                }
                break;
            case 52:
                {
                alt3=6;
                }
                break;
            case 55:
            case 58:
                {
                alt3=7;
                }
                break;
            case 61:
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
                    // InternalMyDsl.g:283:3: this_Mission_0= ruleMission
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
                    // InternalMyDsl.g:292:3: this_Drone_1= ruleDrone
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
                    // InternalMyDsl.g:301:3: this_EnergyModel_2= ruleEnergyModel
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
                    // InternalMyDsl.g:310:3: this_Phase_3= rulePhase
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
                    // InternalMyDsl.g:319:3: this_SubPhase_4= ruleSubPhase
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
                    // InternalMyDsl.g:328:3: this_Action_5= ruleAction
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
                    // InternalMyDsl.g:337:3: this_Constraint_6= ruleConstraint
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
                    // InternalMyDsl.g:346:3: this_MissionEvent_7= ruleMissionEvent
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
    // InternalMyDsl.g:358:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:358:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:359:2: iv_ruleMission= ruleMission EOF
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
    // InternalMyDsl.g:365:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_missionID_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_missionID_5_0=null;
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
            // InternalMyDsl.g:371:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_missionID_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' ) )
            // InternalMyDsl.g:372:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_missionID_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' )
            {
            // InternalMyDsl.g:372:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_missionID_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}' )
            // InternalMyDsl.g:373:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'missionID' otherlv_4= '=' ( (lv_missionID_5_0= RULE_STRING ) ) otherlv_6= 'missionType' otherlv_7= '=' ( (lv_missionType_8_0= RULE_STRING ) ) otherlv_9= 'startLocation' otherlv_10= '=' ( (lv_startLocation_11_0= RULE_STRING ) ) otherlv_12= 'endLocation' otherlv_13= '=' ( (lv_endLocation_14_0= RULE_STRING ) ) otherlv_15= 'priority' otherlv_16= '=' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'estimatedTime' otherlv_19= '=' ( (lv_estimatedTime_20_0= RULE_FLOAT ) ) otherlv_21= 'addDrone' otherlv_22= '=' ( (otherlv_23= RULE_ID ) ) (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= 'addPhase' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )* otherlv_31= 'addConstraint' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= 'addEvent' otherlv_37= '=' ( (otherlv_38= RULE_ID ) ) (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )* otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalMyDsl.g:377:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:378:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:378:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:379:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getMissionIDKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:407:3: ( (lv_missionID_5_0= RULE_STRING ) )
            // InternalMyDsl.g:408:4: (lv_missionID_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:408:4: (lv_missionID_5_0= RULE_STRING )
            // InternalMyDsl.g:409:5: lv_missionID_5_0= RULE_STRING
            {
            lv_missionID_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_missionID_5_0, grammarAccess.getMissionAccess().getMissionIDSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"missionID",
            						lv_missionID_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getMissionTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:433:3: ( (lv_missionType_8_0= RULE_STRING ) )
            // InternalMyDsl.g:434:4: (lv_missionType_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:434:4: (lv_missionType_8_0= RULE_STRING )
            // InternalMyDsl.g:435:5: lv_missionType_8_0= RULE_STRING
            {
            lv_missionType_8_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_9=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getStartLocationKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:459:3: ( (lv_startLocation_11_0= RULE_STRING ) )
            // InternalMyDsl.g:460:4: (lv_startLocation_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:460:4: (lv_startLocation_11_0= RULE_STRING )
            // InternalMyDsl.g:461:5: lv_startLocation_11_0= RULE_STRING
            {
            lv_startLocation_11_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_12=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getEndLocationKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:485:3: ( (lv_endLocation_14_0= RULE_STRING ) )
            // InternalMyDsl.g:486:4: (lv_endLocation_14_0= RULE_STRING )
            {
            // InternalMyDsl.g:486:4: (lv_endLocation_14_0= RULE_STRING )
            // InternalMyDsl.g:487:5: lv_endLocation_14_0= RULE_STRING
            {
            lv_endLocation_14_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_15=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getPriorityKeyword_15());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:511:3: ( (lv_priority_17_0= RULE_INT ) )
            // InternalMyDsl.g:512:4: (lv_priority_17_0= RULE_INT )
            {
            // InternalMyDsl.g:512:4: (lv_priority_17_0= RULE_INT )
            // InternalMyDsl.g:513:5: lv_priority_17_0= RULE_INT
            {
            lv_priority_17_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            otherlv_18=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getEstimatedTimeKeyword_18());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getEqualsSignKeyword_19());
            		
            // InternalMyDsl.g:537:3: ( (lv_estimatedTime_20_0= RULE_FLOAT ) )
            // InternalMyDsl.g:538:4: (lv_estimatedTime_20_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:538:4: (lv_estimatedTime_20_0= RULE_FLOAT )
            // InternalMyDsl.g:539:5: lv_estimatedTime_20_0= RULE_FLOAT
            {
            lv_estimatedTime_20_0=(Token)match(input,RULE_FLOAT,FOLLOW_21); 

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

            otherlv_21=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_21, grammarAccess.getMissionAccess().getAddDroneKeyword_21());
            		
            otherlv_22=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getEqualsSignKeyword_22());
            		
            // InternalMyDsl.g:563:3: ( (otherlv_23= RULE_ID ) )
            // InternalMyDsl.g:564:4: (otherlv_23= RULE_ID )
            {
            // InternalMyDsl.g:564:4: (otherlv_23= RULE_ID )
            // InternalMyDsl.g:565:5: otherlv_23= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_23, grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_23_0());
            				

            }


            }

            // InternalMyDsl.g:576:3: (otherlv_24= ',' ( (otherlv_25= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:577:4: otherlv_24= ',' ( (otherlv_25= RULE_ID ) )
            	    {
            	    otherlv_24=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getCommaKeyword_24_0());
            	    			
            	    // InternalMyDsl.g:581:4: ( (otherlv_25= RULE_ID ) )
            	    // InternalMyDsl.g:582:5: (otherlv_25= RULE_ID )
            	    {
            	    // InternalMyDsl.g:582:5: (otherlv_25= RULE_ID )
            	    // InternalMyDsl.g:583:6: otherlv_25= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_25, grammarAccess.getMissionAccess().getAddDronesDroneCrossReference_24_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_26=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_26, grammarAccess.getMissionAccess().getAddPhaseKeyword_25());
            		
            otherlv_27=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getMissionAccess().getEqualsSignKeyword_26());
            		
            // InternalMyDsl.g:603:3: ( (otherlv_28= RULE_ID ) )
            // InternalMyDsl.g:604:4: (otherlv_28= RULE_ID )
            {
            // InternalMyDsl.g:604:4: (otherlv_28= RULE_ID )
            // InternalMyDsl.g:605:5: otherlv_28= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_28, grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_27_0());
            				

            }


            }

            // InternalMyDsl.g:616:3: (otherlv_29= ',' ( (otherlv_30= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:617:4: otherlv_29= ',' ( (otherlv_30= RULE_ID ) )
            	    {
            	    otherlv_29=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_29, grammarAccess.getMissionAccess().getCommaKeyword_28_0());
            	    			
            	    // InternalMyDsl.g:621:4: ( (otherlv_30= RULE_ID ) )
            	    // InternalMyDsl.g:622:5: (otherlv_30= RULE_ID )
            	    {
            	    // InternalMyDsl.g:622:5: (otherlv_30= RULE_ID )
            	    // InternalMyDsl.g:623:6: otherlv_30= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_30, grammarAccess.getMissionAccess().getAddPhasesPhaseCrossReference_28_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_31=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_31, grammarAccess.getMissionAccess().getAddConstraintKeyword_29());
            		
            otherlv_32=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_32, grammarAccess.getMissionAccess().getEqualsSignKeyword_30());
            		
            // InternalMyDsl.g:643:3: ( (otherlv_33= RULE_ID ) )
            // InternalMyDsl.g:644:4: (otherlv_33= RULE_ID )
            {
            // InternalMyDsl.g:644:4: (otherlv_33= RULE_ID )
            // InternalMyDsl.g:645:5: otherlv_33= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_33=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_33, grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_31_0());
            				

            }


            }

            // InternalMyDsl.g:656:3: (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:657:4: otherlv_34= ',' ( (otherlv_35= RULE_ID ) )
            	    {
            	    otherlv_34=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_34, grammarAccess.getMissionAccess().getCommaKeyword_32_0());
            	    			
            	    // InternalMyDsl.g:661:4: ( (otherlv_35= RULE_ID ) )
            	    // InternalMyDsl.g:662:5: (otherlv_35= RULE_ID )
            	    {
            	    // InternalMyDsl.g:662:5: (otherlv_35= RULE_ID )
            	    // InternalMyDsl.g:663:6: otherlv_35= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_35=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_35, grammarAccess.getMissionAccess().getAddConstraintsConstraintCrossReference_32_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_36=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_36, grammarAccess.getMissionAccess().getAddEventKeyword_33());
            		
            otherlv_37=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_37, grammarAccess.getMissionAccess().getEqualsSignKeyword_34());
            		
            // InternalMyDsl.g:683:3: ( (otherlv_38= RULE_ID ) )
            // InternalMyDsl.g:684:4: (otherlv_38= RULE_ID )
            {
            // InternalMyDsl.g:684:4: (otherlv_38= RULE_ID )
            // InternalMyDsl.g:685:5: otherlv_38= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_38=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_38, grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_35_0());
            				

            }


            }

            // InternalMyDsl.g:696:3: (otherlv_39= ',' ( (otherlv_40= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:697:4: otherlv_39= ',' ( (otherlv_40= RULE_ID ) )
            	    {
            	    otherlv_39=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_39, grammarAccess.getMissionAccess().getCommaKeyword_36_0());
            	    			
            	    // InternalMyDsl.g:701:4: ( (otherlv_40= RULE_ID ) )
            	    // InternalMyDsl.g:702:5: (otherlv_40= RULE_ID )
            	    {
            	    // InternalMyDsl.g:702:5: (otherlv_40= RULE_ID )
            	    // InternalMyDsl.g:703:6: otherlv_40= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_40=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_40, grammarAccess.getMissionAccess().getAddEventsMissionEventCrossReference_36_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_41=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:723:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalMyDsl.g:723:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalMyDsl.g:724:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalMyDsl.g:730:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_modelType_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_modelType_5_0=null;
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
            // InternalMyDsl.g:736:2: ( (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_modelType_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' ) )
            // InternalMyDsl.g:737:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_modelType_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' )
            {
            // InternalMyDsl.g:737:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_modelType_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}' )
            // InternalMyDsl.g:738:3: otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'modelType' otherlv_4= '=' ( (lv_modelType_5_0= RULE_STRING ) ) otherlv_6= 'batterCapacity' otherlv_7= '=' ( (lv_batterCapacity_8_0= RULE_FLOAT ) ) otherlv_9= 'maxFlightTime' otherlv_10= '=' ( (lv_maxFlightTime_11_0= RULE_FLOAT ) ) otherlv_12= 'payloadCapacity' otherlv_13= '=' ( (lv_payloadCapacity_14_0= RULE_FLOAT ) ) otherlv_15= 'role' otherlv_16= '=' ( (lv_role_17_0= RULE_STRING ) ) otherlv_18= 'addEnergyModel' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )* otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            // InternalMyDsl.g:742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:743:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:744:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getModelTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:772:3: ( (lv_modelType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:773:4: (lv_modelType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:773:4: (lv_modelType_5_0= RULE_STRING )
            // InternalMyDsl.g:774:5: lv_modelType_5_0= RULE_STRING
            {
            lv_modelType_5_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_modelType_5_0, grammarAccess.getDroneAccess().getModelTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modelType",
            						lv_modelType_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getBatterCapacityKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:798:3: ( (lv_batterCapacity_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:799:4: (lv_batterCapacity_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:799:4: (lv_batterCapacity_8_0= RULE_FLOAT )
            // InternalMyDsl.g:800:5: lv_batterCapacity_8_0= RULE_FLOAT
            {
            lv_batterCapacity_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_28); 

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

            otherlv_9=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneAccess().getMaxFlightTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getDroneAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:824:3: ( (lv_maxFlightTime_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:825:4: (lv_maxFlightTime_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:825:4: (lv_maxFlightTime_11_0= RULE_FLOAT )
            // InternalMyDsl.g:826:5: lv_maxFlightTime_11_0= RULE_FLOAT
            {
            lv_maxFlightTime_11_0=(Token)match(input,RULE_FLOAT,FOLLOW_29); 

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

            otherlv_12=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getDroneAccess().getPayloadCapacityKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getDroneAccess().getEqualsSignKeyword_13());
            		
            // InternalMyDsl.g:850:3: ( (lv_payloadCapacity_14_0= RULE_FLOAT ) )
            // InternalMyDsl.g:851:4: (lv_payloadCapacity_14_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:851:4: (lv_payloadCapacity_14_0= RULE_FLOAT )
            // InternalMyDsl.g:852:5: lv_payloadCapacity_14_0= RULE_FLOAT
            {
            lv_payloadCapacity_14_0=(Token)match(input,RULE_FLOAT,FOLLOW_30); 

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

            otherlv_15=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getDroneAccess().getRoleKeyword_15());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getDroneAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:876:3: ( (lv_role_17_0= RULE_STRING ) )
            // InternalMyDsl.g:877:4: (lv_role_17_0= RULE_STRING )
            {
            // InternalMyDsl.g:877:4: (lv_role_17_0= RULE_STRING )
            // InternalMyDsl.g:878:5: lv_role_17_0= RULE_STRING
            {
            lv_role_17_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            otherlv_18=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_18, grammarAccess.getDroneAccess().getAddEnergyModelKeyword_18());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getDroneAccess().getEqualsSignKeyword_19());
            		
            // InternalMyDsl.g:902:3: ( (otherlv_20= RULE_ID ) )
            // InternalMyDsl.g:903:4: (otherlv_20= RULE_ID )
            {
            // InternalMyDsl.g:903:4: (otherlv_20= RULE_ID )
            // InternalMyDsl.g:904:5: otherlv_20= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            				
            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_20, grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_20_0());
            				

            }


            }

            // InternalMyDsl.g:915:3: (otherlv_21= ',' ( (otherlv_22= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:916:4: otherlv_21= ',' ( (otherlv_22= RULE_ID ) )
            	    {
            	    otherlv_21=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_21, grammarAccess.getDroneAccess().getCommaKeyword_21_0());
            	    			
            	    // InternalMyDsl.g:920:4: ( (otherlv_22= RULE_ID ) )
            	    // InternalMyDsl.g:921:5: (otherlv_22= RULE_ID )
            	    {
            	    // InternalMyDsl.g:921:5: (otherlv_22= RULE_ID )
            	    // InternalMyDsl.g:922:6: otherlv_22= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDroneRule());
            	    						}
            	    					
            	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_22, grammarAccess.getDroneAccess().getAddEnergyModelEnergyModelCrossReference_21_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_23=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:942:1: entryRuleEnergyModel returns [EObject current=null] : iv_ruleEnergyModel= ruleEnergyModel EOF ;
    public final EObject entryRuleEnergyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnergyModel = null;


        try {
            // InternalMyDsl.g:942:52: (iv_ruleEnergyModel= ruleEnergyModel EOF )
            // InternalMyDsl.g:943:2: iv_ruleEnergyModel= ruleEnergyModel EOF
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
    // InternalMyDsl.g:949:1: ruleEnergyModel returns [EObject current=null] : (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:955:2: ( (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:956:2: (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:956:2: (otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            // InternalMyDsl.g:957:3: otherlv_0= 'EnergyModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'consumptionRate' otherlv_4= '=' ( (lv_consumptionRate_5_0= RULE_FLOAT ) ) otherlv_6= 'batteryHealth' otherlv_7= '=' ( (lv_batteryHealth_8_0= RULE_FLOAT ) ) otherlv_9= 'rechargeTime' otherlv_10= '=' ( (lv_rechargeTime_11_0= RULE_FLOAT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnergyModelAccess().getEnergyModelKeyword_0());
            		
            // InternalMyDsl.g:961:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:962:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:962:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:963:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getEnergyModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEnergyModelAccess().getConsumptionRateKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:991:3: ( (lv_consumptionRate_5_0= RULE_FLOAT ) )
            // InternalMyDsl.g:992:4: (lv_consumptionRate_5_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:992:4: (lv_consumptionRate_5_0= RULE_FLOAT )
            // InternalMyDsl.g:993:5: lv_consumptionRate_5_0= RULE_FLOAT
            {
            lv_consumptionRate_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_33); 

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

            otherlv_6=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getEnergyModelAccess().getBatteryHealthKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1017:3: ( (lv_batteryHealth_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1018:4: (lv_batteryHealth_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1018:4: (lv_batteryHealth_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1019:5: lv_batteryHealth_8_0= RULE_FLOAT
            {
            lv_batteryHealth_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_34); 

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

            otherlv_9=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getEnergyModelAccess().getRechargeTimeKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getEnergyModelAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1043:3: ( (lv_rechargeTime_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1044:4: (lv_rechargeTime_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1044:4: (lv_rechargeTime_11_0= RULE_FLOAT )
            // InternalMyDsl.g:1045:5: lv_rechargeTime_11_0= RULE_FLOAT
            {
            lv_rechargeTime_11_0=(Token)match(input,RULE_FLOAT,FOLLOW_12); 

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

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1069:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalMyDsl.g:1069:46: (iv_rulePhase= rulePhase EOF )
            // InternalMyDsl.g:1070:2: iv_rulePhase= rulePhase EOF
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
    // InternalMyDsl.g:1076:1: rulePhase returns [EObject current=null] : (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) ;
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
            // InternalMyDsl.g:1082:2: ( (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) )
            // InternalMyDsl.g:1083:2: (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            {
            // InternalMyDsl.g:1083:2: (otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            // InternalMyDsl.g:1084:3: otherlv_0= 'Phase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phaseType' otherlv_4= '=' ( (lv_phaseType_5_0= RULE_STRING ) ) otherlv_6= 'energyUsage' otherlv_7= '=' ( (lv_energyUsage_8_0= RULE_FLOAT ) ) otherlv_9= 'addSubPhase' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhaseAccess().getPhaseKeyword_0());
            		
            // InternalMyDsl.g:1088:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1089:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1089:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1090:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getPhaseTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getPhaseAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1118:3: ( (lv_phaseType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1119:4: (lv_phaseType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1119:4: (lv_phaseType_5_0= RULE_STRING )
            // InternalMyDsl.g:1120:5: lv_phaseType_5_0= RULE_STRING
            {
            lv_phaseType_5_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            otherlv_6=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPhaseAccess().getEnergyUsageKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getPhaseAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1144:3: ( (lv_energyUsage_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1145:4: (lv_energyUsage_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1145:4: (lv_energyUsage_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1146:5: lv_energyUsage_8_0= RULE_FLOAT
            {
            lv_energyUsage_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_37); 

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

            otherlv_9=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getPhaseAccess().getAddSubPhaseKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getPhaseAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1170:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1171:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1171:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1172:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_11, grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:1183:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1184:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_12, grammarAccess.getPhaseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:1188:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:1189:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1189:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:1190:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPhaseRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_13, grammarAccess.getPhaseAccess().getAddSubPhaseSubPhaseCrossReference_12_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1210:1: entryRuleSubPhase returns [EObject current=null] : iv_ruleSubPhase= ruleSubPhase EOF ;
    public final EObject entryRuleSubPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPhase = null;


        try {
            // InternalMyDsl.g:1210:49: (iv_ruleSubPhase= ruleSubPhase EOF )
            // InternalMyDsl.g:1211:2: iv_ruleSubPhase= ruleSubPhase EOF
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
    // InternalMyDsl.g:1217:1: ruleSubPhase returns [EObject current=null] : (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) ;
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
            // InternalMyDsl.g:1223:2: ( (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' ) )
            // InternalMyDsl.g:1224:2: (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            {
            // InternalMyDsl.g:1224:2: (otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}' )
            // InternalMyDsl.g:1225:3: otherlv_0= 'SubPhase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'subPhaseType' otherlv_4= '=' ( (lv_subPhaseType_5_0= RULE_STRING ) ) otherlv_6= 'duration' otherlv_7= '=' ( (lv_duration_8_0= RULE_FLOAT ) ) otherlv_9= 'addAction' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubPhaseAccess().getSubPhaseKeyword_0());
            		
            // InternalMyDsl.g:1229:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1230:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1230:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1231:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSubPhaseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSubPhaseAccess().getSubPhaseTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1259:3: ( (lv_subPhaseType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1260:4: (lv_subPhaseType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1260:4: (lv_subPhaseType_5_0= RULE_STRING )
            // InternalMyDsl.g:1261:5: lv_subPhaseType_5_0= RULE_STRING
            {
            lv_subPhaseType_5_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            otherlv_6=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getSubPhaseAccess().getDurationKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1285:3: ( (lv_duration_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1286:4: (lv_duration_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1286:4: (lv_duration_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1287:5: lv_duration_8_0= RULE_FLOAT
            {
            lv_duration_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_40); 

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

            otherlv_9=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getSubPhaseAccess().getAddActionKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getSubPhaseAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1311:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1312:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1312:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1313:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubPhaseRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_11, grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:1324:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1325:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSubPhaseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:1329:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:1330:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1330:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:1331:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSubPhaseRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_13, grammarAccess.getSubPhaseAccess().getAddActionActionCrossReference_12_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1351:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:1351:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:1352:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:1358:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1364:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1365:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1365:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1366:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actionType' otherlv_4= '=' ( (lv_actionType_5_0= RULE_STRING ) ) otherlv_6= 'inputOutput' otherlv_7= '=' ( (lv_inputOutput_8_0= RULE_STRING ) ) otherlv_9= 'energyUsage' otherlv_10= '=' ( (lv_energyUsage_11_0= RULE_FLOAT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:1370:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1371:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1371:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1372:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getActionTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1400:3: ( (lv_actionType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1401:4: (lv_actionType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1401:4: (lv_actionType_5_0= RULE_STRING )
            // InternalMyDsl.g:1402:5: lv_actionType_5_0= RULE_STRING
            {
            lv_actionType_5_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

            otherlv_6=(Token)match(input,54,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getInputOutputKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1426:3: ( (lv_inputOutput_8_0= RULE_STRING ) )
            // InternalMyDsl.g:1427:4: (lv_inputOutput_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:1427:4: (lv_inputOutput_8_0= RULE_STRING )
            // InternalMyDsl.g:1428:5: lv_inputOutput_8_0= RULE_STRING
            {
            lv_inputOutput_8_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            otherlv_9=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getEnergyUsageKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getActionAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1452:3: ( (lv_energyUsage_11_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1453:4: (lv_energyUsage_11_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1453:4: (lv_energyUsage_11_0= RULE_FLOAT )
            // InternalMyDsl.g:1454:5: lv_energyUsage_11_0= RULE_FLOAT
            {
            lv_energyUsage_11_0=(Token)match(input,RULE_FLOAT,FOLLOW_12); 

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

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1478:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:1478:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:1479:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:1485:1: ruleConstraint returns [EObject current=null] : (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SafetyConstraint_0 = null;

        EObject this_RegulatoryConstraint_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1491:2: ( (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint ) )
            // InternalMyDsl.g:1492:2: (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint )
            {
            // InternalMyDsl.g:1492:2: (this_SafetyConstraint_0= ruleSafetyConstraint | this_RegulatoryConstraint_1= ruleRegulatoryConstraint )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==55) ) {
                alt11=1;
            }
            else if ( (LA11_0==58) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1493:3: this_SafetyConstraint_0= ruleSafetyConstraint
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
                    // InternalMyDsl.g:1502:3: this_RegulatoryConstraint_1= ruleRegulatoryConstraint
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
    // InternalMyDsl.g:1514:1: entryRuleSafetyConstraint returns [EObject current=null] : iv_ruleSafetyConstraint= ruleSafetyConstraint EOF ;
    public final EObject entryRuleSafetyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyConstraint = null;


        try {
            // InternalMyDsl.g:1514:57: (iv_ruleSafetyConstraint= ruleSafetyConstraint EOF )
            // InternalMyDsl.g:1515:2: iv_ruleSafetyConstraint= ruleSafetyConstraint EOF
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
    // InternalMyDsl.g:1521:1: ruleSafetyConstraint returns [EObject current=null] : (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1527:2: ( (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:1528:2: (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:1528:2: (otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}' )
            // InternalMyDsl.g:1529:3: otherlv_0= 'SafetyConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'minBattery' otherlv_4= '=' ( (lv_minBattery_5_0= RULE_FLOAT ) ) otherlv_6= 'maxWindSpeed' otherlv_7= '=' ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyConstraintAccess().getSafetyConstraintKeyword_0());
            		
            // InternalMyDsl.g:1533:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1534:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1534:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1535:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,56,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSafetyConstraintAccess().getMinBatteryKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1563:3: ( (lv_minBattery_5_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1564:4: (lv_minBattery_5_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1564:4: (lv_minBattery_5_0= RULE_FLOAT )
            // InternalMyDsl.g:1565:5: lv_minBattery_5_0= RULE_FLOAT
            {
            lv_minBattery_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_44); 

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

            otherlv_6=(Token)match(input,57,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getSafetyConstraintAccess().getMaxWindSpeedKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getSafetyConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1589:3: ( (lv_maxWindSpeed_8_0= RULE_FLOAT ) )
            // InternalMyDsl.g:1590:4: (lv_maxWindSpeed_8_0= RULE_FLOAT )
            {
            // InternalMyDsl.g:1590:4: (lv_maxWindSpeed_8_0= RULE_FLOAT )
            // InternalMyDsl.g:1591:5: lv_maxWindSpeed_8_0= RULE_FLOAT
            {
            lv_maxWindSpeed_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_12); 

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

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1615:1: entryRuleRegulatoryConstraint returns [EObject current=null] : iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF ;
    public final EObject entryRuleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegulatoryConstraint = null;


        try {
            // InternalMyDsl.g:1615:61: (iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:1616:2: iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF
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
    // InternalMyDsl.g:1622:1: ruleRegulatoryConstraint returns [EObject current=null] : (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1628:2: ( (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:1629:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:1629:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalMyDsl.g:1630:3: otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'flightPermission' otherlv_4= '=' ( (lv_flightPermission_5_0= RULE_BOOLEAN ) ) otherlv_6= 'altitudeLimit' otherlv_7= '=' ( (lv_altitudeLimit_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0());
            		
            // InternalMyDsl.g:1634:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1635:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1635:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1636:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRegulatoryConstraintAccess().getFlightPermissionKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1664:3: ( (lv_flightPermission_5_0= RULE_BOOLEAN ) )
            // InternalMyDsl.g:1665:4: (lv_flightPermission_5_0= RULE_BOOLEAN )
            {
            // InternalMyDsl.g:1665:4: (lv_flightPermission_5_0= RULE_BOOLEAN )
            // InternalMyDsl.g:1666:5: lv_flightPermission_5_0= RULE_BOOLEAN
            {
            lv_flightPermission_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_47); 

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

            otherlv_6=(Token)match(input,60,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRegulatoryConstraintAccess().getAltitudeLimitKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1690:3: ( (lv_altitudeLimit_8_0= RULE_INT ) )
            // InternalMyDsl.g:1691:4: (lv_altitudeLimit_8_0= RULE_INT )
            {
            // InternalMyDsl.g:1691:4: (lv_altitudeLimit_8_0= RULE_INT )
            // InternalMyDsl.g:1692:5: lv_altitudeLimit_8_0= RULE_INT
            {
            lv_altitudeLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1716:1: entryRuleMissionEvent returns [EObject current=null] : iv_ruleMissionEvent= ruleMissionEvent EOF ;
    public final EObject entryRuleMissionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionEvent = null;


        try {
            // InternalMyDsl.g:1716:53: (iv_ruleMissionEvent= ruleMissionEvent EOF )
            // InternalMyDsl.g:1717:2: iv_ruleMissionEvent= ruleMissionEvent EOF
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
    // InternalMyDsl.g:1723:1: ruleMissionEvent returns [EObject current=null] : (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1729:2: ( (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1730:2: (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1730:2: (otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1731:3: otherlv_0= 'MissionEvent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'eventType' otherlv_4= '=' ( (lv_eventType_5_0= RULE_STRING ) ) otherlv_6= 'impactLevel' otherlv_7= '=' ( (lv_impactLevel_8_0= RULE_INT ) ) otherlv_9= 'responseAction' otherlv_10= '=' ( (lv_responseAction_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionEventAccess().getMissionEventKeyword_0());
            		
            // InternalMyDsl.g:1735:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1736:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1736:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1737:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionEventAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionEventAccess().getEventTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1765:3: ( (lv_eventType_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1766:4: (lv_eventType_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1766:4: (lv_eventType_5_0= RULE_STRING )
            // InternalMyDsl.g:1767:5: lv_eventType_5_0= RULE_STRING
            {
            lv_eventType_5_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

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

            otherlv_6=(Token)match(input,63,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionEventAccess().getImpactLevelKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1791:3: ( (lv_impactLevel_8_0= RULE_INT ) )
            // InternalMyDsl.g:1792:4: (lv_impactLevel_8_0= RULE_INT )
            {
            // InternalMyDsl.g:1792:4: (lv_impactLevel_8_0= RULE_INT )
            // InternalMyDsl.g:1793:5: lv_impactLevel_8_0= RULE_INT
            {
            lv_impactLevel_8_0=(Token)match(input,RULE_INT,FOLLOW_50); 

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

            otherlv_9=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionEventAccess().getResponseActionKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionEventAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1817:3: ( (lv_responseAction_11_0= RULE_STRING ) )
            // InternalMyDsl.g:1818:4: (lv_responseAction_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:1818:4: (lv_responseAction_11_0= RULE_STRING )
            // InternalMyDsl.g:1819:5: lv_responseAction_11_0= RULE_STRING
            {
            lv_responseAction_11_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2491110200218000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}