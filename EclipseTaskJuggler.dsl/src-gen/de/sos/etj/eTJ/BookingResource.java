/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.BookingResource#getTask <em>Task</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.BookingResource#getBooking <em>Booking</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getBookingResource()
 * @model
 * @generated
 */
public interface BookingResource extends ResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(Task)
   * @see de.sos.etj.eTJ.ETJPackage#getBookingResource_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.BookingResource#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Booking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Booking</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Booking</em>' containment reference.
   * @see #setBooking(Booking)
   * @see de.sos.etj.eTJ.ETJPackage#getBookingResource_Booking()
   * @model containment="true"
   * @generated
   */
  Booking getBooking();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.BookingResource#getBooking <em>Booking</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Booking</em>' containment reference.
   * @see #getBooking()
   * @generated
   */
  void setBooking(Booking value);

} // BookingResource
