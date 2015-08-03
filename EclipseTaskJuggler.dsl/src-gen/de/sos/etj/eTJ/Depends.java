/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Depends#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getDepends()
 * @model
 * @generated
 */
public interface Depends extends EObject
{
  /**
   * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.TaskDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getDepends_Dependency()
   * @model containment="true"
   * @generated
   */
  EList<TaskDependency> getDependency();

} // Depends
