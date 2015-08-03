/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Work#getValue <em>Value</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Work#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getWork()
 * @model
 * @generated
 */
public interface Work extends NewTaskAttribute, TaskTimesheetAttribute
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(float)
   * @see de.sos.etj.eTJ.ETJPackage#getWork_Value()
   * @model
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Work#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.WorkQuantityUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see de.sos.etj.eTJ.WorkQuantityUnit
   * @see #setUnit(WorkQuantityUnit)
   * @see de.sos.etj.eTJ.ETJPackage#getWork_Unit()
   * @model
   * @generated
   */
  WorkQuantityUnit getUnit();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Work#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see de.sos.etj.eTJ.WorkQuantityUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(WorkQuantityUnit value);

} // Work
