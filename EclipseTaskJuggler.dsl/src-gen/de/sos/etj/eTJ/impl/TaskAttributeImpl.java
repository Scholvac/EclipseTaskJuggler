/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Scenario;
import de.sos.etj.eTJ.TaskAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.TaskAttributeImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.TaskAttributeImpl#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskAttributeImpl extends MinimalEObjectImpl.Container implements TaskAttribute
{
  /**
   * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenario()
   * @generated
   * @ordered
   */
  protected Scenario scenario;

  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected EObject attr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskAttributeImpl()
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
    return ETJPackage.eINSTANCE.getTaskAttribute();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario getScenario()
  {
    if (scenario != null && scenario.eIsProxy())
    {
      InternalEObject oldScenario = (InternalEObject)scenario;
      scenario = (Scenario)eResolveProxy(oldScenario);
      if (scenario != oldScenario)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.TASK_ATTRIBUTE__SCENARIO, oldScenario, scenario));
      }
    }
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario basicGetScenario()
  {
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScenario(Scenario newScenario)
  {
    Scenario oldScenario = scenario;
    scenario = newScenario;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.TASK_ATTRIBUTE__SCENARIO, oldScenario, scenario));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getAttr()
  {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttr(EObject newAttr, NotificationChain msgs)
  {
    EObject oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.TASK_ATTRIBUTE__ATTR, oldAttr, newAttr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(EObject newAttr)
  {
    if (newAttr != attr)
    {
      NotificationChain msgs = null;
      if (attr != null)
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.TASK_ATTRIBUTE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.TASK_ATTRIBUTE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.TASK_ATTRIBUTE__ATTR, newAttr, newAttr));
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
      case ETJPackage.TASK_ATTRIBUTE__ATTR:
        return basicSetAttr(null, msgs);
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
      case ETJPackage.TASK_ATTRIBUTE__SCENARIO:
        if (resolve) return getScenario();
        return basicGetScenario();
      case ETJPackage.TASK_ATTRIBUTE__ATTR:
        return getAttr();
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
      case ETJPackage.TASK_ATTRIBUTE__SCENARIO:
        setScenario((Scenario)newValue);
        return;
      case ETJPackage.TASK_ATTRIBUTE__ATTR:
        setAttr((EObject)newValue);
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
      case ETJPackage.TASK_ATTRIBUTE__SCENARIO:
        setScenario((Scenario)null);
        return;
      case ETJPackage.TASK_ATTRIBUTE__ATTR:
        setAttr((EObject)null);
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
      case ETJPackage.TASK_ATTRIBUTE__SCENARIO:
        return scenario != null;
      case ETJPackage.TASK_ATTRIBUTE__ATTR:
        return attr != null;
    }
    return super.eIsSet(featureID);
  }

} //TaskAttributeImpl
