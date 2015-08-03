/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Sort#isTree <em>Tree</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Sort#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getSort()
 * @model
 * @generated
 */
public interface Sort extends SortAccounts, SortJournalEntries, SortResources, SortTasks
{
  /**
   * Returns the value of the '<em><b>Tree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tree</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tree</em>' attribute.
   * @see #setTree(boolean)
   * @see de.sos.etj.eTJ.ETJPackage#getSort_Tree()
   * @model
   * @generated
   */
  boolean isTree();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Sort#isTree <em>Tree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tree</em>' attribute.
   * @see #isTree()
   * @generated
   */
  void setTree(boolean value);

  /**
   * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.Criterion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criteria</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getSort_Criteria()
   * @model containment="true"
   * @generated
   */
  EList<Criterion> getCriteria();

} // Sort
