/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ExtendResource#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getExtendResource()
 * @model
 * @generated
 */
public interface ExtendResource extends ProjectAttribute
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
   * @see de.sos.etj.eTJ.ETJPackage#getExtendResource_Extends()
   * @model containment="true"
   * @generated
   */
  EList<Extend> getExtends();

} // ExtendResource
