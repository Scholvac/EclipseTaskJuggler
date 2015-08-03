/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Sheet Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.StatusSheetReport#getFilename <em>Filename</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.StatusSheetReport#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getStatusSheetReport()
 * @model
 * @generated
 */
public interface StatusSheetReport extends Property
{
  /**
   * Returns the value of the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filename</em>' attribute.
   * @see #setFilename(String)
   * @see de.sos.etj.eTJ.ETJPackage#getStatusSheetReport_Filename()
   * @model
   * @generated
   */
  String getFilename();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.StatusSheetReport#getFilename <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filename</em>' attribute.
   * @see #getFilename()
   * @generated
   */
  void setFilename(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.StatusSheetReportAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getStatusSheetReport_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<StatusSheetReportAttribute> getAttributes();

} // StatusSheetReport
