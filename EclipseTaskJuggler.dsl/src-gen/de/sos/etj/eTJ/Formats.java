/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Formats#getFormats <em>Formats</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getFormats()
 * @model
 * @generated
 */
public interface Formats extends ReportAttribute, NikuReportAttribute
{
  /**
   * Returns the value of the '<em><b>Formats</b></em>' attribute list.
   * The list contents are of type {@link de.sos.etj.eTJ.ReportFormat}.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.ReportFormat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formats</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formats</em>' attribute list.
   * @see de.sos.etj.eTJ.ReportFormat
   * @see de.sos.etj.eTJ.ETJPackage#getFormats_Formats()
   * @model unique="false"
   * @generated
   */
  EList<ReportFormat> getFormats();

} // Formats
