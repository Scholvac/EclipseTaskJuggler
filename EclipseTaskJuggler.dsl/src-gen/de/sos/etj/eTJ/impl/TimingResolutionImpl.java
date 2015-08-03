/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.TimingResolution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.TimingResolutionImpl#getTimingResolution <em>Timing Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingResolutionImpl extends ProjectAttributeImpl implements TimingResolution
{
  /**
   * The default value of the '{@link #getTimingResolution() <em>Timing Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingResolution()
   * @generated
   * @ordered
   */
  protected static final int TIMING_RESOLUTION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimingResolution() <em>Timing Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingResolution()
   * @generated
   * @ordered
   */
  protected int timingResolution = TIMING_RESOLUTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimingResolutionImpl()
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
    return ETJPackage.eINSTANCE.getTimingResolution();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTimingResolution()
  {
    return timingResolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimingResolution(int newTimingResolution)
  {
    int oldTimingResolution = timingResolution;
    timingResolution = newTimingResolution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.TIMING_RESOLUTION__TIMING_RESOLUTION, oldTimingResolution, timingResolution));
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
      case ETJPackage.TIMING_RESOLUTION__TIMING_RESOLUTION:
        return getTimingResolution();
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
      case ETJPackage.TIMING_RESOLUTION__TIMING_RESOLUTION:
        setTimingResolution((Integer)newValue);
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
      case ETJPackage.TIMING_RESOLUTION__TIMING_RESOLUTION:
        setTimingResolution(TIMING_RESOLUTION_EDEFAULT);
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
      case ETJPackage.TIMING_RESOLUTION__TIMING_RESOLUTION:
        return timingResolution != TIMING_RESOLUTION_EDEFAULT;
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
    result.append(" (timingResolution: ");
    result.append(timingResolution);
    result.append(')');
    return result.toString();
  }

} //TimingResolutionImpl
