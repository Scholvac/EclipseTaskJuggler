/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.MacroCall#getMacro <em>Macro</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.MacroCall#getBuildin <em>Buildin</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getMacroCall()
 * @model
 * @generated
 */
public interface MacroCall extends End, Start, ExtDate
{
  /**
   * Returns the value of the '<em><b>Macro</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Macro</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Macro</em>' reference.
   * @see #setMacro(Macro)
   * @see de.sos.etj.eTJ.ETJPackage#getMacroCall_Macro()
   * @model
   * @generated
   */
  Macro getMacro();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.MacroCall#getMacro <em>Macro</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Macro</em>' reference.
   * @see #getMacro()
   * @generated
   */
  void setMacro(Macro value);

  /**
   * Returns the value of the '<em><b>Buildin</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.BuildInMacro}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buildin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buildin</em>' attribute.
   * @see de.sos.etj.eTJ.BuildInMacro
   * @see #setBuildin(BuildInMacro)
   * @see de.sos.etj.eTJ.ETJPackage#getMacroCall_Buildin()
   * @model
   * @generated
   */
  BuildInMacro getBuildin();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.MacroCall#getBuildin <em>Buildin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buildin</em>' attribute.
   * @see de.sos.etj.eTJ.BuildInMacro
   * @see #getBuildin()
   * @generated
   */
  void setBuildin(BuildInMacro value);

} // MacroCall
