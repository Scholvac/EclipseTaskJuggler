/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.ISODATE;
import de.sos.etj.eTJ.MinStart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.MinStartImpl#getMinStart <em>Min Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinStartImpl extends MinimalEObjectImpl.Container implements MinStart
{
  /**
   * The cached value of the '{@link #getMinStart() <em>Min Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinStart()
   * @generated
   * @ordered
   */
  protected ISODATE minStart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MinStartImpl()
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
    return ETJPackage.eINSTANCE.getMinStart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISODATE getMinStart()
  {
    return minStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinStart(ISODATE newMinStart, NotificationChain msgs)
  {
    ISODATE oldMinStart = minStart;
    minStart = newMinStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.MIN_START__MIN_START, oldMinStart, newMinStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinStart(ISODATE newMinStart)
  {
    if (newMinStart != minStart)
    {
      NotificationChain msgs = null;
      if (minStart != null)
        msgs = ((InternalEObject)minStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.MIN_START__MIN_START, null, msgs);
      if (newMinStart != null)
        msgs = ((InternalEObject)newMinStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.MIN_START__MIN_START, null, msgs);
      msgs = basicSetMinStart(newMinStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.MIN_START__MIN_START, newMinStart, newMinStart));
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
      case ETJPackage.MIN_START__MIN_START:
        return basicSetMinStart(null, msgs);
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
      case ETJPackage.MIN_START__MIN_START:
        return getMinStart();
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
      case ETJPackage.MIN_START__MIN_START:
        setMinStart((ISODATE)newValue);
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
      case ETJPackage.MIN_START__MIN_START:
        setMinStart((ISODATE)null);
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
      case ETJPackage.MIN_START__MIN_START:
        return minStart != null;
    }
    return super.eIsSet(featureID);
  }

} //MinStartImpl
