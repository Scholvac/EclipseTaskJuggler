/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Absolute Id Exression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.LogicalAbsoluteIdExression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLogicalAbsoluteIdExression()
 * @model
 * @generated
 */
public interface LogicalAbsoluteIdExression extends LogicalExpression
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
   * @see de.sos.etj.eTJ.ETJPackage#getLogicalAbsoluteIdExression_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LogicalAbsoluteIdExression#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // LogicalAbsoluteIdExression
