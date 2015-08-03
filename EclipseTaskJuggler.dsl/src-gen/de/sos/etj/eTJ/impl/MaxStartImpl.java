/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.ISODATE;
import de.sos.etj.eTJ.MaxStart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.MaxStartImpl#getMaxStart <em>Max Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxStartImpl extends MinimalEObjectImpl.Container implements MaxStart
{
  /**
   * The cached value of the '{@link #getMaxStart() <em>Max Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxStart()
   * @generated
   * @ordered
   */
  protected ISODATE maxStart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaxStartImpl()
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
    return ETJPackage.eINSTANCE.getMaxStart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISODATE getMaxStart()
  {
    return maxStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxStart(ISODATE newMaxStart, NotificationChain msgs)
  {
    ISODATE oldMaxStart = maxStart;
    maxStart = newMaxStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.MAX_START__MAX_START, oldMaxStart, newMaxStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxStart(ISODATE newMaxStart)
  {
    if (newMaxStart != maxStart)
    {
      NotificationChain msgs = null;
      if (maxStart != null)
        msgs = ((InternalEObject)maxStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.MAX_START__MAX_START, null, msgs);
      if (newMaxStart != null)
        msgs = ((InternalEObject)newMaxStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.MAX_START__MAX_START, null, msgs);
      msgs = basicSetMaxStart(newMaxStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.MAX_START__MAX_START, newMaxStart, newMaxStart));
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
      case ETJPackage.MAX_START__MAX_START:
        return basicSetMaxStart(null, msgs);
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
      case ETJPackage.MAX_START__MAX_START:
        return getMaxStart();
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
      case ETJPackage.MAX_START__MAX_START:
        setMaxStart((ISODATE)newValue);
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
      case ETJPackage.MAX_START__MAX_START:
        setMaxStart((ISODATE)null);
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
      case ETJPackage.MAX_START__MAX_START:
        return maxStart != null;
    }
    return super.eIsSet(featureID);
  }

} //MaxStartImpl
