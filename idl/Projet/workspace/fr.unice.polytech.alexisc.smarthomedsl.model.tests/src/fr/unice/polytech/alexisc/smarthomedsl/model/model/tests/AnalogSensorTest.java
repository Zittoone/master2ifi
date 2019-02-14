/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model.tests;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.AnalogSensor;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analog Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogSensorTest extends StaticSensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalogSensorTest.class);
	}

	/**
	 * Constructs a new Analog Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analog Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalogSensor getFixture() {
		return (AnalogSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createAnalogSensor());
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

} //AnalogSensorTest
