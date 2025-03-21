/*
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.Drone;
import org.xtext.example.mydsl.myDsl.EnergyModel;
import org.xtext.example.mydsl.myDsl.Mission;
import org.xtext.example.mydsl.myDsl.MissionEvent;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Phase;
import org.xtext.example.mydsl.myDsl.RegulatoryConstraint;
import org.xtext.example.mydsl.myDsl.Relation;
import org.xtext.example.mydsl.myDsl.SafetyConstraint;
import org.xtext.example.mydsl.myDsl.SubPhase;
import org.xtext.example.mydsl.myDsl.SystemRoot;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ACTION:
				sequence_Action(context, (org.xtext.example.mydsl.myDsl.Action) semanticObject); 
				return; 
			case MyDslPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case MyDslPackage.DRONE:
				sequence_Drone(context, (Drone) semanticObject); 
				return; 
			case MyDslPackage.ENERGY_MODEL:
				sequence_EnergyModel(context, (EnergyModel) semanticObject); 
				return; 
			case MyDslPackage.MISSION:
				sequence_Mission(context, (Mission) semanticObject); 
				return; 
			case MyDslPackage.MISSION_EVENT:
				sequence_MissionEvent(context, (MissionEvent) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.PHASE:
				sequence_Phase(context, (Phase) semanticObject); 
				return; 
			case MyDslPackage.REGULATORY_CONSTRAINT:
				sequence_RegulatoryConstraint(context, (RegulatoryConstraint) semanticObject); 
				return; 
			case MyDslPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
				return; 
			case MyDslPackage.SAFETY_CONSTRAINT:
				sequence_SafetyConstraint(context, (SafetyConstraint) semanticObject); 
				return; 
			case MyDslPackage.SUB_PHASE:
				sequence_SubPhase(context, (SubPhase) semanticObject); 
				return; 
			case MyDslPackage.SYSTEM_ROOT:
				sequence_SystemRoot(context, (SystemRoot) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Action
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (name=ID actionType=STRING inputOutput=STRING energyUsage=FLOAT)
	 * </pre>
	 */
	protected void sequence_Action(ISerializationContext context, org.xtext.example.mydsl.myDsl.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENTITY__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTION__ACTION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTION__ACTION_TYPE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTION__INPUT_OUTPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTION__INPUT_OUTPUT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTION__ENERGY_USAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTION__ENERGY_USAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionAccess().getActionTypeSTRINGTerminalRuleCall_5_0(), semanticObject.getActionType());
		feeder.accept(grammarAccess.getActionAccess().getInputOutputSTRINGTerminalRuleCall_8_0(), semanticObject.getInputOutput());
		feeder.accept(grammarAccess.getActionAccess().getEnergyUsageFLOATParserRuleCall_11_0(), semanticObject.getEnergyUsage());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Constraint
	 *     ConstraintClasses returns Constraint
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     (name=ID constraintType=STRING description=STRING)
	 * </pre>
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENTITY__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONSTRAINT_CLASSES__CONSTRAINT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONSTRAINT_CLASSES__CONSTRAINT_TYPE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONSTRAINT_CLASSES__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONSTRAINT_CLASSES__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstraintAccess().getConstraintTypeSTRINGTerminalRuleCall_5_0(), semanticObject.getConstraintType());
		feeder.accept(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_8_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Drone
	 *     Drone returns Drone
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=STRING 
	 *         batterCapacity=FLOAT 
	 *         maxFlightTime=FLOAT 
	 *         payloadCapacity=FLOAT 
	 *         role=STRING 
	 *         addEnergyModel+=[EnergyModel|ID] 
	 *         addEnergyModel+=[EnergyModel|ID]*
	 *     )
	 * </pre>
	 */
	protected void sequence_Drone(ISerializationContext context, Drone semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns EnergyModel
	 *     EnergyModel returns EnergyModel
	 *
	 * Constraint:
	 *     (name=ID consumptionRate=FLOAT batteryHealth=FLOAT rechargeTime=FLOAT)
	 * </pre>
	 */
	protected void sequence_EnergyModel(ISerializationContext context, EnergyModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENTITY__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENERGY_MODEL__CONSUMPTION_RATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENERGY_MODEL__CONSUMPTION_RATE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENERGY_MODEL__BATTERY_HEALTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENERGY_MODEL__BATTERY_HEALTH));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENERGY_MODEL__RECHARGE_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENERGY_MODEL__RECHARGE_TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnergyModelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnergyModelAccess().getConsumptionRateFLOATParserRuleCall_5_0(), semanticObject.getConsumptionRate());
		feeder.accept(grammarAccess.getEnergyModelAccess().getBatteryHealthFLOATParserRuleCall_8_0(), semanticObject.getBatteryHealth());
		feeder.accept(grammarAccess.getEnergyModelAccess().getRechargeTimeFLOATParserRuleCall_11_0(), semanticObject.getRechargeTime());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns MissionEvent
	 *     MissionEvent returns MissionEvent
	 *
	 * Constraint:
	 *     (name=ID eventType=STRING impactLevel=INT responseAction=STRING)
	 * </pre>
	 */
	protected void sequence_MissionEvent(ISerializationContext context, MissionEvent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENTITY__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MISSION_EVENT__EVENT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MISSION_EVENT__EVENT_TYPE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MISSION_EVENT__IMPACT_LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MISSION_EVENT__IMPACT_LEVEL));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MISSION_EVENT__RESPONSE_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MISSION_EVENT__RESPONSE_ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMissionEventAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMissionEventAccess().getEventTypeSTRINGTerminalRuleCall_5_0(), semanticObject.getEventType());
		feeder.accept(grammarAccess.getMissionEventAccess().getImpactLevelINTTerminalRuleCall_8_0(), semanticObject.getImpactLevel());
		feeder.accept(grammarAccess.getMissionEventAccess().getResponseActionSTRINGTerminalRuleCall_11_0(), semanticObject.getResponseAction());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Mission
	 *     Mission returns Mission
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=STRING 
	 *         missionType=STRING 
	 *         startLocation=STRING 
	 *         endLocation=STRING 
	 *         priority=INT 
	 *         estimatedTime=FLOAT 
	 *         addDrones+=[Drone|ID] 
	 *         addDrones+=[Drone|ID]* 
	 *         addPhases+=[Phase|ID] 
	 *         addPhases+=[Phase|ID]* 
	 *         addConstraints+=[ConstraintClasses|ID] 
	 *         addConstraints+=[ConstraintClasses|ID]* 
	 *         addEvents+=[MissionEvent|ID] 
	 *         addEvents+=[MissionEvent|ID]*
	 *     )
	 * </pre>
	 */
	protected void sequence_Mission(ISerializationContext context, Mission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (systemRoot=SystemRoot entities+=Entity* relations+=Relation*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Phase
	 *     Phase returns Phase
	 *
	 * Constraint:
	 *     (name=ID phaseType=STRING energyUsage=FLOAT addSubPhase+=[SubPhase|ID] addSubPhase+=[SubPhase|ID]*)
	 * </pre>
	 */
	protected void sequence_Phase(ISerializationContext context, Phase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns RegulatoryConstraint
	 *     ConstraintClasses returns RegulatoryConstraint
	 *     RegulatoryConstraint returns RegulatoryConstraint
	 *
	 * Constraint:
	 *     (name=ID constraintType=STRING? description=STRING? flightPermission=BOOLEAN altitudeLimit=INT)
	 * </pre>
	 */
	protected void sequence_RegulatoryConstraint(ISerializationContext context, RegulatoryConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Relation returns Relation
	 *
	 * Constraint:
	 *     (name=ID from=[Entity|ID] to=[Entity|ID] type=STRING)
	 * </pre>
	 */
	protected void sequence_Relation(ISerializationContext context, Relation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RELATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RELATION__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RELATION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RELATION__FROM));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RELATION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RELATION__TO));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.RELATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.RELATION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_5_0_1(), semanticObject.eGet(MyDslPackage.Literals.RELATION__FROM, false));
		feeder.accept(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_8_0_1(), semanticObject.eGet(MyDslPackage.Literals.RELATION__TO, false));
		feeder.accept(grammarAccess.getRelationAccess().getTypeSTRINGTerminalRuleCall_11_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns SafetyConstraint
	 *     ConstraintClasses returns SafetyConstraint
	 *     SafetyConstraint returns SafetyConstraint
	 *
	 * Constraint:
	 *     (name=ID constraintType=STRING? description=STRING? minBattery=FLOAT maxWindSpeed=FLOAT)
	 * </pre>
	 */
	protected void sequence_SafetyConstraint(ISerializationContext context, SafetyConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns SubPhase
	 *     SubPhase returns SubPhase
	 *
	 * Constraint:
	 *     (name=ID subPhaseType=STRING duration=FLOAT addAction+=[Action|ID] addAction+=[Action|ID]*)
	 * </pre>
	 */
	protected void sequence_SubPhase(ISerializationContext context, SubPhase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SystemRoot returns SystemRoot
	 *
	 * Constraint:
	 *     (name=ID entities+=Entity* relations+=Relation*)
	 * </pre>
	 */
	protected void sequence_SystemRoot(ISerializationContext context, SystemRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
