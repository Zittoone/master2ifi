/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model.tests;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelFactory;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorTest extends NamedEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensorTest.class);
	}

	/**
	 * Constructs a new Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sensor getFixture() {
		return (Sensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createSensor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SensorTest
