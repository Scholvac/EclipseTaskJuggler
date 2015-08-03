/**
 */
package de.sos.etj.eTJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Journal Attribute Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.sos.etj.eTJ.ETJPackage#getJournalAttributeValues()
 * @model
 * @generated
 */
public enum JournalAttributeValues implements Enumerator
{
  /**
   * The '<em><b>ALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_VALUE
   * @generated
   * @ordered
   */
  ALL(0, "ALL", "*"),

  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(1, "NONE", "-"),

  /**
   * The '<em><b>Alert</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALERT_VALUE
   * @generated
   * @ordered
   */
  ALERT(2, "alert", "alert"),

  /**
   * The '<em><b>Author</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUTHOR_VALUE
   * @generated
   * @ordered
   */
  AUTHOR(3, "author", "author"),

  /**
   * The '<em><b>Date</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(4, "date", "date"),

  /**
   * The '<em><b>Details</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DETAILS_VALUE
   * @generated
   * @ordered
   */
  DETAILS(5, "details", "details"),

  /**
   * The '<em><b>Flags</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLAGS_VALUE
   * @generated
   * @ordered
   */
  FLAGS(6, "flags", "flags"),

  /**
   * The '<em><b>Headline</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HEADLINE_VALUE
   * @generated
   * @ordered
   */
  HEADLINE(7, "headline", "headline"),

  /**
   * The '<em><b>Property</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROPERTY_VALUE
   * @generated
   * @ordered
   */
  PROPERTY(8, "property", "property"),

  /**
   * The '<em><b>Propertyid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROPERTYID_VALUE
   * @generated
   * @ordered
   */
  PROPERTYID(9, "propertyid", "propertyid"),

  /**
   * The '<em><b>Summary</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUMMARY_VALUE
   * @generated
   * @ordered
   */
  SUMMARY(10, "summary", "summary"),

  /**
   * The '<em><b>Timesheet</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIMESHEET_VALUE
   * @generated
   * @ordered
   */
  TIMESHEET(11, "timesheet", "timesheet");

  /**
   * The '<em><b>ALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL
   * @model literal="*"
   * @generated
   * @ordered
   */
  public static final int ALL_VALUE = 0;

  /**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model literal="-"
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 1;

  /**
   * The '<em><b>Alert</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Alert</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALERT
   * @model name="alert"
   * @generated
   * @ordered
   */
  public static final int ALERT_VALUE = 2;

  /**
   * The '<em><b>Author</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Author</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUTHOR
   * @model name="author"
   * @generated
   * @ordered
   */
  public static final int AUTHOR_VALUE = 3;

  /**
   * The '<em><b>Date</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model name="date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 4;

  /**
   * The '<em><b>Details</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Details</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DETAILS
   * @model name="details"
   * @generated
   * @ordered
   */
  public static final int DETAILS_VALUE = 5;

  /**
   * The '<em><b>Flags</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Flags</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLAGS
   * @model name="flags"
   * @generated
   * @ordered
   */
  public static final int FLAGS_VALUE = 6;

  /**
   * The '<em><b>Headline</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Headline</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HEADLINE
   * @model name="headline"
   * @generated
   * @ordered
   */
  public static final int HEADLINE_VALUE = 7;

  /**
   * The '<em><b>Property</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Property</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROPERTY
   * @model name="property"
   * @generated
   * @ordered
   */
  public static final int PROPERTY_VALUE = 8;

  /**
   * The '<em><b>Propertyid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Propertyid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROPERTYID
   * @model name="propertyid"
   * @generated
   * @ordered
   */
  public static final int PROPERTYID_VALUE = 9;

  /**
   * The '<em><b>Summary</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Summary</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUMMARY
   * @model name="summary"
   * @generated
   * @ordered
   */
  public static final int SUMMARY_VALUE = 10;

  /**
   * The '<em><b>Timesheet</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Timesheet</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIMESHEET
   * @model name="timesheet"
   * @generated
   * @ordered
   */
  public static final int TIMESHEET_VALUE = 11;

  /**
   * An array of all the '<em><b>Journal Attribute Values</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final JournalAttributeValues[] VALUES_ARRAY =
    new JournalAttributeValues[]
    {
      ALL,
      NONE,
      ALERT,
      AUTHOR,
      DATE,
      DETAILS,
      FLAGS,
      HEADLINE,
      PROPERTY,
      PROPERTYID,
      SUMMARY,
      TIMESHEET,
    };

  /**
   * A public read-only list of all the '<em><b>Journal Attribute Values</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<JournalAttributeValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Journal Attribute Values</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JournalAttributeValues get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JournalAttributeValues result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Journal Attribute Values</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JournalAttributeValues getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JournalAttributeValues result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Journal Attribute Values</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JournalAttributeValues get(int value)
  {
    switch (value)
    {
      case ALL_VALUE: return ALL;
      case NONE_VALUE: return NONE;
      case ALERT_VALUE: return ALERT;
      case AUTHOR_VALUE: return AUTHOR;
      case DATE_VALUE: return DATE;
      case DETAILS_VALUE: return DETAILS;
      case FLAGS_VALUE: return FLAGS;
      case HEADLINE_VALUE: return HEADLINE;
      case PROPERTY_VALUE: return PROPERTY;
      case PROPERTYID_VALUE: return PROPERTYID;
      case SUMMARY_VALUE: return SUMMARY;
      case TIMESHEET_VALUE: return TIMESHEET;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private JournalAttributeValues(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //JournalAttributeValues
