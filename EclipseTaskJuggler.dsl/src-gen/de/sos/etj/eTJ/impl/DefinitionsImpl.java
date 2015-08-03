/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.Definitions;
import de.sos.etj.eTJ.ETJPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.DefinitionsImpl#isAll <em>All</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.DefinitionsImpl#isNone <em>None</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionsImpl extends ExportAttributeImpl implements Definitions
{
  /**
   * The default value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected boolean all = ALL_EDEFAULT;

  /**
   * The default value of the '{@link #isNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNone()
   * @generated
   * @ordered
   */
  protected static final boolean NONE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNone()
   * @generated
   * @ordered
   */
  protected boolean none = NONE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionsImpl()
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
    return ETJPackage.eINSTANCE.getDefinitions();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(boolean newAll)
  {
    boolean oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.DEFINITIONS__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNone()
  {
    return none;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNone(boolean newNone)
  {
    boolean oldNone = none;
    none = newNone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.DEFINITIONS__NONE, oldNone, none));
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
      case ETJPackage.DEFINITIONS__ALL:
        return isAll();
      case ETJPackage.DEFINITIONS__NONE:
        return isNone();
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
      case ETJPackage.DEFINITIONS__ALL:
        setAll((Boolean)newValue);
        return;
      case ETJPackage.DEFINITIONS__NONE:
        setNone((Boolean)newValue);
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
      case ETJPackage.DEFINITIONS__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case ETJPackage.DEFINITIONS__NONE:
        setNone(NONE_EDEFAULT);
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
      case ETJPackage.DEFINITIONS__ALL:
        return all != ALL_EDEFAULT;
      case ETJPackage.DEFINITIONS__NONE:
        return none != NONE_EDEFAULT;
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
    result.append(" (all: ");
    result.append(all);
    result.append(", none: ");
    result.append(none);
    result.append(')');
    return result.toString();
  }

} //DefinitionsImpl
