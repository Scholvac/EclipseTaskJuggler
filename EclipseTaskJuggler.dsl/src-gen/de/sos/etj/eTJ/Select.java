/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Select#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends AllocateResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.SelectArgument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute.
   * @see de.sos.etj.eTJ.SelectArgument
   * @see #setArgument(SelectArgument)
   * @see de.sos.etj.eTJ.ETJPackage#getSelect_Argument()
   * @model
   * @generated
   */
  SelectArgument getArgument();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Select#getArgument <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' attribute.
   * @see de.sos.etj.eTJ.SelectArgument
   * @see #getArgument()
   * @generated
   */
  void setArgument(SelectArgument value);

} // Select
