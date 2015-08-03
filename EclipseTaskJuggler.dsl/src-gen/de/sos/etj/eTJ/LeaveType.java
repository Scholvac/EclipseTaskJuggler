/**
 */
package de.sos.etj.eTJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Leave Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.sos.etj.eTJ.ETJPackage#getLeaveType()
 * @model
 * @generated
 */
public enum LeaveType implements Enumerator
{
  /**
   * The '<em><b>Project</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROJECT_VALUE
   * @generated
   * @ordered
   */
  PROJECT(0, "project", "project"),

  /**
   * The '<em><b>Annual</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANNUAL_VALUE
   * @generated
   * @ordered
   */
  ANNUAL(1, "annual", "annual"),

  /**
   * The '<em><b>Special</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPECIAL_VALUE
   * @generated
   * @ordered
   */
  SPECIAL(2, "special", "special"),

  /**
   * The '<em><b>Sick</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SICK_VALUE
   * @generated
   * @ordered
   */
  SICK(3, "sick", "sick"),

  /**
   * The '<em><b>Unpaid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNPAID_VALUE
   * @generated
   * @ordered
   */
  UNPAID(4, "unpaid", "unpaid"),

  /**
   * The '<em><b>Holiday</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOLIDAY_VALUE
   * @generated
   * @ordered
   */
  HOLIDAY(5, "holiday", "holiday"),

  /**
   * The '<em><b>Unemployed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNEMPLOYED_VALUE
   * @generated
   * @ordered
   */
  UNEMPLOYED(6, "unemployed", "unemployed");

  /**
   * The '<em><b>Project</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Project</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROJECT
   * @model name="project"
   * @generated
   * @ordered
   */
  public static final int PROJECT_VALUE = 0;

  /**
   * The '<em><b>Annual</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Annual</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANNUAL
   * @model name="annual"
   * @generated
   * @ordered
   */
  public static final int ANNUAL_VALUE = 1;

  /**
   * The '<em><b>Special</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Special</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SPECIAL
   * @model name="special"
   * @generated
   * @ordered
   */
  public static final int SPECIAL_VALUE = 2;

  /**
   * The '<em><b>Sick</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sick</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SICK
   * @model name="sick"
   * @generated
   * @ordered
   */
  public static final int SICK_VALUE = 3;

  /**
   * The '<em><b>Unpaid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unpaid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNPAID
   * @model name="unpaid"
   * @generated
   * @ordered
   */
  public static final int UNPAID_VALUE = 4;

  /**
   * The '<em><b>Holiday</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Holiday</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HOLIDAY
   * @model name="holiday"
   * @generated
   * @ordered
   */
  public static final int HOLIDAY_VALUE = 5;

  /**
   * The '<em><b>Unemployed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unemployed</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNEMPLOYED
   * @model name="unemployed"
   * @generated
   * @ordered
   */
  public static final int UNEMPLOYED_VALUE = 6;

  /**
   * An array of all the '<em><b>Leave Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LeaveType[] VALUES_ARRAY =
    new LeaveType[]
    {
      PROJECT,
      ANNUAL,
      SPECIAL,
      SICK,
      UNPAID,
      HOLIDAY,
      UNEMPLOYED,
    };

  /**
   * A public read-only list of all the '<em><b>Leave Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LeaveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Leave Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LeaveType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LeaveType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Leave Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LeaveType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LeaveType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Leave Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LeaveType get(int value)
  {
    switch (value)
    {
      case PROJECT_VALUE: return PROJECT;
      case ANNUAL_VALUE: return ANNUAL;
      case SPECIAL_VALUE: return SPECIAL;
      case SICK_VALUE: return SICK;
      case UNPAID_VALUE: return UNPAID;
      case HOLIDAY_VALUE: return HOLIDAY;
      case UNEMPLOYED_VALUE: return UNEMPLOYED;
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
  private LeaveType(int value, String name, String literal)
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
  
} //LeaveType
