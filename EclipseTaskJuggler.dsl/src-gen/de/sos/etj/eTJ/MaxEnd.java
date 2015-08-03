/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.MaxEnd#getMaxEnd <em>Max End</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getMaxEnd()
 * @model
 * @generated
 */
public interface MaxEnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Max End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max End</em>' containment reference.
   * @see #setMaxEnd(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getMaxEnd_MaxEnd()
   * @model containment="true"
   * @generated
   */
  ISODATE getMaxEnd();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.MaxEnd#getMaxEnd <em>Max End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max End</em>' containment reference.
   * @see #getMaxEnd()
   * @generated
   */
  void setMaxEnd(ISODATE value);

} // MaxEnd
