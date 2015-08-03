/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ResourceRoot#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getResourceRoot()
 * @model
 * @generated
 */
public interface ResourceRoot extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see de.sos.etj.eTJ.ETJPackage#getResourceRoot_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ResourceRoot#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

} // ResourceRoot
