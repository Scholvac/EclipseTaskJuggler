/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Managers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Managers#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getManagers()
 * @model
 * @generated
 */
public interface Managers extends ResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Resources</b></em>' reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getManagers_Resources()
   * @model
   * @generated
   */
  EList<Resource> getResources();

} // Managers
