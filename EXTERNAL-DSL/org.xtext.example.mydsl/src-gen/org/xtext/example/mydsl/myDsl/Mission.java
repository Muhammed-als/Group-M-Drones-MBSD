/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getMissionType <em>Mission Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getEstimatedTime <em>Estimated Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getAddDrones <em>Add Drones</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getAddPhases <em>Add Phases</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getAddConstraints <em>Add Constraints</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mission#getAddEvents <em>Add Events</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends Entity
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mission#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Mission Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mission Type</em>' attribute.
   * @see #setMissionType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_MissionType()
   * @model
   * @generated
   */
  String getMissionType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mission#getMissionType <em>Mission Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mission Type</em>' attribute.
   * @see #getMissionType()
   * @generated
   */
  void setMissionType(String value);

  /**
   * Returns the value of the '<em><b>Start Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Location</em>' attribute.
   * @see #setStartLocation(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_StartLocation()
   * @model
   * @generated
   */
  String getStartLocation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mission#getStartLocation <em>Start Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Location</em>' attribute.
   * @see #getStartLocation()
   * @generated
   */
  void setStartLocation(String value);

  /**
   * Returns the value of the '<em><b>End Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Location</em>' attribute.
   * @see #setEndLocation(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_EndLocation()
   * @model
   * @generated
   */
  String getEndLocation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mission#getEndLocation <em>End Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Location</em>' attribute.
   * @see #getEndLocation()
   * @generated
   */
  void setEndLocation(String value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_Priority()
   * @model
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mission#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

  /**
   * Returns the value of the '<em><b>Estimated Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimated Time</em>' attribute.
   * @see #setEstimatedTime(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_EstimatedTime()
   * @model
   * @generated
   */
  String getEstimatedTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mission#getEstimatedTime <em>Estimated Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estimated Time</em>' attribute.
   * @see #getEstimatedTime()
   * @generated
   */
  void setEstimatedTime(String value);

  /**
   * Returns the value of the '<em><b>Add Drones</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Drone}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Drones</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_AddDrones()
   * @model
   * @generated
   */
  EList<Drone> getAddDrones();

  /**
   * Returns the value of the '<em><b>Add Phases</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Phase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Phases</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_AddPhases()
   * @model
   * @generated
   */
  EList<Phase> getAddPhases();

  /**
   * Returns the value of the '<em><b>Add Constraints</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Constraints</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_AddConstraints()
   * @model
   * @generated
   */
  EList<Constraint> getAddConstraints();

  /**
   * Returns the value of the '<em><b>Add Events</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.MissionEvent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Events</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMission_AddEvents()
   * @model
   * @generated
   */
  EList<MissionEvent> getAddEvents();

} // Mission
