/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.Drone;
import org.xtext.example.mydsl.myDsl.EnergyModel;
import org.xtext.example.mydsl.myDsl.Mission;
import org.xtext.example.mydsl.myDsl.MissionEvent;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Phase;
import org.xtext.example.mydsl.myDsl.SubPhase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getDrones <em>Drones</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getEnergyModels <em>Energy Models</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getSubPhases <em>Sub Phases</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getMissionEVents <em>Mission EVents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissions()
   * @generated
   * @ordered
   */
  protected EList<Mission> missions;

  /**
   * The cached value of the '{@link #getDrones() <em>Drones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrones()
   * @generated
   * @ordered
   */
  protected EList<Drone> drones;

  /**
   * The cached value of the '{@link #getEnergyModels() <em>Energy Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnergyModels()
   * @generated
   * @ordered
   */
  protected EList<EnergyModel> energyModels;

  /**
   * The cached value of the '{@link #getPhases() <em>Phases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhases()
   * @generated
   * @ordered
   */
  protected EList<Phase> phases;

  /**
   * The cached value of the '{@link #getSubPhases() <em>Sub Phases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPhases()
   * @generated
   * @ordered
   */
  protected EList<SubPhase> subPhases;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * The cached value of the '{@link #getMissionEVents() <em>Mission EVents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissionEVents()
   * @generated
   * @ordered
   */
  protected EList<MissionEvent> missionEVents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return MyDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Mission> getMissions()
  {
    if (missions == null)
    {
      missions = new EObjectContainmentEList<Mission>(Mission.class, this, MyDslPackage.MODEL__MISSIONS);
    }
    return missions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Drone> getDrones()
  {
    if (drones == null)
    {
      drones = new EObjectContainmentEList<Drone>(Drone.class, this, MyDslPackage.MODEL__DRONES);
    }
    return drones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EnergyModel> getEnergyModels()
  {
    if (energyModels == null)
    {
      energyModels = new EObjectContainmentEList<EnergyModel>(EnergyModel.class, this, MyDslPackage.MODEL__ENERGY_MODELS);
    }
    return energyModels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Phase> getPhases()
  {
    if (phases == null)
    {
      phases = new EObjectContainmentEList<Phase>(Phase.class, this, MyDslPackage.MODEL__PHASES);
    }
    return phases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SubPhase> getSubPhases()
  {
    if (subPhases == null)
    {
      subPhases = new EObjectContainmentEList<SubPhase>(SubPhase.class, this, MyDslPackage.MODEL__SUB_PHASES);
    }
    return subPhases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, MyDslPackage.MODEL__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, MyDslPackage.MODEL__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MissionEvent> getMissionEVents()
  {
    if (missionEVents == null)
    {
      missionEVents = new EObjectContainmentEList<MissionEvent>(MissionEvent.class, this, MyDslPackage.MODEL__MISSION_EVENTS);
    }
    return missionEVents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__MISSIONS:
        return ((InternalEList<?>)getMissions()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__DRONES:
        return ((InternalEList<?>)getDrones()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__ENERGY_MODELS:
        return ((InternalEList<?>)getEnergyModels()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__PHASES:
        return ((InternalEList<?>)getPhases()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__SUB_PHASES:
        return ((InternalEList<?>)getSubPhases()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__MISSION_EVENTS:
        return ((InternalEList<?>)getMissionEVents()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyDslPackage.MODEL__MISSIONS:
        return getMissions();
      case MyDslPackage.MODEL__DRONES:
        return getDrones();
      case MyDslPackage.MODEL__ENERGY_MODELS:
        return getEnergyModels();
      case MyDslPackage.MODEL__PHASES:
        return getPhases();
      case MyDslPackage.MODEL__SUB_PHASES:
        return getSubPhases();
      case MyDslPackage.MODEL__ACTIONS:
        return getActions();
      case MyDslPackage.MODEL__CONSTRAINTS:
        return getConstraints();
      case MyDslPackage.MODEL__MISSION_EVENTS:
        return getMissionEVents();
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
      case MyDslPackage.MODEL__MISSIONS:
        getMissions().clear();
        getMissions().addAll((Collection<? extends Mission>)newValue);
        return;
      case MyDslPackage.MODEL__DRONES:
        getDrones().clear();
        getDrones().addAll((Collection<? extends Drone>)newValue);
        return;
      case MyDslPackage.MODEL__ENERGY_MODELS:
        getEnergyModels().clear();
        getEnergyModels().addAll((Collection<? extends EnergyModel>)newValue);
        return;
      case MyDslPackage.MODEL__PHASES:
        getPhases().clear();
        getPhases().addAll((Collection<? extends Phase>)newValue);
        return;
      case MyDslPackage.MODEL__SUB_PHASES:
        getSubPhases().clear();
        getSubPhases().addAll((Collection<? extends SubPhase>)newValue);
        return;
      case MyDslPackage.MODEL__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case MyDslPackage.MODEL__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
        return;
      case MyDslPackage.MODEL__MISSION_EVENTS:
        getMissionEVents().clear();
        getMissionEVents().addAll((Collection<? extends MissionEvent>)newValue);
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
      case MyDslPackage.MODEL__MISSIONS:
        getMissions().clear();
        return;
      case MyDslPackage.MODEL__DRONES:
        getDrones().clear();
        return;
      case MyDslPackage.MODEL__ENERGY_MODELS:
        getEnergyModels().clear();
        return;
      case MyDslPackage.MODEL__PHASES:
        getPhases().clear();
        return;
      case MyDslPackage.MODEL__SUB_PHASES:
        getSubPhases().clear();
        return;
      case MyDslPackage.MODEL__ACTIONS:
        getActions().clear();
        return;
      case MyDslPackage.MODEL__CONSTRAINTS:
        getConstraints().clear();
        return;
      case MyDslPackage.MODEL__MISSION_EVENTS:
        getMissionEVents().clear();
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
      case MyDslPackage.MODEL__MISSIONS:
        return missions != null && !missions.isEmpty();
      case MyDslPackage.MODEL__DRONES:
        return drones != null && !drones.isEmpty();
      case MyDslPackage.MODEL__ENERGY_MODELS:
        return energyModels != null && !energyModels.isEmpty();
      case MyDslPackage.MODEL__PHASES:
        return phases != null && !phases.isEmpty();
      case MyDslPackage.MODEL__SUB_PHASES:
        return subPhases != null && !subPhases.isEmpty();
      case MyDslPackage.MODEL__ACTIONS:
        return actions != null && !actions.isEmpty();
      case MyDslPackage.MODEL__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
      case MyDslPackage.MODEL__MISSION_EVENTS:
        return missionEVents != null && !missionEVents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
