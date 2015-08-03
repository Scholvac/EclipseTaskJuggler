/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.LoadUnit#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLoadUnit()
 * @model
 * @generated
 */
public interface LoadUnit extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.LoadDisplayUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see de.sos.etj.eTJ.LoadDisplayUnit
   * @see #setUnit(LoadDisplayUnit)
   * @see de.sos.etj.eTJ.ETJPackage#getLoadUnit_Unit()
   * @model
   * @generated
   */
  LoadDisplayUnit getUnit();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LoadUnit#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see de.sos.etj.eTJ.LoadDisplayUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(LoadDisplayUnit value);

} // LoadUnit
