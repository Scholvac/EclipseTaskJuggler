/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Allocate#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getAllocate()
 * @model
 * @generated
 */
public interface Allocate extends Property
{
  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.AllocateResource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getAllocate_Resources()
   * @model containment="true"
   * @generated
   */
  EList<AllocateResource> getResources();

} // Allocate
