/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.DurationQuantity;
import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Effort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.EffortImpl#getEffort <em>Effort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffortImpl extends MinimalEObjectImpl.Container implements Effort
{
  /**
   * The cached value of the '{@link #getEffort() <em>Effort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffort()
   * @generated
   * @ordered
   */
  protected DurationQuantity effort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffortImpl()
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
    return ETJPackage.eINSTANCE.getEffort();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DurationQuantity getEffort()
  {
    return effort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEffort(DurationQuantity newEffort, NotificationChain msgs)
  {
    DurationQuantity oldEffort = effort;
    effort = newEffort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.EFFORT__EFFORT, oldEffort, newEffort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffort(DurationQuantity newEffort)
  {
    if (newEffort != effort)
    {
      NotificationChain msgs = null;
      if (effort != null)
        msgs = ((InternalEObject)effort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.EFFORT__EFFORT, null, msgs);
      if (newEffort != null)
        msgs = ((InternalEObject)newEffort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.EFFORT__EFFORT, null, msgs);
      msgs = basicSetEffort(newEffort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.EFFORT__EFFORT, newEffort, newEffort));
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
      case ETJPackage.EFFORT__EFFORT:
        return basicSetEffort(null, msgs);
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
      case ETJPackage.EFFORT__EFFORT:
        return getEffort();
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
      case ETJPackage.EFFORT__EFFORT:
        setEffort((DurationQuantity)newValue);
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
      case ETJPackage.EFFORT__EFFORT:
        setEffort((DurationQuantity)null);
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
      case ETJPackage.EFFORT__EFFORT:
        return effort != null;
    }
    return super.eIsSet(featureID);
  }

} //EffortImpl
