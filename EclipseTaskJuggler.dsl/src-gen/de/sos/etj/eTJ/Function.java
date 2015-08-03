/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Function#getLevel <em>Level</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Function#getDate <em>Date</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Function#getScenario <em>Scenario</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Function#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Function#getTask <em>Task</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Function#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Function#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see de.sos.etj.eTJ.ETJPackage#getFunction_Level()
   * @model
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Function#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' containment reference.
   * @see #setDate(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getFunction_Date()
   * @model containment="true"
   * @generated
   */
  ISODATE getDate();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Function#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(ISODATE value);

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
   * @see de.sos.etj.eTJ.ETJPackage#getFunction_Scenario()
   * @model
   * @generated
   */
  Scenario getScenario();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Function#getScenario <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' reference.
   * @see #getScenario()
   * @generated
   */
  void setScenario(Scenario value);

  /**
   * Returns the value of the '<em><b>Parent Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Id</em>' attribute.
   * @see #setParentId(String)
   * @see de.sos.etj.eTJ.ETJPackage#getFunction_ParentId()
   * @model
   * @generated
   */
  String getParentId();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Function#getParentId <em>Parent Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Id</em>' attribute.
   * @see #getParentId()
   * @generated
   */
  void setParentId(String value);

  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(Task)
   * @see de.sos.etj.eTJ.ETJPackage#getFunction_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Function#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance</em>' attribute.
   * @see #setDistance(int)
   * @see de.sos.etj.eTJ.ETJPackage#getFunction_Distance()
   * @model
   * @generated
   */
  int getDistance();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Function#getDistance <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance</em>' attribute.
   * @see #getDistance()
   * @generated
   */
  void setDistance(int value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see de.sos.etj.eTJ.ETJPackage#getFunction_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Function#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

} // Function
