/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISODATE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ISODATE#getDate <em>Date</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.ISODATE#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getISODATE()
 * @model
 * @generated
 */
public interface ISODATE extends EObject
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' containment reference.
   * @see #setDate(ExtDate)
   * @see de.sos.etj.eTJ.ETJPackage#getISODATE_Date()
   * @model containment="true"
   * @generated
   */
  ExtDate getDate();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ISODATE#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(ExtDate value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' containment reference.
   * @see #setDuration(DurationQuantity)
   * @see de.sos.etj.eTJ.ETJPackage#getISODATE_Duration()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getDuration();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ISODATE#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(DurationQuantity value);

} // ISODATE
