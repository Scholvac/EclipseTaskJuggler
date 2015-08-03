/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Effort#getEffort <em>Effort</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getEffort()
 * @model
 * @generated
 */
public interface Effort extends EObject
{
  /**
   * Returns the value of the '<em><b>Effort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effort</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effort</em>' containment reference.
   * @see #setEffort(DurationQuantity)
   * @see de.sos.etj.eTJ.ETJPackage#getEffort_Effort()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getEffort();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Effort#getEffort <em>Effort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effort</em>' containment reference.
   * @see #getEffort()
   * @generated
   */
  void setEffort(DurationQuantity value);

} // Effort
