/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model.tests;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.Home;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HomeTest extends TestCase {

	/**
	 * The fixture for this Home test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Home fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HomeTest.class);
	}

	/**
	 * Constructs a new Home test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Home test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Home fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Home test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Home getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createHome());
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

} //HomeTest
