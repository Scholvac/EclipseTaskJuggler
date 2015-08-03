/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Now</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Now#getNow <em>Now</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getNow()
 * @model
 * @generated
 */
public interface Now extends ProjectAttribute
{
  /**
   * Returns the value of the '<em><b>Now</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Now</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Now</em>' containment reference.
   * @see #setNow(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getNow_Now()
   * @model containment="true"
   * @generated
   */
  ISODATE getNow();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Now#getNow <em>Now</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Now</em>' containment reference.
   * @see #getNow()
   * @generated
   */
  void setNow(ISODATE value);

} // Now
