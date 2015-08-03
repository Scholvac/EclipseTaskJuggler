/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.ETJPackage;
import de.sos.etj.eTJ.LogicalExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.LogicalExpressionImpl#getLeftOperant <em>Left Operant</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.LogicalExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.LogicalExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalExpressionImpl extends MinimalEObjectImpl.Container implements LogicalExpression
{
  /**
   * The cached value of the '{@link #getLeftOperant() <em>Left Operant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftOperant()
   * @generated
   * @ordered
   */
  protected LogicalExpression leftOperant;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightOperand()
   * @generated
   * @ordered
   */
  protected LogicalExpression rightOperand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalExpressionImpl()
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
    return ETJPackage.eINSTANCE.getLogicalExpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalExpression getLeftOperant()
  {
    return leftOperant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftOperant(LogicalExpression newLeftOperant, NotificationChain msgs)
  {
    LogicalExpression oldLeftOperant = leftOperant;
    leftOperant = newLeftOperant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT, oldLeftOperant, newLeftOperant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftOperant(LogicalExpression newLeftOperant)
  {
    if (newLeftOperant != leftOperant)
    {
      NotificationChain msgs = null;
      if (leftOperant != null)
        msgs = ((InternalEObject)leftOperant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT, null, msgs);
      if (newLeftOperant != null)
        msgs = ((InternalEObject)newLeftOperant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT, null, msgs);
      msgs = basicSetLeftOperant(newLeftOperant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT, newLeftOperant, newLeftOperant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.LOGICAL_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalExpression getRightOperand()
  {
    return rightOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightOperand(LogicalExpression newRightOperand, NotificationChain msgs)
  {
    LogicalExpression oldRightOperand = rightOperand;
    rightOperand = newRightOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND, oldRightOperand, newRightOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightOperand(LogicalExpression newRightOperand)
  {
    if (newRightOperand != rightOperand)
    {
      NotificationChain msgs = null;
      if (rightOperand != null)
        msgs = ((InternalEObject)rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND, null, msgs);
      if (newRightOperand != null)
        msgs = ((InternalEObject)newRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND, null, msgs);
      msgs = basicSetRightOperand(newRightOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND, newRightOperand, newRightOperand));
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
      case ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT:
        return basicSetLeftOperant(null, msgs);
      case ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND:
        return basicSetRightOperand(null, msgs);
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
      case ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT:
        return getLeftOperant();
      case ETJPackage.LOGICAL_EXPRESSION__OP:
        return getOp();
      case ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND:
        return getRightOperand();
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
      case ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT:
        setLeftOperant((LogicalExpression)newValue);
        return;
      case ETJPackage.LOGICAL_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND:
        setRightOperand((LogicalExpression)newValue);
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
      case ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT:
        setLeftOperant((LogicalExpression)null);
        return;
      case ETJPackage.LOGICAL_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND:
        setRightOperand((LogicalExpression)null);
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
      case ETJPackage.LOGICAL_EXPRESSION__LEFT_OPERANT:
        return leftOperant != null;
      case ETJPackage.LOGICAL_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case ETJPackage.LOGICAL_EXPRESSION__RIGHT_OPERAND:
        return rightOperand != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //LogicalExpressionImpl
