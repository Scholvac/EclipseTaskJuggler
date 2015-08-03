/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.Account;
import de.sos.etj.eTJ.AccountRoot;
import de.sos.etj.eTJ.ETJPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.AccountRootImpl#getAccount <em>Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountRootImpl extends ReportAttributeImpl implements AccountRoot
{
  /**
   * The cached value of the '{@link #getAccount() <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected Account account;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccountRootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ETJPackage.eINSTANCE.getAccountRoot();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account getAccount()
  {
    if (account != null && account.eIsProxy())
    {
      InternalEObject oldAccount = (InternalEObject)account;
      account = (Account)eResolveProxy(oldAccount);
      if (account != oldAccount)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.ACCOUNT_ROOT__ACCOUNT, oldAccount, account));
      }
    }
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account basicGetAccount()
  {
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccount(Account newAccount)
  {
    Account oldAccount = account;
    account = newAccount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.ACCOUNT_ROOT__ACCOUNT, oldAccount, account));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ETJPackage.ACCOUNT_ROOT__ACCOUNT:
        if (resolve) return getAccount();
        return basicGetAccount();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ETJPackage.ACCOUNT_ROOT__ACCOUNT:
        setAccount((Account)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ETJPackage.ACCOUNT_ROOT__ACCOUNT:
        setAccount((Account)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ETJPackage.ACCOUNT_ROOT__ACCOUNT:
        return account != null;
    }
    return super.eIsSet(featureID);
  }

} //AccountRootImpl
