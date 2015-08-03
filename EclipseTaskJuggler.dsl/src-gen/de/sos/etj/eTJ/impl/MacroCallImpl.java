/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.BuildInMacro;
import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.ExtDate;
import de.sos.etj.eTJ.ISODATE;
import de.sos.etj.eTJ.Macro;
import de.sos.etj.eTJ.MacroCall;
import de.sos.etj.eTJ.Start;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macro Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.MacroCallImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.MacroCallImpl#getMacro <em>Macro</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.MacroCallImpl#getBuildin <em>Buildin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MacroCallImpl extends EndImpl implements MacroCall
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected ISODATE start;

  /**
   * The cached value of the '{@link #getMacro() <em>Macro</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacro()
   * @generated
   * @ordered
   */
  protected Macro macro;

  /**
   * The default value of the '{@link #getBuildin() <em>Buildin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildin()
   * @generated
   * @ordered
   */
  protected static final BuildInMacro BUILDIN_EDEFAULT = BuildInMacro.PROJECTSTART;

  /**
   * The cached value of the '{@link #getBuildin() <em>Buildin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildin()
   * @generated
   * @ordered
   */
  protected BuildInMacro buildin = BUILDIN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MacroCallImpl()
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
    return ETJPackage.eINSTANCE.getMacroCall();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISODATE getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(ISODATE newStart, NotificationChain msgs)
  {
    ISODATE oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.MACRO_CALL__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(ISODATE newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.MACRO_CALL__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.MACRO_CALL__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.MACRO_CALL__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Macro getMacro()
  {
    if (macro != null && macro.eIsProxy())
    {
      InternalEObject oldMacro = (InternalEObject)macro;
      macro = (Macro)eResolveProxy(oldMacro);
      if (macro != oldMacro)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETJPackage.MACRO_CALL__MACRO, oldMacro, macro));
      }
    }
    return macro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Macro basicGetMacro()
  {
    return macro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMacro(Macro newMacro)
  {
    Macro oldMacro = macro;
    macro = newMacro;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.MACRO_CALL__MACRO, oldMacro, macro));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildInMacro getBuildin()
  {
    return buildin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuildin(BuildInMacro newBuildin)
  {
    BuildInMacro oldBuildin = buildin;
    buildin = newBuildin == null ? BUILDIN_EDEFAULT : newBuildin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.MACRO_CALL__BUILDIN, oldBuildin, buildin));
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
      case ETJPackage.MACRO_CALL__START:
        return basicSetStart(null, msgs);
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
      case ETJPackage.MACRO_CALL__START:
        return getStart();
      case ETJPackage.MACRO_CALL__MACRO:
        if (resolve) return getMacro();
        return basicGetMacro();
      case ETJPackage.MACRO_CALL__BUILDIN:
        return getBuildin();
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
      case ETJPackage.MACRO_CALL__START:
        setStart((ISODATE)newValue);
        return;
      case ETJPackage.MACRO_CALL__MACRO:
        setMacro((Macro)newValue);
        return;
      case ETJPackage.MACRO_CALL__BUILDIN:
        setBuildin((BuildInMacro)newValue);
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
      case ETJPackage.MACRO_CALL__START:
        setStart((ISODATE)null);
        return;
      case ETJPackage.MACRO_CALL__MACRO:
        setMacro((Macro)null);
        return;
      case ETJPackage.MACRO_CALL__BUILDIN:
        setBuildin(BUILDIN_EDEFAULT);
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
      case ETJPackage.MACRO_CALL__START:
        return start != null;
      case ETJPackage.MACRO_CALL__MACRO:
        return macro != null;
      case ETJPackage.MACRO_CALL__BUILDIN:
        return buildin != BUILDIN_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Start.class)
    {
      switch (derivedFeatureID)
      {
        case ETJPackage.MACRO_CALL__START: return ETJPackage.START__START;
        default: return -1;
      }
    }
    if (baseClass == ExtDate.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Start.class)
    {
      switch (baseFeatureID)
      {
        case ETJPackage.START__START: return ETJPackage.MACRO_CALL__START;
        default: return -1;
      }
    }
    if (baseClass == ExtDate.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (buildin: ");
    result.append(buildin);
    result.append(')');
    return result.toString();
  }

} //MacroCallImpl
