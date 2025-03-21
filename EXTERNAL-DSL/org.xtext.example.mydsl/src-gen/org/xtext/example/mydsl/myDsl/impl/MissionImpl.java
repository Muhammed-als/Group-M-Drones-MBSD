/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.ConstraintClasses;
import org.xtext.example.mydsl.myDsl.Drone;
import org.xtext.example.mydsl.myDsl.Mission;
import org.xtext.example.mydsl.myDsl.MissionEvent;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Phase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getMissionType <em>Mission Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getEstimatedTime <em>Estimated Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getAddDrones <em>Add Drones</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getAddPhases <em>Add Phases</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getAddConstraints <em>Add Constraints</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MissionImpl#getAddEvents <em>Add Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends EntityImpl implements Mission
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getMissionType() <em>Mission Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissionType()
   * @generated
   * @ordered
   */
  protected static final String MISSION_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMissionType() <em>Mission Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissionType()
   * @generated
   * @ordered
   */
  protected String missionType = MISSION_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getStartLocation() <em>Start Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartLocation()
   * @generated
   * @ordered
   */
  protected static final String START_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartLocation() <em>Start Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartLocation()
   * @generated
   * @ordered
   */
  protected String startLocation = START_LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getEndLocation() <em>End Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndLocation()
   * @generated
   * @ordered
   */
  protected static final String END_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndLocation() <em>End Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndLocation()
   * @generated
   * @ordered
   */
  protected String endLocation = END_LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected int priority = PRIORITY_EDEFAULT;

  /**
   * The default value of the '{@link #getEstimatedTime() <em>Estimated Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimatedTime()
   * @generated
   * @ordered
   */
  protected static final float ESTIMATED_TIME_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getEstimatedTime() <em>Estimated Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimatedTime()
   * @generated
   * @ordered
   */
  protected float estimatedTime = ESTIMATED_TIME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAddDrones() <em>Add Drones</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddDrones()
   * @generated
   * @ordered
   */
  protected EList<Drone> addDrones;

  /**
   * The cached value of the '{@link #getAddPhases() <em>Add Phases</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddPhases()
   * @generated
   * @ordered
   */
  protected EList<Phase> addPhases;

  /**
   * The cached value of the '{@link #getAddConstraints() <em>Add Constraints</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddConstraints()
   * @generated
   * @ordered
   */
  protected EList<ConstraintClasses> addConstraints;

  /**
   * The cached value of the '{@link #getAddEvents() <em>Add Events</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddEvents()
   * @generated
   * @ordered
   */
  protected EList<MissionEvent> addEvents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MissionImpl()
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
    return MyDslPackage.Literals.MISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MISSION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMissionType()
  {
    return missionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMissionType(String newMissionType)
  {
    String oldMissionType = missionType;
    missionType = newMissionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MISSION__MISSION_TYPE, oldMissionType, missionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStartLocation()
  {
    return startLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStartLocation(String newStartLocation)
  {
    String oldStartLocation = startLocation;
    startLocation = newStartLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MISSION__START_LOCATION, oldStartLocation, startLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEndLocation()
  {
    return endLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEndLocation(String newEndLocation)
  {
    String oldEndLocation = endLocation;
    endLocation = newEndLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MISSION__END_LOCATION, oldEndLocation, endLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPriority(int newPriority)
  {
    int oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MISSION__PRIORITY, oldPriority, priority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getEstimatedTime()
  {
    return estimatedTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEstimatedTime(float newEstimatedTime)
  {
    float oldEstimatedTime = estimatedTime;
    estimatedTime = newEstimatedTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MISSION__ESTIMATED_TIME, oldEstimatedTime, estimatedTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Drone> getAddDrones()
  {
    if (addDrones == null)
    {
      addDrones = new EObjectResolvingEList<Drone>(Drone.class, this, MyDslPackage.MISSION__ADD_DRONES);
    }
    return addDrones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Phase> getAddPhases()
  {
    if (addPhases == null)
    {
      addPhases = new EObjectResolvingEList<Phase>(Phase.class, this, MyDslPackage.MISSION__ADD_PHASES);
    }
    return addPhases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConstraintClasses> getAddConstraints()
  {
    if (addConstraints == null)
    {
      addConstraints = new EObjectResolvingEList<ConstraintClasses>(ConstraintClasses.class, this, MyDslPackage.MISSION__ADD_CONSTRAINTS);
    }
    return addConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MissionEvent> getAddEvents()
  {
    if (addEvents == null)
    {
      addEvents = new EObjectResolvingEList<MissionEvent>(MissionEvent.class, this, MyDslPackage.MISSION__ADD_EVENTS);
    }
    return addEvents;
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
      case MyDslPackage.MISSION__ID:
        return getId();
      case MyDslPackage.MISSION__MISSION_TYPE:
        return getMissionType();
      case MyDslPackage.MISSION__START_LOCATION:
        return getStartLocation();
      case MyDslPackage.MISSION__END_LOCATION:
        return getEndLocation();
      case MyDslPackage.MISSION__PRIORITY:
        return getPriority();
      case MyDslPackage.MISSION__ESTIMATED_TIME:
        return getEstimatedTime();
      case MyDslPackage.MISSION__ADD_DRONES:
        return getAddDrones();
      case MyDslPackage.MISSION__ADD_PHASES:
        return getAddPhases();
      case MyDslPackage.MISSION__ADD_CONSTRAINTS:
        return getAddConstraints();
      case MyDslPackage.MISSION__ADD_EVENTS:
        return getAddEvents();
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
      case MyDslPackage.MISSION__ID:
        setId((String)newValue);
        return;
      case MyDslPackage.MISSION__MISSION_TYPE:
        setMissionType((String)newValue);
        return;
      case MyDslPackage.MISSION__START_LOCATION:
        setStartLocation((String)newValue);
        return;
      case MyDslPackage.MISSION__END_LOCATION:
        setEndLocation((String)newValue);
        return;
      case MyDslPackage.MISSION__PRIORITY:
        setPriority((Integer)newValue);
        return;
      case MyDslPackage.MISSION__ESTIMATED_TIME:
        setEstimatedTime((Float)newValue);
        return;
      case MyDslPackage.MISSION__ADD_DRONES:
        getAddDrones().clear();
        getAddDrones().addAll((Collection<? extends Drone>)newValue);
        return;
      case MyDslPackage.MISSION__ADD_PHASES:
        getAddPhases().clear();
        getAddPhases().addAll((Collection<? extends Phase>)newValue);
        return;
      case MyDslPackage.MISSION__ADD_CONSTRAINTS:
        getAddConstraints().clear();
        getAddConstraints().addAll((Collection<? extends ConstraintClasses>)newValue);
        return;
      case MyDslPackage.MISSION__ADD_EVENTS:
        getAddEvents().clear();
        getAddEvents().addAll((Collection<? extends MissionEvent>)newValue);
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
      case MyDslPackage.MISSION__ID:
        setId(ID_EDEFAULT);
        return;
      case MyDslPackage.MISSION__MISSION_TYPE:
        setMissionType(MISSION_TYPE_EDEFAULT);
        return;
      case MyDslPackage.MISSION__START_LOCATION:
        setStartLocation(START_LOCATION_EDEFAULT);
        return;
      case MyDslPackage.MISSION__END_LOCATION:
        setEndLocation(END_LOCATION_EDEFAULT);
        return;
      case MyDslPackage.MISSION__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case MyDslPackage.MISSION__ESTIMATED_TIME:
        setEstimatedTime(ESTIMATED_TIME_EDEFAULT);
        return;
      case MyDslPackage.MISSION__ADD_DRONES:
        getAddDrones().clear();
        return;
      case MyDslPackage.MISSION__ADD_PHASES:
        getAddPhases().clear();
        return;
      case MyDslPackage.MISSION__ADD_CONSTRAINTS:
        getAddConstraints().clear();
        return;
      case MyDslPackage.MISSION__ADD_EVENTS:
        getAddEvents().clear();
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
      case MyDslPackage.MISSION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case MyDslPackage.MISSION__MISSION_TYPE:
        return MISSION_TYPE_EDEFAULT == null ? missionType != null : !MISSION_TYPE_EDEFAULT.equals(missionType);
      case MyDslPackage.MISSION__START_LOCATION:
        return START_LOCATION_EDEFAULT == null ? startLocation != null : !START_LOCATION_EDEFAULT.equals(startLocation);
      case MyDslPackage.MISSION__END_LOCATION:
        return END_LOCATION_EDEFAULT == null ? endLocation != null : !END_LOCATION_EDEFAULT.equals(endLocation);
      case MyDslPackage.MISSION__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
      case MyDslPackage.MISSION__ESTIMATED_TIME:
        return estimatedTime != ESTIMATED_TIME_EDEFAULT;
      case MyDslPackage.MISSION__ADD_DRONES:
        return addDrones != null && !addDrones.isEmpty();
      case MyDslPackage.MISSION__ADD_PHASES:
        return addPhases != null && !addPhases.isEmpty();
      case MyDslPackage.MISSION__ADD_CONSTRAINTS:
        return addConstraints != null && !addConstraints.isEmpty();
      case MyDslPackage.MISSION__ADD_EVENTS:
        return addEvents != null && !addEvents.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", missionType: ");
    result.append(missionType);
    result.append(", startLocation: ");
    result.append(startLocation);
    result.append(", endLocation: ");
    result.append(endLocation);
    result.append(", priority: ");
    result.append(priority);
    result.append(", estimatedTime: ");
    result.append(estimatedTime);
    result.append(')');
    return result.toString();
  }

} //MissionImpl
