/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Length#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLength()
 * @model
 * @generated
 */
public interface Length extends EObject
{
  /**
   * Returns the value of the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' containment reference.
   * @see #setLength(DurationQuantity)
   * @see de.sos.etj.eTJ.ETJPackage#getLength_Length()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getLength();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Length#getLength <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' containment reference.
   * @see #getLength()
   * @generated
   */
  void setLength(DurationQuantity value);

} // Length
