/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate#getPerson <em>Person</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPersonPredicate()
 * @model
 * @generated
 */
public interface PersonPredicate extends Predicate {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPersonPredicate_Person()
	 * @model
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' attribute.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity
	 * @see #setActivity(Activity)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPersonPredicate_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate#getActivity <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' attribute.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // PersonPredicate
