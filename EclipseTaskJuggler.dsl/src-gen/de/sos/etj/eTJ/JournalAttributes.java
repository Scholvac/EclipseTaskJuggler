/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.JournalAttributes#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getJournalAttributes()
 * @model
 * @generated
 */
public interface JournalAttributes extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute list.
   * The list contents are of type {@link de.sos.etj.eTJ.JournalAttributeValues}.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.JournalAttributeValues}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute list.
   * @see de.sos.etj.eTJ.JournalAttributeValues
   * @see de.sos.etj.eTJ.ETJPackage#getJournalAttributes_Args()
   * @model unique="false"
   * @generated
   */
  EList<JournalAttributeValues> getArgs();

} // JournalAttributes
