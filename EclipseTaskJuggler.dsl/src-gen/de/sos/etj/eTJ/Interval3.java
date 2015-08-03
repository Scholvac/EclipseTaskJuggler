/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Interval3#getStart <em>Start</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Interval3#getEnd <em>End</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Interval3#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getInterval3()
 * @model
 * @generated
 */
public interface Interval3 extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getInterval3_Start()
   * @model containment="true"
   * @generated
   */
  ISODATE getStart();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Interval3#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(ISODATE value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getInterval3_End()
   * @model containment="true"
   * @generated
   */
  ISODATE getEnd();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Interval3#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(ISODATE value);

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
   * @see de.sos.etj.eTJ.ETJPackage#getInterval3_Duration()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getDuration();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Interval3#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(DurationQuantity value);

} // Interval3
