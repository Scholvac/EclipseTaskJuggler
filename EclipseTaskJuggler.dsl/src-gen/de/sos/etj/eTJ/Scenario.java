/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Scenario#getId <em>Id</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Scenario#getActive <em>Active</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Scenario#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends ProjectAttribute
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.sos.etj.eTJ.ETJPackage#getScenario_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Scenario#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see de.sos.etj.eTJ.ETJPackage#getScenario_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Scenario#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.YesNo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' attribute.
   * @see de.sos.etj.eTJ.YesNo
   * @see #setActive(YesNo)
   * @see de.sos.etj.eTJ.ETJPackage#getScenario_Active()
   * @model
   * @generated
   */
  YesNo getActive();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Scenario#getActive <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active</em>' attribute.
   * @see de.sos.etj.eTJ.YesNo
   * @see #getActive()
   * @generated
   */
  void setActive(YesNo value);

  /**
   * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario</em>' containment reference.
   * @see #setScenario(Scenario)
   * @see de.sos.etj.eTJ.ETJPackage#getScenario_Scenario()
   * @model containment="true"
   * @generated
   */
  Scenario getScenario();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Scenario#getScenario <em>Scenario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' containment reference.
   * @see #getScenario()
   * @generated
   */
  void setScenario(Scenario value);

} // Scenario