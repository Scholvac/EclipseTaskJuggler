/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Scheduling#getScheduling <em>Scheduling</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getScheduling()
 * @model
 * @generated
 */
public interface Scheduling extends EObject
{
  /**
   * Returns the value of the '<em><b>Scheduling</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.SchedulingPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheduling</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheduling</em>' attribute.
   * @see de.sos.etj.eTJ.SchedulingPolicy
   * @see #setScheduling(SchedulingPolicy)
   * @see de.sos.etj.eTJ.ETJPackage#getScheduling_Scheduling()
   * @model
   * @generated
   */
  SchedulingPolicy getScheduling();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Scheduling#getScheduling <em>Scheduling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheduling</em>' attribute.
   * @see de.sos.etj.eTJ.SchedulingPolicy
   * @see #getScheduling()
   * @generated
   */
  void setScheduling(SchedulingPolicy value);

} // Scheduling
