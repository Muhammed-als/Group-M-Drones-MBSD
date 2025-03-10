/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Phase;
import org.xtext.example.mydsl.myDsl.SubPhase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PhaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PhaseImpl#getPhaseType <em>Phase Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PhaseImpl#getEnergyUsage <em>Energy Usage</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PhaseImpl#getAddSubPhase <em>Add Sub Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseImpl extends MinimalEObjectImpl.Container implements Phase
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPhaseType() <em>Phase Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhaseType()
   * @generated
   * @ordered
   */
  protected static final String PHASE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPhaseType() <em>Phase Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhaseType()
   * @generated
   * @ordered
   */
  protected String phaseType = PHASE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getEnergyUsage() <em>Energy Usage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnergyUsage()
   * @generated
   * @ordered
   */
  protected static final String ENERGY_USAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnergyUsage() <em>Energy Usage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnergyUsage()
   * @generated
   * @ordered
   */
  protected String energyUsage = ENERGY_USAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAddSubPhase() <em>Add Sub Phase</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddSubPhase()
   * @generated
   * @ordered
   */
  protected EList<SubPhase> addSubPhase;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhaseImpl()
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
    return MyDslPackage.Literals.PHASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PHASE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPhaseType()
  {
    return phaseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPhaseType(String newPhaseType)
  {
    String oldPhaseType = phaseType;
    phaseType = newPhaseType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PHASE__PHASE_TYPE, oldPhaseType, phaseType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEnergyUsage()
  {
    return energyUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnergyUsage(String newEnergyUsage)
  {
    String oldEnergyUsage = energyUsage;
    energyUsage = newEnergyUsage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PHASE__ENERGY_USAGE, oldEnergyUsage, energyUsage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SubPhase> getAddSubPhase()
  {
    if (addSubPhase == null)
    {
      addSubPhase = new EObjectResolvingEList<SubPhase>(SubPhase.class, this, MyDslPackage.PHASE__ADD_SUB_PHASE);
    }
    return addSubPhase;
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
      case MyDslPackage.PHASE__NAME:
        return getName();
      case MyDslPackage.PHASE__PHASE_TYPE:
        return getPhaseType();
      case MyDslPackage.PHASE__ENERGY_USAGE:
        return getEnergyUsage();
      case MyDslPackage.PHASE__ADD_SUB_PHASE:
        return getAddSubPhase();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.PHASE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.PHASE__PHASE_TYPE:
        setPhaseType((String)newValue);
        return;
      case MyDslPackage.PHASE__ENERGY_USAGE:
        setEnergyUsage((String)newValue);
        return;
      case MyDslPackage.PHASE__ADD_SUB_PHASE:
        getAddSubPhase().clear();
        getAddSubPhase().addAll((Collection<? extends SubPhase>)newValue);
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
      case MyDslPackage.PHASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.PHASE__PHASE_TYPE:
        setPhaseType(PHASE_TYPE_EDEFAULT);
        return;
      case MyDslPackage.PHASE__ENERGY_USAGE:
        setEnergyUsage(ENERGY_USAGE_EDEFAULT);
        return;
      case MyDslPackage.PHASE__ADD_SUB_PHASE:
        getAddSubPhase().clear();
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
      case MyDslPackage.PHASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.PHASE__PHASE_TYPE:
        return PHASE_TYPE_EDEFAULT == null ? phaseType != null : !PHASE_TYPE_EDEFAULT.equals(phaseType);
      case MyDslPackage.PHASE__ENERGY_USAGE:
        return ENERGY_USAGE_EDEFAULT == null ? energyUsage != null : !ENERGY_USAGE_EDEFAULT.equals(energyUsage);
      case MyDslPackage.PHASE__ADD_SUB_PHASE:
        return addSubPhase != null && !addSubPhase.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", phaseType: ");
    result.append(phaseType);
    result.append(", energyUsage: ");
    result.append(energyUsage);
    result.append(')');
    return result.toString();
  }

} //PhaseImpl
