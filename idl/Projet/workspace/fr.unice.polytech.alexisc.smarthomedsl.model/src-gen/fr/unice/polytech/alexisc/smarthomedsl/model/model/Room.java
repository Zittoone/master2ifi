/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Room#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends NamedEntity {
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
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getRoom_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

} // Room
