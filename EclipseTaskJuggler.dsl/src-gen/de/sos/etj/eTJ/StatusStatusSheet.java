/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Status Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.StatusStatusSheet#getLevel <em>Level</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.StatusStatusSheet#getText <em>Text</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.StatusStatusSheet#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getStatusStatusSheet()
 * @model
 * @generated
 */
public interface StatusStatusSheet extends TaskStatusSheetAttribute
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.AlertLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see de.sos.etj.eTJ.AlertLevel
   * @see #setLevel(AlertLevel)
   * @see de.sos.etj.eTJ.ETJPackage#getStatusStatusSheet_Level()
   * @model
   * @generated
   */
  AlertLevel getLevel();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.StatusStatusSheet#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see de.sos.etj.eTJ.AlertLevel
   * @see #getLevel()
   * @generated
   */
  void setLevel(AlertLevel value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see de.sos.etj.eTJ.ETJPackage#getStatusStatusSheet_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.StatusStatusSheet#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.StatusStatusSheetAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getStatusStatusSheet_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<StatusStatusSheetAttribute> getAttributes();

} // StatusStatusSheet
