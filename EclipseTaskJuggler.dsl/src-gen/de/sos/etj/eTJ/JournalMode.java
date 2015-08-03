/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.JournalMode#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getJournalMode()
 * @model
 * @generated
 */
public interface JournalMode extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.JournalModeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see de.sos.etj.eTJ.JournalModeValue
   * @see #setMode(JournalModeValue)
   * @see de.sos.etj.eTJ.ETJPackage#getJournalMode_Mode()
   * @model
   * @generated
   */
  JournalModeValue getMode();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.JournalMode#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see de.sos.etj.eTJ.JournalModeValue
   * @see #getMode()
   * @generated
   */
  void setMode(JournalModeValue value);

} // JournalMode
