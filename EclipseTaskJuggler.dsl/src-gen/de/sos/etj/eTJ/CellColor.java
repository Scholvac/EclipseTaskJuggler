/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.CellColor#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.CellColor#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getCellColor()
 * @model
 * @generated
 */
public interface CellColor extends Property, ColumnAttribute
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
   * @see de.sos.etj.eTJ.ETJPackage#getCellColor_Expression()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getExpression();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.CellColor#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(RGB)
   * @see de.sos.etj.eTJ.ETJPackage#getCellColor_Color()
   * @model containment="true"
   * @generated
   */
  RGB getColor();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.CellColor#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(RGB value);

} // CellColor
