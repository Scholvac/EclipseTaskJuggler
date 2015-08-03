/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.RealFormat#getNegativePrefix <em>Negative Prefix</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.RealFormat#getNegativeSuffix <em>Negative Suffix</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.RealFormat#getThousandsSeparator <em>Thousands Separator</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.RealFormat#getFractionSeparator <em>Fraction Separator</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.RealFormat#getFractionDigits <em>Fraction Digits</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getRealFormat()
 * @model
 * @generated
 */
public interface RealFormat extends CurrencyFormat, NumberFormat
{
  /**
   * Returns the value of the '<em><b>Negative Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negative Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative Prefix</em>' attribute.
   * @see #setNegativePrefix(String)
   * @see de.sos.etj.eTJ.ETJPackage#getRealFormat_NegativePrefix()
   * @model
   * @generated
   */
  String getNegativePrefix();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.RealFormat#getNegativePrefix <em>Negative Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative Prefix</em>' attribute.
   * @see #getNegativePrefix()
   * @generated
   */
  void setNegativePrefix(String value);

  /**
   * Returns the value of the '<em><b>Negative Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negative Suffix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative Suffix</em>' attribute.
   * @see #setNegativeSuffix(String)
   * @see de.sos.etj.eTJ.ETJPackage#getRealFormat_NegativeSuffix()
   * @model
   * @generated
   */
  String getNegativeSuffix();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.RealFormat#getNegativeSuffix <em>Negative Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative Suffix</em>' attribute.
   * @see #getNegativeSuffix()
   * @generated
   */
  void setNegativeSuffix(String value);

  /**
   * Returns the value of the '<em><b>Thousands Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thousands Separator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thousands Separator</em>' attribute.
   * @see #setThousandsSeparator(String)
   * @see de.sos.etj.eTJ.ETJPackage#getRealFormat_ThousandsSeparator()
   * @model
   * @generated
   */
  String getThousandsSeparator();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.RealFormat#getThousandsSeparator <em>Thousands Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thousands Separator</em>' attribute.
   * @see #getThousandsSeparator()
   * @generated
   */
  void setThousandsSeparator(String value);

  /**
   * Returns the value of the '<em><b>Fraction Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fraction Separator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fraction Separator</em>' attribute.
   * @see #setFractionSeparator(String)
   * @see de.sos.etj.eTJ.ETJPackage#getRealFormat_FractionSeparator()
   * @model
   * @generated
   */
  String getFractionSeparator();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.RealFormat#getFractionSeparator <em>Fraction Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fraction Separator</em>' attribute.
   * @see #getFractionSeparator()
   * @generated
   */
  void setFractionSeparator(String value);

  /**
   * Returns the value of the '<em><b>Fraction Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fraction Digits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fraction Digits</em>' attribute.
   * @see #setFractionDigits(int)
   * @see de.sos.etj.eTJ.ETJPackage#getRealFormat_FractionDigits()
   * @model
   * @generated
   */
  int getFractionDigits();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.RealFormat#getFractionDigits <em>Fraction Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fraction Digits</em>' attribute.
   * @see #getFractionDigits()
   * @generated
   */
  void setFractionDigits(int value);

} // RealFormat
