/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.ISODATE;
import de.sos.etj.eTJ.MaxEnd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.MaxEndImpl#getMaxEnd <em>Max End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxEndImpl extends MinimalEObjectImpl.Container implements MaxEnd
{
  /**
   * The cached value of the '{@link #getMaxEnd() <em>Max End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxEnd()
   * @generated
   * @ordered
   */
  protected ISODATE maxEnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaxEndImpl()
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
    return ETJPackage.eINSTANCE.getMaxEnd();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISODATE getMaxEnd()
  {
    return maxEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxEnd(ISODATE newMaxEnd, NotificationChain msgs)
  {
    ISODATE oldMaxEnd = maxEnd;
    maxEnd = newMaxEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.MAX_END__MAX_END, oldMaxEnd, newMaxEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxEnd(ISODATE newMaxEnd)
  {
    if (newMaxEnd != maxEnd)
    {
      NotificationChain msgs = null;
      if (maxEnd != null)
        msgs = ((InternalEObject)maxEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.MAX_END__MAX_END, null, msgs);
      if (newMaxEnd != null)
        msgs = ((InternalEObject)newMaxEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.MAX_END__MAX_END, null, msgs);
      msgs = basicSetMaxEnd(newMaxEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.MAX_END__MAX_END, newMaxEnd, newMaxEnd));
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
      case ETJPackage.MAX_END__MAX_END:
        return basicSetMaxEnd(null, msgs);
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
      case ETJPackage.MAX_END__MAX_END:
        return getMaxEnd();
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
      case ETJPackage.MAX_END__MAX_END:
        setMaxEnd((ISODATE)newValue);
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
      case ETJPackage.MAX_END__MAX_END:
        setMaxEnd((ISODATE)null);
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
      case ETJPackage.MAX_END__MAX_END:
        return maxEnd != null;
    }
    return super.eIsSet(featureID);
  }

} //MaxEndImpl
