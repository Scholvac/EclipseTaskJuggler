/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.Booking;
import de.sos.etj.eTJ.BookingResource;
import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.BookingResourceImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.BookingResourceImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingResourceImpl extends ResourceAttributeImpl implements BookingResource
{
  /**
   * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTask()
   * @generated
   * @ordered
   */
  protected Task task;

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
  protected BookingResourceImpl()
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
    return ETJPackage.eINSTANCE.getBookingResource();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getTask()
  {
    if (task != null && task.eIsProxy())
    {
      InternalEObject oldTask = (InternalEObject)task;
      task = (Task)eResolveProxy(oldTask);
      if (task != oldTask)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.BOOKING_RESOURCE__TASK, oldTask, task));
      }
    }
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task basicGetTask()
  {
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTask(Task newTask)
  {
    Task oldTask = task;
    task = newTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.BOOKING_RESOURCE__TASK, oldTask, task));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.BOOKING_RESOURCE__BOOKING, oldBooking, newBooking);
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
        msgs = ((InternalEObject)booking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.BOOKING_RESOURCE__BOOKING, null, msgs);
      if (newBooking != null)
        msgs = ((InternalEObject)newBooking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.BOOKING_RESOURCE__BOOKING, null, msgs);
      msgs = basicSetBooking(newBooking, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.BOOKING_RESOURCE__BOOKING, newBooking, newBooking));
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
      case ETJPackage.BOOKING_RESOURCE__BOOKING:
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
      case ETJPackage.BOOKING_RESOURCE__TASK:
        if (resolve) return getTask();
        return basicGetTask();
      case ETJPackage.BOOKING_RESOURCE__BOOKING:
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
      case ETJPackage.BOOKING_RESOURCE__TASK:
        setTask((Task)newValue);
        return;
      case ETJPackage.BOOKING_RESOURCE__BOOKING:
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
      case ETJPackage.BOOKING_RESOURCE__TASK:
        setTask((Task)null);
        return;
      case ETJPackage.BOOKING_RESOURCE__BOOKING:
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
      case ETJPackage.BOOKING_RESOURCE__TASK:
        return task != null;
      case ETJPackage.BOOKING_RESOURCE__BOOKING:
        return booking != null;
    }
    return super.eIsSet(featureID);
  }

} //BookingResourceImpl
