/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.ConstraintClasses;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstraintClassesImpl#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstraintClassesImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintClassesImpl extends EntityImpl implements ConstraintClasses
{
  /**
   * The default value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintType()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintType()
   * @generated
   * @ordered
   */
  protected String constraintType = CONSTRAINT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintClassesImpl()
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
    return MyDslPackage.Literals.CONSTRAINT_CLASSES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConstraintType()
  {
    return constraintType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstraintType(String newConstraintType)
  {
    String oldConstraintType = constraintType;
    constraintType = newConstraintType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRAINT_CLASSES__CONSTRAINT_TYPE, oldConstraintType, constraintType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRAINT_CLASSES__DESCRIPTION, oldDescription, description));
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
      case MyDslPackage.CONSTRAINT_CLASSES__CONSTRAINT_TYPE:
        return getConstraintType();
      case MyDslPackage.CONSTRAINT_CLASSES__DESCRIPTION:
        return getDescription();
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
      case MyDslPackage.CONSTRAINT_CLASSES__CONSTRAINT_TYPE:
        setConstraintType((String)newValue);
        return;
      case MyDslPackage.CONSTRAINT_CLASSES__DESCRIPTION:
        setDescription((String)newValue);
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
      case MyDslPackage.CONSTRAINT_CLASSES__CONSTRAINT_TYPE:
        setConstraintType(CONSTRAINT_TYPE_EDEFAULT);
        return;
      case MyDslPackage.CONSTRAINT_CLASSES__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case MyDslPackage.CONSTRAINT_CLASSES__CONSTRAINT_TYPE:
        return CONSTRAINT_TYPE_EDEFAULT == null ? constraintType != null : !CONSTRAINT_TYPE_EDEFAULT.equals(constraintType);
      case MyDslPackage.CONSTRAINT_CLASSES__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(" (constraintType: ");
    result.append(constraintType);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ConstraintClassesImpl
