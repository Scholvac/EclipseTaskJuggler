/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.Booking;
import de.sos.etj.eTJ.BookingTask;
import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.BookingTaskImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.BookingTaskImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingTaskImpl extends MinimalEObjectImpl.Container implements BookingTask
{
  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected Resource resource;

  /**
   * The cached value of the '{@link #getBooking() <em>Booking</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooking()
   * @generated
   * @ordered
   */
  protected Booking booking;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BookingTaskImpl()
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
    return ETJPackage.eINSTANCE.getBookingTask();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource getResource()
  {
    if (resource != null && resource.eIsProxy())
    {
      InternalEObject oldResource = (InternalEObject)resource;
      resource = (Resource)eResolveProxy(oldResource);
      if (resource != oldResource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.BOOKING_TASK__RESOURCE, oldResource, resource));
      }
    }
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource basicGetResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(Resource newResource)
  {
    Resource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.BOOKING_TASK__RESOURCE, oldResource, resource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Booking getBooking()
  {
    return booking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooking(Booking newBooking, NotificationChain msgs)
  {
    Booking oldBooking = booking;
    booking = newBooking;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.BOOKING_TASK__BOOKING, oldBooking, newBooking);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooking(Booking newBooking)
  {
    if (newBooking != booking)
    {
      NotificationChain msgs = null;
      if (booking != null)
        msgs = ((InternalEObject)booking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.BOOKING_TASK__BOOKING, null, msgs);
      if (newBooking != null)
        msgs = ((InternalEObject)newBooking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.BOOKING_TASK__BOOKING, null, msgs);
      msgs = basicSetBooking(newBooking, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.BOOKING_TASK__BOOKING, newBooking, newBooking));
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
      case ETJPackage.BOOKING_TASK__BOOKING:
        return basicSetBooking(null, msgs);
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
      case ETJPackage.BOOKING_TASK__RESOURCE:
        if (resolve) return getResource();
        return basicGetResource();
      case ETJPackage.BOOKING_TASK__BOOKING:
        return getBooking();
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
      case ETJPackage.BOOKING_TASK__RESOURCE:
        setResource((Resource)newValue);
        return;
      case ETJPackage.BOOKING_TASK__BOOKING:
        setBooking((Booking)newValue);
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
      case ETJPackage.BOOKING_TASK__RESOURCE:
        setResource((Resource)null);
        return;
      case ETJPackage.BOOKING_TASK__BOOKING:
        setBooking((Booking)null);
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
      case ETJPackage.BOOKING_TASK__RESOURCE:
        return resource != null;
      case ETJPackage.BOOKING_TASK__BOOKING:
        return booking != null;
    }
    return super.eIsSet(featureID);
  }

} //BookingTaskImpl