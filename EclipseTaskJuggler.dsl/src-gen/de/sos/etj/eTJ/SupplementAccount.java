/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplement Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.SupplementAccount#getAccount <em>Account</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.SupplementAccount#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getSupplementAccount()
 * @model
 * @generated
 */
public interface SupplementAccount extends Property
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
   * @see de.sos.etj.eTJ.ETJPackage#getSupplementAccount_Account()
   * @model
   * @generated
   */
  Account getAccount();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.SupplementAccount#getAccount <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account</em>' reference.
   * @see #getAccount()
   * @generated
   */
  void setAccount(Account value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.AccountAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getSupplementAccount_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AccountAttribute> getAttributes();

} // SupplementAccount
