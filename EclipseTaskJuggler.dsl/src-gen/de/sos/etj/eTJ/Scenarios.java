/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenarios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Scenarios#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getScenarios()
 * @model
 * @generated
 */
public interface Scenarios extends ReportAttribute, ExportAttribute
{
  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.Scenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getScenarios_Scenarios()
   * @model
   * @generated
   */
  EList<Scenario> getScenarios();

} // Scenarios
