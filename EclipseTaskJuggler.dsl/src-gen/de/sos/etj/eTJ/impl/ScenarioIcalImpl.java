/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Scenario;
import de.sos.etj.eTJ.ScenarioIcal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Ical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.ScenarioIcalImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioIcalImpl extends IcalReportAttributeImpl implements ScenarioIcal
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioIcalImpl()
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
    return ETJPackage.eINSTANCE.getScenarioIcal();
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.SCENARIO_ICAL__SCENARIO, oldScenario, scenario));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.SCENARIO_ICAL__SCENARIO, oldScenario, scenario));
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
      case ETJPackage.SCENARIO_ICAL__SCENARIO:
        if (resolve) return getScenario();
        return basicGetScenario();
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
      case ETJPackage.SCENARIO_ICAL__SCENARIO:
        setScenario((Scenario)newValue);
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
      case ETJPackage.SCENARIO_ICAL__SCENARIO:
        setScenario((Scenario)null);
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
      case ETJPackage.SCENARIO_ICAL__SCENARIO:
        return scenario != null;
    }
    return super.eIsSet(featureID);
  }

} //ScenarioIcalImpl
