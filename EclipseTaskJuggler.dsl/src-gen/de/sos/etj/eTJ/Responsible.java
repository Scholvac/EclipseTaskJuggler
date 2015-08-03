/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Responsible#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getResponsible()
 * @model
 * @generated
 */
public interface Responsible extends EObject
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
   * @see de.sos.etj.eTJ.ETJPackage#getResponsible_Resources()
   * @model
   * @generated
   */
  EList<Resource> getResources();

} // Responsible