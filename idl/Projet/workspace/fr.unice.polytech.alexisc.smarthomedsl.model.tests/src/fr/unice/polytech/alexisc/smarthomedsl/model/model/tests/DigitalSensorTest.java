/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model.tests;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.DigitalSensor;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Digital Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DigitalSensorTest extends StaticSensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DigitalSensorTest.class);
	}

	/**
	 * Constructs a new Digital Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Digital Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DigitalSensor getFixture() {
		return (DigitalSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createDigitalSensor());
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

} //DigitalSensorTest
