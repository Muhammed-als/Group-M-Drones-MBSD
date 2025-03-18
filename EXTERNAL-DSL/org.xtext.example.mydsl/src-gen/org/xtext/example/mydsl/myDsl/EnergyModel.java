/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EnergyModel#getConsumptionRate <em>Consumption Rate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EnergyModel#getBatteryHealth <em>Battery Health</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EnergyModel#getRechargeTime <em>Recharge Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnergyModel()
 * @model
 * @generated
 */
public interface EnergyModel extends Entity
{
  /**
   * Returns the value of the '<em><b>Consumption Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consumption Rate</em>' attribute.
   * @see #setConsumptionRate(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnergyModel_ConsumptionRate()
   * @model
   * @generated
   */
  String getConsumptionRate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EnergyModel#getConsumptionRate <em>Consumption Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consumption Rate</em>' attribute.
   * @see #getConsumptionRate()
   * @generated
   */
  void setConsumptionRate(String value);

  /**
   * Returns the value of the '<em><b>Battery Health</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Battery Health</em>' attribute.
   * @see #setBatteryHealth(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnergyModel_BatteryHealth()
   * @model
   * @generated
   */
  String getBatteryHealth();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EnergyModel#getBatteryHealth <em>Battery Health</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Battery Health</em>' attribute.
   * @see #getBatteryHealth()
   * @generated
   */
  void setBatteryHealth(String value);

  /**
   * Returns the value of the '<em><b>Recharge Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recharge Time</em>' attribute.
   * @see #setRechargeTime(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnergyModel_RechargeTime()
   * @model
   * @generated
   */
  String getRechargeTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EnergyModel#getRechargeTime <em>Recharge Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recharge Time</em>' attribute.
   * @see #getRechargeTime()
   * @generated
   */
  void setRechargeTime(String value);

} // EnergyModel
