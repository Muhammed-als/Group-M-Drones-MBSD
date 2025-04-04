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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'Mission'", "'{'", "'droneGroup'", "'='", "'actions'", "'['", "','", "']'", "'constraints'", "'}'", "'DroneGroup'", "'drones'", "'Drone'", "'ip'", "'serialNumber'", "'Action'", "'description'", "'type'", "'Constraint'", "'PermissionConstraint'", "'RegulatoryConstraint'", "'Relation'", "'from'", "'to'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
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

                if ( (LA1_0==12||LA1_0==22||LA1_0==24||LA1_0==27||(LA1_0>=30 && LA1_0<=32)) ) {
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

                if ( (LA2_0==33) ) {
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
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

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
    // InternalMyDsl.g:226:1: ruleEntity returns [EObject current=null] : (this_Mission_0= ruleMission | this_DroneGroup_1= ruleDroneGroup | this_Drone_2= ruleDrone | this_Action_3= ruleAction | this_ConstraintClasses_4= ruleConstraintClasses ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Mission_0 = null;

        EObject this_DroneGroup_1 = null;

        EObject this_Drone_2 = null;

        EObject this_Action_3 = null;

        EObject this_ConstraintClasses_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( (this_Mission_0= ruleMission | this_DroneGroup_1= ruleDroneGroup | this_Drone_2= ruleDrone | this_Action_3= ruleAction | this_ConstraintClasses_4= ruleConstraintClasses ) )
            // InternalMyDsl.g:233:2: (this_Mission_0= ruleMission | this_DroneGroup_1= ruleDroneGroup | this_Drone_2= ruleDrone | this_Action_3= ruleAction | this_ConstraintClasses_4= ruleConstraintClasses )
            {
            // InternalMyDsl.g:233:2: (this_Mission_0= ruleMission | this_DroneGroup_1= ruleDroneGroup | this_Drone_2= ruleDrone | this_Action_3= ruleAction | this_ConstraintClasses_4= ruleConstraintClasses )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 30:
            case 31:
            case 32:
                {
                alt5=5;
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
                    // InternalMyDsl.g:243:3: this_DroneGroup_1= ruleDroneGroup
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
                    // InternalMyDsl.g:252:3: this_Drone_2= ruleDrone
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
                    // InternalMyDsl.g:261:3: this_Action_3= ruleAction
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
                    // InternalMyDsl.g:270:3: this_ConstraintClasses_4= ruleConstraintClasses
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
    // InternalMyDsl.g:282:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:282:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:283:2: iv_ruleMission= ruleMission EOF
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
    // InternalMyDsl.g:289:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'droneGroup' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'actions' otherlv_7= '=' otherlv_8= '[' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' (otherlv_13= 'constraints' otherlv_14= '=' otherlv_15= '[' ( ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? otherlv_19= ']' )? otherlv_20= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;


        	enterRule();

        try {
            // InternalMyDsl.g:295:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'droneGroup' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'actions' otherlv_7= '=' otherlv_8= '[' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' (otherlv_13= 'constraints' otherlv_14= '=' otherlv_15= '[' ( ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? otherlv_19= ']' )? otherlv_20= '}' ) )
            // InternalMyDsl.g:296:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'droneGroup' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'actions' otherlv_7= '=' otherlv_8= '[' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' (otherlv_13= 'constraints' otherlv_14= '=' otherlv_15= '[' ( ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? otherlv_19= ']' )? otherlv_20= '}' )
            {
            // InternalMyDsl.g:296:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'droneGroup' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'actions' otherlv_7= '=' otherlv_8= '[' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' (otherlv_13= 'constraints' otherlv_14= '=' otherlv_15= '[' ( ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? otherlv_19= ']' )? otherlv_20= '}' )
            // InternalMyDsl.g:297:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'droneGroup' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'actions' otherlv_7= '=' otherlv_8= '[' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' (otherlv_13= 'constraints' otherlv_14= '=' otherlv_15= '[' ( ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? otherlv_19= ']' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalMyDsl.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:303:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getDroneGroupKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:331:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:332:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:332:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:333:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getDroneGroupDroneGroupCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getActionsKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getEqualsSignKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalMyDsl.g:356:3: ( (otherlv_9= RULE_ID ) )
            // InternalMyDsl.g:357:4: (otherlv_9= RULE_ID )
            {
            // InternalMyDsl.g:357:4: (otherlv_9= RULE_ID )
            // InternalMyDsl.g:358:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getActionsActionElementCrossReference_9_0());
            				

            }


            }

            // InternalMyDsl.g:369:3: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:370:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalMyDsl.g:374:4: ( (otherlv_11= RULE_ID ) )
            	    // InternalMyDsl.g:375:5: (otherlv_11= RULE_ID )
            	    {
            	    // InternalMyDsl.g:375:5: (otherlv_11= RULE_ID )
            	    // InternalMyDsl.g:376:6: otherlv_11= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_11, grammarAccess.getMissionAccess().getActionsActionElementCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getRightSquareBracketKeyword_11());
            		
            // InternalMyDsl.g:392:3: (otherlv_13= 'constraints' otherlv_14= '=' otherlv_15= '[' ( ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? otherlv_19= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:393:4: otherlv_13= 'constraints' otherlv_14= '=' otherlv_15= '[' ( ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )? otherlv_19= ']'
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getConstraintsKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getEqualsSignKeyword_12_1());
                    			
                    otherlv_15=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_12_2());
                    			
                    // InternalMyDsl.g:405:4: ( ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:406:5: ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )*
                            {
                            // InternalMyDsl.g:406:5: ( (otherlv_16= RULE_ID ) )
                            // InternalMyDsl.g:407:6: (otherlv_16= RULE_ID )
                            {
                            // InternalMyDsl.g:407:6: (otherlv_16= RULE_ID )
                            // InternalMyDsl.g:408:7: otherlv_16= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMissionRule());
                            							}
                            						
                            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_11); 

                            							newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_12_3_0_0());
                            						

                            }


                            }

                            // InternalMyDsl.g:419:5: (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==18) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalMyDsl.g:420:6: otherlv_17= ',' ( (otherlv_18= RULE_ID ) )
                            	    {
                            	    otherlv_17=(Token)match(input,18,FOLLOW_5); 

                            	    						newLeafNode(otherlv_17, grammarAccess.getMissionAccess().getCommaKeyword_12_3_1_0());
                            	    					
                            	    // InternalMyDsl.g:424:6: ( (otherlv_18= RULE_ID ) )
                            	    // InternalMyDsl.g:425:7: (otherlv_18= RULE_ID )
                            	    {
                            	    // InternalMyDsl.g:425:7: (otherlv_18= RULE_ID )
                            	    // InternalMyDsl.g:426:8: otherlv_18= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMissionRule());
                            	    								}
                            	    							
                            	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_11); 

                            	    								newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_12_3_1_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getRightSquareBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_13());
            		

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


    // $ANTLR start "entryRuleDroneGroup"
    // InternalMyDsl.g:452:1: entryRuleDroneGroup returns [EObject current=null] : iv_ruleDroneGroup= ruleDroneGroup EOF ;
    public final EObject entryRuleDroneGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroneGroup = null;


        try {
            // InternalMyDsl.g:452:51: (iv_ruleDroneGroup= ruleDroneGroup EOF )
            // InternalMyDsl.g:453:2: iv_ruleDroneGroup= ruleDroneGroup EOF
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
    // InternalMyDsl.g:459:1: ruleDroneGroup returns [EObject current=null] : (otherlv_0= 'DroneGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'drones' otherlv_4= '=' otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ']' otherlv_10= '}' ) ;
    public final EObject ruleDroneGroup() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalMyDsl.g:465:2: ( (otherlv_0= 'DroneGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'drones' otherlv_4= '=' otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ']' otherlv_10= '}' ) )
            // InternalMyDsl.g:466:2: (otherlv_0= 'DroneGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'drones' otherlv_4= '=' otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ']' otherlv_10= '}' )
            {
            // InternalMyDsl.g:466:2: (otherlv_0= 'DroneGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'drones' otherlv_4= '=' otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ']' otherlv_10= '}' )
            // InternalMyDsl.g:467:3: otherlv_0= 'DroneGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'drones' otherlv_4= '=' otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ']' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneGroupAccess().getDroneGroupKeyword_0());
            		
            // InternalMyDsl.g:471:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:472:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:472:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:473:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDroneGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneGroupAccess().getDronesKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDroneGroupAccess().getEqualsSignKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getDroneGroupAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalMyDsl.g:505:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:506:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:506:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:507:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneGroupRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_6, grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_6_0());
            				

            }


            }

            // InternalMyDsl.g:518:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:519:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDroneGroupAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:523:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalMyDsl.g:524:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalMyDsl.g:524:5: (otherlv_8= RULE_ID )
            	    // InternalMyDsl.g:525:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDroneGroupRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_8, grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneGroupAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDroneGroupAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:549:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalMyDsl.g:549:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalMyDsl.g:550:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalMyDsl.g:556:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ip' otherlv_4= '=' ( (lv_ip_5_0= RULE_STRING ) ) otherlv_6= 'serialNumber' otherlv_7= '=' ( (lv_serialNumber_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ip_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_serialNumber_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:562:2: ( (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ip' otherlv_4= '=' ( (lv_ip_5_0= RULE_STRING ) ) otherlv_6= 'serialNumber' otherlv_7= '=' ( (lv_serialNumber_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:563:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ip' otherlv_4= '=' ( (lv_ip_5_0= RULE_STRING ) ) otherlv_6= 'serialNumber' otherlv_7= '=' ( (lv_serialNumber_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:563:2: (otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ip' otherlv_4= '=' ( (lv_ip_5_0= RULE_STRING ) ) otherlv_6= 'serialNumber' otherlv_7= '=' ( (lv_serialNumber_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalMyDsl.g:564:3: otherlv_0= 'Drone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ip' otherlv_4= '=' ( (lv_ip_5_0= RULE_STRING ) ) otherlv_6= 'serialNumber' otherlv_7= '=' ( (lv_serialNumber_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            // InternalMyDsl.g:568:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:569:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:569:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:570:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getIpKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:598:3: ( (lv_ip_5_0= RULE_STRING ) )
            // InternalMyDsl.g:599:4: (lv_ip_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:599:4: (lv_ip_5_0= RULE_STRING )
            // InternalMyDsl.g:600:5: lv_ip_5_0= RULE_STRING
            {
            lv_ip_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_ip_5_0, grammarAccess.getDroneAccess().getIpSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ip",
            						lv_ip_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getSerialNumberKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:624:3: ( (lv_serialNumber_8_0= RULE_STRING ) )
            // InternalMyDsl.g:625:4: (lv_serialNumber_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:625:4: (lv_serialNumber_8_0= RULE_STRING )
            // InternalMyDsl.g:626:5: lv_serialNumber_8_0= RULE_STRING
            {
            lv_serialNumber_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_serialNumber_8_0, grammarAccess.getDroneAccess().getSerialNumberSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"serialNumber",
            						lv_serialNumber_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:650:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:650:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:651:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:657:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_type_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:663:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:664:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:664:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalMyDsl.g:665:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:669:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:670:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:670:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:671:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:699:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalMyDsl.g:700:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:700:4: (lv_description_5_0= RULE_STRING )
            // InternalMyDsl.g:701:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_description_5_0, grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:725:3: ( (lv_type_8_0= RULE_STRING ) )
            // InternalMyDsl.g:726:4: (lv_type_8_0= RULE_STRING )
            {
            // InternalMyDsl.g:726:4: (lv_type_8_0= RULE_STRING )
            // InternalMyDsl.g:727:5: lv_type_8_0= RULE_STRING
            {
            lv_type_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_type_8_0, grammarAccess.getActionAccess().getTypeSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:751:1: entryRuleConstraintClasses returns [EObject current=null] : iv_ruleConstraintClasses= ruleConstraintClasses EOF ;
    public final EObject entryRuleConstraintClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintClasses = null;


        try {
            // InternalMyDsl.g:751:58: (iv_ruleConstraintClasses= ruleConstraintClasses EOF )
            // InternalMyDsl.g:752:2: iv_ruleConstraintClasses= ruleConstraintClasses EOF
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
    // InternalMyDsl.g:758:1: ruleConstraintClasses returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint ) ;
    public final EObject ruleConstraintClasses() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_PermissionConstraint_1 = null;

        EObject this_RegulatoryConstraint_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:764:2: ( (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint ) )
            // InternalMyDsl.g:765:2: (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint )
            {
            // InternalMyDsl.g:765:2: (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
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
                    // InternalMyDsl.g:766:3: this_Constraint_0= ruleConstraint
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
                    // InternalMyDsl.g:775:3: this_PermissionConstraint_1= rulePermissionConstraint
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
                    // InternalMyDsl.g:784:3: this_RegulatoryConstraint_2= ruleRegulatoryConstraint
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
    // InternalMyDsl.g:796:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:796:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:797:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:803:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:809:2: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:810:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:810:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMyDsl.g:811:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalMyDsl.g:815:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:816:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:816:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:817:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:845:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalMyDsl.g:846:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:846:4: (lv_description_5_0= RULE_STRING )
            // InternalMyDsl.g:847:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_description_5_0, grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:871:1: entryRulePermissionConstraint returns [EObject current=null] : iv_rulePermissionConstraint= rulePermissionConstraint EOF ;
    public final EObject entryRulePermissionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionConstraint = null;


        try {
            // InternalMyDsl.g:871:61: (iv_rulePermissionConstraint= rulePermissionConstraint EOF )
            // InternalMyDsl.g:872:2: iv_rulePermissionConstraint= rulePermissionConstraint EOF
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
    // InternalMyDsl.g:878:1: rulePermissionConstraint returns [EObject current=null] : (otherlv_0= 'PermissionConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}' ) ;
    public final EObject rulePermissionConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:884:2: ( (otherlv_0= 'PermissionConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:885:2: (otherlv_0= 'PermissionConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:885:2: (otherlv_0= 'PermissionConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}' )
            // InternalMyDsl.g:886:3: otherlv_0= 'PermissionConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissionConstraintAccess().getPermissionConstraintKeyword_0());
            		
            // InternalMyDsl.g:890:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:891:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:891:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:892:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPermissionConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPermissionConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPermissionConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPermissionConstraintAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getPermissionConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:920:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:921:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:921:4: (lv_description_5_0= RULE_STRING )
                    // InternalMyDsl.g:922:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getPermissionConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPermissionConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPermissionConstraintAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:946:1: entryRuleRegulatoryConstraint returns [EObject current=null] : iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF ;
    public final EObject entryRuleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegulatoryConstraint = null;


        try {
            // InternalMyDsl.g:946:61: (iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:947:2: iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF
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
    // InternalMyDsl.g:953:1: ruleRegulatoryConstraint returns [EObject current=null] : (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}' ) ;
    public final EObject ruleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:959:2: ( (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:960:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:960:2: (otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}' )
            // InternalMyDsl.g:961:3: otherlv_0= 'RegulatoryConstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0());
            		
            // InternalMyDsl.g:965:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:966:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:966:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:967:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRegulatoryConstraintAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:995:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:996:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:996:4: (lv_description_5_0= RULE_STRING )
                    // InternalMyDsl.g:997:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getRegulatoryConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegulatoryConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRegulatoryConstraintAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:1021:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:1021:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:1022:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:1028:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1034:2: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1035:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1035:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1036:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:1040:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1041:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1041:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1042:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1070:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1071:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1071:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1072:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getFromEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getToKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:1091:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:1092:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:1092:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:1093:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToEntityCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getTypeKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getEqualsSignKeyword_10());
            		
            // InternalMyDsl.g:1112:3: ( (lv_type_11_0= RULE_STRING ) )
            // InternalMyDsl.g:1113:4: (lv_type_11_0= RULE_STRING )
            {
            // InternalMyDsl.g:1113:4: (lv_type_11_0= RULE_STRING )
            // InternalMyDsl.g:1114:5: lv_type_11_0= RULE_STRING
            {
            lv_type_11_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\113\uffff";
    static final String dfa_2s = "\1\1\112\uffff";
    static final String dfa_3s = "\1\14\1\uffff\7\4\7\15\1\16\1\27\1\31\4\34\7\17\1\4\1\21\5\5\1\20\1\4\1\32\1\35\2\25\1\uffff\1\25\1\uffff\1\17\1\22\2\17\1\uffff\1\21\1\4\1\25\2\5\1\4\1\22\1\uffff\2\25\1\22\2\uffff\1\4\1\24\1\22\1\17\1\uffff\1\21\1\4\1\22\1\25\1\4\1\22";
    static final String dfa_4s = "\1\41\1\uffff\7\4\7\15\1\16\1\27\1\31\4\34\7\17\1\4\1\21\3\5\2\25\1\20\1\4\1\32\1\35\2\25\1\uffff\1\25\1\uffff\1\17\1\23\2\17\1\uffff\1\21\1\4\1\25\2\5\1\4\1\23\1\uffff\2\25\1\23\2\uffff\1\4\1\25\1\23\1\17\1\uffff\1\21\2\23\1\25\1\4\1\23";
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
            "\1\52\17\uffff\1\53",
            "\1\54\17\uffff\1\55",
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
            "\1\64\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\64\1\65",
            "",
            "\1\76",
            "\1\77",
            "\1\100\1\101",
            "",
            "",
            "\1\102",
            "\1\103\1\104",
            "\1\100\1\101",
            "\1\105",
            "",
            "\1\106",
            "\1\107\16\uffff\1\110",
            "\1\111\1\110",
            "\1\104",
            "\1\112",
            "\1\111\1\110"
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
    static final String dfa_10s = "\1\14\1\uffff\1\4\1\15\1\42\1\17\1\4\1\43\1\17\1\4\1\35\1\17\1\5\1\25\1\uffff";
    static final String dfa_11s = "\1\41\1\uffff\1\4\1\15\1\42\1\17\1\4\1\43\1\17\1\4\1\35\1\17\1\5\1\25\1\uffff";
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003C9401002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});

}