/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.Column;
import de.sos.etj.eTJ.ColumnAttribute;
import de.sos.etj.eTJ.ColumnId;
import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.ExtendedResourceAttributeColumn;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.ColumnImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.ColumnImpl#getExt <em>Ext</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.ColumnImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final ColumnId ID_EDEFAULT = ColumnId.ACTIVETASKS;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected ColumnId id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getExt() <em>Ext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExt()
   * @generated
   * @ordered
   */
  protected ExtendedResourceAttributeColumn ext;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<ColumnAttribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColumnImpl()
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
    return ETJPackage.eINSTANCE.getColumn();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnId getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(ColumnId newId)
  {
    ColumnId oldId = id;
    id = newId == null ? ID_EDEFAULT : newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.COLUMN__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedResourceAttributeColumn getExt()
  {
    return ext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExt(ExtendedResourceAttributeColumn newExt, NotificationChain msgs)
  {
    ExtendedResourceAttributeColumn oldExt = ext;
    ext = newExt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.COLUMN__EXT, oldExt, newExt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExt(ExtendedResourceAttributeColumn newExt)
  {
    if (newExt != ext)
    {
      NotificationChain msgs = null;
      if (ext != null)
        msgs = ((InternalEObject)ext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.COLUMN__EXT, null, msgs);
      if (newExt != null)
        msgs = ((InternalEObject)newExt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.COLUMN__EXT, null, msgs);
      msgs = basicSetExt(newExt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.COLUMN__EXT, newExt, newExt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColumnAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<ColumnAttribute>(ColumnAttribute.class, this, ETJPackage.COLUMN__ATTRIBUTES);
    }
    return attributes;
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
      case ETJPackage.COLUMN__EXT:
        return basicSetExt(null, msgs);
      case ETJPackage.COLUMN__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case ETJPackage.COLUMN__ID:
        return getId();
      case ETJPackage.COLUMN__EXT:
        return getExt();
      case ETJPackage.COLUMN__ATTRIBUTES:
        return getAttributes();
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
      case ETJPackage.COLUMN__ID:
        setId((ColumnId)newValue);
        return;
      case ETJPackage.COLUMN__EXT:
        setExt((ExtendedResourceAttributeColumn)newValue);
        return;
      case ETJPackage.COLUMN__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends ColumnAttribute>)newValue);
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
      case ETJPackage.COLUMN__ID:
        setId(ID_EDEFAULT);
        return;
      case ETJPackage.COLUMN__EXT:
        setExt((ExtendedResourceAttributeColumn)null);
        return;
      case ETJPackage.COLUMN__ATTRIBUTES:
        getAttributes().clear();
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
      case ETJPackage.COLUMN__ID:
        return id != ID_EDEFAULT;
      case ETJPackage.COLUMN__EXT:
        return ext != null;
      case ETJPackage.COLUMN__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ColumnImpl
