/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.EndCredit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Credit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.EndCreditImpl#getCredit <em>Credit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndCreditImpl extends MinimalEObjectImpl.Container implements EndCredit
{
  /**
   * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCredit()
   * @generated
   * @ordered
   */
  protected static final float CREDIT_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCredit()
   * @generated
   * @ordered
   */
  protected float credit = CREDIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndCreditImpl()
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
    return ETJPackage.eINSTANCE.getEndCredit();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getCredit()
  {
    return credit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCredit(float newCredit)
  {
    float oldCredit = credit;
    credit = newCredit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.END_CREDIT__CREDIT, oldCredit, credit));
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
      case ETJPackage.END_CREDIT__CREDIT:
        return getCredit();
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
      case ETJPackage.END_CREDIT__CREDIT:
        setCredit((Float)newValue);
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
      case ETJPackage.END_CREDIT__CREDIT:
        setCredit(CREDIT_EDEFAULT);
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
      case ETJPackage.END_CREDIT__CREDIT:
        return credit != CREDIT_EDEFAULT;
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
    result.append(" (credit: ");
    result.append(credit);
    result.append(')');
    return result.toString();
  }

} //EndCreditImpl
