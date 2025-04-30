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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'Mission'", "'{'", "'name'", "'='", "'droneGroup'", "'actions'", "'constraints'", "'['", "','", "']'", "'}'", "'or'", "'then'", "'('", "')'", "'DroneGroup'", "'drones'", "'Drone'", "'ip'", "'serialNumber'", "'Action'", "'description'", "'type'", "'Constraint'", "'PermissionConstraint'", "'RegulatoryConstraint'", "'Relation'", "'from'", "'to'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;

        EObject lv_relations_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_entities_2_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==27||LA1_0==29||LA1_0==32||(LA1_0>=35 && LA1_0<=37)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_entities_2_0= ruleEntity )
            	    // InternalMyDsl.g:103:5: lv_entities_2_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:120:3: ( (lv_relations_3_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:121:4: (lv_relations_3_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:121:4: (lv_relations_3_0= ruleRelation )
            	    // InternalMyDsl.g:122:5: lv_relations_3_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_relations_3_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
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


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:143:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:143:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:144:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:150:1: ruleEntity returns [EObject current=null] : (this_Mission_0= ruleMission | this_DroneGroup_1= ruleDroneGroup | this_Drone_2= ruleDrone | this_Action_3= ruleAction | this_ConstraintClasses_4= ruleConstraintClasses ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Mission_0 = null;

        EObject this_DroneGroup_1 = null;

        EObject this_Drone_2 = null;

        EObject this_Action_3 = null;

        EObject this_ConstraintClasses_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (this_Mission_0= ruleMission | this_DroneGroup_1= ruleDroneGroup | this_Drone_2= ruleDrone | this_Action_3= ruleAction | this_ConstraintClasses_4= ruleConstraintClasses ) )
            // InternalMyDsl.g:157:2: (this_Mission_0= ruleMission | this_DroneGroup_1= ruleDroneGroup | this_Drone_2= ruleDrone | this_Action_3= ruleAction | this_ConstraintClasses_4= ruleConstraintClasses )
            {
            // InternalMyDsl.g:157:2: (this_Mission_0= ruleMission | this_DroneGroup_1= ruleDroneGroup | this_Drone_2= ruleDrone | this_Action_3= ruleAction | this_ConstraintClasses_4= ruleConstraintClasses )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            case 35:
            case 36:
            case 37:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:158:3: this_Mission_0= ruleMission
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
                    // InternalMyDsl.g:167:3: this_DroneGroup_1= ruleDroneGroup
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getDroneGroupParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DroneGroup_1=ruleDroneGroup();

                    state._fsp--;


                    			current = this_DroneGroup_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:176:3: this_Drone_2= ruleDrone
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getDroneParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Drone_2=ruleDrone();

                    state._fsp--;


                    			current = this_Drone_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:185:3: this_Action_3= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_3=ruleAction();

                    state._fsp--;


                    			current = this_Action_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:194:3: this_ConstraintClasses_4= ruleConstraintClasses
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getConstraintClassesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintClasses_4=ruleConstraintClasses();

                    state._fsp--;


                    			current = this_ConstraintClasses_4;
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
    // InternalMyDsl.g:206:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:206:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:207:2: iv_ruleMission= ruleMission EOF
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
    // InternalMyDsl.g:213:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' ( (lv_actions_10_0= ruleActionExpression ) ) (otherlv_11= 'constraints' otherlv_12= '=' otherlv_13= '[' ( ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= ']' )? otherlv_18= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_actions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:219:2: ( (otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' ( (lv_actions_10_0= ruleActionExpression ) ) (otherlv_11= 'constraints' otherlv_12= '=' otherlv_13= '[' ( ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= ']' )? otherlv_18= '}' ) )
            // InternalMyDsl.g:220:2: (otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' ( (lv_actions_10_0= ruleActionExpression ) ) (otherlv_11= 'constraints' otherlv_12= '=' otherlv_13= '[' ( ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= ']' )? otherlv_18= '}' )
            {
            // InternalMyDsl.g:220:2: (otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' ( (lv_actions_10_0= ruleActionExpression ) ) (otherlv_11= 'constraints' otherlv_12= '=' otherlv_13= '[' ( ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= ']' )? otherlv_18= '}' )
            // InternalMyDsl.g:221:3: otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' ( (lv_actions_10_0= ruleActionExpression ) ) (otherlv_11= 'constraints' otherlv_12= '=' otherlv_13= '[' ( ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= ']' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:237:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:238:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:238:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:239:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getDroneGroupKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:263:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:264:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:264:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:265:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getDroneGroupDroneGroupCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getActionsKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getEqualsSignKeyword_9());
            		
            // InternalMyDsl.g:284:3: ( (lv_actions_10_0= ruleActionExpression ) )
            // InternalMyDsl.g:285:4: (lv_actions_10_0= ruleActionExpression )
            {
            // InternalMyDsl.g:285:4: (lv_actions_10_0= ruleActionExpression )
            // InternalMyDsl.g:286:5: lv_actions_10_0= ruleActionExpression
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getActionsActionExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_12);
            lv_actions_10_0=ruleActionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"actions",
            						lv_actions_10_0,
            						"org.xtext.example.mydsl.MyDsl.ActionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:303:3: (otherlv_11= 'constraints' otherlv_12= '=' otherlv_13= '[' ( ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:304:4: otherlv_11= 'constraints' otherlv_12= '=' otherlv_13= '[' ( ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= ']'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getMissionAccess().getConstraintsKeyword_11_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getEqualsSignKeyword_11_1());
                    			
                    otherlv_13=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_11_2());
                    			
                    // InternalMyDsl.g:316:4: ( ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMyDsl.g:317:5: ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                            {
                            // InternalMyDsl.g:317:5: ( (otherlv_14= RULE_ID ) )
                            // InternalMyDsl.g:318:6: (otherlv_14= RULE_ID )
                            {
                            // InternalMyDsl.g:318:6: (otherlv_14= RULE_ID )
                            // InternalMyDsl.g:319:7: otherlv_14= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMissionRule());
                            							}
                            						
                            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_15); 

                            							newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_11_3_0_0());
                            						

                            }


                            }

                            // InternalMyDsl.g:330:5: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==20) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalMyDsl.g:331:6: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                            	    {
                            	    otherlv_15=(Token)match(input,20,FOLLOW_3); 

                            	    						newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getCommaKeyword_11_3_1_0());
                            	    					
                            	    // InternalMyDsl.g:335:6: ( (otherlv_16= RULE_ID ) )
                            	    // InternalMyDsl.g:336:7: (otherlv_16= RULE_ID )
                            	    {
                            	    // InternalMyDsl.g:336:7: (otherlv_16= RULE_ID )
                            	    // InternalMyDsl.g:337:8: otherlv_16= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMissionRule());
                            	    								}
                            	    							
                            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_15); 

                            	    								newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_11_3_1_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getMissionAccess().getRightSquareBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleActionExpression"
    // InternalMyDsl.g:363:1: entryRuleActionExpression returns [EObject current=null] : iv_ruleActionExpression= ruleActionExpression EOF ;
    public final EObject entryRuleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExpression = null;


        try {
            // InternalMyDsl.g:363:57: (iv_ruleActionExpression= ruleActionExpression EOF )
            // InternalMyDsl.g:364:2: iv_ruleActionExpression= ruleActionExpression EOF
            {
             newCompositeNode(grammarAccess.getActionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionExpression=ruleActionExpression();

            state._fsp--;

             current =iv_ruleActionExpression; 
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
    // $ANTLR end "entryRuleActionExpression"


    // $ANTLR start "ruleActionExpression"
    // InternalMyDsl.g:370:1: ruleActionExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:376:2: (this_OrExpression_0= ruleOrExpression )
            // InternalMyDsl.g:377:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getActionExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleActionExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalMyDsl.g:388:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalMyDsl.g:388:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalMyDsl.g:389:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalMyDsl.g:395:1: ruleOrExpression returns [EObject current=null] : (this_ThenExpression_0= ruleThenExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleThenExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ThenExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:401:2: ( (this_ThenExpression_0= ruleThenExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleThenExpression ) ) )* ) )
            // InternalMyDsl.g:402:2: (this_ThenExpression_0= ruleThenExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleThenExpression ) ) )* )
            {
            // InternalMyDsl.g:402:2: (this_ThenExpression_0= ruleThenExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleThenExpression ) ) )* )
            // InternalMyDsl.g:403:3: this_ThenExpression_0= ruleThenExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleThenExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getThenExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_ThenExpression_0=ruleThenExpression();

            state._fsp--;


            			current = this_ThenExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:411:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleThenExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:412:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleThenExpression ) )
            	    {
            	    // InternalMyDsl.g:412:4: ()
            	    // InternalMyDsl.g:413:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:423:4: ( (lv_right_3_0= ruleThenExpression ) )
            	    // InternalMyDsl.g:424:5: (lv_right_3_0= ruleThenExpression )
            	    {
            	    // InternalMyDsl.g:424:5: (lv_right_3_0= ruleThenExpression )
            	    // InternalMyDsl.g:425:6: lv_right_3_0= ruleThenExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightThenExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleThenExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.ThenExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleThenExpression"
    // InternalMyDsl.g:447:1: entryRuleThenExpression returns [EObject current=null] : iv_ruleThenExpression= ruleThenExpression EOF ;
    public final EObject entryRuleThenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenExpression = null;


        try {
            // InternalMyDsl.g:447:55: (iv_ruleThenExpression= ruleThenExpression EOF )
            // InternalMyDsl.g:448:2: iv_ruleThenExpression= ruleThenExpression EOF
            {
             newCompositeNode(grammarAccess.getThenExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThenExpression=ruleThenExpression();

            state._fsp--;

             current =iv_ruleThenExpression; 
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
    // $ANTLR end "entryRuleThenExpression"


    // $ANTLR start "ruleThenExpression"
    // InternalMyDsl.g:454:1: ruleThenExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= 'then' ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleThenExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:460:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= 'then' ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalMyDsl.g:461:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= 'then' ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalMyDsl.g:461:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= 'then' ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalMyDsl.g:462:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= 'then' ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getThenExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:470:3: ( () otherlv_2= 'then' ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:471:4: () otherlv_2= 'then' ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalMyDsl.g:471:4: ()
            	    // InternalMyDsl.g:472:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getThenExpressionAccess().getThenExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getThenExpressionAccess().getThenKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:482:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalMyDsl.g:483:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalMyDsl.g:483:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalMyDsl.g:484:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getThenExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThenExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleThenExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalMyDsl.g:506:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalMyDsl.g:506:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalMyDsl.g:507:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalMyDsl.g:513:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expression_1_0= ruleActionExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:519:2: ( ( (otherlv_0= '(' ( (lv_expression_1_0= ruleActionExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMyDsl.g:520:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleActionExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMyDsl.g:520:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleActionExpression ) ) otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:521:3: (otherlv_0= '(' ( (lv_expression_1_0= ruleActionExpression ) ) otherlv_2= ')' )
                    {
                    // InternalMyDsl.g:521:3: (otherlv_0= '(' ( (lv_expression_1_0= ruleActionExpression ) ) otherlv_2= ')' )
                    // InternalMyDsl.g:522:4: otherlv_0= '(' ( (lv_expression_1_0= ruleActionExpression ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalMyDsl.g:526:4: ( (lv_expression_1_0= ruleActionExpression ) )
                    // InternalMyDsl.g:527:5: (lv_expression_1_0= ruleActionExpression )
                    {
                    // InternalMyDsl.g:527:5: (lv_expression_1_0= ruleActionExpression )
                    // InternalMyDsl.g:528:6: lv_expression_1_0= ruleActionExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionActionExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_expression_1_0=ruleActionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_1_0,
                    							"org.xtext.example.mydsl.MyDsl.ActionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:551:3: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMyDsl.g:551:3: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:552:4: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:552:4: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:553:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getActionRefActionElementCrossReference_1_0());
                    				

                    }


                    }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleDroneGroup"
    // InternalMyDsl.g:568:1: entryRuleDroneGroup returns [EObject current=null] : iv_ruleDroneGroup= ruleDroneGroup EOF ;
    public final EObject entryRuleDroneGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroneGroup = null;


        try {
            // InternalMyDsl.g:568:51: (iv_ruleDroneGroup= ruleDroneGroup EOF )
            // InternalMyDsl.g:569:2: iv_ruleDroneGroup= ruleDroneGroup EOF
            {
             newCompositeNode(grammarAccess.getDroneGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDroneGroup=ruleDroneGroup();

            state._fsp--;

             current =iv_ruleDroneGroup; 
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
    // $ANTLR end "entryRuleDroneGroup"


    // $ANTLR start "ruleDroneGroup"
    // InternalMyDsl.g:575:1: ruleDroneGroup returns [EObject current=null] : (otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}' ) ;
    public final EObject ruleDroneGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:581:2: ( (otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}' ) )
            // InternalMyDsl.g:582:2: (otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}' )
            {
            // InternalMyDsl.g:582:2: (otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}' )
            // InternalMyDsl.g:583:3: otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneGroupAccess().getDroneGroupKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDroneGroupAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneGroupAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneGroupAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:599:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:600:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:600:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:601:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDroneGroupAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getDroneGroupAccess().getDronesKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneGroupAccess().getEqualsSignKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneGroupAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalMyDsl.g:629:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:630:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:630:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:631:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneGroupRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_8_0());
            				

            }


            }

            // InternalMyDsl.g:642:3: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:643:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getDroneGroupAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMyDsl.g:647:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalMyDsl.g:648:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalMyDsl.g:648:5: (otherlv_10= RULE_ID )
            	    // InternalMyDsl.g:649:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDroneGroupRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_10, grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getDroneGroupAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDroneGroupAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleDroneGroup"


    // $ANTLR start "entryRuleDrone"
    // InternalMyDsl.g:673:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalMyDsl.g:673:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalMyDsl.g:674:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalMyDsl.g:680:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_ip_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_serialNumber_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalMyDsl.g:686:2: ( (otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:687:2: (otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:687:2: (otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalMyDsl.g:688:3: otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:704:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:705:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:705:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:706:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDroneAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getDroneAccess().getIpKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:730:3: ( (lv_ip_7_0= RULE_STRING ) )
            // InternalMyDsl.g:731:4: (lv_ip_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:731:4: (lv_ip_7_0= RULE_STRING )
            // InternalMyDsl.g:732:5: lv_ip_7_0= RULE_STRING
            {
            lv_ip_7_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_ip_7_0, grammarAccess.getDroneAccess().getIpSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ip",
            						lv_ip_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getDroneAccess().getSerialNumberKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneAccess().getEqualsSignKeyword_9());
            		
            // InternalMyDsl.g:756:3: ( (lv_serialNumber_10_0= RULE_STRING ) )
            // InternalMyDsl.g:757:4: (lv_serialNumber_10_0= RULE_STRING )
            {
            // InternalMyDsl.g:757:4: (lv_serialNumber_10_0= RULE_STRING )
            // InternalMyDsl.g:758:5: lv_serialNumber_10_0= RULE_STRING
            {
            lv_serialNumber_10_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_serialNumber_10_0, grammarAccess.getDroneAccess().getSerialNumberSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"serialNumber",
            						lv_serialNumber_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:782:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:782:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:783:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:789:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_type_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalMyDsl.g:795:2: ( (otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:796:2: (otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:796:2: (otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalMyDsl.g:797:3: otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:813:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:814:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:814:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:815:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_4_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:839:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalMyDsl.g:840:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:840:4: (lv_description_7_0= RULE_STRING )
            // InternalMyDsl.g:841:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_description_7_0, grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTypeKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getEqualsSignKeyword_9());
            		
            // InternalMyDsl.g:865:3: ( (lv_type_10_0= RULE_STRING ) )
            // InternalMyDsl.g:866:4: (lv_type_10_0= RULE_STRING )
            {
            // InternalMyDsl.g:866:4: (lv_type_10_0= RULE_STRING )
            // InternalMyDsl.g:867:5: lv_type_10_0= RULE_STRING
            {
            lv_type_10_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_type_10_0, grammarAccess.getActionAccess().getTypeSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalMyDsl.g:891:1: entryRuleConstraintClasses returns [EObject current=null] : iv_ruleConstraintClasses= ruleConstraintClasses EOF ;
    public final EObject entryRuleConstraintClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintClasses = null;


        try {
            // InternalMyDsl.g:891:58: (iv_ruleConstraintClasses= ruleConstraintClasses EOF )
            // InternalMyDsl.g:892:2: iv_ruleConstraintClasses= ruleConstraintClasses EOF
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
    // InternalMyDsl.g:898:1: ruleConstraintClasses returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint ) ;
    public final EObject ruleConstraintClasses() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_PermissionConstraint_1 = null;

        EObject this_RegulatoryConstraint_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:904:2: ( (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint ) )
            // InternalMyDsl.g:905:2: (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint )
            {
            // InternalMyDsl.g:905:2: (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:906:3: this_Constraint_0= ruleConstraint
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
                    // InternalMyDsl.g:915:3: this_PermissionConstraint_1= rulePermissionConstraint
                    {

                    			newCompositeNode(grammarAccess.getConstraintClassesAccess().getPermissionConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PermissionConstraint_1=rulePermissionConstraint();

                    state._fsp--;


                    			current = this_PermissionConstraint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:924:3: this_RegulatoryConstraint_2= ruleRegulatoryConstraint
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
    // InternalMyDsl.g:936:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:936:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:937:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:943:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:949:2: ( (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:950:2: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:950:2: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalMyDsl.g:951:3: otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:967:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:968:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:968:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:969:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_4_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:993:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalMyDsl.g:994:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:994:4: (lv_description_7_0= RULE_STRING )
            // InternalMyDsl.g:995:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_description_7_0, grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRulePermissionConstraint"
    // InternalMyDsl.g:1019:1: entryRulePermissionConstraint returns [EObject current=null] : iv_rulePermissionConstraint= rulePermissionConstraint EOF ;
    public final EObject entryRulePermissionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionConstraint = null;


        try {
            // InternalMyDsl.g:1019:61: (iv_rulePermissionConstraint= rulePermissionConstraint EOF )
            // InternalMyDsl.g:1020:2: iv_rulePermissionConstraint= rulePermissionConstraint EOF
            {
             newCompositeNode(grammarAccess.getPermissionConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissionConstraint=rulePermissionConstraint();

            state._fsp--;

             current =iv_rulePermissionConstraint; 
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
    // $ANTLR end "entryRulePermissionConstraint"


    // $ANTLR start "rulePermissionConstraint"
    // InternalMyDsl.g:1026:1: rulePermissionConstraint returns [EObject current=null] : (otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' ) ;
    public final EObject rulePermissionConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1032:2: ( (otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1033:2: (otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1033:2: (otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' )
            // InternalMyDsl.g:1034:3: otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissionConstraintAccess().getPermissionConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissionConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPermissionConstraintAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPermissionConstraintAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:1050:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:1051:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1051:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:1052:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_4_0, grammarAccess.getPermissionConstraintAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPermissionConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPermissionConstraintAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getPermissionConstraintAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:1076:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1077:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1077:4: (lv_description_7_0= RULE_STRING )
                    // InternalMyDsl.g:1078:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getPermissionConstraintAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPermissionConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPermissionConstraintAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulePermissionConstraint"


    // $ANTLR start "entryRuleRegulatoryConstraint"
    // InternalMyDsl.g:1102:1: entryRuleRegulatoryConstraint returns [EObject current=null] : iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF ;
    public final EObject entryRuleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegulatoryConstraint = null;


        try {
            // InternalMyDsl.g:1102:61: (iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:1103:2: iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF
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
    // InternalMyDsl.g:1109:1: ruleRegulatoryConstraint returns [EObject current=null] : (otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' ) ;
    public final EObject ruleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1115:2: ( (otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1116:2: (otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1116:2: (otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' )
            // InternalMyDsl.g:1117:3: otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRegulatoryConstraintAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:1133:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:1134:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1134:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:1135:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_4_0, grammarAccess.getRegulatoryConstraintAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRegulatoryConstraintAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:1159:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1160:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1160:4: (lv_description_7_0= RULE_STRING )
                    // InternalMyDsl.g:1161:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getRegulatoryConstraintAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRegulatoryConstraintAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:1185:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:1185:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:1186:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:1192:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_type_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1198:2: ( (otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalMyDsl.g:1199:2: (otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalMyDsl.g:1199:2: (otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalMyDsl.g:1200:3: otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:1216:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:1217:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1217:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:1218:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_4_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getFromKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:1242:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1243:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1243:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1244:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getFromEntityCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getEqualsSignKeyword_9());
            		
            // InternalMyDsl.g:1263:3: ( (otherlv_10= RULE_ID ) )
            // InternalMyDsl.g:1264:4: (otherlv_10= RULE_ID )
            {
            // InternalMyDsl.g:1264:4: (otherlv_10= RULE_ID )
            // InternalMyDsl.g:1265:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getToEntityCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getTypeKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getEqualsSignKeyword_12());
            		
            // InternalMyDsl.g:1284:3: ( (lv_type_13_0= RULE_STRING ) )
            // InternalMyDsl.g:1285:4: (lv_type_13_0= RULE_STRING )
            {
            // InternalMyDsl.g:1285:4: (lv_type_13_0= RULE_STRING )
            // InternalMyDsl.g:1286:5: lv_type_13_0= RULE_STRING
            {
            lv_type_13_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_type_13_0, grammarAccess.getRelationAccess().getTypeSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_14());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000007928001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});

}