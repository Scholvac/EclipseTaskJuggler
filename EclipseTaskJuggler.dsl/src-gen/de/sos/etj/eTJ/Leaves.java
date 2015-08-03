/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaves</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Leaves#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLeaves()
 * @model
 * @generated
 */
public interface Leaves extends Property, ResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Details</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.LeaveDetails}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getLeaves_Details()
   * @model containment="true"
   * @generated
   */
  EList<LeaveDetails> getDetails();

} // Leaves
