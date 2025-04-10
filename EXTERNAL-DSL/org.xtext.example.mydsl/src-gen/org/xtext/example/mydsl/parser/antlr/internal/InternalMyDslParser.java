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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'Mission'", "'{'", "'name'", "'='", "'droneGroup'", "'actions'", "'['", "','", "']'", "'constraints'", "'}'", "'DroneGroup'", "'drones'", "'Drone'", "'ip'", "'serialNumber'", "'Action'", "'description'", "'type'", "'Constraint'", "'PermissionConstraint'", "'RegulatoryConstraint'", "'Relation'", "'from'", "'to'"
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

                if ( (LA1_0==12||LA1_0==23||LA1_0==25||LA1_0==28||(LA1_0>=31 && LA1_0<=33)) ) {
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

                if ( (LA2_0==34) ) {
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
            case 23:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 31:
            case 32:
            case 33:
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
    // InternalMyDsl.g:289:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' (otherlv_15= 'constraints' otherlv_16= '=' otherlv_17= '[' ( ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? otherlv_21= ']' )? otherlv_22= '}' ) ;
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
        Token otherlv_21=null;
        Token otherlv_22=null;


        	enterRule();

        try {
            // InternalMyDsl.g:295:2: ( (otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' (otherlv_15= 'constraints' otherlv_16= '=' otherlv_17= '[' ( ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? otherlv_21= ']' )? otherlv_22= '}' ) )
            // InternalMyDsl.g:296:2: (otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' (otherlv_15= 'constraints' otherlv_16= '=' otherlv_17= '[' ( ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? otherlv_21= ']' )? otherlv_22= '}' )
            {
            // InternalMyDsl.g:296:2: (otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' (otherlv_15= 'constraints' otherlv_16= '=' otherlv_17= '[' ( ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? otherlv_21= ']' )? otherlv_22= '}' )
            // InternalMyDsl.g:297:3: otherlv_0= 'Mission' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'droneGroup' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'actions' otherlv_9= '=' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' (otherlv_15= 'constraints' otherlv_16= '=' otherlv_17= '[' ( ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? otherlv_21= ']' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:313:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:314:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:314:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:315:5: lv_name_4_0= RULE_ID
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
            		
            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:339:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:340:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:340:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:341:5: otherlv_7= RULE_ID
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
            		
            otherlv_10=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_10());
            		
            // InternalMyDsl.g:364:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:365:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:365:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:366:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_11, grammarAccess.getMissionAccess().getActionsActionElementCrossReference_11_0());
            				

            }


            }

            // InternalMyDsl.g:377:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:378:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:382:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:383:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:383:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:384:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMissionRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getActionsActionElementCrossReference_12_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_14=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getRightSquareBracketKeyword_13());
            		
            // InternalMyDsl.g:400:3: (otherlv_15= 'constraints' otherlv_16= '=' otherlv_17= '[' ( ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? otherlv_21= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:401:4: otherlv_15= 'constraints' otherlv_16= '=' otherlv_17= '[' ( ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? otherlv_21= ']'
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getMissionAccess().getConstraintsKeyword_14_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getEqualsSignKeyword_14_1());
                    			
                    otherlv_17=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getMissionAccess().getLeftSquareBracketKeyword_14_2());
                    			
                    // InternalMyDsl.g:413:4: ( ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:414:5: ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                            {
                            // InternalMyDsl.g:414:5: ( (otherlv_18= RULE_ID ) )
                            // InternalMyDsl.g:415:6: (otherlv_18= RULE_ID )
                            {
                            // InternalMyDsl.g:415:6: (otherlv_18= RULE_ID )
                            // InternalMyDsl.g:416:7: otherlv_18= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMissionRule());
                            							}
                            						
                            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_12); 

                            							newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_14_3_0_0());
                            						

                            }


                            }

                            // InternalMyDsl.g:427:5: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==19) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalMyDsl.g:428:6: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                            	    {
                            	    otherlv_19=(Token)match(input,19,FOLLOW_5); 

                            	    						newLeafNode(otherlv_19, grammarAccess.getMissionAccess().getCommaKeyword_14_3_1_0());
                            	    					
                            	    // InternalMyDsl.g:432:6: ( (otherlv_20= RULE_ID ) )
                            	    // InternalMyDsl.g:433:7: (otherlv_20= RULE_ID )
                            	    {
                            	    // InternalMyDsl.g:433:7: (otherlv_20= RULE_ID )
                            	    // InternalMyDsl.g:434:8: otherlv_20= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getMissionRule());
                            	    								}
                            	    							
                            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_12); 

                            	    								newLeafNode(otherlv_20, grammarAccess.getMissionAccess().getConstraintsConstraintClassesCrossReference_14_3_1_1_0());
                            	    							

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

                    otherlv_21=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getMissionAccess().getRightSquareBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalMyDsl.g:460:1: entryRuleDroneGroup returns [EObject current=null] : iv_ruleDroneGroup= ruleDroneGroup EOF ;
    public final EObject entryRuleDroneGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroneGroup = null;


        try {
            // InternalMyDsl.g:460:51: (iv_ruleDroneGroup= ruleDroneGroup EOF )
            // InternalMyDsl.g:461:2: iv_ruleDroneGroup= ruleDroneGroup EOF
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
    // InternalMyDsl.g:467:1: ruleDroneGroup returns [EObject current=null] : (otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:473:2: ( (otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}' ) )
            // InternalMyDsl.g:474:2: (otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}' )
            {
            // InternalMyDsl.g:474:2: (otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}' )
            // InternalMyDsl.g:475:3: otherlv_0= 'DroneGroup' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'drones' otherlv_6= '=' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneGroupAccess().getDroneGroupKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDroneGroupAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneGroupAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneGroupAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:491:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:492:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:492:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:493:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_5=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getDroneGroupAccess().getDronesKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneGroupAccess().getEqualsSignKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneGroupAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalMyDsl.g:521:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:522:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:522:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:523:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneGroupRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_8, grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_8_0());
            				

            }


            }

            // InternalMyDsl.g:534:3: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:535:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getDroneGroupAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMyDsl.g:539:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalMyDsl.g:540:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalMyDsl.g:540:5: (otherlv_10= RULE_ID )
            	    // InternalMyDsl.g:541:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDroneGroupRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_10, grammarAccess.getDroneGroupAccess().getDronesDroneCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_15); 

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
    // InternalMyDsl.g:565:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalMyDsl.g:565:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalMyDsl.g:566:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalMyDsl.g:572:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:578:2: ( (otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:579:2: (otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:579:2: (otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalMyDsl.g:580:3: otherlv_0= 'Drone' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'ip' otherlv_6= '=' ( (lv_ip_7_0= RULE_STRING ) ) otherlv_8= 'serialNumber' otherlv_9= '=' ( (lv_serialNumber_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:596:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:597:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:597:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:598:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_5=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getDroneAccess().getIpKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:622:3: ( (lv_ip_7_0= RULE_STRING ) )
            // InternalMyDsl.g:623:4: (lv_ip_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:623:4: (lv_ip_7_0= RULE_STRING )
            // InternalMyDsl.g:624:5: lv_ip_7_0= RULE_STRING
            {
            lv_ip_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            otherlv_8=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getDroneAccess().getSerialNumberKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneAccess().getEqualsSignKeyword_9());
            		
            // InternalMyDsl.g:648:3: ( (lv_serialNumber_10_0= RULE_STRING ) )
            // InternalMyDsl.g:649:4: (lv_serialNumber_10_0= RULE_STRING )
            {
            // InternalMyDsl.g:649:4: (lv_serialNumber_10_0= RULE_STRING )
            // InternalMyDsl.g:650:5: lv_serialNumber_10_0= RULE_STRING
            {
            lv_serialNumber_10_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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
    // InternalMyDsl.g:674:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:674:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:675:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:681:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:687:2: ( (otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:688:2: (otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:688:2: (otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalMyDsl.g:689:3: otherlv_0= 'Action' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:705:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:706:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:706:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:707:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:731:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalMyDsl.g:732:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:732:4: (lv_description_7_0= RULE_STRING )
            // InternalMyDsl.g:733:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_8=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTypeKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getEqualsSignKeyword_9());
            		
            // InternalMyDsl.g:757:3: ( (lv_type_10_0= RULE_STRING ) )
            // InternalMyDsl.g:758:4: (lv_type_10_0= RULE_STRING )
            {
            // InternalMyDsl.g:758:4: (lv_type_10_0= RULE_STRING )
            // InternalMyDsl.g:759:5: lv_type_10_0= RULE_STRING
            {
            lv_type_10_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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
    // InternalMyDsl.g:783:1: entryRuleConstraintClasses returns [EObject current=null] : iv_ruleConstraintClasses= ruleConstraintClasses EOF ;
    public final EObject entryRuleConstraintClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintClasses = null;


        try {
            // InternalMyDsl.g:783:58: (iv_ruleConstraintClasses= ruleConstraintClasses EOF )
            // InternalMyDsl.g:784:2: iv_ruleConstraintClasses= ruleConstraintClasses EOF
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
    // InternalMyDsl.g:790:1: ruleConstraintClasses returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint ) ;
    public final EObject ruleConstraintClasses() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_PermissionConstraint_1 = null;

        EObject this_RegulatoryConstraint_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:796:2: ( (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint ) )
            // InternalMyDsl.g:797:2: (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint )
            {
            // InternalMyDsl.g:797:2: (this_Constraint_0= ruleConstraint | this_PermissionConstraint_1= rulePermissionConstraint | this_RegulatoryConstraint_2= ruleRegulatoryConstraint )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 33:
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
                    // InternalMyDsl.g:798:3: this_Constraint_0= ruleConstraint
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
                    // InternalMyDsl.g:807:3: this_PermissionConstraint_1= rulePermissionConstraint
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
                    // InternalMyDsl.g:816:3: this_RegulatoryConstraint_2= ruleRegulatoryConstraint
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
    // InternalMyDsl.g:828:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:828:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:829:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:835:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:841:2: ( (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:842:2: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:842:2: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalMyDsl.g:843:3: otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:859:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:860:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:860:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:861:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:885:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalMyDsl.g:886:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:886:4: (lv_description_7_0= RULE_STRING )
            // InternalMyDsl.g:887:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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
    // InternalMyDsl.g:911:1: entryRulePermissionConstraint returns [EObject current=null] : iv_rulePermissionConstraint= rulePermissionConstraint EOF ;
    public final EObject entryRulePermissionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionConstraint = null;


        try {
            // InternalMyDsl.g:911:61: (iv_rulePermissionConstraint= rulePermissionConstraint EOF )
            // InternalMyDsl.g:912:2: iv_rulePermissionConstraint= rulePermissionConstraint EOF
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
    // InternalMyDsl.g:918:1: rulePermissionConstraint returns [EObject current=null] : (otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:924:2: ( (otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:925:2: (otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:925:2: (otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' )
            // InternalMyDsl.g:926:3: otherlv_0= 'PermissionConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissionConstraintAccess().getPermissionConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissionConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPermissionConstraintAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPermissionConstraintAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:942:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:943:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:943:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:944:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPermissionConstraintAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getPermissionConstraintAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:968:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:969:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:969:4: (lv_description_7_0= RULE_STRING )
                    // InternalMyDsl.g:970:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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
    // InternalMyDsl.g:994:1: entryRuleRegulatoryConstraint returns [EObject current=null] : iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF ;
    public final EObject entryRuleRegulatoryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegulatoryConstraint = null;


        try {
            // InternalMyDsl.g:994:61: (iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF )
            // InternalMyDsl.g:995:2: iv_ruleRegulatoryConstraint= ruleRegulatoryConstraint EOF
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
    // InternalMyDsl.g:1001:1: ruleRegulatoryConstraint returns [EObject current=null] : (otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:1007:2: ( (otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1008:2: (otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1008:2: (otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}' )
            // InternalMyDsl.g:1009:3: otherlv_0= 'RegulatoryConstraint' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRegulatoryConstraintAccess().getRegulatoryConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRegulatoryConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRegulatoryConstraintAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:1025:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:1026:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1026:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:1027:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRegulatoryConstraintAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getRegulatoryConstraintAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:1051:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1052:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1052:4: (lv_description_7_0= RULE_STRING )
                    // InternalMyDsl.g:1053:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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
    // InternalMyDsl.g:1077:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:1077:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:1078:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:1084:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
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
            // InternalMyDsl.g:1090:2: ( (otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalMyDsl.g:1091:2: (otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalMyDsl.g:1091:2: (otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalMyDsl.g:1092:3: otherlv_0= 'Relation' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'from' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'to' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'type' otherlv_12= '=' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:1108:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:1109:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1109:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:1110:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            otherlv_5=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getFromKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:1134:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1135:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1135:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1136:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getFromEntityCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getEqualsSignKeyword_9());
            		
            // InternalMyDsl.g:1155:3: ( (otherlv_10= RULE_ID ) )
            // InternalMyDsl.g:1156:4: (otherlv_10= RULE_ID )
            {
            // InternalMyDsl.g:1156:4: (otherlv_10= RULE_ID )
            // InternalMyDsl.g:1157:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getToEntityCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getTypeKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getEqualsSignKeyword_12());
            		
            // InternalMyDsl.g:1176:3: ( (lv_type_13_0= RULE_STRING ) )
            // InternalMyDsl.g:1177:4: (lv_type_13_0= RULE_STRING )
            {
            // InternalMyDsl.g:1177:4: (lv_type_13_0= RULE_STRING )
            // InternalMyDsl.g:1178:5: lv_type_13_0= RULE_STRING
            {
            lv_type_13_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\131\uffff";
    static final String dfa_2s = "\1\1\130\uffff";
    static final String dfa_3s = "\1\14\1\uffff\7\15\7\16\7\17\7\4\1\20\1\30\1\32\4\35\7\17\1\4\1\22\5\5\1\21\1\4\1\33\1\36\2\26\1\uffff\1\26\1\uffff\1\17\1\23\2\17\1\uffff\1\22\1\4\1\26\2\5\1\4\1\23\1\uffff\2\26\1\23\2\uffff\1\4\1\25\1\23\1\17\1\uffff\1\22\1\4\1\23\1\26\1\4\1\23";
    static final String dfa_4s = "\1\42\1\uffff\7\15\7\16\7\17\7\4\1\20\1\30\1\32\4\35\7\17\1\4\1\22\3\5\2\26\1\21\1\4\1\33\1\36\2\26\1\uffff\1\26\1\uffff\1\17\1\24\2\17\1\uffff\1\22\1\4\1\26\2\5\1\4\1\24\1\uffff\2\26\1\24\2\uffff\1\4\1\26\1\24\1\17\1\uffff\1\22\2\24\1\26\1\4\1\24";
    static final String dfa_5s = "\1\uffff\1\2\67\uffff\1\1\1\uffff\1\1\4\uffff\1\1\7\uffff\1\1\3\uffff\2\1\4\uffff\1\1\6\uffff";
    static final String dfa_6s = "\131\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\12\uffff\1\3\1\uffff\1\4\2\uffff\1\5\2\uffff\1\6\1\7\1\10\1\1",
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
            "\1\70\20\uffff\1\71",
            "\1\72\20\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\71",
            "",
            "\1\73",
            "",
            "\1\101",
            "\1\102\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\102\1\103",
            "",
            "\1\114",
            "\1\115",
            "\1\116\1\117",
            "",
            "",
            "\1\120",
            "\1\121\1\122",
            "\1\116\1\117",
            "\1\123",
            "",
            "\1\124",
            "\1\125\17\uffff\1\126",
            "\1\127\1\126",
            "\1\122",
            "\1\130",
            "\1\127\1\126"
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
    static final String dfa_8s = "\21\uffff";
    static final String dfa_9s = "\1\1\20\uffff";
    static final String dfa_10s = "\1\14\1\uffff\1\15\1\16\1\17\1\4\1\43\1\17\1\4\1\44\1\17\1\4\1\36\1\17\1\5\1\26\1\uffff";
    static final String dfa_11s = "\1\42\1\uffff\1\15\1\16\1\17\1\4\1\43\1\17\1\4\1\44\1\17\1\4\1\36\1\17\1\5\1\26\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\16\uffff\1\1";
    static final String dfa_13s = "\21\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\3\1\1\2",
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
            "\1\17",
            "\1\20",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000792801002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});

}