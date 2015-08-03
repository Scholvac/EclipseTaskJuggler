/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Flags#getFlags <em>Flags</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getFlags()
 * @model
 * @generated
 */
public interface Flags extends Property, AccountAttribute, ReportAttribute, ResourceAttribute, StatusStatusSheetAttribute, StatusTimesheetAttribute
{
  /**
   * Returns the value of the '<em><b>Flags</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flags</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flags</em>' attribute list.
   * @see de.sos.etj.eTJ.ETJPackage#getFlags_Flags()
   * @model unique="false"
   * @generated
   */
  EList<String> getFlags();

} // Flags
