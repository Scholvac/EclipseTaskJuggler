/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Charge#getAmount <em>Amount</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Charge#getApplies <em>Applies</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getCharge()
 * @model
 * @generated
 */
public interface Charge extends EObject
{
  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(float)
   * @see de.sos.etj.eTJ.ETJPackage#getCharge_Amount()
   * @model
   * @generated
   */
  float getAmount();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Charge#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(float value);

  /**
   * Returns the value of the '<em><b>Applies</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.ChargeApplies}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Applies</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applies</em>' attribute.
   * @see de.sos.etj.eTJ.ChargeApplies
   * @see #setApplies(ChargeApplies)
   * @see de.sos.etj.eTJ.ETJPackage#getCharge_Applies()
   * @model
   * @generated
   */
  ChargeApplies getApplies();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Charge#getApplies <em>Applies</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Applies</em>' attribute.
   * @see de.sos.etj.eTJ.ChargeApplies
   * @see #getApplies()
   * @generated
   */
  void setApplies(ChargeApplies value);

} // Charge
