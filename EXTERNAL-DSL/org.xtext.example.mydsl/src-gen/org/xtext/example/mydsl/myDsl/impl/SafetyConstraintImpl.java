/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SafetyConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SafetyConstraintImpl#getMinBattery <em>Min Battery</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SafetyConstraintImpl#getMaxWindSpeed <em>Max Wind Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyConstraintImpl extends ConstraintClassesImpl implements SafetyConstraint
{
  /**
   * The default value of the '{@link #getMinBattery() <em>Min Battery</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinBattery()
   * @generated
   * @ordered
   */
  protected static final float MIN_BATTERY_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getMinBattery() <em>Min Battery</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinBattery()
   * @generated
   * @ordered
   */
  protected float minBattery = MIN_BATTERY_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxWindSpeed() <em>Max Wind Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxWindSpeed()
   * @generated
   * @ordered
   */
  protected static final float MAX_WIND_SPEED_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getMaxWindSpeed() <em>Max Wind Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxWindSpeed()
   * @generated
   * @ordered
   */
  protected float maxWindSpeed = MAX_WIND_SPEED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SafetyConstraintImpl()
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
    return MyDslPackage.Literals.SAFETY_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getMinBattery()
  {
    return minBattery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinBattery(float newMinBattery)
  {
    float oldMinBattery = minBattery;
    minBattery = newMinBattery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SAFETY_CONSTRAINT__MIN_BATTERY, oldMinBattery, minBattery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getMaxWindSpeed()
  {
    return maxWindSpeed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxWindSpeed(float newMaxWindSpeed)
  {
    float oldMaxWindSpeed = maxWindSpeed;
    maxWindSpeed = newMaxWindSpeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SAFETY_CONSTRAINT__MAX_WIND_SPEED, oldMaxWindSpeed, maxWindSpeed));
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
      case MyDslPackage.SAFETY_CONSTRAINT__MIN_BATTERY:
        return getMinBattery();
      case MyDslPackage.SAFETY_CONSTRAINT__MAX_WIND_SPEED:
        return getMaxWindSpeed();
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
      case MyDslPackage.SAFETY_CONSTRAINT__MIN_BATTERY:
        setMinBattery((Float)newValue);
        return;
      case MyDslPackage.SAFETY_CONSTRAINT__MAX_WIND_SPEED:
        setMaxWindSpeed((Float)newValue);
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
      case MyDslPackage.SAFETY_CONSTRAINT__MIN_BATTERY:
        setMinBattery(MIN_BATTERY_EDEFAULT);
        return;
      case MyDslPackage.SAFETY_CONSTRAINT__MAX_WIND_SPEED:
        setMaxWindSpeed(MAX_WIND_SPEED_EDEFAULT);
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
      case MyDslPackage.SAFETY_CONSTRAINT__MIN_BATTERY:
        return minBattery != MIN_BATTERY_EDEFAULT;
      case MyDslPackage.SAFETY_CONSTRAINT__MAX_WIND_SPEED:
        return maxWindSpeed != MAX_WIND_SPEED_EDEFAULT;
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
    result.append(" (minBattery: ");
    result.append(minBattery);
    result.append(", maxWindSpeed: ");
    result.append(maxWindSpeed);
    result.append(')');
    return result.toString();
  }

} //SafetyConstraintImpl
