/**
 */
package de.sos.etj.eTJ.impl;

import de.sos.etj.eTJ.Defintions;
import de.sos.etj.eTJ.ETJPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defintions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.impl.DefintionsImpl#isFlags <em>Flags</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.DefintionsImpl#isResources <em>Resources</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.DefintionsImpl#isTasks <em>Tasks</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.DefintionsImpl#isProject <em>Project</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.impl.DefintionsImpl#isProjectids <em>Projectids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefintionsImpl extends DefinitionsImpl implements Defintions
{
  /**
   * The default value of the '{@link #isFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlags()
   * @generated
   * @ordered
   */
  protected static final boolean FLAGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlags()
   * @generated
   * @ordered
   */
  protected boolean flags = FLAGS_EDEFAULT;

  /**
   * The default value of the '{@link #isResources() <em>Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResources()
   * @generated
   * @ordered
   */
  protected static final boolean RESOURCES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResources() <em>Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResources()
   * @generated
   * @ordered
   */
  protected boolean resources = RESOURCES_EDEFAULT;

  /**
   * The default value of the '{@link #isTasks() <em>Tasks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTasks()
   * @generated
   * @ordered
   */
  protected static final boolean TASKS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTasks() <em>Tasks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTasks()
   * @generated
   * @ordered
   */
  protected boolean tasks = TASKS_EDEFAULT;

  /**
   * The default value of the '{@link #isProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProject()
   * @generated
   * @ordered
   */
  protected static final boolean PROJECT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProject()
   * @generated
   * @ordered
   */
  protected boolean project = PROJECT_EDEFAULT;

  /**
   * The default value of the '{@link #isProjectids() <em>Projectids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProjectids()
   * @generated
   * @ordered
   */
  protected static final boolean PROJECTIDS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProjectids() <em>Projectids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProjectids()
   * @generated
   * @ordered
   */
  protected boolean projectids = PROJECTIDS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefintionsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ETJPackage.eINSTANCE.getDefintions();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFlags()
  {
    return flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlags(boolean newFlags)
  {
    boolean oldFlags = flags;
    flags = newFlags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.DEFINTIONS__FLAGS, oldFlags, flags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResources()
  {
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResources(boolean newResources)
  {
    boolean oldResources = resources;
    resources = newResources;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.DEFINTIONS__RESOURCES, oldResources, resources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTasks()
  {
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTasks(boolean newTasks)
  {
    boolean oldTasks = tasks;
    tasks = newTasks;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.DEFINTIONS__TASKS, oldTasks, tasks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProject()
  {
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProject(boolean newProject)
  {
    boolean oldProject = project;
    project = newProject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.DEFINTIONS__PROJECT, oldProject, project));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProjectids()
  {
    return projectids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectids(boolean newProjectids)
  {
    boolean oldProjectids = projectids;
    projectids = newProjectids;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ETJPackage.DEFINTIONS__PROJECTIDS, oldProjectids, projectids));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ETJPackage.DEFINTIONS__FLAGS:
        return isFlags();
      case ETJPackage.DEFINTIONS__RESOURCES:
        return isResources();
      case ETJPackage.DEFINTIONS__TASKS:
        return isTasks();
      case ETJPackage.DEFINTIONS__PROJECT:
        return isProject();
      case ETJPackage.DEFINTIONS__PROJECTIDS:
        return isProjectids();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ETJPackage.DEFINTIONS__FLAGS:
        setFlags((Boolean)newValue);
        return;
      case ETJPackage.DEFINTIONS__RESOURCES:
        setResources((Boolean)newValue);
        return;
      case ETJPackage.DEFINTIONS__TASKS:
        setTasks((Boolean)newValue);
        return;
      case ETJPackage.DEFINTIONS__PROJECT:
        setProject((Boolean)newValue);
        return;
      case ETJPackage.DEFINTIONS__PROJECTIDS:
        setProjectids((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ETJPackage.DEFINTIONS__FLAGS:
        setFlags(FLAGS_EDEFAULT);
        return;
      case ETJPackage.DEFINTIONS__RESOURCES:
        setResources(RESOURCES_EDEFAULT);
        return;
      case ETJPackage.DEFINTIONS__TASKS:
        setTasks(TASKS_EDEFAULT);
        return;
      case ETJPackage.DEFINTIONS__PROJECT:
        setProject(PROJECT_EDEFAULT);
        return;
      case ETJPackage.DEFINTIONS__PROJECTIDS:
        setProjectids(PROJECTIDS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ETJPackage.DEFINTIONS__FLAGS:
        return flags != FLAGS_EDEFAULT;
      case ETJPackage.DEFINTIONS__RESOURCES:
        return resources != RESOURCES_EDEFAULT;
      case ETJPackage.DEFINTIONS__TASKS:
        return tasks != TASKS_EDEFAULT;
      case ETJPackage.DEFINTIONS__PROJECT:
        return project != PROJECT_EDEFAULT;
      case ETJPackage.DEFINTIONS__PROJECTIDS:
        return projectids != PROJECTIDS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (flags: ");
    result.append(flags);
    result.append(", resources: ");
    result.append(resources);
    result.append(", tasks: ");
    result.append(tasks);
    result.append(", project: ");
    result.append(project);
    result.append(", projectids: ");
    result.append(projectids);
    result.append(')');
    return result.toString();
  }

} //DefintionsImpl