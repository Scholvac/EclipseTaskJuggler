/**
 */
package de.sos.etj.eTJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sos.etj.eTJ.JournalEntry#getDate <em>Date</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.JournalEntry#getHeadline <em>Headline</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.JournalEntry#getAlert <em>Alert</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.JournalEntry#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.JournalEntry#getDetails <em>Details</em>}</li>
 *   <li>{@link de.sos.etj.eTJ.JournalEntry#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @see de.sos.etj.eTJ.ETJPackage#getJournalEntry()
 * @model
 * @generated
 */
public interface JournalEntry extends ProjectAttribute, ResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' containment reference.
   * @see #setDate(ISODATE)
   * @see de.sos.etj.eTJ.ETJPackage#getJournalEntry_Date()
   * @model containment="true"
   * @generated
   */
  ISODATE getDate();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.JournalEntry#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(ISODATE value);

  /**
   * Returns the value of the '<em><b>Headline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Headline</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headline</em>' attribute.
   * @see #setHeadline(String)
   * @see de.sos.etj.eTJ.ETJPackage#getJournalEntry_Headline()
   * @model
   * @generated
   */
  String getHeadline();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.JournalEntry#getHeadline <em>Headline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Headline</em>' attribute.
   * @see #getHeadline()
   * @generated
   */
  void setHeadline(String value);

  /**
   * Returns the value of the '<em><b>Alert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alert</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alert</em>' containment reference.
   * @see #setAlert(Alert)
   * @see de.sos.etj.eTJ.ETJPackage#getJournalEntry_Alert()
   * @model containment="true"
   * @generated
   */
  Alert getAlert();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.JournalEntry#getAlert <em>Alert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alert</em>' containment reference.
   * @see #getAlert()
   * @generated
   */
  void setAlert(Alert value);

  /**
   * Returns the value of the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' containment reference.
   * @see #setAuthor(Author)
   * @see de.sos.etj.eTJ.ETJPackage#getJournalEntry_Author()
   * @model containment="true"
   * @generated
   */
  Author getAuthor();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.JournalEntry#getAuthor <em>Author</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' containment reference.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(Author value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' containment reference.
   * @see #setDetails(Details)
   * @see de.sos.etj.eTJ.ETJPackage#getJournalEntry_Details()
   * @model containment="true"
   * @generated
   */
  Details getDetails();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.JournalEntry#getDetails <em>Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' containment reference.
   * @see #getDetails()
   * @generated
   */
  void setDetails(Details value);

  /**
   * Returns the value of the '<em><b>Summary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' containment reference.
   * @see #setSummary(Summary)
   * @see de.sos.etj.eTJ.ETJPackage#getJournalEntry_Summary()
   * @model containment="true"
   * @generated
   */
  Summary getSummary();

  /**
   * Sets the value of the '{@link de.sos.etj.eTJ.JournalEntry#getSummary <em>Summary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary</em>' containment reference.
   * @see #getSummary()
   * @generated
   */
  void setSummary(Summary value);

} // JournalEntry
