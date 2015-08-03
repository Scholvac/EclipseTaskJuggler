/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.PurgeResource;
import de.sos.etj.eTJ.PurgeResourceAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purge Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.PurgeResourceImpl#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PurgeResourceImpl extends ResourceAttributeImpl implements PurgeResource
{
  /**
   * The default value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListAttribute()
   * @generated
   * @ordered
   */
  protected static final PurgeResourceAttribute LIST_ATTRIBUTE_EDEFAULT = PurgeResourceAttribute.FAIL;

  /**
   * The cached value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListAttribute()
   * @generated
   * @ordered
   */
  protected PurgeResourceAttribute listAttribute = LIST_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PurgeResourceImpl()
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
    return ETJPackage.eINSTANCE.getPurgeResource();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeResourceAttribute getListAttribute()
  {
    return listAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListAttribute(PurgeResourceAttribute newListAttribute)
  {
    PurgeResourceAttribute oldListAttribute = listAttribute;
    listAttribute = newListAttribute == null ? LIST_ATTRIBUTE_EDEFAULT : newListAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.PURGE_RESOURCE__LIST_ATTRIBUTE, oldListAttribute, listAttribute));
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
      case ETJPackage.PURGE_RESOURCE__LIST_ATTRIBUTE:
        return getListAttribute();
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
      case ETJPackage.PURGE_RESOURCE__LIST_ATTRIBUTE:
        setListAttribute((PurgeResourceAttribute)newValue);
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
      case ETJPackage.PURGE_RESOURCE__LIST_ATTRIBUTE:
        setListAttribute(LIST_ATTRIBUTE_EDEFAULT);
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
      case ETJPackage.PURGE_RESOURCE__LIST_ATTRIBUTE:
        return listAttribute != LIST_ATTRIBUTE_EDEFAULT;
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
    result.append(" (listAttribute: ");
    result.append(listAttribute);
    result.append(')');
    return result.toString();
  }

} //PurgeResourceImpl
