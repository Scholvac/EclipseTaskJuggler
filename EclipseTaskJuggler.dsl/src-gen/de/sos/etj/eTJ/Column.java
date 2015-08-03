/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.Column#getId <em>Id</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Column#getExt <em>Ext</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.Column#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.ColumnId}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see de.sos.etj.eTJ.ColumnId
   * @see #setId(ColumnId)
   * @see de.sos.etj.eTJ.ETJPackage#getColumn_Id()
   * @model
   * @generated
   */
  ColumnId getId();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Column#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see de.sos.etj.eTJ.ColumnId
   * @see #getId()
   * @generated
   */
  void setId(ColumnId value);

  /**
   * Returns the value of the '<em><b>Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ext</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ext</em>' containment reference.
   * @see #setExt(ExtendedResourceAttributeColumn)
   * @see de.sos.etj.eTJ.ETJPackage#getColumn_Ext()
   * @model containment="true"
   * @generated
   */
  ExtendedResourceAttributeColumn getExt();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.Column#getExt <em>Ext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ext</em>' containment reference.
   * @see #getExt()
   * @generated
   */
  void setExt(ExtendedResourceAttributeColumn value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.sos.etj.eTJ.ColumnAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.sos.etj.eTJ.ETJPackage#getColumn_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<ColumnAttribute> getAttributes();

} // Column
