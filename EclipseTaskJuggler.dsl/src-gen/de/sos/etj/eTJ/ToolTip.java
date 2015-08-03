/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Tip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ToolTip#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.ToolTip#getTip <em>Tip</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getToolTip()
 * @model
 * @generated
 */
public interface ToolTip extends Property, ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(LogicalExpression)
   * @see de.sos.etj.eTJ.ETJPackage#getToolTip_Expression()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getExpression();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ToolTip#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Tip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tip</em>' attribute.
   * @see #setTip(String)
   * @see de.sos.etj.eTJ.ETJPackage#getToolTip_Tip()
   * @model
   * @generated
   */
  String getTip();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ToolTip#getTip <em>Tip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tip</em>' attribute.
   * @see #getTip()
   * @generated
   */
  void setTip(String value);

} // ToolTip
