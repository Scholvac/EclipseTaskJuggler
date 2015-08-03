/**
 */
package de.sos.etj.eTJ.util;

import de.sos.etj.eTJ.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.sos.etj.eTJ.ETJPackage
 * @generated
 */
public class ETJAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ETJPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETJAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ETJPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETJSwitch<Adapter> modelSwitch =
    new ETJSwitch<Adapter>()
    {
      @Override
      public Adapter caseGlobal(Global object)
      {
        return createGlobalAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseLeaves(Leaves object)
      {
        return createLeavesAdapter();
      }
      @Override
      public Adapter caseLeaveDetails(LeaveDetails object)
      {
        return createLeaveDetailsAdapter();
      }
      @Override
      public Adapter caseAccount(Account object)
      {
        return createAccountAdapter();
      }
      @Override
      public Adapter caseAccountAttribute(AccountAttribute object)
      {
        return createAccountAttributeAdapter();
      }
      @Override
      public Adapter caseAccountPrefix(AccountPrefix object)
      {
        return createAccountPrefixAdapter();
      }
      @Override
      public Adapter caseAccountReport(AccountReport object)
      {
        return createAccountReportAdapter();
      }
      @Override
      public Adapter caseAccountRoot(AccountRoot object)
      {
        return createAccountRootAdapter();
      }
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseProjectAttribute(ProjectAttribute object)
      {
        return createProjectAttributeAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseTaskAttribute(TaskAttribute object)
      {
        return createTaskAttributeAdapter();
      }
      @Override
      public Adapter caseMacroCall(MacroCall object)
      {
        return createMacroCallAdapter();
      }
      @Override
      public Adapter caseReport(Report object)
      {
        return createReportAdapter();
      }
      @Override
      public Adapter caseReportAttribute(ReportAttribute object)
      {
        return createReportAttributeAdapter();
      }
      @Override
      public Adapter caseIcalReport(IcalReport object)
      {
        return createIcalReportAdapter();
      }
      @Override
      public Adapter caseIcalReportAttribute(IcalReportAttribute object)
      {
        return createIcalReportAttributeAdapter();
      }
      @Override
      public Adapter caseExport(Export object)
      {
        return createExportAdapter();
      }
      @Override
      public Adapter caseExportAttribute(ExportAttribute object)
      {
        return createExportAttributeAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseResourceAttribute(ResourceAttribute object)
      {
        return createResourceAttributeAdapter();
      }
      @Override
      public Adapter caseAllocate(Allocate object)
      {
        return createAllocateAdapter();
      }
      @Override
      public Adapter caseAllocateResource(AllocateResource object)
      {
        return createAllocateResourceAdapter();
      }
      @Override
      public Adapter caseAllocateResourceAttribute(AllocateResourceAttribute object)
      {
        return createAllocateResourceAttributeAdapter();
      }
      @Override
      public Adapter caseNavigator(Navigator object)
      {
        return createNavigatorAdapter();
      }
      @Override
      public Adapter caseNavigatorAttribute(NavigatorAttribute object)
      {
        return createNavigatorAttributeAdapter();
      }
      @Override
      public Adapter caseNewTask(NewTask object)
      {
        return createNewTaskAdapter();
      }
      @Override
      public Adapter caseNewTaskAttribute(NewTaskAttribute object)
      {
        return createNewTaskAttributeAdapter();
      }
      @Override
      public Adapter caseNikuReport(NikuReport object)
      {
        return createNikuReportAdapter();
      }
      @Override
      public Adapter caseNikuReportAttribute(NikuReportAttribute object)
      {
        return createNikuReportAttributeAdapter();
      }
      @Override
      public Adapter caseAlert(Alert object)
      {
        return createAlertAdapter();
      }
      @Override
      public Adapter caseAlternative(Alternative object)
      {
        return createAlternativeAdapter();
      }
      @Override
      public Adapter caseAuthor(Author object)
      {
        return createAuthorAdapter();
      }
      @Override
      public Adapter caseBalance(Balance object)
      {
        return createBalanceAdapter();
      }
      @Override
      public Adapter caseBooking(Booking object)
      {
        return createBookingAdapter();
      }
      @Override
      public Adapter caseBookingTask(BookingTask object)
      {
        return createBookingTaskAdapter();
      }
      @Override
      public Adapter caseBookingResource(BookingResource object)
      {
        return createBookingResourceAdapter();
      }
      @Override
      public Adapter caseCaption(Caption object)
      {
        return createCaptionAdapter();
      }
      @Override
      public Adapter caseCellColor(CellColor object)
      {
        return createCellColorAdapter();
      }
      @Override
      public Adapter caseCellText(CellText object)
      {
        return createCellTextAdapter();
      }
      @Override
      public Adapter caseCenter(Center object)
      {
        return createCenterAdapter();
      }
      @Override
      public Adapter caseCharge(Charge object)
      {
        return createChargeAdapter();
      }
      @Override
      public Adapter caseChargeSet(ChargeSet object)
      {
        return createChargeSetAdapter();
      }
      @Override
      public Adapter caseColumns(Columns object)
      {
        return createColumnsAdapter();
      }
      @Override
      public Adapter caseComplete(Complete object)
      {
        return createCompleteAdapter();
      }
      @Override
      public Adapter caseCopyright(Copyright object)
      {
        return createCopyrightAdapter();
      }
      @Override
      public Adapter caseCredit(Credit object)
      {
        return createCreditAdapter();
      }
      @Override
      public Adapter caseCurrency(Currency object)
      {
        return createCurrencyAdapter();
      }
      @Override
      public Adapter caseCurrencyFormat(CurrencyFormat object)
      {
        return createCurrencyFormatAdapter();
      }
      @Override
      public Adapter caseDailyMax(DailyMax object)
      {
        return createDailyMaxAdapter();
      }
      @Override
      public Adapter caseDailyMin(DailyMin object)
      {
        return createDailyMinAdapter();
      }
      @Override
      public Adapter caseDailyWorkingHours(DailyWorkingHours object)
      {
        return createDailyWorkingHoursAdapter();
      }
      @Override
      public Adapter caseDefinitions(Definitions object)
      {
        return createDefinitionsAdapter();
      }
      @Override
      public Adapter caseDepends(Depends object)
      {
        return createDependsAdapter();
      }
      @Override
      public Adapter caseDetails(Details object)
      {
        return createDetailsAdapter();
      }
      @Override
      public Adapter caseDuration(Duration object)
      {
        return createDurationAdapter();
      }
      @Override
      public Adapter caseEfficiency(Efficiency object)
      {
        return createEfficiencyAdapter();
      }
      @Override
      public Adapter caseEffort(Effort object)
      {
        return createEffortAdapter();
      }
      @Override
      public Adapter caseEmail(Email object)
      {
        return createEmailAdapter();
      }
      @Override
      public Adapter caseEnd(End object)
      {
        return createEndAdapter();
      }
      @Override
      public Adapter caseEndCredit(EndCredit object)
      {
        return createEndCreditAdapter();
      }
      @Override
      public Adapter caseEpilog(Epilog object)
      {
        return createEpilogAdapter();
      }
      @Override
      public Adapter caseExtend(Extend object)
      {
        return createExtendAdapter();
      }
      @Override
      public Adapter caseExtendResource(ExtendResource object)
      {
        return createExtendResourceAdapter();
      }
      @Override
      public Adapter caseExtendedResourceAttribute(ExtendedResourceAttribute object)
      {
        return createExtendedResourceAttributeAdapter();
      }
      @Override
      public Adapter caseExtendTask(ExtendTask object)
      {
        return createExtendTaskAdapter();
      }
      @Override
      public Adapter caseExtendedTaskAttribute(ExtendedTaskAttribute object)
      {
        return createExtendedTaskAttributeAdapter();
      }
      @Override
      public Adapter caseFail(Fail object)
      {
        return createFailAdapter();
      }
      @Override
      public Adapter caseFlags(Flags object)
      {
        return createFlagsAdapter();
      }
      @Override
      public Adapter caseFontColor(FontColor object)
      {
        return createFontColorAdapter();
      }
      @Override
      public Adapter caseFooter(Footer object)
      {
        return createFooterAdapter();
      }
      @Override
      public Adapter caseFormats(Formats object)
      {
        return createFormatsAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseGapDuration(GapDuration object)
      {
        return createGapDurationAdapter();
      }
      @Override
      public Adapter caseGapLength(GapLength object)
      {
        return createGapLengthAdapter();
      }
      @Override
      public Adapter caseHAlign(HAlign object)
      {
        return createHAlignAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter caseHeadline(Headline object)
      {
        return createHeadlineAdapter();
      }
      @Override
      public Adapter caseHideAccount(HideAccount object)
      {
        return createHideAccountAdapter();
      }
      @Override
      public Adapter caseHideJournalEntry(HideJournalEntry object)
      {
        return createHideJournalEntryAdapter();
      }
      @Override
      public Adapter caseHideReport(HideReport object)
      {
        return createHideReportAdapter();
      }
      @Override
      public Adapter caseHideResource(HideResource object)
      {
        return createHideResourceAdapter();
      }
      @Override
      public Adapter caseHideTask(HideTask object)
      {
        return createHideTaskAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseIncludeProperties(IncludeProperties object)
      {
        return createIncludePropertiesAdapter();
      }
      @Override
      public Adapter caseIncludePropertiesAttribute(IncludePropertiesAttribute object)
      {
        return createIncludePropertiesAttributeAdapter();
      }
      @Override
      public Adapter caseInterval1(Interval1 object)
      {
        return createInterval1Adapter();
      }
      @Override
      public Adapter caseInterval2(Interval2 object)
      {
        return createInterval2Adapter();
      }
      @Override
      public Adapter caseInterval3(Interval3 object)
      {
        return createInterval3Adapter();
      }
      @Override
      public Adapter caseInterval4(Interval4 object)
      {
        return createInterval4Adapter();
      }
      @Override
      public Adapter caseJournalAttributes(JournalAttributes object)
      {
        return createJournalAttributesAdapter();
      }
      @Override
      public Adapter caseJournalEntry(JournalEntry object)
      {
        return createJournalEntryAdapter();
      }
      @Override
      public Adapter caseJournalMode(JournalMode object)
      {
        return createJournalModeAdapter();
      }
      @Override
      public Adapter caseLeft(Left object)
      {
        return createLeftAdapter();
      }
      @Override
      public Adapter caseLength(Length object)
      {
        return createLengthAdapter();
      }
      @Override
      public Adapter caseLimits(Limits object)
      {
        return createLimitsAdapter();
      }
      @Override
      public Adapter caseLimitsAttribute(LimitsAttribute object)
      {
        return createLimitsAttributeAdapter();
      }
      @Override
      public Adapter caseListItem(ListItem object)
      {
        return createListItemAdapter();
      }
      @Override
      public Adapter caseListType(ListType object)
      {
        return createListTypeAdapter();
      }
      @Override
      public Adapter caseLoadUnit(LoadUnit object)
      {
        return createLoadUnitAdapter();
      }
      @Override
      public Adapter caseLogicalExpression(LogicalExpression object)
      {
        return createLogicalExpressionAdapter();
      }
      @Override
      public Adapter caseMacro(Macro object)
      {
        return createMacroAdapter();
      }
      @Override
      public Adapter caseManagers(Managers object)
      {
        return createManagersAdapter();
      }
      @Override
      public Adapter caseMandatory(Mandatory object)
      {
        return createMandatoryAdapter();
      }
      @Override
      public Adapter caseMaxEnd(MaxEnd object)
      {
        return createMaxEndAdapter();
      }
      @Override
      public Adapter caseMaximum(Maximum object)
      {
        return createMaximumAdapter();
      }
      @Override
      public Adapter caseMaxStart(MaxStart object)
      {
        return createMaxStartAdapter();
      }
      @Override
      public Adapter caseMilestone(Milestone object)
      {
        return createMilestoneAdapter();
      }
      @Override
      public Adapter caseMinimum(Minimum object)
      {
        return createMinimumAdapter();
      }
      @Override
      public Adapter caseMinEnd(MinEnd object)
      {
        return createMinEndAdapter();
      }
      @Override
      public Adapter caseMinStart(MinStart object)
      {
        return createMinStartAdapter();
      }
      @Override
      public Adapter caseMonthlyMax(MonthlyMax object)
      {
        return createMonthlyMaxAdapter();
      }
      @Override
      public Adapter caseMonthlyMin(MonthlyMin object)
      {
        return createMonthlyMinAdapter();
      }
      @Override
      public Adapter caseNote(Note object)
      {
        return createNoteAdapter();
      }
      @Override
      public Adapter caseNow(Now object)
      {
        return createNowAdapter();
      }
      @Override
      public Adapter caseNumberFormat(NumberFormat object)
      {
        return createNumberFormatAdapter();
      }
      @Override
      public Adapter casePeriod(Period object)
      {
        return createPeriodAdapter();
      }
      @Override
      public Adapter casePersistent(Persistent object)
      {
        return createPersistentAdapter();
      }
      @Override
      public Adapter casePrecedes(Precedes object)
      {
        return createPrecedesAdapter();
      }
      @Override
      public Adapter casePriority(Priority object)
      {
        return createPriorityAdapter();
      }
      @Override
      public Adapter caseProjectId(ProjectId object)
      {
        return createProjectIdAdapter();
      }
      @Override
      public Adapter caseProjectIds(ProjectIds object)
      {
        return createProjectIdsAdapter();
      }
      @Override
      public Adapter caseProlog(Prolog object)
      {
        return createPrologAdapter();
      }
      @Override
      public Adapter casePurgeReport(PurgeReport object)
      {
        return createPurgeReportAdapter();
      }
      @Override
      public Adapter casePurgeResource(PurgeResource object)
      {
        return createPurgeResourceAdapter();
      }
      @Override
      public Adapter casePurgeTask(PurgeTask object)
      {
        return createPurgeTaskAdapter();
      }
      @Override
      public Adapter caseRate(Rate object)
      {
        return createRateAdapter();
      }
      @Override
      public Adapter caseRemaining(Remaining object)
      {
        return createRemainingAdapter();
      }
      @Override
      public Adapter caseReportPrefix(ReportPrefix object)
      {
        return createReportPrefixAdapter();
      }
      @Override
      public Adapter caseResourceAttributes(ResourceAttributes object)
      {
        return createResourceAttributesAdapter();
      }
      @Override
      public Adapter caseResourcePrefix(ResourcePrefix object)
      {
        return createResourcePrefixAdapter();
      }
      @Override
      public Adapter caseResourceReport(ResourceReport object)
      {
        return createResourceReportAdapter();
      }
      @Override
      public Adapter caseResourceRoot(ResourceRoot object)
      {
        return createResourceRootAdapter();
      }
      @Override
      public Adapter caseResponsible(Responsible object)
      {
        return createResponsibleAdapter();
      }
      @Override
      public Adapter caseRGB(RGB object)
      {
        return createRGBAdapter();
      }
      @Override
      public Adapter caseRight(Right object)
      {
        return createRightAdapter();
      }
      @Override
      public Adapter caseRollupAccount(RollupAccount object)
      {
        return createRollupAccountAdapter();
      }
      @Override
      public Adapter caseRollupResource(RollupResource object)
      {
        return createRollupResourceAdapter();
      }
      @Override
      public Adapter caseRollupTask(RollupTask object)
      {
        return createRollupTaskAdapter();
      }
      @Override
      public Adapter caseScale(Scale object)
      {
        return createScaleAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseScenarioIcal(ScenarioIcal object)
      {
        return createScenarioIcalAdapter();
      }
      @Override
      public Adapter caseScenarios(Scenarios object)
      {
        return createScenariosAdapter();
      }
      @Override
      public Adapter caseScheduled(Scheduled object)
      {
        return createScheduledAdapter();
      }
      @Override
      public Adapter caseScheduling(Scheduling object)
      {
        return createSchedulingAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseSelfContained(SelfContained object)
      {
        return createSelfContainedAdapter();
      }
      @Override
      public Adapter caseShift(Shift object)
      {
        return createShiftAdapter();
      }
      @Override
      public Adapter caseShiftTimesheet(ShiftTimesheet object)
      {
        return createShiftTimesheetAdapter();
      }
      @Override
      public Adapter caseShifts(Shifts object)
      {
        return createShiftsAdapter();
      }
      @Override
      public Adapter caseShiftsLimit(ShiftsLimit object)
      {
        return createShiftsLimitAdapter();
      }
      @Override
      public Adapter caseShiftsAllocate(ShiftsAllocate object)
      {
        return createShiftsAllocateAdapter();
      }
      @Override
      public Adapter caseShiftsResource(ShiftsResource object)
      {
        return createShiftsResourceAdapter();
      }
      @Override
      public Adapter caseShiftsTask(ShiftsTask object)
      {
        return createShiftsTaskAdapter();
      }
      @Override
      public Adapter caseShortTimeFormat(ShortTimeFormat object)
      {
        return createShortTimeFormatAdapter();
      }
      @Override
      public Adapter caseSort(Sort object)
      {
        return createSortAdapter();
      }
      @Override
      public Adapter caseSortAccounts(SortAccounts object)
      {
        return createSortAccountsAdapter();
      }
      @Override
      public Adapter caseSortJournalEntries(SortJournalEntries object)
      {
        return createSortJournalEntriesAdapter();
      }
      @Override
      public Adapter caseSortResources(SortResources object)
      {
        return createSortResourcesAdapter();
      }
      @Override
      public Adapter caseSortTasks(SortTasks object)
      {
        return createSortTasksAdapter();
      }
      @Override
      public Adapter caseStart(Start object)
      {
        return createStartAdapter();
      }
      @Override
      public Adapter caseStatusStatusSheet(StatusStatusSheet object)
      {
        return createStatusStatusSheetAdapter();
      }
      @Override
      public Adapter caseStatusStatusSheetAttribute(StatusStatusSheetAttribute object)
      {
        return createStatusStatusSheetAttributeAdapter();
      }
      @Override
      public Adapter caseStatusTimesheet(StatusTimesheet object)
      {
        return createStatusTimesheetAdapter();
      }
      @Override
      public Adapter caseStatusTimesheetAttribute(StatusTimesheetAttribute object)
      {
        return createStatusTimesheetAttributeAdapter();
      }
      @Override
      public Adapter caseStatusSheet(StatusSheet object)
      {
        return createStatusSheetAdapter();
      }
      @Override
      public Adapter caseStatusSheetAttribute(StatusSheetAttribute object)
      {
        return createStatusSheetAttributeAdapter();
      }
      @Override
      public Adapter caseStatusSheetReport(StatusSheetReport object)
      {
        return createStatusSheetReportAdapter();
      }
      @Override
      public Adapter caseStatusSheetReportAttribute(StatusSheetReportAttribute object)
      {
        return createStatusSheetReportAttributeAdapter();
      }
      @Override
      public Adapter caseSummary(Summary object)
      {
        return createSummaryAdapter();
      }
      @Override
      public Adapter caseSupplementAccount(SupplementAccount object)
      {
        return createSupplementAccountAdapter();
      }
      @Override
      public Adapter caseSupplementReport(SupplementReport object)
      {
        return createSupplementReportAdapter();
      }
      @Override
      public Adapter caseSupplementResource(SupplementResource object)
      {
        return createSupplementResourceAdapter();
      }
      @Override
      public Adapter caseSupplementTask(SupplementTask object)
      {
        return createSupplementTaskAdapter();
      }
      @Override
      public Adapter caseTagFile(TagFile object)
      {
        return createTagFileAdapter();
      }
      @Override
      public Adapter caseTaskStatusSheet(TaskStatusSheet object)
      {
        return createTaskStatusSheetAdapter();
      }
      @Override
      public Adapter caseTaskStatusSheetAttribute(TaskStatusSheetAttribute object)
      {
        return createTaskStatusSheetAttributeAdapter();
      }
      @Override
      public Adapter caseTaskTimesheet(TaskTimesheet object)
      {
        return createTaskTimesheetAdapter();
      }
      @Override
      public Adapter caseTaskTimesheetAttribute(TaskTimesheetAttribute object)
      {
        return createTaskTimesheetAttributeAdapter();
      }
      @Override
      public Adapter caseTaskAttributes(TaskAttributes object)
      {
        return createTaskAttributesAdapter();
      }
      @Override
      public Adapter caseTaskPrefix(TaskPrefix object)
      {
        return createTaskPrefixAdapter();
      }
      @Override
      public Adapter caseTaskReport(TaskReport object)
      {
        return createTaskReportAdapter();
      }
      @Override
      public Adapter caseTaskRoot(TaskRoot object)
      {
        return createTaskRootAdapter();
      }
      @Override
      public Adapter caseTextReport(TextReport object)
      {
        return createTextReportAdapter();
      }
      @Override
      public Adapter caseTimeFormat(TimeFormat object)
      {
        return createTimeFormatAdapter();
      }
      @Override
      public Adapter caseTimeoff(Timeoff object)
      {
        return createTimeoffAdapter();
      }
      @Override
      public Adapter caseTimesheet(Timesheet object)
      {
        return createTimesheetAdapter();
      }
      @Override
      public Adapter caseTimesheetAttribute(TimesheetAttribute object)
      {
        return createTimesheetAttributeAdapter();
      }
      @Override
      public Adapter caseTimesheetReport(TimesheetReport object)
      {
        return createTimesheetReportAdapter();
      }
      @Override
      public Adapter caseTimesheetReportAttribute(TimesheetReportAttribute object)
      {
        return createTimesheetReportAttributeAdapter();
      }
      @Override
      public Adapter caseTimezone(Timezone object)
      {
        return createTimezoneAdapter();
      }
      @Override
      public Adapter caseTimingResolution(TimingResolution object)
      {
        return createTimingResolutionAdapter();
      }
      @Override
      public Adapter caseTitle(Title object)
      {
        return createTitleAdapter();
      }
      @Override
      public Adapter caseToolTip(ToolTip object)
      {
        return createToolTipAdapter();
      }
      @Override
      public Adapter caseTrackingScenario(TrackingScenario object)
      {
        return createTrackingScenarioAdapter();
      }
      @Override
      public Adapter caseTreeLevel(TreeLevel object)
      {
        return createTreeLevelAdapter();
      }
      @Override
      public Adapter caseVacation(Vacation object)
      {
        return createVacationAdapter();
      }
      @Override
      public Adapter caseWarn(Warn object)
      {
        return createWarnAdapter();
      }
      @Override
      public Adapter caseWeekStarts(WeekStarts object)
      {
        return createWeekStartsAdapter();
      }
      @Override
      public Adapter caseWeeklyMax(WeeklyMax object)
      {
        return createWeeklyMaxAdapter();
      }
      @Override
      public Adapter caseWeeklyMin(WeeklyMin object)
      {
        return createWeeklyMinAdapter();
      }
      @Override
      public Adapter caseWidth(Width object)
      {
        return createWidthAdapter();
      }
      @Override
      public Adapter caseWork(Work object)
      {
        return createWorkAdapter();
      }
      @Override
      public Adapter caseWorkingHours(WorkingHours object)
      {
        return createWorkingHoursAdapter();
      }
      @Override
      public Adapter caseYearlyWorkingDays(YearlyWorkingDays object)
      {
        return createYearlyWorkingDaysAdapter();
      }
      @Override
      public Adapter caseAccountShare(AccountShare object)
      {
        return createAccountShareAdapter();
      }
      @Override
      public Adapter caseColumnAttribute(ColumnAttribute object)
      {
        return createColumnAttributeAdapter();
      }
      @Override
      public Adapter caseExtendedResourceAttributeColumn(ExtendedResourceAttributeColumn object)
      {
        return createExtendedResourceAttributeColumnAdapter();
      }
      @Override
      public Adapter caseColumn(Column object)
      {
        return createColumnAdapter();
      }
      @Override
      public Adapter caseCriterion(Criterion object)
      {
        return createCriterionAdapter();
      }
      @Override
      public Adapter caseDurationQuantity(DurationQuantity object)
      {
        return createDurationQuantityAdapter();
      }
      @Override
      public Adapter caseLimit(Limit object)
      {
        return createLimitAdapter();
      }
      @Override
      public Adapter caseLimitAttribute(LimitAttribute object)
      {
        return createLimitAttributeAdapter();
      }
      @Override
      public Adapter caseRealFormat(RealFormat object)
      {
        return createRealFormatAdapter();
      }
      @Override
      public Adapter caseTaskDependency(TaskDependency object)
      {
        return createTaskDependencyAdapter();
      }
      @Override
      public Adapter caseRichText(RichText object)
      {
        return createRichTextAdapter();
      }
      @Override
      public Adapter caseWorkHours(WorkHours object)
      {
        return createWorkHoursAdapter();
      }
      @Override
      public Adapter caseWeekdays(Weekdays object)
      {
        return createWeekdaysAdapter();
      }
      @Override
      public Adapter caseISODATE(ISODATE object)
      {
        return createISODATEAdapter();
      }
      @Override
      public Adapter caseExtDate(ExtDate object)
      {
        return createExtDateAdapter();
      }
      @Override
      public Adapter caseDefintions(Defintions object)
      {
        return createDefintionsAdapter();
      }
      @Override
      public Adapter caseLogicalFunctionExpression(LogicalFunctionExpression object)
      {
        return createLogicalFunctionExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalAbsoluteIdExression(LogicalAbsoluteIdExression object)
      {
        return createLogicalAbsoluteIdExressionAdapter();
      }
      @Override
      public Adapter caseLogicalBooleanLiteral(LogicalBooleanLiteral object)
      {
        return createLogicalBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseLogicalNumeralLiteral(LogicalNumeralLiteral object)
      {
        return createLogicalNumeralLiteralAdapter();
      }
      @Override
      public Adapter caseLogicalStringLiteral(LogicalStringLiteral object)
      {
        return createLogicalStringLiteralAdapter();
      }
      @Override
      public Adapter caseLogicalDateLiteral(LogicalDateLiteral object)
      {
        return createLogicalDateLiteralAdapter();
      }
      @Override
      public Adapter caseLogicalFlagExpression(LogicalFlagExpression object)
      {
        return createLogicalFlagExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Global
   * @generated
   */
  public Adapter createGlobalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Leaves <em>Leaves</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Leaves
   * @generated
   */
  public Adapter createLeavesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LeaveDetails <em>Leave Details</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LeaveDetails
   * @generated
   */
  public Adapter createLeaveDetailsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Account <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Account
   * @generated
   */
  public Adapter createAccountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.AccountAttribute <em>Account Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.AccountAttribute
   * @generated
   */
  public Adapter createAccountAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.AccountPrefix <em>Account Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.AccountPrefix
   * @generated
   */
  public Adapter createAccountPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.AccountReport <em>Account Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.AccountReport
   * @generated
   */
  public Adapter createAccountReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.AccountRoot <em>Account Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.AccountRoot
   * @generated
   */
  public Adapter createAccountRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ProjectAttribute <em>Project Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ProjectAttribute
   * @generated
   */
  public Adapter createProjectAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskAttribute <em>Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskAttribute
   * @generated
   */
  public Adapter createTaskAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.MacroCall <em>Macro Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.MacroCall
   * @generated
   */
  public Adapter createMacroCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Report
   * @generated
   */
  public Adapter createReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ReportAttribute <em>Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ReportAttribute
   * @generated
   */
  public Adapter createReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.IcalReport <em>Ical Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.IcalReport
   * @generated
   */
  public Adapter createIcalReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.IcalReportAttribute <em>Ical Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.IcalReportAttribute
   * @generated
   */
  public Adapter createIcalReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Export <em>Export</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Export
   * @generated
   */
  public Adapter createExportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ExportAttribute <em>Export Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ExportAttribute
   * @generated
   */
  public Adapter createExportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ResourceAttribute <em>Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ResourceAttribute
   * @generated
   */
  public Adapter createResourceAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Allocate <em>Allocate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Allocate
   * @generated
   */
  public Adapter createAllocateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.AllocateResource <em>Allocate Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.AllocateResource
   * @generated
   */
  public Adapter createAllocateResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.AllocateResourceAttribute <em>Allocate Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.AllocateResourceAttribute
   * @generated
   */
  public Adapter createAllocateResourceAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Navigator <em>Navigator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Navigator
   * @generated
   */
  public Adapter createNavigatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.NavigatorAttribute <em>Navigator Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.NavigatorAttribute
   * @generated
   */
  public Adapter createNavigatorAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.NewTask <em>New Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.NewTask
   * @generated
   */
  public Adapter createNewTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.NewTaskAttribute <em>New Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.NewTaskAttribute
   * @generated
   */
  public Adapter createNewTaskAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.NikuReport <em>Niku Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.NikuReport
   * @generated
   */
  public Adapter createNikuReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.NikuReportAttribute <em>Niku Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.NikuReportAttribute
   * @generated
   */
  public Adapter createNikuReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Alert <em>Alert</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Alert
   * @generated
   */
  public Adapter createAlertAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Alternative
   * @generated
   */
  public Adapter createAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Author <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Author
   * @generated
   */
  public Adapter createAuthorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Balance <em>Balance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Balance
   * @generated
   */
  public Adapter createBalanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Booking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Booking
   * @generated
   */
  public Adapter createBookingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.BookingTask <em>Booking Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.BookingTask
   * @generated
   */
  public Adapter createBookingTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.BookingResource <em>Booking Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.BookingResource
   * @generated
   */
  public Adapter createBookingResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Caption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Caption
   * @generated
   */
  public Adapter createCaptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.CellColor <em>Cell Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.CellColor
   * @generated
   */
  public Adapter createCellColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.CellText <em>Cell Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.CellText
   * @generated
   */
  public Adapter createCellTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Center <em>Center</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Center
   * @generated
   */
  public Adapter createCenterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Charge <em>Charge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Charge
   * @generated
   */
  public Adapter createChargeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ChargeSet <em>Charge Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ChargeSet
   * @generated
   */
  public Adapter createChargeSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Columns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Columns
   * @generated
   */
  public Adapter createColumnsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Complete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Complete
   * @generated
   */
  public Adapter createCompleteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Copyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Copyright
   * @generated
   */
  public Adapter createCopyrightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Credit <em>Credit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Credit
   * @generated
   */
  public Adapter createCreditAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Currency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Currency
   * @generated
   */
  public Adapter createCurrencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.CurrencyFormat <em>Currency Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.CurrencyFormat
   * @generated
   */
  public Adapter createCurrencyFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.DailyMax <em>Daily Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.DailyMax
   * @generated
   */
  public Adapter createDailyMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.DailyMin <em>Daily Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.DailyMin
   * @generated
   */
  public Adapter createDailyMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.DailyWorkingHours <em>Daily Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.DailyWorkingHours
   * @generated
   */
  public Adapter createDailyWorkingHoursAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Definitions
   * @generated
   */
  public Adapter createDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Depends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Depends
   * @generated
   */
  public Adapter createDependsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Details <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Details
   * @generated
   */
  public Adapter createDetailsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Duration
   * @generated
   */
  public Adapter createDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Efficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Efficiency
   * @generated
   */
  public Adapter createEfficiencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Effort <em>Effort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Effort
   * @generated
   */
  public Adapter createEffortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Email
   * @generated
   */
  public Adapter createEmailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.End <em>End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.End
   * @generated
   */
  public Adapter createEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.EndCredit <em>End Credit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.EndCredit
   * @generated
   */
  public Adapter createEndCreditAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Epilog <em>Epilog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Epilog
   * @generated
   */
  public Adapter createEpilogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Extend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Extend
   * @generated
   */
  public Adapter createExtendAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ExtendResource <em>Extend Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ExtendResource
   * @generated
   */
  public Adapter createExtendResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ExtendedResourceAttribute <em>Extended Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ExtendedResourceAttribute
   * @generated
   */
  public Adapter createExtendedResourceAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ExtendTask <em>Extend Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ExtendTask
   * @generated
   */
  public Adapter createExtendTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ExtendedTaskAttribute <em>Extended Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ExtendedTaskAttribute
   * @generated
   */
  public Adapter createExtendedTaskAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Fail <em>Fail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Fail
   * @generated
   */
  public Adapter createFailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Flags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Flags
   * @generated
   */
  public Adapter createFlagsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.FontColor <em>Font Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.FontColor
   * @generated
   */
  public Adapter createFontColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Footer <em>Footer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Footer
   * @generated
   */
  public Adapter createFooterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Formats <em>Formats</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Formats
   * @generated
   */
  public Adapter createFormatsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.GapDuration <em>Gap Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.GapDuration
   * @generated
   */
  public Adapter createGapDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.GapLength <em>Gap Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.GapLength
   * @generated
   */
  public Adapter createGapLengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.HAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.HAlign
   * @generated
   */
  public Adapter createHAlignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Headline <em>Headline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Headline
   * @generated
   */
  public Adapter createHeadlineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.HideAccount <em>Hide Account</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.HideAccount
   * @generated
   */
  public Adapter createHideAccountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.HideJournalEntry <em>Hide Journal Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.HideJournalEntry
   * @generated
   */
  public Adapter createHideJournalEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.HideReport <em>Hide Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.HideReport
   * @generated
   */
  public Adapter createHideReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.HideResource <em>Hide Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.HideResource
   * @generated
   */
  public Adapter createHideResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.HideTask <em>Hide Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.HideTask
   * @generated
   */
  public Adapter createHideTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.IncludeProperties <em>Include Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.IncludeProperties
   * @generated
   */
  public Adapter createIncludePropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.IncludePropertiesAttribute <em>Include Properties Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.IncludePropertiesAttribute
   * @generated
   */
  public Adapter createIncludePropertiesAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Interval1 <em>Interval1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Interval1
   * @generated
   */
  public Adapter createInterval1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Interval2 <em>Interval2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Interval2
   * @generated
   */
  public Adapter createInterval2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Interval3 <em>Interval3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Interval3
   * @generated
   */
  public Adapter createInterval3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Interval4 <em>Interval4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Interval4
   * @generated
   */
  public Adapter createInterval4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.JournalAttributes <em>Journal Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.JournalAttributes
   * @generated
   */
  public Adapter createJournalAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.JournalEntry <em>Journal Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.JournalEntry
   * @generated
   */
  public Adapter createJournalEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.JournalMode <em>Journal Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.JournalMode
   * @generated
   */
  public Adapter createJournalModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Left <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Left
   * @generated
   */
  public Adapter createLeftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Length <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Length
   * @generated
   */
  public Adapter createLengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Limits <em>Limits</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Limits
   * @generated
   */
  public Adapter createLimitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LimitsAttribute <em>Limits Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LimitsAttribute
   * @generated
   */
  public Adapter createLimitsAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ListItem <em>List Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ListItem
   * @generated
   */
  public Adapter createListItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ListType
   * @generated
   */
  public Adapter createListTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LoadUnit <em>Load Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LoadUnit
   * @generated
   */
  public Adapter createLoadUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LogicalExpression <em>Logical Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LogicalExpression
   * @generated
   */
  public Adapter createLogicalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Macro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Macro
   * @generated
   */
  public Adapter createMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Managers <em>Managers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Managers
   * @generated
   */
  public Adapter createManagersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Mandatory
   * @generated
   */
  public Adapter createMandatoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.MaxEnd <em>Max End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.MaxEnd
   * @generated
   */
  public Adapter createMaxEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Maximum <em>Maximum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Maximum
   * @generated
   */
  public Adapter createMaximumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.MaxStart <em>Max Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.MaxStart
   * @generated
   */
  public Adapter createMaxStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Milestone <em>Milestone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Milestone
   * @generated
   */
  public Adapter createMilestoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Minimum <em>Minimum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Minimum
   * @generated
   */
  public Adapter createMinimumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.MinEnd <em>Min End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.MinEnd
   * @generated
   */
  public Adapter createMinEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.MinStart <em>Min Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.MinStart
   * @generated
   */
  public Adapter createMinStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.MonthlyMax <em>Monthly Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.MonthlyMax
   * @generated
   */
  public Adapter createMonthlyMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.MonthlyMin <em>Monthly Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.MonthlyMin
   * @generated
   */
  public Adapter createMonthlyMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Note
   * @generated
   */
  public Adapter createNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Now <em>Now</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Now
   * @generated
   */
  public Adapter createNowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.NumberFormat <em>Number Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.NumberFormat
   * @generated
   */
  public Adapter createNumberFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Period <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Period
   * @generated
   */
  public Adapter createPeriodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Persistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Persistent
   * @generated
   */
  public Adapter createPersistentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Precedes <em>Precedes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Precedes
   * @generated
   */
  public Adapter createPrecedesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Priority
   * @generated
   */
  public Adapter createPriorityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ProjectId <em>Project Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ProjectId
   * @generated
   */
  public Adapter createProjectIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ProjectIds <em>Project Ids</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ProjectIds
   * @generated
   */
  public Adapter createProjectIdsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Prolog <em>Prolog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Prolog
   * @generated
   */
  public Adapter createPrologAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.PurgeReport <em>Purge Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.PurgeReport
   * @generated
   */
  public Adapter createPurgeReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.PurgeResource <em>Purge Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.PurgeResource
   * @generated
   */
  public Adapter createPurgeResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.PurgeTask <em>Purge Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.PurgeTask
   * @generated
   */
  public Adapter createPurgeTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Rate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Rate
   * @generated
   */
  public Adapter createRateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Remaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Remaining
   * @generated
   */
  public Adapter createRemainingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ReportPrefix <em>Report Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ReportPrefix
   * @generated
   */
  public Adapter createReportPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ResourceAttributes <em>Resource Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ResourceAttributes
   * @generated
   */
  public Adapter createResourceAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ResourcePrefix <em>Resource Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ResourcePrefix
   * @generated
   */
  public Adapter createResourcePrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ResourceReport <em>Resource Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ResourceReport
   * @generated
   */
  public Adapter createResourceReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ResourceRoot <em>Resource Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ResourceRoot
   * @generated
   */
  public Adapter createResourceRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Responsible <em>Responsible</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Responsible
   * @generated
   */
  public Adapter createResponsibleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.RGB
   * @generated
   */
  public Adapter createRGBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Right <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Right
   * @generated
   */
  public Adapter createRightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.RollupAccount <em>Rollup Account</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.RollupAccount
   * @generated
   */
  public Adapter createRollupAccountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.RollupResource <em>Rollup Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.RollupResource
   * @generated
   */
  public Adapter createRollupResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.RollupTask <em>Rollup Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.RollupTask
   * @generated
   */
  public Adapter createRollupTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Scale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Scale
   * @generated
   */
  public Adapter createScaleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ScenarioIcal <em>Scenario Ical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ScenarioIcal
   * @generated
   */
  public Adapter createScenarioIcalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Scenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Scenarios
   * @generated
   */
  public Adapter createScenariosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Scheduled <em>Scheduled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Scheduled
   * @generated
   */
  public Adapter createScheduledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Scheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Scheduling
   * @generated
   */
  public Adapter createSchedulingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SelfContained <em>Self Contained</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SelfContained
   * @generated
   */
  public Adapter createSelfContainedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Shift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Shift
   * @generated
   */
  public Adapter createShiftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ShiftTimesheet <em>Shift Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ShiftTimesheet
   * @generated
   */
  public Adapter createShiftTimesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Shifts <em>Shifts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Shifts
   * @generated
   */
  public Adapter createShiftsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ShiftsLimit <em>Shifts Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ShiftsLimit
   * @generated
   */
  public Adapter createShiftsLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ShiftsAllocate <em>Shifts Allocate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ShiftsAllocate
   * @generated
   */
  public Adapter createShiftsAllocateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ShiftsResource <em>Shifts Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ShiftsResource
   * @generated
   */
  public Adapter createShiftsResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ShiftsTask <em>Shifts Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ShiftsTask
   * @generated
   */
  public Adapter createShiftsTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ShortTimeFormat <em>Short Time Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ShortTimeFormat
   * @generated
   */
  public Adapter createShortTimeFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Sort
   * @generated
   */
  public Adapter createSortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SortAccounts <em>Sort Accounts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SortAccounts
   * @generated
   */
  public Adapter createSortAccountsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SortJournalEntries <em>Sort Journal Entries</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SortJournalEntries
   * @generated
   */
  public Adapter createSortJournalEntriesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SortResources <em>Sort Resources</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SortResources
   * @generated
   */
  public Adapter createSortResourcesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SortTasks <em>Sort Tasks</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SortTasks
   * @generated
   */
  public Adapter createSortTasksAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Start
   * @generated
   */
  public Adapter createStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.StatusStatusSheet <em>Status Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.StatusStatusSheet
   * @generated
   */
  public Adapter createStatusStatusSheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.StatusStatusSheetAttribute <em>Status Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.StatusStatusSheetAttribute
   * @generated
   */
  public Adapter createStatusStatusSheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.StatusTimesheet <em>Status Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.StatusTimesheet
   * @generated
   */
  public Adapter createStatusTimesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.StatusTimesheetAttribute <em>Status Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.StatusTimesheetAttribute
   * @generated
   */
  public Adapter createStatusTimesheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.StatusSheet <em>Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.StatusSheet
   * @generated
   */
  public Adapter createStatusSheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.StatusSheetAttribute <em>Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.StatusSheetAttribute
   * @generated
   */
  public Adapter createStatusSheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.StatusSheetReport <em>Status Sheet Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.StatusSheetReport
   * @generated
   */
  public Adapter createStatusSheetReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.StatusSheetReportAttribute <em>Status Sheet Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.StatusSheetReportAttribute
   * @generated
   */
  public Adapter createStatusSheetReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Summary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Summary
   * @generated
   */
  public Adapter createSummaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SupplementAccount <em>Supplement Account</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SupplementAccount
   * @generated
   */
  public Adapter createSupplementAccountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SupplementReport <em>Supplement Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SupplementReport
   * @generated
   */
  public Adapter createSupplementReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SupplementResource <em>Supplement Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SupplementResource
   * @generated
   */
  public Adapter createSupplementResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.SupplementTask <em>Supplement Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.SupplementTask
   * @generated
   */
  public Adapter createSupplementTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TagFile <em>Tag File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TagFile
   * @generated
   */
  public Adapter createTagFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskStatusSheet <em>Task Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskStatusSheet
   * @generated
   */
  public Adapter createTaskStatusSheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskStatusSheetAttribute <em>Task Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskStatusSheetAttribute
   * @generated
   */
  public Adapter createTaskStatusSheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskTimesheet <em>Task Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskTimesheet
   * @generated
   */
  public Adapter createTaskTimesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskTimesheetAttribute <em>Task Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskTimesheetAttribute
   * @generated
   */
  public Adapter createTaskTimesheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskAttributes <em>Task Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskAttributes
   * @generated
   */
  public Adapter createTaskAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskPrefix <em>Task Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskPrefix
   * @generated
   */
  public Adapter createTaskPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskReport <em>Task Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskReport
   * @generated
   */
  public Adapter createTaskReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskRoot <em>Task Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskRoot
   * @generated
   */
  public Adapter createTaskRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TextReport <em>Text Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TextReport
   * @generated
   */
  public Adapter createTextReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TimeFormat <em>Time Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TimeFormat
   * @generated
   */
  public Adapter createTimeFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Timeoff <em>Timeoff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Timeoff
   * @generated
   */
  public Adapter createTimeoffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Timesheet <em>Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Timesheet
   * @generated
   */
  public Adapter createTimesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TimesheetAttribute <em>Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TimesheetAttribute
   * @generated
   */
  public Adapter createTimesheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TimesheetReport <em>Timesheet Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TimesheetReport
   * @generated
   */
  public Adapter createTimesheetReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TimesheetReportAttribute <em>Timesheet Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TimesheetReportAttribute
   * @generated
   */
  public Adapter createTimesheetReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Timezone <em>Timezone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Timezone
   * @generated
   */
  public Adapter createTimezoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TimingResolution <em>Timing Resolution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TimingResolution
   * @generated
   */
  public Adapter createTimingResolutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Title
   * @generated
   */
  public Adapter createTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ToolTip <em>Tool Tip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ToolTip
   * @generated
   */
  public Adapter createToolTipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TrackingScenario <em>Tracking Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TrackingScenario
   * @generated
   */
  public Adapter createTrackingScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TreeLevel <em>Tree Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TreeLevel
   * @generated
   */
  public Adapter createTreeLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Vacation <em>Vacation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Vacation
   * @generated
   */
  public Adapter createVacationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Warn <em>Warn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Warn
   * @generated
   */
  public Adapter createWarnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.WeekStarts <em>Week Starts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.WeekStarts
   * @generated
   */
  public Adapter createWeekStartsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.WeeklyMax <em>Weekly Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.WeeklyMax
   * @generated
   */
  public Adapter createWeeklyMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.WeeklyMin <em>Weekly Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.WeeklyMin
   * @generated
   */
  public Adapter createWeeklyMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Width <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Width
   * @generated
   */
  public Adapter createWidthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Work <em>Work</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Work
   * @generated
   */
  public Adapter createWorkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.WorkingHours <em>Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.WorkingHours
   * @generated
   */
  public Adapter createWorkingHoursAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.YearlyWorkingDays <em>Yearly Working Days</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.YearlyWorkingDays
   * @generated
   */
  public Adapter createYearlyWorkingDaysAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.AccountShare <em>Account Share</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.AccountShare
   * @generated
   */
  public Adapter createAccountShareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ColumnAttribute <em>Column Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ColumnAttribute
   * @generated
   */
  public Adapter createColumnAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ExtendedResourceAttributeColumn <em>Extended Resource Attribute Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ExtendedResourceAttributeColumn
   * @generated
   */
  public Adapter createExtendedResourceAttributeColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Column
   * @generated
   */
  public Adapter createColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Criterion <em>Criterion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Criterion
   * @generated
   */
  public Adapter createCriterionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.DurationQuantity <em>Duration Quantity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.DurationQuantity
   * @generated
   */
  public Adapter createDurationQuantityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Limit
   * @generated
   */
  public Adapter createLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LimitAttribute <em>Limit Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LimitAttribute
   * @generated
   */
  public Adapter createLimitAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.RealFormat <em>Real Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.RealFormat
   * @generated
   */
  public Adapter createRealFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.TaskDependency <em>Task Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.TaskDependency
   * @generated
   */
  public Adapter createTaskDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.RichText <em>Rich Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.RichText
   * @generated
   */
  public Adapter createRichTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.WorkHours <em>Work Hours</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.WorkHours
   * @generated
   */
  public Adapter createWorkHoursAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Weekdays <em>Weekdays</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Weekdays
   * @generated
   */
  public Adapter createWeekdaysAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ISODATE <em>ISODATE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ISODATE
   * @generated
   */
  public Adapter createISODATEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.ExtDate <em>Ext Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.ExtDate
   * @generated
   */
  public Adapter createExtDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.Defintions <em>Defintions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.Defintions
   * @generated
   */
  public Adapter createDefintionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LogicalFunctionExpression <em>Logical Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LogicalFunctionExpression
   * @generated
   */
  public Adapter createLogicalFunctionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LogicalAbsoluteIdExression <em>Logical Absolute Id Exression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LogicalAbsoluteIdExression
   * @generated
   */
  public Adapter createLogicalAbsoluteIdExressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LogicalBooleanLiteral <em>Logical Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LogicalBooleanLiteral
   * @generated
   */
  public Adapter createLogicalBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LogicalNumeralLiteral <em>Logical Numeral Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LogicalNumeralLiteral
   * @generated
   */
  public Adapter createLogicalNumeralLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LogicalStringLiteral <em>Logical String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LogicalStringLiteral
   * @generated
   */
  public Adapter createLogicalStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LogicalDateLiteral <em>Logical Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LogicalDateLiteral
   * @generated
   */
  public Adapter createLogicalDateLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sos.etj.eTJ.LogicalFlagExpression <em>Logical Flag Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sos.etj.eTJ.LogicalFlagExpression
   * @generated
   */
  public Adapter createLogicalFlagExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ETJAdapterFactory
