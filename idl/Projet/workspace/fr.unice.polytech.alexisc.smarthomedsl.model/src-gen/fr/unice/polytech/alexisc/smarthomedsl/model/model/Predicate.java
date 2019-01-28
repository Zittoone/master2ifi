/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate#getSensor <em>Sensor</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPredicate_Sensor()
	 * @model
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getPredicate_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Predicate
