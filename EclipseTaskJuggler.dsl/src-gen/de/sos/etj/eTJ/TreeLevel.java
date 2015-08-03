/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.TreeLevel#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getTreeLevel()
 * @model
 * @generated
 */
public interface TreeLevel extends EObject
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(String)
   * @see de.sos.etj.eTJ.ETJPackage#getTreeLevel_Level()
   * @model
   * @generated
   */
  String getLevel();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.TreeLevel#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(String value);

} // TreeLevel
