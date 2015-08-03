/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purge Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.PurgeResource#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getPurgeResource()
 * @model
 * @generated
 */
public interface PurgeResource extends ResourceAttribute
{
  /**
   * Returns the value of the '<em><b>List Attribute</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.PurgeResourceAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Attribute</em>' attribute.
   * @see de.sos.etj.eTJ.PurgeResourceAttribute
   * @see #setListAttribute(PurgeResourceAttribute)
   * @see de.sos.etj.eTJ.ETJPackage#getPurgeResource_ListAttribute()
   * @model
   * @generated
   */
  PurgeResourceAttribute getListAttribute();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.PurgeResource#getListAttribute <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Attribute</em>' attribute.
   * @see de.sos.etj.eTJ.PurgeResourceAttribute
   * @see #getListAttribute()
   * @generated
   */
  void setListAttribute(PurgeResourceAttribute value);

} // PurgeResource
