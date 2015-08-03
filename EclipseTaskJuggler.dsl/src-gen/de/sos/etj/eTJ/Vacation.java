/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vacation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Vacation#getName <em>Name</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Vacation#getIntervals <em>Intervals</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getVacation()
 * @model
 * @generated
 */
public interface Vacation extends Property, ResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.sos.etj.eTJ.ETJPackage#getVacation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Vacation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Intervals</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.Interval3}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intervals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intervals</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getVacation_Intervals()
   * @model containment="true"
   * @generated
   */
  EList<Interval3> getIntervals();

} // Vacation
