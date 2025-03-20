/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SubPhase#getSubPhaseType <em>Sub Phase Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SubPhase#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SubPhase#getAddAction <em>Add Action</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSubPhase()
 * @model
 * @generated
 */
public interface SubPhase extends Entity
{
  /**
   * Returns the value of the '<em><b>Sub Phase Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Phase Type</em>' attribute.
   * @see #setSubPhaseType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSubPhase_SubPhaseType()
   * @model
   * @generated
   */
  String getSubPhaseType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SubPhase#getSubPhaseType <em>Sub Phase Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Phase Type</em>' attribute.
   * @see #getSubPhaseType()
   * @generated
   */
  void setSubPhaseType(String value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(float)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSubPhase_Duration()
   * @model
   * @generated
   */
  float getDuration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SubPhase#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(float value);

  /**
   * Returns the value of the '<em><b>Add Action</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Action</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSubPhase_AddAction()
   * @model
   * @generated
   */
  EList<Action> getAddAction();

} // SubPhase
