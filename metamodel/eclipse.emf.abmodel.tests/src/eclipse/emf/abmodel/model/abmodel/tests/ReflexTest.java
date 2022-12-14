/**
 */
package eclipse.emf.abmodel.model.abmodel.tests;

import eclipse.emf.abmodel.model.abmodel.AbmodelFactory;
import eclipse.emf.abmodel.model.abmodel.Reflex;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reflex</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReflexTest extends PlanTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReflexTest.class);
	}

	/**
	 * Constructs a new Reflex test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reflex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Reflex getFixture() {
		return (Reflex)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbmodelFactory.eINSTANCE.createReflex());
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

} //ReflexTest
