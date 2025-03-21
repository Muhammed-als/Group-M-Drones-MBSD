/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Action#getActionType <em>Action Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Action#getInputOutput <em>Input Output</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Action#getEnergyUsage <em>Energy Usage</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Entity
{
  /**
   * Returns the value of the '<em><b>Action Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Type</em>' attribute.
   * @see #setActionType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAction_ActionType()
   * @model
   * @generated
   */
  String getActionType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Action#getActionType <em>Action Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Type</em>' attribute.
   * @see #getActionType()
   * @generated
   */
  void setActionType(String value);

  /**
   * Returns the value of the '<em><b>Input Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Output</em>' attribute.
   * @see #setInputOutput(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAction_InputOutput()
   * @model
   * @generated
   */
  String getInputOutput();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Action#getInputOutput <em>Input Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Output</em>' attribute.
   * @see #getInputOutput()
   * @generated
   */
  void setInputOutput(String value);

  /**
   * Returns the value of the '<em><b>Energy Usage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Energy Usage</em>' attribute.
   * @see #setEnergyUsage(float)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAction_EnergyUsage()
   * @model
   * @generated
   */
  float getEnergyUsage();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Action#getEnergyUsage <em>Energy Usage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Energy Usage</em>' attribute.
   * @see #getEnergyUsage()
   * @generated
   */
  void setEnergyUsage(float value);

} // Action
