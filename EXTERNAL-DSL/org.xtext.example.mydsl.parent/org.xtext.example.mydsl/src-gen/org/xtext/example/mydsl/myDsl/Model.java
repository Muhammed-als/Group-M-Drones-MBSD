/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getMissions <em>Missions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getDrones <em>Drones</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getEnergyModels <em>Energy Models</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getPhases <em>Phases</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getSubPhases <em>Sub Phases</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getMissionEVents <em>Mission EVents</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Missions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Mission}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Missions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Missions()
   * @model containment="true"
   * @generated
   */
  EList<Mission> getMissions();

  /**
   * Returns the value of the '<em><b>Drones</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Drone}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drones</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Drones()
   * @model containment="true"
   * @generated
   */
  EList<Drone> getDrones();

  /**
   * Returns the value of the '<em><b>Energy Models</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.EnergyModel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Energy Models</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_EnergyModels()
   * @model containment="true"
   * @generated
   */
  EList<EnergyModel> getEnergyModels();

  /**
   * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Phase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phases</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Phases()
   * @model containment="true"
   * @generated
   */
  EList<Phase> getPhases();

  /**
   * Returns the value of the '<em><b>Sub Phases</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.SubPhase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Phases</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_SubPhases()
   * @model containment="true"
   * @generated
   */
  EList<SubPhase> getSubPhases();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Mission EVents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.MissionEvent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mission EVents</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_MissionEVents()
   * @model containment="true"
   * @generated
   */
  EList<MissionEvent> getMissionEVents();

} // Model
