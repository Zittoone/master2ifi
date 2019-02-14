/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getBelt <em>Belt</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getLeftAnkle <em>Left Ankle</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getRightAnkle <em>Right Ankle</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getChest <em>Chest</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Belt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belt</em>' containment reference.
	 * @see #setBelt(Tag)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPerson_Belt()
	 * @model containment="true"
	 * @generated
	 */
	Tag getBelt();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getBelt <em>Belt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belt</em>' containment reference.
	 * @see #getBelt()
	 * @generated
	 */
	void setBelt(Tag value);

	/**
	 * Returns the value of the '<em><b>Left Ankle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Ankle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Ankle</em>' containment reference.
	 * @see #setLeftAnkle(Tag)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPerson_LeftAnkle()
	 * @model containment="true"
	 * @generated
	 */
	Tag getLeftAnkle();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getLeftAnkle <em>Left Ankle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Ankle</em>' containment reference.
	 * @see #getLeftAnkle()
	 * @generated
	 */
	void setLeftAnkle(Tag value);

	/**
	 * Returns the value of the '<em><b>Right Ankle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Ankle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Ankle</em>' containment reference.
	 * @see #setRightAnkle(Tag)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPerson_RightAnkle()
	 * @model containment="true"
	 * @generated
	 */
	Tag getRightAnkle();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getRightAnkle <em>Right Ankle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ankle</em>' containment reference.
	 * @see #getRightAnkle()
	 * @generated
	 */
	void setRightAnkle(Tag value);

	/**
	 * Returns the value of the '<em><b>Chest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chest</em>' containment reference.
	 * @see #setChest(Tag)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPerson_Chest()
	 * @model containment="true"
	 * @generated
	 */
	Tag getChest();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getChest <em>Chest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chest</em>' containment reference.
	 * @see #getChest()
	 * @generated
	 */
	void setChest(Tag value);

} // Person
