/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.LogicalStringLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LogicalStringLiteral#getMacro <em>Macro</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLogicalStringLiteral()
 * @model
 * @generated
 */
public interface LogicalStringLiteral extends LogicalExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalStringLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalStringLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Macro</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Macro</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Macro</em>' containment reference.
   * @see #setMacro(MacroCall)
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalStringLiteral_Macro()
   * @model containment="true"
   * @generated
   */
  MacroCall getMacro();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalStringLiteral#getMacro <em>Macro</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Macro</em>' containment reference.
   * @see #getMacro()
   * @generated
   */
  void setMacro(MacroCall value);

} // LogicalStringLiteral
