/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.ShortTimeFormat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Time Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.ShortTimeFormatImpl#getShortTimeFormat <em>Short Time Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortTimeFormatImpl extends ProjectAttributeImpl implements ShortTimeFormat
{
  /**
   * The default value of the '{@link #getShortTimeFormat() <em>Short Time Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortTimeFormat()
   * @generated
   * @ordered
   */
  protected static final String SHORT_TIME_FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortTimeFormat() <em>Short Time Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortTimeFormat()
   * @generated
   * @ordered
   */
  protected String shortTimeFormat = SHORT_TIME_FORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShortTimeFormatImpl()
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
    return ETJPackage.eINSTANCE.getShortTimeFormat();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortTimeFormat()
  {
    return shortTimeFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortTimeFormat(String newShortTimeFormat)
  {
    String oldShortTimeFormat = shortTimeFormat;
    shortTimeFormat = newShortTimeFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT, oldShortTimeFormat, shortTimeFormat));
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
      case ETJPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT:
        return getShortTimeFormat();
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
      case ETJPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT:
        setShortTimeFormat((String)newValue);
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
      case ETJPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT:
        setShortTimeFormat(SHORT_TIME_FORMAT_EDEFAULT);
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
      case ETJPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT:
        return SHORT_TIME_FORMAT_EDEFAULT == null ? shortTimeFormat != null : !SHORT_TIME_FORMAT_EDEFAULT.equals(shortTimeFormat);
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
    result.append(" (shortTimeFormat: ");
    result.append(shortTimeFormat);
    result.append(')');
    return result.toString();
  }

} //ShortTimeFormatImpl
