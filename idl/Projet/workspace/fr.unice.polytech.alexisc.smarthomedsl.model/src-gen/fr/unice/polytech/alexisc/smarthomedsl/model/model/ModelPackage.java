/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.alexiscouvreur.fr/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.HomeImpl <em>Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.HomeImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getHome()
	 * @generated
	 */
	int HOME = 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__SENSORS = 0;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.NamedEntityImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Home
	 * @generated
	 */
	EClass getHome();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getSensors()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Sensors();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.HomeImpl <em>Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.HomeImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getHome()
		 * @generated
		 */
		EClass HOME = eINSTANCE.getHome();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__SENSORS = eINSTANCE.getHome_Sensors();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.NamedEntityImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

	}

} //ModelPackage
