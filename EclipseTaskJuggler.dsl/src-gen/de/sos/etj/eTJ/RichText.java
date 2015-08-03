/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.RichText#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getRichText()
 * @model
 * @generated
 */
public interface RichText extends Caption, Center, Details, Epilog, Footer, Header, Headline, Left, ListItem, Prolog, Right, Summary
{
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
   * @see de.sos.etj.eTJ.ETJPackage#getRichText_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.RichText#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // RichText