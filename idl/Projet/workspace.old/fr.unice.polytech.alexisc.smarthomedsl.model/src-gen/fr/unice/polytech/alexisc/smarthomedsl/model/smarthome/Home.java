/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.smarthome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.smarthome.Home#getPlaces <em>Places</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.smarthome.Home#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.smarthome.SmarthomePackage#getHome()
 * @model
 * @generated
 */
public interface Home extends EObject {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.polytech.alexisc.smarthomedsl.model.smarthome.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.smarthome.SmarthomePackage#getHome_Places()
	 * @model
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.polytech.alexisc.smarthomedsl.model.smarthome.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' reference list.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.smarthome.SmarthomePackage#getHome_Scenarios()
	 * @model
	 * @generated
	 */
	EList<Scenario> getScenarios();

} // Home
