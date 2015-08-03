/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Resource Attribute Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ExtendedResourceAttributeColumn#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getExtendedResourceAttributeColumn()
 * @model
 * @generated
 */
public interface ExtendedResourceAttributeColumn extends ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Extension</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension</em>' reference.
   * @see #setExtension(Extend)
   * @see de.sos.etj.eTJ.ETJPackage#getExtendedResourceAttributeColumn_Extension()
   * @model
   * @generated
   */
  Extend getExtension();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ExtendedResourceAttributeColumn#getExtension <em>Extension</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' reference.
   * @see #getExtension()
   * @generated
   */
  void setExtension(Extend value);

} // ExtendedResourceAttributeColumn
