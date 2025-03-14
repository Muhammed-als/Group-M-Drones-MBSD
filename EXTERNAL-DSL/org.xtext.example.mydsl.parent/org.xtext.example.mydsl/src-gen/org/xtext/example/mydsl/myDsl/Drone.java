/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Drone#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Drone#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Drone#getBatterCapacity <em>Batter Capacity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Drone#getMaxFlightTime <em>Max Flight Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Drone#getPayloadCapacity <em>Payload Capacity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Drone#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Drone#getAddEnergyModel <em>Add Energy Model</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDrone_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Drone#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDrone_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Drone#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Batter Capacity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Batter Capacity</em>' attribute.
   * @see #setBatterCapacity(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDrone_BatterCapacity()
   * @model
   * @generated
   */
  String getBatterCapacity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Drone#getBatterCapacity <em>Batter Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Batter Capacity</em>' attribute.
   * @see #getBatterCapacity()
   * @generated
   */
  void setBatterCapacity(String value);

  /**
   * Returns the value of the '<em><b>Max Flight Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Flight Time</em>' attribute.
   * @see #setMaxFlightTime(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDrone_MaxFlightTime()
   * @model
   * @generated
   */
  String getMaxFlightTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Drone#getMaxFlightTime <em>Max Flight Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Flight Time</em>' attribute.
   * @see #getMaxFlightTime()
   * @generated
   */
  void setMaxFlightTime(String value);

  /**
   * Returns the value of the '<em><b>Payload Capacity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Payload Capacity</em>' attribute.
   * @see #setPayloadCapacity(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDrone_PayloadCapacity()
   * @model
   * @generated
   */
  String getPayloadCapacity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Drone#getPayloadCapacity <em>Payload Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Payload Capacity</em>' attribute.
   * @see #getPayloadCapacity()
   * @generated
   */
  void setPayloadCapacity(String value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see #setRole(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDrone_Role()
   * @model
   * @generated
   */
  String getRole();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Drone#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see #getRole()
   * @generated
   */
  void setRole(String value);

  /**
   * Returns the value of the '<em><b>Add Energy Model</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.EnergyModel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Energy Model</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDrone_AddEnergyModel()
   * @model
   * @generated
   */
  EList<EnergyModel> getAddEnergyModel();

} // Drone
