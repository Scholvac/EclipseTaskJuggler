/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.DurationQuantity#getValue <em>Value</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.DurationQuantity#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getDurationQuantity()
 * @model
 * @generated
 */
public interface DurationQuantity extends GapDuration, GapLength
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
   * @see de.sos.etj.eTJ.ETJPackage#getDurationQuantity_Value()
   * @model
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.DurationQuantity#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.TimeUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see de.sos.etj.eTJ.TimeUnit
   * @see #setUnit(TimeUnit)
   * @see de.sos.etj.eTJ.ETJPackage#getDurationQuantity_Unit()
   * @model
   * @generated
   */
  TimeUnit getUnit();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.DurationQuantity#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see de.sos.etj.eTJ.TimeUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(TimeUnit value);

} // DurationQuantity
