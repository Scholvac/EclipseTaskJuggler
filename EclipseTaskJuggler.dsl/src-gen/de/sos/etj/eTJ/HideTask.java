/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hide Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.HideTask#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getHideTask()
 * @model
 * @generated
 */
public interface HideTask extends ReportAttribute, IcalReportAttribute, ExportAttribute, NikuReportAttribute, StatusSheetReportAttribute
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(LogicalExpression)
   * @see de.sos.etj.eTJ.ETJPackage#getHideTask_Expression()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getExpression();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.HideTask#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LogicalExpression value);

} // HideTask
