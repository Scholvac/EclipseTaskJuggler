/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAlign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.HAlign#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.HAlign#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getHAlign()
 * @model
 * @generated
 */
public interface HAlign extends ColumnAttribute
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
   * @see de.sos.etj.eTJ.ETJPackage#getHAlign_Expression()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getExpression();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.HAlign#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Justification</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.Justification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Justification</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Justification</em>' attribute.
   * @see de.sos.etj.eTJ.Justification
   * @see #setJustification(Justification)
   * @see de.sos.etj.eTJ.ETJPackage#getHAlign_Justification()
   * @model
   * @generated
   */
  Justification getJustification();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.HAlign#getJustification <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Justification</em>' attribute.
   * @see de.sos.etj.eTJ.Justification
   * @see #getJustification()
   * @generated
   */
  void setJustification(Justification value);

} // HAlign
