/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.ISODATE;
import de.sos.etj.eTJ.Interval1;
import de.sos.etj.eTJ.LimitAttribute;
import de.sos.etj.eTJ.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.LimitAttributeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.LimitAttributeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.LimitAttributeImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.LimitAttributeImpl#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitAttributeImpl extends MinimalEObjectImpl.Container implements LimitAttribute
{
  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected ISODATE end;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected Interval1 period;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected ISODATE start;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LimitAttributeImpl()
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
    return ETJPackage.eINSTANCE.getLimitAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISODATE getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(ISODATE newEnd, NotificationChain msgs)
  {
    ISODATE oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.LIMIT_ATTRIBUTE__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(ISODATE newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LIMIT_ATTRIBUTE__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LIMIT_ATTRIBUTE__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.LIMIT_ATTRIBUTE__END, newEnd, newEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval1 getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPeriod(Interval1 newPeriod, NotificationChain msgs)
  {
    Interval1 oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.LIMIT_ATTRIBUTE__PERIOD, oldPeriod, newPeriod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(Interval1 newPeriod)
  {
    if (newPeriod != period)
    {
      NotificationChain msgs = null;
      if (period != null)
        msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LIMIT_ATTRIBUTE__PERIOD, null, msgs);
      if (newPeriod != null)
        msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LIMIT_ATTRIBUTE__PERIOD, null, msgs);
      msgs = basicSetPeriod(newPeriod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.LIMIT_ATTRIBUTE__PERIOD, newPeriod, newPeriod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectResolvingEList<Resource>(Resource.class, this, ETJPackage.LIMIT_ATTRIBUTE__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISODATE getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(ISODATE newStart, NotificationChain msgs)
  {
    ISODATE oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.LIMIT_ATTRIBUTE__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(ISODATE newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LIMIT_ATTRIBUTE__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LIMIT_ATTRIBUTE__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.LIMIT_ATTRIBUTE__START, newStart, newStart));
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
      case ETJPackage.LIMIT_ATTRIBUTE__END:
        return basicSetEnd(null, msgs);
      case ETJPackage.LIMIT_ATTRIBUTE__PERIOD:
        return basicSetPeriod(null, msgs);
      case ETJPackage.LIMIT_ATTRIBUTE__START:
        return basicSetStart(null, msgs);
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
      case ETJPackage.LIMIT_ATTRIBUTE__END:
        return getEnd();
      case ETJPackage.LIMIT_ATTRIBUTE__PERIOD:
        return getPeriod();
      case ETJPackage.LIMIT_ATTRIBUTE__RESOURCES:
        return getResources();
      case ETJPackage.LIMIT_ATTRIBUTE__START:
        return getStart();
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
      case ETJPackage.LIMIT_ATTRIBUTE__END:
        setEnd((ISODATE)newValue);
        return;
      case ETJPackage.LIMIT_ATTRIBUTE__PERIOD:
        setPeriod((Interval1)newValue);
        return;
      case ETJPackage.LIMIT_ATTRIBUTE__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
        return;
      case ETJPackage.LIMIT_ATTRIBUTE__START:
        setStart((ISODATE)newValue);
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
      case ETJPackage.LIMIT_ATTRIBUTE__END:
        setEnd((ISODATE)null);
        return;
      case ETJPackage.LIMIT_ATTRIBUTE__PERIOD:
        setPeriod((Interval1)null);
        return;
      case ETJPackage.LIMIT_ATTRIBUTE__RESOURCES:
        getResources().clear();
        return;
      case ETJPackage.LIMIT_ATTRIBUTE__START:
        setStart((ISODATE)null);
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
      case ETJPackage.LIMIT_ATTRIBUTE__END:
        return end != null;
      case ETJPackage.LIMIT_ATTRIBUTE__PERIOD:
        return period != null;
      case ETJPackage.LIMIT_ATTRIBUTE__RESOURCES:
        return resources != null && !resources.isEmpty();
      case ETJPackage.LIMIT_ATTRIBUTE__START:
        return start != null;
    }
    return super.eIsSet(featureID);
  }

} //LimitAttributeImpl
