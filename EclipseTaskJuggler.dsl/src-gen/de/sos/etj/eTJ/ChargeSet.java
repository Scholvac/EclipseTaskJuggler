/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.ChargeSet#getAccountShares <em>Account Shares</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getChargeSet()
 * @model
 * @generated
 */
public interface ChargeSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Account Shares</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.AccountShare}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account Shares</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account Shares</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getChargeSet_AccountShares()
   * @model containment="true"
   * @generated
   */
  EList<AccountShare> getAccountShares();

} // ChargeSet
