/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ListType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getListType()
 * @model
 * @generated
 */
public interface ListType extends ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.ListTypeValues}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.sos.etj.eTJ.ListTypeValues
   * @see #setType(ListTypeValues)
   * @see de.sos.etj.eTJ.ETJPackage#getListType_Type()
   * @model
   * @generated
   */
  ListTypeValues getType();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ListType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.sos.etj.eTJ.ListTypeValues
   * @see #getType()
   * @generated
   */
  void setType(ListTypeValues value);

} // ListType
