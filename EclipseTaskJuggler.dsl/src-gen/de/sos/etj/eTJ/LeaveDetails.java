/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leave Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.LeaveDetails#getType <em>Type</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LeaveDetails#getName <em>Name</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LeaveDetails#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLeaveDetails()
 * @model
 * @generated
 */
public interface LeaveDetails extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.LeaveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.sos.etj.eTJ.LeaveType
   * @see #setType(LeaveType)
   * @see de.sos.etj.eTJ.ETJPackage#getLeaveDetails_Type()
   * @model
   * @generated
   */
  LeaveType getType();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LeaveDetails#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.sos.etj.eTJ.LeaveType
   * @see #getType()
   * @generated
   */
  void setType(LeaveType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.sos.etj.eTJ.ETJPackage#getLeaveDetails_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LeaveDetails#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' containment reference.
   * @see #setInterval(Interval3)
   * @see de.sos.etj.eTJ.ETJPackage#getLeaveDetails_Interval()
   * @model containment="true"
   * @generated
   */
  Interval3 getInterval();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LeaveDetails#getInterval <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' containment reference.
   * @see #getInterval()
   * @generated
   */
  void setInterval(Interval3 value);

} // LeaveDetails
