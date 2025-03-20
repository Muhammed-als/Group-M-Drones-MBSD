/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.EnergyModel;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EnergyModelImpl#getConsumptionRate <em>Consumption Rate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EnergyModelImpl#getBatteryHealth <em>Battery Health</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EnergyModelImpl#getRechargeTime <em>Recharge Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyModelImpl extends EntityImpl implements EnergyModel
{
  /**
   * The default value of the '{@link #getConsumptionRate() <em>Consumption Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsumptionRate()
   * @generated
   * @ordered
   */
  protected static final float CONSUMPTION_RATE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getConsumptionRate() <em>Consumption Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsumptionRate()
   * @generated
   * @ordered
   */
  protected float consumptionRate = CONSUMPTION_RATE_EDEFAULT;

  /**
   * The default value of the '{@link #getBatteryHealth() <em>Battery Health</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatteryHealth()
   * @generated
   * @ordered
   */
  protected static final float BATTERY_HEALTH_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getBatteryHealth() <em>Battery Health</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatteryHealth()
   * @generated
   * @ordered
   */
  protected float batteryHealth = BATTERY_HEALTH_EDEFAULT;

  /**
   * The default value of the '{@link #getRechargeTime() <em>Recharge Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRechargeTime()
   * @generated
   * @ordered
   */
  protected static final float RECHARGE_TIME_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getRechargeTime() <em>Recharge Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRechargeTime()
   * @generated
   * @ordered
   */
  protected float rechargeTime = RECHARGE_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnergyModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.ENERGY_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getConsumptionRate()
  {
    return consumptionRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConsumptionRate(float newConsumptionRate)
  {
    float oldConsumptionRate = consumptionRate;
    consumptionRate = newConsumptionRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ENERGY_MODEL__CONSUMPTION_RATE, oldConsumptionRate, consumptionRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getBatteryHealth()
  {
    return batteryHealth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBatteryHealth(float newBatteryHealth)
  {
    float oldBatteryHealth = batteryHealth;
    batteryHealth = newBatteryHealth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ENERGY_MODEL__BATTERY_HEALTH, oldBatteryHealth, batteryHealth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getRechargeTime()
  {
    return rechargeTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRechargeTime(float newRechargeTime)
  {
    float oldRechargeTime = rechargeTime;
    rechargeTime = newRechargeTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ENERGY_MODEL__RECHARGE_TIME, oldRechargeTime, rechargeTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.ENERGY_MODEL__CONSUMPTION_RATE:
        return getConsumptionRate();
      case MyDslPackage.ENERGY_MODEL__BATTERY_HEALTH:
        return getBatteryHealth();
      case MyDslPackage.ENERGY_MODEL__RECHARGE_TIME:
        return getRechargeTime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ENERGY_MODEL__CONSUMPTION_RATE:
        setConsumptionRate((Float)newValue);
        return;
      case MyDslPackage.ENERGY_MODEL__BATTERY_HEALTH:
        setBatteryHealth((Float)newValue);
        return;
      case MyDslPackage.ENERGY_MODEL__RECHARGE_TIME:
        setRechargeTime((Float)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ENERGY_MODEL__CONSUMPTION_RATE:
        setConsumptionRate(CONSUMPTION_RATE_EDEFAULT);
        return;
      case MyDslPackage.ENERGY_MODEL__BATTERY_HEALTH:
        setBatteryHealth(BATTERY_HEALTH_EDEFAULT);
        return;
      case MyDslPackage.ENERGY_MODEL__RECHARGE_TIME:
        setRechargeTime(RECHARGE_TIME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ENERGY_MODEL__CONSUMPTION_RATE:
        return consumptionRate != CONSUMPTION_RATE_EDEFAULT;
      case MyDslPackage.ENERGY_MODEL__BATTERY_HEALTH:
        return batteryHealth != BATTERY_HEALTH_EDEFAULT;
      case MyDslPackage.ENERGY_MODEL__RECHARGE_TIME:
        return rechargeTime != RECHARGE_TIME_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (consumptionRate: ");
    result.append(consumptionRate);
    result.append(", batteryHealth: ");
    result.append(batteryHealth);
    result.append(", rechargeTime: ");
    result.append(rechargeTime);
    result.append(')');
    return result.toString();
  }

} //EnergyModelImpl
