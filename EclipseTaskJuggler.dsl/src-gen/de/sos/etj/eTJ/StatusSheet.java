/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.StatusSheet#getResource <em>Resource</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.StatusSheet#getInterval <em>Interval</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.StatusSheet#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getStatusSheet()
 * @model
 * @generated
 */
public interface StatusSheet extends Property
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see de.sos.etj.eTJ.ETJPackage#getStatusSheet_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.StatusSheet#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' containment reference.
   * @see #setInterval(Interval4)
   * @see de.sos.etj.eTJ.ETJPackage#getStatusSheet_Interval()
   * @model containment="true"
   * @generated
   */
  Interval4 getInterval();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.StatusSheet#getInterval <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' containment reference.
   * @see #getInterval()
   * @generated
   */
  void setInterval(Interval4 value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.StatusSheetAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getStatusSheet_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<StatusSheetAttribute> getAttributes();

} // StatusSheet
