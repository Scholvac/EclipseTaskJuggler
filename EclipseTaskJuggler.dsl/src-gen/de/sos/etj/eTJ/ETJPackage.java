/**
 */
package de.sos.etj.eTJ;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.sos.etj.eTJ.ETJFactory
 * @model kind="package"
 * @generated
 */
public interface ETJPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eTJ";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mycompany.com/etj/ETJ";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eTJ";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ETJPackage eINSTANCE = de.sos.etj.eTJ.impl.ETJPackageImpl.init();

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.GlobalImpl <em>Global</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.GlobalImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getGlobal()
   * @generated
   */
  int GLOBAL = 0;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL__PROJECT = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Global</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PropertyImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LeavesImpl <em>Leaves</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LeavesImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLeaves()
   * @generated
   */
  int LEAVES = 2;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAVES__DETAILS = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Leaves</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAVES_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LeaveDetailsImpl <em>Leave Details</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LeaveDetailsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLeaveDetails()
   * @generated
   */
  int LEAVE_DETAILS = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAVE_DETAILS__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAVE_DETAILS__NAME = 1;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAVE_DETAILS__INTERVAL = 2;

  /**
   * The number of structural features of the '<em>Leave Details</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAVE_DETAILS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AccountImpl <em>Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AccountImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAccount()
   * @generated
   */
  int ACCOUNT = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__ID = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__NAME = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AccountAttributeImpl <em>Account Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AccountAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAccountAttribute()
   * @generated
   */
  int ACCOUNT_ATTRIBUTE = 5;

  /**
   * The number of structural features of the '<em>Account Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.IncludePropertiesAttributeImpl <em>Include Properties Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.IncludePropertiesAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getIncludePropertiesAttribute()
   * @generated
   */
  int INCLUDE_PROPERTIES_ATTRIBUTE = 86;

  /**
   * The number of structural features of the '<em>Include Properties Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AccountPrefixImpl <em>Account Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AccountPrefixImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAccountPrefix()
   * @generated
   */
  int ACCOUNT_PREFIX = 6;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_PREFIX__ACCOUNT = INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Account Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_PREFIX_FEATURE_COUNT = INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AccountReportImpl <em>Account Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AccountReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAccountReport()
   * @generated
   */
  int ACCOUNT_REPORT = 7;

  /**
   * The number of structural features of the '<em>Account Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ReportAttributeImpl <em>Report Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ReportAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getReportAttribute()
   * @generated
   */
  int REPORT_ATTRIBUTE = 15;

  /**
   * The number of structural features of the '<em>Report Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AccountRootImpl <em>Account Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AccountRootImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAccountRoot()
   * @generated
   */
  int ACCOUNT_ROOT = 8;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_ROOT__ACCOUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Account Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_ROOT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ProjectImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__VERSION = 2;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__INTERVAL = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ProjectAttributeImpl <em>Project Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ProjectAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getProjectAttribute()
   * @generated
   */
  int PROJECT_ATTRIBUTE = 10;

  /**
   * The number of structural features of the '<em>Project Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTask()
   * @generated
   */
  int TASK = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ID = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskAttributeImpl <em>Task Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskAttribute()
   * @generated
   */
  int TASK_ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTE__SCENARIO = 0;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTE__ATTR = 1;

  /**
   * The number of structural features of the '<em>Task Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.EndImpl <em>End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.EndImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getEnd()
   * @generated
   */
  int END = 60;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END__END = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MacroCallImpl <em>Macro Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MacroCallImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMacroCall()
   * @generated
   */
  int MACRO_CALL = 13;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_CALL__END = END__END;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_CALL__START = END_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Macro</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_CALL__MACRO = END_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Buildin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_CALL__BUILDIN = END_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Macro Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_CALL_FEATURE_COUNT = END_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ReportImpl <em>Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getReport()
   * @generated
   */
  int REPORT = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__ID = ACCOUNT_REPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__NAME = ACCOUNT_REPORT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__ATTRIBUTES = ACCOUNT_REPORT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_FEATURE_COUNT = ACCOUNT_REPORT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.IcalReportImpl <em>Ical Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.IcalReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getIcalReport()
   * @generated
   */
  int ICAL_REPORT = 16;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICAL_REPORT__FILENAME = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICAL_REPORT__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ical Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICAL_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.IcalReportAttributeImpl <em>Ical Report Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.IcalReportAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getIcalReportAttribute()
   * @generated
   */
  int ICAL_REPORT_ATTRIBUTE = 17;

  /**
   * The number of structural features of the '<em>Ical Report Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ICAL_REPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExportImpl <em>Export</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExport()
   * @generated
   */
  int EXPORT = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT__ID = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT__FILENAME = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Export</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExportAttributeImpl <em>Export Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExportAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExportAttribute()
   * @generated
   */
  int EXPORT_ATTRIBUTE = 19;

  /**
   * The number of structural features of the '<em>Export Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 20;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__ID = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ResourceAttributeImpl <em>Resource Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ResourceAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getResourceAttribute()
   * @generated
   */
  int RESOURCE_ATTRIBUTE = 21;

  /**
   * The number of structural features of the '<em>Resource Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AllocateImpl <em>Allocate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AllocateImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAllocate()
   * @generated
   */
  int ALLOCATE = 22;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE__RESOURCES = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Allocate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AllocateResourceImpl <em>Allocate Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AllocateResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAllocateResource()
   * @generated
   */
  int ALLOCATE_RESOURCE = 23;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_RESOURCE__RESOURCE = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_RESOURCE__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Allocate Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_RESOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AllocateResourceAttributeImpl <em>Allocate Resource Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AllocateResourceAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAllocateResourceAttribute()
   * @generated
   */
  int ALLOCATE_RESOURCE_ATTRIBUTE = 24;

  /**
   * The number of structural features of the '<em>Allocate Resource Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NavigatorImpl <em>Navigator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NavigatorImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNavigator()
   * @generated
   */
  int NAVIGATOR = 25;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATOR__ID = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATOR__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Navigator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATOR_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NavigatorAttributeImpl <em>Navigator Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NavigatorAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNavigatorAttribute()
   * @generated
   */
  int NAVIGATOR_ATTRIBUTE = 26;

  /**
   * The number of structural features of the '<em>Navigator Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATOR_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TimesheetAttributeImpl <em>Timesheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TimesheetAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimesheetAttribute()
   * @generated
   */
  int TIMESHEET_ATTRIBUTE = 188;

  /**
   * The number of structural features of the '<em>Timesheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NewTaskImpl <em>New Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NewTaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNewTask()
   * @generated
   */
  int NEW_TASK = 27;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK__ID = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK__TEXT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK__ATTRIBUTES = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>New Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK_FEATURE_COUNT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NewTaskAttributeImpl <em>New Task Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NewTaskAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNewTaskAttribute()
   * @generated
   */
  int NEW_TASK_ATTRIBUTE = 28;

  /**
   * The number of structural features of the '<em>New Task Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NikuReportImpl <em>Niku Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NikuReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNikuReport()
   * @generated
   */
  int NIKU_REPORT = 29;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIKU_REPORT__FILENAME = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIKU_REPORT__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Niku Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIKU_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NikuReportAttributeImpl <em>Niku Report Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NikuReportAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNikuReportAttribute()
   * @generated
   */
  int NIKU_REPORT_ATTRIBUTE = 30;

  /**
   * The number of structural features of the '<em>Niku Report Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AlertImpl <em>Alert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AlertImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAlert()
   * @generated
   */
  int ALERT = 31;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALERT__LEVEL = 0;

  /**
   * The number of structural features of the '<em>Alert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALERT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AlternativeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 32;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__RESOURCES = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StatusStatusSheetAttributeImpl <em>Status Status Sheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StatusStatusSheetAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStatusStatusSheetAttribute()
   * @generated
   */
  int STATUS_STATUS_SHEET_ATTRIBUTE = 163;

  /**
   * The number of structural features of the '<em>Status Status Sheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AuthorImpl <em>Author</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AuthorImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAuthor()
   * @generated
   */
  int AUTHOR = 33;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__RESOURCE = STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Author</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR_FEATURE_COUNT = STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.BalanceImpl <em>Balance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.BalanceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getBalance()
   * @generated
   */
  int BALANCE = 34;

  /**
   * The feature id for the '<em><b>Cost</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALANCE__COST = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Revenue</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALANCE__REVENUE = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Balance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALANCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.BookingImpl <em>Booking</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.BookingImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getBooking()
   * @generated
   */
  int BOOKING = 35;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING__INTERVAL = 0;

  /**
   * The feature id for the '<em><b>Overtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING__OVERTIME = 1;

  /**
   * The feature id for the '<em><b>Sloppy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING__SLOPPY = 2;

  /**
   * The number of structural features of the '<em>Booking</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.BookingTaskImpl <em>Booking Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.BookingTaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getBookingTask()
   * @generated
   */
  int BOOKING_TASK = 36;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_TASK__RESOURCE = 0;

  /**
   * The feature id for the '<em><b>Booking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_TASK__BOOKING = 1;

  /**
   * The number of structural features of the '<em>Booking Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_TASK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.BookingResourceImpl <em>Booking Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.BookingResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getBookingResource()
   * @generated
   */
  int BOOKING_RESOURCE = 37;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_RESOURCE__TASK = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Booking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_RESOURCE__BOOKING = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Booking Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_RESOURCE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CaptionImpl <em>Caption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CaptionImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCaption()
   * @generated
   */
  int CAPTION = 38;

  /**
   * The number of structural features of the '<em>Caption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPTION_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CellColorImpl <em>Cell Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CellColorImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCellColor()
   * @generated
   */
  int CELL_COLOR = 39;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COLOR__EXPRESSION = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COLOR__COLOR = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cell Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COLOR_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ColumnAttributeImpl <em>Column Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ColumnAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getColumnAttribute()
   * @generated
   */
  int COLUMN_ATTRIBUTE = 207;

  /**
   * The number of structural features of the '<em>Column Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CellTextImpl <em>Cell Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CellTextImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCellText()
   * @generated
   */
  int CELL_TEXT = 40;

  /**
   * The feature id for the '<em><b>Expresssion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_TEXT__EXPRESSSION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_TEXT__TEXT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cell Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_TEXT_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CenterImpl <em>Center</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CenterImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCenter()
   * @generated
   */
  int CENTER = 41;

  /**
   * The number of structural features of the '<em>Center</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ChargeImpl <em>Charge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ChargeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCharge()
   * @generated
   */
  int CHARGE = 42;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE__AMOUNT = 0;

  /**
   * The feature id for the '<em><b>Applies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE__APPLIES = 1;

  /**
   * The number of structural features of the '<em>Charge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ChargeSetImpl <em>Charge Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ChargeSetImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getChargeSet()
   * @generated
   */
  int CHARGE_SET = 43;

  /**
   * The feature id for the '<em><b>Account Shares</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE_SET__ACCOUNT_SHARES = 0;

  /**
   * The number of structural features of the '<em>Charge Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ColumnsImpl <em>Columns</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ColumnsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getColumns()
   * @generated
   */
  int COLUMNS = 44;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMNS__COLUMNS = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Columns</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMNS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CompleteImpl <em>Complete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CompleteImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getComplete()
   * @generated
   */
  int COMPLETE = 45;

  /**
   * The feature id for the '<em><b>Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLETE__COMPLETE = 0;

  /**
   * The number of structural features of the '<em>Complete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLETE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CopyrightImpl <em>Copyright</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CopyrightImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCopyright()
   * @generated
   */
  int COPYRIGHT = 46;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPYRIGHT__TEXT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Copyright</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPYRIGHT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CreditImpl <em>Credit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CreditImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCredit()
   * @generated
   */
  int CREDIT = 47;

  /**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__DATE = ACCOUNT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__DESCRIPTION = ACCOUNT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__AMOUNT = ACCOUNT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Credit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT_FEATURE_COUNT = ACCOUNT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CurrencyImpl <em>Currency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CurrencyImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCurrency()
   * @generated
   */
  int CURRENCY = 48;

  /**
   * The feature id for the '<em><b>Currency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENCY__CURRENCY = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Currency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENCY_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CurrencyFormatImpl <em>Currency Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CurrencyFormatImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCurrencyFormat()
   * @generated
   */
  int CURRENCY_FORMAT = 49;

  /**
   * The number of structural features of the '<em>Currency Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENCY_FORMAT_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LimitsAttributeImpl <em>Limits Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LimitsAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLimitsAttribute()
   * @generated
   */
  int LIMITS_ATTRIBUTE = 97;

  /**
   * The number of structural features of the '<em>Limits Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DailyMaxImpl <em>Daily Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DailyMaxImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDailyMax()
   * @generated
   */
  int DAILY_MAX = 50;

  /**
   * The number of structural features of the '<em>Daily Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAILY_MAX_FEATURE_COUNT = LIMITS_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DailyMinImpl <em>Daily Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DailyMinImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDailyMin()
   * @generated
   */
  int DAILY_MIN = 51;

  /**
   * The number of structural features of the '<em>Daily Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAILY_MIN_FEATURE_COUNT = LIMITS_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DailyWorkingHoursImpl <em>Daily Working Hours</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DailyWorkingHoursImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDailyWorkingHours()
   * @generated
   */
  int DAILY_WORKING_HOURS = 52;

  /**
   * The feature id for the '<em><b>Daily Working Hours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAILY_WORKING_HOURS__DAILY_WORKING_HOURS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Daily Working Hours</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAILY_WORKING_HOURS_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DefinitionsImpl <em>Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DefinitionsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDefinitions()
   * @generated
   */
  int DEFINITIONS = 53;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__ALL = EXPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__NONE = EXPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS_FEATURE_COUNT = EXPORT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DependsImpl <em>Depends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DependsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDepends()
   * @generated
   */
  int DEPENDS = 54;

  /**
   * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS__DEPENDENCY = 0;

  /**
   * The number of structural features of the '<em>Depends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DetailsImpl <em>Details</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DetailsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDetails()
   * @generated
   */
  int DETAILS = 55;

  /**
   * The number of structural features of the '<em>Details</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_FEATURE_COUNT = STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DurationImpl <em>Duration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DurationImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDuration()
   * @generated
   */
  int DURATION = 56;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__DURATION = 0;

  /**
   * The number of structural features of the '<em>Duration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.EfficiencyImpl <em>Efficiency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.EfficiencyImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getEfficiency()
   * @generated
   */
  int EFFICIENCY = 57;

  /**
   * The feature id for the '<em><b>Efficiency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFICIENCY__EFFICIENCY = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Efficiency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFICIENCY_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.EffortImpl <em>Effort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.EffortImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getEffort()
   * @generated
   */
  int EFFORT = 58;

  /**
   * The feature id for the '<em><b>Effort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFORT__EFFORT = 0;

  /**
   * The number of structural features of the '<em>Effort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.EmailImpl <em>Email</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.EmailImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getEmail()
   * @generated
   */
  int EMAIL = 59;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__ADDRESS = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Email</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.EndCreditImpl <em>End Credit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.EndCreditImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getEndCredit()
   * @generated
   */
  int END_CREDIT = 61;

  /**
   * The feature id for the '<em><b>Credit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_CREDIT__CREDIT = 0;

  /**
   * The number of structural features of the '<em>End Credit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_CREDIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.EpilogImpl <em>Epilog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.EpilogImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getEpilog()
   * @generated
   */
  int EPILOG = 62;

  /**
   * The number of structural features of the '<em>Epilog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPILOG_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExtendImpl <em>Extend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExtendImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExtend()
   * @generated
   */
  int EXTEND = 63;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Inherit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__INHERIT = 2;

  /**
   * The feature id for the '<em><b>Scenariospecific</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__SCENARIOSPECIFIC = 3;

  /**
   * The number of structural features of the '<em>Extend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExtendResourceImpl <em>Extend Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExtendResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExtendResource()
   * @generated
   */
  int EXTEND_RESOURCE = 64;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_RESOURCE__EXTENDS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extend Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_RESOURCE_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExtendedResourceAttributeImpl <em>Extended Resource Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExtendedResourceAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExtendedResourceAttribute()
   * @generated
   */
  int EXTENDED_RESOURCE_ATTRIBUTE = 65;

  /**
   * The feature id for the '<em><b>Extend</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RESOURCE_ATTRIBUTE__EXTEND = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RESOURCE_ATTRIBUTE__VALUE = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extended Resource Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RESOURCE_ATTRIBUTE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExtendTaskImpl <em>Extend Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExtendTaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExtendTask()
   * @generated
   */
  int EXTEND_TASK = 66;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_TASK__EXTENDS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extend Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_TASK_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExtendedTaskAttributeImpl <em>Extended Task Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExtendedTaskAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExtendedTaskAttribute()
   * @generated
   */
  int EXTENDED_TASK_ATTRIBUTE = 67;

  /**
   * The feature id for the '<em><b>Extend</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_TASK_ATTRIBUTE__EXTEND = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_TASK_ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Extended Task Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_TASK_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.FailImpl <em>Fail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.FailImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getFail()
   * @generated
   */
  int FAIL = 68;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL__EXPRESSION = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.FlagsImpl <em>Flags</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.FlagsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getFlags()
   * @generated
   */
  int FLAGS = 69;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAGS__FLAGS = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Flags</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAGS_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.FontColorImpl <em>Font Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.FontColorImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getFontColor()
   * @generated
   */
  int FONT_COLOR = 70;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_COLOR__COLOR = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_COLOR_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.FooterImpl <em>Footer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.FooterImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getFooter()
   * @generated
   */
  int FOOTER = 71;

  /**
   * The number of structural features of the '<em>Footer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOOTER_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.FormatsImpl <em>Formats</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.FormatsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getFormats()
   * @generated
   */
  int FORMATS = 72;

  /**
   * The feature id for the '<em><b>Formats</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATS__FORMATS = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Formats</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.FunctionImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 73;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__LEVEL = 0;

  /**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DATE = 1;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__SCENARIO = 2;

  /**
   * The feature id for the '<em><b>Parent Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARENT_ID = 3;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TASK = 4;

  /**
   * The feature id for the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DISTANCE = 5;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RESOURCE = 6;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.GapDurationImpl <em>Gap Duration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.GapDurationImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getGapDuration()
   * @generated
   */
  int GAP_DURATION = 74;

  /**
   * The number of structural features of the '<em>Gap Duration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAP_DURATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.GapLengthImpl <em>Gap Length</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.GapLengthImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getGapLength()
   * @generated
   */
  int GAP_LENGTH = 75;

  /**
   * The number of structural features of the '<em>Gap Length</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAP_LENGTH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.HAlignImpl <em>HAlign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.HAlignImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getHAlign()
   * @generated
   */
  int HALIGN = 76;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGN__EXPRESSION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Justification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGN__JUSTIFICATION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>HAlign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGN_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.HeaderImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 77;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.HeadlineImpl <em>Headline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.HeadlineImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getHeadline()
   * @generated
   */
  int HEADLINE = 78;

  /**
   * The number of structural features of the '<em>Headline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADLINE_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.HideAccountImpl <em>Hide Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.HideAccountImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getHideAccount()
   * @generated
   */
  int HIDE_ACCOUNT = 79;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_ACCOUNT__EXPRESSION = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_ACCOUNT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.HideJournalEntryImpl <em>Hide Journal Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.HideJournalEntryImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getHideJournalEntry()
   * @generated
   */
  int HIDE_JOURNAL_ENTRY = 80;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_JOURNAL_ENTRY__EXPRESSION = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide Journal Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_JOURNAL_ENTRY_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.HideReportImpl <em>Hide Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.HideReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getHideReport()
   * @generated
   */
  int HIDE_REPORT = 81;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_REPORT__EXPRESSION = NAVIGATOR_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_REPORT_FEATURE_COUNT = NAVIGATOR_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.HideResourceImpl <em>Hide Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.HideResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getHideResource()
   * @generated
   */
  int HIDE_RESOURCE = 82;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_RESOURCE__EXPRESSION = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_RESOURCE_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.HideTaskImpl <em>Hide Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.HideTaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getHideTask()
   * @generated
   */
  int HIDE_TASK = 83;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_TASK__EXPRESSION = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_TASK_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.IncludeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 84;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__IMPORT_URI = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.IncludePropertiesImpl <em>Include Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.IncludePropertiesImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getIncludeProperties()
   * @generated
   */
  int INCLUDE_PROPERTIES = 85;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_PROPERTIES__IMPORT_URI = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_PROPERTIES__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Include Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_PROPERTIES_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.Interval1Impl <em>Interval1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.Interval1Impl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getInterval1()
   * @generated
   */
  int INTERVAL1 = 87;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL1__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL1__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL1__DURATION = 2;

  /**
   * The number of structural features of the '<em>Interval1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL1_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.Interval2Impl <em>Interval2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.Interval2Impl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getInterval2()
   * @generated
   */
  int INTERVAL2 = 88;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL2__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL2__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL2__DURATION = 2;

  /**
   * The number of structural features of the '<em>Interval2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL2_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.Interval3Impl <em>Interval3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.Interval3Impl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getInterval3()
   * @generated
   */
  int INTERVAL3 = 89;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL3__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL3__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL3__DURATION = 2;

  /**
   * The number of structural features of the '<em>Interval3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL3_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.Interval4Impl <em>Interval4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.Interval4Impl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getInterval4()
   * @generated
   */
  int INTERVAL4 = 90;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL4__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL4__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL4__DURATION = 2;

  /**
   * The number of structural features of the '<em>Interval4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL4_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.JournalAttributesImpl <em>Journal Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.JournalAttributesImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getJournalAttributes()
   * @generated
   */
  int JOURNAL_ATTRIBUTES = 91;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__ARGS = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Journal Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.JournalEntryImpl <em>Journal Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.JournalEntryImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getJournalEntry()
   * @generated
   */
  int JOURNAL_ENTRY = 92;

  /**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__DATE = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Headline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__HEADLINE = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__ALERT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__AUTHOR = PROJECT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__DETAILS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Summary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__SUMMARY = PROJECT_ATTRIBUTE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Journal Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.JournalModeImpl <em>Journal Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.JournalModeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getJournalMode()
   * @generated
   */
  int JOURNAL_MODE = 93;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_MODE__MODE = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Journal Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_MODE_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LeftImpl <em>Left</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LeftImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLeft()
   * @generated
   */
  int LEFT = 94;

  /**
   * The number of structural features of the '<em>Left</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LengthImpl <em>Length</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LengthImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLength()
   * @generated
   */
  int LENGTH = 95;

  /**
   * The feature id for the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH__LENGTH = 0;

  /**
   * The number of structural features of the '<em>Length</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LimitsImpl <em>Limits</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LimitsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLimits()
   * @generated
   */
  int LIMITS = 96;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Limits</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ListItemImpl <em>List Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ListItemImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getListItem()
   * @generated
   */
  int LIST_ITEM = 98;

  /**
   * The number of structural features of the '<em>List Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ListTypeImpl <em>List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ListTypeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getListType()
   * @generated
   */
  int LIST_TYPE = 99;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__TYPE = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LoadUnitImpl <em>Load Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LoadUnitImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLoadUnit()
   * @generated
   */
  int LOAD_UNIT = 100;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_UNIT__UNIT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Load Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_UNIT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LogicalExpressionImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLogicalExpression()
   * @generated
   */
  int LOGICAL_EXPRESSION = 101;

  /**
   * The feature id for the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION__LEFT_OPERANT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION__RIGHT_OPERAND = 2;

  /**
   * The number of structural features of the '<em>Logical Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MacroImpl <em>Macro</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MacroImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMacro()
   * @generated
   */
  int MACRO = 102;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO__ID = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO__VALUE = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO__PROPERTIES = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Macro</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ManagersImpl <em>Managers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ManagersImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getManagers()
   * @generated
   */
  int MANAGERS = 103;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGERS__RESOURCES = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Managers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGERS_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MandatoryImpl <em>Mandatory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MandatoryImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMandatory()
   * @generated
   */
  int MANDATORY = 104;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY__MANDATORY = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MaxEndImpl <em>Max End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MaxEndImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMaxEnd()
   * @generated
   */
  int MAX_END = 105;

  /**
   * The feature id for the '<em><b>Max End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_END__MAX_END = 0;

  /**
   * The number of structural features of the '<em>Max End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_END_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MaximumImpl <em>Maximum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MaximumImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMaximum()
   * @generated
   */
  int MAXIMUM = 106;

  /**
   * The number of structural features of the '<em>Maximum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXIMUM_FEATURE_COUNT = LIMITS_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MaxStartImpl <em>Max Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MaxStartImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMaxStart()
   * @generated
   */
  int MAX_START = 107;

  /**
   * The feature id for the '<em><b>Max Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_START__MAX_START = 0;

  /**
   * The number of structural features of the '<em>Max Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_START_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MilestoneImpl <em>Milestone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MilestoneImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMilestone()
   * @generated
   */
  int MILESTONE = 108;

  /**
   * The feature id for the '<em><b>Milestone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__MILESTONE = 0;

  /**
   * The number of structural features of the '<em>Milestone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MinimumImpl <em>Minimum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MinimumImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMinimum()
   * @generated
   */
  int MINIMUM = 109;

  /**
   * The number of structural features of the '<em>Minimum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINIMUM_FEATURE_COUNT = LIMITS_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MinEndImpl <em>Min End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MinEndImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMinEnd()
   * @generated
   */
  int MIN_END = 110;

  /**
   * The feature id for the '<em><b>Min End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_END__MIN_END = 0;

  /**
   * The number of structural features of the '<em>Min End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_END_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MinStartImpl <em>Min Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MinStartImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMinStart()
   * @generated
   */
  int MIN_START = 111;

  /**
   * The feature id for the '<em><b>Min Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_START__MIN_START = 0;

  /**
   * The number of structural features of the '<em>Min Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_START_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MonthlyMaxImpl <em>Monthly Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MonthlyMaxImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMonthlyMax()
   * @generated
   */
  int MONTHLY_MAX = 112;

  /**
   * The number of structural features of the '<em>Monthly Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTHLY_MAX_FEATURE_COUNT = LIMITS_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.MonthlyMinImpl <em>Monthly Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.MonthlyMinImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getMonthlyMin()
   * @generated
   */
  int MONTHLY_MIN = 113;

  /**
   * The number of structural features of the '<em>Monthly Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTHLY_MIN_FEATURE_COUNT = LIMITS_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NoteImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNote()
   * @generated
   */
  int NOTE = 114;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__NOTE = 0;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NowImpl <em>Now</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NowImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNow()
   * @generated
   */
  int NOW = 115;

  /**
   * The feature id for the '<em><b>Now</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOW__NOW = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Now</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOW_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.NumberFormatImpl <em>Number Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.NumberFormatImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getNumberFormat()
   * @generated
   */
  int NUMBER_FORMAT = 116;

  /**
   * The number of structural features of the '<em>Number Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FORMAT_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PeriodImpl <em>Period</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PeriodImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPeriod()
   * @generated
   */
  int PERIOD = 117;

  /**
   * The feature id for the '<em><b>Period</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD__PERIOD = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Period</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PersistentImpl <em>Persistent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PersistentImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPersistent()
   * @generated
   */
  int PERSISTENT = 118;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENT__PERSISTENT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Persistent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENT_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PrecedesImpl <em>Precedes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PrecedesImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPrecedes()
   * @generated
   */
  int PRECEDES = 119;

  /**
   * The number of structural features of the '<em>Precedes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PriorityImpl <em>Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PriorityImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 120;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY__PRIORITY = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY_FEATURE_COUNT = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ProjectIdImpl <em>Project Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ProjectIdImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getProjectId()
   * @generated
   */
  int PROJECT_ID = 121;

  /**
   * The feature id for the '<em><b>Project Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_ID__PROJECT_ID = 0;

  /**
   * The number of structural features of the '<em>Project Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ProjectIdsImpl <em>Project Ids</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ProjectIdsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getProjectIds()
   * @generated
   */
  int PROJECT_IDS = 122;

  /**
   * The feature id for the '<em><b>Ids</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_IDS__IDS = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Project Ids</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_IDS_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PrologImpl <em>Prolog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PrologImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getProlog()
   * @generated
   */
  int PROLOG = 123;

  /**
   * The number of structural features of the '<em>Prolog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PurgeReportImpl <em>Purge Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PurgeReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPurgeReport()
   * @generated
   */
  int PURGE_REPORT = 124;

  /**
   * The feature id for the '<em><b>List Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURGE_REPORT__LIST_ATTRIBUTE = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Purge Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURGE_REPORT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PurgeResourceImpl <em>Purge Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PurgeResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPurgeResource()
   * @generated
   */
  int PURGE_RESOURCE = 125;

  /**
   * The feature id for the '<em><b>List Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURGE_RESOURCE__LIST_ATTRIBUTE = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Purge Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURGE_RESOURCE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.PurgeTaskImpl <em>Purge Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.PurgeTaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPurgeTask()
   * @generated
   */
  int PURGE_TASK = 126;

  /**
   * The feature id for the '<em><b>List Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURGE_TASK__LIST_ATTRIBUTE = 0;

  /**
   * The number of structural features of the '<em>Purge Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURGE_TASK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RateImpl <em>Rate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RateImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRate()
   * @generated
   */
  int RATE = 127;

  /**
   * The feature id for the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE__RATE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RemainingImpl <em>Remaining</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RemainingImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRemaining()
   * @generated
   */
  int REMAINING = 128;

  /**
   * The feature id for the '<em><b>Remaining</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMAINING__REMAINING = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Remaining</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMAINING_FEATURE_COUNT = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ReportPrefixImpl <em>Report Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ReportPrefixImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getReportPrefix()
   * @generated
   */
  int REPORT_PREFIX = 129;

  /**
   * The feature id for the '<em><b>Report</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_PREFIX__REPORT = INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Report Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_PREFIX_FEATURE_COUNT = INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ResourceAttributesImpl <em>Resource Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ResourceAttributesImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getResourceAttributes()
   * @generated
   */
  int RESOURCE_ATTRIBUTES = 130;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__ALL = EXPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__NONE = EXPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vacation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__VACATION = EXPORT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Booking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__BOOKING = EXPORT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Working Hours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__WORKING_HOURS = EXPORT_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Resource Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES_FEATURE_COUNT = EXPORT_ATTRIBUTE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ResourcePrefixImpl <em>Resource Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ResourcePrefixImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getResourcePrefix()
   * @generated
   */
  int RESOURCE_PREFIX = 131;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_PREFIX__RESOURCE = INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resource Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_PREFIX_FEATURE_COUNT = INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ResourceReportImpl <em>Resource Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ResourceReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getResourceReport()
   * @generated
   */
  int RESOURCE_REPORT = 132;

  /**
   * The number of structural features of the '<em>Resource Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ResourceRootImpl <em>Resource Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ResourceRootImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getResourceRoot()
   * @generated
   */
  int RESOURCE_ROOT = 133;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ROOT__RESOURCE = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resource Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ROOT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ResponsibleImpl <em>Responsible</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ResponsibleImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getResponsible()
   * @generated
   */
  int RESPONSIBLE = 134;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBLE__RESOURCES = 0;

  /**
   * The number of structural features of the '<em>Responsible</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RGBImpl <em>RGB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RGBImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRGB()
   * @generated
   */
  int RGB = 135;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__VALUE = 0;

  /**
   * The number of structural features of the '<em>RGB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RightImpl <em>Right</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RightImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRight()
   * @generated
   */
  int RIGHT = 136;

  /**
   * The number of structural features of the '<em>Right</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RollupAccountImpl <em>Rollup Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RollupAccountImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRollupAccount()
   * @generated
   */
  int ROLLUP_ACCOUNT = 137;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_ACCOUNT__EXPRESSION = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rollup Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_ACCOUNT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RollupResourceImpl <em>Rollup Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RollupResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRollupResource()
   * @generated
   */
  int ROLLUP_RESOURCE = 138;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_RESOURCE__EXPRESSION = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rollup Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_RESOURCE_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RollupTaskImpl <em>Rollup Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RollupTaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRollupTask()
   * @generated
   */
  int ROLLUP_TASK = 139;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_TASK__EXPRESSION = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rollup Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_TASK_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ScaleImpl <em>Scale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ScaleImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getScale()
   * @generated
   */
  int SCALE = 140;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE__SCALE = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ScenarioImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 141;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__ID = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__ACTIVE = PROJECT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__SCENARIO = PROJECT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ScenarioIcalImpl <em>Scenario Ical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ScenarioIcalImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getScenarioIcal()
   * @generated
   */
  int SCENARIO_ICAL = 142;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_ICAL__SCENARIO = ICAL_REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scenario Ical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_ICAL_FEATURE_COUNT = ICAL_REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ScenariosImpl <em>Scenarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ScenariosImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getScenarios()
   * @generated
   */
  int SCENARIOS = 143;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIOS__SCENARIOS = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scenarios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIOS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ScheduledImpl <em>Scheduled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ScheduledImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getScheduled()
   * @generated
   */
  int SCHEDULED = 144;

  /**
   * The feature id for the '<em><b>Scheduled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULED__SCHEDULED = 0;

  /**
   * The number of structural features of the '<em>Scheduled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SchedulingImpl <em>Scheduling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SchedulingImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getScheduling()
   * @generated
   */
  int SCHEDULING = 145;

  /**
   * The feature id for the '<em><b>Scheduling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULING__SCHEDULING = 0;

  /**
   * The number of structural features of the '<em>Scheduling</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SelectImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 146;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__ARGUMENT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SelfContainedImpl <em>Self Contained</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SelfContainedImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSelfContained()
   * @generated
   */
  int SELF_CONTAINED = 147;

  /**
   * The feature id for the '<em><b>Selfcontained</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_CONTAINED__SELFCONTAINED = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Self Contained</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_CONTAINED_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ShiftImpl <em>Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ShiftImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getShift()
   * @generated
   */
  int SHIFT = 148;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__ID = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__NAME = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Replace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__REPLACE = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Timezone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__TIMEZONE = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Vacation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__VACATION = PROPERTY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Shift</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__SHIFT = PROPERTY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Working Hours</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__WORKING_HOURS = PROPERTY_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ShiftTimesheetImpl <em>Shift Timesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ShiftTimesheetImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getShiftTimesheet()
   * @generated
   */
  int SHIFT_TIMESHEET = 149;

  /**
   * The feature id for the '<em><b>Shift</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_TIMESHEET__SHIFT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Shift Timesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_TIMESHEET_FEATURE_COUNT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ShiftsResourceImpl <em>Shifts Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ShiftsResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getShiftsResource()
   * @generated
   */
  int SHIFTS_RESOURCE = 153;

  /**
   * The number of structural features of the '<em>Shifts Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_RESOURCE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ShiftsImpl <em>Shifts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ShiftsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getShifts()
   * @generated
   */
  int SHIFTS = 150;

  /**
   * The feature id for the '<em><b>Limits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS__LIMITS = SHIFTS_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Shifts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_FEATURE_COUNT = SHIFTS_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ShiftsLimitImpl <em>Shifts Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ShiftsLimitImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getShiftsLimit()
   * @generated
   */
  int SHIFTS_LIMIT = 151;

  /**
   * The feature id for the '<em><b>Shift</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_LIMIT__SHIFT = 0;

  /**
   * The feature id for the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_LIMIT__LIMIT = 1;

  /**
   * The number of structural features of the '<em>Shifts Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_LIMIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ShiftsAllocateImpl <em>Shifts Allocate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ShiftsAllocateImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getShiftsAllocate()
   * @generated
   */
  int SHIFTS_ALLOCATE = 152;

  /**
   * The feature id for the '<em><b>Shift</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_ALLOCATE__SHIFT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_ALLOCATE__INTERVALS = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Shifts Allocate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_ALLOCATE_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ShiftsTaskImpl <em>Shifts Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ShiftsTaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getShiftsTask()
   * @generated
   */
  int SHIFTS_TASK = 154;

  /**
   * The number of structural features of the '<em>Shifts Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_TASK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ShortTimeFormatImpl <em>Short Time Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ShortTimeFormatImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getShortTimeFormat()
   * @generated
   */
  int SHORT_TIME_FORMAT = 155;

  /**
   * The feature id for the '<em><b>Short Time Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_TIME_FORMAT__SHORT_TIME_FORMAT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Short Time Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_TIME_FORMAT_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SortAccountsImpl <em>Sort Accounts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SortAccountsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSortAccounts()
   * @generated
   */
  int SORT_ACCOUNTS = 157;

  /**
   * The number of structural features of the '<em>Sort Accounts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_ACCOUNTS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SortImpl <em>Sort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SortImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSort()
   * @generated
   */
  int SORT = 156;

  /**
   * The feature id for the '<em><b>Tree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__TREE = SORT_ACCOUNTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__CRITERIA = SORT_ACCOUNTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_FEATURE_COUNT = SORT_ACCOUNTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SortJournalEntriesImpl <em>Sort Journal Entries</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SortJournalEntriesImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSortJournalEntries()
   * @generated
   */
  int SORT_JOURNAL_ENTRIES = 158;

  /**
   * The number of structural features of the '<em>Sort Journal Entries</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_JOURNAL_ENTRIES_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SortResourcesImpl <em>Sort Resources</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SortResourcesImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSortResources()
   * @generated
   */
  int SORT_RESOURCES = 159;

  /**
   * The number of structural features of the '<em>Sort Resources</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_RESOURCES_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SortTasksImpl <em>Sort Tasks</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SortTasksImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSortTasks()
   * @generated
   */
  int SORT_TASKS = 160;

  /**
   * The number of structural features of the '<em>Sort Tasks</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_TASKS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StartImpl <em>Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StartImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStart()
   * @generated
   */
  int START = 161;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__START = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskStatusSheetAttributeImpl <em>Task Status Sheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskStatusSheetAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskStatusSheetAttribute()
   * @generated
   */
  int TASK_STATUS_SHEET_ATTRIBUTE = 177;

  /**
   * The number of structural features of the '<em>Task Status Sheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StatusStatusSheetImpl <em>Status Status Sheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StatusStatusSheetImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStatusStatusSheet()
   * @generated
   */
  int STATUS_STATUS_SHEET = 162;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET__LEVEL = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET__TEXT = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET__ATTRIBUTES = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Status Status Sheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET_FEATURE_COUNT = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskTimesheetAttributeImpl <em>Task Timesheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskTimesheetAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskTimesheetAttribute()
   * @generated
   */
  int TASK_TIMESHEET_ATTRIBUTE = 179;

  /**
   * The number of structural features of the '<em>Task Timesheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TIMESHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StatusTimesheetImpl <em>Status Timesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StatusTimesheetImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStatusTimesheet()
   * @generated
   */
  int STATUS_TIMESHEET = 164;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_TIMESHEET__LEVEL = TASK_TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_TIMESHEET__TEXT = TASK_TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_TIMESHEET__ATTRIBUTES = TASK_TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Status Timesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_TIMESHEET_FEATURE_COUNT = TASK_TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StatusTimesheetAttributeImpl <em>Status Timesheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StatusTimesheetAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStatusTimesheetAttribute()
   * @generated
   */
  int STATUS_TIMESHEET_ATTRIBUTE = 165;

  /**
   * The number of structural features of the '<em>Status Timesheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_TIMESHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StatusSheetImpl <em>Status Sheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StatusSheetImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStatusSheet()
   * @generated
   */
  int STATUS_SHEET = 166;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET__RESOURCE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET__INTERVAL = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Status Sheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StatusSheetAttributeImpl <em>Status Sheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StatusSheetAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStatusSheetAttribute()
   * @generated
   */
  int STATUS_SHEET_ATTRIBUTE = 167;

  /**
   * The number of structural features of the '<em>Status Sheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StatusSheetReportImpl <em>Status Sheet Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StatusSheetReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStatusSheetReport()
   * @generated
   */
  int STATUS_SHEET_REPORT = 168;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET_REPORT__FILENAME = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET_REPORT__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Status Sheet Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.StatusSheetReportAttributeImpl <em>Status Sheet Report Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.StatusSheetReportAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getStatusSheetReportAttribute()
   * @generated
   */
  int STATUS_SHEET_REPORT_ATTRIBUTE = 169;

  /**
   * The number of structural features of the '<em>Status Sheet Report Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_SHEET_REPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SummaryImpl <em>Summary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SummaryImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSummary()
   * @generated
   */
  int SUMMARY = 170;

  /**
   * The number of structural features of the '<em>Summary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMARY_FEATURE_COUNT = STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SupplementAccountImpl <em>Supplement Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SupplementAccountImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSupplementAccount()
   * @generated
   */
  int SUPPLEMENT_ACCOUNT = 171;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_ACCOUNT__ACCOUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_ACCOUNT__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Supplement Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_ACCOUNT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SupplementReportImpl <em>Supplement Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SupplementReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSupplementReport()
   * @generated
   */
  int SUPPLEMENT_REPORT = 172;

  /**
   * The feature id for the '<em><b>Report</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_REPORT__REPORT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_REPORT__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Supplement Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SupplementResourceImpl <em>Supplement Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SupplementResourceImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSupplementResource()
   * @generated
   */
  int SUPPLEMENT_RESOURCE = 173;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_RESOURCE__RESOURCE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_RESOURCE__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Supplement Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_RESOURCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.SupplementTaskImpl <em>Supplement Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.SupplementTaskImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSupplementTask()
   * @generated
   */
  int SUPPLEMENT_TASK = 174;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_TASK__TASK = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_TASK__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Supplement Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_TASK_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TagFileImpl <em>Tag File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TagFileImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTagFile()
   * @generated
   */
  int TAG_FILE = 175;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__ID = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__FILENAME = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hide Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__HIDE_RESOURCE = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Hide Task</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__HIDE_TASK = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rollup Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__ROLLUP_RESOURCE = PROPERTY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rollup Task</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__ROLLUP_TASK = PROPERTY_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Tag File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskStatusSheetImpl <em>Task Status Sheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskStatusSheetImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskStatusSheet()
   * @generated
   */
  int TASK_STATUS_SHEET = 176;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATUS_SHEET__TASK = STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATUS_SHEET__ATTRIBUTES = STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task Status Sheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATUS_SHEET_FEATURE_COUNT = STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskTimesheetImpl <em>Task Timesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskTimesheetImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskTimesheet()
   * @generated
   */
  int TASK_TIMESHEET = 178;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TIMESHEET__TASK = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TIMESHEET__ATTRIBUTES = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task Timesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TIMESHEET_FEATURE_COUNT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskAttributesImpl <em>Task Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskAttributesImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskAttributes()
   * @generated
   */
  int TASK_ATTRIBUTES = 180;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__ALL = EXPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__NONE = EXPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Responsible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__RESPONSIBLE = EXPORT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__FLAGS = EXPORT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Maxstart</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__MAXSTART = EXPORT_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Maxend</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__MAXEND = EXPORT_ATTRIBUTE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__PRIORITY = EXPORT_ATTRIBUTE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Booking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__BOOKING = EXPORT_ATTRIBUTE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__NOTE = EXPORT_ATTRIBUTE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Minstart</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__MINSTART = EXPORT_ATTRIBUTE_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Minend</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__MINEND = EXPORT_ATTRIBUTE_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__COMPLETE = EXPORT_ATTRIBUTE_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Depends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__DEPENDS = EXPORT_ATTRIBUTE_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Task Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES_FEATURE_COUNT = EXPORT_ATTRIBUTE_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskPrefixImpl <em>Task Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskPrefixImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskPrefix()
   * @generated
   */
  int TASK_PREFIX = 181;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PREFIX__TASK = INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Task Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PREFIX_FEATURE_COUNT = INCLUDE_PROPERTIES_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskReportImpl <em>Task Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskReport()
   * @generated
   */
  int TASK_REPORT = 182;

  /**
   * The number of structural features of the '<em>Task Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskRootImpl <em>Task Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskRootImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskRoot()
   * @generated
   */
  int TASK_ROOT = 183;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ROOT__TASK = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Task Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ROOT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TextReportImpl <em>Text Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TextReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTextReport()
   * @generated
   */
  int TEXT_REPORT = 184;

  /**
   * The number of structural features of the '<em>Text Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TimeFormatImpl <em>Time Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TimeFormatImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimeFormat()
   * @generated
   */
  int TIME_FORMAT = 185;

  /**
   * The feature id for the '<em><b>Timeformat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FORMAT__TIMEFORMAT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Time Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FORMAT_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TimeoffImpl <em>Timeoff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TimeoffImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimeoff()
   * @generated
   */
  int TIMEOFF = 186;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOFF__ID = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOFF__NAME = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Timeoff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOFF_FEATURE_COUNT = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TimesheetImpl <em>Timesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TimesheetImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimesheet()
   * @generated
   */
  int TIMESHEET = 187;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET__RESOURCE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET__INTERVAL = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Timesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TimesheetReportImpl <em>Timesheet Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TimesheetReportImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimesheetReport()
   * @generated
   */
  int TIMESHEET_REPORT = 189;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT__FILENAME = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT__ATTRIBUTES = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Timesheet Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TimesheetReportAttributeImpl <em>Timesheet Report Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TimesheetReportAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimesheetReportAttribute()
   * @generated
   */
  int TIMESHEET_REPORT_ATTRIBUTE = 190;

  /**
   * The number of structural features of the '<em>Timesheet Report Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TimezoneImpl <em>Timezone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TimezoneImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimezone()
   * @generated
   */
  int TIMEZONE = 191;

  /**
   * The feature id for the '<em><b>Timezone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEZONE__TIMEZONE = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Timezone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEZONE_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TimingResolutionImpl <em>Timing Resolution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TimingResolutionImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimingResolution()
   * @generated
   */
  int TIMING_RESOLUTION = 192;

  /**
   * The feature id for the '<em><b>Timing Resolution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_RESOLUTION__TIMING_RESOLUTION = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Timing Resolution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_RESOLUTION_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TitleImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTitle()
   * @generated
   */
  int TITLE = 193;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__TITLE = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ToolTipImpl <em>Tool Tip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ToolTipImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getToolTip()
   * @generated
   */
  int TOOL_TIP = 194;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_TIP__EXPRESSION = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_TIP__TIP = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tool Tip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_TIP_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TrackingScenarioImpl <em>Tracking Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TrackingScenarioImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTrackingScenario()
   * @generated
   */
  int TRACKING_SCENARIO = 195;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACKING_SCENARIO__SCENARIO = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tracking Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACKING_SCENARIO_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TreeLevelImpl <em>Tree Level</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TreeLevelImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTreeLevel()
   * @generated
   */
  int TREE_LEVEL = 196;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_LEVEL__LEVEL = 0;

  /**
   * The number of structural features of the '<em>Tree Level</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_LEVEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.VacationImpl <em>Vacation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.VacationImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getVacation()
   * @generated
   */
  int VACATION = 197;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION__NAME = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION__INTERVALS = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Vacation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WarnImpl <em>Warn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WarnImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWarn()
   * @generated
   */
  int WARN = 198;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARN__EXPRESSION = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Warn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARN_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WeekStartsImpl <em>Week Starts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WeekStartsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWeekStarts()
   * @generated
   */
  int WEEK_STARTS = 199;

  /**
   * The feature id for the '<em><b>Sunday</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEK_STARTS__SUNDAY = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Monday</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEK_STARTS__MONDAY = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Week Starts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEK_STARTS_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WeeklyMaxImpl <em>Weekly Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WeeklyMaxImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWeeklyMax()
   * @generated
   */
  int WEEKLY_MAX = 200;

  /**
   * The number of structural features of the '<em>Weekly Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKLY_MAX_FEATURE_COUNT = LIMITS_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WeeklyMinImpl <em>Weekly Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WeeklyMinImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWeeklyMin()
   * @generated
   */
  int WEEKLY_MIN = 201;

  /**
   * The number of structural features of the '<em>Weekly Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKLY_MIN_FEATURE_COUNT = LIMITS_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WidthImpl <em>Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WidthImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWidth()
   * @generated
   */
  int WIDTH = 202;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH__WIDTH = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WorkImpl <em>Work</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WorkImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWork()
   * @generated
   */
  int WORK = 203;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK__VALUE = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK__UNIT = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Work</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_FEATURE_COUNT = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WorkingHoursImpl <em>Working Hours</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WorkingHoursImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWorkingHours()
   * @generated
   */
  int WORKING_HOURS = 204;

  /**
   * The feature id for the '<em><b>Weekdays</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_HOURS__WEEKDAYS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_HOURS__OFF = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hours</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_HOURS__HOURS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Working Hours</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_HOURS_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.YearlyWorkingDaysImpl <em>Yearly Working Days</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.YearlyWorkingDaysImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getYearlyWorkingDays()
   * @generated
   */
  int YEARLY_WORKING_DAYS = 205;

  /**
   * The feature id for the '<em><b>Yearly Working Days</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEARLY_WORKING_DAYS__YEARLY_WORKING_DAYS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Yearly Working Days</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEARLY_WORKING_DAYS_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.AccountShareImpl <em>Account Share</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.AccountShareImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAccountShare()
   * @generated
   */
  int ACCOUNT_SHARE = 206;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_SHARE__ACCOUNT = 0;

  /**
   * The feature id for the '<em><b>Share</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_SHARE__SHARE = 1;

  /**
   * The number of structural features of the '<em>Account Share</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_SHARE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExtendedResourceAttributeColumnImpl <em>Extended Resource Attribute Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExtendedResourceAttributeColumnImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExtendedResourceAttributeColumn()
   * @generated
   */
  int EXTENDED_RESOURCE_ATTRIBUTE_COLUMN = 208;

  /**
   * The feature id for the '<em><b>Extension</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RESOURCE_ATTRIBUTE_COLUMN__EXTENSION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extended Resource Attribute Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RESOURCE_ATTRIBUTE_COLUMN_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ColumnImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 209;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__ID = 0;

  /**
   * The feature id for the '<em><b>Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__EXT = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.CriterionImpl <em>Criterion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.CriterionImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCriterion()
   * @generated
   */
  int CRITERION = 210;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__SCENARIO = 0;

  /**
   * The feature id for the '<em><b>Column Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__COLUMN_ID = 1;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__DIRECTION = 2;

  /**
   * The number of structural features of the '<em>Criterion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DurationQuantityImpl <em>Duration Quantity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DurationQuantityImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDurationQuantity()
   * @generated
   */
  int DURATION_QUANTITY = 211;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_QUANTITY__VALUE = GAP_DURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_QUANTITY__UNIT = GAP_DURATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Duration Quantity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_QUANTITY_FEATURE_COUNT = GAP_DURATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LimitImpl <em>Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LimitImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLimit()
   * @generated
   */
  int LIMIT = 212;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__DURATION = DAILY_MAX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__ATTRIBUTES = DAILY_MAX_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_FEATURE_COUNT = DAILY_MAX_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LimitAttributeImpl <em>Limit Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LimitAttributeImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLimitAttribute()
   * @generated
   */
  int LIMIT_ATTRIBUTE = 213;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_ATTRIBUTE__END = 0;

  /**
   * The feature id for the '<em><b>Period</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_ATTRIBUTE__PERIOD = 1;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_ATTRIBUTE__RESOURCES = 2;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_ATTRIBUTE__START = 3;

  /**
   * The number of structural features of the '<em>Limit Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_ATTRIBUTE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RealFormatImpl <em>Real Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RealFormatImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRealFormat()
   * @generated
   */
  int REAL_FORMAT = 214;

  /**
   * The feature id for the '<em><b>Negative Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__NEGATIVE_PREFIX = CURRENCY_FORMAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Negative Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__NEGATIVE_SUFFIX = CURRENCY_FORMAT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Thousands Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__THOUSANDS_SEPARATOR = CURRENCY_FORMAT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fraction Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__FRACTION_SEPARATOR = CURRENCY_FORMAT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__FRACTION_DIGITS = CURRENCY_FORMAT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Real Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT_FEATURE_COUNT = CURRENCY_FORMAT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.TaskDependencyImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTaskDependency()
   * @generated
   */
  int TASK_DEPENDENCY = 215;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY__TASK = PRECEDES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Gap Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY__GAP_DURATION = PRECEDES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Gap Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY__GAP_LENGTH = PRECEDES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY__POLICY = PRECEDES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Task Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY_FEATURE_COUNT = PRECEDES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.RichTextImpl <em>Rich Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.RichTextImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getRichText()
   * @generated
   */
  int RICH_TEXT = 216;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_TEXT__TEXT = CAPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rich Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_TEXT_FEATURE_COUNT = CAPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WorkHoursImpl <em>Work Hours</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WorkHoursImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWorkHours()
   * @generated
   */
  int WORK_HOURS = 217;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_HOURS__START = 0;

  /**
   * The feature id for the '<em><b>Stop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_HOURS__STOP = 1;

  /**
   * The number of structural features of the '<em>Work Hours</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_HOURS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.WeekdaysImpl <em>Weekdays</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.WeekdaysImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWeekdays()
   * @generated
   */
  int WEEKDAYS = 218;

  /**
   * The feature id for the '<em><b>First</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKDAYS__FIRST = 0;

  /**
   * The feature id for the '<em><b>Last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKDAYS__LAST = 1;

  /**
   * The number of structural features of the '<em>Weekdays</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKDAYS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ISODATEImpl <em>ISODATE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ISODATEImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getISODATE()
   * @generated
   */
  int ISODATE = 219;

  /**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISODATE__DATE = 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISODATE__DURATION = 1;

  /**
   * The number of structural features of the '<em>ISODATE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISODATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.ExtDateImpl <em>Ext Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.ExtDateImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getExtDate()
   * @generated
   */
  int EXT_DATE = 220;

  /**
   * The number of structural features of the '<em>Ext Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXT_DATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.DefintionsImpl <em>Defintions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.DefintionsImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDefintions()
   * @generated
   */
  int DEFINTIONS = 221;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINTIONS__ALL = DEFINITIONS__ALL;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINTIONS__NONE = DEFINITIONS__NONE;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINTIONS__FLAGS = DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINTIONS__RESOURCES = DEFINITIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINTIONS__TASKS = DEFINITIONS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Project</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINTIONS__PROJECT = DEFINITIONS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Projectids</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINTIONS__PROJECTIDS = DEFINITIONS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Defintions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINTIONS_FEATURE_COUNT = DEFINITIONS_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LogicalFunctionExpressionImpl <em>Logical Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LogicalFunctionExpressionImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLogicalFunctionExpression()
   * @generated
   */
  int LOGICAL_FUNCTION_EXPRESSION = 222;

  /**
   * The feature id for the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FUNCTION_EXPRESSION__LEFT_OPERANT = LOGICAL_EXPRESSION__LEFT_OPERANT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FUNCTION_EXPRESSION__OP = LOGICAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FUNCTION_EXPRESSION__RIGHT_OPERAND = LOGICAL_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FUNCTION_EXPRESSION__FUNCTION = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Logical Function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FUNCTION_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LogicalAbsoluteIdExressionImpl <em>Logical Absolute Id Exression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LogicalAbsoluteIdExressionImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLogicalAbsoluteIdExression()
   * @generated
   */
  int LOGICAL_ABSOLUTE_ID_EXRESSION = 223;

  /**
   * The feature id for the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_ABSOLUTE_ID_EXRESSION__LEFT_OPERANT = LOGICAL_EXPRESSION__LEFT_OPERANT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_ABSOLUTE_ID_EXRESSION__OP = LOGICAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_ABSOLUTE_ID_EXRESSION__RIGHT_OPERAND = LOGICAL_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_ABSOLUTE_ID_EXRESSION__VALUE = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Logical Absolute Id Exression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_ABSOLUTE_ID_EXRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LogicalBooleanLiteralImpl <em>Logical Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LogicalBooleanLiteralImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLogicalBooleanLiteral()
   * @generated
   */
  int LOGICAL_BOOLEAN_LITERAL = 224;

  /**
   * The feature id for the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_BOOLEAN_LITERAL__LEFT_OPERANT = LOGICAL_EXPRESSION__LEFT_OPERANT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_BOOLEAN_LITERAL__OP = LOGICAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_BOOLEAN_LITERAL__RIGHT_OPERAND = LOGICAL_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_BOOLEAN_LITERAL__IS_TRUE = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Logical Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_BOOLEAN_LITERAL_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LogicalNumeralLiteralImpl <em>Logical Numeral Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LogicalNumeralLiteralImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLogicalNumeralLiteral()
   * @generated
   */
  int LOGICAL_NUMERAL_LITERAL = 225;

  /**
   * The feature id for the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_NUMERAL_LITERAL__LEFT_OPERANT = LOGICAL_EXPRESSION__LEFT_OPERANT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_NUMERAL_LITERAL__OP = LOGICAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_NUMERAL_LITERAL__RIGHT_OPERAND = LOGICAL_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_NUMERAL_LITERAL__VALUE = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Logical Numeral Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_NUMERAL_LITERAL_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LogicalStringLiteralImpl <em>Logical String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LogicalStringLiteralImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLogicalStringLiteral()
   * @generated
   */
  int LOGICAL_STRING_LITERAL = 226;

  /**
   * The feature id for the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_STRING_LITERAL__LEFT_OPERANT = LOGICAL_EXPRESSION__LEFT_OPERANT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_STRING_LITERAL__OP = LOGICAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_STRING_LITERAL__RIGHT_OPERAND = LOGICAL_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_STRING_LITERAL__VALUE = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Macro</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_STRING_LITERAL__MACRO = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Logical String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_STRING_LITERAL_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LogicalDateLiteralImpl <em>Logical Date Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LogicalDateLiteralImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLogicalDateLiteral()
   * @generated
   */
  int LOGICAL_DATE_LITERAL = 227;

  /**
   * The feature id for the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_DATE_LITERAL__LEFT_OPERANT = LOGICAL_EXPRESSION__LEFT_OPERANT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_DATE_LITERAL__OP = LOGICAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_DATE_LITERAL__RIGHT_OPERAND = LOGICAL_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_DATE_LITERAL__VALUE = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Logical Date Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_DATE_LITERAL_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.impl.LogicalFlagExpressionImpl <em>Logical Flag Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.impl.LogicalFlagExpressionImpl
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLogicalFlagExpression()
   * @generated
   */
  int LOGICAL_FLAG_EXPRESSION = 228;

  /**
   * The feature id for the '<em><b>Left Operant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FLAG_EXPRESSION__LEFT_OPERANT = LOGICAL_EXPRESSION__LEFT_OPERANT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FLAG_EXPRESSION__OP = LOGICAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FLAG_EXPRESSION__RIGHT_OPERAND = LOGICAL_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FLAG_EXPRESSION__SCENARIO = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Colum Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FLAG_EXPRESSION__COLUM_ID = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Logical Flag Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FLAG_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.LeaveType <em>Leave Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.LeaveType
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLeaveType()
   * @generated
   */
  int LEAVE_TYPE = 229;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.BuildInMacro <em>Build In Macro</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.BuildInMacro
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getBuildInMacro()
   * @generated
   */
  int BUILD_IN_MACRO = 230;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.JournalAttributeValues <em>Journal Attribute Values</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.JournalAttributeValues
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getJournalAttributeValues()
   * @generated
   */
  int JOURNAL_ATTRIBUTE_VALUES = 231;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.PurgeReportAttribute <em>Purge Report Attribute</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.PurgeReportAttribute
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPurgeReportAttribute()
   * @generated
   */
  int PURGE_REPORT_ATTRIBUTE = 232;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.PurgeResourceAttribute <em>Purge Resource Attribute</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.PurgeResourceAttribute
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPurgeResourceAttribute()
   * @generated
   */
  int PURGE_RESOURCE_ATTRIBUTE = 233;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.PurgeTaskAttribute <em>Purge Task Attribute</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.PurgeTaskAttribute
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getPurgeTaskAttribute()
   * @generated
   */
  int PURGE_TASK_ATTRIBUTE = 234;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.ChargeApplies <em>Charge Applies</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.ChargeApplies
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getChargeApplies()
   * @generated
   */
  int CHARGE_APPLIES = 235;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.Justification <em>Justification</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.Justification
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getJustification()
   * @generated
   */
  int JUSTIFICATION = 236;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.JournalModeValue <em>Journal Mode Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.JournalModeValue
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getJournalModeValue()
   * @generated
   */
  int JOURNAL_MODE_VALUE = 237;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.JournalEntrySortCriterion <em>Journal Entry Sort Criterion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.JournalEntrySortCriterion
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getJournalEntrySortCriterion()
   * @generated
   */
  int JOURNAL_ENTRY_SORT_CRITERION = 238;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.ListTypeValues <em>List Type Values</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.ListTypeValues
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getListTypeValues()
   * @generated
   */
  int LIST_TYPE_VALUES = 239;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.CriterionDirection <em>Criterion Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.CriterionDirection
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getCriterionDirection()
   * @generated
   */
  int CRITERION_DIRECTION = 240;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.YesNo <em>Yes No</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.YesNo
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getYesNo()
   * @generated
   */
  int YES_NO = 241;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.ReportFormat <em>Report Format</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.ReportFormat
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getReportFormat()
   * @generated
   */
  int REPORT_FORMAT = 242;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.LoadDisplayUnit <em>Load Display Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.LoadDisplayUnit
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getLoadDisplayUnit()
   * @generated
   */
  int LOAD_DISPLAY_UNIT = 243;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.ScaleResolution <em>Scale Resolution</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.ScaleResolution
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getScaleResolution()
   * @generated
   */
  int SCALE_RESOLUTION = 244;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.SelectArgument <em>Select Argument</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.SelectArgument
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSelectArgument()
   * @generated
   */
  int SELECT_ARGUMENT = 245;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.ColumnId <em>Column Id</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.ColumnId
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getColumnId()
   * @generated
   */
  int COLUMN_ID = 246;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.AlertLevel <em>Alert Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.AlertLevel
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getAlertLevel()
   * @generated
   */
  int ALERT_LEVEL = 247;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.DependsPolicy <em>Depends Policy</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.DependsPolicy
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getDependsPolicy()
   * @generated
   */
  int DEPENDS_POLICY = 248;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.SchedulingPolicy
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getSchedulingPolicy()
   * @generated
   */
  int SCHEDULING_POLICY = 249;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.TimeUnit <em>Time Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.TimeUnit
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getTimeUnit()
   * @generated
   */
  int TIME_UNIT = 250;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.Weekday <em>Weekday</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.Weekday
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWeekday()
   * @generated
   */
  int WEEKDAY = 251;

  /**
   * The meta object id for the '{@link de.sos.etj.eTJ.WorkQuantityUnit <em>Work Quantity Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sos.etj.eTJ.WorkQuantityUnit
   * @see de.sos.etj.eTJ.impl.ETJPackageImpl#getWorkQuantityUnit()
   * @generated
   */
  int WORK_QUANTITY_UNIT = 252;


  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global</em>'.
   * @see de.sos.etj.eTJ.Global
   * @generated
   */
  EClass getGlobal();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Global#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see de.sos.etj.eTJ.Global#getProject()
   * @see #getGlobal()
   * @generated
   */
  EReference getGlobal_Project();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Global#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.sos.etj.eTJ.Global#getProperties()
   * @see #getGlobal()
   * @generated
   */
  EReference getGlobal_Properties();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see de.sos.etj.eTJ.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Leaves <em>Leaves</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaves</em>'.
   * @see de.sos.etj.eTJ.Leaves
   * @generated
   */
  EClass getLeaves();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Leaves#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Details</em>'.
   * @see de.sos.etj.eTJ.Leaves#getDetails()
   * @see #getLeaves()
   * @generated
   */
  EReference getLeaves_Details();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LeaveDetails <em>Leave Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leave Details</em>'.
   * @see de.sos.etj.eTJ.LeaveDetails
   * @generated
   */
  EClass getLeaveDetails();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LeaveDetails#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.sos.etj.eTJ.LeaveDetails#getType()
   * @see #getLeaveDetails()
   * @generated
   */
  EAttribute getLeaveDetails_Type();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LeaveDetails#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.LeaveDetails#getName()
   * @see #getLeaveDetails()
   * @generated
   */
  EAttribute getLeaveDetails_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LeaveDetails#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see de.sos.etj.eTJ.LeaveDetails#getInterval()
   * @see #getLeaveDetails()
   * @generated
   */
  EReference getLeaveDetails_Interval();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Account <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account</em>'.
   * @see de.sos.etj.eTJ.Account
   * @generated
   */
  EClass getAccount();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Account#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Account#getId()
   * @see #getAccount()
   * @generated
   */
  EAttribute getAccount_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Account#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Account#getName()
   * @see #getAccount()
   * @generated
   */
  EAttribute getAccount_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Account#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Account#getAttributes()
   * @see #getAccount()
   * @generated
   */
  EReference getAccount_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.AccountAttribute <em>Account Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Attribute</em>'.
   * @see de.sos.etj.eTJ.AccountAttribute
   * @generated
   */
  EClass getAccountAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.AccountPrefix <em>Account Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Prefix</em>'.
   * @see de.sos.etj.eTJ.AccountPrefix
   * @generated
   */
  EClass getAccountPrefix();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.AccountPrefix#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Account</em>'.
   * @see de.sos.etj.eTJ.AccountPrefix#getAccount()
   * @see #getAccountPrefix()
   * @generated
   */
  EReference getAccountPrefix_Account();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.AccountReport <em>Account Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Report</em>'.
   * @see de.sos.etj.eTJ.AccountReport
   * @generated
   */
  EClass getAccountReport();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.AccountRoot <em>Account Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Root</em>'.
   * @see de.sos.etj.eTJ.AccountRoot
   * @generated
   */
  EClass getAccountRoot();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.AccountRoot#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Account</em>'.
   * @see de.sos.etj.eTJ.AccountRoot#getAccount()
   * @see #getAccountRoot()
   * @generated
   */
  EReference getAccountRoot_Account();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see de.sos.etj.eTJ.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Project#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Project#getId()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Project#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see de.sos.etj.eTJ.Project#getVersion()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Version();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Project#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see de.sos.etj.eTJ.Project#getInterval()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Interval();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Project#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Project#getAttributes()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ProjectAttribute <em>Project Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Attribute</em>'.
   * @see de.sos.etj.eTJ.ProjectAttribute
   * @generated
   */
  EClass getProjectAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see de.sos.etj.eTJ.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Task#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Task#getId()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Task#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Task#getAttributes()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskAttribute <em>Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Attribute</em>'.
   * @see de.sos.etj.eTJ.TaskAttribute
   * @generated
   */
  EClass getTaskAttribute();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.TaskAttribute#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scenario</em>'.
   * @see de.sos.etj.eTJ.TaskAttribute#getScenario()
   * @see #getTaskAttribute()
   * @generated
   */
  EReference getTaskAttribute_Scenario();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.TaskAttribute#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see de.sos.etj.eTJ.TaskAttribute#getAttr()
   * @see #getTaskAttribute()
   * @generated
   */
  EReference getTaskAttribute_Attr();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.MacroCall <em>Macro Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Macro Call</em>'.
   * @see de.sos.etj.eTJ.MacroCall
   * @generated
   */
  EClass getMacroCall();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.MacroCall#getMacro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Macro</em>'.
   * @see de.sos.etj.eTJ.MacroCall#getMacro()
   * @see #getMacroCall()
   * @generated
   */
  EReference getMacroCall_Macro();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.MacroCall#getBuildin <em>Buildin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Buildin</em>'.
   * @see de.sos.etj.eTJ.MacroCall#getBuildin()
   * @see #getMacroCall()
   * @generated
   */
  EAttribute getMacroCall_Buildin();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report</em>'.
   * @see de.sos.etj.eTJ.Report
   * @generated
   */
  EClass getReport();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Report#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Report#getId()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Report#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Report#getName()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Report#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Report#getAttributes()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ReportAttribute <em>Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report Attribute</em>'.
   * @see de.sos.etj.eTJ.ReportAttribute
   * @generated
   */
  EClass getReportAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.IcalReport <em>Ical Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ical Report</em>'.
   * @see de.sos.etj.eTJ.IcalReport
   * @generated
   */
  EClass getIcalReport();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.IcalReport#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see de.sos.etj.eTJ.IcalReport#getFilename()
   * @see #getIcalReport()
   * @generated
   */
  EAttribute getIcalReport_Filename();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.IcalReport#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.IcalReport#getAttributes()
   * @see #getIcalReport()
   * @generated
   */
  EReference getIcalReport_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.IcalReportAttribute <em>Ical Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ical Report Attribute</em>'.
   * @see de.sos.etj.eTJ.IcalReportAttribute
   * @generated
   */
  EClass getIcalReportAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Export <em>Export</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export</em>'.
   * @see de.sos.etj.eTJ.Export
   * @generated
   */
  EClass getExport();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Export#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Export#getId()
   * @see #getExport()
   * @generated
   */
  EAttribute getExport_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Export#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see de.sos.etj.eTJ.Export#getFilename()
   * @see #getExport()
   * @generated
   */
  EAttribute getExport_Filename();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Export#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Export#getAttributes()
   * @see #getExport()
   * @generated
   */
  EReference getExport_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ExportAttribute <em>Export Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Attribute</em>'.
   * @see de.sos.etj.eTJ.ExportAttribute
   * @generated
   */
  EClass getExportAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Resource#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Resource#getId()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Resource#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Resource#getAttributes()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ResourceAttribute <em>Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Attribute</em>'.
   * @see de.sos.etj.eTJ.ResourceAttribute
   * @generated
   */
  EClass getResourceAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Allocate <em>Allocate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocate</em>'.
   * @see de.sos.etj.eTJ.Allocate
   * @generated
   */
  EClass getAllocate();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Allocate#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see de.sos.etj.eTJ.Allocate#getResources()
   * @see #getAllocate()
   * @generated
   */
  EReference getAllocate_Resources();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.AllocateResource <em>Allocate Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocate Resource</em>'.
   * @see de.sos.etj.eTJ.AllocateResource
   * @generated
   */
  EClass getAllocateResource();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.AllocateResource#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.AllocateResource#getResource()
   * @see #getAllocateResource()
   * @generated
   */
  EReference getAllocateResource_Resource();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.AllocateResource#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.AllocateResource#getAttributes()
   * @see #getAllocateResource()
   * @generated
   */
  EReference getAllocateResource_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.AllocateResourceAttribute <em>Allocate Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocate Resource Attribute</em>'.
   * @see de.sos.etj.eTJ.AllocateResourceAttribute
   * @generated
   */
  EClass getAllocateResourceAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Navigator <em>Navigator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigator</em>'.
   * @see de.sos.etj.eTJ.Navigator
   * @generated
   */
  EClass getNavigator();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Navigator#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Navigator#getId()
   * @see #getNavigator()
   * @generated
   */
  EAttribute getNavigator_Id();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Navigator#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Navigator#getAttributes()
   * @see #getNavigator()
   * @generated
   */
  EReference getNavigator_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.NavigatorAttribute <em>Navigator Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigator Attribute</em>'.
   * @see de.sos.etj.eTJ.NavigatorAttribute
   * @generated
   */
  EClass getNavigatorAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.NewTask <em>New Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Task</em>'.
   * @see de.sos.etj.eTJ.NewTask
   * @generated
   */
  EClass getNewTask();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.NewTask#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.NewTask#getId()
   * @see #getNewTask()
   * @generated
   */
  EAttribute getNewTask_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.NewTask#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see de.sos.etj.eTJ.NewTask#getText()
   * @see #getNewTask()
   * @generated
   */
  EAttribute getNewTask_Text();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.NewTask#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.NewTask#getAttributes()
   * @see #getNewTask()
   * @generated
   */
  EReference getNewTask_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.NewTaskAttribute <em>New Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Task Attribute</em>'.
   * @see de.sos.etj.eTJ.NewTaskAttribute
   * @generated
   */
  EClass getNewTaskAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.NikuReport <em>Niku Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Niku Report</em>'.
   * @see de.sos.etj.eTJ.NikuReport
   * @generated
   */
  EClass getNikuReport();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.NikuReport#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see de.sos.etj.eTJ.NikuReport#getFilename()
   * @see #getNikuReport()
   * @generated
   */
  EAttribute getNikuReport_Filename();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.NikuReport#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.NikuReport#getAttributes()
   * @see #getNikuReport()
   * @generated
   */
  EReference getNikuReport_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.NikuReportAttribute <em>Niku Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Niku Report Attribute</em>'.
   * @see de.sos.etj.eTJ.NikuReportAttribute
   * @generated
   */
  EClass getNikuReportAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Alert <em>Alert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alert</em>'.
   * @see de.sos.etj.eTJ.Alert
   * @generated
   */
  EClass getAlert();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Alert#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see de.sos.etj.eTJ.Alert#getLevel()
   * @see #getAlert()
   * @generated
   */
  EAttribute getAlert_Level();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see de.sos.etj.eTJ.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the reference list '{@link de.sos.etj.eTJ.Alternative#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see de.sos.etj.eTJ.Alternative#getResources()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_Resources();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Author <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Author</em>'.
   * @see de.sos.etj.eTJ.Author
   * @generated
   */
  EClass getAuthor();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.Author#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.Author#getResource()
   * @see #getAuthor()
   * @generated
   */
  EReference getAuthor_Resource();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Balance <em>Balance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Balance</em>'.
   * @see de.sos.etj.eTJ.Balance
   * @generated
   */
  EClass getBalance();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.Balance#getCost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cost</em>'.
   * @see de.sos.etj.eTJ.Balance#getCost()
   * @see #getBalance()
   * @generated
   */
  EReference getBalance_Cost();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.Balance#getRevenue <em>Revenue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Revenue</em>'.
   * @see de.sos.etj.eTJ.Balance#getRevenue()
   * @see #getBalance()
   * @generated
   */
  EReference getBalance_Revenue();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Booking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Booking</em>'.
   * @see de.sos.etj.eTJ.Booking
   * @generated
   */
  EClass getBooking();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Booking#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see de.sos.etj.eTJ.Booking#getInterval()
   * @see #getBooking()
   * @generated
   */
  EReference getBooking_Interval();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Booking#getOvertime <em>Overtime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overtime</em>'.
   * @see de.sos.etj.eTJ.Booking#getOvertime()
   * @see #getBooking()
   * @generated
   */
  EAttribute getBooking_Overtime();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Booking#getSloppy <em>Sloppy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sloppy</em>'.
   * @see de.sos.etj.eTJ.Booking#getSloppy()
   * @see #getBooking()
   * @generated
   */
  EAttribute getBooking_Sloppy();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.BookingTask <em>Booking Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Booking Task</em>'.
   * @see de.sos.etj.eTJ.BookingTask
   * @generated
   */
  EClass getBookingTask();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.BookingTask#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.BookingTask#getResource()
   * @see #getBookingTask()
   * @generated
   */
  EReference getBookingTask_Resource();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.BookingTask#getBooking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Booking</em>'.
   * @see de.sos.etj.eTJ.BookingTask#getBooking()
   * @see #getBookingTask()
   * @generated
   */
  EReference getBookingTask_Booking();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.BookingResource <em>Booking Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Booking Resource</em>'.
   * @see de.sos.etj.eTJ.BookingResource
   * @generated
   */
  EClass getBookingResource();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.BookingResource#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.sos.etj.eTJ.BookingResource#getTask()
   * @see #getBookingResource()
   * @generated
   */
  EReference getBookingResource_Task();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.BookingResource#getBooking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Booking</em>'.
   * @see de.sos.etj.eTJ.BookingResource#getBooking()
   * @see #getBookingResource()
   * @generated
   */
  EReference getBookingResource_Booking();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Caption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Caption</em>'.
   * @see de.sos.etj.eTJ.Caption
   * @generated
   */
  EClass getCaption();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.CellColor <em>Cell Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Color</em>'.
   * @see de.sos.etj.eTJ.CellColor
   * @generated
   */
  EClass getCellColor();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.CellColor#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.CellColor#getExpression()
   * @see #getCellColor()
   * @generated
   */
  EReference getCellColor_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.CellColor#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see de.sos.etj.eTJ.CellColor#getColor()
   * @see #getCellColor()
   * @generated
   */
  EReference getCellColor_Color();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.CellText <em>Cell Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Text</em>'.
   * @see de.sos.etj.eTJ.CellText
   * @generated
   */
  EClass getCellText();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.CellText#getExpresssion <em>Expresssion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expresssion</em>'.
   * @see de.sos.etj.eTJ.CellText#getExpresssion()
   * @see #getCellText()
   * @generated
   */
  EReference getCellText_Expresssion();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.CellText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see de.sos.etj.eTJ.CellText#getText()
   * @see #getCellText()
   * @generated
   */
  EAttribute getCellText_Text();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Center <em>Center</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Center</em>'.
   * @see de.sos.etj.eTJ.Center
   * @generated
   */
  EClass getCenter();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Charge <em>Charge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Charge</em>'.
   * @see de.sos.etj.eTJ.Charge
   * @generated
   */
  EClass getCharge();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Charge#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see de.sos.etj.eTJ.Charge#getAmount()
   * @see #getCharge()
   * @generated
   */
  EAttribute getCharge_Amount();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Charge#getApplies <em>Applies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Applies</em>'.
   * @see de.sos.etj.eTJ.Charge#getApplies()
   * @see #getCharge()
   * @generated
   */
  EAttribute getCharge_Applies();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ChargeSet <em>Charge Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Charge Set</em>'.
   * @see de.sos.etj.eTJ.ChargeSet
   * @generated
   */
  EClass getChargeSet();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.ChargeSet#getAccountShares <em>Account Shares</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Account Shares</em>'.
   * @see de.sos.etj.eTJ.ChargeSet#getAccountShares()
   * @see #getChargeSet()
   * @generated
   */
  EReference getChargeSet_AccountShares();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Columns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Columns</em>'.
   * @see de.sos.etj.eTJ.Columns
   * @generated
   */
  EClass getColumns();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Columns#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see de.sos.etj.eTJ.Columns#getColumns()
   * @see #getColumns()
   * @generated
   */
  EReference getColumns_Columns();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Complete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complete</em>'.
   * @see de.sos.etj.eTJ.Complete
   * @generated
   */
  EClass getComplete();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Complete#getComplete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Complete</em>'.
   * @see de.sos.etj.eTJ.Complete#getComplete()
   * @see #getComplete()
   * @generated
   */
  EAttribute getComplete_Complete();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Copyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Copyright</em>'.
   * @see de.sos.etj.eTJ.Copyright
   * @generated
   */
  EClass getCopyright();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Copyright#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see de.sos.etj.eTJ.Copyright#getText()
   * @see #getCopyright()
   * @generated
   */
  EAttribute getCopyright_Text();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Credit <em>Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Credit</em>'.
   * @see de.sos.etj.eTJ.Credit
   * @generated
   */
  EClass getCredit();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Credit#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see de.sos.etj.eTJ.Credit#getDate()
   * @see #getCredit()
   * @generated
   */
  EReference getCredit_Date();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Credit#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.sos.etj.eTJ.Credit#getDescription()
   * @see #getCredit()
   * @generated
   */
  EAttribute getCredit_Description();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Credit#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see de.sos.etj.eTJ.Credit#getAmount()
   * @see #getCredit()
   * @generated
   */
  EAttribute getCredit_Amount();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Currency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Currency</em>'.
   * @see de.sos.etj.eTJ.Currency
   * @generated
   */
  EClass getCurrency();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Currency#getCurrency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Currency</em>'.
   * @see de.sos.etj.eTJ.Currency#getCurrency()
   * @see #getCurrency()
   * @generated
   */
  EAttribute getCurrency_Currency();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.CurrencyFormat <em>Currency Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Currency Format</em>'.
   * @see de.sos.etj.eTJ.CurrencyFormat
   * @generated
   */
  EClass getCurrencyFormat();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.DailyMax <em>Daily Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daily Max</em>'.
   * @see de.sos.etj.eTJ.DailyMax
   * @generated
   */
  EClass getDailyMax();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.DailyMin <em>Daily Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daily Min</em>'.
   * @see de.sos.etj.eTJ.DailyMin
   * @generated
   */
  EClass getDailyMin();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.DailyWorkingHours <em>Daily Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daily Working Hours</em>'.
   * @see de.sos.etj.eTJ.DailyWorkingHours
   * @generated
   */
  EClass getDailyWorkingHours();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.DailyWorkingHours#getDailyWorkingHours <em>Daily Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Daily Working Hours</em>'.
   * @see de.sos.etj.eTJ.DailyWorkingHours#getDailyWorkingHours()
   * @see #getDailyWorkingHours()
   * @generated
   */
  EAttribute getDailyWorkingHours_DailyWorkingHours();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definitions</em>'.
   * @see de.sos.etj.eTJ.Definitions
   * @generated
   */
  EClass getDefinitions();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Definitions#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see de.sos.etj.eTJ.Definitions#isAll()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_All();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Definitions#isNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see de.sos.etj.eTJ.Definitions#isNone()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_None();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Depends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Depends</em>'.
   * @see de.sos.etj.eTJ.Depends
   * @generated
   */
  EClass getDepends();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Depends#getDependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependency</em>'.
   * @see de.sos.etj.eTJ.Depends#getDependency()
   * @see #getDepends()
   * @generated
   */
  EReference getDepends_Dependency();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Details <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Details</em>'.
   * @see de.sos.etj.eTJ.Details
   * @generated
   */
  EClass getDetails();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duration</em>'.
   * @see de.sos.etj.eTJ.Duration
   * @generated
   */
  EClass getDuration();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Duration#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see de.sos.etj.eTJ.Duration#getDuration()
   * @see #getDuration()
   * @generated
   */
  EReference getDuration_Duration();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Efficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Efficiency</em>'.
   * @see de.sos.etj.eTJ.Efficiency
   * @generated
   */
  EClass getEfficiency();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Efficiency#getEfficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Efficiency</em>'.
   * @see de.sos.etj.eTJ.Efficiency#getEfficiency()
   * @see #getEfficiency()
   * @generated
   */
  EAttribute getEfficiency_Efficiency();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Effort <em>Effort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effort</em>'.
   * @see de.sos.etj.eTJ.Effort
   * @generated
   */
  EClass getEffort();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Effort#getEffort <em>Effort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effort</em>'.
   * @see de.sos.etj.eTJ.Effort#getEffort()
   * @see #getEffort()
   * @generated
   */
  EReference getEffort_Effort();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Email</em>'.
   * @see de.sos.etj.eTJ.Email
   * @generated
   */
  EClass getEmail();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Email#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see de.sos.etj.eTJ.Email#getAddress()
   * @see #getEmail()
   * @generated
   */
  EAttribute getEmail_Address();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.End <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End</em>'.
   * @see de.sos.etj.eTJ.End
   * @generated
   */
  EClass getEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.End#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.sos.etj.eTJ.End#getEnd()
   * @see #getEnd()
   * @generated
   */
  EReference getEnd_End();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.EndCredit <em>End Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Credit</em>'.
   * @see de.sos.etj.eTJ.EndCredit
   * @generated
   */
  EClass getEndCredit();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.EndCredit#getCredit <em>Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Credit</em>'.
   * @see de.sos.etj.eTJ.EndCredit#getCredit()
   * @see #getEndCredit()
   * @generated
   */
  EAttribute getEndCredit_Credit();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Epilog <em>Epilog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Epilog</em>'.
   * @see de.sos.etj.eTJ.Epilog
   * @generated
   */
  EClass getEpilog();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Extend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extend</em>'.
   * @see de.sos.etj.eTJ.Extend
   * @generated
   */
  EClass getExtend();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Extend#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Extend#getName()
   * @see #getExtend()
   * @generated
   */
  EAttribute getExtend_Name();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Extend#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.sos.etj.eTJ.Extend#getDescription()
   * @see #getExtend()
   * @generated
   */
  EAttribute getExtend_Description();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Extend#isInherit <em>Inherit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inherit</em>'.
   * @see de.sos.etj.eTJ.Extend#isInherit()
   * @see #getExtend()
   * @generated
   */
  EAttribute getExtend_Inherit();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Extend#isScenariospecific <em>Scenariospecific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenariospecific</em>'.
   * @see de.sos.etj.eTJ.Extend#isScenariospecific()
   * @see #getExtend()
   * @generated
   */
  EAttribute getExtend_Scenariospecific();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ExtendResource <em>Extend Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extend Resource</em>'.
   * @see de.sos.etj.eTJ.ExtendResource
   * @generated
   */
  EClass getExtendResource();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.ExtendResource#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see de.sos.etj.eTJ.ExtendResource#getExtends()
   * @see #getExtendResource()
   * @generated
   */
  EReference getExtendResource_Extends();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ExtendedResourceAttribute <em>Extended Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Resource Attribute</em>'.
   * @see de.sos.etj.eTJ.ExtendedResourceAttribute
   * @generated
   */
  EClass getExtendedResourceAttribute();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ExtendedResourceAttribute#getExtend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extend</em>'.
   * @see de.sos.etj.eTJ.ExtendedResourceAttribute#getExtend()
   * @see #getExtendedResourceAttribute()
   * @generated
   */
  EReference getExtendedResourceAttribute_Extend();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ExtendedResourceAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.ExtendedResourceAttribute#getValue()
   * @see #getExtendedResourceAttribute()
   * @generated
   */
  EAttribute getExtendedResourceAttribute_Value();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ExtendTask <em>Extend Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extend Task</em>'.
   * @see de.sos.etj.eTJ.ExtendTask
   * @generated
   */
  EClass getExtendTask();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.ExtendTask#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see de.sos.etj.eTJ.ExtendTask#getExtends()
   * @see #getExtendTask()
   * @generated
   */
  EReference getExtendTask_Extends();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ExtendedTaskAttribute <em>Extended Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Task Attribute</em>'.
   * @see de.sos.etj.eTJ.ExtendedTaskAttribute
   * @generated
   */
  EClass getExtendedTaskAttribute();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ExtendedTaskAttribute#getExtend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extend</em>'.
   * @see de.sos.etj.eTJ.ExtendedTaskAttribute#getExtend()
   * @see #getExtendedTaskAttribute()
   * @generated
   */
  EReference getExtendedTaskAttribute_Extend();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ExtendedTaskAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.ExtendedTaskAttribute#getValue()
   * @see #getExtendedTaskAttribute()
   * @generated
   */
  EAttribute getExtendedTaskAttribute_Value();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Fail <em>Fail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fail</em>'.
   * @see de.sos.etj.eTJ.Fail
   * @generated
   */
  EClass getFail();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Fail#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.Fail#getExpression()
   * @see #getFail()
   * @generated
   */
  EReference getFail_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Flags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flags</em>'.
   * @see de.sos.etj.eTJ.Flags
   * @generated
   */
  EClass getFlags();

  /**
   * Returns the meta object for the attribute list '{@link de.sos.etj.eTJ.Flags#getFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flags</em>'.
   * @see de.sos.etj.eTJ.Flags#getFlags()
   * @see #getFlags()
   * @generated
   */
  EAttribute getFlags_Flags();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.FontColor <em>Font Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Color</em>'.
   * @see de.sos.etj.eTJ.FontColor
   * @generated
   */
  EClass getFontColor();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.FontColor#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see de.sos.etj.eTJ.FontColor#getColor()
   * @see #getFontColor()
   * @generated
   */
  EAttribute getFontColor_Color();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Footer <em>Footer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Footer</em>'.
   * @see de.sos.etj.eTJ.Footer
   * @generated
   */
  EClass getFooter();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Formats <em>Formats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formats</em>'.
   * @see de.sos.etj.eTJ.Formats
   * @generated
   */
  EClass getFormats();

  /**
   * Returns the meta object for the attribute list '{@link de.sos.etj.eTJ.Formats#getFormats <em>Formats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Formats</em>'.
   * @see de.sos.etj.eTJ.Formats#getFormats()
   * @see #getFormats()
   * @generated
   */
  EAttribute getFormats_Formats();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see de.sos.etj.eTJ.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Function#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see de.sos.etj.eTJ.Function#getLevel()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Level();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Function#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see de.sos.etj.eTJ.Function#getDate()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Date();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.Function#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scenario</em>'.
   * @see de.sos.etj.eTJ.Function#getScenario()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Scenario();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Function#getParentId <em>Parent Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parent Id</em>'.
   * @see de.sos.etj.eTJ.Function#getParentId()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_ParentId();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.Function#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.sos.etj.eTJ.Function#getTask()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Task();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Function#getDistance <em>Distance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distance</em>'.
   * @see de.sos.etj.eTJ.Function#getDistance()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Distance();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.Function#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.Function#getResource()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Resource();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.GapDuration <em>Gap Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gap Duration</em>'.
   * @see de.sos.etj.eTJ.GapDuration
   * @generated
   */
  EClass getGapDuration();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.GapLength <em>Gap Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gap Length</em>'.
   * @see de.sos.etj.eTJ.GapLength
   * @generated
   */
  EClass getGapLength();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.HAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HAlign</em>'.
   * @see de.sos.etj.eTJ.HAlign
   * @generated
   */
  EClass getHAlign();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.HAlign#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.HAlign#getExpression()
   * @see #getHAlign()
   * @generated
   */
  EReference getHAlign_Expression();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.HAlign#getJustification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Justification</em>'.
   * @see de.sos.etj.eTJ.HAlign#getJustification()
   * @see #getHAlign()
   * @generated
   */
  EAttribute getHAlign_Justification();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see de.sos.etj.eTJ.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Headline <em>Headline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Headline</em>'.
   * @see de.sos.etj.eTJ.Headline
   * @generated
   */
  EClass getHeadline();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.HideAccount <em>Hide Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide Account</em>'.
   * @see de.sos.etj.eTJ.HideAccount
   * @generated
   */
  EClass getHideAccount();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.HideAccount#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.HideAccount#getExpression()
   * @see #getHideAccount()
   * @generated
   */
  EAttribute getHideAccount_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.HideJournalEntry <em>Hide Journal Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide Journal Entry</em>'.
   * @see de.sos.etj.eTJ.HideJournalEntry
   * @generated
   */
  EClass getHideJournalEntry();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.HideJournalEntry#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.HideJournalEntry#getExpression()
   * @see #getHideJournalEntry()
   * @generated
   */
  EAttribute getHideJournalEntry_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.HideReport <em>Hide Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide Report</em>'.
   * @see de.sos.etj.eTJ.HideReport
   * @generated
   */
  EClass getHideReport();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.HideReport#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.HideReport#getExpression()
   * @see #getHideReport()
   * @generated
   */
  EReference getHideReport_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.HideResource <em>Hide Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide Resource</em>'.
   * @see de.sos.etj.eTJ.HideResource
   * @generated
   */
  EClass getHideResource();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.HideResource#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.HideResource#getExpression()
   * @see #getHideResource()
   * @generated
   */
  EReference getHideResource_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.HideTask <em>Hide Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide Task</em>'.
   * @see de.sos.etj.eTJ.HideTask
   * @generated
   */
  EClass getHideTask();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.HideTask#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.HideTask#getExpression()
   * @see #getHideTask()
   * @generated
   */
  EReference getHideTask_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see de.sos.etj.eTJ.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Include#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see de.sos.etj.eTJ.Include#getImportURI()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_ImportURI();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.IncludeProperties <em>Include Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Properties</em>'.
   * @see de.sos.etj.eTJ.IncludeProperties
   * @generated
   */
  EClass getIncludeProperties();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.IncludeProperties#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see de.sos.etj.eTJ.IncludeProperties#getImportURI()
   * @see #getIncludeProperties()
   * @generated
   */
  EAttribute getIncludeProperties_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.IncludeProperties#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.IncludeProperties#getAttributes()
   * @see #getIncludeProperties()
   * @generated
   */
  EReference getIncludeProperties_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.IncludePropertiesAttribute <em>Include Properties Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Properties Attribute</em>'.
   * @see de.sos.etj.eTJ.IncludePropertiesAttribute
   * @generated
   */
  EClass getIncludePropertiesAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Interval1 <em>Interval1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval1</em>'.
   * @see de.sos.etj.eTJ.Interval1
   * @generated
   */
  EClass getInterval1();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval1#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.sos.etj.eTJ.Interval1#getStart()
   * @see #getInterval1()
   * @generated
   */
  EReference getInterval1_Start();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval1#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.sos.etj.eTJ.Interval1#getEnd()
   * @see #getInterval1()
   * @generated
   */
  EReference getInterval1_End();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval1#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see de.sos.etj.eTJ.Interval1#getDuration()
   * @see #getInterval1()
   * @generated
   */
  EReference getInterval1_Duration();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Interval2 <em>Interval2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval2</em>'.
   * @see de.sos.etj.eTJ.Interval2
   * @generated
   */
  EClass getInterval2();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval2#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.sos.etj.eTJ.Interval2#getStart()
   * @see #getInterval2()
   * @generated
   */
  EReference getInterval2_Start();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval2#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.sos.etj.eTJ.Interval2#getEnd()
   * @see #getInterval2()
   * @generated
   */
  EReference getInterval2_End();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval2#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see de.sos.etj.eTJ.Interval2#getDuration()
   * @see #getInterval2()
   * @generated
   */
  EReference getInterval2_Duration();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Interval3 <em>Interval3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval3</em>'.
   * @see de.sos.etj.eTJ.Interval3
   * @generated
   */
  EClass getInterval3();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval3#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.sos.etj.eTJ.Interval3#getStart()
   * @see #getInterval3()
   * @generated
   */
  EReference getInterval3_Start();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval3#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.sos.etj.eTJ.Interval3#getEnd()
   * @see #getInterval3()
   * @generated
   */
  EReference getInterval3_End();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval3#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see de.sos.etj.eTJ.Interval3#getDuration()
   * @see #getInterval3()
   * @generated
   */
  EReference getInterval3_Duration();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Interval4 <em>Interval4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval4</em>'.
   * @see de.sos.etj.eTJ.Interval4
   * @generated
   */
  EClass getInterval4();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval4#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.sos.etj.eTJ.Interval4#getStart()
   * @see #getInterval4()
   * @generated
   */
  EReference getInterval4_Start();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval4#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.sos.etj.eTJ.Interval4#getEnd()
   * @see #getInterval4()
   * @generated
   */
  EReference getInterval4_End();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Interval4#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see de.sos.etj.eTJ.Interval4#getDuration()
   * @see #getInterval4()
   * @generated
   */
  EReference getInterval4_Duration();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.JournalAttributes <em>Journal Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Journal Attributes</em>'.
   * @see de.sos.etj.eTJ.JournalAttributes
   * @generated
   */
  EClass getJournalAttributes();

  /**
   * Returns the meta object for the attribute list '{@link de.sos.etj.eTJ.JournalAttributes#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see de.sos.etj.eTJ.JournalAttributes#getArgs()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Args();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.JournalEntry <em>Journal Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Journal Entry</em>'.
   * @see de.sos.etj.eTJ.JournalEntry
   * @generated
   */
  EClass getJournalEntry();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.JournalEntry#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see de.sos.etj.eTJ.JournalEntry#getDate()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Date();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.JournalEntry#getHeadline <em>Headline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Headline</em>'.
   * @see de.sos.etj.eTJ.JournalEntry#getHeadline()
   * @see #getJournalEntry()
   * @generated
   */
  EAttribute getJournalEntry_Headline();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.JournalEntry#getAlert <em>Alert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alert</em>'.
   * @see de.sos.etj.eTJ.JournalEntry#getAlert()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Alert();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.JournalEntry#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Author</em>'.
   * @see de.sos.etj.eTJ.JournalEntry#getAuthor()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Author();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.JournalEntry#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Details</em>'.
   * @see de.sos.etj.eTJ.JournalEntry#getDetails()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Details();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.JournalEntry#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Summary</em>'.
   * @see de.sos.etj.eTJ.JournalEntry#getSummary()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Summary();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.JournalMode <em>Journal Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Journal Mode</em>'.
   * @see de.sos.etj.eTJ.JournalMode
   * @generated
   */
  EClass getJournalMode();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.JournalMode#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see de.sos.etj.eTJ.JournalMode#getMode()
   * @see #getJournalMode()
   * @generated
   */
  EAttribute getJournalMode_Mode();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Left <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left</em>'.
   * @see de.sos.etj.eTJ.Left
   * @generated
   */
  EClass getLeft();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Length <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length</em>'.
   * @see de.sos.etj.eTJ.Length
   * @generated
   */
  EClass getLength();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Length#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Length</em>'.
   * @see de.sos.etj.eTJ.Length#getLength()
   * @see #getLength()
   * @generated
   */
  EReference getLength_Length();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Limits <em>Limits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limits</em>'.
   * @see de.sos.etj.eTJ.Limits
   * @generated
   */
  EClass getLimits();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Limits#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Limits#getAttributes()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LimitsAttribute <em>Limits Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limits Attribute</em>'.
   * @see de.sos.etj.eTJ.LimitsAttribute
   * @generated
   */
  EClass getLimitsAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ListItem <em>List Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Item</em>'.
   * @see de.sos.etj.eTJ.ListItem
   * @generated
   */
  EClass getListItem();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Type</em>'.
   * @see de.sos.etj.eTJ.ListType
   * @generated
   */
  EClass getListType();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ListType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.sos.etj.eTJ.ListType#getType()
   * @see #getListType()
   * @generated
   */
  EAttribute getListType_Type();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LoadUnit <em>Load Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Unit</em>'.
   * @see de.sos.etj.eTJ.LoadUnit
   * @generated
   */
  EClass getLoadUnit();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LoadUnit#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see de.sos.etj.eTJ.LoadUnit#getUnit()
   * @see #getLoadUnit()
   * @generated
   */
  EAttribute getLoadUnit_Unit();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LogicalExpression <em>Logical Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Expression</em>'.
   * @see de.sos.etj.eTJ.LogicalExpression
   * @generated
   */
  EClass getLogicalExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LogicalExpression#getLeftOperant <em>Left Operant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operant</em>'.
   * @see de.sos.etj.eTJ.LogicalExpression#getLeftOperant()
   * @see #getLogicalExpression()
   * @generated
   */
  EReference getLogicalExpression_LeftOperant();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LogicalExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see de.sos.etj.eTJ.LogicalExpression#getOp()
   * @see #getLogicalExpression()
   * @generated
   */
  EAttribute getLogicalExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LogicalExpression#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see de.sos.etj.eTJ.LogicalExpression#getRightOperand()
   * @see #getLogicalExpression()
   * @generated
   */
  EReference getLogicalExpression_RightOperand();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Macro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Macro</em>'.
   * @see de.sos.etj.eTJ.Macro
   * @generated
   */
  EClass getMacro();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Macro#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Macro#getId()
   * @see #getMacro()
   * @generated
   */
  EAttribute getMacro_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Macro#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.Macro#getValue()
   * @see #getMacro()
   * @generated
   */
  EAttribute getMacro_Value();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Macro#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.sos.etj.eTJ.Macro#getProperties()
   * @see #getMacro()
   * @generated
   */
  EReference getMacro_Properties();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Managers <em>Managers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Managers</em>'.
   * @see de.sos.etj.eTJ.Managers
   * @generated
   */
  EClass getManagers();

  /**
   * Returns the meta object for the reference list '{@link de.sos.etj.eTJ.Managers#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see de.sos.etj.eTJ.Managers#getResources()
   * @see #getManagers()
   * @generated
   */
  EReference getManagers_Resources();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory</em>'.
   * @see de.sos.etj.eTJ.Mandatory
   * @generated
   */
  EClass getMandatory();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Mandatory#isMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see de.sos.etj.eTJ.Mandatory#isMandatory()
   * @see #getMandatory()
   * @generated
   */
  EAttribute getMandatory_Mandatory();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.MaxEnd <em>Max End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max End</em>'.
   * @see de.sos.etj.eTJ.MaxEnd
   * @generated
   */
  EClass getMaxEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.MaxEnd#getMaxEnd <em>Max End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max End</em>'.
   * @see de.sos.etj.eTJ.MaxEnd#getMaxEnd()
   * @see #getMaxEnd()
   * @generated
   */
  EReference getMaxEnd_MaxEnd();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Maximum <em>Maximum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maximum</em>'.
   * @see de.sos.etj.eTJ.Maximum
   * @generated
   */
  EClass getMaximum();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.MaxStart <em>Max Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Start</em>'.
   * @see de.sos.etj.eTJ.MaxStart
   * @generated
   */
  EClass getMaxStart();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.MaxStart#getMaxStart <em>Max Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Start</em>'.
   * @see de.sos.etj.eTJ.MaxStart#getMaxStart()
   * @see #getMaxStart()
   * @generated
   */
  EReference getMaxStart_MaxStart();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Milestone <em>Milestone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Milestone</em>'.
   * @see de.sos.etj.eTJ.Milestone
   * @generated
   */
  EClass getMilestone();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Milestone#isMilestone <em>Milestone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Milestone</em>'.
   * @see de.sos.etj.eTJ.Milestone#isMilestone()
   * @see #getMilestone()
   * @generated
   */
  EAttribute getMilestone_Milestone();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Minimum <em>Minimum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minimum</em>'.
   * @see de.sos.etj.eTJ.Minimum
   * @generated
   */
  EClass getMinimum();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.MinEnd <em>Min End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min End</em>'.
   * @see de.sos.etj.eTJ.MinEnd
   * @generated
   */
  EClass getMinEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.MinEnd#getMinEnd <em>Min End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min End</em>'.
   * @see de.sos.etj.eTJ.MinEnd#getMinEnd()
   * @see #getMinEnd()
   * @generated
   */
  EReference getMinEnd_MinEnd();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.MinStart <em>Min Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Start</em>'.
   * @see de.sos.etj.eTJ.MinStart
   * @generated
   */
  EClass getMinStart();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.MinStart#getMinStart <em>Min Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min Start</em>'.
   * @see de.sos.etj.eTJ.MinStart#getMinStart()
   * @see #getMinStart()
   * @generated
   */
  EReference getMinStart_MinStart();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.MonthlyMax <em>Monthly Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monthly Max</em>'.
   * @see de.sos.etj.eTJ.MonthlyMax
   * @generated
   */
  EClass getMonthlyMax();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.MonthlyMin <em>Monthly Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monthly Min</em>'.
   * @see de.sos.etj.eTJ.MonthlyMin
   * @generated
   */
  EClass getMonthlyMin();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see de.sos.etj.eTJ.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Note#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see de.sos.etj.eTJ.Note#getNote()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Note();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Now <em>Now</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Now</em>'.
   * @see de.sos.etj.eTJ.Now
   * @generated
   */
  EClass getNow();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Now#getNow <em>Now</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Now</em>'.
   * @see de.sos.etj.eTJ.Now#getNow()
   * @see #getNow()
   * @generated
   */
  EReference getNow_Now();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.NumberFormat <em>Number Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Format</em>'.
   * @see de.sos.etj.eTJ.NumberFormat
   * @generated
   */
  EClass getNumberFormat();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Period <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Period</em>'.
   * @see de.sos.etj.eTJ.Period
   * @generated
   */
  EClass getPeriod();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Period#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Period</em>'.
   * @see de.sos.etj.eTJ.Period#getPeriod()
   * @see #getPeriod()
   * @generated
   */
  EReference getPeriod_Period();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Persistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistent</em>'.
   * @see de.sos.etj.eTJ.Persistent
   * @generated
   */
  EClass getPersistent();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Persistent#isPersistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistent</em>'.
   * @see de.sos.etj.eTJ.Persistent#isPersistent()
   * @see #getPersistent()
   * @generated
   */
  EAttribute getPersistent_Persistent();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Precedes <em>Precedes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precedes</em>'.
   * @see de.sos.etj.eTJ.Precedes
   * @generated
   */
  EClass getPrecedes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Priority</em>'.
   * @see de.sos.etj.eTJ.Priority
   * @generated
   */
  EClass getPriority();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Priority#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.sos.etj.eTJ.Priority#getPriority()
   * @see #getPriority()
   * @generated
   */
  EAttribute getPriority_Priority();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ProjectId <em>Project Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Id</em>'.
   * @see de.sos.etj.eTJ.ProjectId
   * @generated
   */
  EClass getProjectId();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ProjectId#getProjectId <em>Project Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Id</em>'.
   * @see de.sos.etj.eTJ.ProjectId#getProjectId()
   * @see #getProjectId()
   * @generated
   */
  EAttribute getProjectId_ProjectId();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ProjectIds <em>Project Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Ids</em>'.
   * @see de.sos.etj.eTJ.ProjectIds
   * @generated
   */
  EClass getProjectIds();

  /**
   * Returns the meta object for the attribute list '{@link de.sos.etj.eTJ.ProjectIds#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ids</em>'.
   * @see de.sos.etj.eTJ.ProjectIds#getIds()
   * @see #getProjectIds()
   * @generated
   */
  EAttribute getProjectIds_Ids();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Prolog <em>Prolog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prolog</em>'.
   * @see de.sos.etj.eTJ.Prolog
   * @generated
   */
  EClass getProlog();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.PurgeReport <em>Purge Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Purge Report</em>'.
   * @see de.sos.etj.eTJ.PurgeReport
   * @generated
   */
  EClass getPurgeReport();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.PurgeReport#getListAttribute <em>List Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Attribute</em>'.
   * @see de.sos.etj.eTJ.PurgeReport#getListAttribute()
   * @see #getPurgeReport()
   * @generated
   */
  EAttribute getPurgeReport_ListAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.PurgeResource <em>Purge Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Purge Resource</em>'.
   * @see de.sos.etj.eTJ.PurgeResource
   * @generated
   */
  EClass getPurgeResource();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.PurgeResource#getListAttribute <em>List Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Attribute</em>'.
   * @see de.sos.etj.eTJ.PurgeResource#getListAttribute()
   * @see #getPurgeResource()
   * @generated
   */
  EAttribute getPurgeResource_ListAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.PurgeTask <em>Purge Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Purge Task</em>'.
   * @see de.sos.etj.eTJ.PurgeTask
   * @generated
   */
  EClass getPurgeTask();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.PurgeTask#getListAttribute <em>List Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Attribute</em>'.
   * @see de.sos.etj.eTJ.PurgeTask#getListAttribute()
   * @see #getPurgeTask()
   * @generated
   */
  EAttribute getPurgeTask_ListAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Rate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rate</em>'.
   * @see de.sos.etj.eTJ.Rate
   * @generated
   */
  EClass getRate();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Rate#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rate</em>'.
   * @see de.sos.etj.eTJ.Rate#getRate()
   * @see #getRate()
   * @generated
   */
  EAttribute getRate_Rate();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Remaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remaining</em>'.
   * @see de.sos.etj.eTJ.Remaining
   * @generated
   */
  EClass getRemaining();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Remaining#getRemaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Remaining</em>'.
   * @see de.sos.etj.eTJ.Remaining#getRemaining()
   * @see #getRemaining()
   * @generated
   */
  EReference getRemaining_Remaining();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ReportPrefix <em>Report Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report Prefix</em>'.
   * @see de.sos.etj.eTJ.ReportPrefix
   * @generated
   */
  EClass getReportPrefix();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ReportPrefix#getReport <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Report</em>'.
   * @see de.sos.etj.eTJ.ReportPrefix#getReport()
   * @see #getReportPrefix()
   * @generated
   */
  EReference getReportPrefix_Report();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ResourceAttributes <em>Resource Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Attributes</em>'.
   * @see de.sos.etj.eTJ.ResourceAttributes
   * @generated
   */
  EClass getResourceAttributes();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ResourceAttributes#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see de.sos.etj.eTJ.ResourceAttributes#isAll()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_All();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ResourceAttributes#isNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see de.sos.etj.eTJ.ResourceAttributes#isNone()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_None();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ResourceAttributes#isVacation <em>Vacation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vacation</em>'.
   * @see de.sos.etj.eTJ.ResourceAttributes#isVacation()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_Vacation();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ResourceAttributes#isBooking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Booking</em>'.
   * @see de.sos.etj.eTJ.ResourceAttributes#isBooking()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_Booking();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ResourceAttributes#isWorkingHours <em>Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Working Hours</em>'.
   * @see de.sos.etj.eTJ.ResourceAttributes#isWorkingHours()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_WorkingHours();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ResourcePrefix <em>Resource Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Prefix</em>'.
   * @see de.sos.etj.eTJ.ResourcePrefix
   * @generated
   */
  EClass getResourcePrefix();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ResourcePrefix#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.ResourcePrefix#getResource()
   * @see #getResourcePrefix()
   * @generated
   */
  EReference getResourcePrefix_Resource();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ResourceReport <em>Resource Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Report</em>'.
   * @see de.sos.etj.eTJ.ResourceReport
   * @generated
   */
  EClass getResourceReport();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ResourceRoot <em>Resource Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Root</em>'.
   * @see de.sos.etj.eTJ.ResourceRoot
   * @generated
   */
  EClass getResourceRoot();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ResourceRoot#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.ResourceRoot#getResource()
   * @see #getResourceRoot()
   * @generated
   */
  EReference getResourceRoot_Resource();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Responsible <em>Responsible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Responsible</em>'.
   * @see de.sos.etj.eTJ.Responsible
   * @generated
   */
  EClass getResponsible();

  /**
   * Returns the meta object for the reference list '{@link de.sos.etj.eTJ.Responsible#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see de.sos.etj.eTJ.Responsible#getResources()
   * @see #getResponsible()
   * @generated
   */
  EReference getResponsible_Resources();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RGB</em>'.
   * @see de.sos.etj.eTJ.RGB
   * @generated
   */
  EClass getRGB();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.RGB#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.RGB#getValue()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_Value();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Right <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right</em>'.
   * @see de.sos.etj.eTJ.Right
   * @generated
   */
  EClass getRight();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.RollupAccount <em>Rollup Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rollup Account</em>'.
   * @see de.sos.etj.eTJ.RollupAccount
   * @generated
   */
  EClass getRollupAccount();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.RollupAccount#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.RollupAccount#getExpression()
   * @see #getRollupAccount()
   * @generated
   */
  EReference getRollupAccount_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.RollupResource <em>Rollup Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rollup Resource</em>'.
   * @see de.sos.etj.eTJ.RollupResource
   * @generated
   */
  EClass getRollupResource();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.RollupResource#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.RollupResource#getExpression()
   * @see #getRollupResource()
   * @generated
   */
  EReference getRollupResource_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.RollupTask <em>Rollup Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rollup Task</em>'.
   * @see de.sos.etj.eTJ.RollupTask
   * @generated
   */
  EClass getRollupTask();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.RollupTask#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.RollupTask#getExpression()
   * @see #getRollupTask()
   * @generated
   */
  EReference getRollupTask_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Scale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale</em>'.
   * @see de.sos.etj.eTJ.Scale
   * @generated
   */
  EClass getScale();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Scale#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see de.sos.etj.eTJ.Scale#getScale()
   * @see #getScale()
   * @generated
   */
  EAttribute getScale_Scale();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see de.sos.etj.eTJ.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Scenario#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Scenario#getId()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Scenario#getActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Active</em>'.
   * @see de.sos.etj.eTJ.Scenario#getActive()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Active();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Scenario#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scenario</em>'.
   * @see de.sos.etj.eTJ.Scenario#getScenario()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Scenario();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ScenarioIcal <em>Scenario Ical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario Ical</em>'.
   * @see de.sos.etj.eTJ.ScenarioIcal
   * @generated
   */
  EClass getScenarioIcal();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ScenarioIcal#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scenario</em>'.
   * @see de.sos.etj.eTJ.ScenarioIcal#getScenario()
   * @see #getScenarioIcal()
   * @generated
   */
  EReference getScenarioIcal_Scenario();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Scenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenarios</em>'.
   * @see de.sos.etj.eTJ.Scenarios
   * @generated
   */
  EClass getScenarios();

  /**
   * Returns the meta object for the reference list '{@link de.sos.etj.eTJ.Scenarios#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Scenarios</em>'.
   * @see de.sos.etj.eTJ.Scenarios#getScenarios()
   * @see #getScenarios()
   * @generated
   */
  EReference getScenarios_Scenarios();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Scheduled <em>Scheduled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheduled</em>'.
   * @see de.sos.etj.eTJ.Scheduled
   * @generated
   */
  EClass getScheduled();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Scheduled#isScheduled <em>Scheduled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheduled</em>'.
   * @see de.sos.etj.eTJ.Scheduled#isScheduled()
   * @see #getScheduled()
   * @generated
   */
  EAttribute getScheduled_Scheduled();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Scheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheduling</em>'.
   * @see de.sos.etj.eTJ.Scheduling
   * @generated
   */
  EClass getScheduling();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Scheduling#getScheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheduling</em>'.
   * @see de.sos.etj.eTJ.Scheduling#getScheduling()
   * @see #getScheduling()
   * @generated
   */
  EAttribute getScheduling_Scheduling();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see de.sos.etj.eTJ.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Select#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument</em>'.
   * @see de.sos.etj.eTJ.Select#getArgument()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Argument();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SelfContained <em>Self Contained</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Contained</em>'.
   * @see de.sos.etj.eTJ.SelfContained
   * @generated
   */
  EClass getSelfContained();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.SelfContained#getSelfcontained <em>Selfcontained</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Selfcontained</em>'.
   * @see de.sos.etj.eTJ.SelfContained#getSelfcontained()
   * @see #getSelfContained()
   * @generated
   */
  EAttribute getSelfContained_Selfcontained();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Shift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift</em>'.
   * @see de.sos.etj.eTJ.Shift
   * @generated
   */
  EClass getShift();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Shift#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Shift#getId()
   * @see #getShift()
   * @generated
   */
  EAttribute getShift_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Shift#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Shift#getName()
   * @see #getShift()
   * @generated
   */
  EAttribute getShift_Name();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Shift#getReplace <em>Replace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replace</em>'.
   * @see de.sos.etj.eTJ.Shift#getReplace()
   * @see #getShift()
   * @generated
   */
  EAttribute getShift_Replace();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Shift#getTimezone <em>Timezone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timezone</em>'.
   * @see de.sos.etj.eTJ.Shift#getTimezone()
   * @see #getShift()
   * @generated
   */
  EAttribute getShift_Timezone();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Shift#getVacation <em>Vacation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vacation</em>'.
   * @see de.sos.etj.eTJ.Shift#getVacation()
   * @see #getShift()
   * @generated
   */
  EReference getShift_Vacation();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Shift#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shift</em>'.
   * @see de.sos.etj.eTJ.Shift#getShift()
   * @see #getShift()
   * @generated
   */
  EReference getShift_Shift();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Shift#getWorkingHours <em>Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Working Hours</em>'.
   * @see de.sos.etj.eTJ.Shift#getWorkingHours()
   * @see #getShift()
   * @generated
   */
  EReference getShift_WorkingHours();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ShiftTimesheet <em>Shift Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Timesheet</em>'.
   * @see de.sos.etj.eTJ.ShiftTimesheet
   * @generated
   */
  EClass getShiftTimesheet();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ShiftTimesheet#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shift</em>'.
   * @see de.sos.etj.eTJ.ShiftTimesheet#getShift()
   * @see #getShiftTimesheet()
   * @generated
   */
  EReference getShiftTimesheet_Shift();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Shifts <em>Shifts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shifts</em>'.
   * @see de.sos.etj.eTJ.Shifts
   * @generated
   */
  EClass getShifts();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Shifts#getLimits <em>Limits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Limits</em>'.
   * @see de.sos.etj.eTJ.Shifts#getLimits()
   * @see #getShifts()
   * @generated
   */
  EReference getShifts_Limits();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ShiftsLimit <em>Shifts Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shifts Limit</em>'.
   * @see de.sos.etj.eTJ.ShiftsLimit
   * @generated
   */
  EClass getShiftsLimit();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ShiftsLimit#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shift</em>'.
   * @see de.sos.etj.eTJ.ShiftsLimit#getShift()
   * @see #getShiftsLimit()
   * @generated
   */
  EReference getShiftsLimit_Shift();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.ShiftsLimit#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Limit</em>'.
   * @see de.sos.etj.eTJ.ShiftsLimit#getLimit()
   * @see #getShiftsLimit()
   * @generated
   */
  EReference getShiftsLimit_Limit();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ShiftsAllocate <em>Shifts Allocate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shifts Allocate</em>'.
   * @see de.sos.etj.eTJ.ShiftsAllocate
   * @generated
   */
  EClass getShiftsAllocate();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ShiftsAllocate#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shift</em>'.
   * @see de.sos.etj.eTJ.ShiftsAllocate#getShift()
   * @see #getShiftsAllocate()
   * @generated
   */
  EReference getShiftsAllocate_Shift();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.ShiftsAllocate#getIntervals <em>Intervals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intervals</em>'.
   * @see de.sos.etj.eTJ.ShiftsAllocate#getIntervals()
   * @see #getShiftsAllocate()
   * @generated
   */
  EReference getShiftsAllocate_Intervals();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ShiftsResource <em>Shifts Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shifts Resource</em>'.
   * @see de.sos.etj.eTJ.ShiftsResource
   * @generated
   */
  EClass getShiftsResource();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ShiftsTask <em>Shifts Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shifts Task</em>'.
   * @see de.sos.etj.eTJ.ShiftsTask
   * @generated
   */
  EClass getShiftsTask();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ShortTimeFormat <em>Short Time Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short Time Format</em>'.
   * @see de.sos.etj.eTJ.ShortTimeFormat
   * @generated
   */
  EClass getShortTimeFormat();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ShortTimeFormat#getShortTimeFormat <em>Short Time Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Time Format</em>'.
   * @see de.sos.etj.eTJ.ShortTimeFormat#getShortTimeFormat()
   * @see #getShortTimeFormat()
   * @generated
   */
  EAttribute getShortTimeFormat_ShortTimeFormat();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort</em>'.
   * @see de.sos.etj.eTJ.Sort
   * @generated
   */
  EClass getSort();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Sort#isTree <em>Tree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tree</em>'.
   * @see de.sos.etj.eTJ.Sort#isTree()
   * @see #getSort()
   * @generated
   */
  EAttribute getSort_Tree();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Sort#getCriteria <em>Criteria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Criteria</em>'.
   * @see de.sos.etj.eTJ.Sort#getCriteria()
   * @see #getSort()
   * @generated
   */
  EReference getSort_Criteria();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SortAccounts <em>Sort Accounts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Accounts</em>'.
   * @see de.sos.etj.eTJ.SortAccounts
   * @generated
   */
  EClass getSortAccounts();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SortJournalEntries <em>Sort Journal Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Journal Entries</em>'.
   * @see de.sos.etj.eTJ.SortJournalEntries
   * @generated
   */
  EClass getSortJournalEntries();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SortResources <em>Sort Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Resources</em>'.
   * @see de.sos.etj.eTJ.SortResources
   * @generated
   */
  EClass getSortResources();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SortTasks <em>Sort Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Tasks</em>'.
   * @see de.sos.etj.eTJ.SortTasks
   * @generated
   */
  EClass getSortTasks();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start</em>'.
   * @see de.sos.etj.eTJ.Start
   * @generated
   */
  EClass getStart();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Start#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.sos.etj.eTJ.Start#getStart()
   * @see #getStart()
   * @generated
   */
  EReference getStart_Start();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.StatusStatusSheet <em>Status Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Status Sheet</em>'.
   * @see de.sos.etj.eTJ.StatusStatusSheet
   * @generated
   */
  EClass getStatusStatusSheet();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.StatusStatusSheet#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see de.sos.etj.eTJ.StatusStatusSheet#getLevel()
   * @see #getStatusStatusSheet()
   * @generated
   */
  EAttribute getStatusStatusSheet_Level();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.StatusStatusSheet#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see de.sos.etj.eTJ.StatusStatusSheet#getText()
   * @see #getStatusStatusSheet()
   * @generated
   */
  EAttribute getStatusStatusSheet_Text();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.StatusStatusSheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.StatusStatusSheet#getAttributes()
   * @see #getStatusStatusSheet()
   * @generated
   */
  EReference getStatusStatusSheet_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.StatusStatusSheetAttribute <em>Status Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Status Sheet Attribute</em>'.
   * @see de.sos.etj.eTJ.StatusStatusSheetAttribute
   * @generated
   */
  EClass getStatusStatusSheetAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.StatusTimesheet <em>Status Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Timesheet</em>'.
   * @see de.sos.etj.eTJ.StatusTimesheet
   * @generated
   */
  EClass getStatusTimesheet();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.StatusTimesheet#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see de.sos.etj.eTJ.StatusTimesheet#getLevel()
   * @see #getStatusTimesheet()
   * @generated
   */
  EAttribute getStatusTimesheet_Level();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.StatusTimesheet#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see de.sos.etj.eTJ.StatusTimesheet#getText()
   * @see #getStatusTimesheet()
   * @generated
   */
  EAttribute getStatusTimesheet_Text();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.StatusTimesheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.StatusTimesheet#getAttributes()
   * @see #getStatusTimesheet()
   * @generated
   */
  EReference getStatusTimesheet_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.StatusTimesheetAttribute <em>Status Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Timesheet Attribute</em>'.
   * @see de.sos.etj.eTJ.StatusTimesheetAttribute
   * @generated
   */
  EClass getStatusTimesheetAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.StatusSheet <em>Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Sheet</em>'.
   * @see de.sos.etj.eTJ.StatusSheet
   * @generated
   */
  EClass getStatusSheet();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.StatusSheet#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.StatusSheet#getResource()
   * @see #getStatusSheet()
   * @generated
   */
  EReference getStatusSheet_Resource();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.StatusSheet#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see de.sos.etj.eTJ.StatusSheet#getInterval()
   * @see #getStatusSheet()
   * @generated
   */
  EReference getStatusSheet_Interval();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.StatusSheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.StatusSheet#getAttributes()
   * @see #getStatusSheet()
   * @generated
   */
  EReference getStatusSheet_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.StatusSheetAttribute <em>Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Sheet Attribute</em>'.
   * @see de.sos.etj.eTJ.StatusSheetAttribute
   * @generated
   */
  EClass getStatusSheetAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.StatusSheetReport <em>Status Sheet Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Sheet Report</em>'.
   * @see de.sos.etj.eTJ.StatusSheetReport
   * @generated
   */
  EClass getStatusSheetReport();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.StatusSheetReport#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see de.sos.etj.eTJ.StatusSheetReport#getFilename()
   * @see #getStatusSheetReport()
   * @generated
   */
  EAttribute getStatusSheetReport_Filename();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.StatusSheetReport#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.StatusSheetReport#getAttributes()
   * @see #getStatusSheetReport()
   * @generated
   */
  EReference getStatusSheetReport_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.StatusSheetReportAttribute <em>Status Sheet Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Sheet Report Attribute</em>'.
   * @see de.sos.etj.eTJ.StatusSheetReportAttribute
   * @generated
   */
  EClass getStatusSheetReportAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Summary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Summary</em>'.
   * @see de.sos.etj.eTJ.Summary
   * @generated
   */
  EClass getSummary();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SupplementAccount <em>Supplement Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement Account</em>'.
   * @see de.sos.etj.eTJ.SupplementAccount
   * @generated
   */
  EClass getSupplementAccount();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.SupplementAccount#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Account</em>'.
   * @see de.sos.etj.eTJ.SupplementAccount#getAccount()
   * @see #getSupplementAccount()
   * @generated
   */
  EReference getSupplementAccount_Account();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.SupplementAccount#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.SupplementAccount#getAttributes()
   * @see #getSupplementAccount()
   * @generated
   */
  EReference getSupplementAccount_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SupplementReport <em>Supplement Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement Report</em>'.
   * @see de.sos.etj.eTJ.SupplementReport
   * @generated
   */
  EClass getSupplementReport();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.SupplementReport#getReport <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Report</em>'.
   * @see de.sos.etj.eTJ.SupplementReport#getReport()
   * @see #getSupplementReport()
   * @generated
   */
  EReference getSupplementReport_Report();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.SupplementReport#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.SupplementReport#getAttributes()
   * @see #getSupplementReport()
   * @generated
   */
  EReference getSupplementReport_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SupplementResource <em>Supplement Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement Resource</em>'.
   * @see de.sos.etj.eTJ.SupplementResource
   * @generated
   */
  EClass getSupplementResource();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.SupplementResource#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.SupplementResource#getResource()
   * @see #getSupplementResource()
   * @generated
   */
  EReference getSupplementResource_Resource();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.SupplementResource#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.SupplementResource#getAttributes()
   * @see #getSupplementResource()
   * @generated
   */
  EReference getSupplementResource_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.SupplementTask <em>Supplement Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement Task</em>'.
   * @see de.sos.etj.eTJ.SupplementTask
   * @generated
   */
  EClass getSupplementTask();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.SupplementTask#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.sos.etj.eTJ.SupplementTask#getTask()
   * @see #getSupplementTask()
   * @generated
   */
  EReference getSupplementTask_Task();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.SupplementTask#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.SupplementTask#getAttributes()
   * @see #getSupplementTask()
   * @generated
   */
  EReference getSupplementTask_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TagFile <em>Tag File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag File</em>'.
   * @see de.sos.etj.eTJ.TagFile
   * @generated
   */
  EClass getTagFile();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TagFile#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.TagFile#getId()
   * @see #getTagFile()
   * @generated
   */
  EAttribute getTagFile_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TagFile#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see de.sos.etj.eTJ.TagFile#getFilename()
   * @see #getTagFile()
   * @generated
   */
  EAttribute getTagFile_Filename();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.TagFile#getHideResource <em>Hide Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hide Resource</em>'.
   * @see de.sos.etj.eTJ.TagFile#getHideResource()
   * @see #getTagFile()
   * @generated
   */
  EReference getTagFile_HideResource();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.TagFile#getHideTask <em>Hide Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hide Task</em>'.
   * @see de.sos.etj.eTJ.TagFile#getHideTask()
   * @see #getTagFile()
   * @generated
   */
  EReference getTagFile_HideTask();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.TagFile#getRollupResource <em>Rollup Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rollup Resource</em>'.
   * @see de.sos.etj.eTJ.TagFile#getRollupResource()
   * @see #getTagFile()
   * @generated
   */
  EReference getTagFile_RollupResource();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.TagFile#getRollupTask <em>Rollup Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rollup Task</em>'.
   * @see de.sos.etj.eTJ.TagFile#getRollupTask()
   * @see #getTagFile()
   * @generated
   */
  EReference getTagFile_RollupTask();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskStatusSheet <em>Task Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Status Sheet</em>'.
   * @see de.sos.etj.eTJ.TaskStatusSheet
   * @generated
   */
  EClass getTaskStatusSheet();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.TaskStatusSheet#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.sos.etj.eTJ.TaskStatusSheet#getTask()
   * @see #getTaskStatusSheet()
   * @generated
   */
  EReference getTaskStatusSheet_Task();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.TaskStatusSheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.TaskStatusSheet#getAttributes()
   * @see #getTaskStatusSheet()
   * @generated
   */
  EReference getTaskStatusSheet_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskStatusSheetAttribute <em>Task Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Status Sheet Attribute</em>'.
   * @see de.sos.etj.eTJ.TaskStatusSheetAttribute
   * @generated
   */
  EClass getTaskStatusSheetAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskTimesheet <em>Task Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Timesheet</em>'.
   * @see de.sos.etj.eTJ.TaskTimesheet
   * @generated
   */
  EClass getTaskTimesheet();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.TaskTimesheet#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.sos.etj.eTJ.TaskTimesheet#getTask()
   * @see #getTaskTimesheet()
   * @generated
   */
  EReference getTaskTimesheet_Task();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.TaskTimesheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.TaskTimesheet#getAttributes()
   * @see #getTaskTimesheet()
   * @generated
   */
  EReference getTaskTimesheet_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskTimesheetAttribute <em>Task Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Timesheet Attribute</em>'.
   * @see de.sos.etj.eTJ.TaskTimesheetAttribute
   * @generated
   */
  EClass getTaskTimesheetAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskAttributes <em>Task Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Attributes</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes
   * @generated
   */
  EClass getTaskAttributes();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isAll()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_All();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isNone()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_None();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isResponsible <em>Responsible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Responsible</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isResponsible()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Responsible();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isFlags()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Flags();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isMaxstart <em>Maxstart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxstart</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isMaxstart()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Maxstart();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isMaxend <em>Maxend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxend</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isMaxend()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Maxend();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isPriority()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Priority();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isBooking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Booking</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isBooking()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Booking();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isNote()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Note();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isMinstart <em>Minstart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minstart</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isMinstart()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Minstart();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isMinend <em>Minend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minend</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isMinend()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Minend();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isComplete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Complete</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isComplete()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Complete();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskAttributes#isDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depends</em>'.
   * @see de.sos.etj.eTJ.TaskAttributes#isDepends()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Depends();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskPrefix <em>Task Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Prefix</em>'.
   * @see de.sos.etj.eTJ.TaskPrefix
   * @generated
   */
  EClass getTaskPrefix();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.TaskPrefix#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.sos.etj.eTJ.TaskPrefix#getTask()
   * @see #getTaskPrefix()
   * @generated
   */
  EReference getTaskPrefix_Task();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskReport <em>Task Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Report</em>'.
   * @see de.sos.etj.eTJ.TaskReport
   * @generated
   */
  EClass getTaskReport();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskRoot <em>Task Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Root</em>'.
   * @see de.sos.etj.eTJ.TaskRoot
   * @generated
   */
  EClass getTaskRoot();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.TaskRoot#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.sos.etj.eTJ.TaskRoot#getTask()
   * @see #getTaskRoot()
   * @generated
   */
  EReference getTaskRoot_Task();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TextReport <em>Text Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Report</em>'.
   * @see de.sos.etj.eTJ.TextReport
   * @generated
   */
  EClass getTextReport();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TimeFormat <em>Time Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Format</em>'.
   * @see de.sos.etj.eTJ.TimeFormat
   * @generated
   */
  EClass getTimeFormat();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TimeFormat#getTimeformat <em>Timeformat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeformat</em>'.
   * @see de.sos.etj.eTJ.TimeFormat#getTimeformat()
   * @see #getTimeFormat()
   * @generated
   */
  EAttribute getTimeFormat_Timeformat();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Timeoff <em>Timeoff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timeoff</em>'.
   * @see de.sos.etj.eTJ.Timeoff
   * @generated
   */
  EClass getTimeoff();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Timeoff#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Timeoff#getId()
   * @see #getTimeoff()
   * @generated
   */
  EAttribute getTimeoff_Id();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Timeoff#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Timeoff#getName()
   * @see #getTimeoff()
   * @generated
   */
  EAttribute getTimeoff_Name();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Timesheet <em>Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timesheet</em>'.
   * @see de.sos.etj.eTJ.Timesheet
   * @generated
   */
  EClass getTimesheet();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.Timesheet#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see de.sos.etj.eTJ.Timesheet#getResource()
   * @see #getTimesheet()
   * @generated
   */
  EReference getTimesheet_Resource();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Timesheet#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see de.sos.etj.eTJ.Timesheet#getInterval()
   * @see #getTimesheet()
   * @generated
   */
  EReference getTimesheet_Interval();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Timesheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Timesheet#getAttributes()
   * @see #getTimesheet()
   * @generated
   */
  EReference getTimesheet_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TimesheetAttribute <em>Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timesheet Attribute</em>'.
   * @see de.sos.etj.eTJ.TimesheetAttribute
   * @generated
   */
  EClass getTimesheetAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TimesheetReport <em>Timesheet Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timesheet Report</em>'.
   * @see de.sos.etj.eTJ.TimesheetReport
   * @generated
   */
  EClass getTimesheetReport();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TimesheetReport#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see de.sos.etj.eTJ.TimesheetReport#getFilename()
   * @see #getTimesheetReport()
   * @generated
   */
  EAttribute getTimesheetReport_Filename();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.TimesheetReport#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.TimesheetReport#getAttributes()
   * @see #getTimesheetReport()
   * @generated
   */
  EReference getTimesheetReport_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TimesheetReportAttribute <em>Timesheet Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timesheet Report Attribute</em>'.
   * @see de.sos.etj.eTJ.TimesheetReportAttribute
   * @generated
   */
  EClass getTimesheetReportAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Timezone <em>Timezone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timezone</em>'.
   * @see de.sos.etj.eTJ.Timezone
   * @generated
   */
  EClass getTimezone();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Timezone#getTimezone <em>Timezone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timezone</em>'.
   * @see de.sos.etj.eTJ.Timezone#getTimezone()
   * @see #getTimezone()
   * @generated
   */
  EAttribute getTimezone_Timezone();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TimingResolution <em>Timing Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timing Resolution</em>'.
   * @see de.sos.etj.eTJ.TimingResolution
   * @generated
   */
  EClass getTimingResolution();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TimingResolution#getTimingResolution <em>Timing Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timing Resolution</em>'.
   * @see de.sos.etj.eTJ.TimingResolution#getTimingResolution()
   * @see #getTimingResolution()
   * @generated
   */
  EAttribute getTimingResolution_TimingResolution();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see de.sos.etj.eTJ.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Title#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see de.sos.etj.eTJ.Title#getTitle()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Title();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ToolTip <em>Tool Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tool Tip</em>'.
   * @see de.sos.etj.eTJ.ToolTip
   * @generated
   */
  EClass getToolTip();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.ToolTip#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.ToolTip#getExpression()
   * @see #getToolTip()
   * @generated
   */
  EReference getToolTip_Expression();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.ToolTip#getTip <em>Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tip</em>'.
   * @see de.sos.etj.eTJ.ToolTip#getTip()
   * @see #getToolTip()
   * @generated
   */
  EAttribute getToolTip_Tip();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TrackingScenario <em>Tracking Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tracking Scenario</em>'.
   * @see de.sos.etj.eTJ.TrackingScenario
   * @generated
   */
  EClass getTrackingScenario();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.TrackingScenario#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scenario</em>'.
   * @see de.sos.etj.eTJ.TrackingScenario#getScenario()
   * @see #getTrackingScenario()
   * @generated
   */
  EReference getTrackingScenario_Scenario();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TreeLevel <em>Tree Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tree Level</em>'.
   * @see de.sos.etj.eTJ.TreeLevel
   * @generated
   */
  EClass getTreeLevel();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TreeLevel#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see de.sos.etj.eTJ.TreeLevel#getLevel()
   * @see #getTreeLevel()
   * @generated
   */
  EAttribute getTreeLevel_Level();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Vacation <em>Vacation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vacation</em>'.
   * @see de.sos.etj.eTJ.Vacation
   * @generated
   */
  EClass getVacation();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Vacation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sos.etj.eTJ.Vacation#getName()
   * @see #getVacation()
   * @generated
   */
  EAttribute getVacation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Vacation#getIntervals <em>Intervals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intervals</em>'.
   * @see de.sos.etj.eTJ.Vacation#getIntervals()
   * @see #getVacation()
   * @generated
   */
  EReference getVacation_Intervals();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Warn <em>Warn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Warn</em>'.
   * @see de.sos.etj.eTJ.Warn
   * @generated
   */
  EClass getWarn();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Warn#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.sos.etj.eTJ.Warn#getExpression()
   * @see #getWarn()
   * @generated
   */
  EReference getWarn_Expression();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.WeekStarts <em>Week Starts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Week Starts</em>'.
   * @see de.sos.etj.eTJ.WeekStarts
   * @generated
   */
  EClass getWeekStarts();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.WeekStarts#isSunday <em>Sunday</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sunday</em>'.
   * @see de.sos.etj.eTJ.WeekStarts#isSunday()
   * @see #getWeekStarts()
   * @generated
   */
  EAttribute getWeekStarts_Sunday();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.WeekStarts#isMonday <em>Monday</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Monday</em>'.
   * @see de.sos.etj.eTJ.WeekStarts#isMonday()
   * @see #getWeekStarts()
   * @generated
   */
  EAttribute getWeekStarts_Monday();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.WeeklyMax <em>Weekly Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weekly Max</em>'.
   * @see de.sos.etj.eTJ.WeeklyMax
   * @generated
   */
  EClass getWeeklyMax();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.WeeklyMin <em>Weekly Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weekly Min</em>'.
   * @see de.sos.etj.eTJ.WeeklyMin
   * @generated
   */
  EClass getWeeklyMin();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Width <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Width</em>'.
   * @see de.sos.etj.eTJ.Width
   * @generated
   */
  EClass getWidth();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Width#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see de.sos.etj.eTJ.Width#getWidth()
   * @see #getWidth()
   * @generated
   */
  EAttribute getWidth_Width();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Work <em>Work</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work</em>'.
   * @see de.sos.etj.eTJ.Work
   * @generated
   */
  EClass getWork();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Work#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.Work#getValue()
   * @see #getWork()
   * @generated
   */
  EAttribute getWork_Value();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Work#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see de.sos.etj.eTJ.Work#getUnit()
   * @see #getWork()
   * @generated
   */
  EAttribute getWork_Unit();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.WorkingHours <em>Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Working Hours</em>'.
   * @see de.sos.etj.eTJ.WorkingHours
   * @generated
   */
  EClass getWorkingHours();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.WorkingHours#getWeekdays <em>Weekdays</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Weekdays</em>'.
   * @see de.sos.etj.eTJ.WorkingHours#getWeekdays()
   * @see #getWorkingHours()
   * @generated
   */
  EReference getWorkingHours_Weekdays();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.WorkingHours#isOff <em>Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Off</em>'.
   * @see de.sos.etj.eTJ.WorkingHours#isOff()
   * @see #getWorkingHours()
   * @generated
   */
  EAttribute getWorkingHours_Off();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.WorkingHours#getHours <em>Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hours</em>'.
   * @see de.sos.etj.eTJ.WorkingHours#getHours()
   * @see #getWorkingHours()
   * @generated
   */
  EReference getWorkingHours_Hours();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.YearlyWorkingDays <em>Yearly Working Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Yearly Working Days</em>'.
   * @see de.sos.etj.eTJ.YearlyWorkingDays
   * @generated
   */
  EClass getYearlyWorkingDays();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.YearlyWorkingDays#getYearlyWorkingDays <em>Yearly Working Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Yearly Working Days</em>'.
   * @see de.sos.etj.eTJ.YearlyWorkingDays#getYearlyWorkingDays()
   * @see #getYearlyWorkingDays()
   * @generated
   */
  EAttribute getYearlyWorkingDays_YearlyWorkingDays();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.AccountShare <em>Account Share</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Share</em>'.
   * @see de.sos.etj.eTJ.AccountShare
   * @generated
   */
  EClass getAccountShare();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.AccountShare#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Account</em>'.
   * @see de.sos.etj.eTJ.AccountShare#getAccount()
   * @see #getAccountShare()
   * @generated
   */
  EReference getAccountShare_Account();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.AccountShare#getShare <em>Share</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Share</em>'.
   * @see de.sos.etj.eTJ.AccountShare#getShare()
   * @see #getAccountShare()
   * @generated
   */
  EAttribute getAccountShare_Share();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ColumnAttribute <em>Column Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Attribute</em>'.
   * @see de.sos.etj.eTJ.ColumnAttribute
   * @generated
   */
  EClass getColumnAttribute();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ExtendedResourceAttributeColumn <em>Extended Resource Attribute Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Resource Attribute Column</em>'.
   * @see de.sos.etj.eTJ.ExtendedResourceAttributeColumn
   * @generated
   */
  EClass getExtendedResourceAttributeColumn();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.ExtendedResourceAttributeColumn#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extension</em>'.
   * @see de.sos.etj.eTJ.ExtendedResourceAttributeColumn#getExtension()
   * @see #getExtendedResourceAttributeColumn()
   * @generated
   */
  EReference getExtendedResourceAttributeColumn_Extension();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see de.sos.etj.eTJ.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Column#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.sos.etj.eTJ.Column#getId()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Id();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Column#getExt <em>Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ext</em>'.
   * @see de.sos.etj.eTJ.Column#getExt()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Ext();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Column#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Column#getAttributes()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Criterion <em>Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criterion</em>'.
   * @see de.sos.etj.eTJ.Criterion
   * @generated
   */
  EClass getCriterion();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.Criterion#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scenario</em>'.
   * @see de.sos.etj.eTJ.Criterion#getScenario()
   * @see #getCriterion()
   * @generated
   */
  EReference getCriterion_Scenario();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Criterion#getColumnId <em>Column Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Id</em>'.
   * @see de.sos.etj.eTJ.Criterion#getColumnId()
   * @see #getCriterion()
   * @generated
   */
  EAttribute getCriterion_ColumnId();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Criterion#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see de.sos.etj.eTJ.Criterion#getDirection()
   * @see #getCriterion()
   * @generated
   */
  EAttribute getCriterion_Direction();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.DurationQuantity <em>Duration Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duration Quantity</em>'.
   * @see de.sos.etj.eTJ.DurationQuantity
   * @generated
   */
  EClass getDurationQuantity();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.DurationQuantity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.DurationQuantity#getValue()
   * @see #getDurationQuantity()
   * @generated
   */
  EAttribute getDurationQuantity_Value();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.DurationQuantity#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see de.sos.etj.eTJ.DurationQuantity#getUnit()
   * @see #getDurationQuantity()
   * @generated
   */
  EAttribute getDurationQuantity_Unit();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit</em>'.
   * @see de.sos.etj.eTJ.Limit
   * @generated
   */
  EClass getLimit();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.Limit#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see de.sos.etj.eTJ.Limit#getDuration()
   * @see #getLimit()
   * @generated
   */
  EReference getLimit_Duration();

  /**
   * Returns the meta object for the containment reference list '{@link de.sos.etj.eTJ.Limit#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.sos.etj.eTJ.Limit#getAttributes()
   * @see #getLimit()
   * @generated
   */
  EReference getLimit_Attributes();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LimitAttribute <em>Limit Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit Attribute</em>'.
   * @see de.sos.etj.eTJ.LimitAttribute
   * @generated
   */
  EClass getLimitAttribute();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LimitAttribute#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.sos.etj.eTJ.LimitAttribute#getEnd()
   * @see #getLimitAttribute()
   * @generated
   */
  EReference getLimitAttribute_End();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LimitAttribute#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Period</em>'.
   * @see de.sos.etj.eTJ.LimitAttribute#getPeriod()
   * @see #getLimitAttribute()
   * @generated
   */
  EReference getLimitAttribute_Period();

  /**
   * Returns the meta object for the reference list '{@link de.sos.etj.eTJ.LimitAttribute#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see de.sos.etj.eTJ.LimitAttribute#getResources()
   * @see #getLimitAttribute()
   * @generated
   */
  EReference getLimitAttribute_Resources();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LimitAttribute#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.sos.etj.eTJ.LimitAttribute#getStart()
   * @see #getLimitAttribute()
   * @generated
   */
  EReference getLimitAttribute_Start();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.RealFormat <em>Real Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Format</em>'.
   * @see de.sos.etj.eTJ.RealFormat
   * @generated
   */
  EClass getRealFormat();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.RealFormat#getNegativePrefix <em>Negative Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative Prefix</em>'.
   * @see de.sos.etj.eTJ.RealFormat#getNegativePrefix()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_NegativePrefix();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.RealFormat#getNegativeSuffix <em>Negative Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative Suffix</em>'.
   * @see de.sos.etj.eTJ.RealFormat#getNegativeSuffix()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_NegativeSuffix();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.RealFormat#getThousandsSeparator <em>Thousands Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thousands Separator</em>'.
   * @see de.sos.etj.eTJ.RealFormat#getThousandsSeparator()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_ThousandsSeparator();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.RealFormat#getFractionSeparator <em>Fraction Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fraction Separator</em>'.
   * @see de.sos.etj.eTJ.RealFormat#getFractionSeparator()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_FractionSeparator();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.RealFormat#getFractionDigits <em>Fraction Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fraction Digits</em>'.
   * @see de.sos.etj.eTJ.RealFormat#getFractionDigits()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_FractionDigits();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.TaskDependency <em>Task Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Dependency</em>'.
   * @see de.sos.etj.eTJ.TaskDependency
   * @generated
   */
  EClass getTaskDependency();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.TaskDependency#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.sos.etj.eTJ.TaskDependency#getTask()
   * @see #getTaskDependency()
   * @generated
   */
  EReference getTaskDependency_Task();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.TaskDependency#getGapDuration <em>Gap Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gap Duration</em>'.
   * @see de.sos.etj.eTJ.TaskDependency#getGapDuration()
   * @see #getTaskDependency()
   * @generated
   */
  EReference getTaskDependency_GapDuration();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.TaskDependency#getGapLength <em>Gap Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gap Length</em>'.
   * @see de.sos.etj.eTJ.TaskDependency#getGapLength()
   * @see #getTaskDependency()
   * @generated
   */
  EReference getTaskDependency_GapLength();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.TaskDependency#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Policy</em>'.
   * @see de.sos.etj.eTJ.TaskDependency#getPolicy()
   * @see #getTaskDependency()
   * @generated
   */
  EAttribute getTaskDependency_Policy();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.RichText <em>Rich Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich Text</em>'.
   * @see de.sos.etj.eTJ.RichText
   * @generated
   */
  EClass getRichText();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.RichText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see de.sos.etj.eTJ.RichText#getText()
   * @see #getRichText()
   * @generated
   */
  EAttribute getRichText_Text();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.WorkHours <em>Work Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Hours</em>'.
   * @see de.sos.etj.eTJ.WorkHours
   * @generated
   */
  EClass getWorkHours();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.WorkHours#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see de.sos.etj.eTJ.WorkHours#getStart()
   * @see #getWorkHours()
   * @generated
   */
  EAttribute getWorkHours_Start();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.WorkHours#getStop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stop</em>'.
   * @see de.sos.etj.eTJ.WorkHours#getStop()
   * @see #getWorkHours()
   * @generated
   */
  EAttribute getWorkHours_Stop();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Weekdays <em>Weekdays</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weekdays</em>'.
   * @see de.sos.etj.eTJ.Weekdays
   * @generated
   */
  EClass getWeekdays();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Weekdays#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First</em>'.
   * @see de.sos.etj.eTJ.Weekdays#getFirst()
   * @see #getWeekdays()
   * @generated
   */
  EAttribute getWeekdays_First();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Weekdays#getLast <em>Last</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last</em>'.
   * @see de.sos.etj.eTJ.Weekdays#getLast()
   * @see #getWeekdays()
   * @generated
   */
  EAttribute getWeekdays_Last();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ISODATE <em>ISODATE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ISODATE</em>'.
   * @see de.sos.etj.eTJ.ISODATE
   * @generated
   */
  EClass getISODATE();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.ISODATE#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see de.sos.etj.eTJ.ISODATE#getDate()
   * @see #getISODATE()
   * @generated
   */
  EReference getISODATE_Date();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.ISODATE#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see de.sos.etj.eTJ.ISODATE#getDuration()
   * @see #getISODATE()
   * @generated
   */
  EReference getISODATE_Duration();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.ExtDate <em>Ext Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ext Date</em>'.
   * @see de.sos.etj.eTJ.ExtDate
   * @generated
   */
  EClass getExtDate();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.Defintions <em>Defintions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defintions</em>'.
   * @see de.sos.etj.eTJ.Defintions
   * @generated
   */
  EClass getDefintions();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Defintions#isFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see de.sos.etj.eTJ.Defintions#isFlags()
   * @see #getDefintions()
   * @generated
   */
  EAttribute getDefintions_Flags();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Defintions#isResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resources</em>'.
   * @see de.sos.etj.eTJ.Defintions#isResources()
   * @see #getDefintions()
   * @generated
   */
  EAttribute getDefintions_Resources();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Defintions#isTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tasks</em>'.
   * @see de.sos.etj.eTJ.Defintions#isTasks()
   * @see #getDefintions()
   * @generated
   */
  EAttribute getDefintions_Tasks();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Defintions#isProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project</em>'.
   * @see de.sos.etj.eTJ.Defintions#isProject()
   * @see #getDefintions()
   * @generated
   */
  EAttribute getDefintions_Project();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.Defintions#isProjectids <em>Projectids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Projectids</em>'.
   * @see de.sos.etj.eTJ.Defintions#isProjectids()
   * @see #getDefintions()
   * @generated
   */
  EAttribute getDefintions_Projectids();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LogicalFunctionExpression <em>Logical Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Function Expression</em>'.
   * @see de.sos.etj.eTJ.LogicalFunctionExpression
   * @generated
   */
  EClass getLogicalFunctionExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LogicalFunctionExpression#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see de.sos.etj.eTJ.LogicalFunctionExpression#getFunction()
   * @see #getLogicalFunctionExpression()
   * @generated
   */
  EReference getLogicalFunctionExpression_Function();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LogicalAbsoluteIdExression <em>Logical Absolute Id Exression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Absolute Id Exression</em>'.
   * @see de.sos.etj.eTJ.LogicalAbsoluteIdExression
   * @generated
   */
  EClass getLogicalAbsoluteIdExression();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LogicalAbsoluteIdExression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.LogicalAbsoluteIdExression#getValue()
   * @see #getLogicalAbsoluteIdExression()
   * @generated
   */
  EAttribute getLogicalAbsoluteIdExression_Value();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LogicalBooleanLiteral <em>Logical Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Boolean Literal</em>'.
   * @see de.sos.etj.eTJ.LogicalBooleanLiteral
   * @generated
   */
  EClass getLogicalBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LogicalBooleanLiteral#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see de.sos.etj.eTJ.LogicalBooleanLiteral#isIsTrue()
   * @see #getLogicalBooleanLiteral()
   * @generated
   */
  EAttribute getLogicalBooleanLiteral_IsTrue();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LogicalNumeralLiteral <em>Logical Numeral Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Numeral Literal</em>'.
   * @see de.sos.etj.eTJ.LogicalNumeralLiteral
   * @generated
   */
  EClass getLogicalNumeralLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LogicalNumeralLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.LogicalNumeralLiteral#getValue()
   * @see #getLogicalNumeralLiteral()
   * @generated
   */
  EAttribute getLogicalNumeralLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LogicalStringLiteral <em>Logical String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical String Literal</em>'.
   * @see de.sos.etj.eTJ.LogicalStringLiteral
   * @generated
   */
  EClass getLogicalStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LogicalStringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sos.etj.eTJ.LogicalStringLiteral#getValue()
   * @see #getLogicalStringLiteral()
   * @generated
   */
  EAttribute getLogicalStringLiteral_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LogicalStringLiteral#getMacro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Macro</em>'.
   * @see de.sos.etj.eTJ.LogicalStringLiteral#getMacro()
   * @see #getLogicalStringLiteral()
   * @generated
   */
  EReference getLogicalStringLiteral_Macro();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LogicalDateLiteral <em>Logical Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Date Literal</em>'.
   * @see de.sos.etj.eTJ.LogicalDateLiteral
   * @generated
   */
  EClass getLogicalDateLiteral();

  /**
   * Returns the meta object for the containment reference '{@link de.sos.etj.eTJ.LogicalDateLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.sos.etj.eTJ.LogicalDateLiteral#getValue()
   * @see #getLogicalDateLiteral()
   * @generated
   */
  EReference getLogicalDateLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.sos.etj.eTJ.LogicalFlagExpression <em>Logical Flag Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Flag Expression</em>'.
   * @see de.sos.etj.eTJ.LogicalFlagExpression
   * @generated
   */
  EClass getLogicalFlagExpression();

  /**
   * Returns the meta object for the reference '{@link de.sos.etj.eTJ.LogicalFlagExpression#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scenario</em>'.
   * @see de.sos.etj.eTJ.LogicalFlagExpression#getScenario()
   * @see #getLogicalFlagExpression()
   * @generated
   */
  EReference getLogicalFlagExpression_Scenario();

  /**
   * Returns the meta object for the attribute '{@link de.sos.etj.eTJ.LogicalFlagExpression#getColumId <em>Colum Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Colum Id</em>'.
   * @see de.sos.etj.eTJ.LogicalFlagExpression#getColumId()
   * @see #getLogicalFlagExpression()
   * @generated
   */
  EAttribute getLogicalFlagExpression_ColumId();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.LeaveType <em>Leave Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Leave Type</em>'.
   * @see de.sos.etj.eTJ.LeaveType
   * @generated
   */
  EEnum getLeaveType();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.BuildInMacro <em>Build In Macro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Build In Macro</em>'.
   * @see de.sos.etj.eTJ.BuildInMacro
   * @generated
   */
  EEnum getBuildInMacro();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.JournalAttributeValues <em>Journal Attribute Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Journal Attribute Values</em>'.
   * @see de.sos.etj.eTJ.JournalAttributeValues
   * @generated
   */
  EEnum getJournalAttributeValues();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.PurgeReportAttribute <em>Purge Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Purge Report Attribute</em>'.
   * @see de.sos.etj.eTJ.PurgeReportAttribute
   * @generated
   */
  EEnum getPurgeReportAttribute();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.PurgeResourceAttribute <em>Purge Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Purge Resource Attribute</em>'.
   * @see de.sos.etj.eTJ.PurgeResourceAttribute
   * @generated
   */
  EEnum getPurgeResourceAttribute();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.PurgeTaskAttribute <em>Purge Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Purge Task Attribute</em>'.
   * @see de.sos.etj.eTJ.PurgeTaskAttribute
   * @generated
   */
  EEnum getPurgeTaskAttribute();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.ChargeApplies <em>Charge Applies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Charge Applies</em>'.
   * @see de.sos.etj.eTJ.ChargeApplies
   * @generated
   */
  EEnum getChargeApplies();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.Justification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Justification</em>'.
   * @see de.sos.etj.eTJ.Justification
   * @generated
   */
  EEnum getJustification();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.JournalModeValue <em>Journal Mode Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Journal Mode Value</em>'.
   * @see de.sos.etj.eTJ.JournalModeValue
   * @generated
   */
  EEnum getJournalModeValue();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.JournalEntrySortCriterion <em>Journal Entry Sort Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Journal Entry Sort Criterion</em>'.
   * @see de.sos.etj.eTJ.JournalEntrySortCriterion
   * @generated
   */
  EEnum getJournalEntrySortCriterion();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.ListTypeValues <em>List Type Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>List Type Values</em>'.
   * @see de.sos.etj.eTJ.ListTypeValues
   * @generated
   */
  EEnum getListTypeValues();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.CriterionDirection <em>Criterion Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Criterion Direction</em>'.
   * @see de.sos.etj.eTJ.CriterionDirection
   * @generated
   */
  EEnum getCriterionDirection();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.YesNo <em>Yes No</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Yes No</em>'.
   * @see de.sos.etj.eTJ.YesNo
   * @generated
   */
  EEnum getYesNo();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.ReportFormat <em>Report Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Report Format</em>'.
   * @see de.sos.etj.eTJ.ReportFormat
   * @generated
   */
  EEnum getReportFormat();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.LoadDisplayUnit <em>Load Display Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Load Display Unit</em>'.
   * @see de.sos.etj.eTJ.LoadDisplayUnit
   * @generated
   */
  EEnum getLoadDisplayUnit();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.ScaleResolution <em>Scale Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Scale Resolution</em>'.
   * @see de.sos.etj.eTJ.ScaleResolution
   * @generated
   */
  EEnum getScaleResolution();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.SelectArgument <em>Select Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Select Argument</em>'.
   * @see de.sos.etj.eTJ.SelectArgument
   * @generated
   */
  EEnum getSelectArgument();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.ColumnId <em>Column Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Column Id</em>'.
   * @see de.sos.etj.eTJ.ColumnId
   * @generated
   */
  EEnum getColumnId();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.AlertLevel <em>Alert Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Alert Level</em>'.
   * @see de.sos.etj.eTJ.AlertLevel
   * @generated
   */
  EEnum getAlertLevel();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.DependsPolicy <em>Depends Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Depends Policy</em>'.
   * @see de.sos.etj.eTJ.DependsPolicy
   * @generated
   */
  EEnum getDependsPolicy();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.SchedulingPolicy <em>Scheduling Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Scheduling Policy</em>'.
   * @see de.sos.etj.eTJ.SchedulingPolicy
   * @generated
   */
  EEnum getSchedulingPolicy();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.TimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Time Unit</em>'.
   * @see de.sos.etj.eTJ.TimeUnit
   * @generated
   */
  EEnum getTimeUnit();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.Weekday <em>Weekday</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Weekday</em>'.
   * @see de.sos.etj.eTJ.Weekday
   * @generated
   */
  EEnum getWeekday();

  /**
   * Returns the meta object for enum '{@link de.sos.etj.eTJ.WorkQuantityUnit <em>Work Quantity Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Work Quantity Unit</em>'.
   * @see de.sos.etj.eTJ.WorkQuantityUnit
   * @generated
   */
  EEnum getWorkQuantityUnit();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ETJFactory getETJFactory();

} //ETJPackage
