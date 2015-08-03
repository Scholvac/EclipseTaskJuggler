/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.AccountShare#getAccount <em>Account</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.AccountShare#getShare <em>Share</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getAccountShare()
 * @model
 * @generated
 */
public interface AccountShare extends EObject
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
   * @see de.sos.etj.eTJ.ETJPackage#getAccountShare_Account()
   * @model
   * @generated
   */
  Account getAccount();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.AccountShare#getAccount <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account</em>' reference.
   * @see #getAccount()
   * @generated
   */
  void setAccount(Account value);

  /**
   * Returns the value of the '<em><b>Share</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Share</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Share</em>' attribute.
   * @see #setShare(float)
   * @see de.sos.etj.eTJ.ETJPackage#getAccountShare_Share()
   * @model
   * @generated
   */
  float getShare();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.AccountShare#getShare <em>Share</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Share</em>' attribute.
   * @see #getShare()
   * @generated
   */
  void setShare(float value);

} // AccountShare
