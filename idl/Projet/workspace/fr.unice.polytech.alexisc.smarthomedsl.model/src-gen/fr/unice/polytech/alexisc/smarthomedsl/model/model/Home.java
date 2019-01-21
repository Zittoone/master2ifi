/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model;

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
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getHome()
 * @model
 * @generated
 */
public interface Home extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getHome_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

} // Home
