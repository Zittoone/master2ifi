/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model.tests;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelFactory;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.PersonPredicate;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Person Predicate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonPredicateTest extends TestCase {

	/**
	 * The fixture for this Person Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonPredicate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersonPredicateTest.class);
	}

	/**
	 * Constructs a new Person Predicate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonPredicateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Person Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PersonPredicate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Person Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonPredicate getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createPersonPredicate());
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

} //PersonPredicateTest
