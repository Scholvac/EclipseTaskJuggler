/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timezone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Timezone#getTimezone <em>Timezone</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getTimezone()
 * @model
 * @generated
 */
public interface Timezone extends ProjectAttribute, ReportAttribute, ExportAttribute
{
  /**
   * Returns the value of the '<em><b>Timezone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timezone</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timezone</em>' attribute.
   * @see #setTimezone(String)
   * @see de.sos.etj.eTJ.ETJPackage#getTimezone_Timezone()
   * @model
   * @generated
   */
  String getTimezone();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Timezone#getTimezone <em>Timezone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timezone</em>' attribute.
   * @see #getTimezone()
   * @generated
   */
  void setTimezone(String value);

} // Timezone
