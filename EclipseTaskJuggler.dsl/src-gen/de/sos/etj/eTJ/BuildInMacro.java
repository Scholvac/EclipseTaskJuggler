/**
 */
package de.sos.etj.eTJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Build In Macro</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.sos.etj.eTJ.ETJPackage#getBuildInMacro()
 * @model
 * @generated
 */
public enum BuildInMacro implements Enumerator
{
  /**
   * The '<em><b>Projectstart</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROJECTSTART_VALUE
   * @generated
   * @ordered
   */
  PROJECTSTART(0, "projectstart", "projectstart"),

  /**
   * The '<em><b>Projectend</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROJECTEND_VALUE
   * @generated
   * @ordered
   */
  PROJECTEND(1, "projectend", "projectend"),

  /**
   * The '<em><b>Now</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOW_VALUE
   * @generated
   * @ordered
   */
  NOW(2, "now", "now");

  /**
   * The '<em><b>Projectstart</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Projectstart</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROJECTSTART
   * @model name="projectstart"
   * @generated
   * @ordered
   */
  public static final int PROJECTSTART_VALUE = 0;

  /**
   * The '<em><b>Projectend</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Projectend</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROJECTEND
   * @model name="projectend"
   * @generated
   * @ordered
   */
  public static final int PROJECTEND_VALUE = 1;

  /**
   * The '<em><b>Now</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Now</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOW
   * @model name="now"
   * @generated
   * @ordered
   */
  public static final int NOW_VALUE = 2;

  /**
   * An array of all the '<em><b>Build In Macro</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BuildInMacro[] VALUES_ARRAY =
    new BuildInMacro[]
    {
      PROJECTSTART,
      PROJECTEND,
      NOW,
    };

  /**
   * A public read-only list of all the '<em><b>Build In Macro</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BuildInMacro> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Build In Macro</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BuildInMacro get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuildInMacro result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Build In Macro</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BuildInMacro getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuildInMacro result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Build In Macro</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BuildInMacro get(int value)
  {
    switch (value)
    {
      case PROJECTSTART_VALUE: return PROJECTSTART;
      case PROJECTEND_VALUE: return PROJECTEND;
      case NOW_VALUE: return NOW;
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
  private BuildInMacro(int value, String name, String literal)
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
  
} //BuildInMacro
