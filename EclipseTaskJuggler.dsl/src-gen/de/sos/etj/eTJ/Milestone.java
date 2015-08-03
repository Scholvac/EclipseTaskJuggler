/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Milestone#isMilestone <em>Milestone</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends EObject
{
  /**
   * Returns the value of the '<em><b>Milestone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Milestone</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Milestone</em>' attribute.
   * @see #setMilestone(boolean)
   * @see de.sos.etj.eTJ.ETJPackage#getMilestone_Milestone()
   * @model
   * @generated
   */
  boolean isMilestone();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Milestone#isMilestone <em>Milestone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Milestone</em>' attribute.
   * @see #isMilestone()
   * @generated
   */
  void setMilestone(boolean value);

} // Milestone
