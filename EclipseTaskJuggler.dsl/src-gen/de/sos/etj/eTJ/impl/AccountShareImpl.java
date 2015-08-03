/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.Account;
import de.sos.etj.eTJ.AccountShare;
import de.sos.etj.eTJ.ETJPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Share</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.AccountShareImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.AccountShareImpl#getShare <em>Share</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountShareImpl extends MinimalEObjectImpl.Container implements AccountShare
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
   * The default value of the '{@link #getShare() <em>Share</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShare()
   * @generated
   * @ordered
   */
  protected static final float SHARE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getShare() <em>Share</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShare()
   * @generated
   * @ordered
   */
  protected float share = SHARE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccountShareImpl()
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
    return ETJPackage.eINSTANCE.getAccountShare();
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.ACCOUNT_SHARE__ACCOUNT, oldAccount, account));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.ACCOUNT_SHARE__ACCOUNT, oldAccount, account));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getShare()
  {
    return share;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShare(float newShare)
  {
    float oldShare = share;
    share = newShare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.ACCOUNT_SHARE__SHARE, oldShare, share));
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
      case ETJPackage.ACCOUNT_SHARE__ACCOUNT:
        if (resolve) return getAccount();
        return basicGetAccount();
      case ETJPackage.ACCOUNT_SHARE__SHARE:
        return getShare();
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
      case ETJPackage.ACCOUNT_SHARE__ACCOUNT:
        setAccount((Account)newValue);
        return;
      case ETJPackage.ACCOUNT_SHARE__SHARE:
        setShare((Float)newValue);
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
      case ETJPackage.ACCOUNT_SHARE__ACCOUNT:
        setAccount((Account)null);
        return;
      case ETJPackage.ACCOUNT_SHARE__SHARE:
        setShare(SHARE_EDEFAULT);
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
      case ETJPackage.ACCOUNT_SHARE__ACCOUNT:
        return account != null;
      case ETJPackage.ACCOUNT_SHARE__SHARE:
        return share != SHARE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (share: ");
    result.append(share);
    result.append(')');
    return result.toString();
  }

} //AccountShareImpl
