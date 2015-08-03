/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Contained</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.SelfContained#getSelfcontained <em>Selfcontained</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getSelfContained()
 * @model
 * @generated
 */
public interface SelfContained extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Selfcontained</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.YesNo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selfcontained</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selfcontained</em>' attribute.
   * @see de.sos.etj.eTJ.YesNo
   * @see #setSelfcontained(YesNo)
   * @see de.sos.etj.eTJ.ETJPackage#getSelfContained_Selfcontained()
   * @model
   * @generated
   */
  YesNo getSelfcontained();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.SelfContained#getSelfcontained <em>Selfcontained</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selfcontained</em>' attribute.
   * @see de.sos.etj.eTJ.YesNo
   * @see #getSelfcontained()
   * @generated
   */
  void setSelfcontained(YesNo value);

} // SelfContained
