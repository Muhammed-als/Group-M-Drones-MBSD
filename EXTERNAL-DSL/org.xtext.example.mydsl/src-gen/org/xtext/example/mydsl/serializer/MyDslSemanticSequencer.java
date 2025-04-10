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
import org.xtext.example.mydsl.myDsl.DroneGroup;
import org.xtext.example.mydsl.myDsl.Mission;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PermissionConstraint;
import org.xtext.example.mydsl.myDsl.RegulatoryConstraint;
import org.xtext.example.mydsl.myDsl.Relation;
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
			case MyDslPackage.DRONE_GROUP:
				sequence_DroneGroup(context, (DroneGroup) semanticObject); 
				return; 
			case MyDslPackage.MISSION:
				sequence_Mission(context, (Mission) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.PERMISSION_CONSTRAINT:
				sequence_PermissionConstraint(context, (PermissionConstraint) semanticObject); 
				return; 
			case MyDslPackage.REGULATORY_CONSTRAINT:
				sequence_RegulatoryConstraint(context, (RegulatoryConstraint) semanticObject); 
				return; 
			case MyDslPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
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
	 *     ActionElement returns Action
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (name=ID description=STRING type=STRING)
	 * </pre>
	 */
	protected void sequence_Action(ISerializationContext context, org.xtext.example.mydsl.myDsl.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENTITY__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTION__DESCRIPTION));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_7_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getActionAccess().getTypeSTRINGTerminalRuleCall_10_0(), semanticObject.getType());
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
	 *     (name=ID description=STRING)
	 * </pre>
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENTITY__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONSTRAINT_CLASSES__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONSTRAINT_CLASSES__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_7_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns DroneGroup
	 *     DroneGroup returns DroneGroup
	 *
	 * Constraint:
	 *     (name=ID drones+=[Drone|ID] drones+=[Drone|ID]*)
	 * </pre>
	 */
	protected void sequence_DroneGroup(ISerializationContext context, DroneGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Drone
	 *     Drone returns Drone
	 *
	 * Constraint:
	 *     (name=ID ip=STRING serialNumber=STRING)
	 * </pre>
	 */
	protected void sequence_Drone(ISerializationContext context, Drone semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ENTITY__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DRONE__IP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DRONE__IP));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DRONE__SERIAL_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DRONE__SERIAL_NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDroneAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDroneAccess().getIpSTRINGTerminalRuleCall_7_0(), semanticObject.getIp());
		feeder.accept(grammarAccess.getDroneAccess().getSerialNumberSTRINGTerminalRuleCall_10_0(), semanticObject.getSerialNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Mission
	 *     Mission returns Mission
	 *     ActionElement returns Mission
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         droneGroup=[DroneGroup|ID] 
	 *         actions+=[ActionElement|ID] 
	 *         actions+=[ActionElement|ID]* 
	 *         (constraints+=[ConstraintClasses|ID] constraints+=[ConstraintClasses|ID]*)?
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
	 *     Entity returns PermissionConstraint
	 *     ConstraintClasses returns PermissionConstraint
	 *     PermissionConstraint returns PermissionConstraint
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 * </pre>
	 */
	protected void sequence_PermissionConstraint(ISerializationContext context, PermissionConstraint semanticObject) {
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
	 *     (name=ID description=STRING?)
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
		feeder.accept(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_7_0_1(), semanticObject.eGet(MyDslPackage.Literals.RELATION__FROM, false));
		feeder.accept(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_10_0_1(), semanticObject.eGet(MyDslPackage.Literals.RELATION__TO, false));
		feeder.accept(grammarAccess.getRelationAccess().getTypeSTRINGTerminalRuleCall_13_0(), semanticObject.getType());
		feeder.finish();
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
