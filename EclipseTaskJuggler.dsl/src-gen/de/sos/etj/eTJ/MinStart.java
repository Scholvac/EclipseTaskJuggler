/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.MinStart#getMinStart <em>Min Start</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getMinStart()
 * @model
 * @generated
 */
public interface MinStart extends EObject
{
  /**
   * Returns the value of the '<em><b>Min Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Start</em>' containment reference.
   * @see #setMinStart(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getMinStart_MinStart()
   * @model containment="true"
   * @generated
   */
  ISODATE getMinStart();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.MinStart#getMinStart <em>Min Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Start</em>' containment reference.
   * @see #getMinStart()
   * @generated
   */
  void setMinStart(ISODATE value);

} // MinStart
