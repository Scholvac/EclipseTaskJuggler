/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.Extend;
import de.sos.etj.eTJ.ExtendedResourceAttributeColumn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Resource Attribute Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.ExtendedResourceAttributeColumnImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedResourceAttributeColumnImpl extends ColumnAttributeImpl implements ExtendedResourceAttributeColumn
{
  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected Extend extension;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendedResourceAttributeColumnImpl()
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
    return ETJPackage.eINSTANCE.getExtendedResourceAttributeColumn();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extend getExtension()
  {
    if (extension != null && extension.eIsProxy())
    {
      InternalEObject oldExtension = (InternalEObject)extension;
      extension = (Extend)eResolveProxy(oldExtension);
      if (extension != oldExtension)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.EXTENDED_RESOURCE_ATTRIBUTE_COLUMN__EXTENSION, oldExtension, extension));
      }
    }
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extend basicGetExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(Extend newExtension)
  {
    Extend oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.EXTENDED_RESOURCE_ATTRIBUTE_COLUMN__EXTENSION, oldExtension, extension));
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
      case ETJPackage.EXTENDED_RESOURCE_ATTRIBUTE_COLUMN__EXTENSION:
        if (resolve) return getExtension();
        return basicGetExtension();
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
      case ETJPackage.EXTENDED_RESOURCE_ATTRIBUTE_COLUMN__EXTENSION:
        setExtension((Extend)newValue);
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
      case ETJPackage.EXTENDED_RESOURCE_ATTRIBUTE_COLUMN__EXTENSION:
        setExtension((Extend)null);
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
      case ETJPackage.EXTENDED_RESOURCE_ATTRIBUTE_COLUMN__EXTENSION:
        return extension != null;
    }
    return super.eIsSet(featureID);
  }

} //ExtendedResourceAttributeColumnImpl
