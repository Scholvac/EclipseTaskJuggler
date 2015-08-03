/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Columns#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getColumns()
 * @model
 * @generated
 */
public interface Columns extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getColumns_Columns()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumns();

} // Columns
