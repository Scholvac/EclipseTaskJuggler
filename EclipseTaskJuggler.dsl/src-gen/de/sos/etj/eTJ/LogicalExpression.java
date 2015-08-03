/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.LogicalExpression#getLeftOperant <em>Left Operant</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LogicalExpression#getOp <em>Op</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LogicalExpression#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLogicalExpression()
 * @model
 * @generated
 */
public interface LogicalExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Operant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Operant</em>' containment reference.
   * @see #setLeftOperant(LogicalExpression)
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalExpression_LeftOperant()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getLeftOperant();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalExpression#getLeftOperant <em>Left Operant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Operant</em>' containment reference.
   * @see #getLeftOperant()
   * @generated
   */
  void setLeftOperant(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Operand</em>' containment reference.
   * @see #setRightOperand(LogicalExpression)
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalExpression_RightOperand()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getRightOperand();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalExpression#getRightOperand <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Operand</em>' containment reference.
   * @see #getRightOperand()
   * @generated
   */
  void setRightOperand(LogicalExpression value);

} // LogicalExpression
