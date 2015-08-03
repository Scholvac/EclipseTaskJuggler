/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purge Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.PurgeReport#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getPurgeReport()
 * @model
 * @generated
 */
public interface PurgeReport extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>List Attribute</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.PurgeReportAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Attribute</em>' attribute.
   * @see de.sos.etj.eTJ.PurgeReportAttribute
   * @see #setListAttribute(PurgeReportAttribute)
   * @see de.sos.etj.eTJ.ETJPackage#getPurgeReport_ListAttribute()
   * @model
   * @generated
   */
  PurgeReportAttribute getListAttribute();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.PurgeReport#getListAttribute <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Attribute</em>' attribute.
   * @see de.sos.etj.eTJ.PurgeReportAttribute
   * @see #getListAttribute()
   * @generated
   */
  void setListAttribute(PurgeReportAttribute value);

} // PurgeReport
