/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Scheduled#isScheduled <em>Scheduled</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getScheduled()
 * @model
 * @generated
 */
public interface Scheduled extends EObject
{
  /**
   * Returns the value of the '<em><b>Scheduled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheduled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheduled</em>' attribute.
   * @see #setScheduled(boolean)
   * @see de.sos.etj.eTJ.ETJPackage#getScheduled_Scheduled()
   * @model
   * @generated
   */
  boolean isScheduled();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Scheduled#isScheduled <em>Scheduled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheduled</em>' attribute.
   * @see #isScheduled()
   * @generated
   */
  void setScheduled(boolean value);

} // Scheduled
