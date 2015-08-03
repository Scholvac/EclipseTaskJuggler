/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Start#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends ReportAttribute, IcalReportAttribute, ExportAttribute, NikuReportAttribute, StatusSheetReportAttribute, TimesheetReportAttribute, ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getStart_Start()
   * @model containment="true"
   * @generated
   */
  ISODATE getStart();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Start#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(ISODATE value);

} // Start
