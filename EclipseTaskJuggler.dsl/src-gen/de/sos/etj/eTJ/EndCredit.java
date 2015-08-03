/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Credit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.EndCredit#getCredit <em>Credit</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getEndCredit()
 * @model
 * @generated
 */
public interface EndCredit extends EObject
{
  /**
   * Returns the value of the '<em><b>Credit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Credit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Credit</em>' attribute.
   * @see #setCredit(float)
   * @see de.sos.etj.eTJ.ETJPackage#getEndCredit_Credit()
   * @model
   * @generated
   */
  float getCredit();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.EndCredit#getCredit <em>Credit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Credit</em>' attribute.
   * @see #getCredit()
   * @generated
   */
  void setCredit(float value);

} // EndCredit
