/**
 */
package eclipse.emf.abmodel.model.abmodel.tests;

import eclipse.emf.abmodel.model.abmodel.AbmodelFactory;
import eclipse.emf.abmodel.model.abmodel.ComplexePlan;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complexe Plan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexePlanTest extends PlanTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComplexePlanTest.class);
	}

	/**
	 * Constructs a new Complexe Plan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexePlanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Complexe Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComplexePlan getFixture() {
		return (ComplexePlan)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbmodelFactory.eINSTANCE.createComplexePlan());
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

} //ComplexePlanTest
