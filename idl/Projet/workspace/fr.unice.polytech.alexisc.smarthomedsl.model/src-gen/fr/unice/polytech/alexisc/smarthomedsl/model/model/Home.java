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
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getTime <em>Time</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getActivities <em>Activities</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getHome()
 * @model
 * @generated
 */
public interface Home extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getHome_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getHome_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getHome_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

} // Home
