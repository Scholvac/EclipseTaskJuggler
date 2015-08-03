/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.SelfContained;
import de.sos.etj.eTJ.YesNo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Contained</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.SelfContainedImpl#getSelfcontained <em>Selfcontained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelfContainedImpl extends ReportAttributeImpl implements SelfContained
{
  /**
   * The default value of the '{@link #getSelfcontained() <em>Selfcontained</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelfcontained()
   * @generated
   * @ordered
   */
  protected static final YesNo SELFCONTAINED_EDEFAULT = YesNo.YES;

  /**
   * The cached value of the '{@link #getSelfcontained() <em>Selfcontained</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelfcontained()
   * @generated
   * @ordered
   */
  protected YesNo selfcontained = SELFCONTAINED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfContainedImpl()
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
    return ETJPackage.eINSTANCE.getSelfContained();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YesNo getSelfcontained()
  {
    return selfcontained;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelfcontained(YesNo newSelfcontained)
  {
    YesNo oldSelfcontained = selfcontained;
    selfcontained = newSelfcontained == null ? SELFCONTAINED_EDEFAULT : newSelfcontained;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.SELF_CONTAINED__SELFCONTAINED, oldSelfcontained, selfcontained));
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
      case ETJPackage.SELF_CONTAINED__SELFCONTAINED:
        return getSelfcontained();
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
      case ETJPackage.SELF_CONTAINED__SELFCONTAINED:
        setSelfcontained((YesNo)newValue);
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
      case ETJPackage.SELF_CONTAINED__SELFCONTAINED:
        setSelfcontained(SELFCONTAINED_EDEFAULT);
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
      case ETJPackage.SELF_CONTAINED__SELFCONTAINED:
        return selfcontained != SELFCONTAINED_EDEFAULT;
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
    result.append(" (selfcontained: ");
    result.append(selfcontained);
    result.append(')');
    return result.toString();
  }

} //SelfContainedImpl
