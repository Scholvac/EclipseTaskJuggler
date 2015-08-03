/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shifts Allocate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ShiftsAllocate#getShift <em>Shift</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.ShiftsAllocate#getIntervals <em>Intervals</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getShiftsAllocate()
 * @model
 * @generated
 */
public interface ShiftsAllocate extends AllocateResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Shift</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift</em>' reference.
   * @see #setShift(Shift)
   * @see de.sos.etj.eTJ.ETJPackage#getShiftsAllocate_Shift()
   * @model
   * @generated
   */
  Shift getShift();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ShiftsAllocate#getShift <em>Shift</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift</em>' reference.
   * @see #getShift()
   * @generated
   */
  void setShift(Shift value);

  /**
   * Returns the value of the '<em><b>Intervals</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.Interval3}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intervals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intervals</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getShiftsAllocate_Intervals()
   * @model containment="true"
   * @generated
   */
  EList<Interval3> getIntervals();

} // ShiftsAllocate
