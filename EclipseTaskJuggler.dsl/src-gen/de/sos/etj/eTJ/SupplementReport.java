/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplement Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.SupplementReport#getReport <em>Report</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.SupplementReport#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getSupplementReport()
 * @model
 * @generated
 */
public interface SupplementReport extends Property
{
  /**
   * Returns the value of the '<em><b>Report</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Report</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Report</em>' reference.
   * @see #setReport(Report)
   * @see de.sos.etj.eTJ.ETJPackage#getSupplementReport_Report()
   * @model
   * @generated
   */
  Report getReport();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.SupplementReport#getReport <em>Report</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Report</em>' reference.
   * @see #getReport()
   * @generated
   */
  void setReport(Report value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.ReportAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getSupplementReport_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<ReportAttribute> getAttributes();

} // SupplementReport
