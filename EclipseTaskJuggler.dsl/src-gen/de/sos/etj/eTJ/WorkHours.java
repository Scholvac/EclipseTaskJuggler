/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Hours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.WorkHours#getStart <em>Start</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.WorkHours#getStop <em>Stop</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getWorkHours()
 * @model
 * @generated
 */
public interface WorkHours extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(String)
   * @see de.sos.etj.eTJ.ETJPackage#getWorkHours_Start()
   * @model
   * @generated
   */
  String getStart();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.WorkHours#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(String value);

  /**
   * Returns the value of the '<em><b>Stop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop</em>' attribute.
   * @see #setStop(String)
   * @see de.sos.etj.eTJ.ETJPackage#getWorkHours_Stop()
   * @model
   * @generated
   */
  String getStop();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.WorkHours#getStop <em>Stop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop</em>' attribute.
   * @see #getStop()
   * @generated
   */
  void setStop(String value);

} // WorkHours
