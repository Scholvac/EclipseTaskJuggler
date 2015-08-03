/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.LimitAttribute#getEnd <em>End</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LimitAttribute#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LimitAttribute#getResources <em>Resources</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.LimitAttribute#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getLimitAttribute()
 * @model
 * @generated
 */
public interface LimitAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getLimitAttribute_End()
   * @model containment="true"
   * @generated
   */
  ISODATE getEnd();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LimitAttribute#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(ISODATE value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' containment reference.
   * @see #setPeriod(Interval1)
   * @see de.sos.etj.eTJ.ETJPackage#getLimitAttribute_Period()
   * @model containment="true"
   * @generated
   */
  Interval1 getPeriod();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LimitAttribute#getPeriod <em>Period</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' containment reference.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(Interval1 value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getLimitAttribute_Resources()
   * @model
   * @generated
   */
  EList<Resource> getResources();

  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getLimitAttribute_Start()
   * @model containment="true"
   * @generated
   */
  ISODATE getStart();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.LimitAttribute#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(ISODATE value);

} // LimitAttribute
