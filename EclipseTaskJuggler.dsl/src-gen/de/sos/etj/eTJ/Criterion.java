/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Criterion#getScenario <em>Scenario</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Criterion#getColumnId <em>Column Id</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Criterion#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getCriterion()
 * @model
 * @generated
 */
public interface Criterion extends EObject
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
   * @see de.sos.etj.eTJ.ETJPackage#getCriterion_Scenario()
   * @model
   * @generated
   */
  Scenario getScenario();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Criterion#getScenario <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' reference.
   * @see #getScenario()
   * @generated
   */
  void setScenario(Scenario value);

  /**
   * Returns the value of the '<em><b>Column Id</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.ColumnId}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Id</em>' attribute.
   * @see de.sos.etj.eTJ.ColumnId
   * @see #setColumnId(ColumnId)
   * @see de.sos.etj.eTJ.ETJPackage#getCriterion_ColumnId()
   * @model
   * @generated
   */
  ColumnId getColumnId();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Criterion#getColumnId <em>Column Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Id</em>' attribute.
   * @see de.sos.etj.eTJ.ColumnId
   * @see #getColumnId()
   * @generated
   */
  void setColumnId(ColumnId value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.CriterionDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see de.sos.etj.eTJ.CriterionDirection
   * @see #setDirection(CriterionDirection)
   * @see de.sos.etj.eTJ.ETJPackage#getCriterion_Direction()
   * @model
   * @generated
   */
  CriterionDirection getDirection();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Criterion#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see de.sos.etj.eTJ.CriterionDirection
   * @see #getDirection()
   * @generated
   */
  void setDirection(CriterionDirection value);

} // Criterion
