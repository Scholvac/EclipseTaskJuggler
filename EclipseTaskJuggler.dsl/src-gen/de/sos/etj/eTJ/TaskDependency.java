/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.TaskDependency#getTask <em>Task</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.TaskDependency#getGapDuration <em>Gap Duration</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.TaskDependency#getGapLength <em>Gap Length</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.TaskDependency#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getTaskDependency()
 * @model
 * @generated
 */
public interface TaskDependency extends Precedes
{
  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(Task)
   * @see de.sos.etj.eTJ.ETJPackage#getTaskDependency_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.TaskDependency#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Gap Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gap Duration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gap Duration</em>' containment reference.
   * @see #setGapDuration(GapDuration)
   * @see de.sos.etj.eTJ.ETJPackage#getTaskDependency_GapDuration()
   * @model containment="true"
   * @generated
   */
  GapDuration getGapDuration();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.TaskDependency#getGapDuration <em>Gap Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gap Duration</em>' containment reference.
   * @see #getGapDuration()
   * @generated
   */
  void setGapDuration(GapDuration value);

  /**
   * Returns the value of the '<em><b>Gap Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gap Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gap Length</em>' containment reference.
   * @see #setGapLength(GapLength)
   * @see de.sos.etj.eTJ.ETJPackage#getTaskDependency_GapLength()
   * @model containment="true"
   * @generated
   */
  GapLength getGapLength();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.TaskDependency#getGapLength <em>Gap Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gap Length</em>' containment reference.
   * @see #getGapLength()
   * @generated
   */
  void setGapLength(GapLength value);

  /**
   * Returns the value of the '<em><b>Policy</b></em>' attribute.
   * The literals are from the enumeration {@link de.sos.etj.eTJ.DependsPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' attribute.
   * @see de.sos.etj.eTJ.DependsPolicy
   * @see #setPolicy(DependsPolicy)
   * @see de.sos.etj.eTJ.ETJPackage#getTaskDependency_Policy()
   * @model
   * @generated
   */
  DependsPolicy getPolicy();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.TaskDependency#getPolicy <em>Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' attribute.
   * @see de.sos.etj.eTJ.DependsPolicy
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(DependsPolicy value);

} // TaskDependency
