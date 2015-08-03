/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Booking#getInterval <em>Interval</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Booking#getOvertime <em>Overtime</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Booking#getSloppy <em>Sloppy</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject
{
  /**
   * Returns the value of the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' containment reference.
   * @see #setInterval(Interval4)
   * @see de.sos.etj.eTJ.ETJPackage#getBooking_Interval()
   * @model containment="true"
   * @generated
   */
  Interval4 getInterval();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Booking#getInterval <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' containment reference.
   * @see #getInterval()
   * @generated
   */
  void setInterval(Interval4 value);

  /**
   * Returns the value of the '<em><b>Overtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overtime</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overtime</em>' attribute.
   * @see #setOvertime(int)
   * @see de.sos.etj.eTJ.ETJPackage#getBooking_Overtime()
   * @model
   * @generated
   */
  int getOvertime();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Booking#getOvertime <em>Overtime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overtime</em>' attribute.
   * @see #getOvertime()
   * @generated
   */
  void setOvertime(int value);

  /**
   * Returns the value of the '<em><b>Sloppy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sloppy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sloppy</em>' attribute.
   * @see #setSloppy(int)
   * @see de.sos.etj.eTJ.ETJPackage#getBooking_Sloppy()
   * @model
   * @generated
   */
  int getSloppy();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Booking#getSloppy <em>Sloppy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sloppy</em>' attribute.
   * @see #getSloppy()
   * @generated
   */
  void setSloppy(int value);

} // Booking
