/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.MinEnd#getMinEnd <em>Min End</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getMinEnd()
 * @model
 * @generated
 */
public interface MinEnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Min End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min End</em>' containment reference.
   * @see #setMinEnd(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getMinEnd_MinEnd()
   * @model containment="true"
   * @generated
   */
  ISODATE getMinEnd();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.MinEnd#getMinEnd <em>Min End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min End</em>' containment reference.
   * @see #getMinEnd()
   * @generated
   */
  void setMinEnd(ISODATE value);

} // MinEnd
