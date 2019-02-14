/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__PERSONS = 3;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = 4;

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
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.StaticSensorImpl <em>Static Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.StaticSensorImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getStaticSensor()
	 * @generated
	 */
	int STATIC_SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SENSOR__VALUE = SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SENSOR__LOCATION = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SENSOR__TYPE = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Static Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

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
	int ANALOG_SENSOR__NAME = STATIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR__VALUE = STATIC_SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR__LOCATION = STATIC_SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR__TYPE = STATIC_SENSOR__TYPE;

	/**
	 * The number of structural features of the '<em>Analog Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR_FEATURE_COUNT = STATIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Analog Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SENSOR_OPERATION_COUNT = STATIC_SENSOR_OPERATION_COUNT + 0;

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
	int DIGITAL_SENSOR__NAME = STATIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR__VALUE = STATIC_SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR__LOCATION = STATIC_SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR__TYPE = STATIC_SENSOR__TYPE;

	/**
	 * The number of structural features of the '<em>Digital Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR_FEATURE_COUNT = STATIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Digital Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR_OPERATION_COUNT = STATIC_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RuleImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PREDICATE = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PatternImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PREDICATES = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RoomImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 7;

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
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorCSVImpl <em>Sensor CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorCSVImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getSensorCSV()
	 * @generated
	 */
	int SENSOR_CSV = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CSV__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CSV__VALUE = SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CSV__FILE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CSV_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_CSV_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Belt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BELT = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Ankle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LEFT_ANKLE = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Ankle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RIGHT_ANKLE = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Chest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CHEST = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.TagImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__Z = 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.OperandImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 11;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.DurationImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__PRECISION = 1;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 16;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonPredicateImpl <em>Person Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonPredicateImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPersonPredicate()
	 * @generated
	 */
	int PERSON_PREDICATE = 14;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PREDICATE__PERSON = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PREDICATE__ACTIVITY = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PREDICATE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Person Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PREDICATE_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorPredicateImpl <em>Sensor Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorPredicateImpl
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getSensorPredicate()
	 * @generated
	 */
	int SENSOR_PREDICATE = 15;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_PREDICATE__SENSOR = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_PREDICATE__OPERATOR = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_PREDICATE__VALUE = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_PREDICATE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_PREDICATE_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Precision <em>Precision</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Precision
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPrecision()
	 * @generated
	 */
	int PRECISION = 17;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Operator
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 18;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity <em>Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 19;


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
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Home#getPersons()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Persons();

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
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Rule#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Rule#getDuration()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Duration();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Rule#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicate</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Rule#getPredicate()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Predicate();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Pattern#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Pattern#getPredicates()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Predicates();

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
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorCSV <em>Sensor CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor CSV</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorCSV
	 * @generated
	 */
	EClass getSensorCSV();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorCSV#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorCSV#getFile()
	 * @see #getSensorCSV()
	 * @generated
	 */
	EAttribute getSensorCSV_File();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getBelt <em>Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Belt</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getBelt()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Belt();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getLeftAnkle <em>Left Ankle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Ankle</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getLeftAnkle()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_LeftAnkle();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getRightAnkle <em>Right Ankle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Ankle</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getRightAnkle()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_RightAnkle();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getChest <em>Chest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chest</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Person#getChest()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Chest();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getX()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_X();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Y</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getY()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Y();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Z</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag#getZ()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Z();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Duration#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Duration#getDuration()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Duration();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Duration#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Duration#getPrecision()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Precision();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.StaticSensor <em>Static Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Sensor</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.StaticSensor
	 * @generated
	 */
	EClass getStaticSensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.StaticSensor#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.StaticSensor#getLocation()
	 * @see #getStaticSensor()
	 * @generated
	 */
	EAttribute getStaticSensor_Location();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.StaticSensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.StaticSensor#getType()
	 * @see #getStaticSensor()
	 * @generated
	 */
	EAttribute getStaticSensor_Type();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate <em>Person Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Predicate</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate
	 * @generated
	 */
	EClass getPersonPredicate();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate#getPerson()
	 * @see #getPersonPredicate()
	 * @generated
	 */
	EReference getPersonPredicate_Person();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate#getActivity()
	 * @see #getPersonPredicate()
	 * @generated
	 */
	EAttribute getPersonPredicate_Activity();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorPredicate <em>Sensor Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Predicate</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorPredicate
	 * @generated
	 */
	EClass getSensorPredicate();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorPredicate#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorPredicate#getSensor()
	 * @see #getSensorPredicate()
	 * @generated
	 */
	EReference getSensorPredicate_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorPredicate#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorPredicate#getOperator()
	 * @see #getSensorPredicate()
	 * @generated
	 */
	EAttribute getSensorPredicate_Operator();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorPredicate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.SensorPredicate#getValue()
	 * @see #getSensorPredicate()
	 * @generated
	 */
	EAttribute getSensorPredicate_Value();

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
	 * Returns the meta object for enum '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Precision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Precision</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Precision
	 * @generated
	 */
	EEnum getPrecision();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity</em>'.
	 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity
	 * @generated
	 */
	EEnum getActivity();

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
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__PERSONS = eINSTANCE.getHome_Persons();

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
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.RuleImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__DURATION = eINSTANCE.getRule_Duration();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PREDICATE = eINSTANCE.getRule_Predicate();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PatternImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__PREDICATES = eINSTANCE.getPattern_Predicates();

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

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorCSVImpl <em>Sensor CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorCSVImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getSensorCSV()
		 * @generated
		 */
		EClass SENSOR_CSV = eINSTANCE.getSensorCSV();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_CSV__FILE = eINSTANCE.getSensorCSV_File();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Belt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__BELT = eINSTANCE.getPerson_Belt();

		/**
		 * The meta object literal for the '<em><b>Left Ankle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LEFT_ANKLE = eINSTANCE.getPerson_LeftAnkle();

		/**
		 * The meta object literal for the '<em><b>Right Ankle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__RIGHT_ANKLE = eINSTANCE.getPerson_RightAnkle();

		/**
		 * The meta object literal for the '<em><b>Chest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CHEST = eINSTANCE.getPerson_Chest();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.TagImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__X = eINSTANCE.getTag_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__Y = eINSTANCE.getTag_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__Z = eINSTANCE.getTag_Z();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.OperandImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.DurationImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__DURATION = eINSTANCE.getDuration_Duration();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__PRECISION = eINSTANCE.getDuration_Precision();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.StaticSensorImpl <em>Static Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.StaticSensorImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getStaticSensor()
		 * @generated
		 */
		EClass STATIC_SENSOR = eINSTANCE.getStaticSensor();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_SENSOR__LOCATION = eINSTANCE.getStaticSensor_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_SENSOR__TYPE = eINSTANCE.getStaticSensor_Type();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonPredicateImpl <em>Person Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonPredicateImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPersonPredicate()
		 * @generated
		 */
		EClass PERSON_PREDICATE = eINSTANCE.getPersonPredicate();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_PREDICATE__PERSON = eINSTANCE.getPersonPredicate_Person();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_PREDICATE__ACTIVITY = eINSTANCE.getPersonPredicate_Activity();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorPredicateImpl <em>Sensor Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.SensorPredicateImpl
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getSensorPredicate()
		 * @generated
		 */
		EClass SENSOR_PREDICATE = eINSTANCE.getSensorPredicate();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_PREDICATE__SENSOR = eINSTANCE.getSensorPredicate_Sensor();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_PREDICATE__OPERATOR = eINSTANCE.getSensorPredicate_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_PREDICATE__VALUE = eINSTANCE.getSensorPredicate_Value();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Precision <em>Precision</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Precision
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getPrecision()
		 * @generated
		 */
		EEnum PRECISION = eINSTANCE.getPrecision();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Operator
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity <em>Activity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity
		 * @see fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.ModelPackageImpl#getActivity()
		 * @generated
		 */
		EEnum ACTIVITY = eINSTANCE.getActivity();

	}

} //ModelPackage
