/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weekdays</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Weekdays#getFirst <em>First</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Weekdays#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getWeekdays()
 * @model
 * @generated
 */
public interface Weekdays extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.Weekday}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' attribute.
   * @see de.sos.etj.eTJ.Weekday
   * @see #setFirst(Weekday)
   * @see de.sos.etj.eTJ.ETJPackage#getWeekdays_First()
   * @model
   * @generated
   */
  Weekday getFirst();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Weekdays#getFirst <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' attribute.
   * @see de.sos.etj.eTJ.Weekday
   * @see #getFirst()
   * @generated
   */
  void setFirst(Weekday value);

  /**
   * Returns the value of the '<em><b>Last</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.Weekday}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last</em>' attribute.
   * @see de.sos.etj.eTJ.Weekday
   * @see #setLast(Weekday)
   * @see de.sos.etj.eTJ.ETJPackage#getWeekdays_Last()
   * @model
   * @generated
   */
  Weekday getLast();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Weekdays#getLast <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' attribute.
   * @see de.sos.etj.eTJ.Weekday
   * @see #getLast()
   * @generated
   */
  void setLast(Weekday value);

} // Weekdays
