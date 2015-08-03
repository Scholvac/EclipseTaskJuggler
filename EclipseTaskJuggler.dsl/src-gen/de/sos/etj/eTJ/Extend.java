/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Extend#getName <em>Name</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Extend#getDescription <em>Description</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Extend#isInherit <em>Inherit</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Extend#isScenariospecific <em>Scenariospecific</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.sos.etj.eTJ.ETJPackage#getExtend_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Extend#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see de.sos.etj.eTJ.ETJPackage#getExtend_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Extend#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Inherit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inherit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inherit</em>' attribute.
   * @see #setInherit(boolean)
   * @see de.sos.etj.eTJ.ETJPackage#getExtend_Inherit()
   * @model
   * @generated
   */
  boolean isInherit();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Extend#isInherit <em>Inherit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inherit</em>' attribute.
   * @see #isInherit()
   * @generated
   */
  void setInherit(boolean value);

  /**
   * Returns the value of the '<em><b>Scenariospecific</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenariospecific</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenariospecific</em>' attribute.
   * @see #setScenariospecific(boolean)
   * @see de.sos.etj.eTJ.ETJPackage#getExtend_Scenariospecific()
   * @model
   * @generated
   */
  boolean isScenariospecific();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Extend#isScenariospecific <em>Scenariospecific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenariospecific</em>' attribute.
   * @see #isScenariospecific()
   * @generated
   */
  void setScenariospecific(boolean value);

} // Extend
