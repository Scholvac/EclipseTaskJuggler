/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.AccountShare;
import de.sos.etj.eTJ.ChargeSet;
import de.sos.etj.eTJ.ETJPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.ChargeSetImpl#getAccountShares <em>Account Shares</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeSetImpl extends MinimalEObjectImpl.Container implements ChargeSet
{
  /**
   * The cached value of the '{@link #getAccountShares() <em>Account Shares</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccountShares()
   * @generated
   * @ordered
   */
  protected EList<AccountShare> accountShares;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChargeSetImpl()
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
    return ETJPackage.eINSTANCE.getChargeSet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AccountShare> getAccountShares()
  {
    if (accountShares == null)
    {
      accountShares = new EObjectContainmentEList<AccountShare>(AccountShare.class, this, ETJPackage.CHARGE_SET__ACCOUNT_SHARES);
    }
    return accountShares;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ETJPackage.CHARGE_SET__ACCOUNT_SHARES:
        return ((InternalEList<?>)getAccountShares()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ETJPackage.CHARGE_SET__ACCOUNT_SHARES:
        return getAccountShares();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ETJPackage.CHARGE_SET__ACCOUNT_SHARES:
        getAccountShares().clear();
        getAccountShares().addAll((Collection<? extends AccountShare>)newValue);
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
      case ETJPackage.CHARGE_SET__ACCOUNT_SHARES:
        getAccountShares().clear();
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
      case ETJPackage.CHARGE_SET__ACCOUNT_SHARES:
        return accountShares != null && !accountShares.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChargeSetImpl
