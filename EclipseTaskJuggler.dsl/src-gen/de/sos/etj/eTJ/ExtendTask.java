/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ExtendTask#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getExtendTask()
 * @model
 * @generated
 */
public interface ExtendTask extends ProjectAttribute
{
  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.Extend}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getExtendTask_Extends()
   * @model containment="true"
   * @generated
   */
  EList<Extend> getExtends();

} // ExtendTask
