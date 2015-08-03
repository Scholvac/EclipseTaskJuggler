/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Ical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ScenarioIcal#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getScenarioIcal()
 * @model
 * @generated
 */
public interface ScenarioIcal extends IcalReportAttribute
{
  /**
   * Returns the value of the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenario</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario</em>' reference.
   * @see #setScenario(Scenario)
   * @see de.sos.etj.eTJ.ETJPackage#getScenarioIcal_Scenario()
   * @model
   * @generated
   */
  Scenario getScenario();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.ScenarioIcal#getScenario <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' reference.
   * @see #getScenario()
   * @generated
   */
  void setScenario(Scenario value);

} // ScenarioIcal
