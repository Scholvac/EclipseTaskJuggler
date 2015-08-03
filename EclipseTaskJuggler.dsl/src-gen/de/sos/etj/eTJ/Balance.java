/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Balance#getCost <em>Cost</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Balance#getRevenue <em>Revenue</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getBalance()
 * @model
 * @generated
 */
public interface Balance extends Property, ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Cost</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' reference.
   * @see #setCost(Account)
   * @see de.sos.etj.eTJ.ETJPackage#getBalance_Cost()
   * @model
   * @generated
   */
  Account getCost();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Balance#getCost <em>Cost</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' reference.
   * @see #getCost()
   * @generated
   */
  void setCost(Account value);

  /**
   * Returns the value of the '<em><b>Revenue</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Revenue</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Revenue</em>' reference.
   * @see #setRevenue(Account)
   * @see de.sos.etj.eTJ.ETJPackage#getBalance_Revenue()
   * @model
   * @generated
   */
  Account getRevenue();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Balance#getRevenue <em>Revenue</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Revenue</em>' reference.
   * @see #getRevenue()
   * @generated
   */
  void setRevenue(Account value);

} // Balance
