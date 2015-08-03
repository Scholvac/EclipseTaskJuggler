/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.YearlyWorkingDays;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yearly Working Days</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.YearlyWorkingDaysImpl#getYearlyWorkingDays <em>Yearly Working Days</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearlyWorkingDaysImpl extends ProjectAttributeImpl implements YearlyWorkingDays
{
  /**
   * The default value of the '{@link #getYearlyWorkingDays() <em>Yearly Working Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYearlyWorkingDays()
   * @generated
   * @ordered
   */
  protected static final int YEARLY_WORKING_DAYS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYearlyWorkingDays() <em>Yearly Working Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYearlyWorkingDays()
   * @generated
   * @ordered
   */
  protected int yearlyWorkingDays = YEARLY_WORKING_DAYS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YearlyWorkingDaysImpl()
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
    return ETJPackage.eINSTANCE.getYearlyWorkingDays();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getYearlyWorkingDays()
  {
    return yearlyWorkingDays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYearlyWorkingDays(int newYearlyWorkingDays)
  {
    int oldYearlyWorkingDays = yearlyWorkingDays;
    yearlyWorkingDays = newYearlyWorkingDays;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.YEARLY_WORKING_DAYS__YEARLY_WORKING_DAYS, oldYearlyWorkingDays, yearlyWorkingDays));
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
      case ETJPackage.YEARLY_WORKING_DAYS__YEARLY_WORKING_DAYS:
        return getYearlyWorkingDays();
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
      case ETJPackage.YEARLY_WORKING_DAYS__YEARLY_WORKING_DAYS:
        setYearlyWorkingDays((Integer)newValue);
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
      case ETJPackage.YEARLY_WORKING_DAYS__YEARLY_WORKING_DAYS:
        setYearlyWorkingDays(YEARLY_WORKING_DAYS_EDEFAULT);
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
      case ETJPackage.YEARLY_WORKING_DAYS__YEARLY_WORKING_DAYS:
        return yearlyWorkingDays != YEARLY_WORKING_DAYS_EDEFAULT;
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
    result.append(" (yearlyWorkingDays: ");
    result.append(yearlyWorkingDays);
    result.append(')');
    return result.toString();
  }

} //YearlyWorkingDaysImpl
