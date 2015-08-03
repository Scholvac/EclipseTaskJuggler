/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purge Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.PurgeTask#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getPurgeTask()
 * @model
 * @generated
 */
public interface PurgeTask extends EObject
{
  /**
   * Returns the value of the '<em><b>List Attribute</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.PurgeTaskAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Attribute</em>' attribute.
   * @see de.sos.etj.eTJ.PurgeTaskAttribute
   * @see #setListAttribute(PurgeTaskAttribute)
   * @see de.sos.etj.eTJ.ETJPackage#getPurgeTask_ListAttribute()
   * @model
   * @generated
   */
  PurgeTaskAttribute getListAttribute();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.PurgeTask#getListAttribute <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Attribute</em>' attribute.
   * @see de.sos.etj.eTJ.PurgeTaskAttribute
   * @see #getListAttribute()
   * @generated
   */
  void setListAttribute(PurgeTaskAttribute value);

} // PurgeTask
