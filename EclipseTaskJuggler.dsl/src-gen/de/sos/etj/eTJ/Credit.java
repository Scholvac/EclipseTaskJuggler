/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Credit#getDate <em>Date</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Credit#getDescription <em>Description</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Credit#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getCredit()
 * @model
 * @generated
 */
public interface Credit extends AccountAttribute
{
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
   * @see de.sos.etj.eTJ.ETJPackage#getCredit_Date()
   * @model containment="true"
   * @generated
   */
  ISODATE getDate();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Credit#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(ISODATE value);

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
   * @see de.sos.etj.eTJ.ETJPackage#getCredit_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Credit#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(float)
   * @see de.sos.etj.eTJ.ETJPackage#getCredit_Amount()
   * @model
   * @generated
   */
  float getAmount();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Credit#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(float value);

} // Credit
