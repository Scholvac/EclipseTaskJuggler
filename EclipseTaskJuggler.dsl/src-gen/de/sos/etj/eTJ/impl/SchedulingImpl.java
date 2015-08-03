/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Scheduling;
import de.sos.etj.eTJ.SchedulingPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.SchedulingImpl#getScheduling <em>Scheduling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingImpl extends MinimalEObjectImpl.Container implements Scheduling
{
  /**
   * The default value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheduling()
   * @generated
   * @ordered
   */
  protected static final SchedulingPolicy SCHEDULING_EDEFAULT = SchedulingPolicy.ALAP;

  /**
   * The cached value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheduling()
   * @generated
   * @ordered
   */
  protected SchedulingPolicy scheduling = SCHEDULING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchedulingImpl()
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
    return ETJPackage.eINSTANCE.getScheduling();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchedulingPolicy getScheduling()
  {
    return scheduling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScheduling(SchedulingPolicy newScheduling)
  {
    SchedulingPolicy oldScheduling = scheduling;
    scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.SCHEDULING__SCHEDULING, oldScheduling, scheduling));
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
      case ETJPackage.SCHEDULING__SCHEDULING:
        return getScheduling();
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
      case ETJPackage.SCHEDULING__SCHEDULING:
        setScheduling((SchedulingPolicy)newValue);
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
      case ETJPackage.SCHEDULING__SCHEDULING:
        setScheduling(SCHEDULING_EDEFAULT);
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
      case ETJPackage.SCHEDULING__SCHEDULING:
        return scheduling != SCHEDULING_EDEFAULT;
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
    result.append(" (scheduling: ");
    result.append(scheduling);
    result.append(')');
    return result.toString();
  }

} //SchedulingImpl
