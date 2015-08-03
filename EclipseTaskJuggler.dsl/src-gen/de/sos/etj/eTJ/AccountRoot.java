/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.AccountRoot#getAccount <em>Account</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getAccountRoot()
 * @model
 * @generated
 */
public interface AccountRoot extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account</em>' reference.
   * @see #setAccount(Account)
   * @see de.sos.etj.eTJ.ETJPackage#getAccountRoot_Account()
   * @model
   * @generated
   */
  Account getAccount();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.AccountRoot#getAccount <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account</em>' reference.
   * @see #getAccount()
   * @generated
   */
  void setAccount(Account value);

} // AccountRoot
