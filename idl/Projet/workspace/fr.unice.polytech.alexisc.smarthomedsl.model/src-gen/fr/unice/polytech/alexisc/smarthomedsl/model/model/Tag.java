/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getX <em>X</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getY <em>Y</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' reference.
	 * @see #setX(Sensor)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getTag_X()
	 * @model
	 * @generated
	 */
	Sensor getX();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getX <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Sensor value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' reference.
	 * @see #setY(Sensor)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getTag_Y()
	 * @model
	 * @generated
	 */
	Sensor getY();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getY <em>Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(Sensor value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' reference.
	 * @see #setZ(Sensor)
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage#getTag_Z()
	 * @model
	 * @generated
	 */
	Sensor getZ();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getZ <em>Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(Sensor value);

} // Tag
