/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.TimeFormat#getTimeformat <em>Timeformat</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getTimeFormat()
 * @model
 * @generated
 */
public interface TimeFormat extends ProjectAttribute, ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Timeformat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeformat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeformat</em>' attribute.
   * @see #setTimeformat(String)
   * @see de.sos.etj.eTJ.ETJPackage#getTimeFormat_Timeformat()
   * @model
   * @generated
   */
  String getTimeformat();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.TimeFormat#getTimeformat <em>Timeformat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeformat</em>' attribute.
   * @see #getTimeformat()
   * @generated
   */
  void setTimeformat(String value);

} // TimeFormat
