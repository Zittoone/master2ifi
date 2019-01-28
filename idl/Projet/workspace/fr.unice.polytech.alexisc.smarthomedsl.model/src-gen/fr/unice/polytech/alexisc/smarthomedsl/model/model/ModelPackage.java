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
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__TIME = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ACTIVITIES = 1;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ROOMS = 2;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VALUE = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__LOCATION = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.AnalogSensorImpl <em>Analog Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.AnalogSensorImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getAnalogSensor()
	 * @generated
	 */
	int ANALOG_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR__VALUE = SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR__LOCATION = SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR__TYPE = SENSOR__TYPE;

	/**
	 * The number of structural features of the '<em>Analog Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Analog Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.DigitalSensorImpl <em>Digital Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.DigitalSensorImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getDigitalSensor()
	 * @generated
	 */
	int DIGITAL_SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR__VALUE = SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR__LOCATION = SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR__TYPE = SENSOR__TYPE;

	/**
	 * The number of structural features of the '<em>Digital Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Digital Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PredicateImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 5;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ActivityImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ActionImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RoomImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SENSORS = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getTime()
	 * @see #getHome()
	 * @generated
	 */
	EAttribute getHome_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getActivities()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getRooms()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Rooms();

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
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor#getValue()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Value();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor#getLocation()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Location();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.AnalogSensor <em>Analog Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Sensor</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.AnalogSensor
	 * @generated
	 */
	EClass getAnalogSensor();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.DigitalSensor <em>Digital Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Sensor</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.DigitalSensor
	 * @generated
	 */
	EClass getDigitalSensor();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate#getSensor()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate#getValue()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Value();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity#getActions()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Actions();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Room#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Room#getSensors()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Sensors();

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
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME__TIME = eINSTANCE.getHome_Time();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__ACTIVITIES = eINSTANCE.getHome_Activities();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__ROOMS = eINSTANCE.getHome_Rooms();

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

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__VALUE = eINSTANCE.getSensor_Value();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__LOCATION = eINSTANCE.getSensor_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.AnalogSensorImpl <em>Analog Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.AnalogSensorImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getAnalogSensor()
		 * @generated
		 */
		EClass ANALOG_SENSOR = eINSTANCE.getAnalogSensor();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.DigitalSensorImpl <em>Digital Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.DigitalSensorImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getDigitalSensor()
		 * @generated
		 */
		EClass DIGITAL_SENSOR = eINSTANCE.getDigitalSensor();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PredicateImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__SENSOR = eINSTANCE.getPredicate_Sensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__VALUE = eINSTANCE.getPredicate_Value();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ActivityImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ACTIONS = eINSTANCE.getActivity_Actions();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ActionImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RoomImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SENSORS = eINSTANCE.getRoom_Sensors();

	}

} //ModelPackage
