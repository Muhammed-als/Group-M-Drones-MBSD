/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimaryExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimaryExpression#getActionRef <em>Action Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimaryExpression()
 * @model
 * @generated
 */
public interface PrimaryExpression extends ActionExpression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ActionExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimaryExpression_Expression()
   * @model containment="true"
   * @generated
   */
  ActionExpression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimaryExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ActionExpression value);

  /**
   * Returns the value of the '<em><b>Action Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Ref</em>' reference.
   * @see #setActionRef(ActionElement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimaryExpression_ActionRef()
   * @model
   * @generated
   */
  ActionElement getActionRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimaryExpression#getActionRef <em>Action Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Ref</em>' reference.
   * @see #getActionRef()
   * @generated
   */
  void setActionRef(ActionElement value);

} // PrimaryExpression
