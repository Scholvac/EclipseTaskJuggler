/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.Account;
import de.sos.etj.eTJ.Balance;
import de.sos.etj.eTJ.ETJPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.BalanceImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.BalanceImpl#getRevenue <em>Revenue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BalanceImpl extends PropertyImpl implements Balance
{
  /**
   * The cached value of the '{@link #getCost() <em>Cost</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected Account cost;

  /**
   * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRevenue()
   * @generated
   * @ordered
   */
  protected Account revenue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BalanceImpl()
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
    return ETJPackage.eINSTANCE.getBalance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account getCost()
  {
    if (cost != null && cost.eIsProxy())
    {
      InternalEObject oldCost = (InternalEObject)cost;
      cost = (Account)eResolveProxy(oldCost);
      if (cost != oldCost)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.BALANCE__COST, oldCost, cost));
      }
    }
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account basicGetCost()
  {
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCost(Account newCost)
  {
    Account oldCost = cost;
    cost = newCost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.BALANCE__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account getRevenue()
  {
    if (revenue != null && revenue.eIsProxy())
    {
      InternalEObject oldRevenue = (InternalEObject)revenue;
      revenue = (Account)eResolveProxy(oldRevenue);
      if (revenue != oldRevenue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.BALANCE__REVENUE, oldRevenue, revenue));
      }
    }
    return revenue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account basicGetRevenue()
  {
    return revenue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRevenue(Account newRevenue)
  {
    Account oldRevenue = revenue;
    revenue = newRevenue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.BALANCE__REVENUE, oldRevenue, revenue));
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
      case ETJPackage.BALANCE__COST:
        if (resolve) return getCost();
        return basicGetCost();
      case ETJPackage.BALANCE__REVENUE:
        if (resolve) return getRevenue();
        return basicGetRevenue();
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
      case ETJPackage.BALANCE__COST:
        setCost((Account)newValue);
        return;
      case ETJPackage.BALANCE__REVENUE:
        setRevenue((Account)newValue);
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
      case ETJPackage.BALANCE__COST:
        setCost((Account)null);
        return;
      case ETJPackage.BALANCE__REVENUE:
        setRevenue((Account)null);
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
      case ETJPackage.BALANCE__COST:
        return cost != null;
      case ETJPackage.BALANCE__REVENUE:
        return revenue != null;
    }
    return super.eIsSet(featureID);
  }

} //BalanceImpl
